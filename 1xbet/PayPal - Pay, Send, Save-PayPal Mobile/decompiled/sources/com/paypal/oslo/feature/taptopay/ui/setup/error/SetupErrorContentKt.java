package com.paypal.oslo.feature.taptopay.ui.setup.error;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"SetupErrorContainerTestTag", "", "SetupErrorContent", "", "title", "buttonText", "onButtonClick", "Lkotlin/Function0;", "onClose", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "icon", "Lcom/paypal/pds/core/Icon;", "iconContentColor", "Lcom/paypal/pds/core/Color;", "iconBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetupErrorContentKt {
    public static final java.lang.String SetupErrorContainerTestTag = "setup_error_container";

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetupErrorContent(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str3, com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        com.paypal.pds.core.Color color3;
        int i6;
        java.lang.String str4;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str5;
        final com.paypal.pds.core.Icon icon2;
        final com.paypal.pds.core.Color color4;
        final com.paypal.pds.core.Color color5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1581640250);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(icon) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    color3 = color;
                    i3 |= startRestartGroup.changed(color3) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        str4 = "";
                        i3 |= startRestartGroup.changed(color2) ? 8388608 : 4194304;
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            str5 = str3;
                            icon2 = icon;
                            color4 = color3;
                            color5 = color2;
                        } else {
                            java.lang.String str6 = i7 != 0 ? str4 : str3;
                            com.paypal.pds.core.Icon icon3 = i4 != 0 ? com.paypal.pds.core.Icon.Alert.INSTANCE : icon;
                            if (i5 != 0) {
                                color3 = com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE;
                            }
                            com.paypal.pds.core.Color color6 = i6 != 0 ? com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE : color2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1581640250, i3, -1, "com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContent (SetupErrorContent.kt:64)");
                            }
                            int i8 = i3;
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), SetupErrorContainerTestTag);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1229130273, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContentKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContentKt.m20169$r8$lambda$Gwlf5EDV7hebDbP0yEOzU9BYhU(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 13, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                            int i9 = i8 << 12;
                            com.paypal.pds.core.Color color7 = color6;
                            com.paypal.pds.core.Color color8 = color3;
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.EmptyStateKt.EmptyState(icon3, null, new com.paypal.pds.components.AvatarEmphasis.Custom(color3, color6), str, str6.length() > 0 ? str6 : null, str2, function0, startRestartGroup, (3670016 & i9) | ((i8 << 9) & 7168) | ((i8 >> 15) & 14) | (i9 & 458752), 2);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                            composer2.endNode();
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            color5 = color7;
                            color4 = color8;
                            str5 = str6;
                            icon2 = icon3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContentKt.$r8$lambda$L_VaQEO1xrUC5vZ9N3fUfyjW1Mw(str, str2, function0, function02, str5, icon2, color4, color5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str4 = "";
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                color3 = color;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                str4 = "";
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            color3 = color;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            str4 = "";
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        color3 = color;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        str4 = "";
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$Gwlf5EDV7hebD-bP0yEOzU9BYhU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20169$r8$lambda$Gwlf5EDV7hebDbP0yEOzU9BYhU(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1229130273, i, -1, "com.paypal.oslo.feature.taptopay.ui.setup.error.SetupErrorContent.<anonymous>.<anonymous> (SetupErrorContent.kt:73)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L_VaQEO1xrUC5vZ9N3fUfyjW1Mw(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str3, com.paypal.pds.core.Icon icon, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SetupErrorContent(str, str2, function0, function02, str3, icon, color, color2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
