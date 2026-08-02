package com.paypal.android.threeds;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ThreeDsNavGraphKt {
    public static final com.paypal.android.threeds.ComposableSingletons$ThreeDsNavGraphKt INSTANCE = new com.paypal.android.threeds.ComposableSingletons$ThreeDsNavGraphKt();
    private static kotlin.jvm.functions.Function3<androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(51528036, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ComposableSingletons$ThreeDsNavGraphKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.android.threeds.ComposableSingletons$ThreeDsNavGraphKt.m10985$r8$lambda$8PhMA7TR5uqCUl0mMtbjeLe2bE((androidx.view.NavBackStackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$8PhMA7-TR5uqCUl0mMtbjeLe2bE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10985$r8$lambda$8PhMA7TR5uqCUl0mMtbjeLe2bE(androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(51528036, i, -1, "com.paypal.android.threeds.ComposableSingletons$ThreeDsNavGraphKt.lambda$51528036.<anonymous> (ThreeDsNavGraph.kt:38)");
        }
        com.paypal.android.threeds.ui.OnBoardingProgressScreenKt.OnBoardingProgressScreen(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.view.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$51528036$three_ds_release() {
        return getHighSpeedVideoSizes;
    }
}
