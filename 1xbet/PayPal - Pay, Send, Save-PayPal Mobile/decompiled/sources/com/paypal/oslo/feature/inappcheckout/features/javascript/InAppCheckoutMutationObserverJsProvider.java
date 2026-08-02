package com.paypal.oslo.feature.inappcheckout.features.javascript;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000e\u001a\u00020\t8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/javascript/InAppCheckoutMutationObserverJsProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "", "javaScriptCode$delegate", "Lkotlin/Lazy;", "getJavaScriptCode", "()Ljava/lang/String;", "javaScriptCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InAppCheckoutMutationObserverJsProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: javaScriptCode$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy javaScriptCode;

    @javax.inject.Inject
    public InAppCheckoutMutationObserverJsProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.javaScriptCode = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider.this);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    public final java.lang.String getJavaScriptCode() {
        return (java.lang.String) this.javaScriptCode.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.features.javascript.InAppCheckoutMutationObserverJsProvider inAppCheckoutMutationObserverJsProvider) {
        try {
            java.io.InputStream openRawResource = inAppCheckoutMutationObserverJsProvider.getHighSpeedVideoFpsRanges.getResources().openRawResource(com.paypal.oslo.feature.inappcheckout.R.raw.feature_inappcheckout_mutation_observer);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(openRawResource, kotlin.text.Charsets.UTF_8), 8192);
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                return readText;
            } finally {
            }
        } catch (android.content.res.Resources.NotFoundException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Resource not found: mutation_observer, returning empty string", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("resourceId", java.lang.Integer.valueOf(com.paypal.oslo.feature.inappcheckout.R.raw.feature_inappcheckout_mutation_observer)), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return "";
        } catch (java.io.IOException e2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.inappcheckout.LoggerKt.log, "Failed to read mutation_observer resource file, returning empty string", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("resourceId", java.lang.Integer.valueOf(com.paypal.oslo.feature.inappcheckout.R.raw.feature_inappcheckout_mutation_observer)), kotlin.TuplesKt.to("error", e2.getMessage())), null, 4, null);
            return "";
        }
    }
}
