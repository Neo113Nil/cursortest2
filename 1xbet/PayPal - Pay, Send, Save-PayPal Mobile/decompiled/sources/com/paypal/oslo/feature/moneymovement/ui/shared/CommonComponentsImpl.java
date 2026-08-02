package com.paypal.oslo.feature.moneymovement.ui.shared;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u00118\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/shared/CommonComponentsImpl;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "Header", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderConfig;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderData;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/header/HeaderCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "Landroidx/compose/runtime/Composable;", "formatterFactory", "Lkotlin/jvm/functions/Function2;", "getFormatterFactory$money_movement_prodRelease", "()Lkotlin/jvm/functions/Function2;", "setFormatterFactory$money_movement_prodRelease", "(Lkotlin/jvm/functions/Function2;)V", "getFormatterFactory$money_movement_prodRelease$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CommonComponentsImpl implements com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> formatterFactory = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl.m15663$r8$lambda$FFQXoYidwLHLVFf70oEWtRa3Vc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    };

    public static /* synthetic */ void getFormatterFactory$money_movement_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public CommonComponentsImpl() {
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> getFormatterFactory$money_movement_prodRelease() {
        return this.formatterFactory;
    }

    public final void setFormatterFactory$money_movement_prodRelease(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.formatterFactory = function2;
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents
    public final void Header(final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig headerConfig, final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData, final com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks headerCallbacks, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerCallbacks, "");
        composer.startReplaceGroup(-1871951274);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1871951274, i, -1, "com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl.Header (CommonComponentsImpl.kt:54)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.moneymovement.ui.summary.SummaryFormattingKt.getLocalMoneyAmountFormatter().provides(this.formatterFactory.invoke(composer, 0)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(450010518, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl.m15664$r8$lambda$eRYOLmv0nUkIxqhkpEJ10ClXgo(com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig.this, headerData, headerCallbacks, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* renamed from: $r8$lambda$FFQXoYidwL-HLVFf70oEWtRa3Vc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter m15663$r8$lambda$FFQXoYidwLHLVFf70oEWtRa3Vc(androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        composer.startReplaceGroup(-1879064821);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1879064821, i, -1, "com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl.formatterFactory.<anonymous> (CommonComponentsImpl.kt:42)");
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

    /* renamed from: $r8$lambda$eRYOLmv0nUkIxqhkpEJ-10ClXgo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15664$r8$lambda$eRYOLmv0nUkIxqhkpEJ10ClXgo(com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig headerConfig, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks headerCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(450010518, i, -1, "com.paypal.oslo.feature.moneymovement.ui.shared.CommonComponentsImpl.Header.<anonymous> (CommonComponentsImpl.kt:57)");
            }
            com.paypal.oslo.feature.moneymovement.ui.shared.header.HeaderKt.Header(headerConfig, headerData, headerCallbacks, modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
