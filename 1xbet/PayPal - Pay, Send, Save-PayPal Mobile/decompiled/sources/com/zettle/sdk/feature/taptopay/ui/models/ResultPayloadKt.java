package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;", "Lcom/zettle/sdk/feature/taptopay/ui/models/BuyerInfo;", "getBuyerInfo", "(Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;)Lcom/zettle/sdk/feature/taptopay/ui/models/BuyerInfo;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;", "toResult", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction$ResultPayload;)Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ResultPayloadKt {
    public static final com.zettle.sdk.feature.taptopay.ui.models.ResultPayload toResult(com.zettle.sdk.feature.taptopay.core.transaction.Transaction.ResultPayload resultPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultPayload, "");
        long camera2StreamConfigurationMap = resultPayload.getCamera2StreamConfigurationMap();
        java.lang.Long getOutputFormats = resultPayload.getGetOutputFormats();
        java.lang.String getHighSpeedVideoSizesFor = resultPayload.getGetHighSpeedVideoSizesFor();
        java.lang.String accessartificialFrame = resultPayload.getAccessartificialFrame();
        java.lang.String getOutputMinFrameDuration = resultPayload.getGetOutputMinFrameDuration();
        java.lang.String getInputFormats = resultPayload.getGetInputFormats();
        java.lang.String coroutineCreation = resultPayload.getCoroutineCreation();
        java.lang.String getHighSpeedVideoSizes = resultPayload.getGetHighSpeedVideoSizes();
        java.lang.String getOutputMinFrameDurationlomOqCM = resultPayload.getGetOutputMinFrameDurationlomOqCM();
        java.lang.String getHighSpeedVideoFpsRangesFor = resultPayload.getGetHighSpeedVideoFpsRangesFor();
        java.lang.String getHighSpeedVideoFpsRanges = resultPayload.getGetHighSpeedVideoFpsRanges();
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = resultPayload.getGetHighResolutionOutputSizeshNQ4ISI();
        long getInputSizeshNQ4ISI = resultPayload.getGetInputSizeshNQ4ISI();
        int getOutputStallDurationlomOqCM = resultPayload.getGetOutputStallDurationlomOqCM();
        java.lang.String getOutputSizeshNQ4ISI = resultPayload.getGetOutputSizeshNQ4ISI();
        java.lang.String getOutputSizes = resultPayload.getGetOutputSizes();
        java.lang.Integer getOutputStallDuration = resultPayload.getGetOutputStallDuration();
        java.lang.String toString = resultPayload.getToString();
        java.lang.String getValidOutputFormatsForInputhNQ4ISI = resultPayload.getGetValidOutputFormatsForInputhNQ4ISI();
        java.lang.String coroutineBoundary = resultPayload.getCoroutineBoundary();
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference isOutputSupportedForhNQ4ISI = resultPayload.getIsOutputSupportedForhNQ4ISI();
        return new com.zettle.sdk.feature.taptopay.ui.models.ResultPayload(camera2StreamConfigurationMap, getOutputFormats, getHighSpeedVideoSizesFor, accessartificialFrame, getOutputMinFrameDuration, getInputFormats, coroutineCreation, getHighSpeedVideoSizes, getOutputMinFrameDurationlomOqCM, getHighSpeedVideoFpsRangesFor, getHighSpeedVideoFpsRanges, getHighResolutionOutputSizeshNQ4ISI, getInputSizeshNQ4ISI, getOutputStallDurationlomOqCM, getOutputSizeshNQ4ISI, getOutputSizes, getOutputStallDuration, toString, getValidOutputFormatsForInputhNQ4ISI, coroutineBoundary, isOutputSupportedForhNQ4ISI != null ? isOutputSupportedForhNQ4ISI.getGetHighResolutionOutputSizeshNQ4ISI() : null, resultPayload.getIsOutputSupportedFor(), resultPayload.getUnwrapAs(), resultPayload.getCoroutineDebuggingKt());
    }

    public static final com.zettle.sdk.feature.taptopay.ui.models.BuyerInfo getBuyerInfo(com.zettle.sdk.feature.taptopay.ui.models.ResultPayload resultPayload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultPayload, "");
        return new com.zettle.sdk.feature.taptopay.ui.models.BuyerInfo(resultPayload.getSuggestionEmail$ui_publicRelease(), resultPayload.getSuggestionPhone$ui_publicRelease(), resultPayload.getSuggestionPhoneCountryCode$ui_publicRelease());
    }
}
