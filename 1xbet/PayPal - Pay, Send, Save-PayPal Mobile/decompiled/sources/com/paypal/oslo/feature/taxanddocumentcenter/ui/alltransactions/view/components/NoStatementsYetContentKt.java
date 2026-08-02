package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"NoStatementsYetContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NoStatementsYetContentKt {
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NoStatementsYetContent(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.String str3;
        java.lang.String str4;
        androidx.compose.ui.Modifier.Companion companion;
        java.lang.String str5;
        java.lang.String str6;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(559961295);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str3 = str;
                if (startRestartGroup.changed(str3)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                str3 = str;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                str4 = str2;
                if (startRestartGroup.changed(str4)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                str4 = str2;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            str4 = str2;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
                str5 = str3;
            } else {
                companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    str5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_empty_state_title, startRestartGroup, 0);
                    i3 &= -113;
                } else {
                    str5 = str3;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    str6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_all_transactions_empty_state_description, startRestartGroup, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(559961295, i4, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.NoStatementsYetContent (NoStatementsYetContent.kt:33)");
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "all_transactions_no_statements_state");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    int i8 = i4 << 6;
                    com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Warning.INSTANCE, null, null, str5, str6, null, null, startRestartGroup, (i8 & 7168) | 6 | (i8 & 57344), 102);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }
            i4 = i3;
            str6 = str4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "all_transactions_no_statements_state");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            int i82 = i4 << 6;
            com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Warning.INSTANCE, null, null, str5, str6, null, null, startRestartGroup, (i82 & 7168) | 6 | (i82 & 57344), 102);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            str5 = str3;
            str6 = str4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final androidx.compose.ui.Modifier modifier3 = companion;
            final java.lang.String str7 = str5;
            final java.lang.String str8 = str6;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.NoStatementsYetContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.components.NoStatementsYetContentKt.m20301$r8$lambda$42nKQXTpdsXaLtIdEt6NYVeDuM(androidx.compose.ui.Modifier.this, str7, str8, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$42nKQXTpdsXaLtIdEt6NY-VeDuM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20301$r8$lambda$42nKQXTpdsXaLtIdEt6NYVeDuM(androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NoStatementsYetContent(modifier, str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
