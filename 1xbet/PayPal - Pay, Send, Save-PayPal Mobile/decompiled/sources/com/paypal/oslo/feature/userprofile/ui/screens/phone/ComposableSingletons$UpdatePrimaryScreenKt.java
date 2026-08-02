package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$UpdatePrimaryScreenKt {
    public static final com.paypal.oslo.feature.userprofile.ui.screens.phone.ComposableSingletons$UpdatePrimaryScreenKt INSTANCE = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ComposableSingletons$UpdatePrimaryScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(965876407, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ComposableSingletons$UpdatePrimaryScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.userprofile.ui.screens.phone.ComposableSingletons$UpdatePrimaryScreenKt.$r8$lambda$zkNlRZdJEAbrtDICA1BgAjSFNVY((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$zkNlRZdJEAbrtDICA1BgAjSFNVY(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(965876407, i, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.ComposableSingletons$UpdatePrimaryScreenKt.lambda$965876407.<anonymous> (UpdatePrimaryScreen.kt:226)");
            }
            com.paypal.pds.components.DividerKt.Divider(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 0.0f, 0.0f, 14, null), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$965876407$user_profile_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
