package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0015\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\r\u001a8\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u0006H\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BaselinesOffsetColumn", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "content", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        int i5;
        boolean z2;
        int i6;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        int i7;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        final boolean z3;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1618131318);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function26 = function22;
                i3 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function27 = function23;
                        i3 |= startRestartGroup.changedInstance(function27) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function28 = function2;
                            function29 = function24;
                            z3 = z2;
                            function210 = function27;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            function28 = i9 != 0 ? null : function2;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212 = i4 != 0 ? null : function26;
                            boolean z4 = i5 != 0 ? true : z2;
                            if (i6 != 0) {
                                function27 = null;
                            }
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213 = i7 == 0 ? function24 : null;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1618131318, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                            }
                            androidx.compose.material.Typography typography = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> highSpeedVideoSizes = getHighSpeedVideoSizes(typography.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function25);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> highSpeedVideoSizes2 = getHighSpeedVideoSizes(typography.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function212);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> highSpeedVideoSizes3 = getHighSpeedVideoSizes(typography.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function27);
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> highSpeedVideoSizes4 = getHighSpeedVideoSizes(typography.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function213);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, (kotlin.jvm.functions.Function1) rememberedValue);
                            if (highSpeedVideoSizes2 == null && highSpeedVideoSizes3 == null) {
                                startRestartGroup.startReplaceGroup(-961949257);
                                function211 = function27;
                                androidx.compose.material.OneLine.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(semantics, function28, highSpeedVideoSizes, highSpeedVideoSizes4, startRestartGroup, (i3 & 112) | 24576, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                function211 = function27;
                                if ((highSpeedVideoSizes3 == null && z4) || highSpeedVideoSizes2 == null) {
                                    startRestartGroup.startReplaceGroup(-961749989);
                                    androidx.compose.material.TwoLine.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(semantics, function28, highSpeedVideoSizes, highSpeedVideoSizes2, highSpeedVideoSizes3, highSpeedVideoSizes4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-961536647);
                                    androidx.compose.material.ThreeLine.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(semantics, function28, highSpeedVideoSizes, highSpeedVideoSizes2, highSpeedVideoSizes3, highSpeedVideoSizes4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                    startRestartGroup.endReplaceGroup();
                                }
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function26 = function212;
                            function210 = function211;
                            z3 = z4;
                            function29 = function213;
                            modifier2 = companion;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = function28;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = function26;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material.ListItemKt.m2651$r8$lambda$ca93fKcZ7kiM4VoN87AlK3mOA8(androidx.compose.ui.Modifier.this, function214, function215, z3, function210, function29, function25, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function27 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function27 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function26 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function27 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function26 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function27 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(final java.util.List<androidx.compose.ui.unit.Dp> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(872528548);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(872528548, i3, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:364)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(list);
            androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$1(list);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((((((((i3 >> 6) & 14) | (i3 & 112)) << 6) & 896) | 6) >> 6) & 14));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.ListItemKt.$r8$lambda$9qJ0IWnMUa2qmSnC8RblKJN9JeY(list, modifier2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRanges(final float f, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(953221030);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(953221030, i3, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:403)");
            }
            boolean z = (i3 & 14) == 4;
            androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1(f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf(((((((i3 & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6) >> 6) & 14));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.ListItemKt.$r8$lambda$uQajjjiCeUJTAAUHSQAJQsQ1vLc(f, modifier2, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes(final androidx.compose.ui.text.TextStyle textStyle, final float f, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        if (function2 == null) {
            return null;
        }
        final androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle = new androidx.compose.ui.text.style.LineHeightStyle(androidx.compose.ui.text.style.LineHeightStyle.Alignment.INSTANCE.m8411getProportionalPIaL0Z0(), androidx.compose.ui.text.style.LineHeightStyle.Trim.INSTANCE.m8432getBothEVpEnUU(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1000595778, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.material.ListItemKt.$r8$lambda$H5JeQRWjUdTnoDs5PgbYQr6pBYU(f, textStyle, lineHeightStyle, function2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9qJ0IWnMUa2qmSnC8RblKJN9JeY(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(list, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H5JeQRWjUdTnoDs5PgbYQr6pBYU(float f, final androidx.compose.ui.text.TextStyle textStyle, final androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, final kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1000595778, i, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:438)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(f)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-925826178, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material.ListItemKt.$r8$lambda$skV8SxR00D7P3JQVgkQmedqdoQo(androidx.compose.ui.text.TextStyle.this, lineHeightStyle, function2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ca93fKcZ7kiM-4VoN87AlK3mOA8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2651$r8$lambda$ca93fKcZ7kiM4VoN87AlK3mOA8(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, boolean z, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function2 function25, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ListItem(modifier, function2, function22, z, function23, function24, function25, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$skV8SxR00D7P3JQVgkQmedqdoQo(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.text.style.LineHeightStyle lineHeightStyle, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.text.TextStyle m8065copyp1EtxEg;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-925826178, i, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:439)");
            }
            m8065copyp1EtxEg = textStyle.m8065copyp1EtxEg((r48 & 1) != 0 ? textStyle.spanStyle.m7982getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : null, (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (r48 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
            androidx.compose.material.TextKt.ProvideTextStyle(m8065copyp1EtxEg, function2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uQajjjiCeUJTAAUHSQAJQsQ1vLc(float f, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(f, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
