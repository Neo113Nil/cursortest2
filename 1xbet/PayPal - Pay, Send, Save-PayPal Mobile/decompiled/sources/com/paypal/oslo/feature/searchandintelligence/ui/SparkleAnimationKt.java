package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002"}, d2 = {"SparkleAnimation", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SparkleAnimationPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SparkleAnimationKt {
    public static final void SparkleAnimation(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(199839516);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(199839516, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimation (SparkleAnimation.kt:33)");
            }
            androidx.compose.ui.Modifier modifier4 = modifier3;
            composer2 = startRestartGroup;
            com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation(com.airbnb.lottie.compose.RememberLottieCompositionKt.rememberLottieComposition(com.airbnb.lottie.compose.LottieCompositionSpec.Asset.m9890boximpl(com.airbnb.lottie.compose.LottieCompositionSpec.Asset.m9891constructorimpl("sparkle_thinking.lottie")), null, null, null, null, null, startRestartGroup, 6, 62).getValue(), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier3, androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composer2, 1572864, 0, 0, 4194236);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationKt.m19170$r8$lambda$XufflnZpFcRUGDtWoyWwuzR5yI(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XEFTJRGcXJzce9qGhNL1OqgsRac(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(408227875);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(408227875, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationPreview (SparkleAnimation.kt:47)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$SparkleAnimationKt.INSTANCE.m19153getLambda$1326581718$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.SparkleAnimationKt.$r8$lambda$XEFTJRGcXJzce9qGhNL1OqgsRac(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xuff-lnZpFcRUGDtWoyWwuzR5yI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19170$r8$lambda$XufflnZpFcRUGDtWoyWwuzR5yI(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SparkleAnimation(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
