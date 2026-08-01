package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.LifecycleEventRequestKt;
import gatewayprotocol.v1.LifecycleEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
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

/* compiled from: LifecycleEventObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActive", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.LifecycleEventObserver$invoke$2", f = "LifecycleEventObserver.kt", i = {0, 0}, l = {46, 54, 55}, m = "invokeSuspend", n = {"eventType", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$0", "L$3"})
/* loaded from: classes7.dex */
final class LifecycleEventObserver$invoke$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ LifecycleEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleEventObserver$invoke$2(LifecycleEventObserver lifecycleEventObserver, Continuation<? super LifecycleEventObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lifecycleEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LifecycleEventObserver$invoke$2 lifecycleEventObserver$invoke$2 = new LifecycleEventObserver$invoke$2(this.this$0, continuation);
        lifecycleEventObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return lifecycleEventObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((LifecycleEventObserver$invoke$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType;
        LifecycleEventRequestKt.Dsl _create;
        DeviceInfoRepository deviceInfoRepository;
        Object staticDeviceInfo;
        LifecycleEventRequestKt.Dsl dsl;
        LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType2;
        LifecycleEventObserver lifecycleEventObserver;
        LifecycleEventRequestKt.Dsl dsl2;
        DeviceInfoRepository deviceInfoRepository2;
        GetByteStringId getByteStringId;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        Object invoke;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (UnityAdsNetworkException unused) {
            logger = this.this$0.logger;
            Logger.DefaultImpls.trace$default(logger, "Failed to send lifecycle event, likely due to network issues. Event will be dropped.", null, 2, null);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                lifecycleEventType = LifecycleEventRequestOuterClass.LifecycleEventType.LIFECYCLE_EVENT_TYPE_FOREGROUND;
            } else {
                lifecycleEventType = LifecycleEventRequestOuterClass.LifecycleEventType.LIFECYCLE_EVENT_TYPE_BACKGROUND;
            }
            LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType3 = lifecycleEventType;
            LifecycleEventObserver lifecycleEventObserver2 = this.this$0;
            LifecycleEventRequestKt.Dsl.Companion companion = LifecycleEventRequestKt.Dsl.INSTANCE;
            LifecycleEventRequestOuterClass.LifecycleEventRequest.Builder newBuilder = LifecycleEventRequestOuterClass.LifecycleEventRequest.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
            _create = companion._create(newBuilder);
            deviceInfoRepository = lifecycleEventObserver2.deviceInfoRepository;
            this.L$0 = lifecycleEventType3;
            this.L$1 = lifecycleEventObserver2;
            this.L$2 = _create;
            this.L$3 = _create;
            this.L$4 = _create;
            this.label = 1;
            staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(this);
            if (staticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            dsl = _create;
            lifecycleEventType2 = lifecycleEventType3;
            lifecycleEventObserver = lifecycleEventObserver2;
            dsl2 = dsl;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                invoke = obj;
                universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
                gatewayClient = this.this$0.gatewayClient;
                getRequestPolicy = this.this$0.getRequestPolicy;
                this.label = 3;
                if (GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, getRequestPolicy.invoke(), OperationType.LIFECYCLE_EVENT, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            _create = (LifecycleEventRequestKt.Dsl) this.L$4;
            LifecycleEventRequestKt.Dsl dsl3 = (LifecycleEventRequestKt.Dsl) this.L$3;
            LifecycleEventRequestKt.Dsl dsl4 = (LifecycleEventRequestKt.Dsl) this.L$2;
            LifecycleEventObserver lifecycleEventObserver3 = (LifecycleEventObserver) this.L$1;
            LifecycleEventRequestOuterClass.LifecycleEventType lifecycleEventType4 = (LifecycleEventRequestOuterClass.LifecycleEventType) this.L$0;
            ResultKt.throwOnFailure(obj);
            lifecycleEventType2 = lifecycleEventType4;
            lifecycleEventObserver = lifecycleEventObserver3;
            dsl2 = dsl4;
            dsl = dsl3;
            staticDeviceInfo = obj;
        }
        _create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) staticDeviceInfo);
        deviceInfoRepository2 = lifecycleEventObserver.deviceInfoRepository;
        dsl.setDynamicDeviceInfo(deviceInfoRepository2.getDynamicDeviceInfo());
        dsl.setLifecycleEventType(lifecycleEventType2);
        getByteStringId = lifecycleEventObserver.getByteStringId;
        dsl.setEventId(getByteStringId.invoke());
        LifecycleEventRequestOuterClass.LifecycleEventRequest _build = dsl2._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setLifecycleEventRequest(_build);
        UniversalRequestOuterClass.UniversalRequest.Payload _build2 = _create2._build();
        getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        invoke = getUniversalRequestForPayLoad.invoke(_build2, this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        this.label = 3;
        if (GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, getRequestPolicy.invoke(), OperationType.LIFECYCLE_EVENT, this, 1, null) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
