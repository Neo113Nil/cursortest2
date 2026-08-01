package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.df;
import com.chartboost.sdk.impl.e4;
import com.chartboost.sdk.impl.rj;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class kk extends j2 implements vk, ek {
    public static final a O = new a(null);
    public final Lazy A;
    public final CoroutineExceptionHandler B;
    public final CoroutineScope C;
    public boolean D;
    public long E;
    public String F;
    public cf G;
    public Bitmap H;
    public final Set I;
    public final AtomicReference J;
    public volatile boolean K;
    public boolean L;
    public boolean M;
    public Long N;
    public final Context n;
    public final URL o;
    public final w6 p;
    public final dk q;
    public final Set r;
    public final String s;
    public final rk t;
    public final Set u;
    public final List v;
    public zk w;
    public boolean x;
    public final Lazy y;
    public final Lazy z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object a2 = kk.this.a((Context) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kk.this.new c(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        
            if (r0 == null) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a2;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                dk dkVar = kk.this.q;
                Context N = kk.this.N();
                URL V = kk.this.V();
                w6 w6Var = kk.this.p;
                this.b = 1;
                a2 = dkVar.a(N, V, w6Var, this);
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
            if (Result.m8085isFailureimpl(a2)) {
                Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                if (m8082exceptionOrNullimpl == null) {
                    m8082exceptionOrNullimpl = new IOException("Unknown player load initiation error.");
                }
                if (m8082exceptionOrNullimpl instanceof IOException) {
                    String message = m8082exceptionOrNullimpl.getMessage();
                    if (message != null) {
                        str = message.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                    }
                    str = "";
                    m8082exceptionOrNullimpl = (StringsKt.contains$default((CharSequence) str, (CharSequence) "no space left", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "insufficient storage", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "disk full", false, 2, (Object) null)) ? ChartboostError.Load.NoStorage.INSTANCE : (Exception) m8082exceptionOrNullimpl;
                }
                mb.b("VideoRenderable: videoPlayer.load() returned immediate failure for " + kk.this.V() + ".", m8082exceptionOrNullimpl);
                kk.this.a(m8082exceptionOrNullimpl);
            } else {
                View a3 = kk.this.q.a(kk.this.N());
                if (a3 != null && kk.this.b() == null) {
                    kk.this.a(a3);
                }
                kk kkVar = kk.this;
                rj.k kVar = rj.k.b;
                if (kkVar.I.add(kVar)) {
                    kkVar.a(kVar);
                } else {
                    mb.a("One-off VAST event '" + kVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class d implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ kk c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kk kkVar, Continuation continuation) {
                super(2, continuation);
                this.c = kkVar;
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.q.a(gh.h);
                this.c.q.release();
                return Unit.INSTANCE;
            }
        }

        public d() {
        }

        public final void a(Throwable th) {
            mb.e("VideoRenderable: Load operation cancelled for " + kk.this.V() + ".", null, 2, null);
            if (!kk.this.Q()) {
                kk.this.I();
            }
            BuildersKt__Builders_commonKt.launch$default(kk.this.C, NonCancellable.INSTANCE, null, new a(kk.this, null), 2, null);
            kk.this.J.set(null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ float e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, float f, Continuation continuation) {
            super(2, continuation);
            this.d = z;
            this.e = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kk.this.new e(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kk.this.q.setVolume(0.0f);
            if (this.d) {
                Set set = kk.this.r;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (Intrinsics.areEqual(((ii) obj2).b(), CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                        arrayList.add(obj2);
                    }
                }
                mb.a("VideoRenderable.mute() called. Current volume: " + this.e + ", Mute tracking events found: " + arrayList.size(), (Throwable) null, 2, (Object) null);
                if (arrayList.isEmpty()) {
                    mb.e("No mute tracking events found in VAST XML. trackingEvents size: " + kk.this.r.size(), null, 2, null);
                }
                zk b = kk.this.b();
                if (b != null) {
                    b.a(0.0f);
                }
                kk.a(kk.this, rj.m.b, (ii) null, 2, (Object) null);
                kk kkVar = kk.this;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ii iiVar = (ii) obj3;
                    mb.a("Firing mute tracking event: " + iiVar.f(), (Throwable) null, 2, (Object) null);
                    kkVar.b(rj.m.b, iiVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ gh c;
        public final /* synthetic */ kk d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(gh ghVar, kk kkVar, Continuation continuation) {
            super(2, continuation);
            this.c = ghVar;
            this.d = kkVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.c == gh.b) {
                kk kkVar = this.d;
                rj.q qVar = rj.q.b;
                if (kkVar.I.add(qVar)) {
                    kkVar.a(qVar);
                } else {
                    mb.a("One-off VAST event '" + qVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
            }
            zk b = this.d.b();
            if (b != null) {
                b.b();
            }
            cf cfVar = this.d.G;
            if (cfVar != null) {
                cfVar.d();
            }
            this.d.G = null;
            kk kkVar2 = this.d;
            kkVar2.E = kkVar2.q.c();
            kk kkVar3 = this.d;
            kkVar3.F = kkVar3.G();
            Bitmap bitmap = this.d.H;
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.d.H = null;
            this.d.q.a(this.c);
            tf n = this.d.n();
            if (n != null) {
                n.a(ke.b);
            }
            mb.a("VideoRenderable releasing player: url=" + this.d.V() + ", auctionId=" + this.d.u().c() + ", reason=" + this.c, (Throwable) null, 2, (Object) null);
            this.d.q.release();
            CoroutineScopeKt.cancel$default(this.d.C, "VideoRenderable stopped (" + this.c + ") for " + this.d.V(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {
        public int b;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kk.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kk.this.q.pause();
            kk.this.a(rj.n.b);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {
        public int b;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kk.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kk.this.q.play();
            kk.this.a(rj.p.b);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ kk b;
        public final /* synthetic */ a0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(CoroutineExceptionHandler.Companion companion, kk kkVar, a0 a0Var) {
            super(companion);
            this.b = kkVar;
            this.c = a0Var;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            mb.b("VideoRenderable coroutine exception: url=" + this.b.V() + ", auctionId=" + this.c.c() + ", error=" + th.getMessage(), th);
            ChartboostError.Load unknown = th instanceof ChartboostError.Load ? (ChartboostError.Load) th : new ChartboostError.Load.Unknown(th.getMessage(), th);
            CancellableContinuation H = this.b.H();
            if (H != null) {
                Result.Companion companion = Result.INSTANCE;
                H.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(unknown)));
            }
            tf n = this.b.n();
            if (n != null) {
                n.onError(unknown);
            }
        }
    }

    public static final class j extends SuspendLambda implements Function2 {
        public int b;

        public static final class a implements pe {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kk f4847a;

            public a(kk kkVar) {
                this.f4847a = kkVar;
            }

            @Override // com.chartboost.sdk.impl.pe
            public long a() {
                return this.f4847a.q.a();
            }

            @Override // com.chartboost.sdk.impl.pe
            public long b() {
                return this.f4847a.q.c();
            }
        }

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kk.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Long l = null;
            mb.a("Video playback starting: url=" + kk.this.V() + ", auctionId=" + kk.this.u().c() + ", durationMs=" + kk.this.q.a(), (Throwable) null, 2, (Object) null);
            zk b = kk.this.b();
            if (b != null) {
                b.c();
            }
            kk.this.K();
            kk.this.q.play();
            kk kkVar = kk.this;
            rj.r rVar = rj.r.b;
            if (kkVar.I.add(rVar)) {
                List<ii> a2 = kkVar.a("start", MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_DURATION, Boxing.boxFloat(kkVar.q.a() / 1000.0f)), TuplesKt.to("volume", Boxing.boxFloat(kkVar.q.getVolume()))));
                kkVar.a(rVar, (ii) CollectionsKt.firstOrNull(a2));
                for (ii iiVar : a2) {
                    dj djVar = dj.f4736a;
                    rj.r rVar2 = rj.r.b;
                    Context N = kkVar.N();
                    ae R = kkVar.R();
                    u2 L = kkVar.L();
                    Boolean boxBoolean = Boxing.boxBoolean(kkVar.P());
                    u t = kkVar.t();
                    String M = kkVar.M();
                    Long boxLong = Boxing.boxLong(kkVar.q.a());
                    k5 d = kkVar.A().d();
                    djVar.a(rVar2, new sj(null, iiVar, N, R, L, boxBoolean, t, null, M, boxLong, d != null ? Boxing.boxLong(d.b()) : l, kkVar.G(), kkVar.V().toString(), Boxing.boxLong(kkVar.q.c()), 129, null));
                    l = null;
                }
                rj.g gVar = rj.g.b;
                if (kkVar.I.add(gVar)) {
                    kkVar.a(gVar);
                } else {
                    mb.a("One-off VAST event '" + gVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
                rj.j jVar = rj.j.b;
                if (kkVar.I.add(jVar)) {
                    kkVar.a(jVar);
                } else {
                    mb.a("One-off VAST event '" + jVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
                }
            } else {
                mb.a("One-off VAST event '" + rVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
            }
            List E = kk.this.E();
            kk kkVar2 = kk.this;
            cf cfVar = new cf(new a(kkVar2), E, 50L, kk.this.C);
            cfVar.c();
            kkVar2.G = cfVar;
            kk.super.D();
            return Unit.INSTANCE;
        }
    }

    public static final class k extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ float d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f, boolean z, Continuation continuation) {
            super(2, continuation);
            this.d = f;
            this.e = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return kk.this.new k(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kk.this.q.setVolume(this.d);
            if (this.e) {
                Set set = kk.this.r;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (Intrinsics.areEqual(((ii) obj2).b(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE)) {
                        arrayList.add(obj2);
                    }
                }
                mb.a("VideoRenderable.unmute() called. Restore volume: " + this.d + ", Unmute tracking events found: " + arrayList.size(), (Throwable) null, 2, (Object) null);
                if (arrayList.isEmpty()) {
                    mb.e("No unmute tracking events found in VAST XML. trackingEvents size: " + kk.this.r.size(), null, 2, null);
                }
                zk b = kk.this.b();
                if (b != null) {
                    b.a(1.0f);
                }
                kk.a(kk.this, rj.t.b, (ii) null, 2, (Object) null);
                kk kkVar = kk.this;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ii iiVar = (ii) obj3;
                    mb.a("Firing unmute tracking event: " + iiVar.f(), (Throwable) null, 2, (Object) null);
                    kkVar.b(rj.t.b, iiVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context, URL videoUrl, final qf renderableConfig, a0 adMarkupConfig, w6 downloaderCache, dk videoPlayer, Set trackingEvents, String str, wh trackerComponent, kh telemetryManager, rk viewabilityComponent, Set set, List verificationNotExecutedUrls, u adFormat, Mediation mediation, boolean z) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation, null, null, 192, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(downloaderCache, "downloaderCache");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(verificationNotExecutedUrls, "verificationNotExecutedUrls");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.n = context;
        this.o = videoUrl;
        this.p = downloaderCache;
        this.q = videoPlayer;
        this.r = trackingEvents;
        this.s = str;
        this.t = viewabilityComponent;
        this.u = set;
        this.v = verificationNotExecutedUrls;
        this.x = z;
        this.y = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.Y();
            }
        });
        this.z = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.F();
            }
        });
        this.A = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.a(qf.this);
            }
        });
        i iVar = new i(CoroutineExceptionHandler.INSTANCE, this, adMarkupConfig);
        this.B = iVar;
        this.C = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()).plus(iVar));
        this.I = new LinkedHashSet();
        this.J = new AtomicReference(null);
        videoPlayer.a(this);
    }

    public static final u2 F() {
        return b4.b.b().k();
    }

    public static final ae Y() {
        return b4.b.g().a();
    }

    @Override // com.chartboost.sdk.impl.j2
    public void D() {
        mb.a("Video start requested: url=" + this.o + ", auctionId=" + u().c(), (Throwable) null, 2, (Object) null);
        if (this.q.a(this.n) != null) {
            BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new j(null), 3, null);
            return;
        }
        ChartboostError.Show.Unknown unknown = new ChartboostError.Show.Unknown("Player view not available for " + this.o, null);
        mb.b("Video start failed - player view null: url=" + this.o + ", auctionId=" + u().c(), (Throwable) null, 2, (Object) null);
        tf n = n();
        if (n != null) {
            n.onError(unknown);
        }
    }

    public final List E() {
        final df c2;
        ArrayList arrayList = new ArrayList();
        final List b2 = b("firstQuartile");
        arrayList.add(new bf(new df.a(0.25d), new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.a(kk.this, b2);
            }
        }));
        final List b3 = b(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
        arrayList.add(new bf(new df.a(0.5d), new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.b(kk.this, b3);
            }
        }));
        final List b4 = b("thirdQuartile");
        arrayList.add(new bf(new df.a(0.75d), new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.c(kk.this, b4);
            }
        }));
        arrayList.add(new bf(new df.a(0.99d), new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.q(kk.this);
            }
        }));
        Set set = this.r;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            ii iiVar = (ii) obj;
            if (Intrinsics.areEqual(iiVar.b(), NotificationCompat.CATEGORY_PROGRESS) && iiVar.e() != null) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            final ii iiVar2 = (ii) obj2;
            String e2 = iiVar2.e();
            if (e2 != null && (c2 = c(e2)) != null) {
                arrayList.add(new bf(c2, new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return kk.a(df.this, this, iiVar2);
                    }
                }));
            }
        }
        arrayList.add(new bf(new df.b(2000L), new Function0() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kk.r(kk.this);
            }
        }));
        return arrayList;
    }

    public final String G() {
        View a2 = this.q.a(this.n);
        if (a2 == null) {
            return null;
        }
        int width = a2.getWidth();
        int height = a2.getHeight();
        if (width == 0 && height == 0) {
            return null;
        }
        n6 n6Var = n6.f4889a;
        return n6Var.a(width, this.n) + "," + n6Var.a(height, this.n);
    }

    public final CancellableContinuation H() {
        CancellableContinuation cancellableContinuation = (CancellableContinuation) this.J.getAndSet(null);
        if (cancellableContinuation == null || !cancellableContinuation.isActive()) {
            return null;
        }
        return cancellableContinuation;
    }

    public final void I() {
        Iterator it = a("error", MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(TTAdConstant.AD_ID_IS_NULL_CODE)))).iterator();
        while (it.hasNext()) {
            dj.f4736a.a(rj.h.b, new sj(null, (ii) it.next(), this.n, R(), L(), null, null, null, null, null, null, null, null, null, 16353, null));
        }
    }

    public final void J() {
        this.L = true;
        Iterator it = b("notViewable").iterator();
        while (it.hasNext()) {
            b(rj.u.b, (ii) it.next());
        }
    }

    public final void K() {
        if (this.v.isEmpty()) {
            return;
        }
        e3 b2 = dj.f4736a.b();
        if (b2 == null) {
            mb.e("Cannot fire verificationNotExecuted URLs: network service not available", null, 2, null);
            return;
        }
        for (String str : this.v) {
            mb.a("Firing verificationNotExecuted tracker: " + str, (Throwable) null, 2, (Object) null);
            b2.a(new tj(str));
        }
    }

    public final u2 L() {
        return (u2) this.z.getValue();
    }

    public final String M() {
        return (String) this.A.getValue();
    }

    public final Context N() {
        return this.n;
    }

    public final long O() {
        return this.D ? this.E : this.q.c();
    }

    public final boolean P() {
        return this.x;
    }

    public final boolean Q() {
        return this.K;
    }

    public final ae R() {
        return (ae) this.y.getValue();
    }

    public final String S() {
        return this.D ? this.F : G();
    }

    public final long T() {
        return this.q.a();
    }

    public final Long U() {
        return this.N;
    }

    public final URL V() {
        return this.o;
    }

    @Override // com.chartboost.sdk.impl.vk
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public zk b() {
        return this.w;
    }

    public final boolean X() {
        CancellableContinuation cancellableContinuation = (CancellableContinuation) this.J.get();
        return cancellableContinuation != null && cancellableContinuation.isActive();
    }

    @Override // com.chartboost.sdk.impl.pf
    public void q() {
        mb.a("Video pausing: url=" + this.o + ", auctionId=" + u().c() + ", positionMs=" + this.q.c() + ", stallActive=" + this.M, (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new g(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.pf
    public void r() {
        mb.a("Video resuming: url=" + this.o + ", auctionId=" + u().c() + ", positionMs=" + this.q.c() + ", stallActive=" + this.M, (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new h(null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.ek
    public void c() {
        if (this.D) {
            mb.a("VideoRenderable already stopped, ignoring late onVideoCompleted: url=" + this.o, (Throwable) null, 2, (Object) null);
            return;
        }
        mb.a("Video completed: url=" + this.o + ", auctionId=" + u().c(), (Throwable) null, 2, (Object) null);
        if (this.H == null) {
            this.H = this.q.b();
        }
        cf cfVar = this.G;
        if (cfVar != null) {
            cfVar.b();
        }
        rj.f fVar = rj.f.b;
        if (this.I.add(fVar)) {
            a(fVar);
        } else {
            mb.a("One-off VAST event '" + fVar.a() + "' already fired, skipping.", (Throwable) null, 2, (Object) null);
        }
        tf n = n();
        if (n != null) {
            n.a();
        }
    }

    @Override // com.chartboost.sdk.impl.ek
    public void d() {
        if (this.D) {
            mb.a("VideoRenderable already stopped, ignoring late onVideoAssetInvalidated: url=" + this.o, (Throwable) null, 2, (Object) null);
            return;
        }
        String str = "Video asset invalidated (evicted from cache): url=" + this.o + ", auctionId=" + u().c();
        mb.b(str, (Throwable) null, 2, (Object) null);
        ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(this.o.toString(), str, new IOException(str));
        CancellableContinuation H = H();
        if (H != null) {
            Result.Companion companion = Result.INSTANCE;
            H.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(assetUnavailable)));
        }
        tf n = n();
        if (n != null) {
            n.onError(assetUnavailable);
        }
        b(gh.h);
    }

    @Override // com.chartboost.sdk.impl.ek
    public void e() {
        long a2 = this.q.a();
        mb.a("Video ready: url=" + this.o + ", auctionId=" + u().c() + ", durationMs=" + a2, (Throwable) null, 2, (Object) null);
        this.K = true;
        CancellableContinuation H = H();
        if (H != null) {
            Result.Companion companion = Result.INSTANCE;
            H.resumeWith(Result.m8079constructorimpl(Result.m8078boximpl(Result.m8079constructorimpl(Unit.INSTANCE))));
        }
    }

    @Override // com.chartboost.sdk.impl.ek
    public void g() {
        if (this.M) {
            return;
        }
        mb.a("Video buffering started: url=" + this.o + ", auctionId=" + u().c(), (Throwable) null, 2, (Object) null);
        this.M = true;
        tf n = n();
        if (n != null) {
            n.j();
        }
        a(this, rj.b.b, (ii) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.ek
    public void h() {
        if (this.M) {
            mb.a("Video buffering ended: url=" + this.o + ", auctionId=" + u().c(), (Throwable) null, 2, (Object) null);
            this.M = false;
            tf n = n();
            if (n != null) {
                n.i();
            }
            a(this, rj.a.b, (ii) null, 2, (Object) null);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public Bitmap k() {
        Bitmap bitmap = this.H;
        this.H = null;
        return bitmap;
    }

    @Override // com.chartboost.sdk.impl.pf
    public long l() {
        return this.q.a() / 1000;
    }

    @Override // com.chartboost.sdk.impl.pf
    public View o() {
        View a2 = this.q.a(this.n);
        if (a2 == null) {
            mb.e("VideoRenderable.nextAd(): getPlayerView returned null for " + this.o, null, 2, null);
            return a2;
        }
        if (b() == null) {
            a(a2);
        }
        return a2;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void p() {
        tf n = n();
        if (n != null) {
            n.a(ke.b);
        }
    }

    public static final Unit b(kk kkVar, List list) {
        a(kkVar, rj.l.b, (ii) null, 2, (Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kkVar.b(rj.l.b, (ii) it.next());
        }
        return Unit.INSTANCE;
    }

    public static final Unit q(kk kkVar) {
        if (kkVar.H == null) {
            kkVar.H = kkVar.q.b();
        }
        return Unit.INSTANCE;
    }

    public static final Unit r(kk kkVar) {
        if (!kkVar.L) {
            kkVar.L = true;
            Iterator it = kkVar.b("viewable").iterator();
            while (it.hasNext()) {
                kkVar.b(rj.u.b, (ii) it.next());
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(qf qfVar) {
        cj q = qfVar.q();
        if (q != null ? q.i() : true) {
            return "1";
        }
        cj q2 = qfVar.q();
        return (q2 != null ? q2.a() : null) != null ? "2" : "0";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.chartboost.sdk.impl.pf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, Continuation continuation) {
        b bVar;
        int i2;
        Throwable th;
        kk kkVar;
        long j2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f = i3 - Integer.MIN_VALUE;
                Object obj = bVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        bVar.b = this;
                        bVar.c = uptimeMillis;
                        bVar.f = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bVar), 1);
                        cancellableContinuationImpl.initCancellability();
                        this.J.set(cancellableContinuationImpl);
                        mb.a("Video load initiated: url=" + V() + ", auctionId=" + u().c() + ", trackingEventsCount=" + this.r.size(), (Throwable) null, 2, (Object) null);
                        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new c(null), 3, null);
                        cancellableContinuationImpl.invokeOnCancellation(new d());
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(bVar);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kkVar = this;
                        j2 = uptimeMillis;
                    } catch (Throwable th2) {
                        th = th2;
                        kkVar = this;
                        j2 = uptimeMillis;
                        kkVar.N = Boxing.boxLong(SystemClock.uptimeMillis() - j2);
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = bVar.c;
                    kkVar = (kk) bVar.b;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        kkVar.N = Boxing.boxLong(SystemClock.uptimeMillis() - j2);
                        throw th;
                    }
                }
                Object value = ((Result) obj).getValue();
                kkVar.N = Boxing.boxLong(SystemClock.uptimeMillis() - j2);
                return value;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.f;
        if (i2 != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kkVar.N = Boxing.boxLong(SystemClock.uptimeMillis() - j2);
        return value2;
    }

    public final List b(String str) {
        Set set = this.r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((ii) obj).b(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Unit c(kk kkVar, List list) {
        a(kkVar, rj.s.b, (ii) null, 2, (Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kkVar.b(rj.s.b, (ii) it.next());
        }
        return Unit.INSTANCE;
    }

    public final void b(rj rjVar, ii iiVar) {
        dj djVar = dj.f4736a;
        Context context = this.n;
        ae R = R();
        u2 L = L();
        Boolean valueOf = Boolean.valueOf(this.x);
        u t = t();
        String M = M();
        Long valueOf2 = Long.valueOf(this.q.a());
        k5 d2 = A().d();
        djVar.a(rjVar, new sj(null, iiVar, context, R, L, valueOf, t, null, M, valueOf2, d2 != null ? Long.valueOf(d2.b()) : null, G(), this.o.toString(), Long.valueOf(this.q.c()), 129, null));
    }

    public final int b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (error != null && linkedHashSet.add(error)) {
            if (error instanceof hj) {
                Integer a2 = ((hj) error).a();
                if (a2 != null) {
                    return a2.intValue();
                }
            } else {
                if (error instanceof com.chartboost.sdk.internal.Networking.okhttp.a) {
                    int b2 = ((com.chartboost.sdk.internal.Networking.okhttp.a) error).b();
                    if (b2 == 408 || b2 == 504) {
                        return TTAdConstant.AD_ID_IS_NULL_CODE;
                    }
                    return 401;
                }
                if ((error instanceof SocketTimeoutException) || (error instanceof InterruptedIOException)) {
                    return TTAdConstant.AD_ID_IS_NULL_CODE;
                }
                if ((error instanceof UnknownHostException) || (error instanceof ConnectException) || (error instanceof NoRouteToHostException)) {
                    return 400;
                }
            }
            error = error.getCause();
        }
        return DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
    }

    public final ChartboostError.Render b(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.errorCode) {
            case 2000:
            case 2001:
            case 2002:
            case 2004:
            case 2005:
            case 2007:
            case 2008:
                return new ChartboostError.Render.AssetUnavailable(this.o.toString(), "Playback error: " + error.getErrorCodeName(), error);
            case 2003:
            case 2006:
            default:
                return new ChartboostError.Render.VideoPlaybackError("Playback error: " + error.getErrorCodeName(), error);
        }
    }

    public final df c(String offset) {
        ChartboostError.Load invalidAdm;
        Intrinsics.checkNotNullParameter(offset, "offset");
        try {
            if (StringsKt.endsWith$default(offset, "%", false, 2, (Object) null)) {
                Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.removeSuffix(offset, (CharSequence) "%"));
                if (doubleOrNull != null) {
                    return new df.a(RangesKt.coerceIn(doubleOrNull.doubleValue() / 100.0d, 0.0d, 1.0d));
                }
                return null;
            }
            if (new Regex("\\d+s").matches(offset)) {
                Long longOrNull = StringsKt.toLongOrNull(StringsKt.removeSuffix(offset, (CharSequence) CmcdData.Factory.STREAMING_FORMAT_SS));
                if (longOrNull != null) {
                    return new df.b(RangesKt.coerceAtLeast(longOrNull.longValue() * 1000, 0L));
                }
                return null;
            }
            if (new Regex("\\d{1,2}:\\d{1,2}:\\d{1,2}(\\.\\d+)?").matches(offset)) {
                List split$default = StringsKt.split$default((CharSequence) offset, new String[]{ServerSentEventKt.COLON}, false, 0, 6, (Object) null);
                Long longOrNull2 = StringsKt.toLongOrNull((String) split$default.get(0));
                long longValue = longOrNull2 != null ? longOrNull2.longValue() : 0L;
                Long longOrNull3 = StringsKt.toLongOrNull((String) split$default.get(1));
                long longValue2 = longOrNull3 != null ? longOrNull3.longValue() : 0L;
                Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) split$default.get(2));
                if (doubleOrNull2 != null) {
                    return new df.b(RangesKt.coerceAtLeast((long) (((longValue * 3600) + (longValue2 * 60) + doubleOrNull2.doubleValue()) * 1000), 0L));
                }
                mb.e(U3.j.d + new ChartboostError.Load.InvalidAdm("Invalid time format in VAST offset: " + offset + ". Seconds part could not be parsed.", null).getCode() + "] Failed to parse time offset seconds: " + split$default.get(2) + " in offset: " + offset, null, 2, null);
                return null;
            }
            mb.d("Unrecognized offset format: " + offset, null, 2, null);
            return null;
        } catch (Exception e2) {
            if (e2 instanceof ChartboostError.Load) {
                invalidAdm = (ChartboostError.Load) e2;
            } else {
                invalidAdm = new ChartboostError.Load.InvalidAdm("Failed to parse VAST offset string: " + offset + ". " + e2.getMessage(), e2);
            }
            mb.e(U3.j.d + invalidAdm.getCode() + "] Exception parsing offset string: " + offset, invalidAdm);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        int i2 = error.errorCode;
        switch (i2) {
            case 1000:
            case 1001:
            case 1004:
                return DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
            case 1002:
                return 400;
            case 1003:
                return TTAdConstant.AD_ID_IS_NULL_CODE;
            default:
                switch (i2) {
                    case 2000:
                    case 2007:
                    case 2008:
                        return 400;
                    case 2001:
                    case 2002:
                        return TTAdConstant.AD_ID_IS_NULL_CODE;
                    case 2003:
                        return 405;
                    case 2004:
                    case 2005:
                    case 2006:
                        return 401;
                    default:
                        switch (i2) {
                            case 3001:
                            case 3002:
                            case 3003:
                            case 3004:
                                return 405;
                            default:
                                switch (i2) {
                                    case 4001:
                                    case 4002:
                                    case 4003:
                                    case 4004:
                                    case 4005:
                                        return 405;
                                }
                        }
                }
        }
    }

    @Override // com.chartboost.sdk.impl.ek
    public void a(Throwable error) {
        ChartboostError chartboostError;
        int b2;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.D) {
            mb.a("VideoRenderable already stopped, ignoring late onVideoError: url=" + this.o, (Throwable) null, 2, (Object) null);
            return;
        }
        String str = X() ? "LOAD" : "RENDER";
        mb.b("VideoRenderable.onVideoError: phase=" + str + ", url=" + this.o + ", auctionId=" + u().c() + ", errorType=" + error.getClass().getSimpleName(), error);
        cf cfVar = this.G;
        if (cfVar != null) {
            cfVar.d();
        }
        this.G = null;
        Throwable cause = error.getCause();
        ChartboostError chartboostError2 = cause instanceof ChartboostError ? (ChartboostError) cause : null;
        if (chartboostError2 == null) {
            chartboostError2 = error instanceof ChartboostError ? (ChartboostError) error : null;
        }
        if (X()) {
            chartboostError = chartboostError2 instanceof ChartboostError.Load ? (ChartboostError.Load) chartboostError2 : null;
            if (chartboostError == null) {
                if (error instanceof PlaybackException) {
                    chartboostError = a((PlaybackException) error);
                } else if (error instanceof IOException) {
                    chartboostError = new ChartboostError.Load.AssetUnavailable(this.o.toString(), "Asset unavailable: " + error.getMessage(), error);
                } else {
                    chartboostError = new ChartboostError.Load.Unknown("An unknown video error occurred: " + error.getMessage(), error);
                }
            }
        } else {
            chartboostError = chartboostError2 instanceof ChartboostError.Render ? (ChartboostError.Render) chartboostError2 : null;
            if (chartboostError == null) {
                if (error instanceof PlaybackException) {
                    chartboostError = b((PlaybackException) error);
                } else if (error instanceof IOException) {
                    chartboostError = new ChartboostError.Render.AssetUnavailable(this.o.toString(), "Asset unavailable: " + error.getMessage(), error);
                } else {
                    chartboostError = new ChartboostError.Render.Unknown("An unknown video error occurred: " + error.getMessage(), error);
                }
            }
        }
        if (chartboostError instanceof ChartboostError.Load) {
            CancellableContinuation H = H();
            if (H != null) {
                Result.Companion companion = Result.INSTANCE;
                H.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(chartboostError)));
            }
        } else if (chartboostError instanceof ChartboostError.Render) {
            a((ChartboostError.Render) chartboostError);
        }
        if (error instanceof PlaybackException) {
            b2 = c((PlaybackException) error);
        } else {
            b2 = b(error);
        }
        mb.e("VideoRenderable tracking VAST error: vastErrorCode=" + b2 + ", url=" + this.o + ", auctionId=" + u().c() + ", chartboostError=" + chartboostError.getCode(), null, 2, null);
        List<ii> a2 = a("error", MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(b2))));
        a(this, rj.h.b, (ii) null, 2, (Object) null);
        for (ii iiVar : a2) {
            dj djVar = dj.f4736a;
            rj.h hVar = rj.h.b;
            ii a3 = ii.a(iiVar, null, null, 0, null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(b2))), 0L, 47, null);
            Context context = this.n;
            ae R = R();
            u2 L = L();
            Boolean valueOf = Boolean.valueOf(this.x);
            u t = t();
            String M = M();
            Long valueOf2 = Long.valueOf(this.q.a());
            k5 d2 = A().d();
            djVar.a(hVar, new sj(null, a3, context, R, L, valueOf, t, null, M, valueOf2, d2 != null ? Long.valueOf(d2.b()) : null, G(), this.o.toString(), Long.valueOf(this.q.c()), 129, null));
        }
        if (!X() && !this.L && this.q.c() < 2000) {
            J();
        }
        tf n = n();
        if (n != null) {
            n.onError(error);
        }
    }

    @Override // com.chartboost.sdk.impl.j2
    public void a(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.D) {
            mb.a("VideoRenderable already stopped, ignoring stop(" + reason + "): url=" + this.o, (Throwable) null, 2, (Object) null);
            return;
        }
        this.D = true;
        h();
        this.q.a((ek) null);
        if (!X() && !this.L && this.q.c() < 2000) {
            J();
        }
        mb.a("Video stopping: url=" + this.o + ", auctionId=" + u().c() + ", reason=" + reason + ", positionMs=" + this.q.c(), (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.C, NonCancellable.INSTANCE, null, new f(reason, this, null), 2, null);
    }

    @Override // com.chartboost.sdk.impl.pf
    public float a(boolean z) {
        float volume = this.q.getVolume();
        super.a(z);
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new e(z, volume, null), 3, null);
        return volume;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(float f2, boolean z) {
        super.a(f2, z);
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new k(f2, z, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(boolean z, Integer num, Integer num2, e4 e4Var) {
        if (e4Var == null) {
            e4Var = new e4.d(CollectionsKt.emptyList(), this.s);
        }
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        a(this.s, z, e4Var, uuid);
        if (v().a(e4Var, z, uuid)) {
            a(num, num2);
            tf n = n();
            if (n != null) {
                n.f();
            }
        }
    }

    public final void a(Integer num, Integer num2) {
        Long l = null;
        String str = (num == null || num2 == null) ? null : num + "," + num2;
        Set set = this.r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((ii) obj).b(), "click")) {
                arrayList.add(obj);
            }
        }
        a(this, rj.c.b, (ii) null, 2, (Object) null);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            ii iiVar = (ii) arrayList.get(i2);
            dj djVar = dj.f4736a;
            rj.c cVar = rj.c.b;
            Context context = this.n;
            ae R = R();
            u2 L = L();
            Boolean valueOf = Boolean.valueOf(this.x);
            u t = t();
            String M = M();
            Long valueOf2 = Long.valueOf(this.q.a());
            k5 d2 = A().d();
            djVar.a(cVar, new sj(null, iiVar, context, R, L, valueOf, t, str, M, valueOf2, d2 != null ? Long.valueOf(d2.b()) : l, G(), this.o.toString(), Long.valueOf(this.q.c()), 1, null));
            i2 = i3;
            arrayList = arrayList;
            l = null;
        }
    }

    public final void a(View view) {
        Set set;
        dj djVar = dj.f4736a;
        Integer num = null;
        djVar.a((zk) null);
        try {
            sk a2 = this.t.a();
            if (a2.c() && (set = this.u) != null && !set.isEmpty()) {
                k5 d2 = A().d();
                Integer valueOf = d2 != null ? Integer.valueOf((int) d2.b()) : null;
                long a3 = this.q.a() / 1000;
                if (valueOf == null || a3 <= 0 || valueOf.intValue() <= a3) {
                    num = valueOf;
                }
                zk a4 = this.t.b().a(a2, view, set, num);
                djVar.a(a4);
                this.w = a4;
            }
        } catch (Exception e2) {
            URL url = this.o;
            String c2 = u().c();
            Set set2 = this.u;
            mb.b("VideoRenderable viewability tracker creation failed: url=" + url + ", auctionId=" + c2 + ", vendorCount=" + (set2 != null ? set2.size() : 0), e2);
            throw new kj("Failed to execute/initialize AdVerification unit: " + e2.getMessage(), 410);
        }
    }

    public static final Unit a(kk kkVar, List list) {
        a(kkVar, rj.i.b, (ii) null, 2, (Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kkVar.b(rj.i.b, (ii) it.next());
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(df dfVar, kk kkVar, ii iiVar) {
        int a2;
        if (dfVar instanceof df.b) {
            a2 = (int) (((df.b) dfVar).a() / 1000);
        } else if (dfVar instanceof df.a) {
            a2 = (int) ((((df.a) dfVar).a() * kkVar.q.a()) / 1000);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        kkVar.b(new rj.o(a2), iiVar);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void a(kk kkVar, rj rjVar, ii iiVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iiVar = null;
        }
        kkVar.a(rjVar, iiVar);
    }

    public final void a(rj rjVar, ii iiVar) {
        rjVar.a(new sj(b(), iiVar, this.n, R(), L(), null, null, null, null, null, null, null, null, null, 16352, null));
    }

    public final void a(rj rjVar) {
        List b2 = b(rjVar.a());
        a(rjVar, (ii) CollectionsKt.firstOrNull(b2));
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            b(rjVar, (ii) it.next());
        }
    }

    public final List a(final String str, final Map map) {
        List list = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(this.r), new Function1() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kk.a(str, (ii) obj));
            }
        }), new Function1() { // from class: com.chartboost.sdk.impl.kk$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kk.a(map, (ii) obj);
            }
        }));
        return !list.isEmpty() ? list : CollectionsKt.listOf(new ii(str, null, 0, null, map, 0L, 40, null));
    }

    public static final boolean a(String str, ii it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.b(), str);
    }

    public static final ii a(Map map, ii it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ii.a(it, null, null, 0, null, map, 0L, 47, null);
    }

    public final ChartboostError.Load a(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        switch (error.errorCode) {
            case 4001:
            case 4002:
            case 4003:
            case 4004:
            case 4005:
                String a2 = cc.a();
                URL url = this.o;
                int i2 = error.errorCode;
                String errorCodeName = error.getErrorCodeName();
                Throwable cause = error.getCause();
                mb.b("Codec error during video playback: url=" + url + ", errorCode=" + i2 + ", errorCodeName=" + errorCodeName + ", cause=" + (cause != null ? cause.getMessage() : null) + ". " + a2, (Throwable) null, 2, (Object) null);
                cc.b();
                return new ChartboostError.Load.UnsupportedCodec("Playback error: " + error.getErrorCodeName() + ", url=" + this.o + ". " + a2, error);
            default:
                return new ChartboostError.Load.AssetUnavailable(this.o.toString(), "Playback error: " + error.getErrorCodeName(), error);
        }
    }
}
