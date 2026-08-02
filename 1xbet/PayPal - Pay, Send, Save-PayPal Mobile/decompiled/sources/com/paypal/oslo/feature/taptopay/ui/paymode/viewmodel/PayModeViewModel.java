package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020 H\u0000¢\u0006\u0004\b+\u0010,J \u0010%\u001a\u0004\u0018\u00010.2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020.0-H\u0082@¢\u0006\u0004\b%\u0010/J\u0010\u00100\u001a\u00020 H\u0082@¢\u0006\u0004\b0\u00101J\u0019\u00100\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b0\u0010&J\u000f\u00100\u001a\u00020 H\u0002¢\u0006\u0004\b0\u0010,J\u0018\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u000202H\u0082@¢\u0006\u0004\b%\u00103J\u000f\u00104\u001a\u00020 H\u0002¢\u0006\u0004\b4\u0010,J\r\u00105\u001a\u00020'¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020 H\u0014¢\u0006\u0004\b7\u0010,R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u00104\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u00108\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010FR\u0014\u0010J\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010B\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010M\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010D\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010TR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010WR\u001f\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010V0X8\u0007¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010_R \u0010a\u001a\b\u0012\u0004\u0012\u00020^0`8\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010eR\u0016\u0010=\u001a\u00020g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010h\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010jR\u0018\u0010R\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010lR\u0018\u0010@\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010lR\u0014\u0010:\u001a\u00020m8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010nR\u0013\u0010q\u001a\u0004\u0018\u00010.8G¢\u0006\u0006\u001a\u0004\bo\u0010p"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/viewmodel/PayModeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "getAllCardsUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;", "setDefaultCardUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalObservePaymentUseCase;", "observePaymentUseCase", "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "networkConnectivityChecker", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;", "isDefaultPaymentAppUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsForegroundSettingEnabledUseCase;", "isForegroundSettingEnabledUseCase", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter;", "cardPrioritySorter", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;", "isDeviceCompromisedUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/HandleDeviceCompromisedUseCase;", "handleDeviceCompromisedUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;", "isDeviceScreenLockEnabledUseCase", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcEnabledUseCase;", "isNfcEnabledUseCase", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "payLaterExpiryChecker", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalObservePaymentUseCase;Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsForegroundSettingEnabledUseCase;Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/HandleDeviceCompromisedUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcEnabledUseCase;Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;", "intent", "", "onIntent", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeIntent;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)V", "", "success", "onReAuthResult", "(Z)V", "onPaymentSuccessAnimationComplete$taptopay_prodRelease", "()V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentErrorCode;", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentErrorCode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "isNfcEnabled", "()Z", "onCleared", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "coroutineBoundary", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalSetDefaultCardUseCase;", "getHighSpeedVideoFpsRangesFor", "isOutputSupportedFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalObservePaymentUseCase;", "getHighSpeedVideoFpsRanges", "getValidOutputFormatsForInputhNQ4ISI", "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/paypal/PayPalIsDefaultPaymentAppUseCase;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/payment/IsForegroundSettingEnabledUseCase;", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter;", "getOutputFormats", "getOutputSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceCompromisedUseCase;", "getOutputMinFrameDuration", "getInputFormats", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/HandleDeviceCompromisedUseCase;", "getOutputStallDuration", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsDeviceScreenLockEnabledUseCase;", "getInputSizeshNQ4ISI", "getOutputMinFrameDurationlomOqCM", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/device/IsNfcEnabledUseCase;", "toString", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeDataState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PayModeEvents;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "Ljava/util/List;", "unwrapAs", "", "isOutputSupportedForhNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "getSelectedCard", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "selectedCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayModeViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex coroutineBoundary;

    /* renamed from: coroutineBoundary, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> getOutputSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> unwrapAs;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard isOutputSupportedForhNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase getOutputStallDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase getOutputMinFrameDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase getInputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker getHighSpeedVideoSizes;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private int isOutputSupportedFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> state;

    /* renamed from: toString, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker getOutputStallDuration;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private kotlinx.coroutines.Job toString;

    @javax.inject.Inject
    public PayModeViewModel(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSetDefaultCardUseCase payPalSetDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase payPalObservePaymentUseCase, com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase isForegroundSettingEnabledUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter cardPrioritySorter, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceCompromisedUseCase isDeviceCompromisedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase handleDeviceCompromisedUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsDeviceScreenLockEnabledUseCase isDeviceScreenLockEnabledUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.device.IsNfcEnabledUseCase isNfcEnabledUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetAllCardsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalSetDefaultCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalObservePaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConnectivityChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalIsDefaultPaymentAppUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isForegroundSettingEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPrioritySorter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDeviceCompromisedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleDeviceCompromisedUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isDeviceScreenLockEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isNfcEnabledUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterExpiryChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = payPalGetAllCardsUseCase;
        this.getHighSpeedVideoFpsRangesFor = payPalSetDefaultCardUseCase;
        this.getHighSpeedVideoFpsRanges = payPalObservePaymentUseCase;
        this.getHighSpeedVideoSizes = networkConnectivityChecker;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalIsDefaultPaymentAppUseCase;
        this.getHighSpeedVideoSizesFor = isForegroundSettingEnabledUseCase;
        this.getOutputFormats = cardPrioritySorter;
        this.getOutputMinFrameDuration = isDeviceCompromisedUseCase;
        this.getInputFormats = handleDeviceCompromisedUseCase;
        this.getInputSizeshNQ4ISI = isDeviceScreenLockEnabledUseCase;
        this.getOutputStallDurationlomOqCM = isNfcEnabledUseCase;
        this.getOutputStallDuration = payLaterExpiryChecker;
        this.getOutputSizeshNQ4ISI = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getOutputSizes = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.getOutputMinFrameDurationlomOqCM = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.unwrapAs = kotlin.collections.CollectionsKt.emptyList();
        this.isOutputSupportedFor = -1;
        this.coroutineBoundary = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        if (r6 != r3) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleCardsLoaded(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, java.util.List list, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$handleCardsLoaded$1 payModeViewModel$handleCardsLoaded$1;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState2;
        java.util.List list2;
        java.lang.Object Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$handleCardsLoaded$1) {
            payModeViewModel$handleCardsLoaded$1 = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$handleCardsLoaded$1) continuation;
            if ((payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payModeViewModel$handleCardsLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    paymentState2 = paymentState;
                    payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoSizes = paymentState2;
                    payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRangesFor = 1;
                    list2 = list;
                    Camera2StreamConfigurationMap = payModeViewModel.Camera2StreamConfigurationMap((java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>) list2, payModeViewModel$handleCardsLoaded$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) payModeViewModel$handleCardsLoaded$1.Camera2StreamConfigurationMap;
                        paymentState3 = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        payPalDigitizedCard2 = payPalDigitizedCard3;
                        payModeViewModel.getOutputSizes.setValue(new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState.INSTANCE, payModeViewModel.unwrapAs, payPalDigitizedCard2, payModeViewModel.isOutputSupportedFor, null, null, null, 64, null));
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                        int size = payModeViewModel.unwrapAs.size();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayMode ready with ");
                        sb.append(size);
                        sb.append(" cards");
                        com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                        if (paymentState3 != null) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auto-starting payment observation with initial state: ".concat(java.lang.String.valueOf(paymentState3.toLogString())), null, null, 6, null);
                            payModeViewModel.getHighSpeedVideoSizes(paymentState3);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState4 = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoSizes;
                    java.util.List list3 = (java.util.List) payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    Camera2StreamConfigurationMap = obj;
                    paymentState2 = paymentState4;
                    list2 = list3;
                }
                payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) Camera2StreamConfigurationMap;
                if (payPalDigitizedCard != null) {
                    payModeViewModel.isOutputSupportedForhNQ4ISI = payPalDigitizedCard;
                    java.util.Iterator<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> it = payModeViewModel.unwrapAs.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getDigitizedCard().getCardId(), payPalDigitizedCard.getDigitizedCard().getCardId())) {
                            break;
                        }
                        i2++;
                    }
                    payModeViewModel.isOutputSupportedFor = i2;
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    int i3 = payModeViewModel.isOutputSupportedFor;
                    java.lang.String cardId = payPalDigitizedCard.getDigitizedCard().getCardId();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Selected card index: ");
                    sb2.append(i3);
                    sb2.append(" for default card: ");
                    sb2.append(cardId);
                    com.paypal.android.logger.Logger.d$default(logger2, sb2.toString(), null, null, 6, null);
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> mutableSharedFlow = payModeViewModel.getOutputMinFrameDurationlomOqCM;
                    com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.RenderUiEvent renderUiEvent = com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.RenderUiEvent.INSTANCE;
                    payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoSizes = paymentState2;
                    payModeViewModel$handleCardsLoaded$1.Camera2StreamConfigurationMap = payPalDigitizedCard;
                    payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRangesFor = 2;
                    if (mutableSharedFlow.emit(renderUiEvent, payModeViewModel$handleCardsLoaded$1) != coroutine_suspended) {
                        paymentState3 = paymentState2;
                        payPalDigitizedCard2 = payPalDigitizedCard;
                        payModeViewModel.getOutputSizes.setValue(new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState.INSTANCE, payModeViewModel.unwrapAs, payPalDigitizedCard2, payModeViewModel.isOutputSupportedFor, null, null, null, 64, null));
                        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                        int size2 = payModeViewModel.unwrapAs.size();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("PayMode ready with ");
                        sb3.append(size2);
                        sb3.append(" cards");
                        com.paypal.android.logger.Logger.d$default(logger3, sb3.toString(), null, null, 6, null);
                        if (paymentState3 != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        payModeViewModel$handleCardsLoaded$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$handleCardsLoaded$1(payModeViewModel, continuation);
        java.lang.Object obj2 = payModeViewModel$handleCardsLoaded$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payModeViewModel$handleCardsLoaded$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) Camera2StreamConfigurationMap;
        if (payPalDigitizedCard != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        if (r12.emit(r13, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r12.emit(r13, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r13.invoke(r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        if (r12.emit(r3, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        if (r12.emit(r3, r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        if (r13 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$performDeviceValidation(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$1 payModeViewModel$performDeviceValidation$1;
        boolean booleanValue;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$1) {
            payModeViewModel$performDeviceValidation$1 = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$1) continuation;
            if ((payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = payModeViewModel.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$showSecondarySettings$1 payModeViewModel$performDeviceValidation$showSecondarySettings$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$showSecondarySettings$1(payModeViewModel, null);
                        payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, payModeViewModel$performDeviceValidation$showSecondarySettings$1, payModeViewModel$performDeviceValidation$1);
                        break;
                    case 1:
                        kotlin.ResultKt.throwOnFailure(obj);
                        booleanValue = ((java.lang.Boolean) obj).booleanValue();
                        if (booleanValue) {
                            kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> mutableSharedFlow = payModeViewModel.getOutputMinFrameDurationlomOqCM;
                            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToNfcSettingsPromptEvent navigateToNfcSettingsPromptEvent = com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToNfcSettingsPromptEvent.INSTANCE;
                            payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes = booleanValue;
                            payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor = 2;
                            break;
                        } else if (payModeViewModel.getOutputMinFrameDuration.invoke()) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device compromised detected, purging device data and dismissing pay mode", null, null, 6, null);
                            com.paypal.oslo.feature.taptopay.domain.usecase.device.HandleDeviceCompromisedUseCase handleDeviceCompromisedUseCase = payModeViewModel.getInputFormats;
                            payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes = booleanValue;
                            payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor = 3;
                            break;
                        } else {
                            boolean invoke = payModeViewModel.getInputSizeshNQ4ISI.invoke();
                            if (!invoke) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device screen lock is not enabled", null, null, 6, null);
                                kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> mutableSharedFlow2 = payModeViewModel.getOutputMinFrameDurationlomOqCM;
                                com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToRequireScreenLockEvent navigateToRequireScreenLockEvent = com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToRequireScreenLockEvent.INSTANCE;
                                payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes = booleanValue;
                                payModeViewModel$performDeviceValidation$1.getHighResolutionOutputSizeshNQ4ISI = invoke;
                                payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor = 5;
                                break;
                            } else {
                                boolean isNfcEnabled = payModeViewModel.isNfcEnabled();
                                if (!isNfcEnabled) {
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "NFC is disabled, navigating to NFC settings", null, null, 6, null);
                                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> mutableSharedFlow3 = payModeViewModel.getOutputMinFrameDurationlomOqCM;
                                    com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToEnableNfcPromptEvent navigateToEnableNfcPromptEvent = com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToEnableNfcPromptEvent.INSTANCE;
                                    payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes = booleanValue;
                                    payModeViewModel$performDeviceValidation$1.getHighResolutionOutputSizeshNQ4ISI = invoke;
                                    payModeViewModel$performDeviceValidation$1.Camera2StreamConfigurationMap = isNfcEnabled;
                                    payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor = 6;
                                    break;
                                } else {
                                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 2:
                        boolean z = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    case 3:
                        booleanValue = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> mutableSharedFlow4 = payModeViewModel.getOutputMinFrameDurationlomOqCM;
                        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DeviceCompromisedEvent deviceCompromisedEvent = com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DeviceCompromisedEvent.INSTANCE;
                        payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes = booleanValue;
                        payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor = 4;
                        break;
                    case 4:
                        boolean z2 = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    case 5:
                        boolean z3 = payModeViewModel$performDeviceValidation$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z4 = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    case 6:
                        boolean z5 = payModeViewModel$performDeviceValidation$1.Camera2StreamConfigurationMap;
                        boolean z6 = payModeViewModel$performDeviceValidation$1.getHighResolutionOutputSizeshNQ4ISI;
                        boolean z7 = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        payModeViewModel$performDeviceValidation$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$1(payModeViewModel, continuation);
        java.lang.Object obj2 = payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (payModeViewModel$performDeviceValidation$1.getHighSpeedVideoFpsRangesFor) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> getEvents() {
        return this.events;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard getSelectedCard() {
        int i = this.isOutputSupportedFor;
        if (i < 0 || i >= this.unwrapAs.size()) {
            return null;
        }
        return this.unwrapAs.get(this.isOutputSupportedFor);
    }

    public final void onIntent(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent intent) {
        kotlinx.coroutines.Job launch$default;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards) {
            Camera2StreamConfigurationMap(((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.LoadCards) intent).getInitialPaymentState());
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.RetryLoadCards) {
            Camera2StreamConfigurationMap(null);
            return;
        }
        if (!(intent instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard)) {
            if (intent instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments) {
                getHighSpeedVideoSizes(((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ObservePayments) intent).getInitialPaymentState());
                return;
            } else if (intent instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.CancelObservePayments) {
                getHighSpeedVideoSizes();
                return;
            } else {
                if (!(intent instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.ResetToDefaultState)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
        }
        int cardIndex = ((com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeIntent.SelectCard) intent).getCardIndex();
        if (cardIndex >= 0 && cardIndex < this.unwrapAs.size()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Selecting card at index: ".concat(java.lang.String.valueOf(cardIndex)), null, null, 6, null);
            this.isOutputSupportedFor = cardIndex;
            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value = this.getOutputSizes.getValue();
            if (value == null) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Cannot select card - state not initialized", null, null, 6, null);
                return;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = this.unwrapAs.get(cardIndex);
            this.getOutputSizes.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, null, null, payPalDigitizedCard, cardIndex, null, null, null, 115, null));
            java.lang.String cardId = payPalDigitizedCard.getDigitizedCard().getCardId();
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 = this.isOutputSupportedForhNQ4ISI;
            if (kotlin.jvm.internal.Intrinsics.areEqual(cardId, (payPalDigitizedCard2 == null || (digitizedCard = payPalDigitizedCard2.getDigitizedCard()) == null) ? null : digitizedCard.getCardId())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card is already the default, skipping SDK call", null, null, 6, null);
                return;
            }
            com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard3 = this.isOutputSupportedForhNQ4ISI;
            this.isOutputSupportedForhNQ4ISI = payPalDigitizedCard;
            getHighSpeedVideoSizes();
            kotlinx.coroutines.Job job = this.getValidOutputFormatsForInputhNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1(this, payPalDigitizedCard, payPalDigitizedCard3, null), 3, null);
            this.getValidOutputFormatsForInputhNQ4ISI = launch$default;
            return;
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        int size = this.unwrapAs.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid card index: ");
        sb.append(cardIndex);
        sb.append(" (total cards: ");
        sb.append(size);
        sb.append(")");
        com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
    }

    private final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState p0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Loading provisioned cards, initialPaymentState: ".concat(java.lang.String.valueOf(p0)), null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$loadProvisionedCards$1(this, p0, null), 3, null);
    }

    public final void onReAuthResult(boolean success) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$onReAuthResult$1(success, this, null), 3, null);
    }

    public final void onPaymentSuccessAnimationComplete$taptopay_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$onPaymentSuccessAnimationComplete$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$validateAndGetDefaultCard$1 payModeViewModel$validateAndGetDefaultCard$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$validateAndGetDefaultCard$1) {
            payModeViewModel$validateAndGetDefaultCard$1 = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$validateAndGetDefaultCard$1) continuation;
            if ((payModeViewModel$validateAndGetDefaultCard$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                payModeViewModel$validateAndGetDefaultCard$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = payModeViewModel$validateAndGetDefaultCard$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payModeViewModel$validateAndGetDefaultCard$1.getInputSizeshNQ4ISI;
                java.lang.Object obj2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> filterActivePayPal = com.paypal.oslo.feature.taptopay.ui.setup.flow.model.CardExtensionsKt.filterActivePayPal(list, this.getOutputStallDuration);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    int size = filterActivePayPal.size();
                    int size2 = list.size();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Found ");
                    sb.append(size);
                    sb.append(" active cards out of ");
                    sb.append(size2);
                    sb.append(" total");
                    com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                    if (filterActivePayPal.isEmpty()) {
                        payModeViewModel$validateAndGetDefaultCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        payModeViewModel$validateAndGetDefaultCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(filterActivePayPal);
                        payModeViewModel$validateAndGetDefaultCard$1.getInputSizeshNQ4ISI = 1;
                        if (getHighSpeedVideoSizes(payModeViewModel$validateAndGetDefaultCard$1) != coroutine_suspended) {
                        }
                    } else {
                        this.unwrapAs = filterActivePayPal;
                        java.util.Iterator<T> it = filterActivePayPal.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) next).getDigitizedCard().isDefault()) {
                                obj2 = next;
                                break;
                            }
                        }
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) obj2;
                        if (payPalDigitizedCard == null) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No default card found in active cards", null, null, 6, null);
                            kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents> mutableSharedFlow = this.getOutputMinFrameDurationlomOqCM;
                            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent errorEvent = new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent("NO_DEFAULT_CARD", "No default cards found");
                            payModeViewModel$validateAndGetDefaultCard$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                            payModeViewModel$validateAndGetDefaultCard$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(filterActivePayPal);
                            payModeViewModel$validateAndGetDefaultCard$1.getHighSpeedVideoSizes = obj2;
                            payModeViewModel$validateAndGetDefaultCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalDigitizedCard);
                            payModeViewModel$validateAndGetDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            payModeViewModel$validateAndGetDefaultCard$1.getInputSizeshNQ4ISI = 2;
                            if (mutableSharedFlow.emit(errorEvent, payModeViewModel$validateAndGetDefaultCard$1) == coroutine_suspended) {
                            }
                        }
                        return obj2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = payModeViewModel$validateAndGetDefaultCard$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = payModeViewModel$validateAndGetDefaultCard$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj3;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return null;
            }
        }
        payModeViewModel$validateAndGetDefaultCard$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$validateAndGetDefaultCard$1(this, continuation);
        java.lang.Object obj4 = payModeViewModel$validateAndGetDefaultCard$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payModeViewModel$validateAndGetDefaultCard$1.getInputSizeshNQ4ISI;
        java.lang.Object obj22 = null;
        if (i != 0) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.getHighSpeedVideoSizes.isConnected()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No active cards found, device is online - navigating to setup", null, null, 6, null);
            java.lang.Object emit = this.getOutputMinFrameDurationlomOqCM.emit(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NoActiveCardsFound.INSTANCE, continuation);
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No active cards found, device is offline - contactless unavailable", null, null, 6, null);
        java.lang.Object emit2 = this.getOutputMinFrameDurationlomOqCM.emit(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ContactlessUnavailableEvent.INSTANCE, continuation);
        return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoSizes() {
        kotlinx.coroutines.Job job = this.toString;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.toString = null;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Cancelled payment observation", null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode paymentErrorCode, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int i = com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.WhenMappings.$EnumSwitchMapping$0[paymentErrorCode.ordinal()];
        if (i == 1) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card out of payment keys", null, null, 6, null);
            getHighResolutionOutputSizeshNQ4ISI();
            java.lang.Object emit = this.getOutputMinFrameDurationlomOqCM.emit(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NavigateToLimitReachedEvent.INSTANCE, continuation);
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
        }
        if (i == 2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "POS communication disconnected", null, null, 6, null);
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> mutableStateFlow = this.getOutputSizes;
            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value = mutableStateFlow.getValue();
            mutableStateFlow.setValue(value != null ? com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.TransactionInterruptedErrorState.INSTANCE, null, null, 0, null, null, null, 126, null) : null);
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Transaction error: ".concat(java.lang.String.valueOf(paymentErrorCode)), null, null, null, 14, null);
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object emit2 = this.getOutputMinFrameDurationlomOqCM.emit(new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent(paymentErrorCode.name(), "Transaction failed: ".concat(java.lang.String.valueOf(paymentErrorCode))), continuation);
        return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Resetting to default card state", null, null, 6, null);
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value = this.getOutputSizes.getValue();
        if (value == null) {
            return;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = this.isOutputSupportedForhNQ4ISI;
        if (payPalDigitizedCard != null) {
            java.util.Iterator<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> it = this.unwrapAs.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getDigitizedCard().getCardId(), payPalDigitizedCard.getDigitizedCard().getCardId())) {
                    break;
                } else {
                    i++;
                }
            }
            this.isOutputSupportedFor = i;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> mutableStateFlow = this.getOutputSizes;
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState defaultCardState = com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState.INSTANCE;
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.DefaultCardState defaultCardState2 = defaultCardState;
        mutableStateFlow.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, defaultCardState2, null, this.isOutputSupportedForhNQ4ISI, this.isOutputSupportedFor, null, null, null, 66, null));
    }

    public final boolean isNfcEnabled() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Checking NFC status", null, null, 6, null);
        boolean invoke = this.getOutputStallDurationlomOqCM.invoke();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "NFC enabled: ".concat(java.lang.String.valueOf(invoke)), null, null, 6, null);
        return invoke;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        getHighSpeedVideoSizes();
    }

    public static final /* synthetic */ java.lang.Object access$handleCardLoadError(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError payPalGetAllCardsError, kotlin.coroutines.Continuation continuation) {
        if (!(payPalGetAllCardsError instanceof com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError.DefaultError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String debugMessage = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError.DefaultError) payPalGetAllCardsError).getDebugMessage();
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Card load error: ".concat(java.lang.String.valueOf(debugMessage)), null, null, null, 14, null);
        java.lang.Object emit = payModeViewModel.getOutputMinFrameDurationlomOqCM.emit(new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorCardsNotLoadedEvent(debugMessage), continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$handlePaymentStateChange(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value = payModeViewModel.getOutputSizes.getValue();
        if (value == null) {
            return kotlin.Unit.INSTANCE;
        }
        if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionStarted) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Transaction started - updating to READY_FOR_PAYMENT_STATE", null, null, 6, null);
            payModeViewModel.getOutputSizes.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForPaymentState.INSTANCE, null, null, 0, null, null, null, 126, null));
        } else if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "First tap completed", null, null, 6, null);
        } else {
            if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Authentication required", null, null, 6, null);
                payModeViewModel.getOutputSizes.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, null, null, null, 0, null, null, (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired) paymentState, 63, null));
                java.lang.Object emit = payModeViewModel.getOutputMinFrameDurationlomOqCM.emit(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.PromptReAuthEvent.INSTANCE, continuation);
                return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
            }
            if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Ready for second tap - updating to READY_FOR_SECOND_TAP", null, null, 6, null);
                payModeViewModel.getOutputSizes.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.ReadyForSecondTap.INSTANCE, null, null, 0, null, null, null, 126, null));
            } else if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Transaction completed successfully", null, null, 6, null);
                payModeViewModel.getOutputSizes.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.PaymentSuccessState.INSTANCE, null, null, 0, ((com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.TransactionCompleted) paymentState).getTransactionContext(), null, null, 110, null));
            } else if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted transactionInterrupted = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted) paymentState;
                int transactionInterruptedCode = transactionInterrupted.getTransactionInterruptedCode();
                java.lang.String transactionInterruptedMessage = transactionInterrupted.getTransactionInterruptedMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction interrupted: code=");
                sb.append(transactionInterruptedCode);
                sb.append(", message=");
                sb.append(transactionInterruptedMessage);
                com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
                payModeViewModel.getOutputSizes.setValue(com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeUiState.TransactionInterruptedErrorState.INSTANCE, null, null, 0, null, transactionInterrupted, null, 94, null));
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Transaction interrupted — re-arming NFC immediately", null, null, 6, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(payModeViewModel), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$handlePaymentStateChange$2(payModeViewModel, null), 3, null);
            } else {
                if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) {
                    com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionError transactionError = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionError) paymentState;
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Transaction error: ".concat(java.lang.String.valueOf(transactionError.getPaymentErrorCode())), null, null, null, 14, null);
                    java.lang.Object Camera2StreamConfigurationMap = payModeViewModel.Camera2StreamConfigurationMap(transactionError.getPaymentErrorCode(), (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                    return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
                }
                if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.AuthenticationError) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Authentication error", null, null, null, 14, null);
                    payModeViewModel.getHighResolutionOutputSizeshNQ4ISI();
                } else {
                    if (paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.DefaultError) {
                        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.DefaultError defaultError = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.DefaultError) paymentState;
                        java.lang.Throwable throwable = defaultError.getThrowable();
                        if (throwable != null) {
                            com.paypal.oslo.feature.taptopay.LoggerKt.log.e("Default error: ".concat(java.lang.String.valueOf(defaultError.getDebugMessage())), throwable);
                        } else {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Default error: ".concat(java.lang.String.valueOf(defaultError.getDebugMessage())), null, null, null, 14, null);
                        }
                        payModeViewModel.getHighResolutionOutputSizeshNQ4ISI();
                        java.lang.Object emit2 = payModeViewModel.getOutputMinFrameDurationlomOqCM.emit(new com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.ErrorEvent("PAYMENT_ERROR", defaultError.getDebugMessage()), continuation);
                        return emit2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit2 : kotlin.Unit.INSTANCE;
                    }
                    if (!(paymentState instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.Idle)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payment state idle", null, null, 6, null);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$revertCardSelection(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard) {
        int i;
        payModeViewModel.isOutputSupportedForhNQ4ISI = payPalDigitizedCard;
        if (payPalDigitizedCard != null) {
            java.util.Iterator<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> it = payModeViewModel.unwrapAs.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getDigitizedCard().getCardId(), payPalDigitizedCard.getDigitizedCard().getCardId())) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            if (i == -1) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Revert card not found in current card list, falling back to first card", null, null, 6, null);
                payModeViewModel.isOutputSupportedFor = 0;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) payModeViewModel.unwrapAs);
                if (payPalDigitizedCard2 != null) {
                    payModeViewModel.isOutputSupportedForhNQ4ISI = payPalDigitizedCard2;
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> mutableStateFlow = payModeViewModel.getOutputSizes;
                    com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value = mutableStateFlow.getValue();
                    mutableStateFlow.setValue(value != null ? com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value, null, null, payPalDigitizedCard2, 0, null, null, null, 115, null) : null);
                    return;
                }
                return;
            }
            payModeViewModel.isOutputSupportedFor = i;
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState> mutableStateFlow2 = payModeViewModel.getOutputSizes;
            com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState value2 = mutableStateFlow2.getValue();
            mutableStateFlow2.setValue(value2 != null ? com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeDataState.copy$default(value2, null, null, payPalDigitizedCard, i, null, null, null, 115, null) : null);
        }
    }

    public static final /* synthetic */ boolean access$shouldShowSecondarySettings(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel) {
        boolean invoke = payModeViewModel.getHighResolutionOutputSizeshNQ4ISI.invoke();
        boolean invoke2 = payModeViewModel.getHighSpeedVideoSizesFor.invoke();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("isDefaultPaymentApp=");
        sb.append(invoke);
        sb.append(", isForegroundEnabled=");
        sb.append(invoke2);
        com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
        if (invoke || invoke2) {
            return false;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayPal is not default and foreground not enabled - showing secondary settings", null, null, 6, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState p0) {
        kotlinx.coroutines.Job launch$default;
        if (p0 != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$emitInitialState$1(this, p0, null), 3, null);
        }
        getHighSpeedVideoSizes();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting payment observation, initialState: ".concat(java.lang.String.valueOf(p0 != null ? p0.toLogString() : null)), null, null, 6, null);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$observePayments$2(this, null), 3, null);
        this.toString = launch$default;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.CARD_OUT_OF_PAYMENT_KEYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.POS_COMM_DISCONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
