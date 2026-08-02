package com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u0013\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0017\u0010\u0011\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/coordinator/CryptocurrencyProvisioningCoordinator;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "checkCryptoProvisioningUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;)V", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/subscriptions/FlowCapability;", "flowCapabilities", "Lkotlin/Function1;", "", "", "onLoading", "Lkotlin/Function0;", "onProceed", "", "Lkotlin/ParameterName;", "onProvisioning", "onError", "checkProvisioningAndExecute", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptocurrencyProvisioningCoordinator {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CryptocurrencyProvisioningCoordinator(com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCryptoProvisioningUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = checkCryptoProvisioningUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkProvisioningAndExecute(java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> list, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1 cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1;
        int i;
        java.util.Iterator it;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1) {
            cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1 = (com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1) continuation;
            if ((cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj3 = cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoFpsRangesFor = function0;
                    cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizes = function12;
                    cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.Camera2StreamConfigurationMap = function02;
                    cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizesFor = 1;
                    obj3 = checkCryptoProvisioningUseCase.invoke(list, cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function02 = (kotlin.jvm.functions.Function0) cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.Camera2StreamConfigurationMap;
                    function12 = (kotlin.jvm.functions.Function1) cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizes;
                    function0 = (kotlin.jvm.functions.Function0) cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoFpsRangesFor;
                    function1 = (kotlin.jvm.functions.Function1) cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj3);
                }
                java.util.Map map = (java.util.Map) obj3;
                function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                it = map.values().iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) obj2) instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.Error) {
                        break;
                    }
                }
                if (((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) obj2) == null) {
                    function02.invoke();
                    return kotlin.Unit.INSTANCE;
                }
                java.util.Iterator it2 = map.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it2.next();
                    if (((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) next) instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) {
                        obj = next;
                        break;
                    }
                }
                com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult provisioningCheckResult = (com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) obj;
                if (provisioningCheckResult != null && (provisioningCheckResult instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning)) {
                    function12.invoke(((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ShowProvisioning) provisioningCheckResult).getCapability().getIntent());
                    return kotlin.Unit.INSTANCE;
                }
                function0.invoke();
                return kotlin.Unit.INSTANCE;
            }
        }
        cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1 = new com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1(this, continuation);
        java.lang.Object obj32 = cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        java.util.Map map2 = (java.util.Map) obj32;
        function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        it = map2.values().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
            }
        }
        if (((com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult) obj2) == null) {
        }
    }
}
