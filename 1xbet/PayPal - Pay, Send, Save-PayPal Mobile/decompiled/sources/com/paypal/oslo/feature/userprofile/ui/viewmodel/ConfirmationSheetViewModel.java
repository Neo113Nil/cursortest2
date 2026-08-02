package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmationSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoFpsRanges", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmationSheetViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ConfirmationSheetViewModel(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.getHighSpeedVideoFpsRanges = localeProvider;
    }

    public final java.util.Locale getUserLocale() {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmationSheetViewModel confirmationSheetViewModel = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(this.getHighSpeedVideoFpsRanges.getUserLocale());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.util.Locale locale = java.util.Locale.US;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = locale;
        }
        return (java.util.Locale) m23436constructorimpl;
    }
}
