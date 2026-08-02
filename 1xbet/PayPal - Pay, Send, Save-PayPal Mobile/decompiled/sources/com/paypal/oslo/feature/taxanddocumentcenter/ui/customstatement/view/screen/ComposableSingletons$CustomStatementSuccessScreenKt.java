package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$CustomStatementSuccessScreenKt {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.ComposableSingletons$CustomStatementSuccessScreenKt INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.ComposableSingletons$CustomStatementSuccessScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(618419614, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.ComposableSingletons$CustomStatementSuccessScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.ComposableSingletons$CustomStatementSuccessScreenKt.m20348$r8$lambda$dlgEiNjZQchX7sS6VqzMU3hgiQ((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$dlgEiNjZQchX7sS-6VqzMU3hgiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20348$r8$lambda$dlgEiNjZQchX7sS6VqzMU3hgiQ(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(618419614, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.view.screen.ComposableSingletons$CustomStatementSuccessScreenKt.lambda$618419614.<anonymous> (CustomStatementSuccessScreen.kt:118)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Check.INSTANCE), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$618419614$tax_and_document_center_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
