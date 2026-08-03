package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class w {
    public static final kotlin.Unit a(float f, long j, long j2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(f, j, j2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(float f, int i, float f2, long j, long j2, int i2, androidx.compose.ui.Modifier modifier, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        a(f, i, f2, j, j2, i2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028e A[LOOP:0: B:66:0x01f8->B:70:0x028e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0292 A[EDGE_INSN: B:71:0x0292->B:79:0x0292 BREAK  A[LOOP:0: B:66:0x01f8->B:70:0x028e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, int i, float f2, long j, long j2, int i2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        float f3;
        int i8;
        long j3;
        int i9;
        int i10;
        int i11;
        long m2143getGray0d7_KjU;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        final int i12;
        final long j4;
        final float f4;
        final androidx.compose.ui.Modifier modifier2;
        float f5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-293854230);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = i;
            i5 |= startRestartGroup.changed(i6) ? 32 : 16;
            i7 = i4 & 4;
            if (i7 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                f3 = f2;
                i5 |= startRestartGroup.changed(f3) ? 256 : 128;
                i8 = i4 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    j3 = j;
                    i5 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    i9 = i4 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) != 599186 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        f5 = f;
                        m2143getGray0d7_KjU = j2;
                        i12 = i2;
                        f4 = f3;
                        j4 = j3;
                        modifier2 = modifier;
                    } else {
                        float f6 = i13 == 0 ? 4.8f : f;
                        if (i14 != 0) {
                            i6 = 5;
                        }
                        if (i7 != 0) {
                            f3 = androidx.compose.ui.unit.Dp.m4478constructorimpl(12);
                        }
                        long m2150getWhite0d7_KjU = i8 == 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : j3;
                        m2143getGray0d7_KjU = i9 == 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2143getGray0d7_KjU() : j2;
                        int i15 = i10 == 0 ? 9 : i2;
                        androidx.compose.ui.Modifier modifier3 = i11 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-293854230, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RatingBar (RatingBar.kt:32)");
                        }
                        int floor = (int) java.lang.Math.floor(f6);
                        int roundToInt = kotlin.math.MathKt.roundToInt(10.0f * f6) - (floor * 10);
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceableGroup(1766999607);
                        if (1 <= i6) {
                            int i16 = 1;
                            while (true) {
                                if (i16 <= floor) {
                                    startRestartGroup.startReplaceableGroup(-1057509157);
                                    androidx.compose.material.IconKt.m1413Iconww6aTOc(androidx.compose.material.icons.filled.StarKt.getStar(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f3), m2150getWhite0d7_KjU, startRestartGroup, (i5 & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                } else if (i16 == floor + 1 && 1 <= roundToInt && roundToInt < 10) {
                                    startRestartGroup.startReplaceableGroup(-1057117069);
                                    a(f3, m2150getWhite0d7_KjU, m2143getGray0d7_KjU, startRestartGroup, (i5 >> 6) & 1022, 0);
                                    startRestartGroup.endReplaceableGroup();
                                } else {
                                    startRestartGroup.startReplaceableGroup(-1056869906);
                                    androidx.compose.material.IconKt.m1413Iconww6aTOc(androidx.compose.material.icons.filled.StarKt.getStar(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f3), m2143getGray0d7_KjU, startRestartGroup, ((i5 >> 3) & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                    if (i16 != i6) {
                                        break;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i16 != i6) {
                                }
                            }
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), startRestartGroup, 6);
                        androidx.compose.material.TextKt.m1582TextfLXpl1I(java.lang.String.valueOf(f6), null, androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(i15), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        i12 = i15;
                        j4 = m2150getWhite0d7_KjU;
                        f4 = f3;
                        modifier2 = modifier4;
                        f5 = f6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f7 = f5;
                        final int i17 = i6;
                        final long j5 = m2143getGray0d7_KjU;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a(f7, i17, f4, j4, j5, i12, modifier2, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                j3 = j;
                i9 = i4 & 16;
                if (i9 == 0) {
                }
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) != 599186) {
                }
                if (i13 == 0) {
                }
                if (i14 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int floor2 = (int) java.lang.Math.floor(f6);
                int roundToInt2 = kotlin.math.MathKt.roundToInt(10.0f * f6) - (floor2 * 10);
                androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion2.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                androidx.compose.ui.Modifier modifier42 = modifier3;
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1766999607);
                if (1 <= i6) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), startRestartGroup, 6);
                androidx.compose.material.TextKt.m1582TextfLXpl1I(java.lang.String.valueOf(f6), null, androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(i15), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                i12 = i15;
                j4 = m2150getWhite0d7_KjU;
                f4 = f3;
                modifier2 = modifier42;
                f5 = f6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            i8 = i4 & 8;
            if (i8 != 0) {
            }
            j3 = j;
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) != 599186) {
            }
            if (i13 == 0) {
            }
            if (i14 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int floor22 = (int) java.lang.Math.floor(f6);
            int roundToInt22 = kotlin.math.MathKt.roundToInt(10.0f * f6) - (floor22 * 10);
            androidx.compose.ui.Alignment.Vertical centerVertically22 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy22 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion22.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
            androidx.compose.ui.Modifier modifier422 = modifier3;
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy22, companion22.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion22.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance22 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1766999607);
            if (1 <= i6) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), startRestartGroup, 6);
            androidx.compose.material.TextKt.m1582TextfLXpl1I(java.lang.String.valueOf(f6), null, androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(i15), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            i12 = i15;
            j4 = m2150getWhite0d7_KjU;
            f4 = f3;
            modifier2 = modifier422;
            f5 = f6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i;
        i7 = i4 & 4;
        if (i7 == 0) {
        }
        f3 = f2;
        i8 = i4 & 8;
        if (i8 != 0) {
        }
        j3 = j;
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) != 599186) {
        }
        if (i13 == 0) {
        }
        if (i14 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int floor222 = (int) java.lang.Math.floor(f6);
        int roundToInt222 = kotlin.math.MathKt.roundToInt(10.0f * f6) - (floor222 * 10);
        androidx.compose.ui.Alignment.Vertical centerVertically222 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy222 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = companion222.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
        androidx.compose.ui.Modifier modifier4222 = modifier3;
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rowMeasurePolicy222, companion222.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, companion222.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = companion222.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance222 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1766999607);
        if (1 <= i6) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m622width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m4478constructorimpl(4)), startRestartGroup, 6);
        androidx.compose.material.TextKt.m1582TextfLXpl1I(java.lang.String.valueOf(f6), null, androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(i15), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, 384, 3072, 57330);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        i12 = i15;
        j4 = m2150getWhite0d7_KjU;
        f4 = f3;
        modifier2 = modifier4222;
        f5 = f6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, long j, long j2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        long j3;
        int i4;
        long j4;
        float m4478constructorimpl;
        long j5;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        java.lang.Object rememberedValue;
        final long j6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2016551008);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j3 = j;
            i3 |= startRestartGroup.changed(j3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                j4 = j2;
                i3 |= startRestartGroup.changed(j4) ? 256 : 128;
                if ((i3 & 147) != 146 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    m4478constructorimpl = f2;
                    j5 = j3;
                    j6 = j4;
                } else {
                    m4478constructorimpl = i5 != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(12) : f2;
                    if (i6 != 0) {
                        j3 = androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU();
                    }
                    j5 = j3;
                    long m2143getGray0d7_KjU = i4 != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2143getGray0d7_KjU() : j4;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-2016551008, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HalfStar (RatingBar.kt:82)");
                    }
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.Modifier m617size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion, m4478constructorimpl);
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion2.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m617size3ABfNKs);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.material.icons.Icons icons = androidx.compose.material.icons.Icons.INSTANCE;
                    androidx.compose.material.IconKt.m1413Iconww6aTOc(androidx.compose.material.icons.filled.StarKt.getStar(icons.getDefault()), (java.lang.String) null, boxScopeInstance.matchParentSize(companion), m2143getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
                    androidx.compose.ui.graphics.vector.ImageVector star = androidx.compose.material.icons.filled.StarKt.getStar(icons.getDefault());
                    androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize(companion);
                    startRestartGroup.startReplaceableGroup(-1749583561);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a((androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.material.IconKt.m1413Iconww6aTOc(star, (java.lang.String) null, androidx.compose.ui.draw.DrawModifierKt.drawWithContent(matchParentSize, (kotlin.jvm.functions.Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    j6 = m2143getGray0d7_KjU;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final float f3 = m4478constructorimpl;
                    final long j7 = j5;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w.a(f3, j7, j6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            j4 = j2;
            if ((i3 & 147) != 146) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            j5 = j3;
            if (i4 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier m617size3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion3, m4478constructorimpl);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion22.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m617size3ABfNKs2);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.material.icons.Icons icons2 = androidx.compose.material.icons.Icons.INSTANCE;
            androidx.compose.material.IconKt.m1413Iconww6aTOc(androidx.compose.material.icons.filled.StarKt.getStar(icons2.getDefault()), (java.lang.String) null, boxScopeInstance2.matchParentSize(companion3), m2143getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
            androidx.compose.ui.graphics.vector.ImageVector star2 = androidx.compose.material.icons.filled.StarKt.getStar(icons2.getDefault());
            androidx.compose.ui.Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(companion3);
            startRestartGroup.startReplaceableGroup(-1749583561);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material.IconKt.m1413Iconww6aTOc(star2, (java.lang.String) null, androidx.compose.ui.draw.DrawModifierKt.drawWithContent(matchParentSize2, (kotlin.jvm.functions.Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            j6 = m2143getGray0d7_KjU;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j3 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j4 = j2;
        if ((i3 & 147) != 146) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        j5 = j3;
        if (i4 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.ui.Modifier.Companion companion32 = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier m617size3ABfNKs22 = androidx.compose.foundation.layout.SizeKt.m617size3ABfNKs(companion32, m4478constructorimpl);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion222.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m617size3ABfNKs22);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion222.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.material.icons.Icons icons22 = androidx.compose.material.icons.Icons.INSTANCE;
        androidx.compose.material.IconKt.m1413Iconww6aTOc(androidx.compose.material.icons.filled.StarKt.getStar(icons22.getDefault()), (java.lang.String) null, boxScopeInstance22.matchParentSize(companion32), m2143getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
        androidx.compose.ui.graphics.vector.ImageVector star22 = androidx.compose.material.icons.filled.StarKt.getStar(icons22.getDefault());
        androidx.compose.ui.Modifier matchParentSize22 = boxScopeInstance22.matchParentSize(companion32);
        startRestartGroup.startReplaceableGroup(-1749583561);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.material.IconKt.m1413Iconww6aTOc(star22, (java.lang.String) null, androidx.compose.ui.draw.DrawModifierKt.drawWithContent(matchParentSize22, (kotlin.jvm.functions.Function1) rememberedValue), j5, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        j6 = m2143getGray0d7_KjU;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final kotlin.Unit a(androidx.compose.ui.graphics.drawscope.ContentDrawScope drawWithContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawWithContent.mo2592getSizeNHjbRc()) / 2.0f;
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawWithContent.mo2592getSizeNHjbRc());
        int m2102getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m2102getIntersectrtfAjoo();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawWithContent.getDrawContext();
        long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2601clipRectN_I0leg(0.0f, 0.0f, m1940getWidthimpl, m1937getHeightimpl, m2102getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
        return kotlin.Unit.INSTANCE;
    }
}
