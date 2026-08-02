package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"ErrorContent", "", "onTry", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "errorUiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/ErrorUiModel;", "onBack", "onClose", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/bnplservicing/ui/common/ErrorUiModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Content", "onTryAgain", "errorContentProvider", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "(Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorContentScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "ErrorContentSheetPreview", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorContentKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel3;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        int i6;
        com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel4 = errorUiModel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1246195024);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(errorUiModel4) : startRestartGroup.changedInstance(errorUiModel4)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                }
                i6 = 128;
                i3 |= i6;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function04 = function03;
                i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i3 & 8339) != 8338, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i5 = i3;
                        function07 = function02;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            errorUiModel4 = new com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel(null, null, 3, null);
                            i3 &= -897;
                        }
                        kotlin.jvm.functions.Function0<kotlin.Unit> function010 = (i2 & 8) != 0 ? null : function02;
                        if (i4 != 0) {
                            errorUiModel3 = errorUiModel4;
                            modifier4 = companion;
                            function08 = function010;
                            function09 = null;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1246195024, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContent (ErrorContent.kt:54)");
                            }
                            int i8 = i3 >> 3;
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(modifier4, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, (i8 & 14) | 48, 2), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing56(), 7, null), com.paypal.oslo.feature.bnplservicing.ui.common.components.Tags.ERROR_ROOT);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                            if (function09 == null) {
                                startRestartGroup.startReplaceGroup(-236143579);
                                com.paypal.oslo.feature.bnplservicing.ui.common.components.ToolBarKt.ToolBar(androidx.compose.foundation.layout.PaddingKt.padding(boxScopeInstance.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(androidx.compose.foundation.layout.WindowInsets_androidKt.getStatusBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6), startRestartGroup, 0)), errorUiModel3.getTitle(), null, function09, startRestartGroup, (i8 & 7168) | 384, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-235798580);
                                startRestartGroup.endReplaceGroup();
                            }
                            getHighSpeedVideoFpsRangesFor(function0, errorUiModel3.getErrorContentProvider(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), 0.0f, function09 == null ? com.paypal.pds.core.ConstantsKt.getSpacing48() : com.paypal.pds.core.ConstantsKt.getSpacing56(), 0.0f, 0.0f, 13, null), startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | (i3 & 14), 0);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            errorUiModel2 = errorUiModel3;
                            function06 = function08;
                            function05 = function09;
                        } else {
                            androidx.compose.ui.Modifier modifier5 = companion;
                            i5 = i3;
                            function07 = function010;
                            modifier2 = modifier5;
                        }
                    }
                    errorUiModel3 = errorUiModel4;
                    function08 = function07;
                    i3 = i5;
                    modifier4 = modifier2;
                    function09 = function04;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 >> 3;
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(modifier4, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, (i82 & 14) | 48, 2), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing56(), 7, null), com.paypal.oslo.feature.bnplservicing.ui.common.components.Tags.ERROR_ROOT);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                    if (function09 == null) {
                    }
                    getHighSpeedVideoFpsRangesFor(function0, errorUiModel3.getErrorContentProvider(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), 0.0f, function09 == null ? com.paypal.pds.core.ConstantsKt.getSpacing48() : com.paypal.pds.core.ConstantsKt.getSpacing56(), 0.0f, 0.0f, 13, null), startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | (i3 & 14), 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    errorUiModel2 = errorUiModel3;
                    function06 = function08;
                    function05 = function09;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    errorUiModel2 = errorUiModel4;
                    modifier3 = modifier2;
                    function05 = function04;
                    function06 = function02;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt.$r8$lambda$p_EtAZf1PhZEMI37xPVmjlC02PI(kotlin.jvm.functions.Function0.this, modifier3, errorUiModel2, function06, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function04 = function03;
            if (startRestartGroup.shouldExecute((i3 & 8339) != 8338, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function04 = function03;
        if (startRestartGroup.shouldExecute((i3 & 8339) != 8338, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1337566403);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(errorContentProvider) : startRestartGroup.changedInstance(errorContentProvider) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1337566403, i4, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.Content (ErrorContent.kt:90)");
                }
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                com.paypal.pds.components.AvatarSource.Icon icon = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.ArrowUUpLeft.INSTANCE);
                com.paypal.pds.components.AvatarSource.Icon icon2 = icon;
                com.paypal.pds.components.AvatarKt.Avatar(icon2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.common.components.Tags.ERROR_ICON), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.XLarge.$stable << 6) | 3120, 48);
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(errorContentProvider.getDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.core.commonui.utils.RefTextKt.value(errorContentProvider.getButtonTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, null, null, null, null, false, false, startRestartGroup, i4 & 14, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt.$r8$lambda$BLuq6NVfN07XyCf2K0SzSCda9Kg(kotlin.jvm.functions.Function0.this, errorContentProvider, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BLuq6NVfN07XyCf2K0SzSCda9Kg(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(function0, errorContentProvider, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Kq4_O-JxYaypftvMKQ1n1UYIf6k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12554$r8$lambda$Kq4_OJxYaypftvMKQ1n1UYIf6k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-414566547);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-414566547, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentSheetPreview (ErrorContent.kt:132)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ErrorContent(function0, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 24582, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt.m12554$r8$lambda$Kq4_OJxYaypftvMKQ1n1UYIf6k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g6hxOI2Jqq-R2Ex8_fQZFeZyB84, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12555$r8$lambda$g6hxOI2JqqR2Ex8_fQZFeZyB84(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1808608802);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1808608802, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentScreenPreview (ErrorContent.kt:119)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel = new com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel("title", null, 2, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ErrorContent(function0, fillMaxSize$default, errorUiModel, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, ((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 6) | 3126, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt.m12555$r8$lambda$g6hxOI2JqqR2Ex8_fQZFeZyB84(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p_EtAZf1PhZEMI37xPVmjlC02PI(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorContent(function0, modifier, errorUiModel, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
