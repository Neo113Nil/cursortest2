package com.paypal.oslo.feature.ads.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/ads/ui/AdVisibilityInfo;", "", "onVisibilityChange", "trackAdVisibility", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdVisibilityTrackerKt {
    public static final androidx.compose.ui.Modifier trackAdVisibility(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.ads.ui.AdVisibilityInfo, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1347372785, i, -1, "com.paypal.oslo.feature.ads.ui.trackAdVisibility (AdVisibilityTracker.kt:43)");
        }
        final android.view.View view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32;
        boolean changedInstance = composer.changedInstance(view);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((z | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.ads.ui.AdVisibilityTrackerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.ads.ui.AdVisibilityTrackerKt.$r8$lambda$49g_cxPSPd7c_fAcsktVp7_xFIs(kotlin.jvm.functions.Function1.this, view, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier then = modifier.then(androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (kotlin.jvm.functions.Function1) rememberedValue));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return then;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$49g_cxPSPd7c_fAcsktVp7_xFIs(kotlin.jvm.functions.Function1 function1, android.view.View view, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        if (!layoutCoordinates.isAttached()) {
            function1.invoke(new com.paypal.oslo.feature.ads.ui.AdVisibilityInfo(false, 0.0f, androidx.compose.ui.geometry.Rect.INSTANCE.getZero(), false));
            return kotlin.Unit.INSTANCE;
        }
        androidx.compose.ui.geometry.Rect boundsInWindow$default = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        float f = iArr[0] - iArr2[0];
        float f2 = iArr[1] - iArr2[1];
        androidx.compose.ui.geometry.Rect rect = view.getGlobalVisibleRect(new android.graphics.Rect()) ? new androidx.compose.ui.geometry.Rect(r5.left - f, r5.top - f2, r5.right - f, r5.bottom - f2) : boundsInWindow$default;
        float max = java.lang.Math.max(boundsInWindow$default.getLeft(), rect.getLeft());
        float min = java.lang.Math.min(boundsInWindow$default.getRight(), rect.getRight());
        float max2 = java.lang.Math.max(boundsInWindow$default.getTop(), rect.getTop());
        float min2 = java.lang.Math.min(boundsInWindow$default.getBottom(), rect.getBottom());
        float max3 = java.lang.Math.max(0.0f, min - max);
        float max4 = java.lang.Math.max(0.0f, min2 - max2);
        float mo7361getSizeYbymL2g = ((int) (layoutCoordinates.mo7361getSizeYbymL2g() >> 32)) * ((int) (layoutCoordinates.mo7361getSizeYbymL2g() & 4294967295L));
        if (mo7361getSizeYbymL2g <= 0.0f) {
            function1.invoke(new com.paypal.oslo.feature.ads.ui.AdVisibilityInfo(false, 0.0f, boundsInWindow$default, false));
            return kotlin.Unit.INSTANCE;
        }
        float coerceIn = kotlin.ranges.RangesKt.coerceIn((max3 * max4) / mo7361getSizeYbymL2g, 0.0f, 1.0f);
        function1.invoke(new com.paypal.oslo.feature.ads.ui.AdVisibilityInfo(coerceIn > 0.0f, coerceIn, boundsInWindow$default, coerceIn >= 0.5f));
        return kotlin.Unit.INSTANCE;
    }
}
