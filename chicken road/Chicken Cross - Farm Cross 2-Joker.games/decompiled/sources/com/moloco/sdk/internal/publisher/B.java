package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class B implements A {
    public static final a l = new a(null);
    public static final int m = 8;
    public static final String n = "InternalAdShowListenerImpl";

    /* renamed from: a, reason: collision with root package name */
    public final AdShowListener f10582a;
    public final InterfaceC4805f b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final Function0<com.moloco.sdk.internal.ortb.model.D> d;
    public final Function0<C4796k> e;
    public final com.moloco.sdk.internal.y f;
    public final com.moloco.sdk.internal.f g;
    public final AdFormatType h;
    public final MetricsRecorder i;
    public final com.moloco.sdk.internal.client_metrics_data.a j;
    public final Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.InternalAdShowListenerImpl$onAdShowSuccess$2$1", f = "InternalAdShowListener.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10583a;
        public final /* synthetic */ long c;
        public final /* synthetic */ C4796k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, C4796k c4796k, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = c4796k;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return B.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10583a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = B.this.c;
                long j = this.c;
                a.AbstractC1622a.e eVar = a.AbstractC1622a.e.b;
                String a2 = this.d.a();
                this.f10583a = 1;
                obj = aVar.a(j, eVar, a2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            B.this.g.a((String) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public B(AdShowListener adShowListener, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0<com.moloco.sdk.internal.ortb.model.D> provideSdkEvents, Function0<C4796k> provideBUrlData, com.moloco.sdk.internal.y sdkEventUrlTracker, com.moloco.sdk.internal.f bUrlTracker, AdFormatType adType, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        this.f10582a = adShowListener;
        this.b = appLifecycleTrackerService;
        this.c = customUserEventBuilderService;
        this.d = provideSdkEvents;
        this.e = provideBUrlData;
        this.f = sdkEventUrlTracker;
        this.g = bUrlTracker;
        this.h = adType;
        this.i = metricsRecorder;
        this.j = acmClickDeduper;
        this.k = function0;
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void onAdClicked(MolocoAd molocoAd) {
        String str;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onAdClicked: " + molocoAd, false, 4, null);
        this.b.b();
        com.moloco.sdk.internal.ortb.model.D invoke = this.d.invoke();
        if (invoke != null && (str = invoke.getCom.ironsource.Wf.f java.lang.String()) != null) {
            y.a.a(this.f, str, System.currentTimeMillis(), null, 4, null);
        }
        MetricsRecorder metricsRecorder = this.i;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.D.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(C4793h.a(countEvent.withTag(c, lowerCase), this.k));
        this.j.a(this.h);
        AdShowListener adShowListener = this.f10582a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void onAdHidden(MolocoAd molocoAd) {
        String onAdHidden;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onAdHidden: " + molocoAd, false, 4, null);
        com.moloco.sdk.internal.ortb.model.D invoke = this.d.invoke();
        if (invoke != null && (onAdHidden = invoke.getOnAdHidden()) != null) {
            y.a.a(this.f, onAdHidden, System.currentTimeMillis(), null, 4, null);
        }
        MetricsRecorder metricsRecorder = this.i;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d0.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(C4793h.a(countEvent.withTag(c, lowerCase), this.k));
        AdShowListener adShowListener = this.f10582a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a(MolocoAd molocoAd, String str) {
        String onAdShowSuccess;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder append = new StringBuilder("onAdShowSuccess: ").append(molocoAd).append(", creativeType: ");
        Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0 = this.k;
        MolocoLogger.debug$default(molocoLogger, n, append.append(function0 != null ? function0.invoke() : null).toString(), false, 4, null);
        com.moloco.sdk.internal.ortb.model.D invoke = this.d.invoke();
        if (invoke != null && (onAdShowSuccess = invoke.getOnAdShowSuccess()) != null) {
            y.a.a(this.f, onAdShowSuccess, System.currentTimeMillis(), null, 4, null);
        }
        this.j.a();
        C4796k invoke2 = this.e.invoke();
        if (invoke2 != null) {
            BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.scheduling.c.f10710a.b(), null, null, new b(System.currentTimeMillis(), invoke2, null), 3, null);
        }
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.B.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        CountEvent a2 = C4793h.a(countEvent.withTag(c, lowerCase), this.k);
        if (str != null) {
            a2.withTag(com.moloco.sdk.internal.client_metrics_data.d.j.c(), str);
        }
        this.i.recordCountEvent(a2);
        AdShowListener adShowListener = this.f10582a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }

    public /* synthetic */ B(AdShowListener adShowListener, InterfaceC4805f interfaceC4805f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, com.moloco.sdk.internal.y yVar, com.moloco.sdk.internal.f fVar, AdFormatType adFormatType, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.client_metrics_data.a aVar2, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adShowListener, interfaceC4805f, aVar, function0, function02, yVar, fVar, adFormatType, metricsRecorder, aVar2, (i & 1024) != 0 ? null : function03);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a(com.moloco.sdk.internal.t internalError) {
        String str;
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onAdShowFailed: " + internalError, false, 4, null);
        com.moloco.sdk.internal.ortb.model.D invoke = this.d.invoke();
        if (invoke != null && (str = invoke.getCom.ironsource.Wf.e java.lang.String()) != null) {
            this.f.a(str, System.currentTimeMillis(), internalError);
        }
        MetricsRecorder metricsRecorder = this.i;
        CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.C.c());
        String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
        String lowerCase = this.h.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), String.valueOf(internalError.e().getErrorType())));
        AdShowListener adShowListener = this.f10582a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(internalError.e());
        }
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a() {
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, n, "onCloseOrSkipButtonShown triggered in InternalAdShowListenerImpl", false, 4, null);
    }
}
