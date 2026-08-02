package com.paypal.oslo.feature.pushnotification.preferences.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"PreferencesScreen", "", "preferencesList", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "preferencesViewModel", "Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesViewModel;", "onToggle", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PushNotificationPreference;", "", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "push-notification_prodRelease", "isUpdating"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreferencesScreenKt {
    public static final void PreferencesScreen(final com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList, final com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference, ? super java.lang.Boolean, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferencesList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferencesViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-41307118);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(preferencesList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(preferencesViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-41307118, i2, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreen (PreferencesScreen.kt:48)");
            }
            final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(preferencesViewModel.isUpdating(), null, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing56()), startRestartGroup, 0);
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pushnotification.R.string.feature_push_notification_preferences_header_title, startRestartGroup, 0), (androidx.compose.ui.Modifier) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 0, 126);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.pushnotification.R.string.feature_push_notification_preferences_header_subtitle, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            startRestartGroup = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1674081781);
            for (final com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference : preferencesList.getPreferences()) {
                com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(pushNotificationPreference.getDisplayText(), null, null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2052668414, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt.m17751$r8$lambda$5gUVHdkK7NzBPL4H8P9KgWH6sc(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference.this, function2, collectAsState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, null, null, null, 8094, null), null, false, null, com.paypal.pds.components.ListStyle.INSTANCE.getDefault(), com.paypal.pds.components.ListAlignment.Center, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (com.paypal.pds.components.ListStyle.$stable << 12), 78);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (((java.lang.Boolean) collectAsState.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(-1337050900);
                com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1337012460);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt.m17752$r8$lambda$cUmCqtsN08wpwi3xJ50JnhpQdA(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList.this, preferencesViewModel, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$5gUVHdkK7N-zBPL4H8P9KgWH6sc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17751$r8$lambda$5gUVHdkK7NzBPL4H8P9KgWH6sc(final com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference, final kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2052668414, i, -1, "com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PreferencesScreen.kt:69)");
            }
            boolean status = pushNotificationPreference.getStatus();
            boolean changed = composer.changed(function2);
            boolean changed2 = composer.changed(pushNotificationPreference);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.pushnotification.preferences.ui.PreferencesScreenKt.$r8$lambda$V7MACVME_CLEjqhm2cuAOjjW9uE(kotlin.jvm.functions.Function2.this, pushNotificationPreference, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.SwitchKt.Switch(status, (kotlin.jvm.functions.Function1) rememberedValue, null, !((java.lang.Boolean) state.getValue()).booleanValue(), composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V7MACVME_CLEjqhm2cuAOjjW9uE(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference, boolean z) {
        function2.invoke(pushNotificationPreference, java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cUmCq-tsN08wpwi3xJ50JnhpQdA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17752$r8$lambda$cUmCqtsN08wpwi3xJ50JnhpQdA(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList, com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        PreferencesScreen(preferencesList, preferencesViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
