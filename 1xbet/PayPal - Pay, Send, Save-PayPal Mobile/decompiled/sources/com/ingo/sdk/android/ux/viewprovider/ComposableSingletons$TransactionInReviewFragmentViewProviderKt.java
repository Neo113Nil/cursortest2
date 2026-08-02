package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TransactionInReviewFragmentViewProviderKt {
    public static final com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$TransactionInReviewFragmentViewProviderKt INSTANCE = new com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$TransactionInReviewFragmentViewProviderKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(767410165, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$TransactionInReviewFragmentViewProviderKt$lambda$767410165$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$767410165$androidSdkUx_release() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
