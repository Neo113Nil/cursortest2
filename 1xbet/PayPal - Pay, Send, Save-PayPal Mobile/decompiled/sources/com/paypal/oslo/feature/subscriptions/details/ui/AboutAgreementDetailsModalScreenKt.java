package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"AboutAgreementDetailsModalScreen", "", "destination", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/AboutAgreementDetailsDestination;", "modifier", "Landroidx/compose/ui/Modifier;", "toastState", "Lcom/paypal/oslo/core/navigation/scene/BottomSheetToastState;", "(Lcom/paypal/oslo/feature/subscriptions/shared/navigation/AboutAgreementDetailsDestination;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/navigation/scene/BottomSheetToastState;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AboutAgreementDetailsModalScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AboutAgreementDetailsModalScreen(final com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination aboutAgreementDetailsDestination, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        int i4;
        com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState3 = bottomSheetToastState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aboutAgreementDetailsDestination, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1476753137);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(aboutAgreementDetailsDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(bottomSheetToastState3) : startRestartGroup.changedInstance(bottomSheetToastState3)) {
                        i4 = 256;
                        i3 |= i4;
                    }
                }
                i4 = 128;
                i3 |= i4;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    bottomSheetToastState2 = bottomSheetToastState3;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        bottomSheetToastState3 = (com.paypal.oslo.core.navigation.scene.BottomSheetToastState) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt.getLocalBottomSheetToast());
                        i3 &= -897;
                    }
                    bottomSheetToastState2 = bottomSheetToastState3;
                    modifier4 = companion;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1476753137, i3, -1, "com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalScreen (AboutAgreementDetailsModalScreen.kt:29)");
                }
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_info_copied_to_clipboard, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1820546032);
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                createListBuilder.add(new com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_info_billing_id, startRestartGroup, 0), aboutAgreementDetailsDestination.getAgreementId()));
                java.lang.String merchantContact = aboutAgreementDetailsDestination.getMerchantContact();
                if (merchantContact != null) {
                    startRestartGroup.startReplaceGroup(-1154745776);
                    createListBuilder.add(new com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_info_business_contact, startRestartGroup, 0), merchantContact));
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1154745777);
                    startRestartGroup.endReplaceGroup();
                }
                java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(modifier4, null, false, 3, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                boolean z = (((i3 & 896) ^ 384) > 256 && startRestartGroup.changedInstance(bottomSheetToastState2)) || (i3 & 384) == 256;
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalScreenKt.$r8$lambda$ZevX5HvDDi4Cl2dgXkLHYK3zEww(com.paypal.oslo.core.navigation.scene.BottomSheetToastState.this, stringResource, (com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalKt.AboutAgreementDetailsModal(build, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 0, 4);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                bottomSheetToastState2 = bottomSheetToastState3;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState4 = bottomSheetToastState2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalScreenKt.$r8$lambda$m9WVsURXB4HTCLgU99MswRNjDlU(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination.this, modifier3, bottomSheetToastState4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZevX5HvDDi4Cl2dgXkLHYK3zEww(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, java.lang.String str, com.paypal.oslo.feature.subscriptions.details.manage.domain.InfoItem infoItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(infoItem, "");
        if (bottomSheetToastState != null) {
            com.paypal.oslo.core.navigation.scene.BottomSheetToastState.show$default(bottomSheetToastState, str, null, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m9WVsURXB4HTCLgU99MswRNjDlU(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination aboutAgreementDetailsDestination, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AboutAgreementDetailsModalScreen(aboutAgreementDetailsDestination, modifier, bottomSheetToastState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
