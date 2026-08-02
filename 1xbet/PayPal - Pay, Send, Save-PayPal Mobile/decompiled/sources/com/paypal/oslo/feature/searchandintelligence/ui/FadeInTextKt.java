package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"MaxAnimatedChars", "", "CharsPerTick", "DefaultFadeInDelayMs", "", "FadeInText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "delay", "Lkotlin/time/Duration;", "maxLines", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "FadeInText-L_NoWuw", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;II)V", "FadeInTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease", "visibleChars"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FadeInTextKt {
    public static final int CharsPerTick = 2;
    public static final long DefaultFadeInDelayMs = 12;
    public static final int MaxAnimatedChars = 700;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005f  */
    /* renamed from: FadeInText-L_NoWuw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19159FadeInTextL_NoWuw(final java.lang.String str, androidx.compose.ui.Modifier modifier, long j, int i, int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final long j3;
        final int i10;
        final int i11;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(550017537);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 384) != 0) {
                j2 = j;
                i5 |= ((i4 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : 128;
            } else {
                j2 = j;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i7 = i;
                i5 |= startRestartGroup.changed(i7) ? 2048 : 1024;
                i8 = i4 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    i9 = i2;
                    i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                    if (!startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            modifier4 = modifier2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i4 & 4) != 0) {
                                kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
                                i5 &= -897;
                                j2 = kotlin.time.DurationKt.toDuration(12L, kotlin.time.DurationUnit.MILLISECONDS);
                            }
                            if (i6 != 0) {
                                i7 = Integer.MAX_VALUE;
                            }
                            if (i8 != 0) {
                                i9 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
                            }
                            modifier4 = companion;
                        }
                        int i13 = i7;
                        int i14 = i9;
                        long j4 = j2;
                        int i15 = i5;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(550017537, i15, -1, "com.paypal.oslo.feature.searchandintelligence.ui.FadeInText (FadeInText.kt:60)");
                        }
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
                        int min = java.lang.Math.min(str.length(), 700);
                        boolean changed = startRestartGroup.changed(min);
                        boolean z = (((i15 & 896) ^ 384) > 256 && startRestartGroup.changed(j4)) || (i15 & 384) == 256;
                        int i16 = i15 & 14;
                        boolean z2 = i16 == 4;
                        com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$FadeInText$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((changed | z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$FadeInText$1$1(min, j4, str, mutableIntState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i16);
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(kotlin.text.StringsKt.take(str, mutableIntState.getIntValue()), modifier4, null, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(i14), false, i13, 0, null, null, composer2, (i15 & 112) | ((i15 << 3) & 458752) | ((i15 << 12) & 29360128), 0, 1884);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        j3 = j4;
                        modifier3 = modifier4;
                        i10 = i13;
                        i11 = i14;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j3 = j2;
                        i10 = i7;
                        i11 = i9;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt.$r8$lambda$AnPHDJr_nKhtqDldFM32V8uYBRE(str, modifier3, j3, i10, i11, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i9 = i2;
                if (!startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i;
            i8 = i4 & 16;
            if (i8 != 0) {
            }
            i9 = i2;
            if (!startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 384) != 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 16;
        if (i8 != 0) {
        }
        i9 = i2;
        if (!startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AnPHDJr_nKhtqDldFM32V8uYBRE(java.lang.String str, androidx.compose.ui.Modifier modifier, long j, int i, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        m19159FadeInTextL_NoWuw(str, modifier, j, i, i2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZkZFCs3d6QNX3DX01VHVu4LJZEM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1464261667);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1464261667, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextPreview (FadeInText.kt:87)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$FadeInTextKt.INSTANCE.m19144getLambda$634497366$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt.$r8$lambda$ZkZFCs3d6QNX3DX01VHVu4LJZEM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
