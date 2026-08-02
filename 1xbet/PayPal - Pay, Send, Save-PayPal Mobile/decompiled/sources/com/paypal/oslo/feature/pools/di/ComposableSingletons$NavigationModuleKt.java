package com.paypal.oslo.feature.pools.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$NavigationModuleKt {
    public static final com.paypal.oslo.feature.pools.di.ComposableSingletons$NavigationModuleKt INSTANCE = new com.paypal.oslo.feature.pools.di.ComposableSingletons$NavigationModuleKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1789757169, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.di.ComposableSingletons$NavigationModuleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.pools.di.ComposableSingletons$NavigationModuleKt.$r8$lambda$wR4UE65WnEyLet4Ji2Fxfxw5cjg((com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$wR4UE65WnEyLet4Ji2Fxfxw5cjg(com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination poolDetailsTransferModalDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolDetailsTransferModalDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(poolDetailsTransferModalDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1789757169, i, -1, "com.paypal.oslo.feature.pools.di.ComposableSingletons$NavigationModuleKt.lambda$1789757169.<anonymous> (NavigationModule.kt:141)");
            }
            com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsTransferModalKt.PoolDetailsTransferModal(poolDetailsTransferModalDestination.getBalance(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, composer, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<com.paypal.oslo.feature.pools.navigation.PoolDetailsTransferModalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1789757169$pools_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
