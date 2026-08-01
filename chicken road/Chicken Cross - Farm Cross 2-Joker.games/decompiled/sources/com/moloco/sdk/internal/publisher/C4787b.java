package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.core.app.FrameMetricsAggregator;
import com.facebook.login.LoginLogger;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.InterfaceC4773a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.i;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.service_locator.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.moloco.sdk.internal.publisher.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4787b {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final String h = "UNABLE_TO_CREATE_AD";
    public static final String i = "AdCreator";

    /* renamed from: a, reason: collision with root package name */
    public final StateFlow<Initialization> f10592a;
    public final com.moloco.sdk.internal.services.I b;
    public final C4788c c;
    public final Function1<Continuation<? super InterfaceC4773a>, Object> d;
    public final CoroutineContext e;

    /* renamed from: com.moloco.sdk.internal.publisher.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.moloco.sdk.internal.publisher.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C1483b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10593a;

        static {
            int[] iArr = new int[Initialization.values().length];
            try {
                iArr[Initialization.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Initialization.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10593a = iArr;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator", f = "AdCreator.kt", i = {0, 0, 0}, l = {FrameMetricsAggregator.EVERY_DURATION}, m = "awaitAdFactoryWithTimeoutOrNull", n = {"createAdType", "metricsRecorder", "awaitTimer"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10594a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return C4787b.this.a(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$awaitAdFactoryWithTimeoutOrNull$2", f = "AdCreator.kt", i = {}, l = {FrameMetricsAggregator.EVERY_DURATION}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.publisher.b$d */
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC4773a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10595a;
        public final /* synthetic */ Function1<Continuation<? super InterfaceC4773a>, Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Continuation<? super InterfaceC4773a>, ? extends Object> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC4773a> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10595a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super InterfaceC4773a>, Object> function1 = this.b;
                this.f10595a = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createAdaptiveBanner$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$e */
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10596a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;
        public final /* synthetic */ Integer k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MetricsRecorder metricsRecorder, String str, String str2, String str3, Integer num, Continuation<? super e> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = num;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new e(this.g, this.h, this.i, this.j, this.k, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.d;
                long a3 = C4787b.this.b.a();
                String a4 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a4);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10596a = tVar2;
                this.b = a4;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a4;
                j = a3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10596a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a5 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                ViewParent a6 = interfaceC4773a.a(a5, e, str3, hVar.g(), hVar.f(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.INLINE_ADAPTIVE_BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), new i.c(this.k), this.g);
                if (a6 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a6 instanceof s) {
                        ((s) a6).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a6);
                }
            }
            MolocoAdError.AdCreateError a7 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a7, null, false, 12, null);
            return new x.a(a7);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createAnchoredAdaptiveBanner$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {Optimizer.OPTIMIZATION_STANDARD}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$f */
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10597a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;
        public final /* synthetic */ Integer k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MetricsRecorder metricsRecorder, String str, String str2, String str3, Integer num, Continuation<? super f> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = num;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new f(this.g, this.h, this.i, this.j, this.k, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.e;
                long a3 = C4787b.this.b.a();
                String a4 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a4);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10597a = tVar2;
                this.b = a4;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a4;
                j = a3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10597a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a5 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                ViewParent a6 = interfaceC4773a.a(a5, e, str3, hVar.g(), hVar.f(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.ANCHORED_ADAPTIVE_BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), new i.a(this.k), this.g);
                if (a6 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a6 instanceof s) {
                        ((s) a6).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a6);
                }
            }
            MolocoAdError.AdCreateError a7 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a7, null, false, 12, null);
            return new x.a(a7);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBanner$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {71}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$g */
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10598a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super g> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new g(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.f10688a;
                long invoke = C4787b.this.b.invoke();
                String a3 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10598a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10598a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                ViewParent b = interfaceC4773a.b(a4, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), i.e.d, this.g);
                if (b != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (b instanceof s) {
                        ((s) b).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(b);
                }
            }
            MolocoAdError.AdCreateError a5 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a5, null, false, 12, null);
            return new x.a(a5);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createBannerTablet$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$h */
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10599a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super h> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new h(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.b;
                long invoke = C4787b.this.b.invoke();
                String a3 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10599a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10599a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                ViewParent c = interfaceC4773a.c(a4, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.BANNER, com.moloco.sdk.internal.mediators.b.a(this.j), null), hVar.j(), i.f.d, this.g);
                if (c != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (c instanceof s) {
                        ((s) c).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(c);
                }
            }
            MolocoAdError.AdCreateError a5 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a5, null, false, 12, null);
            return new x.a(a5);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createInterstitial$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {357}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$i */
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<InterstitialAd, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10600a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super i> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<InterstitialAd, MolocoAdError.AdCreateError>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new i(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.h;
                long invoke = C4787b.this.b.invoke();
                String a3 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10600a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10600a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                InterstitialAd a5 = interfaceC4773a.a(a4, e, str3, hVar.k(), hVar.f(), a.i.f10874a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.INTERSTITIAL, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g);
                if (a5 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof s) {
                        ((s) a5).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a5);
                }
            }
            MolocoAdError.AdCreateError a6 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a6, null, false, 12, null);
            return new x.a(a6);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createMREC$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {171}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$j */
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10601a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super j> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new j(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.c;
                long a3 = C4787b.this.b.a();
                String a4 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a4);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10601a = tVar2;
                this.b = a4;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a4;
                j = a3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10601a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a5 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                ViewParent a6 = interfaceC4773a.a(a5, e, str3, hVar.g(), hVar.f(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.MREC, com.moloco.sdk.internal.mediators.b.c(this.j), null), hVar.j(), i.d.d, this.g);
                if (a6 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a6 instanceof s) {
                        ((s) a6).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a6);
                }
            }
            MolocoAdError.AdCreateError a7 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a7, null, false, 12, null);
            return new x.a(a7);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createNativeAd$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {307}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$k */
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<NativeAd, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10602a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super k> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<NativeAd, MolocoAdError.AdCreateError>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new k(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.f;
                long a3 = C4787b.this.b.a();
                String a4 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a4);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10602a = tVar2;
                this.b = a4;
                this.c = withTag;
                this.d = a3;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a4;
                j = a3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10602a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a5 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                com.moloco.sdk.internal.services.n i2 = a.e.f10870a.i();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                NativeAd a6 = interfaceC4773a.a(a5, e, i2, str3, hVar.k(), hVar.f(), a.i.f10874a.c(), hVar.j(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.NATIVE, com.moloco.sdk.internal.mediators.b.d(this.j), null), hVar.i(), this.g);
                if (a6 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str.toString()));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a6 instanceof s) {
                        ((s) a6).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a6);
                }
            }
            MolocoAdError.AdCreateError a7 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a7, null, false, 12, null);
            return new x.a(a7);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.AdCreator$createRewardedInterstitial$2", f = "AdCreator.kt", i = {0, 0, 0, 0}, l = {404}, m = "invokeSuspend", n = {"adType", "isSdkInitialized", "createTimerEvent", "createAdTime"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.b$l */
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.moloco.sdk.internal.x<RewardedInterstitialAd, MolocoAdError.AdCreateError>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10603a;
        public Object b;
        public Object c;
        public long d;
        public int e;
        public final /* synthetic */ MetricsRecorder g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MetricsRecorder metricsRecorder, String str, String str2, String str3, Continuation<? super l> continuation) {
            super(2, continuation);
            this.g = metricsRecorder;
            this.h = str;
            this.i = str2;
            this.j = str3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.moloco.sdk.internal.x<RewardedInterstitialAd, MolocoAdError.AdCreateError>> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C4787b.this.new l(this.g, this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            t tVar;
            TimerEvent timerEvent;
            String str;
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t tVar2 = t.i;
                long invoke = C4787b.this.b.invoke();
                String a3 = C4787b.this.a();
                TimerEvent withTag = this.g.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.h.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag("initial_sdk_init_state", a3);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Creating " + tVar2 + " ad with adUnitId: " + this.h, null, false, 12, null);
                C4787b c4787b = C4787b.this;
                Function1 function1 = c4787b.d;
                MetricsRecorder metricsRecorder = this.g;
                this.f10603a = tVar2;
                this.b = a3;
                this.c = withTag;
                this.d = invoke;
                this.e = 1;
                a2 = c4787b.a(function1, tVar2, metricsRecorder, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tVar = tVar2;
                timerEvent = withTag;
                str = a3;
                j = invoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.d;
                TimerEvent timerEvent2 = (TimerEvent) this.c;
                String str2 = (String) this.b;
                t tVar3 = (t) this.f10603a;
                ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
                str = str2;
                tVar = tVar3;
                a2 = obj;
            }
            InterfaceC4773a interfaceC4773a = (InterfaceC4773a) a2;
            if (interfaceC4773a != null) {
                Context a4 = com.moloco.sdk.service_locator.a.f10865a.a();
                InterfaceC4805f e = a.b.f10867a.e();
                String str3 = this.h;
                a.h hVar = a.h.f10873a;
                long j2 = j;
                RewardedInterstitialAd a5 = interfaceC4773a.a(a4, e, str3, hVar.k(), hVar.f(), a.i.f10874a.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.A(this.i), new C4786a(AdFormatType.REWARDED, com.moloco.sdk.internal.mediators.b.b(this.j), null), this.g, a.c.f10868a.b());
                if (a5 != null) {
                    MetricsRecorder metricsRecorder2 = this.g;
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent.withTag(dVar.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name()).withTag("initial_sdk_init_state", str));
                    this.g.recordTimerEvent(timerEvent.withTag(dVar.c(), "success"));
                    if (a5 instanceof s) {
                        ((s) a5).a(j2, C4787b.this.b.a());
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, C4787b.i, "Created " + tVar + " ad with adUnitId: " + this.h, null, false, 12, null);
                    return new x.b(a5);
                }
            }
            MolocoAdError.AdCreateError a6 = C4787b.this.a(this.h, str, timerEvent, tVar, this.g);
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, C4787b.i, "Failed to create " + tVar + " with reason: " + a6, null, false, 12, null);
            return new x.a(a6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4787b(StateFlow<? extends Initialization> initializationState, com.moloco.sdk.internal.services.I timeProviderService, C4788c adCreatorConfiguration, Function1<? super Continuation<? super InterfaceC4773a>, ? extends Object> awaitAdFactory) {
        Intrinsics.checkNotNullParameter(initializationState, "initializationState");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        Intrinsics.checkNotNullParameter(adCreatorConfiguration, "adCreatorConfiguration");
        Intrinsics.checkNotNullParameter(awaitAdFactory, "awaitAdFactory");
        this.f10592a = initializationState;
        this.b = timeProviderService;
        this.c = adCreatorConfiguration;
        this.d = awaitAdFactory;
        this.e = com.moloco.sdk.internal.scheduling.b.a().getDefault();
    }

    public final Object d(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new j(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object e(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<NativeAd, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new k(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object f(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<RewardedInterstitialAd, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new l(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object d(C4787b c4787b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c4787b.d(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object e(C4787b c4787b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c4787b.e(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object f(C4787b c4787b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c4787b.f(str, str2, metricsRecorder, str3, continuation);
    }

    public final Object b(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new h(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object c(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<InterstitialAd, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new i(metricsRecorder, str2, str3, str, null), continuation);
    }

    public static /* synthetic */ Object b(C4787b c4787b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c4787b.b(str, str2, metricsRecorder, str3, continuation);
    }

    public static /* synthetic */ Object c(C4787b c4787b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c4787b.c(str, str2, metricsRecorder, str3, continuation);
    }

    public final Object a(String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new g(metricsRecorder, str2, str3, str, null), continuation);
    }

    public final Object b(String str, Integer num, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new f(metricsRecorder, str2, str3, str, num, null), continuation);
    }

    public static /* synthetic */ Object a(C4787b c4787b, String str, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        return c4787b.a(str, str2, metricsRecorder, str3, (Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>) continuation);
    }

    public static /* synthetic */ Object b(C4787b c4787b, String str, Integer num, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        return c4787b.b(str, num, str2, metricsRecorder, str3, continuation);
    }

    public final Object a(String str, Integer num, String str2, MetricsRecorder metricsRecorder, String str3, Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>> continuation) {
        return BuildersKt.withContext(this.e, new e(metricsRecorder, str2, str3, str, num, null), continuation);
    }

    public static /* synthetic */ Object a(C4787b c4787b, String str, Integer num, String str2, MetricsRecorder metricsRecorder, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        return c4787b.a(str, num, str2, metricsRecorder, str3, (Continuation<? super com.moloco.sdk.internal.x<Banner, MolocoAdError.AdCreateError>>) continuation);
    }

    public final MolocoAdError.AdCreateError a(String str, String str2, TimerEvent timerEvent, t tVar, MetricsRecorder metricsRecorder) {
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.j.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
        CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag("initial_sdk_init_state", str2).withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar.name());
        Initialization value = this.f10592a.getValue();
        int i2 = value == null ? -1 : C1483b.f10593a[value.ordinal()];
        if (i2 == -1) {
            com.moloco.sdk.internal.error.b f2 = a.b.f10867a.f();
            StringBuilder sb = new StringBuilder("CREATE_");
            String upperCase = tVar.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            b.a.a(f2, sb.append(upperCase).append("_AD_FAILED_SDK_INIT_NOT_COMPLETED").toString(), null, 2, null);
            TimerEvent withTag2 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag2.withTag(dVar2.c(), "sdk_init_not_completed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar2.c(), "sdk_init_not_completed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Cannot retrieve AdFactory as SDK init was not called or not completed", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_WAS_NOT_COMPLETED;
        }
        if (i2 == 1) {
            b.a.a(a.b.f10867a.f(), h, null, 2, null);
            TimerEvent withTag3 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag3.withTag(dVar3.c(), "unable_to_create_ad"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar3.c(), "unable_to_create_ad"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Could not find the adUnitId that was requested for load: " + str, null, false, 12, null);
            return MolocoAdError.AdCreateError.UNABLE_TO_CREATE_AD;
        }
        if (i2 == 2) {
            com.moloco.sdk.internal.error.b f3 = a.b.f10867a.f();
            StringBuilder sb2 = new StringBuilder("CREATE_");
            String upperCase2 = tVar.name().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            b.a.a(f3, sb2.append(upperCase2).append("_AD_FAILED_SDK_INIT_FAILED").toString(), null, 2, null);
            TimerEvent withTag4 = timerEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
            com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.b;
            metricsRecorder.recordTimerEvent(withTag4.withTag(dVar4.c(), "sdk_init_failed"));
            metricsRecorder.recordCountEvent(withTag.withTag(dVar4.c(), "sdk_init_failed"));
            MolocoLogger.error$default(MolocoLogger.INSTANCE, i, "Cannot create AdFactory as SDK init was failure", null, false, 12, null);
            return MolocoAdError.AdCreateError.SDK_INIT_FAILED;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1<? super Continuation<? super InterfaceC4773a>, ? extends Object> function1, t tVar, MetricsRecorder metricsRecorder, Continuation<? super InterfaceC4773a> continuation) {
        c cVar;
        int i2;
        TimerEvent startTimerEvent;
        Object m9582withTimeoutOrNullKLykuaI;
        t tVar2 = tVar;
        MetricsRecorder metricsRecorder2 = metricsRecorder;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.f = i3 - Integer.MIN_VALUE;
                Object obj = cVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cVar.f;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    startTimerEvent = metricsRecorder2.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.i.c());
                    Duration duration = this.c.c().get(tVar2);
                    long rawValue = duration != null ? duration.getRawValue() : this.c.d();
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "Waiting for AdFactory with timeout: " + ((Object) Duration.m9466toStringimpl(rawValue)), null, false, 12, null);
                    d dVar = new d(function1, null);
                    cVar.f10594a = tVar2;
                    cVar.b = metricsRecorder2;
                    cVar.c = startTimerEvent;
                    cVar.f = 1;
                    m9582withTimeoutOrNullKLykuaI = TimeoutKt.m9582withTimeoutOrNullKLykuaI(rawValue, dVar, cVar);
                    if (m9582withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    TimerEvent timerEvent = (TimerEvent) cVar.c;
                    metricsRecorder2 = (MetricsRecorder) cVar.b;
                    t tVar3 = (t) cVar.f10594a;
                    ResultKt.throwOnFailure(obj);
                    startTimerEvent = timerEvent;
                    tVar2 = tVar3;
                    m9582withTimeoutOrNullKLykuaI = obj;
                }
                InterfaceC4773a interfaceC4773a = (InterfaceC4773a) m9582withTimeoutOrNullKLykuaI;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "AdFactory received: " + (interfaceC4773a != null), null, false, 12, null);
                metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC4773a == null ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
                return m9582withTimeoutOrNullKLykuaI;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cVar.f;
        if (i2 != 0) {
        }
        InterfaceC4773a interfaceC4773a2 = (InterfaceC4773a) m9582withTimeoutOrNullKLykuaI;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, i, "AdFactory received: " + (interfaceC4773a2 != null), null, false, 12, null);
        metricsRecorder2.recordTimerEvent(startTimerEvent.withTag(com.moloco.sdk.internal.client_metrics_data.d.c.c(), tVar2.name()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), interfaceC4773a2 == null ? "success" : LoginLogger.EVENT_EXTRAS_FAILURE));
        return m9582withTimeoutOrNullKLykuaI;
    }

    public final String a() {
        String name;
        Initialization value = this.f10592a.getValue();
        if (value != null && (name = value.name()) != null) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                return lowerCase;
            }
        }
        return "not_invoked_or_in_progress";
    }
}
