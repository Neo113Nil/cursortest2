package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.material.MenuKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.g7;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.internal.caching.ExpirationReason;
import com.chartboost.sdk.view.FullscreenAdActivity;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class o implements z8 {
    public static final a w = new a(null);
    public static final Map x = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.chartboost.sdk.impl.j f4901a;
    public final Mediation b;
    public final com.chartboost.sdk.impl.l c;
    public final rk d;
    public final wh e;
    public final kh f;
    public final sf g;
    public final wg h;
    public final f2 i;
    public final CoroutineDispatcher j;
    public final CoroutineScope k;
    public final Mutex l;
    public volatile Job m;
    public volatile c n;
    public volatile e o;
    public volatile com.chartboost.sdk.impl.m p;
    public volatile boolean q;
    public final AtomicBoolean r;
    public Job s;
    public volatile Job t;
    public volatile ac u;
    public final f v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(f2 base64Wrapper, String bidResponse) {
            Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
            Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
            try {
                JSONArray optJSONArray = new JSONObject(base64Wrapper.b(bidResponse)).optJSONArray("seatbid");
                return (optJSONArray != null ? optJSONArray.length() : 0) == 0;
            } catch (JSONException e) {
                mb.e("Failed to parse bid response, routing to legacy pipeline", e);
                return false;
            }
        }

        public a() {
        }

        public final Map a() {
            return o.x;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4902a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1722768625;
            }

            public String toString() {
                return "AdClosed";
            }
        }

        /* renamed from: com.chartboost.sdk.impl.o$b$b, reason: collision with other inner class name */
        public static final class C0215b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final ExpirationReason f4903a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215b(ExpirationReason reason) {
                super(null);
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.f4903a = reason;
            }

            public final ExpirationReason a() {
                return this.f4903a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0215b) && this.f4903a == ((C0215b) obj).f4903a;
            }

            public int hashCode() {
                return this.f4903a.hashCode();
            }

            public String toString() {
                return "AdExpired(reason=" + this.f4903a + ")";
            }
        }

        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public final String f4904a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String callerStackTrace) {
                super(null);
                Intrinsics.checkNotNullParameter(callerStackTrace, "callerStackTrace");
                this.f4904a = callerStackTrace;
            }

            public final String a() {
                return this.f4904a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f4904a, ((c) obj).f4904a);
            }

            public int hashCode() {
                return this.f4904a.hashCode();
            }

            public String toString() {
                return "ClearRequested(callerStackTrace=" + this.f4904a + ")";
            }
        }

        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f4905a = new d();

            public d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -812566506;
            }

            public String toString() {
                return "DestroyRequested";
            }
        }

        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f4906a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f4906a = exception;
            }

            public final Throwable a() {
                return this.f4906a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.areEqual(this.f4906a, ((e) obj).f4906a);
            }

            public int hashCode() {
                return this.f4906a.hashCode();
            }

            public String toString() {
                return "LoadFailed(exception=" + this.f4906a + ")";
            }
        }

        public static final class f extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Context f4907a;
            public final String b;
            public final CompletableDeferred c;
            public final v d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Context context, String str, CompletableDeferred completion, v adLoadConfig) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                Intrinsics.checkNotNullParameter(adLoadConfig, "adLoadConfig");
                this.f4907a = context;
                this.b = str;
                this.c = completion;
                this.d = adLoadConfig;
            }

            public final v a() {
                return this.d;
            }

            public final String b() {
                return this.b;
            }

            public final CompletableDeferred c() {
                return this.c;
            }

            public final Context d() {
                return this.f4907a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f4907a, fVar.f4907a) && Intrinsics.areEqual(this.b, fVar.b) && Intrinsics.areEqual(this.c, fVar.c) && Intrinsics.areEqual(this.d, fVar.d);
            }

            public int hashCode() {
                int hashCode = this.f4907a.hashCode() * 31;
                String str = this.b;
                return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "LoadRequested(context=" + this.f4907a + ", bidResponse=" + this.b + ", completion=" + this.c + ", adLoadConfig=" + this.d + ")";
            }
        }

        public static final class g extends b {

            /* renamed from: a, reason: collision with root package name */
            public final jb f4908a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(jb loadedAd) {
                super(null);
                Intrinsics.checkNotNullParameter(loadedAd, "loadedAd");
                this.f4908a = loadedAd;
            }

            public final jb a() {
                return this.f4908a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && Intrinsics.areEqual(this.f4908a, ((g) obj).f4908a);
            }

            public int hashCode() {
                return this.f4908a.hashCode();
            }

            public String toString() {
                return "LoadSucceeded(loadedAd=" + this.f4908a + ")";
            }
        }

        public static final class h extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f4909a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f4909a = exception;
            }

            public final Throwable a() {
                return this.f4909a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.areEqual(this.f4909a, ((h) obj).f4909a);
            }

            public int hashCode() {
                return this.f4909a.hashCode();
            }

            public String toString() {
                return "ShowFailed(exception=" + this.f4909a + ")";
            }
        }

        public static final class i extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Context f4910a;
            public final CompletableDeferred b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Context context, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f4910a = context;
                this.b = completion;
            }

            public final CompletableDeferred a() {
                return this.b;
            }

            public final Context b() {
                return this.f4910a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return Intrinsics.areEqual(this.f4910a, iVar.f4910a) && Intrinsics.areEqual(this.b, iVar.b);
            }

            public int hashCode() {
                return (this.f4910a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "ShowRequested(context=" + this.f4910a + ", completion=" + this.b + ")";
            }
        }

        public static final class j extends b {

            /* renamed from: a, reason: collision with root package name */
            public final View f4911a;

            public j(View view) {
                super(null);
                this.f4911a = view;
            }

            public final View a() {
                return this.f4911a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && Intrinsics.areEqual(this.f4911a, ((j) obj).f4911a);
            }

            public int hashCode() {
                View view = this.f4911a;
                if (view == null) {
                    return 0;
                }
                return view.hashCode();
            }

            public String toString() {
                return "ShowSucceeded(view=" + this.f4911a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f4912a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable exception) {
                super(null);
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f4912a = exception;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f4912a, ((a) obj).f4912a);
            }

            public int hashCode() {
                return this.f4912a.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.f4912a + ")";
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final jb f4913a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jb ad) {
                super(null);
                Intrinsics.checkNotNullParameter(ad, "ad");
                this.f4913a = ad;
            }

            public final jb a() {
                return this.f4913a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f4913a, ((b) obj).f4913a);
            }

            public int hashCode() {
                return this.f4913a.hashCode();
            }

            public String toString() {
                return "Loaded(ad=" + this.f4913a + ")";
            }
        }

        /* renamed from: com.chartboost.sdk.impl.o$c$c, reason: collision with other inner class name */
        public static final class C0216c extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f4914a;
            public final CompletableDeferred b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216c(String bidResponse, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f4914a = bidResponse;
                this.b = completion;
            }

            public final String a() {
                return this.f4914a;
            }

            public final CompletableDeferred b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0216c)) {
                    return false;
                }
                C0216c c0216c = (C0216c) obj;
                return Intrinsics.areEqual(this.f4914a, c0216c.f4914a) && Intrinsics.areEqual(this.b, c0216c.b);
            }

            public int hashCode() {
                return (this.f4914a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Loading(bidResponse=" + this.f4914a + ", completion=" + this.b + ")";
            }
        }

        public static final class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f4915a = new d();

            public d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -2063249945;
            }

            public String toString() {
                return "NotLoaded";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final com.chartboost.sdk.impl.m f4916a;
        public final CompletableDeferred b;

        public d(com.chartboost.sdk.impl.m view, CompletableDeferred ack) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(ack, "ack");
            this.f4916a = view;
            this.b = ack;
        }

        public final CompletableDeferred a() {
            return this.b;
        }

        public final com.chartboost.sdk.impl.m b() {
            return this.f4916a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f4916a, dVar.f4916a) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.f4916a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PendingFullscreenShow(view=" + this.f4916a + ", ack=" + this.b + ")";
        }
    }

    public static abstract class e {

        public static final class a extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4917a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -182049222;
            }

            public String toString() {
                return "NotShowing";
            }
        }

        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            public final jb f4918a;
            public final CompletableDeferred b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(jb ad, CompletableDeferred completion) {
                super(null);
                Intrinsics.checkNotNullParameter(ad, "ad");
                Intrinsics.checkNotNullParameter(completion, "completion");
                this.f4918a = ad;
                this.b = completion;
            }

            public final jb a() {
                return this.f4918a;
            }

            public final CompletableDeferred b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f4918a, bVar.f4918a) && Intrinsics.areEqual(this.b, bVar.b);
            }

            public int hashCode() {
                return (this.f4918a.hashCode() * 31) + this.b.hashCode();
            }

            public String toString() {
                return "Showing(ad=" + this.f4918a + ", completion=" + this.b + ")";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public e() {
        }
    }

    public static final class f implements com.chartboost.sdk.impl.l {

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ o c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, Continuation continuation) {
                super(2, continuation);
                this.c = oVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o oVar = this.c;
                    b.a aVar = b.a.f4902a;
                    this.b = 1;
                    if (oVar.a(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ o c;
            public final /* synthetic */ ExpirationReason d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o oVar, ExpirationReason expirationReason, Continuation continuation) {
                super(2, continuation);
                this.c = oVar;
                this.d = expirationReason;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.c, this.d, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o oVar = this.c;
                    b.C0215b c0215b = new b.C0215b(this.d);
                    this.b = 1;
                    if (oVar.a(c0215b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public f() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            l.a.b(this);
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            jb a2;
            if (o.this.r.compareAndSet(false, true)) {
                e g = o.this.g();
                e.b bVar = g instanceof e.b ? (e.b) g : null;
                if (bVar != null && (a2 = bVar.a()) != null) {
                    o.this.a(a2, false);
                }
                o.this.c.b();
            }
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            o.this.c.c();
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            o.this.c.d();
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            o.this.c.e();
            BuildersKt__Builders_commonKt.launch$default(o.this.k, null, null, new a(o.this, null), 3, null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void f() {
            l.a.a(this);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(ke request) {
            Intrinsics.checkNotNullParameter(request, "request");
            o.this.c.a(request);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            o.this.c.a(url);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(ExpirationReason expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            BuildersKt__Builders_commonKt.launch$default(o.this.k, null, null, new b(o.this, expirationReason, null), 3, null);
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ b.f d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b.f fVar, Continuation continuation) {
            super(2, continuation);
            this.d = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new g(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                Context d = this.d.d();
                String b = this.d.b();
                v a2 = this.d.a();
                this.b = 1;
                if (oVar.b(d, b, a2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new h(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                b.c cVar = new b.c(this.d);
                this.b = 1;
                if (oVar.a(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int b;

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                b.d dVar = b.d.f4905a;
                this.b = 1;
                if (oVar.a(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ExpirationReason d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ExpirationReason expirationReason, Continuation continuation) {
            super(2, continuation);
            this.d = expirationReason;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new j(this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                b.C0215b c0215b = new b.C0215b(this.d);
                this.b = 1;
                if (oVar.a(c0215b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return o.this.a((b) null, this);
        }
    }

    public static final class l extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ b.i d;
        public final /* synthetic */ c.b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(b.i iVar, c.b bVar, Continuation continuation) {
            super(2, continuation);
            this.d = iVar;
            this.e = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return o.this.new l(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = o.this;
                Context b = this.d.b();
                jb a2 = this.e.a();
                this.b = 1;
                if (oVar.a(b, a2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public long f;
        public /* synthetic */ Object g;
        public int i;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            Object a2 = o.this.a((Context) null, (String) null, (v) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class n extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return o.this.a((Context) null, (jb) null, (com.chartboost.sdk.impl.m) null, this);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.o$o, reason: collision with other inner class name */
    public static final class C0217o extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ CompletableDeferred c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0217o(CompletableDeferred completableDeferred, Continuation continuation) {
            super(2, continuation);
            this.c = completableDeferred;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0217o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0217o(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.c.complete(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    public static final class p extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public p(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return o.this.b(null, null, null, this);
        }
    }

    public static final class q extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public q(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return o.this.a((Context) null, (jb) null, this);
        }
    }

    public static final class r extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ o d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long j, o oVar, Continuation continuation) {
            super(2, continuation);
            this.c = j;
            this.d = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new r(this.c, this.d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        
            if (r7.a(r1, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r4, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.c;
                this.b = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            mb.a("Auto-dismiss test hook: firing programmatic dismissal after " + this.c + "ms", (Throwable) null, 2, (Object) null);
            o oVar = this.d;
            b.d dVar = b.d.f4905a;
            this.b = 2;
        }
    }

    public static final class s extends ContinuationImpl {
        public Object b;
        public Object c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        public s(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object a2 = o.this.a((Context) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class t extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;
        public final /* synthetic */ o e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i, String str, o oVar, Continuation continuation) {
            super(2, continuation);
            this.c = i;
            this.d = str;
            this.e = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new t(this.c, this.d, this.e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (r9.a(r1, r8) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r4, r8) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.c * 1000;
                this.b = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            mb.a("Expiration timer fired: auctionId=" + this.d, (Throwable) null, 2, (Object) null);
            o oVar = this.e;
            b.C0215b c0215b = new b.C0215b(ExpirationReason.TTL_EXPIRED);
            this.b = 2;
        }
    }

    public o(com.chartboost.sdk.impl.j adConfig, Mediation mediation, com.chartboost.sdk.impl.l externalAdContainerListener, rk viewabilityComponent, wh trackerComponent, kh telemetryManager, sf renderableFactory, wg sharedPrefsHelper, f2 base64Wrapper, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(externalAdContainerListener, "externalAdContainerListener");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(renderableFactory, "renderableFactory");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f4901a = adConfig;
        this.b = mediation;
        this.c = externalAdContainerListener;
        this.d = viewabilityComponent;
        this.e = trackerComponent;
        this.f = telemetryManager;
        this.g = renderableFactory;
        this.h = sharedPrefsHelper;
        this.i = base64Wrapper;
        this.j = ioDispatcher;
        this.k = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.l = MutexKt.Mutex$default(false, 1, null);
        this.n = c.d.f4915a;
        this.o = e.a.f4917a;
        this.r = new AtomicBoolean(false);
        this.v = new f();
    }

    public final void d() {
        Job job = this.s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.s = null;
    }

    @Override // com.chartboost.sdk.impl.z8
    public void destroy() {
        String str;
        jb e2 = e();
        if (e2 == null || (str = e2.b()) == null) {
            str = "<no_current_ad>";
        }
        mb.a("Destroy requested: auctionId=" + str + ", adFormat=" + this.f4901a.a() + ", loadState=" + Reflection.getOrCreateKotlinClass(this.n.getClass()).getSimpleName() + ", showState=" + Reflection.getOrCreateKotlinClass(this.o.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new i(null), 3, null);
    }

    public final jb e() {
        jb a2;
        e eVar = this.o;
        e.b bVar = eVar instanceof e.b ? (e.b) eVar : null;
        if (bVar != null && (a2 = bVar.a()) != null) {
            return a2;
        }
        c cVar = this.n;
        c.b bVar2 = cVar instanceof c.b ? (c.b) cVar : null;
        if (bVar2 != null) {
            return bVar2.a();
        }
        return null;
    }

    public final c f() {
        return this.n;
    }

    public final e g() {
        return this.o;
    }

    public final void h() {
        e eVar = this.o;
        e.b bVar = eVar instanceof e.b ? (e.b) eVar : null;
        if (bVar == null) {
            return;
        }
        Job job = this.m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.m = null;
        this.p = null;
        a(bVar.a());
        if (this.f4901a.a() == u.d && !this.r.get()) {
            a(bVar.a(), true);
        }
        this.r.set(false);
        bVar.a().c().a(gh.c);
        this.o = e.a.f4917a;
    }

    public final void i() {
        e eVar = this.o;
        e.b bVar = eVar instanceof e.b ? (e.b) eVar : null;
        if (bVar == null) {
            a(gh.h);
            return;
        }
        if (this.f4901a.a().b()) {
            a(gh.e);
            return;
        }
        a(bVar.a());
        j2 x2 = bVar.a().c().x();
        if (x2 != null) {
            x2.a(ChartboostError.Render.UnexpectedDismiss.INSTANCE);
        }
        com.chartboost.sdk.impl.m mVar = this.p;
        if (mVar != null) {
            mVar.m();
        }
        this.c.e();
        a(gh.d);
    }

    public final void j() {
        Long a2;
        Job launch$default;
        if (this.f4901a.a().b() || (a2 = kc.f4842a.a()) == null) {
            return;
        }
        long longValue = a2.longValue();
        Job job = this.m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new r(longValue, this, null), 3, null);
        this.m = launch$default;
    }

    @Override // com.chartboost.sdk.impl.z8
    public boolean b() {
        return this.n instanceof c.b;
    }

    public final void b(b.f fVar) {
        c cVar = this.n;
        if (!(cVar instanceof c.d) && !(cVar instanceof c.a)) {
            if (cVar instanceof c.C0216c) {
                ChartboostError.Load.Internal internal = new ChartboostError.Load.Internal("Already loading", null);
                CompletableDeferred c2 = fVar.c();
                Result.Companion companion = Result.INSTANCE;
                c2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(internal))));
                return;
            }
            if (cVar instanceof c.b) {
                ChartboostError.Load.AlreadyLoaded alreadyLoaded = ChartboostError.Load.AlreadyLoaded.INSTANCE;
                CompletableDeferred c3 = fVar.c();
                Result.Companion companion2 = Result.INSTANCE;
                c3.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(alreadyLoaded))));
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        a(fVar);
    }

    public final void c(jb ad) {
        int i2;
        Intrinsics.checkNotNullParameter(ad, "ad");
        List e2 = ad.a().e();
        int i3 = 0;
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.l.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i2 == 0) {
            mb.e("No explicit impression trackers for auctionId=" + ad.b() + ", adFormat=" + this.f4901a.a() + " — will fall back to repository trackers", null, 2, null);
        } else {
            mb.a("Tracking impression: auctionId=" + ad.b() + ", adFormat=" + this.f4901a.a() + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        }
        kh khVar = this.f;
        ba baVar = new ba(ad.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, 60, null);
        List e3 = ad.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.l.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        khVar.a(baVar, arrayList2, g7.b.l, lh.a(ad.a().e(), g7.b.f));
        ad.c().s();
    }

    public final void d(jb jbVar) {
        int i2;
        List e2 = jbVar.a().e();
        int i3 = 0;
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.o.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        mb.a("Tracking show: auctionId=" + jbVar.b() + ", adFormat=" + this.f4901a.a() + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        kh khVar = this.f;
        xg xgVar = new xg(jbVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, null, 184, null);
        List e3 = jbVar.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.o.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, xgVar, arrayList2, (g7.b) null, lh.a(jbVar.a().e(), g7.b.f), 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8 A[Catch: all -> 0x02da, TryCatch #0 {all -> 0x02da, blocks: (B:11:0x005f, B:13:0x00b8, B:15:0x00de, B:16:0x02ce, B:20:0x00fd, B:22:0x0101, B:23:0x0125, B:25:0x0129, B:26:0x013a, B:28:0x013e, B:29:0x027a, B:30:0x0146, B:32:0x014a, B:34:0x0150, B:36:0x0156, B:37:0x0167, B:39:0x01a0, B:41:0x01a4, B:43:0x01aa, B:46:0x01b2, B:48:0x01e2, B:50:0x01e6, B:51:0x01ee, B:53:0x01f2, B:54:0x01fa, B:56:0x01fe, B:57:0x0206, B:59:0x020a, B:61:0x0210, B:63:0x0216, B:65:0x0232, B:67:0x0236, B:69:0x023c, B:72:0x0244, B:74:0x026b, B:76:0x026f, B:77:0x0273, B:79:0x0277, B:80:0x02d4, B:81:0x02d9), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a A[Catch: all -> 0x02da, TryCatch #0 {all -> 0x02da, blocks: (B:11:0x005f, B:13:0x00b8, B:15:0x00de, B:16:0x02ce, B:20:0x00fd, B:22:0x0101, B:23:0x0125, B:25:0x0129, B:26:0x013a, B:28:0x013e, B:29:0x027a, B:30:0x0146, B:32:0x014a, B:34:0x0150, B:36:0x0156, B:37:0x0167, B:39:0x01a0, B:41:0x01a4, B:43:0x01aa, B:46:0x01b2, B:48:0x01e2, B:50:0x01e6, B:51:0x01ee, B:53:0x01f2, B:54:0x01fa, B:56:0x01fe, B:57:0x0206, B:59:0x020a, B:61:0x0210, B:63:0x0216, B:65:0x0232, B:67:0x0236, B:69:0x023c, B:72:0x0244, B:74:0x026b, B:76:0x026f, B:77:0x0273, B:79:0x0277, B:80:0x02d4, B:81:0x02d9), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, Continuation continuation) {
        k kVar;
        int i2;
        Mutex mutex;
        o oVar;
        try {
            if (continuation instanceof k) {
                kVar = (k) continuation;
                int i3 = kVar.g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.g = i3 - Integer.MIN_VALUE;
                    Object obj = kVar.e;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = kVar.g;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.l;
                        kVar.b = this;
                        kVar.c = bVar;
                        kVar.d = mutex;
                        kVar.g = 1;
                        if (mutex.lock(null, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        oVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) kVar.d;
                        b bVar2 = (b) kVar.c;
                        oVar = (o) kVar.b;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        bVar = bVar2;
                    }
                    mb.a("handleEvent: " + Reflection.getOrCreateKotlinClass(bVar.getClass()).getSimpleName() + " | load=" + Reflection.getOrCreateKotlinClass(oVar.n.getClass()).getSimpleName() + " | show=" + Reflection.getOrCreateKotlinClass(oVar.o.getClass()).getSimpleName() + " | destroyed=" + oVar.q, (Throwable) null, 2, (Object) null);
                    if (!oVar.q) {
                        mb.a("AdController is already destroyed. Ignoring event " + Reflection.getOrCreateKotlinClass(bVar.getClass()).getSimpleName() + ".", (Throwable) null, 2, (Object) null);
                        if (bVar instanceof b.i) {
                            CompletableDeferred a2 = ((b.i) bVar).a();
                            Result.Companion companion = Result.INSTANCE;
                            Boxing.boxBoolean(a2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoAd.INSTANCE)))));
                        } else if (bVar instanceof b.f) {
                            CompletableDeferred c2 = ((b.f) bVar).c();
                            Result.Companion companion2 = Result.INSTANCE;
                            Boxing.boxBoolean(c2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Internal("AdController is destroyed", null))))));
                        } else if (bVar instanceof b.g) {
                            ((b.g) bVar).a().c().a(gh.h);
                        }
                    } else {
                        if (bVar instanceof b.f) {
                            oVar.b((b.f) bVar);
                        } else if (bVar instanceof b.g) {
                            c cVar = oVar.n;
                            c.C0216c c0216c = cVar instanceof c.C0216c ? (c.C0216c) cVar : null;
                            if (c0216c == null) {
                                ((b.g) bVar).a().c().a(gh.h);
                            } else {
                                oVar.n = new c.b(((b.g) bVar).a());
                                oVar.a(((b.g) bVar).a().a().f());
                                CompletableDeferred b2 = c0216c.b();
                                Result.Companion companion3 = Result.INSTANCE;
                                Boxing.boxBoolean(b2.complete(Result.m8078boximpl(Result.m8079constructorimpl(Unit.INSTANCE))));
                            }
                        } else if (bVar instanceof b.e) {
                            c cVar2 = oVar.n;
                            c.C0216c c0216c2 = cVar2 instanceof c.C0216c ? (c.C0216c) cVar2 : null;
                            if (c0216c2 != null) {
                                oVar.n = new c.a(((b.e) bVar).a());
                                CompletableDeferred b3 = c0216c2.b();
                                Result.Companion companion4 = Result.INSTANCE;
                                Boxing.boxBoolean(b3.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(((b.e) bVar).a())))));
                            }
                        } else if (bVar instanceof b.c) {
                            oVar.a((b.c) bVar);
                        } else if (bVar instanceof b.C0215b) {
                            oVar.a((b.C0215b) bVar);
                        } else if (bVar instanceof b.i) {
                            oVar.a((b.i) bVar);
                        } else if (bVar instanceof b.j) {
                            e eVar = oVar.o;
                            e.b bVar3 = eVar instanceof e.b ? (e.b) eVar : null;
                            if (bVar3 != null) {
                                CompletableDeferred b4 = bVar3.b();
                                Result.Companion companion5 = Result.INSTANCE;
                                b4.complete(Result.m8078boximpl(Result.m8079constructorimpl(((b.j) bVar).a())));
                                oVar.j();
                            }
                        } else if (bVar instanceof b.h) {
                            e eVar2 = oVar.o;
                            e.b bVar4 = eVar2 instanceof e.b ? (e.b) eVar2 : null;
                            if (bVar4 != null) {
                                oVar.o = e.a.f4917a;
                                oVar.p = null;
                                CompletableDeferred b5 = bVar4.b();
                                Result.Companion companion6 = Result.INSTANCE;
                                Boxing.boxBoolean(b5.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(((b.h) bVar).a())))));
                            }
                        } else if (bVar instanceof b.a) {
                            oVar.h();
                        } else {
                            if (!(bVar instanceof b.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oVar.i();
                        }
                        mb.a("after " + Reflection.getOrCreateKotlinClass(bVar.getClass()).getSimpleName() + ": load=" + Reflection.getOrCreateKotlinClass(oVar.n.getClass()).getSimpleName() + " | show=" + Reflection.getOrCreateKotlinClass(oVar.o.getClass()).getSimpleName() + " | destroyed=" + oVar.q, (Throwable) null, 2, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            }
            mb.a("handleEvent: " + Reflection.getOrCreateKotlinClass(bVar.getClass()).getSimpleName() + " | load=" + Reflection.getOrCreateKotlinClass(oVar.n.getClass()).getSimpleName() + " | show=" + Reflection.getOrCreateKotlinClass(oVar.o.getClass()).getSimpleName() + " | destroyed=" + oVar.q, (Throwable) null, 2, (Object) null);
            if (!oVar.q) {
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        kVar = new k(continuation);
        Object obj2 = kVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = kVar.g;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|(1:(3:(1:(1:15)(2:12|13))(3:18|19|20)|16|17)(4:62|63|64|65))(12:95|96|97|99|100|(7:103|104|105|106|(2:108|109)(1:111)|110|101)|117|118|119|120|(1:122)|26)|66|67|(4:70|(3:72|73|74)(1:76)|75|68)|77|78|(1:80)(1:84)|81))|133|6|(0)(0)|66|67|(1:68)|77|78|(0)(0)|81|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0350, code lost:
    
        if (r4.a(r0, r13) != r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02f1, code lost:
    
        if (r4.a(r2, r13) == r14) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fd, code lost:
    
        if (r6.a(r0, r13) != r14) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0204, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0205, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0201, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0202, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6 A[Catch: all -> 0x0201, JSONException -> 0x0204, TryCatch #12 {JSONException -> 0x0204, all -> 0x0201, blocks: (B:67:0x01a4, B:68:0x01b0, B:70:0x01b6, B:73:0x01be, B:78:0x01c2, B:80:0x01ca, B:81:0x01d0), top: B:66:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ca A[Catch: all -> 0x0201, JSONException -> 0x0204, TryCatch #12 {JSONException -> 0x0204, all -> 0x0201, blocks: (B:67:0x01a4, B:68:0x01b0, B:70:0x01b6, B:73:0x01be, B:78:0x01c2, B:80:0x01ca, B:81:0x01d0), top: B:66:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, String str, v vVar, Continuation continuation) {
        p pVar;
        int i2;
        String str2;
        String str3;
        ac acVar;
        String str4;
        String str5;
        o oVar;
        List list;
        hd hdVar;
        z zVar;
        Object a2;
        o oVar2;
        ac acVar2;
        ChartboostError internal;
        ChartboostError chartboostError;
        Context context2 = context;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i3 = pVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.i = i3 - Integer.MIN_VALUE;
                p pVar2 = pVar;
                Object obj = pVar2.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pVar2.i;
                String str6 = "] ";
                String str7 = U3.j.d;
                char c2 = 2;
                Object obj2 = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        try {
                            try {
                                z a3 = z.c.a(new JSONObject(this.i.b(str)));
                                mb.a("Parsed adMarkup in " + (System.currentTimeMillis() - currentTimeMillis) + "ms: auctionId=" + a3.a().c() + ", renderableCount=" + a3.b().size() + ", expiration=" + a3.a().f() + CmcdData.Factory.STREAMING_FORMAT_SS, (Throwable) null, 2, (Object) null);
                                boolean a4 = this.h.a("cb_video_mute_state", a3.a().d());
                                List b2 = a3.b();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = b2.iterator();
                                while (it.hasNext()) {
                                    z zVar2 = a3;
                                    ArrayList arrayList2 = arrayList;
                                    str3 = str6;
                                    str2 = str7;
                                    try {
                                        try {
                                            j2 a5 = this.g.a(context, (qf) it.next(), a3.a(), this.f4901a.a(), this.e, this.f, this.d, this.b, vVar, a4);
                                            if (a5 != null) {
                                                arrayList2.add(a5);
                                            }
                                            a3 = zVar2;
                                            arrayList = arrayList2;
                                            str6 = str3;
                                            str7 = str2;
                                            obj2 = null;
                                            c2 = 2;
                                        } catch (JSONException e2) {
                                            e = e2;
                                            oVar = this;
                                            str5 = str3;
                                            str4 = str2;
                                            acVar = null;
                                            oVar.u = acVar;
                                            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                                            mb.b(str4 + invalidAdm.getCode() + str5 + invalidAdm.getConstant() + " - Invalid bid response", invalidAdm);
                                            b.e eVar = new b.e(invalidAdm);
                                            pVar2.b = null;
                                            pVar2.c = null;
                                            pVar2.d = null;
                                            pVar2.e = null;
                                            pVar2.f = null;
                                            pVar2.i = 3;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        oVar = this;
                                        list = null;
                                        if (list != null) {
                                        }
                                        acVar2 = null;
                                        oVar.u = acVar2;
                                        if (!(th instanceof ChartboostError.Load)) {
                                        }
                                        mb.b(str2 + chartboostError.getCode() + str3 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                                        b.e eVar2 = new b.e(chartboostError);
                                        pVar2.b = null;
                                        pVar2.c = null;
                                        pVar2.d = null;
                                        pVar2.e = null;
                                        pVar2.f = null;
                                        pVar2.i = 4;
                                    }
                                }
                                z zVar3 = a3;
                                str2 = str7;
                                str3 = str6;
                                ArrayList arrayList3 = arrayList;
                                try {
                                    hdVar = new hd(arrayList3, zVar3.a(), a4, null, 8, null);
                                    pVar2.b = this;
                                    pVar2.c = context2;
                                    pVar2.d = arrayList3;
                                    zVar = zVar3;
                                    pVar2.e = zVar;
                                    pVar2.f = hdVar;
                                    pVar2.i = 1;
                                    a2 = hdVar.a(context2, pVar2);
                                    if (a2 != coroutine_suspended) {
                                        oVar2 = this;
                                        list = arrayList3;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    oVar = this;
                                    list = arrayList3;
                                    if (list != null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj3 : list) {
                                            if (obj3 instanceof ej) {
                                                arrayList4.add(obj3);
                                            }
                                        }
                                        ej ejVar = (ej) CollectionsKt.firstOrNull((List) arrayList4);
                                        if (ejVar != null) {
                                            acVar2 = ejVar.E();
                                            oVar.u = acVar2;
                                            if (!(th instanceof ChartboostError.Load)) {
                                                chartboostError = (ChartboostError.Load) th;
                                            } else {
                                                if (th instanceof JSONException) {
                                                    internal = new ChartboostError.Load.InvalidResponse("Failed to parse ad markup: " + th.getMessage(), th);
                                                } else if (th instanceof IllegalArgumentException) {
                                                    internal = new ChartboostError.Load.InvalidRequest("Invalid load parameters: " + th.getMessage(), th);
                                                } else if (th instanceof OutOfMemoryError) {
                                                    chartboostError = ChartboostError.Load.NoStorage.INSTANCE;
                                                } else {
                                                    internal = new ChartboostError.Load.Internal("Load failed: " + th.getMessage(), th);
                                                }
                                                chartboostError = internal;
                                            }
                                            mb.b(str2 + chartboostError.getCode() + str3 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                                            b.e eVar22 = new b.e(chartboostError);
                                            pVar2.b = null;
                                            pVar2.c = null;
                                            pVar2.d = null;
                                            pVar2.e = null;
                                            pVar2.f = null;
                                            pVar2.i = 4;
                                        }
                                    }
                                    acVar2 = null;
                                    oVar.u = acVar2;
                                    if (!(th instanceof ChartboostError.Load)) {
                                    }
                                    mb.b(str2 + chartboostError.getCode() + str3 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                                    b.e eVar222 = new b.e(chartboostError);
                                    pVar2.b = null;
                                    pVar2.c = null;
                                    pVar2.d = null;
                                    pVar2.e = null;
                                    pVar2.f = null;
                                    pVar2.i = 4;
                                }
                            } catch (JSONException e3) {
                                e = e3;
                                str2 = str7;
                                str3 = str6;
                            }
                        } catch (JSONException e4) {
                            e = e4;
                            acVar = null;
                            str4 = U3.j.d;
                            str5 = "] ";
                            oVar = this;
                            oVar.u = acVar;
                            ChartboostError.Load.InvalidAdm invalidAdm2 = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                            mb.b(str4 + invalidAdm2.getCode() + str5 + invalidAdm2.getConstant() + " - Invalid bid response", invalidAdm2);
                            b.e eVar3 = new b.e(invalidAdm2);
                            pVar2.b = null;
                            pVar2.c = null;
                            pVar2.d = null;
                            pVar2.e = null;
                            pVar2.f = null;
                            pVar2.i = 3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = str7;
                        str3 = str6;
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    hd hdVar2 = (hd) pVar2.f;
                    zVar = (z) pVar2.e;
                    List list2 = (List) pVar2.d;
                    Context context3 = (Context) pVar2.c;
                    oVar2 = (o) pVar2.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        Object value = ((Result) obj).getValue();
                        list = list2;
                        str2 = U3.j.d;
                        str3 = "] ";
                        a2 = value;
                        hdVar = hdVar2;
                        context2 = context3;
                    } catch (JSONException e5) {
                        e = e5;
                        oVar = oVar2;
                        acVar = null;
                        str4 = U3.j.d;
                        str5 = "] ";
                        oVar.u = acVar;
                        ChartboostError.Load.InvalidAdm invalidAdm22 = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                        mb.b(str4 + invalidAdm22.getCode() + str5 + invalidAdm22.getConstant() + " - Invalid bid response", invalidAdm22);
                        b.e eVar32 = new b.e(invalidAdm22);
                        pVar2.b = null;
                        pVar2.c = null;
                        pVar2.d = null;
                        pVar2.e = null;
                        pVar2.f = null;
                        pVar2.i = 3;
                    } catch (Throwable th4) {
                        th = th4;
                        list = list2;
                        oVar = oVar2;
                        str2 = U3.j.d;
                        str3 = "] ";
                        if (list != null) {
                        }
                        acVar2 = null;
                        oVar.u = acVar2;
                        if (!(th instanceof ChartboostError.Load)) {
                        }
                        mb.b(str2 + chartboostError.getCode() + str3 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                        b.e eVar2222 = new b.e(chartboostError);
                        pVar2.b = null;
                        pVar2.c = null;
                        pVar2.d = null;
                        pVar2.e = null;
                        pVar2.f = null;
                        pVar2.i = 4;
                    }
                } else {
                    if (i2 == 2) {
                        List list3 = (List) pVar2.c;
                        oVar = (o) pVar2.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (JSONException e6) {
                            e = e6;
                            acVar = null;
                            str4 = U3.j.d;
                            str5 = "] ";
                            oVar.u = acVar;
                            ChartboostError.Load.InvalidAdm invalidAdm222 = new ChartboostError.Load.InvalidAdm("Failed to parse bid response JSON: " + e.getMessage(), e);
                            mb.b(str4 + invalidAdm222.getCode() + str5 + invalidAdm222.getConstant() + " - Invalid bid response", invalidAdm222);
                            b.e eVar322 = new b.e(invalidAdm222);
                            pVar2.b = null;
                            pVar2.c = null;
                            pVar2.d = null;
                            pVar2.e = null;
                            pVar2.f = null;
                            pVar2.i = 3;
                        } catch (Throwable th5) {
                            th = th5;
                            list = list3;
                            str2 = U3.j.d;
                            str3 = "] ";
                            if (list != null) {
                            }
                            acVar2 = null;
                            oVar.u = acVar2;
                            if (!(th instanceof ChartboostError.Load)) {
                            }
                            mb.b(str2 + chartboostError.getCode() + str3 + chartboostError.getConstant() + " - Ad load failed", chartboostError);
                            b.e eVar22222 = new b.e(chartboostError);
                            pVar2.b = null;
                            pVar2.c = null;
                            pVar2.d = null;
                            pVar2.e = null;
                            pVar2.f = null;
                            pVar2.i = 4;
                        }
                    } else {
                        if (i2 != 3 && i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(a2);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof ej) {
                        arrayList5.add(obj4);
                    }
                }
                ej ejVar2 = (ej) CollectionsKt.firstOrNull((List) arrayList5);
                oVar2.u = ejVar2 == null ? ejVar2.E() : null;
                hdVar.a(context2);
                b.g gVar = new b.g(new jb(hdVar, zVar.a().c(), zVar.a()));
                pVar2.b = oVar2;
                pVar2.c = list;
                pVar2.d = null;
                pVar2.e = null;
                pVar2.f = null;
                pVar2.i = 2;
            }
        }
        pVar = new p(continuation);
        p pVar22 = pVar;
        Object obj5 = pVar22.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pVar22.i;
        String str62 = "] ";
        String str72 = U3.j.d;
        char c22 = 2;
        Object obj22 = null;
        if (i2 != 0) {
        }
        ResultKt.throwOnFailure(a2);
        ArrayList arrayList52 = new ArrayList();
        while (r5.hasNext()) {
        }
        ej ejVar22 = (ej) CollectionsKt.firstOrNull((List) arrayList52);
        oVar2.u = ejVar22 == null ? ejVar22.E() : null;
        hdVar.a(context2);
        b.g gVar2 = new b.g(new jb(hdVar, zVar.a().c(), zVar.a()));
        pVar22.b = oVar2;
        pVar22.c = list;
        pVar22.d = null;
        pVar22.e = null;
        pVar22.f = null;
        pVar22.i = 2;
    }

    public /* synthetic */ o(com.chartboost.sdk.impl.j jVar, Mediation mediation, com.chartboost.sdk.impl.l lVar, rk rkVar, wh whVar, kh khVar, sf sfVar, wg wgVar, f2 f2Var, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, mediation, lVar, rkVar, whVar, khVar, sfVar, wgVar, (i2 & 256) != 0 ? new f2() : f2Var, (i2 & 512) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final void b(jb jbVar) {
        int i2;
        List e2 = jbVar.a().e();
        int i3 = 0;
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.k.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        String a2 = lb.a(lb.f4860a, 0, 1, null);
        mb.a("Tracking expiration: auctionId=" + jbVar.b() + ", adFormat=" + this.f4901a.a() + ", trackerCount=" + i2 + ", logContextSize=" + (a2 != null ? a2.length() : 0), (Throwable) null, 2, (Object) null);
        kh khVar = this.f;
        c8 c8Var = new c8(jbVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, a2, 60, null);
        List e3 = jbVar.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.k.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, c8Var, arrayList2, (g7.b) null, lh.a(jbVar.a().e(), g7.b.f), 4, (Object) null);
        lb.f4860a.c();
    }

    public final void a(b.i iVar) {
        if (this.o instanceof e.b) {
            CompletableDeferred a2 = iVar.a();
            Result.Companion companion = Result.INSTANCE;
            a2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Show.FullscreenAlreadyShowing.INSTANCE))));
            return;
        }
        c cVar = this.n;
        c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
        if (bVar == null) {
            CompletableDeferred a3 = iVar.a();
            Result.Companion companion2 = Result.INSTANCE;
            a3.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoAd.INSTANCE))));
        } else {
            this.n = c.d.f4915a;
            d();
            this.o = new e.b(bVar.a(), iVar.a());
            BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new l(iVar, bVar, null), 3, null);
        }
    }

    public final void a(b.c cVar) {
        c cVar2 = this.n;
        if (cVar2 instanceof c.C0216c) {
            c.C0216c c0216c = (c.C0216c) cVar2;
            ChartboostError.Load.Internal a2 = a("clear request", a(c0216c.a()), cVar.a());
            mb.b(U3.j.d + a2.getCode() + "] " + a2.getConstant() + " - Load cancelled", a2);
            CompletableDeferred b2 = c0216c.b();
            Result.Companion companion = Result.INSTANCE;
            b2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(a2))));
            a(gh.h);
            return;
        }
        if (cVar2 instanceof c.b) {
            c.b bVar = (c.b) cVar2;
            mb.a("Stopping loaded ad renderable on clear: auctionId=" + bVar.a().b(), (Throwable) null, 2, (Object) null);
            bVar.a().c().a(gh.h);
            d();
            this.n = c.d.f4915a;
        }
    }

    public final void a(b.C0215b c0215b) {
        c cVar = this.n;
        c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
        if (bVar == null) {
            return;
        }
        b(bVar.a());
        this.c.a(c0215b.a());
        mb.a("Stopping loaded ad renderable on expiration: auctionId=" + bVar.a().b(), (Throwable) null, 2, (Object) null);
        bVar.a().c().a(gh.h);
        d();
        this.n = c.d.f4915a;
    }

    public final void a(b.f fVar) {
        Job launch$default;
        String b2 = fVar.b();
        if (b2 != null && !StringsKt.isBlank(b2)) {
            this.n = new c.C0216c(fVar.b(), fVar.c());
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.k, this.j, null, new g(fVar, null), 2, null);
            this.t = launch$default;
        } else {
            ChartboostError.Load.InvalidAdm invalidAdm = new ChartboostError.Load.InvalidAdm("Bid response is null or empty", null);
            this.n = new c.a(invalidAdm);
            CompletableDeferred c2 = fVar.c();
            Result.Companion companion = Result.INSTANCE;
            c2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(invalidAdm))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0197, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.chartboost.sdk.impl.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, String str, v vVar, Continuation continuation) {
        m mVar;
        Object coroutine_suspended;
        int i2;
        String str2;
        CompletableDeferred CompletableDeferred$default;
        long currentTimeMillis;
        o oVar;
        Object await;
        long j2;
        String str3;
        String str4;
        o oVar2;
        Job job;
        Throwable m8082exceptionOrNullimpl;
        String str5;
        String str6 = str;
        try {
            if (continuation instanceof m) {
                mVar = (m) continuation;
                int i3 = mVar.i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mVar.i = i3 - Integer.MIN_VALUE;
                    Object obj = mVar.g;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = mVar.i;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (str6 == null || (str2 = a(str6)) == null) {
                            str2 = "<no_bid_response>";
                        }
                        mb.a("Load started: auctionId=" + str2 + ", adFormat=" + this.f4901a.a() + ", loadState=" + Reflection.getOrCreateKotlinClass(this.n.getClass()).getSimpleName() + ", showState=" + Reflection.getOrCreateKotlinClass(this.o.getClass()).getSimpleName() + ", bidResponseLength=" + (str6 != null ? str.length() : 0), (Throwable) null, 2, (Object) null);
                        CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        b.f fVar = new b.f(context, str6, CompletableDeferred$default, vVar);
                        currentTimeMillis = System.currentTimeMillis();
                        mVar.b = this;
                        mVar.c = str6;
                        mVar.d = str2;
                        mVar.e = CompletableDeferred$default;
                        mVar.f = currentTimeMillis;
                        mVar.i = 1;
                        if (a(fVar, mVar) != coroutine_suspended) {
                            oVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = mVar.f;
                        str4 = (String) mVar.d;
                        String str7 = (String) mVar.c;
                        oVar2 = (o) mVar.b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str3 = str7;
                            Object value = ((Result) obj).getValue();
                            long currentTimeMillis2 = System.currentTimeMillis() - j2;
                            String str8 = !Result.m8086isSuccessimpl(value) ? "SUCCESS" : "FAILURE";
                            m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
                            if (m8082exceptionOrNullimpl != null) {
                                ChartboostError chartboostError = m8082exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8082exceptionOrNullimpl : null;
                                str5 = chartboostError == null ? "exceptionType=" + m8082exceptionOrNullimpl.getClass().getSimpleName() + ", message=" + m8082exceptionOrNullimpl.getMessage() : "errorCode=" + chartboostError.getCode() + ", errorConstant=" + chartboostError.getConstant() + ", message=" + ((ChartboostError) m8082exceptionOrNullimpl).getMessage();
                            }
                            str5 = "";
                            mb.a("Load completed: auctionId=" + str4 + ", adFormat=" + oVar2.f4901a.a() + ", status=" + str8 + ", durationMs=" + currentTimeMillis2 + (str5.length() > 0 ? ", " + str5 : ""), (Throwable) null, 2, (Object) null);
                            if (str3 != null) {
                                oVar2.a(value, str3, currentTimeMillis2, oVar2.u);
                            }
                            oVar2.u = null;
                            return value;
                        } catch (CancellationException e2) {
                            e = e2;
                            oVar = oVar2;
                            job = oVar.t;
                            if (job != null) {
                            }
                            throw e;
                        }
                    }
                    long j3 = mVar.f;
                    CompletableDeferred completableDeferred = (CompletableDeferred) mVar.e;
                    String str9 = (String) mVar.d;
                    String str10 = (String) mVar.c;
                    o oVar3 = (o) mVar.b;
                    ResultKt.throwOnFailure(obj);
                    str2 = str9;
                    CompletableDeferred$default = completableDeferred;
                    str6 = str10;
                    oVar = oVar3;
                    currentTimeMillis = j3;
                    mVar.b = oVar;
                    mVar.c = str6;
                    mVar.d = str2;
                    mVar.e = null;
                    mVar.f = currentTimeMillis;
                    mVar.i = 2;
                    await = CompletableDeferred$default.await(mVar);
                    if (await != coroutine_suspended) {
                        j2 = currentTimeMillis;
                        str3 = str6;
                        str4 = str2;
                        obj = await;
                        oVar2 = oVar;
                        Object value2 = ((Result) obj).getValue();
                        long currentTimeMillis22 = System.currentTimeMillis() - j2;
                        if (!Result.m8086isSuccessimpl(value2)) {
                        }
                        m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value2);
                        if (m8082exceptionOrNullimpl != null) {
                        }
                        str5 = "";
                        mb.a("Load completed: auctionId=" + str4 + ", adFormat=" + oVar2.f4901a.a() + ", status=" + str8 + ", durationMs=" + currentTimeMillis22 + (str5.length() > 0 ? ", " + str5 : ""), (Throwable) null, 2, (Object) null);
                        if (str3 != null) {
                        }
                        oVar2.u = null;
                        return value2;
                    }
                    return coroutine_suspended;
                }
            }
            mVar.b = oVar;
            mVar.c = str6;
            mVar.d = str2;
            mVar.e = null;
            mVar.f = currentTimeMillis;
            mVar.i = 2;
            await = CompletableDeferred$default.await(mVar);
            if (await != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (CancellationException e3) {
            e = e3;
            job = oVar.t;
            if (job != null) {
                job.cancel(e);
            }
            throw e;
        }
        mVar = new m(continuation);
        Object obj2 = mVar.g;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = mVar.i;
        if (i2 != 0) {
        }
    }

    @Override // com.chartboost.sdk.impl.z8
    public void a() {
        String str;
        jb e2 = e();
        if (e2 == null || (str = e2.b()) == null) {
            str = "<no_current_ad>";
        }
        mb.a("Clear loaded ad: auctionId=" + str + ", adFormat=" + this.f4901a.a() + ", loadState=" + Reflection.getOrCreateKotlinClass(this.n.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new h(n7.a(10), null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c6, code lost:
    
        if (r4 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r4 != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.chartboost.sdk.impl.z8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        s sVar;
        Object coroutine_suspended;
        int i2;
        String str;
        String str2;
        CompletableDeferred completableDeferred;
        long j2;
        hd c2;
        List A;
        Object await;
        long j3;
        String str3;
        Throwable m8082exceptionOrNullimpl;
        String str4;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i3 = sVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sVar.g = i3 - Integer.MIN_VALUE;
                Object obj = sVar.e;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sVar.g;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    jb e2 = e();
                    if (e2 == null || (str = e2.b()) == null) {
                        str = "<no_current_ad>";
                    }
                    jb e3 = e();
                    if (e3 != null && (c2 = e3.c()) != null && (A = c2.A()) != null) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(A, 10));
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((j2) it.next()).getClass().getSimpleName());
                        }
                        str2 = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
                    }
                    str2 = "none";
                    mb.a("Show started: auctionId=" + str + ", adFormat=" + this.f4901a.a() + ", loadState=" + Reflection.getOrCreateKotlinClass(this.n.getClass()).getSimpleName() + ", showState=" + Reflection.getOrCreateKotlinClass(this.o.getClass()).getSimpleName() + ", renderableTypes=[" + str2 + U3.j.e, (Throwable) null, 2, (Object) null);
                    long currentTimeMillis = System.currentTimeMillis();
                    CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    b iVar = new b.i(context, CompletableDeferred$default);
                    sVar.b = str;
                    sVar.c = CompletableDeferred$default;
                    sVar.d = currentTimeMillis;
                    sVar.g = 1;
                    if (a(iVar, sVar) != coroutine_suspended) {
                        completableDeferred = CompletableDeferred$default;
                        j2 = currentTimeMillis;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = sVar.d;
                    str3 = (String) sVar.b;
                    ResultKt.throwOnFailure(obj);
                    Object value = ((Result) obj).getValue();
                    long currentTimeMillis2 = System.currentTimeMillis() - j3;
                    String str5 = !Result.m8086isSuccessimpl(value) ? "SUCCESS" : "FAILURE";
                    m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
                    if (m8082exceptionOrNullimpl != null) {
                        ChartboostError chartboostError = m8082exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8082exceptionOrNullimpl : null;
                        if (chartboostError == null) {
                            str4 = "exceptionType=" + m8082exceptionOrNullimpl.getClass().getSimpleName() + ", message=" + m8082exceptionOrNullimpl.getMessage();
                        } else {
                            str4 = "errorCode=" + chartboostError.getCode() + ", errorConstant=" + chartboostError.getConstant() + ", message=" + ((ChartboostError) m8082exceptionOrNullimpl).getMessage();
                        }
                    }
                    str4 = "";
                    mb.a("Show completed: auctionId=" + str3 + ", status=" + str5 + ", durationMs=" + currentTimeMillis2 + (str4.length() > 0 ? ", " + str4 : ""), (Throwable) null, 2, (Object) null);
                    return value;
                }
                j2 = sVar.d;
                completableDeferred = (CompletableDeferred) sVar.c;
                String str6 = (String) sVar.b;
                ResultKt.throwOnFailure(obj);
                str = str6;
                sVar.b = str;
                sVar.c = null;
                sVar.d = j2;
                sVar.g = 2;
                await = completableDeferred.await(sVar);
                if (await != coroutine_suspended) {
                    j3 = j2;
                    str3 = str;
                    obj = await;
                    Object value2 = ((Result) obj).getValue();
                    long currentTimeMillis22 = System.currentTimeMillis() - j3;
                    if (!Result.m8086isSuccessimpl(value2)) {
                    }
                    m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value2);
                    if (m8082exceptionOrNullimpl != null) {
                    }
                    str4 = "";
                    mb.a("Show completed: auctionId=" + str3 + ", status=" + str5 + ", durationMs=" + currentTimeMillis22 + (str4.length() > 0 ? ", " + str4 : ""), (Throwable) null, 2, (Object) null);
                    return value2;
                }
                return coroutine_suspended;
            }
        }
        sVar = new s(continuation);
        Object obj2 = sVar.e;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sVar.g;
        if (i2 != 0) {
        }
        sVar.b = str;
        sVar.c = null;
        sVar.d = j2;
        sVar.g = 2;
        await = completableDeferred.await(sVar);
        if (await != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x019c, code lost:
    
        if (r3.a(r2, r5) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        if (a(r23, r2, r0, r5) == r6) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, jb jbVar, Continuation continuation) {
        q qVar;
        int i2;
        o oVar;
        com.chartboost.sdk.impl.m mVar;
        ChartboostError.Show.Unknown unknown;
        ChartboostError.Show show;
        jb jbVar2 = jbVar;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i3 = qVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.f = i3 - Integer.MIN_VALUE;
                Object obj = qVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = qVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    mb.a("Performing show: auctionId=" + jbVar.b() + ", adFormat=" + this.f4901a.a(), (Throwable) null, 2, (Object) null);
                    try {
                        mb.a("Creating AdContainerView: auctionId=" + jbVar.b(), (Throwable) null, 2, (Object) null);
                        mVar = new com.chartboost.sdk.impl.m(context, jbVar.c(), this.v, this.f4901a.a(), this.b, null, this.h, 32, null);
                    } catch (Throwable th) {
                        th = th;
                        oVar = this;
                        if (!(th instanceof ChartboostError.Show)) {
                        }
                        mb.b(U3.j.d + show.getCode() + "] " + show.getConstant() + " - Ad show failed for auction " + jbVar2.b(), show);
                        oVar.a(jbVar2, show);
                        b.h hVar = new b.h(show);
                        qVar.b = null;
                        qVar.c = null;
                        qVar.f = 3;
                    }
                    if (this.f4901a.a() == u.b) {
                        d(jbVar2);
                        mVar.y();
                        mb.a("AdContainerView started: auctionId=" + jbVar.b(), (Throwable) null, 2, (Object) null);
                        b.j jVar = new b.j(mVar);
                        qVar.b = this;
                        qVar.c = jbVar2;
                        qVar.f = 1;
                        if (a(jVar, qVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.p = mVar;
                        qVar.b = this;
                        qVar.c = jbVar2;
                        qVar.f = 2;
                    }
                } else if (i2 == 1 || i2 == 2) {
                    jbVar2 = (jb) qVar.c;
                    oVar = (o) qVar.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!(th instanceof ChartboostError.Show)) {
                            show = th;
                        } else {
                            if (th instanceof IllegalStateException) {
                                unknown = new ChartboostError.Show.Unknown("Invalid state during show: " + th.getMessage(), th);
                            } else if (th instanceof IllegalArgumentException) {
                                unknown = new ChartboostError.Show.Unknown("Invalid show parameters: " + th.getMessage(), th);
                            } else {
                                unknown = new ChartboostError.Show.Unknown("Show failed: " + th.getMessage(), th);
                            }
                            show = unknown;
                        }
                        mb.b(U3.j.d + show.getCode() + "] " + show.getConstant() + " - Ad show failed for auction " + jbVar2.b(), show);
                        oVar.a(jbVar2, show);
                        b.h hVar2 = new b.h(show);
                        qVar.b = null;
                        qVar.c = null;
                        qVar.f = 3;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        qVar = new q(continuation);
        Object obj2 = qVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = qVar.f;
        if (i2 != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x011d, code lost:
    
        if (r12.a(r0, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        if (r12.a(r2, r4) == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, jb jbVar, com.chartboost.sdk.impl.m mVar, Continuation continuation) {
        n nVar;
        int i2;
        String str;
        Job launch$default;
        Job job;
        o oVar;
        jb jbVar2;
        com.chartboost.sdk.impl.m mVar2;
        boolean booleanValue;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i3 = nVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.i = i3 - Integer.MIN_VALUE;
                Object obj = nVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = nVar.i;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    str = jbVar.b() + "_" + UUID.randomUUID();
                    CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    x.put(str, new d(mVar, CompletableDeferred$default));
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new C0217o(CompletableDeferred$default, null), 3, null);
                    try {
                        Intent addFlags = new Intent(context, (Class<?>) FullscreenAdActivity.class).putExtra("com.chartboost.sdk.internal.AdController.AdContainerMap", str).addFlags(268435456);
                        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
                        context.startActivity(addFlags);
                        nVar.b = this;
                        nVar.c = jbVar;
                        nVar.d = mVar;
                        nVar.e = str;
                        nVar.f = launch$default;
                        nVar.i = 1;
                        obj = CompletableDeferred$default.await(nVar);
                        if (obj != coroutine_suspended) {
                            oVar = this;
                            jbVar2 = jbVar;
                            mVar2 = mVar;
                            job = launch$default;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th) {
                        th = th;
                        job = launch$default;
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        x.remove(str);
                        throw th;
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                job = (Job) nVar.f;
                str = (String) nVar.e;
                mVar2 = (com.chartboost.sdk.impl.m) nVar.d;
                jbVar2 = (jb) nVar.c;
                oVar = (o) nVar.b;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    x.remove(str);
                    throw th;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                x.remove(str);
                if (!booleanValue) {
                    mb.a("Fullscreen activity acknowledged: auctionId=" + jbVar2.b(), (Throwable) null, 2, (Object) null);
                    oVar.d(jbVar2);
                    b.j jVar = new b.j(null);
                    nVar.b = null;
                    nVar.c = null;
                    nVar.d = null;
                    nVar.e = null;
                    nVar.f = null;
                    nVar.i = 2;
                } else {
                    mVar2.l();
                    ChartboostError.Show.TimedOut timedOut = new ChartboostError.Show.TimedOut("FullscreenAdActivity did not start within 2000ms (likely background activity launch denial)", null);
                    mb.b(U3.j.d + timedOut.getCode() + "] " + timedOut.getConstant() + " - Fullscreen activity launch ack timed out: auctionId=" + jbVar2.b(), timedOut);
                    oVar.a(jbVar2, timedOut);
                    b.h hVar = new b.h(timedOut);
                    nVar.b = null;
                    nVar.c = null;
                    nVar.d = null;
                    nVar.e = null;
                    nVar.f = null;
                    nVar.i = 3;
                }
                return coroutine_suspended;
            }
        }
        nVar = new n(continuation);
        Object obj2 = nVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = nVar.i;
        if (i2 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        x.remove(str);
        if (!booleanValue) {
        }
        return coroutine_suspended2;
    }

    public final void a(ExpirationReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new j(reason, null), 3, null);
    }

    public final void a(gh ghVar) {
        String a2;
        jb a3;
        jb a4;
        if (this.q) {
            return;
        }
        c cVar = this.n;
        c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
        if (bVar == null || (a4 = bVar.a()) == null || (a2 = a4.b()) == null) {
            c cVar2 = this.n;
            c.C0216c c0216c = cVar2 instanceof c.C0216c ? (c.C0216c) cVar2 : null;
            a2 = c0216c != null ? a(c0216c.a()) : null;
        }
        e eVar = this.o;
        e.b bVar2 = eVar instanceof e.b ? (e.b) eVar : null;
        mb.a("Destroying all: loadAuctionId=" + a2 + ", showAuctionId=" + ((bVar2 == null || (a3 = bVar2.a()) == null) ? null : a3.b()) + ", reason=" + ghVar + ", adFormat=" + this.f4901a.a(), (Throwable) null, 2, (Object) null);
        c cVar3 = this.n;
        if (cVar3 instanceof c.C0216c) {
            c.C0216c c0216c2 = (c.C0216c) cVar3;
            ChartboostError.Load.Internal a5 = a(this, "destroy request", a(c0216c2.a()), null, 4, null);
            mb.b(U3.j.d + a5.getCode() + "] " + a5.getConstant() + " - Load cancelled by destroy", a5);
            CompletableDeferred b2 = c0216c2.b();
            Result.Companion companion = Result.INSTANCE;
            b2.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(a5))));
        } else if (cVar3 instanceof c.b) {
            mb.a("Stopping loaded ad renderable", (Throwable) null, 2, (Object) null);
            ((c.b) cVar3).a().c().a(ghVar);
        } else {
            mb.a("No loaded renderable to stop during destroy", (Throwable) null, 2, (Object) null);
        }
        e eVar2 = this.o;
        e.b bVar3 = eVar2 instanceof e.b ? (e.b) eVar2 : null;
        if (bVar3 != null) {
            mb.a("Stopping showing ad renderable", (Throwable) null, 2, (Object) null);
            ChartboostError.Show.Unknown unknown = new ChartboostError.Show.Unknown("Show cancelled by destroy. AuctionId=" + bVar3.a().b(), new IllegalStateException("Show cancelled by destroy"));
            CompletableDeferred b3 = bVar3.b();
            Result.Companion companion2 = Result.INSTANCE;
            if (b3.complete(Result.m8078boximpl(Result.m8079constructorimpl(ResultKt.createFailure(unknown))))) {
                mb.b(U3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Show cancelled by destroy", unknown);
            }
            bVar3.a().c().a(ghVar);
        }
        d();
        Job job = this.m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.m = null;
        this.p = null;
        CoroutineScopeKt.cancel$default(this.k, "AdController Destroyed with reason: " + ghVar, null, 2, null);
        this.q = true;
        mb.a("Destroy completed, now destroyed", (Throwable) null, 2, (Object) null);
    }

    public static /* synthetic */ ChartboostError.Load.Internal a(o oVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        return oVar.a(str, str2, str3);
    }

    public final ChartboostError.Load.Internal a(String str, String str2, String str3) {
        String str4 = str3 != null ? " ClearCallerStackTrace=[" + str3 + U3.j.e : null;
        if (str4 == null) {
            str4 = "";
        }
        return new ChartboostError.Load.Internal("Load operation was cancelled by " + str + ". AuctionId=" + str2 + " Thread=" + Thread.currentThread().getName() + str4, new IllegalStateException("Load cancelled by " + str));
    }

    public final void a(int i2) {
        String str;
        Job launch$default;
        jb e2 = e();
        if (e2 == null || (str = e2.b()) == null) {
            str = "<unknown>";
        }
        mb.a("Starting expiration timer: auctionId=" + str + ", expirationSeconds=" + i2, (Throwable) null, 2, (Object) null);
        Job job = this.s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.k, null, null, new t(i2, str, this, null), 3, null);
        this.s = launch$default;
    }

    public final void a(Object obj, String bidResponse, long j2, ac acVar) {
        Object m8079constructorimpl;
        String a2;
        int i2;
        String a3;
        String str;
        List emptyList;
        a0 a4;
        a0 a5;
        List e2;
        ne d2;
        String message;
        a0 a6;
        a0 a7;
        List e3;
        a0 a8;
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(z.c.a(new JSONObject(this.i.b(bidResponse))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        z zVar = (z) (Result.m8085isFailureimpl(m8079constructorimpl) ? null : m8079constructorimpl);
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj);
        ChartboostError.Load load = m8082exceptionOrNullimpl instanceof ChartboostError.Load ? (ChartboostError.Load) m8082exceptionOrNullimpl : null;
        boolean z = m8082exceptionOrNullimpl != null || Result.m8085isFailureimpl(m8079constructorimpl);
        String a9 = z ? lb.a(lb.f4860a, 0, 1, null) : null;
        if (zVar == null || (a8 = zVar.a()) == null || (a2 = a8.c()) == null) {
            a2 = a(bidResponse);
        }
        if (zVar == null || (a7 = zVar.a()) == null || (e3 = a7.e()) == null || e3.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e3.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.m.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        mb.a("Tracking load: auctionId=" + a2 + ", status=" + (z ? "FAILURE" : "SUCCESS") + ", durationMs=" + j2 + ", trackerCount=" + i2 + ", errorCode=" + (load != null ? load.getCode() : null) + ", errorConstant=" + (load != null ? load.getConstant() : null) + ", logContextSize=" + (a9 != null ? a9.length() : 0), (Throwable) null, 2, (Object) null);
        if (load != null) {
            mb.a("Tracking load error details: causeDescription=" + load.getCauseDescription(), (Throwable) null, 2, (Object) null);
        }
        if (zVar == null || (a6 = zVar.a()) == null || (a3 = a6.c()) == null) {
            a3 = a(bidResponse);
        }
        List emptyList2 = CollectionsKt.emptyList();
        if (load == null || (message = load.getMessage()) == null) {
            String message2 = m8082exceptionOrNullimpl != null ? m8082exceptionOrNullimpl.getMessage() : null;
            if (message2 == null) {
                Throwable m8082exceptionOrNullimpl2 = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
                str = m8082exceptionOrNullimpl2 != null ? m8082exceptionOrNullimpl2.getMessage() : null;
            } else {
                str = message2;
            }
        } else {
            str = message;
        }
        fb fbVar = new fb(a3, emptyList2, str, load != null ? load.getCode() : null, load != null ? load.getConstant() : null, load != null ? load.getCauseDescription() : null, Long.valueOf(j2), bidResponse, this.b, a9, acVar != null ? Long.valueOf(acVar.b()) : null, acVar != null ? acVar.c() : null, acVar != null ? Integer.valueOf(acVar.a()) : null, acVar != null ? acVar.f() : null, (acVar == null || (d2 = acVar.d()) == null) ? null : d2.b(), acVar != null ? acVar.e() : null, acVar != null ? acVar.g() : null);
        if (zVar != null && (a5 = zVar.a()) != null && (e2 = a5.e()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : e2) {
                if (Intrinsics.areEqual(((g7) obj2).d(), g7.b.m.b())) {
                    arrayList.add(obj2);
                }
            }
            emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                g7 g7Var = (g7) obj3;
                emptyList.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List list = emptyList;
        kh khVar = this.f;
        List e4 = (zVar == null || (a4 = zVar.a()) == null) ? null : a4.e();
        if (e4 == null) {
            e4 = CollectionsKt.emptyList();
        }
        kh.a(khVar, fbVar, list, (g7.b) null, lh.a(e4, g7.b.f), 4, (Object) null);
    }

    public final void a(jb ad, Throwable throwable) {
        int i2;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ChartboostError.Show show = throwable instanceof ChartboostError.Show ? (ChartboostError.Show) throwable : null;
        List e2 = ad.a().e();
        int i3 = 0;
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.o.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i2 > 0) {
            mb.a("Submitting show failure telemetry: auctionId=" + ad.b() + ", errorCode=" + (show != null ? show.getCode() : null) + ", errorConstant=" + (show != null ? show.getConstant() : null) + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        } else {
            mb.e("Show failure telemetry has no trackers: auctionId=" + ad.b() + ", errorCode=" + (show != null ? show.getCode() : null) + ", errorConstant=" + (show != null ? show.getConstant() : null), null, 2, null);
        }
        kh khVar = this.f;
        xg xgVar = new xg(ad.b(), CollectionsKt.emptyList(), throwable.getMessage(), show != null ? show.getCode() : null, show != null ? show.getCauseDescription() : null, show != null ? show.getConstant() : null, this.b, lb.a(lb.f4860a, 0, 1, null));
        List e3 = ad.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.o.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, xgVar, arrayList2, (g7.b) null, lh.a(ad.a().e(), g7.b.f), 4, (Object) null);
    }

    public final void a(jb jbVar, boolean z) {
        int i2;
        List e2 = jbVar.a().e();
        int i3 = 0;
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.n.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        mb.a("Tracking reward: auctionId=" + jbVar.b() + ", adFormat=" + this.f4901a.a() + ", rewardSkipped=" + z + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        kh khVar = this.f;
        eg egVar = new eg(jbVar.b(), CollectionsKt.emptyList(), z, null, null, null, null, this.b, MenuKt.InTransitionDuration, null);
        List e3 = jbVar.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.n.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, egVar, arrayList2, (g7.b) null, lh.a(jbVar.a().e(), g7.b.f), 4, (Object) null);
    }

    public final void a(jb jbVar) {
        int i2;
        List e2 = jbVar.a().e();
        int i3 = 0;
        if ((e2 instanceof Collection) && e2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = e2.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((g7) it.next()).d(), g7.b.j.b()) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        mb.a("Tracking close: auctionId=" + jbVar.b() + ", adFormat=" + this.f4901a.a() + ", trackerCount=" + i2, (Throwable) null, 2, (Object) null);
        kh khVar = this.f;
        s4 s4Var = new s4(jbVar.b(), CollectionsKt.emptyList(), null, null, null, null, this.b, 60, null);
        List e3 = jbVar.a().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e3) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.j.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, s4Var, arrayList2, (g7.b) null, lh.a(jbVar.a().e(), g7.b.f), 4, (Object) null);
        lb.f4860a.c();
    }

    public final String a(String str) {
        try {
            String optString = new JSONObject(this.i.b(str)).optString("auction_id", "");
            Intrinsics.checkNotNull(optString);
            return optString;
        } catch (IllegalArgumentException e2) {
            mb.e("Failed to decode bidResponse base64", e2);
            return "<base64_decode_error>";
        } catch (JSONException e3) {
            mb.e("Failed to extract auction_id from bidResponse", e3);
            return "<json_parse_error>";
        } catch (Exception e4) {
            mb.e("Unexpected error extracting auction_id", e4);
            return "<auction_id_error>";
        }
    }
}
