package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001HB;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010#¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00106R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010;R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0<8\u0007¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010BR\"\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100C8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "paymentRequest", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ZettleDeviceCompatibilityUseCase;", "compatibleUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/CreateZettleIntentUseCase;", "createPaymentUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ProcessZettleResultUseCase;", "processResultUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/CreatePurchaseUseCase;", "createPurchaseUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/UpdatePurchaseUseCase;", "updatePurchaseUseCase", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ZettleDeviceCompatibilityUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/CreateZettleIntentUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ProcessZettleResultUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/CreatePurchaseUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/UpdatePurchaseUseCase;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "type", "", "setFailure", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;)V", "createPurchase$business_pay_and_get_paid_prodRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;", "paymentPayload", "updatePurchase", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/TapToPayPayload;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", "amount", "", "referenceID", "Larrow/core/Either;", "", "Landroid/content/Intent;", "createZettleIntent", "(Landroid/content/Context;JLjava/lang/String;)Larrow/core/Either;", "", "resultCode", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResult", "(ILandroid/content/Intent;)V", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ZettleDeviceCompatibilityUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/CreateZettleIntentUseCase;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/usecase/ProcessZettleResultUseCase;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/CreatePurchaseUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/UpdatePurchaseUseCase;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressUiEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "failureState", "Lkotlinx/coroutines/flow/StateFlow;", "getFailureState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TapToPayProgressViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType> getInputFormats;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> effects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType> failureState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.CreateZettleIntentUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ProcessZettleResultUseCase getHighSpeedVideoFpsRangesFor;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;", "paymentRequest", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressViewModel;", "create", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/PaymentRequest;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/taptopay/TapToPayProgressViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest);
    }

    @dagger.assisted.AssistedInject
    public TapToPayProgressViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ZettleDeviceCompatibilityUseCase zettleDeviceCompatibilityUseCase, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.CreateZettleIntentUseCase createZettleIntentUseCase, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.usecase.ProcessZettleResultUseCase processZettleResultUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase createPurchaseUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase updatePurchaseUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleDeviceCompatibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createZettleIntentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processZettleResultUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createPurchaseUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePurchaseUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentRequest;
        this.getHighSpeedVideoSizes = zettleDeviceCompatibilityUseCase;
        this.Camera2StreamConfigurationMap = createZettleIntentUseCase;
        this.getHighSpeedVideoFpsRangesFor = processZettleResultUseCase;
        this.getHighSpeedVideoFpsRanges = createPurchaseUseCase;
        this.getHighSpeedVideoSizesFor = updatePurchaseUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getInputFormats = MutableStateFlow;
        this.failureState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> getEffects() {
        return this.effects;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType> getFailureState() {
        return this.failureState;
    }

    public final void setFailure(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType type) {
        this.getInputFormats.setValue(type);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (r3.emit(r9, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        if (r15.emit(r2, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        if (r15 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPurchase$business_pay_and_get_paid_prodRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$createPurchase$1 tapToPayProgressViewModel$createPurchase$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$createPurchase$1) {
            tapToPayProgressViewModel$createPurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$createPurchase$1) continuation;
            if ((tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration;
                int i2 = 2;
                java.lang.String str = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                java.lang.Object[] objArr3 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.toLongAmount$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null) <= 0) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Create purchase failed: Amount must be greater than zero", null, null, 6, null);
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> mutableSharedFlow = this.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure onFailure = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.BELOW_MINIMUM, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
                        tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration = 1;
                    } else {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.CreatePurchaseUseCase createPurchaseUseCase = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest = this.getHighResolutionOutputSizeshNQ4ISI;
                        tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration = 2;
                        obj = createPurchaseUseCase.invoke(paymentRequest, tapToPayProgressViewModel$createPurchase$1);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either = (arrow.core.Either) obj;
                    if (either instanceof arrow.core.Either.Right) {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated purchaseCreated = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseCreated) ((arrow.core.Either.Right) either).getValue();
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> mutableSharedFlow2 = this.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK launchSDK = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.LaunchSDK(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.toLongAmount(purchaseCreated.getTotalAmount()), purchaseCreated.getPurchaseUuid());
                        tapToPayProgressViewModel$createPurchase$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(purchaseCreated);
                        tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRangesFor = 0;
                        tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRanges = 0;
                        tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration = 3;
                    } else if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError purchaseError = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError) ((arrow.core.Either.Left) either).getValue();
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Create purchase failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", purchaseError)), null, 4, null);
                        if (purchaseError instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.ValidationError) {
                            failureType = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE;
                        } else if (purchaseError instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.PermissionError) {
                            failureType = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE;
                        } else if (purchaseError instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NetworkError) {
                            failureType = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE;
                        } else if (purchaseError instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.ServerError) {
                            failureType = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE;
                        } else if (purchaseError instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.NotFoundError) {
                            failureType = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE;
                        } else {
                            if (!(purchaseError instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.PurchaseError.UnknownError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            failureType = com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE;
                        }
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> mutableSharedFlow3 = this.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure onFailure2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure(failureType, str, i2, objArr3 == true ? 1 : 0);
                        tapToPayProgressViewModel$createPurchase$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(purchaseError);
                        tapToPayProgressViewModel$createPurchase$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(failureType);
                        tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRangesFor = 0;
                        tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRanges = 0;
                        tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration = 4;
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    if (i == 3) {
                        int i3 = tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRanges;
                        int i4 = tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRangesFor;
                    } else {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRanges;
                        int i6 = tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoFpsRangesFor;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        tapToPayProgressViewModel$createPurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$createPurchase$1(this, continuation);
        java.lang.Object obj2 = tapToPayProgressViewModel$createPurchase$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapToPayProgressViewModel$createPurchase$1.getOutputMinFrameDuration;
        int i22 = 2;
        java.lang.String str2 = null;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr32 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x012f, code lost:
    
        if (r9.emit(r10, r2) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePurchase(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$updatePurchase$1 tapToPayProgressViewModel$updatePurchase$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData updatePurchaseData;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload tapToPayPayload2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$updatePurchase$1) {
            tapToPayProgressViewModel$updatePurchase$1 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$updatePurchase$1) continuation;
            if ((tapToPayProgressViewModel$updatePurchase$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                tapToPayProgressViewModel$updatePurchase$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = tapToPayProgressViewModel$updatePurchase$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapToPayProgressViewModel$updatePurchase$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    updatePurchaseData = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData(tapToPayPayload.getTransactionId(), tapToPayPayload.getReferenceId(), com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequestKt.asCurrency(tapToPayPayload.getAmount(), paymentRequest.getCurrencyCode()), paymentRequest.getCurrencyCode(), tapToPayPayload.getCardType(), tapToPayPayload.getCardPaymentEntryMode(), tapToPayPayload.getApplicationName(), tapToPayPayload.getApplicationIdentifier(), tapToPayPayload.getReferenceId());
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase updatePurchaseUseCase = this.getHighSpeedVideoSizesFor;
                    java.lang.String originalPurchaseUuid = updatePurchaseData.getOriginalPurchaseUuid();
                    tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoFpsRangesFor = tapToPayPayload;
                    tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoFpsRanges = paymentRequest;
                    tapToPayProgressViewModel$updatePurchase$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePurchaseData);
                    tapToPayProgressViewModel$updatePurchase$1.getOutputStallDurationlomOqCM = 1;
                    obj = updatePurchaseUseCase.invoke(originalPurchaseUuid, updatePurchaseData, tapToPayProgressViewModel$updatePurchase$1);
                    if (obj != coroutine_suspended) {
                        tapToPayPayload2 = tapToPayPayload;
                        paymentRequest2 = paymentRequest;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = tapToPayProgressViewModel$updatePurchase$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoSizes;
                    int i4 = tapToPayProgressViewModel$updatePurchase$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                updatePurchaseData = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.UpdatePurchaseData) tapToPayProgressViewModel$updatePurchase$1.getInputFormats;
                paymentRequest2 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest) tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoFpsRanges;
                tapToPayPayload2 = (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.TapToPayPayload) tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (either.isLeft()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Update purchase failed, we will ignore this since it will be handled by backend", null, null, 6, null);
                }
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Update purchase succeeded!", null, null, 6, null);
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect> mutableSharedFlow = this.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess onSuccess = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnSuccess(paymentRequest2, tapToPayPayload2);
                    tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tapToPayPayload2);
                    tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequest2);
                    tapToPayProgressViewModel$updatePurchase$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePurchaseData);
                    tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    tapToPayProgressViewModel$updatePurchase$1.getOutputFormats = either;
                    tapToPayProgressViewModel$updatePurchase$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    tapToPayProgressViewModel$updatePurchase$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    tapToPayProgressViewModel$updatePurchase$1.Camera2StreamConfigurationMap = 0;
                    tapToPayProgressViewModel$updatePurchase$1.getHighSpeedVideoSizes = 0;
                    tapToPayProgressViewModel$updatePurchase$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    tapToPayProgressViewModel$updatePurchase$1.getOutputStallDurationlomOqCM = 2;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        tapToPayProgressViewModel$updatePurchase$1 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$updatePurchase$1(this, continuation);
        java.lang.Object obj2 = tapToPayProgressViewModel$updatePurchase$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapToPayProgressViewModel$updatePurchase$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        if (either.isRight()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void handleResult(int resultCode, android.content.Intent data) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$handleResult$1(this.getHighSpeedVideoFpsRangesFor.invoke(resultCode, data), this, null), 3, null);
    }

    public final arrow.core.Either<java.lang.Throwable, android.content.Intent> createZettleIntent(android.content.Context context, long amount, java.lang.String referenceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceID, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult invoke = this.getHighSpeedVideoSizes.invoke(context);
            if (invoke instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible) {
                android.content.Intent intent = (android.content.Intent) defaultRaise2.bind(this.Camera2StreamConfigurationMap.invoke(context, amount, referenceID));
                defaultRaise.complete();
                return new arrow.core.Either.Right(intent);
            }
            if (!(invoke instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            defaultRaise2.raise(new java.lang.IllegalStateException("Device is not compatible with Tap to Pay SDK"));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
