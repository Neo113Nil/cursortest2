package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$AccountSnapshotContainerKt {
    public static final com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt INSTANCE = new com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(107629358, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt.$r8$lambda$3eCxfKJJP165nFd2u6YSo6EeYAI((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$3eCxfKJJP165nFd2u6YSo6EeYAI(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(107629358, i, -1, "com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt.lambda$107629358.<anonymous> (AccountSnapshotContainer.kt:129)");
            }
            com.paypal.oslo.feature.home.domain.model.Section createSection$home_prodRelease$default = com.paypal.oslo.feature.home.ui.preview.SectionPreviews.createSection$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.SectionPreviews.INSTANCE, null, null, null, null, com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews.createSampleAccountSnapshot$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews.INSTANCE, 0, 1, null), null, 3, null);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.home.ui.ComposableSingletons$AccountSnapshotContainerKt.$r8$lambda$oLwIqWw55p1Js_4dZrWcBqR_5J4((com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.home.ui.AccountSnapshotContainerKt.AccountSnapshotContainer(createSection$home_prodRelease$default, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oLwIqWw55p1Js_4dZrWcBqR_5J4(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$107629358$home_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
