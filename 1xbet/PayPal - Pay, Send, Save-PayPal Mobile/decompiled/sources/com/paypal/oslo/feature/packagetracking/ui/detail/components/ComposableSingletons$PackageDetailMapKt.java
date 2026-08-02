package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$PackageDetailMapKt {
    public static final com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2091117850, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt.m17540$r8$lambda$n8XD6BR2yN4gJIrZCHquay35k((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-935273537, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt.$r8$lambda$tWuaujcFHcM8eyhqjagP1qHO6m0((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$n8XD6BR2yN4gJIrZCH-qua-y35k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17540$r8$lambda$n8XD6BR2yN4gJIrZCHquay35k(androidx.compose.runtime.Composer composer, int i) {
        float f;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2091117850, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt.lambda$-2091117850.<anonymous> (PackageDetailMap.kt:106)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "package_tracking_map_loading"), 0.0f, 1, null);
            f = com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageDetailMapKt.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(fillMaxWidth$default, f), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 54, 2), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tWuaujcFHcM8eyhqjagP1qHO6m0(androidx.compose.runtime.Composer composer, int i) {
        float f;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-935273537, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$PackageDetailMapKt.lambda$-935273537.<anonymous> (PackageDetailMap.kt:167)");
            }
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_map_marker, composer, 0);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            f = com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageDetailMapKt.getHighSpeedVideoSizes;
            com.paypal.pds.components.ImageKt.Image(painterResource, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_map_marker_content_description, composer, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(companion, f), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), null, null, null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 3456, 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-935273537$package_tracking_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17542getLambda$935273537$package_tracking_prodRelease() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-2091117850$package_tracking_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17541getLambda$2091117850$package_tracking_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
