package com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$PublicProfileScreenKt {
    public static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.ComposableSingletons$PublicProfileScreenKt INSTANCE = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.ComposableSingletons$PublicProfileScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2126515642, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.ComposableSingletons$PublicProfileScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.ComposableSingletons$PublicProfileScreenKt.$r8$lambda$f6SSykS8JjdPEL73LfkeJQCYjTY((androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$f6SSykS8JjdPEL73LfkeJQCYjTY(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2126515642, i, -1, "com.paypal.oslo.feature.publicprofile.ui.publicprofile.composable.ComposableSingletons$PublicProfileScreenKt.lambda$2126515642.<anonymous> (PublicProfileScreen.kt:510)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.publicprofile.R.string.feature_public_profile_error_banner, composer, 0);
        com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 2, null), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, stringResource, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, composer, 48, 120);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2126515642$public_profile_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
