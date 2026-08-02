package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$CLIApprovalScreenKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.ComposableSingletons$CLIApprovalScreenKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.ComposableSingletons$CLIApprovalScreenKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-45552086, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.ComposableSingletons$CLIApprovalScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.ComposableSingletons$CLIApprovalScreenKt.m18345$r8$lambda$9ZnOShprk_qmVkcheUvaXje_4c((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$9ZnOShprk_qmV-kcheUvaXje_4c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18345$r8$lambda$9ZnOShprk_qmVkcheUvaXje_4c(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-45552086, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.ComposableSingletons$CLIApprovalScreenKt.lambda$-45552086.<anonymous> (CLIApprovalScreen.kt:205)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.CheckCircle.INSTANCE), null, null, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE), null, null, composer, 0, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-45552086$revolvingcredit_servicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18346getLambda$45552086$revolvingcredit_servicing_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
