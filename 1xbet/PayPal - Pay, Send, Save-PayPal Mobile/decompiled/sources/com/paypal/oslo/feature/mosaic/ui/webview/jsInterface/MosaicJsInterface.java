package com.paypal.oslo.feature.mosaic.ui.webview.jsInterface;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/jsInterface/MosaicJsInterface;", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "", "onComplete", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "jsonResponse", "onWebFlowCompletion", "(Ljava/lang/String;)V", "status", "statusCode", "onFlowComplete", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicJsInterface {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public MosaicJsInterface(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @android.webkit.JavascriptInterface
    public final void onWebFlowCompletion(java.lang.String jsonResponse) {
        com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic JSInterface onWebFlowComplete Called", null, null, 6, null);
        try {
            try {
                mosaicLegacyNavResult = (com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult) kotlinx.serialization.json.Json.INSTANCE.decodeFromString(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.INSTANCE.serializer(), jsonResponse);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic JSInterface onWebFlowComplete response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", mosaicLegacyNavResult.getStatus()), kotlin.TuplesKt.to("processStatus", mosaicLegacyNavResult.getProcessStatus())), null, 4, null);
            } catch (kotlinx.serialization.SerializationException e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.mosaic.LoggerKt.log;
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.class).getSimpleName();
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to deserialize JSON ");
                sb.append(jsonResponse);
                sb.append(" to ");
                sb.append(simpleName);
                sb.append(": ");
                sb.append(message);
                com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
                java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.class).getSimpleName();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to deserialize JSON to ");
                sb2.append(simpleName2);
                throw new java.lang.IllegalStateException(sb2.toString(), e);
            }
        } catch (java.lang.IllegalStateException e2) {
            com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult2 = new com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult("FAILURE", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.oslo.feature.mosaic.LoggerKt.log.e("Mosaic JSInterface onWebFlowComplete exception", e2);
            mosaicLegacyNavResult = mosaicLegacyNavResult2;
        }
        this.getHighSpeedVideoFpsRangesFor.invoke(mosaicLegacyNavResult);
    }

    @android.webkit.JavascriptInterface
    public final void onFlowComplete(java.lang.String status, java.lang.String statusCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic JSInterface onFlowComplete response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", status), kotlin.TuplesKt.to("statusCode", statusCode)), null, 4, null);
        this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult(status, statusCode));
    }
}
