package com.moloco.sdk.internal.services.bidtoken;

import com.facebook.login.LoginLogger;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i implements h {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final l f10745a;
    public final com.moloco.sdk.internal.publisher.x b;
    public final I c;
    public final String d;

    @DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenHandlerImpl", f = "BidTokenHandler.kt", i = {0, 0, 0, 0}, l = {60}, m = "handleBidTokenRequest", n = {"this", "metricsRecorder", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bidTokenLoadStart"}, s = {"L$0", "L$1", "L$2", "J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f10746a;
        public Object b;
        public Object c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return i.this.a(null, null, null, this);
        }
    }

    public i(l bidTokenService, com.moloco.sdk.internal.publisher.x initializationHandler, I timeProviderService) {
        Intrinsics.checkNotNullParameter(bidTokenService, "bidTokenService");
        Intrinsics.checkNotNullParameter(initializationHandler, "initializationHandler");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f10745a = bidTokenService;
        this.b = initializationHandler;
        this.c = timeProviderService;
        this.d = "BidTokenHandlerImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.moloco.sdk.internal.services.bidtoken.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(MetricsRecorder metricsRecorder, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        long a2;
        i iVar;
        String str;
        MolocoAdError.ErrorType errorType;
        MetricsRecorder metricsRecorder2 = metricsRecorder;
        MolocoBidTokenListener molocoBidTokenListener2 = molocoBidTokenListener;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                Object obj = aVar.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.p.c()));
                    if (!this.b.c()) {
                        MolocoAdError.ErrorType errorType2 = MolocoAdError.ErrorType.SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT;
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.d, "Bid token cannot be fetched because SDK initialization cannot happen due to WM issue", null, false, 12, null);
                        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "sdk_cannot_initialize"));
                        molocoBidTokenListener2.onBidTokenResult("", errorType2);
                        return Unit.INSTANCE;
                    }
                    if (this.b.d().getValue() == Initialization.FAILURE || Moloco.INSTANCE.getFailedMediations$moloco_sdk_release().contains(mediationInfo.getName())) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.d, "Bid token cannot be fetched because SDK initialization has failed", null, false, 12, null);
                        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), "sdk_init_failed"));
                        molocoBidTokenListener2.onBidTokenResult("", MolocoAdError.ErrorType.SDK_INIT_ERROR);
                        return Unit.INSTANCE;
                    }
                    a2 = this.c.a();
                    l lVar = this.f10745a;
                    aVar.f10746a = this;
                    aVar.b = metricsRecorder2;
                    aVar.c = molocoBidTokenListener2;
                    aVar.d = a2;
                    aVar.g = 1;
                    obj = lVar.a(metricsRecorder2, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = aVar.d;
                    MolocoBidTokenListener molocoBidTokenListener3 = (MolocoBidTokenListener) aVar.c;
                    MetricsRecorder metricsRecorder3 = (MetricsRecorder) aVar.b;
                    iVar = (i) aVar.f10746a;
                    ResultKt.throwOnFailure(obj);
                    a2 = j;
                    molocoBidTokenListener2 = molocoBidTokenListener3;
                    metricsRecorder2 = metricsRecorder3;
                }
                str = (String) obj;
                long a3 = iVar.c.a() - a2;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, iVar.d, "Bid token fetched in " + a3 + " ms", null, false, 12, null);
                if (str.length() != 0) {
                    CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    CountEvent withTag = countEvent.withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    metricsRecorder2.recordCountEvent(withTag.withTag(dVar2.c(), "bid_token_fetch_failed"));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (a3 >= timeUnit.toMillis(1L)) {
                        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.s.c()).withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "bid_token_fetch_failed"));
                    }
                    if (a3 >= timeUnit.toMillis(3L)) {
                        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.t.c()).withTag(dVar.c(), LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), "bid_token_fetch_failed"));
                    }
                    errorType = MolocoAdError.ErrorType.AD_SIGNAL_COLLECTION_FAILED;
                } else {
                    CountEvent countEvent2 = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.q.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent2.withTag(dVar3.c(), "success"));
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    if (a3 >= timeUnit2.toMillis(1L)) {
                        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.s.c()).withTag(dVar3.c(), "success"));
                    }
                    if (a3 >= timeUnit2.toMillis(3L)) {
                        metricsRecorder2.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.t.c()).withTag(dVar3.c(), "success"));
                    }
                    errorType = null;
                }
                MolocoLogger.info$default(molocoLogger, iVar.d, "Returning bid token result, hasError: " + (errorType == null) + ", SDK init complete: " + Moloco.isInitialized(), null, false, 12, null);
                molocoBidTokenListener2.onBidTokenResult(str, errorType);
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.g;
        if (i != 0) {
        }
        str = (String) obj2;
        long a32 = iVar.c.a() - a2;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, iVar.d, "Bid token fetched in " + a32 + " ms", null, false, 12, null);
        if (str.length() != 0) {
        }
        MolocoLogger.info$default(molocoLogger2, iVar.d, "Returning bid token result, hasError: " + (errorType == null) + ", SDK init complete: " + Moloco.isInitialized(), null, false, 12, null);
        molocoBidTokenListener2.onBidTokenResult(str, errorType);
        return Unit.INSTANCE;
    }
}
