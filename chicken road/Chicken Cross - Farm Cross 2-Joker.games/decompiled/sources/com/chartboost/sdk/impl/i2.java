package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.o;
import com.chartboost.sdk.impl.p3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.caching.ExpirationReason;
import com.ironsource.U3;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class i2 implements z8 {
    public static final a p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Ad f4797a;
    public final com.chartboost.sdk.impl.d b;
    public final AdCallback c;
    public final d6 d;
    public final j e;
    public final CoroutineDispatcher f;
    public final f2 g;
    public boolean h;
    public volatile boolean i;
    public final Lazy j;
    public volatile boolean k;
    public final CoroutineScope l;
    public Job m;
    public URL n;
    public final AdCallback o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public class b implements l {
        public b() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void a() {
            l.a.b(this);
        }

        @Override // com.chartboost.sdk.impl.l
        public void b() {
            mb.a("DefaultAdContainerListener: onAdRewarded called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void c() {
            mb.a("DefaultAdContainerListener: onAdImpression called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void d() {
            AdCallback l = i2.this.l();
            jb e = i2.this.g().e();
            l.onAdClicked(new ClickEvent(e != null ? e.b() : null, i2.this.e()), null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void e() {
            mb.a("DefaultAdContainerListener: onAdClosed called. This is unexpected for the current ad type.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void f() {
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(ke request) {
            Intrinsics.checkNotNullParameter(request, "request");
            mb.a("DefaultAdContainerListener: onRequestOrientation called with " + request + ". Ignoring as this ad type may not support or expect orientation changes.", (Throwable) null, 2, (Object) null);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(ExpirationReason expirationReason) {
            Intrinsics.checkNotNullParameter(expirationReason, "expirationReason");
            i2.this.c(false);
            i2.this.s();
            com.chartboost.sdk.impl.e eVar = new com.chartboost.sdk.impl.e(i2.this.k().a().i());
            jb e = i2.this.g().e();
            eVar.a(e != null ? e.b() : null, i2.this.e(), i2.this.l(), expirationReason);
        }

        @Override // com.chartboost.sdk.impl.l
        public void a(String url) {
            String str;
            Intrinsics.checkNotNullParameter(url, "url");
            Uri parse = Uri.parse(url);
            String scheme = parse.getScheme();
            if (scheme != null) {
                str = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTP) && !Intrinsics.areEqual(str, "https")) {
                mb.e("onPrivacyIconClicked: rejected non-http(s) URL scheme '" + str + "' in privacy icon URL", null, 2, null);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setFlags(268435456);
            ContextCompat.startActivity(i2.this.k().a().getContext(), intent, null);
        }
    }

    public static final class c extends b {
        public final /* synthetic */ DismissibleAdCallback c;
        public final /* synthetic */ Function0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DismissibleAdCallback dismissibleAdCallback, Function0 function0) {
            super();
            this.c = dismissibleAdCallback;
            this.d = function0;
        }

        @Override // com.chartboost.sdk.impl.i2.b, com.chartboost.sdk.impl.l
        public void b() {
            this.d.invoke();
        }

        @Override // com.chartboost.sdk.impl.i2.b, com.chartboost.sdk.impl.l
        public void c() {
            jb e = i2.this.g().e();
            ShowEvent showEvent = new ShowEvent(e != null ? e.b() : null, i2.this.e());
            i2.this.v();
            this.c.onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), i2.this.e()));
            if (e != null) {
                i2.this.g().c(e);
            } else {
                mb.e("Cannot track impression: currentAd is null for location " + i2.this.e().getLocation(), null, 2, null);
            }
        }

        @Override // com.chartboost.sdk.impl.i2.b, com.chartboost.sdk.impl.l
        public void e() {
            i2.this.d(false);
            if (!i2.this.i) {
                i2.this.c(false);
            }
            DismissibleAdCallback dismissibleAdCallback = this.c;
            jb e = i2.this.g().e();
            dismissibleAdCallback.onAdDismiss(new DismissEvent(e != null ? e.b() : null, i2.this.e()));
        }
    }

    public static final class d implements AdCallback {
        public d() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            i2.this.a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            i2.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            i2.this.a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            i2.this.a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            i2.this.a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            i2.this.a(event);
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public long d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a2 = i2.a(i2.this, (Context) null, (String) null, (v) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;
        public final /* synthetic */ v f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, String str, v vVar, Continuation continuation) {
            super(2, continuation);
            this.d = context;
            this.e = str;
            this.f = vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i2.this.new f(this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o g = i2.this.g();
                Context context = this.d;
                String str = this.e;
                v vVar = this.f;
                this.b = 1;
                a2 = g.a(context, str, vVar, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a2 = ((Result) obj).getValue();
            }
            return Result.m8078boximpl(a2);
        }
    }

    public static final class g extends ContinuationImpl {
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a2 = i2.a(i2.this, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ ShowEvent d;
        public final /* synthetic */ Context e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ShowEvent showEvent, Context context, Continuation continuation) {
            super(2, continuation);
            this.d = showEvent;
            this.e = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return i2.this.new h(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                i2.this.i().onAdRequestedToShow(this.d);
                o g = i2.this.g();
                Context context = this.e;
                this.b = 1;
                a2 = g.a(context, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a2 = ((Result) obj).getValue();
            }
            return Result.m8078boximpl(a2);
        }
    }

    public static final class i extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ w6 c;
        public final /* synthetic */ URL d;
        public final /* synthetic */ i2 e;

        public static final class a extends SuspendLambda implements Function3 {
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ URL d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(URL url, Continuation continuation) {
                super(3, continuation);
                this.d = url;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FlowCollector flowCollector, Throwable th, Continuation continuation) {
                a aVar = new a(this.d, continuation);
                aVar.c = th;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.c;
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Cache observer flow error for URL: " + this.d, th instanceof Exception ? (Exception) th : new Exception(th));
                mb.b(U3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Cache observer error", unknown);
                return Unit.INSTANCE;
            }
        }

        public static final class b implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i2 f4800a;

            public b(i2 i2Var) {
                this.f4800a = i2Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(p3 p3Var, Continuation continuation) {
                if (p3Var instanceof p3.a) {
                    boolean q = this.f4800a.q();
                    jb e = this.f4800a.g().e();
                    String b = e != null ? e.b() : null;
                    if (q) {
                        p3.a aVar = (p3.a) p3Var;
                        mb.b("Ad cache evicted while showing: location=" + this.f4800a.e().getLocation() + ", auctionId=" + b + ", reason=" + aVar.a() + ", url=" + aVar.b(), (Throwable) null, 2, (Object) null);
                    } else {
                        p3.a aVar2 = (p3.a) p3Var;
                        mb.e("Ad cache evicted: location=" + this.f4800a.e().getLocation() + ", auctionId=" + b + ", reason=" + aVar2.a() + ", url=" + aVar2.b(), null, 2, null);
                    }
                    this.f4800a.g().a(((p3.a) p3Var).a());
                    this.f4800a.u();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w6 w6Var, URL url, i2 i2Var, Continuation continuation) {
            super(2, continuation);
            this.c = w6Var;
            this.d = url;
            this.e = i2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.c, this.d, this.e, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.net.URL] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.StringBuilder] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = U3.j.d;
            String str2 = "Failed to collect cache events for ";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow m9620catch = FlowKt.m9620catch(this.c.a(this.d), new a(this.d, null));
                    b bVar = new b(this.e);
                    this.b = 1;
                    if (m9620catch.collect(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (CancellationException unused) {
                mb.a("Cache observer cancelled for " + this.e.e().getLocation() + ", URL: " + this.d, (Throwable) null, 2, (Object) null);
            } catch (Exception e) {
                ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown(str2 + this.e.e().getLocation(), e);
                mb.b(str + unknown.getCode() + "] " + unknown.getConstant() + " - Cache event collection failed, URL: " + this.d, unknown);
            } finally {
                mb.a("Cache observer collect loop finished for " + this.e.e().getLocation() + ", URL: " + this.d, (Throwable) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    public i2(Ad ad, com.chartboost.sdk.impl.d api, AdCallback originalCallback, d6 dependencyContainer, j adConfigInternal, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        Intrinsics.checkNotNullParameter(adConfigInternal, "adConfigInternal");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f4797a = ad;
        this.b = api;
        this.c = originalCallback;
        this.d = dependencyContainer;
        this.e = adConfigInternal;
        this.f = ioDispatcher;
        this.g = new f2();
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.i2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i2.c(i2.this);
            }
        });
        this.l = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.o = new d();
    }

    public static final o c(i2 i2Var) {
        return new o(i2Var.e, i2Var.f4797a.getMediation(), i2Var.f(), i2Var.d.d(), i2Var.d.c(), i2Var.d.b().t(), i2Var.d.b().o(), i2Var.d.a().c(), null, i2Var.f, 256, null);
    }

    @Override // com.chartboost.sdk.impl.z8
    public Object a(Context context, String str, v vVar, Continuation continuation) {
        return a(this, context, str, vVar, continuation);
    }

    public abstract void a(String str);

    public abstract Object b(Context context, Continuation continuation);

    public final void d(boolean z) {
        this.h = z;
    }

    @Override // com.chartboost.sdk.impl.z8
    public void destroy() {
        String location = this.f4797a.getLocation();
        boolean z = this.i;
        jb e2 = g().e();
        mb.a("Coordinator destroy: location=" + location + ", isNRP=" + z + ", auctionId=" + (e2 != null ? e2.b() : null), (Throwable) null, 2, (Object) null);
        u();
        CoroutineScopeKt.cancel$default(this.l, "Coordinator destroyed", null, 2, null);
        g().destroy();
    }

    public final Ad e() {
        return this.f4797a;
    }

    public abstract l f();

    public final o g() {
        return (o) this.j.getValue();
    }

    public final com.chartboost.sdk.impl.d h() {
        return this.b;
    }

    public abstract AdCallback i();

    public final AdCallback j() {
        return this.o;
    }

    public final d6 k() {
        return this.d;
    }

    public final AdCallback l() {
        return this.c;
    }

    public URL m() {
        hd F;
        List A;
        hd c2;
        List A2;
        jb e2 = g().e();
        j2 j2Var = (e2 == null || (c2 = e2.c()) == null || (A2 = c2.A()) == null) ? null : (j2) CollectionsKt.firstOrNull(A2);
        kk kkVar = j2Var instanceof kk ? (kk) j2Var : null;
        if (kkVar == null) {
            ej ejVar = j2Var instanceof ej ? (ej) j2Var : null;
            pf pfVar = (ejVar == null || (F = ejVar.F()) == null || (A = F.A()) == null) ? null : (j2) CollectionsKt.firstOrNull(A);
            kkVar = pfVar instanceof kk ? (kk) pfVar : null;
        }
        if (kkVar == null) {
            mb.e("Could not find VideoRenderable for ad with location " + this.f4797a.getLocation() + " to observe expiration.", null, 2, null);
        }
        if (kkVar != null) {
            return kkVar.V();
        }
        return null;
    }

    public void n() {
        this.b.a("", (CBError.Type) CBError.Impression.INVALID_RESPONSE);
    }

    public boolean o() {
        return this.b.c();
    }

    public final boolean p() {
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.d.b().b().get();
        return aVar != null && aVar.g();
    }

    public final boolean q() {
        return this.h;
    }

    public void r() {
        hd c2;
        List A;
        jb e2 = g().e();
        String b2 = e2 != null ? e2.b() : null;
        jb e3 = g().e();
        mb.a("NRP load success - notifying callback: location=" + this.f4797a.getLocation() + ", auctionId=" + b2 + ", renderableCount=" + ((e3 == null || (c2 = e3.c()) == null || (A = c2.A()) == null) ? 0 : A.size()), (Throwable) null, 2, (Object) null);
        t();
        i().onAdLoaded(new CacheEvent(b2, this.f4797a), null);
    }

    public final void s() {
        this.i = false;
    }

    public void t() {
        Job launch$default;
        u();
        URL m = m();
        if (m == null) {
            mb.d("No video URL to observe for ad at location " + this.f4797a.getLocation() + ".", null, 2, null);
            return;
        }
        this.n = m;
        w6 f2 = this.d.b().f();
        mb.a("Starting cache observer for " + this.f4797a.getLocation() + ", URL: " + m, (Throwable) null, 2, (Object) null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new i(f2, m, this, null), 3, null);
        this.m = launch$default;
    }

    public void u() {
        Job job = this.m;
        if (job != null) {
            if (!job.isActive()) {
                job = null;
            }
            if (job != null) {
                mb.a("Stopping cache observer for " + this.f4797a.getLocation() + ", URL: " + this.n, (Throwable) null, 2, (Object) null);
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
        this.m = null;
        this.n = null;
    }

    public final void v() {
        c0 a2 = t.a(this.f4797a);
        sg h2 = this.d.b().h();
        h2.a(a2);
        mb.c("Current session impression count: " + h2.b(a2) + " in session: " + h2.b() + " (New Rendering Pipeline)", null, 2, null);
    }

    public static final Unit d() {
        return Unit.INSTANCE;
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.chartboost.sdk.impl.z8
    public boolean b() {
        return this.i ? g().f() instanceof o.c.b : Chartboost.isSdkStarted() ? o() : this.k;
    }

    @Override // com.chartboost.sdk.impl.z8
    public Object a(Context context, Continuation continuation) {
        return a(this, context, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x03c4, code lost:
    
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0295 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x029d A[Catch: Exception -> 0x043c, TRY_ENTER, TryCatch #0 {Exception -> 0x043c, blocks: (B:13:0x0297, B:16:0x029d, B:18:0x02a7, B:20:0x02b7, B:21:0x02bd, B:22:0x032c, B:27:0x02db, B:29:0x02e4, B:30:0x02e9, B:32:0x02f1, B:34:0x02f9, B:35:0x02ff, B:39:0x0330, B:41:0x036b, B:42:0x0371, B:44:0x037b, B:46:0x0381, B:48:0x0387, B:49:0x0396, B:51:0x039c, B:53:0x03ae, B:55:0x03c8, B:137:0x0283), top: B:136:0x0283 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0330 A[Catch: Exception -> 0x043c, TryCatch #0 {Exception -> 0x043c, blocks: (B:13:0x0297, B:16:0x029d, B:18:0x02a7, B:20:0x02b7, B:21:0x02bd, B:22:0x032c, B:27:0x02db, B:29:0x02e4, B:30:0x02e9, B:32:0x02f1, B:34:0x02f9, B:35:0x02ff, B:39:0x0330, B:41:0x036b, B:42:0x0371, B:44:0x037b, B:46:0x0381, B:48:0x0387, B:49:0x0396, B:51:0x039c, B:53:0x03ae, B:55:0x03c8, B:137:0x0283), top: B:136:0x0283 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v95, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object a(i2 i2Var, Context context, String str, v vVar, Continuation continuation) {
        e eVar;
        int i2;
        String str2;
        String str3;
        Ref.ObjectRef objectRef;
        long j;
        i2 i2Var2;
        String str4;
        String str5;
        String str6;
        long j2;
        int optInt;
        ChartboostError.Load internal;
        ChartboostError.Load load;
        Result result;
        String str7;
        hd c2;
        List A;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i3 = eVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.h = i3 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eVar2.h;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String location = i2Var.f4797a.getLocation();
                    u a2 = i2Var.e.a();
                    int length = str != null ? str.length() : 0;
                    boolean b2 = i2Var.b();
                    boolean z = i2Var.h;
                    str2 = "] ";
                    str3 = U3.j.d;
                    mb.a("Load requested: location=" + location + ", adFormat=" + a2 + ", bidResponseLength=" + length + ", isLoaded=" + b2 + ", isShowing=" + z, (Throwable) null, 2, (Object) null);
                    if (!Chartboost.isSdkStarted()) {
                        ChartboostError.Load.NotInitialized notInitialized = ChartboostError.Load.NotInitialized.INSTANCE;
                        mb.b("Load failed - SDK not started: location=" + i2Var.f4797a.getLocation(), (Throwable) null, 2, (Object) null);
                        i2Var.a(notInitialized);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(notInitialized));
                    }
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (activity.isFinishing() || activity.isDestroyed()) {
                            ChartboostError.Load.NoContext noContext = ChartboostError.Load.NoContext.INSTANCE;
                            mb.b("Load failed - invalid Activity context: location=" + i2Var.f4797a.getLocation() + ", finishing=" + activity.isFinishing() + ", destroyed=" + activity.isDestroyed(), (Throwable) null, 2, (Object) null);
                            i2Var.a(noContext);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(noContext));
                        }
                    }
                    boolean z2 = (str == null || str.length() == 0 || !o.w.a(i2Var.g, str)) ? false : true;
                    mb.a("Pipeline detection: isNRP=" + z2 + ", location=" + i2Var.f4797a.getLocation(), (Throwable) null, 2, (Object) null);
                    if (!(i2Var.g().f() instanceof o.c.b) && !i2Var.k && !i2Var.o()) {
                        i2Var.i = z2;
                        if (StringsKt.isBlank(i2Var.f4797a.getLocation())) {
                            ChartboostError.Load.InvalidPlacement invalidPlacement = ChartboostError.Load.InvalidPlacement.INSTANCE;
                            i2Var.a(invalidPlacement);
                            i2Var.s();
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(invalidPlacement));
                        }
                        if (str != null && str.length() != 0) {
                            if (z2 && i2Var.p()) {
                                com.chartboost.sdk.impl.d.l.b();
                                ChartboostError.Load.Disabled disabled = ChartboostError.Load.Disabled.INSTANCE;
                                mb.b("Load blocked - publisher disabled: location=" + i2Var.f4797a.getLocation(), (Throwable) null, 2, (Object) null);
                                i2Var.a(disabled);
                                i2Var.s();
                                Result.Companion companion4 = Result.INSTANCE;
                                return Result.m8079constructorimpl(ResultKt.createFailure(disabled));
                            }
                            if (z2) {
                                mb.a("Starting NRP load: location=" + i2Var.f4797a.getLocation() + ", adFormat=" + i2Var.e.a(), (Throwable) null, 2, (Object) null);
                                objectRef = new Ref.ObjectRef();
                                Result.Companion companion5 = Result.INSTANCE;
                                objectRef.element = Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.Unknown("Load initialization failed", null)));
                                try {
                                    JSONObject optJSONObject = new JSONObject(i2Var.g.b(str)).optJSONObject("config");
                                    optInt = optJSONObject != null ? optJSONObject.optInt("load_timeout", 0) : 0;
                                } catch (Exception unused) {
                                }
                                try {
                                    try {
                                        if (optInt > 0) {
                                            j = optInt * 1000;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            long j3 = j;
                                            i2Var2 = i2Var;
                                            str6 = "NRP load failed: location=";
                                            f fVar = i2Var2.new f(context, str, vVar, null);
                                            eVar2.b = i2Var2;
                                            eVar2.c = objectRef;
                                            eVar2.d = j3;
                                            eVar2.e = currentTimeMillis;
                                            eVar2.h = 1;
                                            obj = TimeoutKt.withTimeoutOrNull(j3, fVar, eVar2);
                                            if (obj != coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            j2 = j3;
                                        }
                                        eVar2.b = i2Var2;
                                        eVar2.c = objectRef;
                                        eVar2.d = j3;
                                        eVar2.e = currentTimeMillis;
                                        eVar2.h = 1;
                                        obj = TimeoutKt.withTimeoutOrNull(j3, fVar, eVar2);
                                        if (obj != coroutine_suspended) {
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        str4 = str2;
                                        str5 = str3;
                                        if (e instanceof ChartboostError.Load) {
                                            load = (ChartboostError.Load) e;
                                        } else {
                                            if (e instanceof IllegalArgumentException) {
                                                internal = new ChartboostError.Load.InvalidRequest("Invalid request parameters: " + e.getMessage(), e);
                                            } else if (e instanceof IllegalStateException) {
                                                internal = new ChartboostError.Load.Internal("Invalid state during load: " + e.getMessage(), e);
                                            } else {
                                                internal = new ChartboostError.Load.Internal("Unexpected error during load: " + e.getMessage(), e);
                                            }
                                            load = internal;
                                        }
                                        mb.b(str5 + load.getCode() + str4 + load.getConstant() + " - Ad load failed: " + i2Var2.f4797a.getLocation(), load);
                                        i2Var2.a(load);
                                        i2Var2.s();
                                        Result.Companion companion6 = Result.INSTANCE;
                                        objectRef.element = Result.m8079constructorimpl(ResultKt.createFailure(load));
                                        System.currentTimeMillis();
                                        return objectRef.element;
                                    }
                                    long j32 = j;
                                    i2Var2 = i2Var;
                                    str6 = "NRP load failed: location=";
                                    f fVar2 = i2Var2.new f(context, str, vVar, null);
                                } catch (Exception e3) {
                                    e = e3;
                                    i2Var2 = i2Var;
                                }
                                j = 30000;
                                long currentTimeMillis2 = System.currentTimeMillis();
                            } else {
                                mb.a("Routing to old pipeline: location=" + i2Var.f4797a.getLocation() + ", adFormat=" + i2Var.e.a(), (Throwable) null, 2, (Object) null);
                                i2Var.a(str);
                                Result.Companion companion7 = Result.INSTANCE;
                                return Result.m8079constructorimpl(Unit.INSTANCE);
                            }
                        } else {
                            i2Var.n();
                            Result.Companion companion8 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(new ChartboostError.Load.InvalidAdm("Bid response is null or empty for placement: " + i2Var.f4797a.getLocation(), null)));
                        }
                    } else {
                        ChartboostError.Load.AlreadyLoaded alreadyLoaded = ChartboostError.Load.AlreadyLoaded.INSTANCE;
                        mb.e("Load rejected - ad already loaded: location=" + i2Var.f4797a.getLocation() + ", isNRP=" + z2, null, 2, null);
                        i2Var.a(alreadyLoaded);
                        Result.Companion companion9 = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(alreadyLoaded));
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = eVar2.d;
                    Ref.ObjectRef objectRef2 = (Ref.ObjectRef) eVar2.c;
                    i2 i2Var3 = (i2) eVar2.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str6 = "NRP load failed: location=";
                        str2 = "] ";
                        str3 = U3.j.d;
                        objectRef = objectRef2;
                        i2Var2 = i2Var3;
                    } catch (Exception e4) {
                        e = e4;
                        str4 = "] ";
                        str5 = U3.j.d;
                        objectRef = objectRef2;
                        i2Var2 = i2Var3;
                        if (e instanceof ChartboostError.Load) {
                        }
                        mb.b(str5 + load.getCode() + str4 + load.getConstant() + " - Ad load failed: " + i2Var2.f4797a.getLocation(), load);
                        i2Var2.a(load);
                        i2Var2.s();
                        Result.Companion companion62 = Result.INSTANCE;
                        objectRef.element = Result.m8079constructorimpl(ResultKt.createFailure(load));
                        System.currentTimeMillis();
                        return objectRef.element;
                    }
                }
                result = (Result) obj;
                if (result == null) {
                    ?? value = result.getValue();
                    if (Result.m8086isSuccessimpl(value)) {
                        String location2 = i2Var2.f4797a.getLocation();
                        jb e5 = i2Var2.g().e();
                        mb.a("NRP load succeeded: location=" + location2 + ", auctionId=" + (e5 != null ? e5.b() : null), (Throwable) null, 2, (Object) null);
                        i2Var2.r();
                    } else {
                        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
                        ChartboostError chartboostError = m8082exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8082exceptionOrNullimpl : null;
                        mb.b(str6 + i2Var2.f4797a.getLocation() + ", errorCode=" + (chartboostError != null ? chartboostError.getCode() : null) + ", errorConstant=" + (chartboostError != null ? chartboostError.getConstant() : null), (Throwable) null, 2, (Object) null);
                        i2Var2.a(m8082exceptionOrNullimpl);
                        i2Var2.s();
                    }
                    objectRef.element = value;
                } else {
                    ChartboostError.Load.TimedOut timedOut = new ChartboostError.Load.TimedOut("Load operation exceeded timeout of " + j2 + "ms", new TimeoutException("Ad load timed out after " + j2 + " ms"));
                    jb e6 = i2Var2.g().e();
                    String b3 = e6 != null ? e6.b() : null;
                    jb e7 = i2Var2.g().e();
                    if (e7 != null && (c2 = e7.c()) != null && (A = c2.A()) != null) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(A, 10));
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((j2) it.next()).getClass().getSimpleName());
                        }
                        str7 = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                    }
                    str7 = "unknown";
                    str5 = str3;
                    try {
                        str4 = str2;
                    } catch (Exception e8) {
                        e = e8;
                        str4 = str2;
                    }
                    try {
                        mb.b(str5 + timedOut.getCode() + str4 + timedOut.getConstant() + " - Ad load timed out: location=" + i2Var2.f4797a.getLocation() + ", auctionId=" + b3 + ", timeoutMs=" + j2 + ", renderableTypes=[" + str7 + U3.j.e, timedOut);
                        i2Var2.a(timedOut);
                        i2Var2.s();
                        Result.Companion companion10 = Result.INSTANCE;
                        objectRef.element = Result.m8079constructorimpl(ResultKt.createFailure(timedOut));
                    } catch (Exception e9) {
                        e = e9;
                        if (e instanceof ChartboostError.Load) {
                        }
                        mb.b(str5 + load.getCode() + str4 + load.getConstant() + " - Ad load failed: " + i2Var2.f4797a.getLocation(), load);
                        i2Var2.a(load);
                        i2Var2.s();
                        Result.Companion companion622 = Result.INSTANCE;
                        objectRef.element = Result.m8079constructorimpl(ResultKt.createFailure(load));
                        System.currentTimeMillis();
                        return objectRef.element;
                    }
                }
                System.currentTimeMillis();
                return objectRef.element;
            }
        }
        eVar = i2Var.new e(continuation);
        e eVar22 = eVar;
        Object obj2 = eVar22.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar22.h;
        if (i2 != 0) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
        System.currentTimeMillis();
        return objectRef.element;
    }

    public void b(boolean z) {
        if (z) {
            this.c.onAdLoaded(new CacheEvent(null, this.f4797a), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        } else {
            this.c.onAdShown(new ShowEvent(null, this.f4797a), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }
    }

    public void c(boolean z) {
        if (this.i) {
            return;
        }
        this.k = z;
    }

    public void c() {
        this.b.b();
    }

    public /* synthetic */ i2(Ad ad, com.chartboost.sdk.impl.d dVar, AdCallback adCallback, d6 d6Var, j jVar, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad, dVar, adCallback, d6Var, jVar, (i2 & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.z8
    public void a() {
        String location = this.f4797a.getLocation();
        boolean z = this.i;
        jb e2 = g().e();
        mb.a("Clear loaded ad: location=" + location + ", isNRP=" + z + ", auctionId=" + (e2 != null ? e2.b() : null), (Throwable) null, 2, (Object) null);
        if (!Chartboost.isSdkStarted()) {
            mb.b("Clear failed - SDK not initialized: location=" + this.f4797a.getLocation(), (Throwable) null, 2, (Object) null);
            return;
        }
        c(false);
        s();
        Job job = this.m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.m = null;
        this.n = null;
        c();
        g().a();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x017d A[Catch: Exception -> 0x01de, TryCatch #0 {Exception -> 0x01de, blocks: (B:19:0x0179, B:21:0x017d, B:23:0x0187, B:25:0x018e, B:27:0x0192, B:70:0x0164), top: B:69:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0192 A[Catch: Exception -> 0x01de, TRY_LEAVE, TryCatch #0 {Exception -> 0x01de, blocks: (B:19:0x0179, B:21:0x017d, B:23:0x0187, B:25:0x018e, B:27:0x0192, B:70:0x0164), top: B:69:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object a(i2 i2Var, Context context, Continuation continuation) {
        g gVar;
        int i2;
        ShowEvent showEvent;
        Exception e2;
        Result result;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f = i3 - Integer.MIN_VALUE;
                Object obj = gVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = gVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    mb.a("Show requested: location=" + i2Var.f4797a.getLocation() + ", adFormat=" + i2Var.e.a() + ", isNRP=" + i2Var.i + ", isLoaded=" + i2Var.b(), (Throwable) null, 2, (Object) null);
                    if (!Chartboost.isSdkStarted()) {
                        mb.b("Show failed - SDK not started: location=" + i2Var.f4797a.getLocation(), (Throwable) null, 2, (Object) null);
                        i2Var.a(false);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Show.NotInitialized.INSTANCE));
                    }
                    if (i2Var.i && i2Var.p()) {
                        com.chartboost.sdk.impl.d.l.b();
                        ChartboostError.Show.Disabled disabled = ChartboostError.Show.Disabled.INSTANCE;
                        mb.b("Show blocked - publisher disabled: location=" + i2Var.f4797a.getLocation(), (Throwable) null, 2, (Object) null);
                        jb e3 = i2Var.g().e();
                        i2Var.a(disabled, new ShowEvent(e3 != null ? e3.b() : null, i2Var.f4797a));
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m8079constructorimpl(ResultKt.createFailure(disabled));
                    }
                    i2Var.a(context);
                    if (i2Var.i) {
                        if (!i2Var.b()) {
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoAd.INSTANCE));
                        }
                        if (context instanceof Activity) {
                            Activity activity = (Activity) context;
                            if (activity.isFinishing() || activity.isDestroyed()) {
                                Result.Companion companion4 = Result.INSTANCE;
                                return Result.m8079constructorimpl(ResultKt.createFailure(ChartboostError.Show.NoContext.INSTANCE));
                            }
                        }
                        jb e4 = i2Var.g().e();
                        showEvent = new ShowEvent(e4 != null ? e4.b() : null, i2Var.f4797a);
                        try {
                            h hVar = i2Var.new h(showEvent, context, null);
                            gVar.b = i2Var;
                            gVar.c = showEvent;
                            gVar.f = 1;
                            obj = TimeoutKt.withTimeoutOrNull(5000L, hVar, gVar);
                            if (obj == coroutine_suspended) {
                            }
                        } catch (Exception e5) {
                            e2 = e5;
                            ChartboostError.Show unknown = !(e2 instanceof ChartboostError.Show) ? (ChartboostError.Show) e2 : new ChartboostError.Show.Unknown("Exception during ad show: " + e2.getMessage(), e2);
                            mb.b(U3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Ad show failed: " + i2Var.f4797a.getLocation(), unknown);
                            i2Var.a(unknown, showEvent);
                            Result.Companion companion5 = Result.INSTANCE;
                            return Result.m8079constructorimpl(ResultKt.createFailure(unknown));
                        }
                    } else {
                        gVar.f = 2;
                        Object b2 = i2Var.b(context, gVar);
                        if (b2 != coroutine_suspended) {
                            return b2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ShowEvent showEvent2 = (ShowEvent) gVar.c;
                i2 i2Var2 = (i2) gVar.b;
                try {
                    ResultKt.throwOnFailure(obj);
                    showEvent = showEvent2;
                    i2Var = i2Var2;
                } catch (Exception e6) {
                    e2 = e6;
                    showEvent = showEvent2;
                    i2Var = i2Var2;
                    if (!(e2 instanceof ChartboostError.Show)) {
                    }
                    mb.b(U3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Ad show failed: " + i2Var.f4797a.getLocation(), unknown);
                    i2Var.a(unknown, showEvent);
                    Result.Companion companion52 = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(unknown));
                }
                result = (Result) obj;
                if (result == null) {
                    Object value = result.getValue();
                    Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
                    if (m8082exceptionOrNullimpl == null) {
                        i2Var.a((View) value, showEvent);
                        return value;
                    }
                    i2Var.a(m8082exceptionOrNullimpl, showEvent);
                    return value;
                }
                ChartboostError.Show.TimedOut timedOut = new ChartboostError.Show.TimedOut("Show operation exceeded timeout of 5000ms", new TimeoutException("Ad show timed out after 5000 ms"));
                mb.b(U3.j.d + timedOut.getCode() + "] " + timedOut.getConstant() + " - Ad show timed out: " + i2Var.f4797a.getLocation(), timedOut);
                i2Var.a(timedOut, showEvent);
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m8079constructorimpl(ResultKt.createFailure(timedOut));
            }
        }
        gVar = i2Var.new g(continuation);
        Object obj2 = gVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = gVar.f;
        if (i2 != 0) {
        }
        result = (Result) obj2;
        if (result == null) {
        }
    }

    public final void a(final boolean z) {
        try {
            b4.b.a().i().a(new Function0() { // from class: com.chartboost.sdk.impl.i2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.a(i2.this, z);
                }
            });
        } catch (Exception e2) {
            ChartboostError.Other.Unknown unknown = new ChartboostError.Other.Unknown("Failed to post session not started callback for " + this.e.a(), e2);
            mb.b(U3.j.d + unknown.getCode() + "] " + unknown.getConstant() + " - Cannot post session not started callback", unknown);
        }
    }

    public static final Unit a(i2 i2Var, boolean z) {
        i2Var.b(z);
        return Unit.INSTANCE;
    }

    public void a(Throwable th) {
        ChartboostError chartboostError = th instanceof ChartboostError ? (ChartboostError) th : null;
        jb e2 = g().e();
        String b2 = e2 != null ? e2.b() : null;
        mb.a("NRP load failure - notifying callback: location=" + this.f4797a.getLocation() + ", auctionId=" + b2 + ", errorCode=" + (chartboostError != null ? chartboostError.getCode() : null) + ", errorConstant=" + (chartboostError != null ? chartboostError.getConstant() : null), (Throwable) null, 2, (Object) null);
        i().onAdLoaded(new CacheEvent(b2, this.f4797a), q.a(th));
    }

    public void a(View view, ShowEvent showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.c.onAdShown(showEvent, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Throwable throwable, ShowEvent showEvent) {
        String adID;
        String str;
        hd c2;
        List A;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        this.h = false;
        ShowError b2 = q.b(throwable);
        jb e2 = g().e();
        if (e2 == null || (adID = e2.b()) == null) {
            adID = showEvent.getAdID();
        }
        if (e2 != null && (c2 = e2.c()) != null && (A = c2.A()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(A, 10));
            Iterator it = A.iterator();
            while (it.hasNext()) {
                arrayList.add(((j2) it.next()).getClass().getSimpleName());
            }
            str = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        }
        str = "none";
        ChartboostError chartboostError = throwable instanceof ChartboostError ? (ChartboostError) throwable : null;
        mb.b("Show failed: location=" + this.f4797a.getLocation() + ", auctionId=" + adID + ", adFormat=" + this.e.a() + ", errorCode=" + (chartboostError != null ? chartboostError.getCode() : null) + ", errorConstant=" + (chartboostError != null ? chartboostError.getConstant() : null) + ", renderableTypes=" + str + ", causeDescription=" + (chartboostError != null ? chartboostError.getCauseDescription() : null), (Throwable) null, 2, (Object) null);
        this.c.onAdShown(showEvent, b2);
    }

    public final void a(CacheEvent event, CacheError cacheError) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = cacheError == null ? "SUCCESS" : "FAILURE";
        mb.a("Forwarding onAdLoaded: location=" + this.f4797a.getLocation() + ", auctionId=" + event.getAdID() + ", status=" + str + ", errorCode=" + (cacheError != null ? cacheError.getCode() : null), (Throwable) null, 2, (Object) null);
        c(cacheError == null);
        this.c.onAdLoaded(event, cacheError);
    }

    public final void a(ShowEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mb.a("Forwarding onAdRequestedToShow: location=" + this.f4797a.getLocation() + ", auctionId=" + event.getAdID(), (Throwable) null, 2, (Object) null);
        this.h = true;
        this.c.onAdRequestedToShow(event);
    }

    public final void a(ShowEvent event, ShowError showError) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = showError == null ? "SUCCESS" : "FAILURE";
        mb.a("Forwarding onAdShown: location=" + this.f4797a.getLocation() + ", auctionId=" + event.getAdID() + ", status=" + str + ", errorCode=" + (showError != null ? showError.getCode() : null), (Throwable) null, 2, (Object) null);
        this.h = showError == null;
        this.c.onAdShown(event, showError);
    }

    public final void a(ClickEvent event, ClickError clickError) {
        Intrinsics.checkNotNullParameter(event, "event");
        mb.a("Forwarding onAdClicked: location=" + this.f4797a.getLocation() + ", auctionId=" + event.getAdID() + ", hasError=" + (clickError != null), (Throwable) null, 2, (Object) null);
        this.c.onAdClicked(event, clickError);
    }

    public final void a(ImpressionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mb.a("Forwarding onImpressionRecorded: location=" + this.f4797a.getLocation() + ", auctionId=" + event.getAdID(), (Throwable) null, 2, (Object) null);
        this.c.onImpressionRecorded(event);
    }

    public final void a(ExpirationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mb.a("Forwarding onAdExpired: location=" + this.f4797a.getLocation() + ", reason=" + event.getReason(), (Throwable) null, 2, (Object) null);
        this.c.onAdExpired(event);
    }

    public static /* synthetic */ l a(i2 i2Var, DismissibleAdCallback dismissibleAdCallback, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFullscreenAdContainerListener");
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0() { // from class: com.chartboost.sdk.impl.i2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.d();
                }
            };
        }
        return i2Var.a(dismissibleAdCallback, function0);
    }

    public final l a(DismissibleAdCallback callback, Function0 onReward) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(onReward, "onReward");
        return new c(callback, onReward);
    }
}
