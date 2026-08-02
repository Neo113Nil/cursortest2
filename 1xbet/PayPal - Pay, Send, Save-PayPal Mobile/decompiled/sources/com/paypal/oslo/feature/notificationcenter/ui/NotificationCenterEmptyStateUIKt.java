package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"NotificationCenterEmptyStateUI", "", "pushOptInState", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "onTopBarCloseClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NotificationCenterEmptyStateUIPreview", "(Landroidx/compose/runtime/Composer;I)V", "notification-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterEmptyStateUIKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationCenterEmptyStateUI(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState2;
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i4;
        final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        boolean z;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1995523440);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            pushOptInState2 = pushOptInState;
        } else if ((i & 6) == 0) {
            pushOptInState2 = pushOptInState;
            i3 = (startRestartGroup.changedInstance(pushOptInState2) ? 4 : 2) | i;
        } else {
            pushOptInState2 = pushOptInState;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                pushOptInState3 = pushOptInState2;
            } else {
                pushOptInState3 = i5 != 0 ? null : pushOptInState2;
                if (i6 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function03 = function02;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1995523440, i4, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUI (NotificationCenterEmptyStateUI.kt:37)");
                }
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.notificationcenter.domain.model.Section(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.ALL.getValue(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_all_section_title, startRestartGroup, 0)));
                boolean changed = startRestartGroup.changed(pushOptInState3 != null ? pushOptInState3.getPermissionStatus() : null);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus permissionStatus = pushOptInState3 != null ? pushOptInState3.getPermissionStatus() : null;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Denied.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.PermanentlyDenied.INSTANCE)) {
                        z = true;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Granted.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.NotRequired.INSTANCE) && permissionStatus != null) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        z = false;
                    }
                    rememberedValue2 = java.lang.Boolean.valueOf(z);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                boolean booleanValue = ((java.lang.Boolean) rememberedValue2).booleanValue();
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt.$r8$lambda$UsNHx0ghFnhmx9MqoSiVYcp_CVs((java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.notificationcenter.ui.NotificationTopBarKt.NotificationTopBar(listOf, null, null, function03, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, ((i4 << 6) & 7168) | 24576, 6);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (booleanValue) {
                    startRestartGroup.startReplaceGroup(-544221229);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_empty_state_subtitle_opted_out, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-544101507);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_empty_state_subtitle, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str = stringResource;
                com.paypal.pds.core.Icon.Check check = com.paypal.pds.core.Icon.Check.INSTANCE;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_empty_state_title, startRestartGroup, 0);
                java.lang.String stringResource3 = !booleanValue ? null : androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_empty_state_button_title, startRestartGroup, 0);
                boolean changedInstance = startRestartGroup.changedInstance(pushOptInState3);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt.$r8$lambda$Cgwuk5iSlqLab6Kv3xWUNN8qd3Y(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.EmptyStateKt.EmptyState(check, null, null, stringResource2, str, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6, 6);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function02 = function03;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt.$r8$lambda$nxxY4VxiGI3Wg8ARbqzSSjrH36I(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState.this, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Cgwuk5iSlqLab6Kv3xWUNN8qd3Y(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState) {
        if (pushOptInState != null) {
            pushOptInState.requestPermissionOrOpenSettings();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IAGdZr2b1joM4mc53dKSzfEgLTU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1711564523);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1711564523, updateChangedFlags, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIPreview (NotificationCenterEmptyStateUI.kt:93)");
            }
            NotificationCenterEmptyStateUI(null, null, startRestartGroup, 0, 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterEmptyStateUIKt.$r8$lambda$IAGdZr2b1joM4mc53dKSzfEgLTU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UsNHx0ghFnhmx9MqoSiVYcp_CVs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nxxY4VxiGI3Wg8ARbqzSSjrH36I(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NotificationCenterEmptyStateUI(pushOptInState, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
