package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ComposableSingletons$HeaderKt {
    public static final com.paypal.pds.components.ComposableSingletons$HeaderKt INSTANCE = new com.paypal.pds.components.ComposableSingletons$HeaderKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(737364253, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ComposableSingletons$HeaderKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.pds.components.ComposableSingletons$HeaderKt.$r8$lambda$sMHUPpY5MLuAHv4pCqR3FSvvFNM((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-232926754, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ComposableSingletons$HeaderKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.pds.components.ComposableSingletons$HeaderKt.m21800$r8$lambda$UuXam_YbdIBoCzUXVmdcCe7XIk((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$UuXa-m_YbdIBoCzUXVmdcCe7XIk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21800$r8$lambda$UuXam_YbdIBoCzUXVmdcCe7XIk(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-232926754, i, -1, "com.paypal.pds.components.ComposableSingletons$HeaderKt.lambda$-232926754.<anonymous> (Header.kt:185)");
            }
            com.paypal.pds.components.BadgeKt.Badge("Success", null, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE, null, null, null, null, composer, 390, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sMHUPpY5MLuAHv4pCqR3FSvvFNM(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(737364253, i, -1, "com.paypal.pds.components.ComposableSingletons$HeaderKt.lambda$737364253.<anonymous> (Header.kt:175)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials("TC"), null, null, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, new com.paypal.pds.components.AvatarBadge.Icon(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, com.paypal.pds.components.BadgeStyle.Positive.INSTANCE), null, composer, 3072, 38);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$737364253$pds_release() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-232926754$pds_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m21801getLambda$232926754$pds_release() {
        return getHighSpeedVideoFpsRanges;
    }
}
