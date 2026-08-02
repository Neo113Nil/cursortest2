package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CheckProductCapabilityEnabledUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;", "capabilityRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;)V", "input", "Larrow/core/Ior;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CheckProductCapabilityEnabledUseCase implements com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability, java.lang.Throwable, java.lang.Boolean> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductCapabilityRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CheckProductCapabilityEnabledUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductCapabilityRepository productCapabilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCapabilityRepository, "");
        this.getHighSpeedVideoFpsRangesFor = productCapabilityRepository;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.lang.Boolean>> continuation) {
        return invoke2(productCapability, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.lang.Throwable, java.lang.Boolean>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.lang.Throwable, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase$invoke$1 checkProductCapabilityEnabledUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase$invoke$1) {
            checkProductCapabilityEnabledUseCase$invoke$1 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase$invoke$1) continuation;
            if ((checkProductCapabilityEnabledUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                checkProductCapabilityEnabledUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = checkProductCapabilityEnabledUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkProductCapabilityEnabledUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductCapabilityRepository productCapabilityRepository = this.getHighSpeedVideoFpsRangesFor;
                    checkProductCapabilityEnabledUseCase$invoke$1.getHighSpeedVideoFpsRanges = productCapability;
                    checkProductCapabilityEnabledUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = productCapabilityRepository.capabilities(false, checkProductCapabilityEnabledUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    productCapability = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability) checkProductCapabilityEnabledUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.util.List) ((arrow.core.Ior.Right) ior).getValue()).contains(productCapability)));
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                return new arrow.core.Ior.Both(both.getLeftValue(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.util.List) both.getRightValue()).contains(productCapability)));
            }
        }
        checkProductCapabilityEnabledUseCase$invoke$1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CheckProductCapabilityEnabledUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = checkProductCapabilityEnabledUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkProductCapabilityEnabledUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
