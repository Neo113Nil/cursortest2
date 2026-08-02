package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$PoolsListScreenKt {
    public static final com.paypal.oslo.feature.pools.ui.poolslist.ComposableSingletons$PoolsListScreenKt INSTANCE = new com.paypal.oslo.feature.pools.ui.poolslist.ComposableSingletons$PoolsListScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-365696716, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.pools.ui.poolslist.ComposableSingletons$PoolsListScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.pools.ui.poolslist.ComposableSingletons$PoolsListScreenKt.$r8$lambda$lMerOO_Q7KhxhnKaySYOVMeJVtU((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$lMerOO_Q7KhxhnKaySYOVMeJVtU(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-365696716, i, -1, "com.paypal.oslo.feature.pools.ui.poolslist.ComposableSingletons$PoolsListScreenKt.lambda$-365696716.<anonymous> (PoolsListScreen.kt:272)");
            }
            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListScreenKt.PoolsListAppendLoadingContent(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-365696716$pools_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17681getLambda$365696716$pools_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }
}
