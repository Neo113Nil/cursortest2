package com.paypal.oslo.feature.consumerprivacy.data.provider;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/provider/AccountVisibilityLabelProviderImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityLabelUseCase;", "getAccountVisibilityLabelUseCase", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityLabelUseCase;)V", "", "isAccountDiscoverable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetAccountVisibilityLabelUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountVisibilityLabelProviderImpl implements com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AccountVisibilityLabelProviderImpl(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase getAccountVisibilityLabelUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountVisibilityLabelUseCase, "");
        this.getHighSpeedVideoFpsRanges = getAccountVisibilityLabelUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isAccountDiscoverable(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1 accountVisibilityLabelProviderImpl$isAccountDiscoverable$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1) {
            accountVisibilityLabelProviderImpl$isAccountDiscoverable$1 = (com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1) continuation;
            if ((accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetAccountVisibilityLabelUseCase getAccountVisibilityLabelUseCase = this.getHighSpeedVideoFpsRanges;
                    accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getAccountVisibilityLabelUseCase.invoke(accountVisibilityLabelProviderImpl$isAccountDiscoverable$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return null;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return ((com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData) ((arrow.core.Ior.Right) ior).getValue()).getAllowDiscoverability();
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return ((com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityLabelData) both.getRightValue()).getAllowDiscoverability();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        accountVisibilityLabelProviderImpl$isAccountDiscoverable$1 = new com.paypal.oslo.feature.consumerprivacy.data.provider.AccountVisibilityLabelProviderImpl$isAccountDiscoverable$1(this, continuation);
        java.lang.Object obj2 = accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = accountVisibilityLabelProviderImpl$isAccountDiscoverable$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
