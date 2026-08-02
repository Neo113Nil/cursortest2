package com.paypal.oslo.feature.ads.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\bX\u008a\u008e\u0002²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002"}, d2 = {"ViewableImpressionDwellMs", "", "ViewableImpressionThreshold", "", "trackViewableImpression", "Landroidx/compose/ui/Modifier;", "onViewableImpression", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "ads_prodRelease", "isAboveThreshold", "hasFired", "currentOnViewableImpression"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdImpressionModifierKt {
    public static final long ViewableImpressionDwellMs = 1000;
    public static final float ViewableImpressionThreshold = 0.5f;

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.Modifier trackViewableImpression(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1533926373, i, -1, "com.paypal.oslo.feature.ads.ui.trackViewableImpression (AdImpressionModifier.kt:45)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 3) & 14);
        boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        boolean changed = composer.changed(rememberUpdatedState);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.ads.ui.AdImpressionModifierKt$trackViewableImpression$1$1(mutableState, mutableState2, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer, 0);
        if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
            composer.startReplaceGroup(-1250330807);
        } else {
            composer.startReplaceGroup(-1250302194);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.ui.AdImpressionModifierKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.ads.ui.AdImpressionModifierKt.$r8$lambda$rvHcotsr7ZLHgwZR2WzXsG8McHE(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.ads.ui.AdVisibilityInfo) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            modifier = com.paypal.oslo.feature.ads.ui.AdVisibilityTrackerKt.trackAdVisibility(modifier, (kotlin.jvm.functions.Function1) rememberedValue4, composer, (i & 14) | 48);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return modifier;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rvHcotsr7ZLHgwZR2WzXsG8McHE(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.ads.ui.AdVisibilityInfo adVisibilityInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adVisibilityInfo, "");
        mutableState.setValue(java.lang.Boolean.valueOf(adVisibilityInfo.isAboveThreshold()));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$trackViewableImpression$lambda$6(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }
}
