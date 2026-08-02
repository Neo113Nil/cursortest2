package com.paypal.oslo.feature.taptopay.ui.setup.entercvv;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ!\u0010\u001e\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020$0'8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;)V", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "brand", "", "updateCardData", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Ljava/lang/String;)V", "", "digit", "onDigitInput", "(C)V", "onBackspace", "()V", "getTermsUrl", "()Ljava/lang/String;", "getPrivacyUrl", "Ljava/util/Locale;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/Locale;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Function1;", "onValidCvv", "onContinueClicked", "(Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/entercvv/EnterCvvUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EnterCvvViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState> uiState;

    @javax.inject.Inject
    public EnterCvvViewModel(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        this.getHighSpeedVideoFpsRanges = localeInformation;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState> getUiState() {
        return this.uiState;
    }

    public final void updateCardData(com.paypal.oslo.core.commonui.utils.RefText title, java.lang.String description, java.lang.String brand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content(null, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardBrand.INSTANCE.fromString(brand).getCvvLength(), 0, title, description, false, null, 101, null));
    }

    public final void onDigitInput(char digit) {
        com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        if (value instanceof com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) {
            com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content content = (com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) value;
            if (content.getCvv().length() >= content.getMaxCvvLength()) {
                return;
            }
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String cvv = content.getCvv();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cvv);
            sb.append(digit);
            mutableStateFlow.setValue(com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content.copy$default(content, sb.toString(), 0, 0, null, null, false, null, 62, null));
        }
    }

    public final void onBackspace() {
        com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        if (value instanceof com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) {
            com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content content = (com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) value;
            if (content.getCvv().length() == 0) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content.copy$default(content, kotlin.text.StringsKt.dropLast(content.getCvv(), 1), 0, 0, null, null, false, null, 62, null));
        }
    }

    public final java.lang.String getTermsUrl() {
        java.util.Locale userLocale = this.getHighSpeedVideoFpsRanges.getUserLocale();
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(userLocale);
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(userLocale);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("https://www.paypal.com/%s/webapps/mpp/ua/instore-pmt-3rdparty-cards?locale.x=%s", java.util.Arrays.copyOf(new java.lang.Object[]{highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String getPrivacyUrl() {
        java.util.Locale userLocale = this.getHighSpeedVideoFpsRanges.getUserLocale();
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(userLocale);
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(userLocale);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("https://www.paypal.com/%s/webapps/mpp/ua/privacy-full?locale.x=%s", java.util.Arrays.copyOf(new java.lang.Object[]{highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.util.Locale p0) {
        java.lang.String country = p0.getCountry();
        if (kotlin.text.StringsKt.isBlank(country)) {
            country = "us";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = country.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Locale p0) {
        java.lang.String obj = p0.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String str = obj;
        if (str.length() == 0) {
            str = "en_US";
        }
        return str;
    }

    public final void onContinueClicked(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onValidCvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onValidCvv, "");
        com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        if (value instanceof com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) {
            com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content content = (com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content) value;
            if (content.isCvvValid()) {
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content.copy$default(content, null, 0, 0, null, null, true, null, 31, null));
                onValidCvv.invoke(content.getCvv());
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.taptopay.ui.setup.entercvv.EnterCvvUiState.Content.copy$default(content, null, 0, 0, null, null, false, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_cvv_error_invalid, new java.lang.Object[0]), 63, null));
            }
        }
    }
}
