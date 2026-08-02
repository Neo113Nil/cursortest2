package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingScreenDestination;", "navKey", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "PartnerLinkingScreenDestinationContent", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingScreenDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PartnerLinkingScreenDestinationKt {
    public static final void PartnerLinkingScreenDestinationContent(final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestination partnerLinkingScreenDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingScreenDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1812321756);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(partnerLinkingScreenDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1812321756, i2, -1, "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestinationContent (PartnerLinkingScreenDestination.kt:44)");
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.screen.PartnerLinkingScreenKt.m15124PartnerLinkingScreenfgb3AoM(partnerLinkingScreenDestination.getRequest(), partnerLinkingScreenDestination.m15123getRequestIdQDVFmTU(), appNavigator, null, startRestartGroup, (i2 << 3) & 896, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestinationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestinationKt.$r8$lambda$wxHBPR8w3pnPjxCz5IFVDGRN_FU(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestination.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wxHBPR8w3pnPjxCz5IFVDGRN_FU(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingScreenDestination partnerLinkingScreenDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        PartnerLinkingScreenDestinationContent(partnerLinkingScreenDestination, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
