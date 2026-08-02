package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aI\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"ShimmerDurationMillis", "", "ShimmerGradientWidth", "", "ShimmerTravelDistance", "TextShimmer", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "baseColor", "Landroidx/compose/ui/graphics/Color;", "shimmerColor", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/TextStyle;", "durationMillis", "TextShimmer-Y0xEhic", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "TextShimmerPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TextShimmerKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0057  */
    /* renamed from: TextShimmer-Y0xEhic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19171TextShimmerY0xEhic(final java.lang.String str, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.text.TextStyle textStyle, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        long j3;
        long j4;
        int i5;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i6;
        final androidx.compose.ui.Modifier modifier3;
        final long j5;
        final long j6;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1453434438);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 256;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 128;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 2048;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 1024;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                textStyle2 = textStyle;
                i4 |= startRestartGroup.changed(textStyle2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(i) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            j3 = com.paypal.pds.core.Color.ContentFaint.INSTANCE.getValue(startRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            j4 = com.paypal.pds.core.Color.ContentBase.INSTANCE.getValue(startRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            textStyle2 = androidx.compose.ui.text.TextStyle.INSTANCE.getDefault();
                        }
                        if (i6 != 0) {
                            i8 = 1600;
                            androidx.compose.ui.Modifier modifier4 = modifier2;
                            long j7 = j3;
                            long j8 = j4;
                            androidx.compose.ui.text.TextStyle textStyle4 = textStyle2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1453434438, i4, -1, "com.paypal.oslo.feature.searchandintelligence.ui.TextShimmer (TextShimmer.kt:68)");
                            }
                            float floatValue = ((androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition("text-shimmer", startRestartGroup, 6, 0), 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i8, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), androidx.compose.animation.core.RepeatMode.Restart, 0L, 4, null), "shimmer-phase", startRestartGroup, (androidx.compose.animation.core.InfiniteTransition.$stable | 25008) | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0).getValue().floatValue() * 120.0f) * 2.0f) - 120.0f;
                            int i12 = i8;
                            androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw(str, modifier4, androidx.compose.ui.text.TextStyle.m8050copyNs73l9s$default(textStyle4, androidx.compose.ui.graphics.Brush.Companion.m5945linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m5986boximpl(j7), androidx.compose.ui.graphics.Color.m5986boximpl(j8), androidx.compose.ui.graphics.Color.m5986boximpl(j7)}), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue + 120.0f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), 0, 8, (java.lang.Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, startRestartGroup, i4 & 126, 1016);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            i7 = i12;
                            modifier3 = modifier4;
                            j5 = j7;
                            j6 = j8;
                            textStyle3 = textStyle4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    i8 = i;
                    androidx.compose.ui.Modifier modifier42 = modifier2;
                    long j72 = j3;
                    long j82 = j4;
                    androidx.compose.ui.text.TextStyle textStyle42 = textStyle2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    float floatValue2 = ((androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition("text-shimmer", startRestartGroup, 6, 0), 0.0f, 1.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i8, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), androidx.compose.animation.core.RepeatMode.Restart, 0L, 4, null), "shimmer-phase", startRestartGroup, (androidx.compose.animation.core.InfiniteTransition.$stable | 25008) | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0).getValue().floatValue() * 120.0f) * 2.0f) - 120.0f;
                    int i122 = i8;
                    androidx.compose.foundation.text.BasicTextKt.m2006BasicTextRWo7tUw(str, modifier42, androidx.compose.ui.text.TextStyle.m8050copyNs73l9s$default(textStyle42, androidx.compose.ui.graphics.Brush.Companion.m5945linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m5986boximpl(j72), androidx.compose.ui.graphics.Color.m5986boximpl(j82), androidx.compose.ui.graphics.Color.m5986boximpl(j72)}), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue2) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(floatValue2 + 120.0f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), 0, 8, (java.lang.Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, 0, false, 0, 0, (androidx.compose.ui.graphics.ColorProducer) null, (androidx.compose.foundation.text.TextAutoSize) null, startRestartGroup, i4 & 126, 1016);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    i7 = i122;
                    modifier3 = modifier42;
                    j5 = j72;
                    j6 = j82;
                    textStyle3 = textStyle42;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j5 = j3;
                    j6 = j4;
                    textStyle3 = textStyle2;
                    i7 = i;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerKt.$r8$lambda$ZZT_6xelDB95fjnQRKzL1XJ8Pxo(str, modifier3, j5, j6, textStyle3, i7, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            textStyle2 = textStyle;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        textStyle2 = textStyle;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZZT_6xelDB95fjnQRKzL1XJ8Pxo(java.lang.String str, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.text.TextStyle textStyle, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m19171TextShimmerY0xEhic(str, modifier, j, j2, textStyle, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wkwxT6QbWld7U4wFLbrJEDd73tU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1999477549);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1999477549, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerPreview (TextShimmer.kt:104)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$TextShimmerKt.INSTANCE.m19155getLambda$272279142$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.TextShimmerKt.$r8$lambda$wkwxT6QbWld7U4wFLbrJEDd73tU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
