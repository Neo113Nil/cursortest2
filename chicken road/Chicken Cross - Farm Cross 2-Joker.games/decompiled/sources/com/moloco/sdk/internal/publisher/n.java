package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.i;
import com.moloco.sdk.internal.ortb.model.C4781d;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC4812b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4822h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C4835a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C4836b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class n<L extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> extends Banner implements s {
    public static final int B = 12;
    public static final String C = "BannerViewImpl";

    /* renamed from: a, reason: collision with root package name */
    public final Context f10621a;
    public final InterfaceC4805f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final String d;
    public final boolean e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r f;
    public final Function8<Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, C4782e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z, com.moloco.sdk.internal.C, com.moloco.sdk.internal.services.s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L>> g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z h;
    public final C4786a i;
    public final com.moloco.sdk.internal.C j;
    public final com.moloco.sdk.internal.i k;
    public final com.moloco.sdk.internal.services.s l;
    public final MetricsRecorder m;
    public final Q n;
    public final AdFormatType o;
    public boolean p;
    public final TimerEvent q;
    public TimerEvent r;
    public final CoroutineScope s;
    public final C4797l<L> t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h u;
    public D v;
    public BannerAdShowListener w;
    public final AdLoad x;
    public final L y;
    public static final a z = new a(null);
    public static final int A = 8;

    public static final class a {

        /* renamed from: com.moloco.sdk.internal.publisher.n$a$a, reason: collision with other inner class name */
        public static final class C1486a {
            public static final int c = 0;

            /* renamed from: a, reason: collision with root package name */
            public final int f10622a;
            public final int b;

            public C1486a(int i, int i2) {
                this.f10622a = i;
                this.b = i2;
            }

            public final int a() {
                return this.f10622a;
            }

            public final int b() {
                return this.b;
            }

            public final int c() {
                return this.b;
            }

            public final int d() {
                return this.f10622a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1486a)) {
                    return false;
                }
                C1486a c1486a = (C1486a) obj;
                return this.f10622a == c1486a.f10622a && this.b == c1486a.b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f10622a) * 31) + Integer.hashCode(this.b);
            }

            public String toString() {
                return "XenossDimensions(widthPx=" + this.f10622a + ", heightPx=" + this.b + ')';
            }

            public final C1486a a(int i, int i2) {
                return new C1486a(i, i2);
            }

            public static /* synthetic */ C1486a a(C1486a c1486a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = c1486a.f10622a;
                }
                if ((i3 & 2) != 0) {
                    i2 = c1486a.b;
                }
                return c1486a.a(i, i2);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1486a a(com.moloco.sdk.internal.i bannerSize, Integer num, Integer num2, boolean z) {
            int a2;
            Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            int i = 0;
            boolean z2 = (bannerSize instanceof i.c) || (bannerSize instanceof i.a);
            int a3 = z2 ? (z || num == null) ? -1 : com.moloco.sdk.internal.j.a(num.intValue()) : com.moloco.sdk.internal.j.a(bannerSize.b());
            if (z2) {
                if (num2 != null) {
                    a2 = num2.intValue();
                }
                return new C1486a(a3, i);
            }
            a2 = bannerSize.a();
            i = com.moloco.sdk.internal.j.a(a2);
            return new C1486a(a3, i);
        }

        public a() {
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<C4782e, InterfaceC4812b> {
        public b(Object obj) {
            super(1, obj, n.class, "recreateXenossAd", "recreateXenossAd(Lcom/moloco/sdk/internal/ortb/model/Bid;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/AdLoad;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4812b invoke(C4782e p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((n) this.receiver).a(p0);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$1", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10623a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
            c cVar = new c(continuation);
            cVar.b = z;
            cVar.c = z2;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10623a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$2", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10624a;
        public /* synthetic */ boolean b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Boolean> continuation) {
            return ((d) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.b = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10624a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$3", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10625a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ n<L> c;
        public final /* synthetic */ C4797l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n<L> nVar, C4797l<L> c4797l, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = c4797l;
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((e) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.c, this.d, continuation);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10625a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            this.c.t.b(z);
            if (z) {
                TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.g.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    MetricsRecorder metricsRecorder = nVar.m;
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase2 = nVar.o.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                String c2 = this.c.c();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, n.C, "Banner parent view type: " + c2, false, 4, null);
                D d = this.c.v;
                if (d != null) {
                    d.a(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                D d2 = this.c.v;
                if (d2 != null) {
                    d2.onAdHidden(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                Job a2 = this.d.a();
                if (a2 != null) {
                    Job.DefaultImpls.cancel$default(a2, (CancellationException) null, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$4", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10626a;
        public /* synthetic */ boolean b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Boolean> continuation) {
            return ((f) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(continuation);
            fVar.b = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10626a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(!this.b);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$listenToAdDisplayState$1$5", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10627a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ n<L> c;
        public final /* synthetic */ C4797l<L> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n<L> nVar, C4797l<L> c4797l, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = nVar;
            this.d = c4797l;
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((g) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.c, this.d, continuation);
            gVar.b = ((Boolean) obj).booleanValue();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r3 == null) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String lowerCase;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j creativeType;
            String name;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10627a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                TimerEvent timerEvent = this.c.r;
                if (timerEvent != null) {
                    n<L> nVar = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f = nVar.t.f();
                    if (f != null && (creativeType = f.getCreativeType()) != null && (name = creativeType.name()) != null) {
                        lowerCase = name.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                    lowerCase = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j.g.toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    MetricsRecorder metricsRecorder = nVar.m;
                    String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                    String lowerCase2 = nVar.o.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(c, lowerCase2).withTag(com.moloco.sdk.internal.client_metrics_data.d.h.c(), lowerCase));
                }
                String c2 = this.c.c();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, n.C, "Banner parent view type: " + c2, false, 4, null);
                D d = this.c.v;
                if (d != null) {
                    d.a(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null), c2);
                }
            } else {
                D d2 = this.c.v;
                if (d2 != null) {
                    d2.onAdHidden(MolocoAdKt.createAdInfo$default(this.c.d, null, null, 6, null));
                }
                Job a2 = this.d.a();
                if (a2 != null) {
                    Job.DefaultImpls.cancel$default(a2, (CancellationException) null, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$load$1", f = "Banner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10628a;
        public final /* synthetic */ n<L> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ AdLoad.Listener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n<L> nVar, String str, AdLoad.Listener listener, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = nVar;
            this.c = str;
            this.d = listener;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10628a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.x.load(this.c, this.d);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$1", f = "Banner.kt", i = {}, l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10629a;
        public final /* synthetic */ SharedFlow<Unit> b;
        public final /* synthetic */ n<L> c;

        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<L> f10630a;

            public a(n<L> nVar) {
                this.f10630a = nVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                this.f10630a.y.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SharedFlow<Unit> sharedFlow, n<L> nVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = sharedFlow;
            this.c = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10629a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<Unit> sharedFlow = this.b;
                a aVar = new a(this.c);
                this.f10629a = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.BannerViewImpl$recreateXenossAd$touchInterceptor$1$2$1", f = "Banner.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10631a;
        public final /* synthetic */ MotionEvent b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A c;
        public final /* synthetic */ n<L> d;
        public final /* synthetic */ MutableSharedFlow<Unit> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MotionEvent motionEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a2, n<L> nVar, MutableSharedFlow<Unit> mutableSharedFlow, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = motionEvent;
            this.c = a2;
            this.d = nVar;
            this.e = mutableSharedFlow;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new j(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10631a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MotionEvent motionEvent = this.b;
                if (motionEvent != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a3 = this.c;
                    n<L> nVar = this.d;
                    MutableSharedFlow<Unit> mutableSharedFlow = this.e;
                    com.moloco.sdk.internal.services.s sVar = nVar.l;
                    String c = nVar.t.c();
                    String d = nVar.t.d();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar = nVar.u;
                    this.f10631a = 1;
                    a2 = a3.a(motionEvent, sVar, c, d, hVar, mutableSharedFlow, (r19 & 64) != 0 ? com.moloco.sdk.internal.A.b() : null, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public /* synthetic */ n(Context context, InterfaceC4805f interfaceC4805f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, String str, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Function8 function8, Function1 function1, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, C4786a c4786a, com.moloco.sdk.internal.C c2, com.moloco.sdk.internal.i iVar, com.moloco.sdk.internal.services.s sVar, MetricsRecorder metricsRecorder, Q q, AdFormatType adFormatType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC4805f, aVar, str, z2, rVar, function8, function1, zVar, c4786a, c2, iVar, sVar, metricsRecorder, q, (i2 & 32768) != 0 ? AdFormatType.BANNER : adFormatType);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j l(n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    public static final com.moloco.sdk.internal.ortb.model.D m(n nVar) {
        return nVar.t.e();
    }

    public static final C4796k n(n nVar) {
        return nVar.t.b();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j o(n nVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f2 = nVar.t.f();
        if (f2 != null) {
            return f2.getCreativeType();
        }
        return null;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j2, long j3) {
        this.i.a(j2, j3);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.s, null, 1, null);
        a(this, null, 1, null);
        setAdShowListener(null);
        this.v = null;
    }

    @Override // com.moloco.sdk.publisher.Banner
    public BannerAdShowListener getAdShowListener() {
        return this.w;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo7561getCreateAdObjectDurationUwyO8pc() {
        return this.i.mo7561getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.x.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.m.recordTimerEvent(this.q);
        this.r = this.m.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.p.c());
        BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new h(this, bidResponseJson, listener, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.Banner
    public void setAdShowListener(BannerAdShowListener bannerAdShowListener) {
        D a2 = a(bannerAdShowListener);
        this.v = a2;
        this.w = a2.b();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo7562setCreateAdObjectDurationLRDsOJo(long j2) {
        this.i.mo7562setCreateAdObjectDurationLRDsOJo(j2);
    }

    public static final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n<L> f10632a;

        public k(n<L> nVar) {
            this.f10632a = nVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x
        public void a(boolean z) {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            D d = this.f10632a.v;
            if (d != null) {
                d.onAdClicked(MolocoAdKt.createAdInfo$default(this.f10632a.d, null, null, 6, null));
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            n<L> nVar = this.f10632a;
            nVar.a(com.moloco.sdk.internal.u.a(nVar.d, MolocoAdError.ErrorType.AD_SHOW_ERROR, internalShowError, null, 8, null));
        }
    }

    public final void b() {
        StateFlow<Boolean> isLoaded;
        C4797l<L> c4797l = this.t;
        if (!a()) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "Banner: Using isAdShowing function to track ad display state.", false, 4, null);
            Job a2 = c4797l.a();
            if (a2 != null) {
                Job.DefaultImpls.cancel$default(a2, (CancellationException) null, 1, (Object) null);
            }
            c4797l.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(a(this.t.f()), new f(null)), new g(this, c4797l, null)), this.s));
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "MREC: Using ViewVisibilityTracker(ImpressionViewVisibilityTracker) to track ad display state.", false, 4, null);
        Job a3 = c4797l.a();
        if (a3 != null) {
            Job.DefaultImpls.cancel$default(a3, (CancellationException) null, 1, (Object) null);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f2 = c4797l.f();
        if (f2 == null || (isLoaded = f2.isLoaded()) == null) {
            return;
        }
        c4797l.a(FlowKt.launchIn(FlowKt.onEach(FlowKt.dropWhile(FlowKt.combine(isLoaded, this.n.a(this), new c(null)), new d(null)), new e(this, c4797l, null)), this.s));
    }

    public final String c() {
        Object parent = getParent();
        while (parent != null) {
            String simpleName = parent.getClass().getSimpleName();
            Intrinsics.checkNotNull(simpleName);
            if (StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "RecyclerView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ScrollView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ListView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "ViewPager", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "HorizontalScrollView", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) simpleName, (CharSequence) "AndroidComposeView", false, 2, (Object) null)) {
                return simpleName;
            }
            View view = parent instanceof View ? (View) parent : null;
            parent = view != null ? view.getParent() : null;
        }
        return "none";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, Function8<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, ? super C4782e, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z, ? super com.moloco.sdk.internal.C, ? super com.moloco.sdk.internal.services.s, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L>> createXenossBannerView, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, ? extends L> createXenossBannerAdShowListener, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, com.moloco.sdk.internal.C viewLifecycleOwner, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.internal.services.s clickthroughService, MetricsRecorder metricsRecorder, Q viewVisibilityTracker, AdFormatType adFormatType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(createXenossBannerView, "createXenossBannerView");
        Intrinsics.checkNotNullParameter(createXenossBannerAdShowListener, "createXenossBannerAdShowListener");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f10621a = context;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = adUnitId;
        this.e = z2;
        this.f = externalLinkHandler;
        this.g = createXenossBannerView;
        this.h = watermark;
        this.i = adCreateLoadTimeoutManager;
        this.j = viewLifecycleOwner;
        this.k = bannerSize;
        this.l = clickthroughService;
        this.m = metricsRecorder;
        this.n = viewVisibilityTracker;
        this.o = adFormatType;
        TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.q.c());
        String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.q = startTimerEvent.withTag(c2, lowerCase);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.s = CoroutineScope;
        this.t = new C4797l<>(null, null, null, null, false, null, null, false, 255, null);
        this.u = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a();
        this.x = C4790e.a(CoroutineScope, new Function1() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.a(n.this, ((Long) obj).longValue());
            }
        }, adUnitId, new b(this), adFormatType, a.C1507a.f10866a.b(), metricsRecorder, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.l(n.this);
            }
        });
        this.y = createXenossBannerAdShowListener.invoke(new k(this));
    }

    public final D a(BannerAdShowListener bannerAdShowListener) {
        return new D(bannerAdShowListener, this.b, this.c, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.m(n.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.n(n.this);
            }
        }, this.o, this.m, new Function0() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.o(n.this);
            }
        });
    }

    public static /* synthetic */ void a(n nVar, com.moloco.sdk.internal.t tVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tVar = null;
        }
        nVar.a(tVar);
    }

    public final void a(com.moloco.sdk.internal.t tVar) {
        boolean booleanValue;
        D d2;
        D d3;
        C4797l<L> c4797l = this.t;
        Job a2 = c4797l.a();
        if (a2 != null) {
            Job.DefaultImpls.cancel$default(a2, (CancellationException) null, 1, (Object) null);
        }
        c4797l.a((Job) null);
        if (a()) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "MREC : isAdShowing state set from ViewVisibilityTracker (ImpressionViewVisibilityTracker).", false, 4, null);
            booleanValue = this.t.h();
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, C, "Banner: isAdShowing state set from isAdShowing function.", false, 4, null);
            booleanValue = a(this.t.f()).getValue().booleanValue();
        }
        C4797l<L> c4797l2 = this.t;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> f2 = c4797l2.f();
        if (f2 != null) {
            f2.destroy();
        }
        c4797l2.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C) null);
        if (tVar != null && (d3 = this.v) != null) {
            d3.a(tVar);
        }
        if (booleanValue && (d2 = this.v) != null) {
            d2.onAdHidden(MolocoAdKt.createAdInfo$default(this.d, null, null, 6, null));
        }
        this.t.a((com.moloco.sdk.internal.ortb.model.D) null);
        if (a()) {
            this.t.b(false);
        }
        this.t.a((C4796k) null);
    }

    public static final Duration a(n nVar, long j2) {
        return Duration.m9424boximpl(nVar.i.a());
    }

    public final InterfaceC4812b a(C4782e c4782e) {
        Integer d2;
        int a2;
        C4781d bannerClickMetaData;
        C4781d bannerClickMetaData2;
        this.p = C4822h.f10984a.b(c4782e.getAdm());
        a(this, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> invoke = this.g.invoke(this.f10621a, this.c, c4782e, this.f, this.h, this.j, this.l, this.u);
        C4797l<L> c4797l = this.t;
        c4797l.a(invoke);
        c4797l.a(c4782e.getExt().getSdkEvents());
        c4797l.a(c4782e.getCom.ironsource.o2.y java.lang.String() != null ? new C4796k(c4782e.getCom.ironsource.o2.y java.lang.String(), Float.valueOf(c4782e.getPrice())) : null);
        com.moloco.sdk.internal.ortb.model.y molocoSdkClickMetaData = c4782e.getExt().getMolocoSdkClickMetaData();
        c4797l.b((molocoSdkClickMetaData == null || (bannerClickMetaData2 = molocoSdkClickMetaData.getBannerClickMetaData()) == null) ? null : bannerClickMetaData2.getClickThrough());
        com.moloco.sdk.internal.ortb.model.y molocoSdkClickMetaData2 = c4782e.getExt().getMolocoSdkClickMetaData();
        c4797l.a((molocoSdkClickMetaData2 == null || (bannerClickMetaData = molocoSdkClickMetaData2.getBannerClickMetaData()) == null) ? null : bannerClickMetaData.getClickTracking());
        com.moloco.sdk.internal.ortb.model.y molocoSdkClickMetaData3 = c4782e.getExt().getMolocoSdkClickMetaData();
        c4797l.a((molocoSdkClickMetaData3 != null ? molocoSdkClickMetaData3.getBannerClickMetaData() : null) != null);
        invoke.setAdShowListener(this.y);
        b();
        a.C1486a a3 = z.a(this.k, c4782e.getW(), c4782e.getH(), this.p);
        int a4 = a3.a();
        int b2 = a3.b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a4, b2);
        layoutParams.gravity = 1;
        addView(invoke, layoutParams);
        com.moloco.sdk.internal.i iVar = this.k;
        boolean z2 = iVar instanceof i.c;
        if (z2 || (iVar instanceof i.a)) {
            if (z2) {
                Integer d3 = ((i.c) iVar).d();
                if (d3 != null) {
                    a2 = com.moloco.sdk.internal.j.a(d3.intValue());
                    setLayoutParams(new FrameLayout.LayoutParams(a2, -2));
                }
                a2 = -1;
                setLayoutParams(new FrameLayout.LayoutParams(a2, -2));
            } else {
                if ((iVar instanceof i.a) && (d2 = ((i.a) iVar).d()) != null) {
                    a2 = com.moloco.sdk.internal.j.a(d2.intValue());
                    setLayoutParams(new FrameLayout.LayoutParams(a2, -2));
                }
                a2 = -1;
                setLayoutParams(new FrameLayout.LayoutParams(a2, -2));
            }
        }
        if (this.t.g()) {
            final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A(this.f10621a);
            final MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            BuildersKt__Builders_commonKt.launch$default(this.s, null, null, new i(MutableSharedFlow$default, this, null), 3, null);
            a5.setOnTouchListener(new View.OnTouchListener() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return n.a(n.this, a5, MutableSharedFlow$default, view, motionEvent);
                }
            });
            addView(a5, new FrameLayout.LayoutParams(-1, b2));
        }
        C4836b c4836b = new C4836b(this.f, this.f10621a, null, 0, 12, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        c4836b.setPadding(12, 0, 0, 12);
        c4836b.setPrivacyUrl(C4835a.f11141a);
        c4836b.setOnButtonRenderedListener(new Function1() { // from class: com.moloco.sdk.internal.publisher.n$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.a(n.this, (a.AbstractC1622a.c) obj);
            }
        });
        c4836b.setLayoutParams(layoutParams2);
        addView(c4836b);
        return invoke;
    }

    public static final boolean a(n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.A a2, MutableSharedFlow mutableSharedFlow, View view, MotionEvent motionEvent) {
        BuildersKt__Builders_commonKt.launch$default(nVar.s, null, null, new j(motionEvent, a2, nVar, mutableSharedFlow, null), 3, null);
        return false;
    }

    public static final Unit a(n nVar, a.AbstractC1622a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        nVar.u.a(button);
        return Unit.INSTANCE;
    }

    public final StateFlow<Boolean> a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C<L> c2) {
        if (!this.e && c2 != null) {
            return c2.l();
        }
        return isViewShown();
    }

    public final boolean a() {
        return this.o == AdFormatType.MREC && this.p;
    }
}
