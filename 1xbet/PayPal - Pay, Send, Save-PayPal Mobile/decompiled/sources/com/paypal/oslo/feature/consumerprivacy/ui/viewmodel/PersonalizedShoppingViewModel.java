package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/PersonalizedShoppingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedShoppingSettingsUseCase;", "getPersonalizedShoppingSettingsUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedShoppingPreferenceUseCase;", "updatePersonalizedShoppingPreferenceUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedShoppingSettingsUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedShoppingPreferenceUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;)V", "", "enabled", "", "onPersonalizationToggleChanged", "(Z)V", "clearBanner", "()V", "", "p0", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedShoppingSettingsUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedShoppingPreferenceUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedShoppingViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState> uiState;

    @javax.inject.Inject
    public PersonalizedShoppingViewModel(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedShoppingSettingsUseCase getPersonalizedShoppingSettingsUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedShoppingPreferenceUseCase updatePersonalizedShoppingPreferenceUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPersonalizedShoppingSettingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePersonalizedShoppingPreferenceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        this.getHighSpeedVideoFpsRanges = getPersonalizedShoppingSettingsUseCase;
        this.getHighSpeedVideoFpsRangesFor = updatePersonalizedShoppingPreferenceUseCase;
        this.Camera2StreamConfigurationMap = dateTimeFormatUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$loadPersonalizedShoppingSettings$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState> getUiState() {
        return this.uiState;
    }

    public final void onPersonalizationToggleChanged(boolean enabled) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel$onPersonalizationToggleChanged$1(this, enabled, null), 3, null);
    }

    public final void clearBanner() {
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState value = this.getHighSpeedVideoSizes.getValue();
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) {
            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) value, null, false, null, false, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant Camera2StreamConfigurationMap(java.lang.String p0) {
        java.lang.String str;
        int hashCode;
        if (p0 != null) {
            str = p0.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = null;
        }
        if (str != null && ((hashCode = str.hashCode()) == 2142 ? str.equals("CA") : !(hashCode == 2486 ? !str.equals("ND") : !(hashCode == 2750 && str.equals("VT"))))) {
            return com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.US_SPECIAL;
        }
        return com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getHighSpeedVideoSizes(java.lang.String p0) {
        java.lang.String str = p0;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            try {
                java.time.OffsetDateTime parse = java.time.OffsetDateTime.parse(p0);
                java.util.Date from = java.util.Date.from(parse.toInstant());
                java.time.ZoneOffset offset = parse.getOffset();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GMT");
                sb.append(offset);
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNull(from);
                arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = this.Camera2StreamConfigurationMap.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, obj), new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.DateTimeStyle.DATE_LONG, null, 2, null));
                if (invoke instanceof arrow.core.Either.Right) {
                    return (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
                }
                if (invoke instanceof arrow.core.Either.Left) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, "DateTimeFormatUseCase failed to format dataUsageDate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.DateTimeError) ((arrow.core.Either.Left) invoke).getValue()).toString())), null, 4, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            } catch (java.time.format.DateTimeParseException e) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, "Failed to parse dataUsageDate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("dateString", p0), kotlin.TuplesKt.to("error", e.toString())), null, 4, null);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$applyMutationSuccessState(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShopping personalizedShopping) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant;
        int i;
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType;
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState value = personalizedShoppingViewModel.getHighSpeedVideoSizes.getValue();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState> mutableStateFlow = personalizedShoppingViewModel.getHighSpeedVideoSizes;
        java.lang.String subjectState = personalizedShopping.getSubjectState();
        if (subjectState == null || (personalizedShoppingVariant = Camera2StreamConfigurationMap(subjectState)) == null) {
            if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) {
                personalizedShoppingVariant = ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) value).getVariant();
            } else {
                personalizedShoppingVariant = com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.DEFAULT;
            }
        }
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant2 = personalizedShoppingVariant;
        boolean isEnabled = personalizedShopping.isEnabled();
        if (personalizedShopping.isEnabled()) {
            i = com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_update_success_on;
        } else {
            i = com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_update_success_off;
        }
        com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success success = new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success(i, null, 2, 0 == true ? 1 : 0);
        boolean z = value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content;
        if (z) {
            consentType = ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) value).getConsentType();
        } else {
            consentType = com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.DENY;
        }
        mutableStateFlow.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content(personalizedShoppingVariant2, isEnabled, success, true, false, consentType, z ? ((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) value).getDataUsageDate() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleMutationError(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedShoppingViewModel personalizedShoppingViewModel, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedShoppingError personalizedShoppingError) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error error;
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState value = personalizedShoppingViewModel.getHighSpeedVideoSizes.getValue();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState> mutableStateFlow = personalizedShoppingViewModel.getHighSpeedVideoSizes;
        int i = 2;
        com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) {
            error = com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Content) value, null, false, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, bannerLinkConfig, i, objArr3 == true ? 1 : 0), true, false, null, null, 99, null);
        } else {
            if (!(value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error) && !kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Loading.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            error = new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingUiState.Error(new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), personalizedShoppingError.getDescription());
        }
        mutableStateFlow.setValue(error);
    }
}
