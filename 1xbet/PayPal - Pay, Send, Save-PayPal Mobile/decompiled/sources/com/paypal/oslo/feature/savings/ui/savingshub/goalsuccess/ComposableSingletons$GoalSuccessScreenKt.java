package com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$GoalSuccessScreenKt {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.ComposableSingletons$GoalSuccessScreenKt INSTANCE = new com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.ComposableSingletons$GoalSuccessScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1561904881, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.ComposableSingletons$GoalSuccessScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.ComposableSingletons$GoalSuccessScreenKt.$r8$lambda$9ylOw4NMYuHjlvZOfHVRBdv5yG4((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$9ylOw4NMYuHjlvZOfHVRBdv5yG4(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1561904881, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.goalsuccess.ComposableSingletons$GoalSuccessScreenKt.lambda$1561904881.<anonymous> (GoalSuccessScreen.kt:83)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Medal.INSTANCE), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.GoalSuccessTestTags.AVATAR), com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, composer, (com.paypal.pds.components.AvatarSize.Large.$stable << 6) | 48, 56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1561904881$savings_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
