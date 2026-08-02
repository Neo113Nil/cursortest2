package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ConfirmTransactionDetailsViewProviderKt {
    public static final com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$ConfirmTransactionDetailsViewProviderKt INSTANCE = new com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$ConfirmTransactionDetailsViewProviderKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-778416245, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.ComposableSingletons$ConfirmTransactionDetailsViewProviderKt$lambda$-778416245$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_add_promo_code, composer2, 0), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getTitleLarge(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getBold(), 0, 0L, 0, composer2, 24576, 225);
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    /* renamed from: getLambda$-778416245$androidSdkUx_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m10723getLambda$778416245$androidSdkUx_release() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
