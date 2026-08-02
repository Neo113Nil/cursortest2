package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001rBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J$\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00160$2\u0006\u0010#\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b&\u0010'J*\u0010*\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0$2\u0006\u0010#\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b*\u0010'J\u001f\u0010.\u001a\u00020-2\u0006\u0010#\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001a2\u0006\u0010#\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J/\u0010.\u001a\u0002072\u0006\u0010#\u001a\u0002002\u0006\u0010,\u001a\u00020+2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b.\u00108J/\u0010&\u001a\u0002072\u0006\u0010#\u001a\u0002002\u0006\u0010,\u001a\u00020+2\u0006\u00104\u001a\u0002092\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b&\u0010:J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010;J\u0017\u00101\u001a\u00020\u00162\u0006\u0010#\u001a\u00020<H\u0002¢\u0006\u0004\b1\u0010=J\u0019\u0010!\u001a\u00020>2\b\u0010#\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b!\u0010?J\u001b\u00101\u001a\u0004\u0018\u00010@2\b\u0010#\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b1\u0010AJ\u0017\u00101\u001a\u00020\u00162\u0006\u0010#\u001a\u00020BH\u0002¢\u0006\u0004\b1\u0010CR\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010FR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010IR\u0014\u0010.\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010G\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010D\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010PR\u0017\u0010R\u001a\u00020Q8\u0007¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020Q8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020+0X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010YR \u0010[\u001a\b\u0012\u0004\u0012\u00020+0Z8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010aR \u0010d\u001a\b\u0012\u0004\u0012\u00020`0c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020h8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010iR\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010p\u001a\u00020h2\u0006\u0010#\u001a\u00020h8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bp\u0010i\u001a\u0004\bp\u0010q"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadFundingInstrumentUseCase;", "getAutoReloadFundingInstrumentUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CreateAutoReloadUseCase;", "createAutoReloadUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/UpdateAutoReloadUseCase;", "updateAutoReloadUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetBalanceIdUseCase;", "getBalanceIdUseCase", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "getAccountTypeUseCase", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadFundingInstrumentUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CreateAutoReloadUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/UpdateAutoReloadUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetBalanceIdUseCase;Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "strategy", "", "currencyCode", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", "initialize", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "event", "handleIntent", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;)V", "getHighSpeedVideoFpsRanges", "()V", "p0", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;", "p1", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;)V", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;", "p2", "Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;", "p3", "Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$LowBalance;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;)Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy$Scheduled;Lcom/paypal/oslo/feature/balance/api/models/autoreload/AutoReloadChange;)Lcom/paypal/oslo/feature/balance/api/navigation/result/AutoReloadFlowNavResult;", "(Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;)V", "Ljava/time/LocalDate;", "(Ljava/time/LocalDate;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)Ljava/lang/String;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadFundingInstrumentUseCase;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CreateAutoReloadUseCase;", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/UpdateAutoReloadUseCase;", "getInputFormats", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetBalanceIdUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/balance/domain/usecase/GetAccountTypeUseCase;", "Lcom/paypal/oslo/feature/balance/manager/BalanceFeatureManager;", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addBankRequestId", "Ljava/lang/String;", "getAddBankRequestId-QDVFmTU", "()Ljava/lang/String;", "addCardRequestId", "getAddCardRequestId-QDVFmTU", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "", "Z", "getOutputStallDuration", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", "getFlowType", "()Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", "setFlowType", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;)V", "isBusinessAccount", "()Z", "InitialData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReviewViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String addBankRequestId;
    private final java.lang.String addCardRequestId;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect> effect;
    private com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType flowType;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.manager.BalanceFeatureManager getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getOutputStallDuration;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase getHighSpeedVideoSizes;
    private boolean isBusinessAccount;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> uiState;

    @javax.inject.Inject
    public ReviewViewModel(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase getAutoReloadFundingInstrumentUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase createAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase updateAutoReloadUseCase, com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase getBalanceIdUseCase, com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase, com.paypal.oslo.feature.balance.manager.BalanceFeatureManager balanceFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAutoReloadFundingInstrumentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAutoReloadUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutoReloadUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBalanceIdUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountTypeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceFeatureManager, "");
        this.getHighSpeedVideoFpsRangesFor = localeInformation;
        this.Camera2StreamConfigurationMap = dateTimeFormatUseCase;
        this.getHighSpeedVideoFpsRanges = getAutoReloadFundingInstrumentUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = createAutoReloadUseCase;
        this.getHighSpeedVideoSizes = updateAutoReloadUseCase;
        this.getOutputFormats = getBalanceIdUseCase;
        this.getHighSpeedVideoSizesFor = getAccountTypeUseCase;
        this.getInputSizeshNQ4ISI = balanceFeatureManager;
        this.addBankRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        this.addCardRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(null, null, null, null, null, null, null, null, false, null, null, null, false, false, null, null, null, 131071, null));
        this.getInputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.flowType = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.CREATE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$executeCreateFlow(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeCreateFlow$1 reviewViewModel$executeCreateFlow$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeCreateFlow$1) {
            reviewViewModel$executeCreateFlow$1 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeCreateFlow$1) continuation;
            if ((reviewViewModel$executeCreateFlow$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                reviewViewModel$executeCreateFlow$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = reviewViewModel$executeCreateFlow$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewViewModel$executeCreateFlow$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest highSpeedVideoSizes = getHighSpeedVideoSizes(reviewUiStateStore, reviewReloadStrategy);
                    com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase createAutoReloadUseCase = reviewViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    reviewViewModel$executeCreateFlow$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewUiStateStore);
                    reviewViewModel$executeCreateFlow$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewReloadStrategy);
                    reviewViewModel$executeCreateFlow$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoSizes);
                    reviewViewModel$executeCreateFlow$1.getHighSpeedVideoFpsRanges = 1;
                    obj = createAutoReloadUseCase.invoke(highSpeedVideoSizes, reviewViewModel$executeCreateFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    reviewViewModel.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse) ((arrow.core.Either.Right) either).getValue());
                } else if (either instanceof arrow.core.Either.Left) {
                    reviewViewModel.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadErrorMapperKt.toBalanceErrorBottomSheetEnum((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        reviewViewModel$executeCreateFlow$1 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeCreateFlow$1(reviewViewModel, continuation);
        java.lang.Object obj2 = reviewViewModel$executeCreateFlow$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewViewModel$executeCreateFlow$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$executeUpdateFlow(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeUpdateFlow$1 reviewViewModel$executeUpdateFlow$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeUpdateFlow$1) {
            reviewViewModel$executeUpdateFlow$1 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeUpdateFlow$1) continuation;
            if ((reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = reviewViewModel$executeUpdateFlow$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest highSpeedVideoSizes = getHighSpeedVideoSizes(reviewUiStateStore, reviewReloadStrategy);
                    com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest updateAutoReloadRequest = new com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest(highSpeedVideoSizes.getScheduleType(), highSpeedVideoSizes.getBalanceId(), highSpeedVideoSizes.getFinancialInstrumentId(), highSpeedVideoSizes.getAmount(), highSpeedVideoSizes.getThresholdAmount(), highSpeedVideoSizes.getRecurrence(), highSpeedVideoSizes.getStartDate(), null, 128, null);
                    com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase updateAutoReloadUseCase = reviewViewModel.getHighSpeedVideoSizes;
                    reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewUiStateStore);
                    reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewReloadStrategy);
                    reviewViewModel$executeUpdateFlow$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoSizes);
                    reviewViewModel$executeUpdateFlow$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateAutoReloadRequest);
                    reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = updateAutoReloadUseCase.invoke(updateAutoReloadRequest, reviewViewModel$executeUpdateFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    reviewViewModel.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse) ((arrow.core.Either.Right) either).getValue());
                } else if (either instanceof arrow.core.Either.Left) {
                    reviewViewModel.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadErrorMapperKt.toBalanceErrorBottomSheetEnum((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        reviewViewModel$executeUpdateFlow$1 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$executeUpdateFlow$1(reviewViewModel, continuation);
        java.lang.Object obj2 = reviewViewModel$executeUpdateFlow$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewViewModel$executeUpdateFlow$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getAddBankRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAddBankRequestId() {
        return this.addBankRequestId;
    }

    /* renamed from: getAddCardRequestId-QDVFmTU, reason: not valid java name and from getter */
    public final java.lang.String getAddCardRequestId() {
        return this.addCardRequestId;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEffect> getEffect() {
        return this.effect;
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType getFlowType() {
        return this.flowType;
    }

    public final void setFlowType(com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
        this.flowType = autoReloadFlowType;
    }

    /* renamed from: isBusinessAccount, reason: from getter */
    public final boolean getIsBusinessAccount() {
        return this.isBusinessAccount;
    }

    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, java.lang.String str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            autoReloadFlowType = com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.CREATE;
        }
        reviewViewModel.initialize(reviewReloadStrategy, str, autoReloadFlowType);
    }

    public final void initialize(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy strategy, java.lang.String currencyCode, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType flowType) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        java.time.DayOfWeek dayOfWeek;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy2;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value2;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        if (this.getOutputStallDuration) {
            return;
        }
        this.getOutputStallDuration = true;
        this.flowType = flowType;
        java.util.Locale userLocale = this.getHighSpeedVideoFpsRangesFor.getUserLocale();
        if (strategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow = this.getInputFormats;
            do {
                value2 = mutableStateFlow.getValue();
                com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance lowBalance = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) strategy;
                copy3 = r4.copy((r35 & 1) != 0 ? r4.reloadStrategy : lowBalance, (r35 & 2) != 0 ? r4.formattedRechargeAmount : lowBalance.getRechargeAmount().getFormattedAmount(), (r35 & 4) != 0 ? r4.currencyCode : currencyCode, (r35 & 8) != 0 ? r4.formattedThresholdAmount : lowBalance.getThresholdAmount().getFormattedAmount(), (r35 & 16) != 0 ? r4.startDate : null, (r35 & 32) != 0 ? r4.formattedStartDate : null, (r35 & 64) != 0 ? r4.formattedDayOfWeek : null, (r35 & 128) != 0 ? r4.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r4.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r4.disclaimerType : null, (r35 & 1024) != 0 ? r4.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r4.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r4.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r4.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r4.newlyAddedFiId : null, (r35 & 32768) != 0 ? r4.state : null, (r35 & 65536) != 0 ? value2.balanceId : null);
            } while (!mutableStateFlow.compareAndSet(value2, copy3));
        } else {
            boolean z = strategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled;
            if (z) {
                com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) strategy;
                if ((scheduled.getFrequency() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) || (scheduled.getFrequency() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly)) {
                    com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency = scheduled.getFrequency();
                    if (frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) {
                        dayOfWeek = ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) frequency).getDayOfWeek();
                    } else {
                        dayOfWeek = frequency instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly ? ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) frequency).getDayOfWeek() : null;
                    }
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow2 = this.getInputFormats;
                    while (true) {
                        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value3 = mutableStateFlow2.getValue();
                        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = value3;
                        java.time.LocalDate startDate = scheduled.getStartDate();
                        java.lang.String formattedAmount = scheduled.getRechargeAmount().getFormattedAmount();
                        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(scheduled.getStartDate());
                        java.lang.String displayName = dayOfWeek != null ? dayOfWeek.getDisplayName(java.time.format.TextStyle.FULL, userLocale) : null;
                        java.time.DayOfWeek dayOfWeek2 = dayOfWeek;
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow3 = mutableStateFlow2;
                        copy2 = reviewUiStateStore.copy((r35 & 1) != 0 ? reviewUiStateStore.reloadStrategy : scheduled, (r35 & 2) != 0 ? reviewUiStateStore.formattedRechargeAmount : formattedAmount, (r35 & 4) != 0 ? reviewUiStateStore.currencyCode : currencyCode, (r35 & 8) != 0 ? reviewUiStateStore.formattedThresholdAmount : null, (r35 & 16) != 0 ? reviewUiStateStore.startDate : startDate, (r35 & 32) != 0 ? reviewUiStateStore.formattedStartDate : highResolutionOutputSizeshNQ4ISI, (r35 & 64) != 0 ? reviewUiStateStore.formattedDayOfWeek : displayName == null ? "" : displayName, (r35 & 128) != 0 ? reviewUiStateStore.fundingInstrumentOptions : null, (r35 & 256) != 0 ? reviewUiStateStore.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? reviewUiStateStore.disclaimerType : null, (r35 & 1024) != 0 ? reviewUiStateStore.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? reviewUiStateStore.fundingInstrumentUi : null, (r35 & 4096) != 0 ? reviewUiStateStore.showFiSelectionSheet : false, (r35 & 8192) != 0 ? reviewUiStateStore.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? reviewUiStateStore.newlyAddedFiId : null, (r35 & 32768) != 0 ? reviewUiStateStore.state : null, (r35 & 65536) != 0 ? reviewUiStateStore.balanceId : null);
                        if (mutableStateFlow3.compareAndSet(value3, copy2)) {
                            break;
                        }
                        mutableStateFlow2 = mutableStateFlow3;
                        dayOfWeek = dayOfWeek2;
                    }
                }
            }
            if (z) {
                com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled2 = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) strategy;
                if (scheduled2.getFrequency() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow4 = this.getInputFormats;
                    do {
                        value = mutableStateFlow4.getValue();
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled3 = scheduled2;
                        copy = r4.copy((r35 & 1) != 0 ? r4.reloadStrategy : scheduled3, (r35 & 2) != 0 ? r4.formattedRechargeAmount : scheduled2.getRechargeAmount().getFormattedAmount(), (r35 & 4) != 0 ? r4.currencyCode : currencyCode, (r35 & 8) != 0 ? r4.formattedThresholdAmount : null, (r35 & 16) != 0 ? r4.startDate : scheduled2.getStartDate(), (r35 & 32) != 0 ? r4.formattedStartDate : getHighResolutionOutputSizeshNQ4ISI(scheduled2.getStartDate()), (r35 & 64) != 0 ? r4.formattedDayOfWeek : null, (r35 & 128) != 0 ? r4.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r4.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r4.disclaimerType : null, (r35 & 1024) != 0 ? r4.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r4.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r4.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r4.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r4.newlyAddedFiId : null, (r35 & 32768) != 0 ? r4.state : null, (r35 & 65536) != 0 ? value.balanceId : null);
                    } while (!mutableStateFlow4.compareAndSet(value, copy));
                }
            }
        }
        handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.Initialize.INSTANCE);
    }

    public final void handleIntent(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent event) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value2;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy2;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value3;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy3;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value4;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy4;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value5;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy5;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value6;
        boolean z;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy6;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value7;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.Initialize) {
            getHighSpeedVideoFpsRanges();
            return;
        }
        if (!(event instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnChangeOrAddClicked)) {
            if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged) {
                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged onFiChanged = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged) event;
                com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption selectedFundingInstrument = onFiChanged.getSelectedFundingInstrument();
                java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> options = onFiChanged.getOptions();
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow = this.getInputFormats;
                do {
                    value6 = mutableStateFlow.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = value6;
                    java.lang.String instrumentId = selectedFundingInstrument != null ? selectedFundingInstrument.getInstrumentId() : null;
                    java.lang.String str = instrumentId == null ? "" : instrumentId;
                    com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(selectedFundingInstrument);
                    com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(selectedFundingInstrument);
                    if (!this.isBusinessAccount) {
                        java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list = options;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption : list) {
                                if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) {
                                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption;
                                    if (fundingInstrumentBankOption.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT && fundingInstrumentBankOption.getMaximumLimit() != null) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    copy6 = reviewUiStateStore.copy((r35 & 1) != 0 ? reviewUiStateStore.reloadStrategy : null, (r35 & 2) != 0 ? reviewUiStateStore.formattedRechargeAmount : null, (r35 & 4) != 0 ? reviewUiStateStore.currencyCode : null, (r35 & 8) != 0 ? reviewUiStateStore.formattedThresholdAmount : null, (r35 & 16) != 0 ? reviewUiStateStore.startDate : null, (r35 & 32) != 0 ? reviewUiStateStore.formattedStartDate : null, (r35 & 64) != 0 ? reviewUiStateStore.formattedDayOfWeek : null, (r35 & 128) != 0 ? reviewUiStateStore.fundingInstrumentOptions : options, (r35 & 256) != 0 ? reviewUiStateStore.hasFiInstantOptionAvailable : z, (r35 & 512) != 0 ? reviewUiStateStore.disclaimerType : highSpeedVideoFpsRanges, (r35 & 1024) != 0 ? reviewUiStateStore.selectedFundingInstrumentId : str, (r35 & 2048) != 0 ? reviewUiStateStore.fundingInstrumentUi : highResolutionOutputSizeshNQ4ISI, (r35 & 4096) != 0 ? reviewUiStateStore.showFiSelectionSheet : false, (r35 & 8192) != 0 ? reviewUiStateStore.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? reviewUiStateStore.newlyAddedFiId : null, (r35 & 32768) != 0 ? reviewUiStateStore.state : com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready.INSTANCE, (r35 & 65536) != 0 ? reviewUiStateStore.balanceId : null);
                } while (!mutableStateFlow.compareAndSet(value6, copy6));
                return;
            }
            if (event instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument) {
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow2 = this.getInputFormats;
                do {
                    value5 = mutableStateFlow2.getValue();
                    copy5 = r4.copy((r35 & 1) != 0 ? r4.reloadStrategy : null, (r35 & 2) != 0 ? r4.formattedRechargeAmount : null, (r35 & 4) != 0 ? r4.currencyCode : null, (r35 & 8) != 0 ? r4.formattedThresholdAmount : null, (r35 & 16) != 0 ? r4.startDate : null, (r35 & 32) != 0 ? r4.formattedStartDate : null, (r35 & 64) != 0 ? r4.formattedDayOfWeek : null, (r35 & 128) != 0 ? r4.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r4.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r4.disclaimerType : null, (r35 & 1024) != 0 ? r4.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r4.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r4.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r4.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r4.newlyAddedFiId : ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument) event).getFundingInstrumentId(), (r35 & 32768) != 0 ? r4.state : null, (r35 & 65536) != 0 ? value5.balanceId : null);
                } while (!mutableStateFlow2.compareAndSet(value5, copy5));
                getHighSpeedVideoFpsRanges();
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissFiSelection.INSTANCE)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissError.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAuthorizeClicked.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (kotlin.text.StringsKt.isBlank(this.getInputFormats.getValue().getSelectedFundingInstrumentId())) {
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow3 = this.getInputFormats;
                        do {
                            value2 = mutableStateFlow3.getValue();
                            copy2 = r3.copy((r35 & 1) != 0 ? r3.reloadStrategy : null, (r35 & 2) != 0 ? r3.formattedRechargeAmount : null, (r35 & 4) != 0 ? r3.currencyCode : null, (r35 & 8) != 0 ? r3.formattedThresholdAmount : null, (r35 & 16) != 0 ? r3.startDate : null, (r35 & 32) != 0 ? r3.formattedStartDate : null, (r35 & 64) != 0 ? r3.formattedDayOfWeek : null, (r35 & 128) != 0 ? r3.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r3.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r3.disclaimerType : null, (r35 & 1024) != 0 ? r3.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r3.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r3.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r3.showNoFiSelectedAlert : true, (r35 & 16384) != 0 ? r3.newlyAddedFiId : null, (r35 & 32768) != 0 ? r3.state : null, (r35 & 65536) != 0 ? value2.balanceId : null);
                        } while (!mutableStateFlow3.compareAndSet(value2, copy2));
                        return;
                    }
                    if (this.getInputSizeshNQ4ISI.isAutoReloadEnabled()) {
                        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value8 = this.getInputFormats.getValue();
                        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reloadStrategy = value8.getReloadStrategy();
                        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow4 = this.getInputFormats;
                        do {
                            value = mutableStateFlow4.getValue();
                            copy = r5.copy((r35 & 1) != 0 ? r5.reloadStrategy : null, (r35 & 2) != 0 ? r5.formattedRechargeAmount : null, (r35 & 4) != 0 ? r5.currencyCode : null, (r35 & 8) != 0 ? r5.formattedThresholdAmount : null, (r35 & 16) != 0 ? r5.startDate : null, (r35 & 32) != 0 ? r5.formattedStartDate : null, (r35 & 64) != 0 ? r5.formattedDayOfWeek : null, (r35 & 128) != 0 ? r5.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r5.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r5.disclaimerType : null, (r35 & 1024) != 0 ? r5.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r5.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r5.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r5.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r5.newlyAddedFiId : null, (r35 & 32768) != 0 ? r5.state : new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD), (r35 & 65536) != 0 ? value.balanceId : null);
                        } while (!mutableStateFlow4.compareAndSet(value, copy));
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$createAutoReload$2(this, value8, reloadStrategy, null), 3, null);
                        return;
                    }
                    return;
                }
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow5 = this.getInputFormats;
                do {
                    value3 = mutableStateFlow5.getValue();
                    copy3 = r3.copy((r35 & 1) != 0 ? r3.reloadStrategy : null, (r35 & 2) != 0 ? r3.formattedRechargeAmount : null, (r35 & 4) != 0 ? r3.currencyCode : null, (r35 & 8) != 0 ? r3.formattedThresholdAmount : null, (r35 & 16) != 0 ? r3.startDate : null, (r35 & 32) != 0 ? r3.formattedStartDate : null, (r35 & 64) != 0 ? r3.formattedDayOfWeek : null, (r35 & 128) != 0 ? r3.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r3.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r3.disclaimerType : null, (r35 & 1024) != 0 ? r3.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r3.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r3.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r3.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r3.newlyAddedFiId : null, (r35 & 32768) != 0 ? r3.state : com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready.INSTANCE, (r35 & 65536) != 0 ? value3.balanceId : null);
                } while (!mutableStateFlow5.compareAndSet(value3, copy3));
                return;
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow6 = this.getInputFormats;
            do {
                value4 = mutableStateFlow6.getValue();
                copy4 = r3.copy((r35 & 1) != 0 ? r3.reloadStrategy : null, (r35 & 2) != 0 ? r3.formattedRechargeAmount : null, (r35 & 4) != 0 ? r3.currencyCode : null, (r35 & 8) != 0 ? r3.formattedThresholdAmount : null, (r35 & 16) != 0 ? r3.startDate : null, (r35 & 32) != 0 ? r3.formattedStartDate : null, (r35 & 64) != 0 ? r3.formattedDayOfWeek : null, (r35 & 128) != 0 ? r3.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r3.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r3.disclaimerType : null, (r35 & 1024) != 0 ? r3.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r3.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r3.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r3.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r3.newlyAddedFiId : null, (r35 & 32768) != 0 ? r3.state : null, (r35 & 65536) != 0 ? value4.balanceId : null);
            } while (!mutableStateFlow6.compareAndSet(value4, copy4));
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow7 = this.getInputFormats;
        do {
            value7 = mutableStateFlow7.getValue();
            copy7 = r4.copy((r35 & 1) != 0 ? r4.reloadStrategy : null, (r35 & 2) != 0 ? r4.formattedRechargeAmount : null, (r35 & 4) != 0 ? r4.currencyCode : null, (r35 & 8) != 0 ? r4.formattedThresholdAmount : null, (r35 & 16) != 0 ? r4.startDate : null, (r35 & 32) != 0 ? r4.formattedStartDate : null, (r35 & 64) != 0 ? r4.formattedDayOfWeek : null, (r35 & 128) != 0 ? r4.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r4.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r4.disclaimerType : null, (r35 & 1024) != 0 ? r4.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r4.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r4.showFiSelectionSheet : true, (r35 & 8192) != 0 ? r4.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r4.newlyAddedFiId : null, (r35 & 32768) != 0 ? r4.state : null, (r35 & 65536) != 0 ? value7.balanceId : null);
        } while (!mutableStateFlow7.compareAndSet(value7, copy7));
    }

    private final void getHighSpeedVideoFpsRanges() {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        java.lang.String currencyCode = this.getInputFormats.getValue().getCurrencyCode();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r35 & 1) != 0 ? r4.reloadStrategy : null, (r35 & 2) != 0 ? r4.formattedRechargeAmount : null, (r35 & 4) != 0 ? r4.currencyCode : null, (r35 & 8) != 0 ? r4.formattedThresholdAmount : null, (r35 & 16) != 0 ? r4.startDate : null, (r35 & 32) != 0 ? r4.formattedStartDate : null, (r35 & 64) != 0 ? r4.formattedDayOfWeek : null, (r35 & 128) != 0 ? r4.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r4.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r4.disclaimerType : null, (r35 & 1024) != 0 ? r4.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r4.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r4.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r4.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r4.newlyAddedFiId : null, (r35 & 32768) != 0 ? r4.state : new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.FUNDING_INSTRUMENTS), (r35 & 65536) != 0 ? value.balanceId : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2(this, currencyCode, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[Catch: all -> 0x0042, RaiseCancellationException -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0045, all -> 0x0042, blocks: (B:11:0x003e, B:12:0x0082, B:15:0x0088, B:16:0x00ad, B:21:0x00a0, B:22:0x00be, B:23:0x00c3), top: B:10:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum, java.lang.String>> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchBalanceIdInternal$1 reviewViewModel$fetchBalanceIdInternal$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchBalanceIdInternal$1) {
            reviewViewModel$fetchBalanceIdInternal$1 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchBalanceIdInternal$1) continuation;
            if ((reviewViewModel$fetchBalanceIdInternal$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                reviewViewModel$fetchBalanceIdInternal$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = reviewViewModel$fetchBalanceIdInternal$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewViewModel$fetchBalanceIdInternal$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase getBalanceIdUseCase = this.getOutputFormats;
                        reviewViewModel$fetchBalanceIdInternal$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        reviewViewModel$fetchBalanceIdInternal$1.getInputSizeshNQ4ISI = defaultRaise;
                        reviewViewModel$fetchBalanceIdInternal$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoSizesFor = defaultRaise3;
                        reviewViewModel$fetchBalanceIdInternal$1.Camera2StreamConfigurationMap = 0;
                        reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoSizes = 0;
                        reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoFpsRanges = 0;
                        reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoFpsRangesFor = 0;
                        reviewViewModel$fetchBalanceIdInternal$1.getOutputFormats = 1;
                        java.lang.Object invoke = getBalanceIdUseCase.invoke(str, reviewViewModel$fetchBalanceIdInternal$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = invoke;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoFpsRangesFor;
                    int i3 = reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoFpsRanges;
                    int i4 = reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoSizes;
                    int i5 = reviewViewModel$fetchBalanceIdInternal$1.Camera2StreamConfigurationMap;
                    raise = (arrow.core.raise.Raise) reviewViewModel$fetchBalanceIdInternal$1.getHighSpeedVideoSizesFor;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) reviewViewModel$fetchBalanceIdInternal$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadErrorMapperKt.toBalanceErrorBottomSheetEnum((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                java.lang.String str2 = (java.lang.String) raise.bind(right);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(str2);
            }
        }
        reviewViewModel$fetchBalanceIdInternal$1 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchBalanceIdInternal$1(this, continuation);
        java.lang.Object obj2 = reviewViewModel$fetchBalanceIdInternal$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewViewModel$fetchBalanceIdInternal$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        java.lang.String str22 = (java.lang.String) raise.bind(right);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(str22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2 A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0048, B:12:0x00cc, B:15:0x00d2, B:16:0x00f7, B:21:0x00ea, B:22:0x0108, B:23:0x010d), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v9, types: [arrow.core.Either] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum, ? extends java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption>>> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchFundingInstrumentInternal$1 reviewViewModel$fetchFundingInstrumentInternal$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchFundingInstrumentInternal$1) {
            reviewViewModel$fetchFundingInstrumentInternal$1 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchFundingInstrumentInternal$1) continuation;
            if ((reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        java.lang.String amount = this.getInputFormats.getValue().getReloadStrategy().getRechargeAmount().getAmount();
                        com.paypal.oslo.feature.balance.domain.model.Money money = new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(amount), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), null);
                        boolean z = this.getInputFormats.getValue().getReloadStrategy() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance;
                        com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase getAutoReloadFundingInstrumentUseCase = this.getHighSpeedVideoFpsRanges;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        reviewViewModel$fetchFundingInstrumentInternal$1.getOutputFormats = defaultRaise;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(amount);
                        reviewViewModel$fetchFundingInstrumentInternal$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                        reviewViewModel$fetchFundingInstrumentInternal$1.getOutputMinFrameDurationlomOqCM = defaultRaise3;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoFpsRangesFor = 0;
                        reviewViewModel$fetchFundingInstrumentInternal$1.Camera2StreamConfigurationMap = 0;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoSizes = 0;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoFpsRanges = z ? 1 : 0;
                        reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object invoke = getAutoReloadFundingInstrumentUseCase.invoke(money, z, reviewViewModel$fetchFundingInstrumentInternal$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = invoke;
                        raise = defaultRaise3;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoFpsRanges;
                    int i3 = reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoSizes;
                    int i4 = reviewViewModel$fetchFundingInstrumentInternal$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = reviewViewModel$fetchFundingInstrumentInternal$1.Camera2StreamConfigurationMap;
                    int i6 = reviewViewModel$fetchFundingInstrumentInternal$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) reviewViewModel$fetchFundingInstrumentInternal$1.getOutputMinFrameDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) reviewViewModel$fetchFundingInstrumentInternal$1.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadErrorMapperKt.toBalanceErrorBottomSheetEnum((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                java.util.List list = (java.util.List) raise.bind(right);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(list);
            }
        }
        reviewViewModel$fetchFundingInstrumentInternal$1 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchFundingInstrumentInternal$1(this, continuation);
        java.lang.Object obj2 = reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = reviewViewModel$fetchFundingInstrumentInternal$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        java.util.List list2 = (java.util.List) raise.bind(right);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(list2);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewViewModel$InitialData;", "", "", "p0", "", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "p1", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class InitialData {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        /* JADX WARN: Multi-variable type inference failed */
        public InitialData(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRangesFor = list;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitialData(getHighSpeedVideoSizes=");
            sb.append(str);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, initialData.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, initialData.getHighSpeedVideoFpsRangesFor);
        }
    }

    private static com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore p0, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy p1) {
        if (p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance lowBalance = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) p1;
            return new com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest(com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadScheduleType.THRESHOLD.getValue(), p0.getBalanceId(), p0.getSelectedFundingInstrumentId(), new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(lowBalance.getRechargeAmount().getAmount()), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(p0.getCurrencyCode()), null), new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(lowBalance.getThresholdAmount().getAmount()), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(p0.getCurrencyCode()), null), null, null, null, 128, null);
        }
        if (!(p1 instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled scheduled = (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) p1;
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest(com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadScheduleType.FREQUENCY.getValue(), p0.getBalanceId(), p0.getSelectedFundingInstrumentId(), new com.paypal.oslo.feature.balance.domain.model.Money(new java.math.BigDecimal(scheduled.getRechargeAmount().getAmount()), com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(p0.getCurrencyCode()), null), null, getHighResolutionOutputSizeshNQ4ISI(scheduled.getFrequency()), scheduled.getStartDate().format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE), null, 128, null);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse p0) {
        com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange autoReloadChange;
        com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult highSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value2 = this.getInputFormats.getValue();
        if (this.flowType == com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.CREATE) {
            autoReloadChange = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange.CREATED;
        } else {
            autoReloadChange = com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange.EDITED;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reloadStrategy = value2.getReloadStrategy();
        if (reloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoSizes(p0, value2, (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) reloadStrategy, autoReloadChange);
        } else {
            if (!(reloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, value2, (com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) reloadStrategy, autoReloadChange);
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r4.copy((r35 & 1) != 0 ? r4.reloadStrategy : null, (r35 & 2) != 0 ? r4.formattedRechargeAmount : null, (r35 & 4) != 0 ? r4.currencyCode : null, (r35 & 8) != 0 ? r4.formattedThresholdAmount : null, (r35 & 16) != 0 ? r4.startDate : null, (r35 & 32) != 0 ? r4.formattedStartDate : null, (r35 & 64) != 0 ? r4.formattedDayOfWeek : null, (r35 & 128) != 0 ? r4.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r4.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r4.disclaimerType : null, (r35 & 1024) != 0 ? r4.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r4.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r4.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r4.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r4.newlyAddedFiId : null, (r35 & 32768) != 0 ? r4.state : com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready.INSTANCE, (r35 & 65536) != 0 ? value.balanceId : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$handleAutoReloadSuccess$2(this, highSpeedVideoFpsRangesFor, null), 3, null);
    }

    private static com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse p0, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore p1, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance p2, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange p3) {
        java.lang.String amount;
        java.lang.String amount2;
        java.math.BigDecimal amount3;
        java.math.BigDecimal amount4;
        java.lang.String balanceId = p0.getBalanceId();
        if (balanceId == null) {
            balanceId = p1.getBalanceId();
        }
        java.lang.String str = balanceId;
        java.lang.String financialInstrumentId = p0.getFinancialInstrumentId();
        if (financialInstrumentId == null) {
            financialInstrumentId = p1.getSelectedFundingInstrumentId();
        }
        java.lang.String str2 = financialInstrumentId;
        java.lang.String currencyCode = p1.getCurrencyCode();
        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount = p0.getReloadAmount();
        if (reloadAmount == null || (amount4 = reloadAmount.getAmount()) == null || (amount = amount4.toPlainString()) == null) {
            amount = p2.getRechargeAmount().getAmount();
        }
        com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount reloadAmount2 = new com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount(currencyCode, amount);
        java.lang.String currencyCode2 = p1.getCurrencyCode();
        com.paypal.oslo.feature.balance.domain.model.Money thresholdAmount = p0.getThresholdAmount();
        if (thresholdAmount == null || (amount3 = thresholdAmount.getAmount()) == null || (amount2 = amount3.toPlainString()) == null) {
            amount2 = p2.getThresholdAmount().getAmount();
        }
        return new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload.INSTANCE, new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.LowBalanceReload(new com.paypal.oslo.feature.balance.api.models.autoreload.ThresholdData(str, str2, reloadAmount2, new com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount(currencyCode2, amount2), p1.getFormattedRechargeAmount(), p1.getFormattedThresholdAmount()), p3));
    }

    private static com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse p0, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore p1, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled p2, com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadChange p3) {
        java.lang.String amount;
        java.math.BigDecimal amount2;
        java.lang.String balanceId = p0.getBalanceId();
        if (balanceId == null) {
            balanceId = p1.getBalanceId();
        }
        java.lang.String str = balanceId;
        java.lang.String financialInstrumentId = p0.getFinancialInstrumentId();
        if (financialInstrumentId == null) {
            financialInstrumentId = p1.getSelectedFundingInstrumentId();
        }
        java.lang.String str2 = financialInstrumentId;
        java.lang.String currencyCode = p1.getCurrencyCode();
        com.paypal.oslo.feature.balance.domain.model.Money reloadAmount = p0.getReloadAmount();
        if (reloadAmount == null || (amount2 = reloadAmount.getAmount()) == null || (amount = amount2.toPlainString()) == null) {
            amount = p2.getRechargeAmount().getAmount();
        }
        return new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload.INSTANCE, new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.ScheduledReload(new com.paypal.oslo.feature.balance.api.models.autoreload.FrequencyData(p2.getStartDate().format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE), (java.lang.String) null, getHighResolutionOutputSizeshNQ4ISI(p2.getFrequency()), str2, new com.paypal.oslo.feature.balance.api.models.autoreload.ReloadAmount(currencyCode, amount), str, p1.getFormattedRechargeAmount(), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), p3));
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum p0) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r35 & 1) != 0 ? r3.reloadStrategy : null, (r35 & 2) != 0 ? r3.formattedRechargeAmount : null, (r35 & 4) != 0 ? r3.currencyCode : null, (r35 & 8) != 0 ? r3.formattedThresholdAmount : null, (r35 & 16) != 0 ? r3.startDate : null, (r35 & 32) != 0 ? r3.formattedStartDate : null, (r35 & 64) != 0 ? r3.formattedDayOfWeek : null, (r35 & 128) != 0 ? r3.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r3.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r3.disclaimerType : null, (r35 & 1024) != 0 ? r3.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r3.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r3.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r3.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r3.newlyAddedFiId : null, (r35 & 32768) != 0 ? r3.state : new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.CREATE_AUTO_RELOAD, p0), (r35 & 65536) != 0 ? value.balanceId : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.time.LocalDate p0) {
        java.time.ZoneId zoneId = this.getHighSpeedVideoFpsRangesFor.getTimezone().toZoneId();
        com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration dateTimeConfiguration = new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(new com.paypal.oslo.core.i18n.domain.model.CustomStyle("MMMd"), null, 2, null);
        com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase = this.Camera2StreamConfigurationMap;
        java.util.Date from = java.util.Date.from(p0.atStartOfDay(zoneId).toInstant());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        java.lang.String id = zoneId.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        java.lang.String orNull = dateTimeFormatUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, id), dateTimeConfiguration).getOrNull();
        if (orNull != null) {
            return orNull;
        }
        java.lang.String localDate = p0.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        return localDate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption p0) {
        if (p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) {
            return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_SAVINGS;
        }
        if ((this.getInputFormats.getValue().getReloadStrategy() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) && (p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption)) {
            return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_BANK;
        }
        if ((this.getInputFormats.getValue().getReloadStrategy() instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled) && (p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption)) {
            return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.SCHEDULED_CARD;
        }
        boolean z = p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption;
        if (z) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) p0;
            if (fundingInstrumentBankOption.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT && !this.isBusinessAccount && fundingInstrumentBankOption.getMaximumLimit() != null) {
                return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_INSTANT;
            }
        }
        if (z) {
            return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_BANK_STANDARD;
        }
        if (p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) {
            return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.LOW_BALANCE_CARD;
        }
        return com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption p0) {
        java.lang.String description;
        if (p0 == null) {
            return null;
        }
        boolean z = p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption;
        if (z) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) p0;
            com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType bankType = fundingInstrumentBankOption.getBankType();
            java.lang.String last4Digits = fundingInstrumentBankOption.getLast4Digits();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(bankType);
            sb.append(" ••••");
            sb.append(last4Digits);
            description = sb.toString();
        } else if (p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) p0;
            java.lang.String brand = fundingInstrumentCardOption.getBrand();
            java.lang.String last4Digits2 = fundingInstrumentCardOption.getLast4Digits();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(brand);
            sb2.append(" ••••");
            sb2.append(last4Digits2);
            description = sb2.toString();
        } else {
            description = p0 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption ? ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) p0).getDescription() : "";
        }
        return new com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi(p0.getName(), description, p0.getImageUrl(), p0.getType(), p0.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT && !(z && (this.isBusinessAccount || ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) p0).getMaximumLimit() == null)));
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency p0) {
        if (p0 instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) {
            return com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadRecurrence.WEEKLY.getValue();
        }
        if (p0 instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) {
            return com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadRecurrence.BIWEEKLY.getValue();
        }
        if (p0 instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) {
            return com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadRecurrence.MONTHLY.getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ java.util.List access$filterFundingInstrumentsByStrategy(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, java.util.List list) {
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reloadStrategy = reviewViewModel.getInputFormats.getValue().getReloadStrategy();
        if (reloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance) {
            if (!reviewViewModel.isBusinessAccount) {
                return list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj).getType() != com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (!(reloadStrategy instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.Scheduled)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2).getType() != com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption access$selectFundingInstrument(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, java.util.List list, java.math.BigDecimal bigDecimal) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        java.lang.Object obj4;
        java.lang.String newlyAddedFiId = reviewViewModel.getInputFormats.getValue().getNewlyAddedFiId();
        java.lang.Object obj5 = null;
        if (newlyAddedFiId != null) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore> mutableStateFlow = reviewViewModel.getInputFormats;
            do {
                value = mutableStateFlow.getValue();
                copy = r6.copy((r35 & 1) != 0 ? r6.reloadStrategy : null, (r35 & 2) != 0 ? r6.formattedRechargeAmount : null, (r35 & 4) != 0 ? r6.currencyCode : null, (r35 & 8) != 0 ? r6.formattedThresholdAmount : null, (r35 & 16) != 0 ? r6.startDate : null, (r35 & 32) != 0 ? r6.formattedStartDate : null, (r35 & 64) != 0 ? r6.formattedDayOfWeek : null, (r35 & 128) != 0 ? r6.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r6.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r6.disclaimerType : null, (r35 & 1024) != 0 ? r6.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r6.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r6.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r6.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r6.newlyAddedFiId : null, (r35 & 32768) != 0 ? r6.state : null, (r35 & 65536) != 0 ? value.balanceId : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj4).getInstrumentId(), newlyAddedFiId)) {
                    break;
                }
            }
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj4;
            if (fundingInstrumentOption != null) {
                return fundingInstrumentOption;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(reviewViewModel), null, null, new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$selectFundingInstrument$1$4$1(reviewViewModel, null), 3, null);
        }
        if (reviewViewModel.flowType == com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType.UPDATE) {
            java.lang.String financialInstrumentId = reviewViewModel.getInputFormats.getValue().getReloadStrategy().getFinancialInstrumentId();
            java.lang.String str = financialInstrumentId;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                financialInstrumentId = null;
            }
            if (financialInstrumentId != null) {
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj3).getInstrumentId(), financialInstrumentId)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj3;
                if (fundingInstrumentOption2 != null && (!(fundingInstrumentOption2 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) || ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) fundingInstrumentOption2).getCurrentBalance().getAmount().compareTo(bigDecimal) >= 0)) {
                    return fundingInstrumentOption2;
                }
            }
            return null;
        }
        java.util.List list2 = list;
        java.util.Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj).isMostRecentlyUsed()) {
                break;
            }
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption3 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
        if (fundingInstrumentOption3 != null && (!(fundingInstrumentOption3 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) || ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) fundingInstrumentOption3).getCurrentBalance().getAmount().compareTo(bigDecimal) >= 0)) {
            return fundingInstrumentOption3;
        }
        java.util.Iterator<T> it4 = com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSortingKt.sortedByPriority(list).iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it4.next();
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption4 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2;
            if (!(fundingInstrumentOption4 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) || ((com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) fundingInstrumentOption4).getCurrentBalance().getAmount().compareTo(bigDecimal) >= 0) {
                break;
            }
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption5 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj2;
        if (fundingInstrumentOption5 != null) {
            return fundingInstrumentOption5;
        }
        for (java.lang.Object obj6 : list2) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption6 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj6;
            if (fundingInstrumentOption6.getType() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK) {
                if (fundingInstrumentOption6.getMode() != com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.STANDARD) {
                    if (fundingInstrumentOption6.getMode() != com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT) {
                        continue;
                    } else {
                        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = fundingInstrumentOption6 instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption ? (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption6 : null;
                        if ((fundingInstrumentBankOption != null ? fundingInstrumentBankOption.getMaximumLimit() : null) == null) {
                        }
                    }
                }
                obj5 = obj6;
                break;
            }
        }
        return (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj5;
    }
}
