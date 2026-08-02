package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class FundsTimingFragmentViewProvider$View$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_funds_timing_fragment_title, composer2, 0);
            int i = com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24;
            final com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider = this.getHighSpeedVideoFpsRanges;
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(stringResource, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$1.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider.this);
                }
            }, i, null, 0L, false, null, true, false, 0, composer2, 12779520, 856);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider) {
        kotlin.jvm.functions.Function0 function0;
        function0 = fundsTimingFragmentViewProvider.getHighSpeedVideoFpsRangesFor;
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    FundsTimingFragmentViewProvider$View$1(com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider) {
        this.getHighSpeedVideoFpsRanges = fundsTimingFragmentViewProvider;
    }
}
