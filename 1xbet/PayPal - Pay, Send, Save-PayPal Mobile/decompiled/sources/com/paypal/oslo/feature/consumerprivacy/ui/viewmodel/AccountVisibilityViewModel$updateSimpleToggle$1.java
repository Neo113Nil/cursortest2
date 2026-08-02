package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateSimpleToggle$1", f = "AccountVisibilityViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 247, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 250, 251, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, nl = {247, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 250, 251, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountVisibilityViewModel$updateSimpleToggle$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r8 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r8 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (r8 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        if (r8 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        if (r8 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
    
        if (r8 != r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (r8 != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
    
        if (r8 != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r8 == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0186  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases granularSendMoneyUseCases;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases granularSendMoneyUseCases2;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases granularSendMoneyUseCases3;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularSendMoneyUseCases granularSendMoneyUseCases4;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases granularRequestMoneyUseCases;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases granularRequestMoneyUseCases2;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases granularRequestMoneyUseCases3;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.GranularRequestMoneyUseCases granularRequestMoneyUseCases4;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases simplifiedPolicyUseCases;
        arrow.core.Ior ior;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getHighSpeedVideoFpsRangesFor) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default(this.Camera2StreamConfigurationMap, null, true, null, 1, null));
                switch (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateSimpleToggle$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRanges.ordinal()]) {
                    case 1:
                        granularSendMoneyUseCases = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                        this.getHighSpeedVideoFpsRangesFor = 1;
                        obj = granularSendMoneyUseCases.getByName().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 2:
                        granularSendMoneyUseCases2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                        this.getHighSpeedVideoFpsRangesFor = 2;
                        obj = granularSendMoneyUseCases2.getByEmail().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 3:
                        granularSendMoneyUseCases3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                        this.getHighSpeedVideoFpsRangesFor = 3;
                        obj = granularSendMoneyUseCases3.getByPhone().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 4:
                        granularSendMoneyUseCases4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                        this.getHighSpeedVideoFpsRangesFor = 4;
                        obj = granularSendMoneyUseCases4.getByUsername().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 5:
                        granularRequestMoneyUseCases = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRangesFor = 5;
                        obj = granularRequestMoneyUseCases.getByName().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 6:
                        granularRequestMoneyUseCases2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRangesFor = 6;
                        obj = granularRequestMoneyUseCases2.getByEmail().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 7:
                        granularRequestMoneyUseCases3 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRangesFor = 7;
                        obj = granularRequestMoneyUseCases3.getByPhone().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 8:
                        granularRequestMoneyUseCases4 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighSpeedVideoFpsRangesFor = 8;
                        obj = granularRequestMoneyUseCases4.getByUsername().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    case 9:
                        simplifiedPolicyUseCases = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRangesFor = 9;
                        obj = simplifiedPolicyUseCases.getUpdateAllowVenmoDiscovery().invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                        break;
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                    mutableStateFlow4 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
                    mutableStateFlow4.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content.copy$default(content, null, false, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, 0 == true ? 1 : 0), 1, null));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    mutableStateFlow3 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
                    mutableStateFlow3.setValue(content.copy(access$applyToggleToData, false, null));
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    mutableStateFlow2 = accountVisibilityViewModel.Camera2StreamConfigurationMap;
                    mutableStateFlow2.setValue(content.copy(access$applyToggleToData, false, null));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData2 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel2 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content2 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData22 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel22 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content22 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData222 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel222 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content222 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData2222 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel2222 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content2222 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData22222 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel22222 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content22222 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 7:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData222222 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel222222 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content222222 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 8:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData2222222 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel2222222 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content2222222 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            case 9:
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData access$applyToggleToData22222222 = com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModelKt.access$applyToggleToData(this.Camera2StreamConfigurationMap.getData(), this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel22222222 = this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content22222222 = this.Camera2StreamConfigurationMap;
                if (ior instanceof arrow.core.Ior.Left) {
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateSimpleToggle$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.values().length];
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_NAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_PHONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.SEND_MONEY_BY_USERNAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_EMAIL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_PHONE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.REQUEST_MONEY_BY_USERNAME.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle.VENMO_DISCOVERY.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateSimpleToggle$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityViewModel$updateSimpleToggle$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel accountVisibilityViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.AccountVisibilityUiState.Content content, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimpleVisibilityToggle simpleVisibilityToggle, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.AccountVisibilityViewModel$updateSimpleToggle$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = accountVisibilityViewModel;
        this.Camera2StreamConfigurationMap = content;
        this.getHighSpeedVideoFpsRanges = simpleVisibilityToggle;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }
}
