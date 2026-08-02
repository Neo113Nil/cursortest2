package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$ActivityMerchantImageKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ComposableSingletons$ActivityMerchantImageKt INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ComposableSingletons$ActivityMerchantImageKt();
    private static kotlin.jvm.functions.Function3<com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1773929772, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ComposableSingletons$ActivityMerchantImageKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ComposableSingletons$ActivityMerchantImageKt.$r8$lambda$p8WXhO_VSAdJ8ZWtzF84yRw_DVk((com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$p8WXhO_VSAdJ8ZWtzF84yRw_DVk(com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope subcomposeAsyncImageScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subcomposeAsyncImageScope, "");
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(subcomposeAsyncImageScope) : composer.changedInstance(subcomposeAsyncImageScope) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1773929772, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ComposableSingletons$ActivityMerchantImageKt.lambda$-1773929772.<anonymous> (ActivityMerchantImage.kt:69)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, composer, com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope.$stable | (i & 14), 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1773929772$revolvingcredit_servicing_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m18275getLambda$1773929772$revolvingcredit_servicing_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
