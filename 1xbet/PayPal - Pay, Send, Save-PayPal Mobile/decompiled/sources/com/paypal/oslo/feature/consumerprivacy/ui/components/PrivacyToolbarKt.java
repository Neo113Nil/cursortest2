package com.paypal.oslo.feature.consumerprivacy.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"PrivacyToolbar", "", "title", "", "onNavigationClick", "Lkotlin/Function0;", "toolbarTestTag", "navigationButtonTestTag", "navigationType", "Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyToolbarNavigationType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/consumerprivacy/ui/components/PrivacyToolbarNavigationType;Landroidx/compose/runtime/Composer;II)V", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PrivacyToolbarKt {
    public static final void PrivacyToolbar(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str2, final java.lang.String str3, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType2;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        androidx.compose.runtime.internal.ComposableLambda composableLambda2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-345276245);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(privacyToolbarNavigationType == null ? -1 : privacyToolbarNavigationType.ordinal()) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            privacyToolbarNavigationType2 = privacyToolbarNavigationType;
        } else {
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType3 = i4 != 0 ? com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType.CLOSE : privacyToolbarNavigationType;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-345276245, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbar (PrivacyToolbar.kt:35)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt$PrivacyToolbar$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt$PrivacyToolbar$1$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            if (privacyToolbarNavigationType3 == com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType.BACK) {
                startRestartGroup.startReplaceGroup(322530544);
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-549170214, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.$r8$lambda$1tvqsfnXODDb3TspykhE_6_dGgA(str3, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
                composableLambda = rememberComposableLambda;
            } else {
                startRestartGroup.startReplaceGroup(322728603);
                startRestartGroup.endReplaceGroup();
                composableLambda = null;
            }
            if (privacyToolbarNavigationType3 == com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType.CLOSE) {
                startRestartGroup.startReplaceGroup(322841071);
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-845943392, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.$r8$lambda$26ki9tAQdV1WyBVwuXjAjYGkP0s(str3, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
                composableLambda2 = rememberComposableLambda2;
            } else {
                startRestartGroup.startReplaceGroup(323040091);
                startRestartGroup.endReplaceGroup();
                composableLambda2 = null;
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str2);
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.$r8$lambda$hm5GHH7_ZVHKY3mjuDZelSr33RU(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType4 = privacyToolbarNavigationType3;
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str, androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), focusRequester), false, null, 3, null), null, null, false, composableLambda, composableLambda2, startRestartGroup, i5, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            privacyToolbarNavigationType2 = privacyToolbarNavigationType4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.$r8$lambda$P1rrsvR8bT_P_Y4lo2A88a3P5Mc(str, function0, str2, str3, privacyToolbarNavigationType2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1tvqsfnXODDb3TspykhE_6_dGgA(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-549170214, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbar.<anonymous> (PrivacyToolbar.kt:44)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$26ki9tAQdV1WyBVwuXjAjYGkP0s(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-845943392, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbar.<anonymous> (PrivacyToolbar.kt:53)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P1rrsvR8bT_P_Y4lo2A88a3P5Mc(java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType privacyToolbarNavigationType, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PrivacyToolbar(str, function0, str2, str3, privacyToolbarNavigationType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hm5GHH7_ZVHKY3mjuDZelSr33RU(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
