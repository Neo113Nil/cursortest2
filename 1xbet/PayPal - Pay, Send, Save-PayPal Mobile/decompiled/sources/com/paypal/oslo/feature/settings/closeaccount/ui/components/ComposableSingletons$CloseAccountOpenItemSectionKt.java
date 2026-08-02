package com.paypal.oslo.feature.settings.closeaccount.ui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$CloseAccountOpenItemSectionKt {
    public static final com.paypal.oslo.feature.settings.closeaccount.ui.components.ComposableSingletons$CloseAccountOpenItemSectionKt INSTANCE = new com.paypal.oslo.feature.settings.closeaccount.ui.components.ComposableSingletons$CloseAccountOpenItemSectionKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-303157465, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.ComposableSingletons$CloseAccountOpenItemSectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.settings.closeaccount.ui.components.ComposableSingletons$CloseAccountOpenItemSectionKt.$r8$lambda$KxcXVb0WplNxFRbXDG4JVzLyVsA((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$KxcXVb0WplNxFRbXDG4JVzLyVsA(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-303157465, i, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.ComposableSingletons$CloseAccountOpenItemSectionKt.lambda$-303157465.<anonymous> (CloseAccountOpenItemSection.kt:89)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE), null, com.paypal.pds.components.AvatarSize.XSmall.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentMuted.INSTANCE, com.paypal.pds.core.Color.Transparent.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.XSmall.$stable << 6, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-303157465$settings_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19235getLambda$303157465$settings_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
