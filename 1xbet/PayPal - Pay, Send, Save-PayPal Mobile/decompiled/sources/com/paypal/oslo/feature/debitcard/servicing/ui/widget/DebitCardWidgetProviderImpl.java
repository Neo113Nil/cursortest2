package com.paypal.oslo.feature.debitcard.servicing.ui.widget;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/DebitCardWidgetProviderImpl;", "Lcom/paypal/oslo/feature/debitcard/api/widget/DebitCardWidgetProvider;", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "entryPoint", "Landroidx/compose/ui/Modifier;", "modifier", "", "Widget-l0NCa9I", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebitCardWidgetProviderImpl implements com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DebitCardWidgetProviderImpl() {
    }

    @Override // com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetProvider
    /* renamed from: Widget-l0NCa9I */
    public final void mo14172Widgetl0NCa9I(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardEntryPoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1062945286);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str != null ? com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(debitCardEntryPoint.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1062945286, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl.Widget (DebitCardWidgetProviderImpl.kt:35)");
            }
            int i3 = i2 >> 3;
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14537DebitCardWidgetContent3S_xH3g(appNavigator, debitCardEntryPoint, modifier, str, null, startRestartGroup, (i3 & 896) | (i2 & 14) | (i3 & 112) | ((i2 << 6) & 7168), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl.m14555$r8$lambda$js7naZFdfEOa53htASSrgMdU(com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl.this, appNavigator, str, debitCardEntryPoint, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$js-7naZFdfE-Oa53htASSrgM-dU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14555$r8$lambda$js7naZFdfEOa53htASSrgMdU(com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetProviderImpl debitCardWidgetProviderImpl, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        debitCardWidgetProviderImpl.mo14172Widgetl0NCa9I(appNavigator, str, debitCardEntryPoint, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
