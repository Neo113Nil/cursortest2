package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRevenueObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentAdRevenueEventRequest", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2", f = "AdRevenueObserver.kt", i = {}, l = {36, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AdRevenueObserver$invoke$2 extends SuspendLambda implements Function2<AdRevenueEventRequestOuterClass.AdRevenueEventRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdRevenueObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdRevenueObserver$invoke$2(AdRevenueObserver adRevenueObserver, Continuation<? super AdRevenueObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = adRevenueObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdRevenueObserver$invoke$2 adRevenueObserver$invoke$2 = new AdRevenueObserver$invoke$2(this.this$0, continuation);
        adRevenueObserver$invoke$2.L$0 = obj;
        return adRevenueObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, Continuation<? super Unit> continuation) {
        return ((AdRevenueObserver$invoke$2) create(adRevenueEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (UnityAdsNetworkException unused) {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace("Unexpected error processing ad revenue event", e);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest = (AdRevenueEventRequestOuterClass.AdRevenueEventRequest) this.L$0;
            UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
            UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
            _create.setAdRevenueEventRequest(adRevenueEventRequest);
            UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
            getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
            this.label = 1;
            obj = getUniversalRequestForPayLoad.invoke(_build, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
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
        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        this.label = 2;
        if (GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, getRequestPolicy.invoke(), OperationType.AD_REVENUE_EVENT, this, 1, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
