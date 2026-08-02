package com.paypal.oslo.feature.cryptocurrency.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001ae\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"CryptoActionButtonsCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "showSend", "", "onSendClick", "Lkotlin/Function0;", "showReceive", "onReceiveClick", "showConvert", "onConvertClick", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ActionButton", "icon", "Lcom/paypal/pds/core/Icon;", "label", "", "onClick", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CryptoActionButtonsCardAllButtonsPreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoActionButtonsCardReceiveOnlyPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoActionButtonsCardKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoActionButtonsCard(androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z3, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i5;
        boolean z4;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i7;
        boolean z5;
        int i8;
        androidx.compose.ui.Modifier modifier2;
        boolean z6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final boolean z7;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final boolean z8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-979005221);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function04 = function0;
                i3 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function05 = function02;
                        i3 |= startRestartGroup.changedInstance(function05) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            z5 = z3;
                            i3 |= startRestartGroup.changed(z5) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z6 = z;
                                function06 = function03;
                                z7 = z4;
                                function07 = function05;
                                z8 = z5;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                boolean z9 = i10 != 0 ? false : z;
                                if (i4 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function08 = (kotlin.jvm.functions.Function0) rememberedValue;
                                } else {
                                    function08 = function04;
                                }
                                boolean z10 = i5 != 0 ? true : z4;
                                if (i6 != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function09 = (kotlin.jvm.functions.Function0) rememberedValue2;
                                } else {
                                    function09 = function05;
                                }
                                boolean z11 = i7 != 0 ? false : z5;
                                if (i8 != 0) {
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function010 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                } else {
                                    function010 = function03;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-979005221, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCard (CryptoActionButtonsCard.kt:58)");
                                }
                                final boolean z12 = z9;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function011 = function08;
                                final boolean z13 = z10;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function012 = function09;
                                final boolean z14 = z11;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function013 = function010;
                                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1172106817, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt.m13821$r8$lambda$X8aCxr4TSgNSeWgfqq3SqTBWMk(z12, function011, z13, function012, z14, function013, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, 500);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function04 = function08;
                                z7 = z10;
                                function07 = function09;
                                z8 = z11;
                                function06 = function010;
                                z6 = z9;
                                modifier2 = companion;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final boolean z15 = z6;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function014 = function04;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt.$r8$lambda$ImTohvowMN6JAernUDfhKBlFjrQ(androidx.compose.ui.Modifier.this, z15, function014, z7, function07, z8, function06, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        z5 = z3;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function05 = function02;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    z5 = z3;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function05 = function02;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                z5 = z3;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function04 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function05 = function02;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z5 = z3;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function04 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function05 = function02;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z5 = z3;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final java.lang.String str2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1450027352);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            function02 = function0;
            str2 = str;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1450027352, i2, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.ActionButton (CryptoActionButtonsCard.kt:111)");
            }
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, centerHorizontally, startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            int i4 = i2 >> 3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.IconButtonKt.IconButton(icon, function0, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, str, null, false, false, startRestartGroup, (i2 & 14) | 27648 | (i4 & 112) | ((i2 << 12) & 458752), 448);
            i3 = i;
            function02 = function0;
            str2 = str;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer2, (i4 & 14) | 384, 6, 1018);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt.m13822$r8$lambda$fiqwsk1HzQdOOxgzH6HZVziDCo(com.paypal.pds.core.Icon.this, str2, function02, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ImTohvowMN6JAernUDfhKBlFjrQ(androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function0 function0, boolean z2, kotlin.jvm.functions.Function0 function02, boolean z3, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoActionButtonsCard(modifier, z, function0, z2, function02, z3, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X8aCxr4TSgNSeWgfqq3SqTB-WMk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13821$r8$lambda$X8aCxr4TSgNSeWgfqq3SqTBWMk(boolean z, kotlin.jvm.functions.Function0 function0, boolean z2, kotlin.jvm.functions.Function0 function02, boolean z3, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1172106817, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCard.<anonymous> (CryptoActionButtonsCard.kt:64)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceEvenly(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (z) {
                composer.startReplaceGroup(-504035000);
                getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.core.Icon.Paperplane.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_send_button, composer, 0), function0, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-503799555);
                composer.endReplaceGroup();
            }
            if (z2) {
                composer.startReplaceGroup(-503709624);
                getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.core.Icon.Scan.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_receive_button, composer, 0), function02, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-503474179);
                composer.endReplaceGroup();
            }
            if (z3) {
                composer.startReplaceGroup(-503383907);
                getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.core.Icon.ArrowsLeftRight.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_action_convert_button, composer, 0), function03, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-503137891);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_f2jcXdjQG821AQW5ezsoZCcUuA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2100928995);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2100928995, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardReceiveOnlyPreview (CryptoActionButtonsCard.kt:151)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            CryptoActionButtonsCard(null, false, null, true, (kotlin.jvm.functions.Function0) rememberedValue, false, null, startRestartGroup, 27648, 103);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt.$r8$lambda$_f2jcXdjQG821AQW5ezsoZCcUuA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fiqwsk1HzQdOOx-gzH6HZVziDCo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13822$r8$lambda$fiqwsk1HzQdOOxgzH6HZVziDCo(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(icon, str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yLeM8WBIjz8lQiqv5ju7R9NXm1w(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1677287302);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1677287302, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardAllButtonsPreview (CryptoActionButtonsCard.kt:136)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda7
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CryptoActionButtonsCard(null, true, function0, true, function02, true, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 1797552, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoActionButtonsCardKt.$r8$lambda$yLeM8WBIjz8lQiqv5ju7R9NXm1w(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
