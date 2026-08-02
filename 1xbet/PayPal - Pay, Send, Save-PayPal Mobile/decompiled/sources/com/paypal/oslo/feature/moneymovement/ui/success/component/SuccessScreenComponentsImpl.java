package com.paypal.oslo.feature.moneymovement.ui.success.component;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R3\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u00168\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/success/component/SuccessScreenComponentsImpl;", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;", "formatRelativeTimeUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;)V", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "Content", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatRelativeTimeUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "Landroidx/compose/runtime/Composable;", "formatterFactory", "Lkotlin/jvm/functions/Function2;", "getFormatterFactory$money_movement_prodRelease", "()Lkotlin/jvm/functions/Function2;", "setFormatterFactory$money_movement_prodRelease", "(Lkotlin/jvm/functions/Function2;)V", "getFormatterFactory$money_movement_prodRelease$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuccessScreenComponentsImpl implements com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> formatterFactory;

    public static /* synthetic */ void getFormatterFactory$money_movement_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public SuccessScreenComponentsImpl(com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase formatRelativeTimeUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatRelativeTimeUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = formatRelativeTimeUseCase;
        this.formatterFactory = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl.m15675$r8$lambda$YwDIP_GWpvy98v9c4E_3OqJPFc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        };
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getFormatterFactory$money_movement_prodRelease() {
        return this.formatterFactory;
    }

    public final void setFormatterFactory$money_movement_prodRelease(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.formatterFactory = function2;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents
    public final void Content(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenCallbacks, "");
        composer.startReplaceGroup(1379680295);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1379680295, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl.Content (SuccessScreenComponentsImpl.kt:54)");
        }
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter invoke = this.formatterFactory.invoke(composer, 0);
        boolean changedInstance = composer.changedInstance(this);
        com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl$Content$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl$Content$1$1(this);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.MMPSuccessScreen(mMPSuccessScreenConfig, mMPSuccessScreenData, modifier, mMPSuccessScreenCallbacks, invoke, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue), composer, (i & 126) | ((i >> 3) & 896) | ((i << 3) & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* renamed from: $r8$lambda$YwDIP_-GWpvy98v9c4E_3OqJPFc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter m15675$r8$lambda$YwDIP_GWpvy98v9c4E_3OqJPFc(androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        composer.startReplaceGroup(273021136);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(273021136, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl.formatterFactory.<anonymous> (SuccessScreenComponentsImpl.kt:45)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter formatter = ((com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.moneymovement.ui.shared.MoneyAmountFormatterViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0)).getFormatter();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return formatter;
    }

    public static final /* synthetic */ java.lang.String access$formatDaysRemaining(com.paypal.oslo.feature.moneymovement.ui.success.component.SuccessScreenComponentsImpl successScreenComponentsImpl, kotlin.time.Instant instant) {
        java.lang.Object value;
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = successScreenComponentsImpl.getHighResolutionOutputSizeshNQ4ISI.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(new java.util.Date(instant.toEpochMilliseconds()), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC), new com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_LONG, com.paypal.oslo.core.i18n.domain.model.DurationUnit.DAY, null, 4, null));
        if (invoke instanceof arrow.core.Either.Left) {
            value = "";
        } else {
            if (!(invoke instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            value = ((arrow.core.Either.Right) invoke).getValue();
        }
        return (java.lang.String) value;
    }
}
