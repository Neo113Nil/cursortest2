package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a%\u0010\u000e\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u000f\u001aI\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"CommonOptionsBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "options", "", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/BottomSheetOption;", "modifier", "Landroidx/compose/ui/Modifier;", "onDismiss", "Lkotlin/Function0;", "onCloseButtonClick", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "wrapOptionsWithSheetDismiss", "CommonOptionsContent", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionRow", "icon", "Lcom/paypal/pds/core/Icon;", "text", "", "onClick", "isFirst", "", "isLast", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "user-profile_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonOptionsBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonOptionsBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        kotlin.jvm.functions.Function0<kotlin.Unit> onCloseButtonClick;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1044420799);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function03 = function0;
                    if (startRestartGroup.changedInstance(function03)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    function03 = function0;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                function03 = function0;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    function04 = function02;
                    if (startRestartGroup.changedInstance(function04)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    function04 = function02;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                function04 = function02;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                    function06 = function03;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        function05 = com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults.INSTANCE.onDismiss(bottomSheetController);
                        i3 &= -7169;
                    } else {
                        function05 = function03;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        modifier3 = companion;
                        function06 = function05;
                        onCloseButtonClick = com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetDefaults.INSTANCE.onCloseButtonClick(bottomSheetController);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1044420799, i3, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheet (CommonOptionsBottomSheet.kt:97)");
                        }
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function06, null, null, null, null, onCloseButtonClick, true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1479787880, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.$r8$lambda$TsZRsVwoZNa2LigYHMNgom3t0wM(list, bottomSheetController, modifier3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 6) & 3670016), 316);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function03 = function06;
                        function04 = onCloseButtonClick;
                        modifier2 = modifier4;
                    } else {
                        modifier3 = companion;
                        function06 = function05;
                    }
                }
                onCloseButtonClick = function04;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.ui.Modifier modifier42 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function06, null, null, null, null, onCloseButtonClick, true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1479787880, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.$r8$lambda$TsZRsVwoZNa2LigYHMNgom3t0wM(list, bottomSheetController, modifier3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 6) & 3670016), 316);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                function03 = function06;
                function04 = onCloseButtonClick;
                modifier2 = modifier42;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.$r8$lambda$SEu7a055Lhmz3N2Rahf0GYcYroo(com.paypal.pds.components.BottomSheetController.this, list, modifier2, function03, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> wrapOptionsWithSheetDismiss(java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> list, final com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption bottomSheetOption : list2) {
            arrayList.add(com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption.copy$default(bottomSheetOption, null, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.$r8$lambda$o3Am69usGfuJMRUtKs5nvxNePME(com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption.this, bottomSheetController);
                }
            }, 3, null));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonOptionsContent(final java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-756699242);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-756699242, i3, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsContent (CommonOptionsBottomSheet.kt:144)");
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                startRestartGroup.startReplaceGroup(-1762581144);
                int i5 = 0;
                for (java.lang.Object obj : list) {
                    if (i5 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption bottomSheetOption = (com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption) obj;
                    OptionRow(bottomSheetOption.getIcon(), bottomSheetOption.getText(), bottomSheetOption.getOnClick(), null, i5 == 0, i5 == kotlin.collections.CollectionsKt.getLastIndex(list), startRestartGroup, 0, 8);
                    i5++;
                    modifier3 = modifier3;
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.$r8$lambda$tlfN8ZyTGYAKUxfOGtLEH5_ig4c(list, modifier2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionRow(final com.paypal.pds.core.Icon icon, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final boolean z4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1442845035);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z4 = z2;
                        modifier3 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 != 0 ? false : z3;
                        boolean z6 = i5 != 0 ? false : z2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1442845035, i6, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.OptionRow (CommonOptionsBottomSheet.kt:181)");
                        }
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, com.paypal.pds.core.PDSIndication.None.INSTANCE, false, null, null, function0, startRestartGroup, ((i6 << 12) & 3670016) | 432, 28), 0.0f, z5 ? com.paypal.pds.core.ConstantsKt.getSpacing4() : com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, z6 ? com.paypal.pds.core.ConstantsKt.getSpacing4() : com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.IconKt.Icon(icon, str, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i6 & 14) | 27648 | (i6 & 112), 4);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, ((i6 >> 3) & 14) | 384, 6, 1018);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z3 = z5;
                        z4 = z6;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.$r8$lambda$3pvmeO_AuquHKwDeZ4ewT4IoImY(com.paypal.pds.core.Icon.this, str, function0, modifier3, z3, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3pvmeO_AuquHKwDeZ4ewT4IoImY(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OptionRow(icon, str, function0, modifier, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SEu7a055Lhmz3N2Rahf0GYcYroo(com.paypal.pds.components.BottomSheetController bottomSheetController, java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CommonOptionsBottomSheet(bottomSheetController, list, modifier, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TsZRsVwoZNa2LigYHMNgom3t0wM(java.util.List list, com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1479787880, i, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheet.<anonymous> (CommonOptionsBottomSheet.kt:104)");
            }
            CommonOptionsContent(wrapOptionsWithSheetDismiss(list, bottomSheetController), modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o3Am69usGfuJMRUtKs5nvxNePME(com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption bottomSheetOption, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetOption.getOnClick().invoke();
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tlfN8ZyTGYAKUxfOGtLEH5_ig4c(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CommonOptionsContent(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
