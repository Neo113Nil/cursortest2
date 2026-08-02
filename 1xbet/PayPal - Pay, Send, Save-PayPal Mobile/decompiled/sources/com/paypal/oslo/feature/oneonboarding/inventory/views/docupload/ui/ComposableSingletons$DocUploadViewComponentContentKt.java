package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$DocUploadViewComponentContentKt {
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.ComposableSingletons$DocUploadViewComponentContentKt INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.ComposableSingletons$DocUploadViewComponentContentKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-688906440, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.ComposableSingletons$DocUploadViewComponentContentKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.ComposableSingletons$DocUploadViewComponentContentKt.$r8$lambda$eeQpAWJP27WWSKaKKJhyWJYHB_I((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$eeQpAWJP27WWSKaKKJhyWJYHB_I(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-688906440, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.ComposableSingletons$DocUploadViewComponentContentKt.lambda$-688906440.<anonymous> (DocUploadViewComponentContent.kt:70)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-688906440$one_onboarding_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17036getLambda$688906440$one_onboarding_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
