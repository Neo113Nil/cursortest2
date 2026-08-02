package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\b0\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010'\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameCollector;", "", "", "requiredCount", "", "eyesOpenConfidence", "<init>", "(IF)V", "", "isComplete", "()Z", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameProgress;", "getProgress", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameProgress;", "Lcom/daon/sdk/face/YUV;", "image", "Lcom/daon/sdk/face/Result;", "result", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "tryAddFrame", "(Lcom/daon/sdk/face/YUV;Lcom/daon/sdk/face/Result;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "Lkotlin/Function2;", "Landroid/graphics/Rect;", "isFrameAcceptable", "facePosition", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SelectedFrame;", "selectBestFrame", "(Lkotlin/jvm/functions/Function2;Landroid/graphics/Rect;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/SelectedFrame;", "", "reset", "()V", "getOutputFormats", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/daon/sdk/face/YUV;", "getHighSpeedVideoSizes", "Lcom/daon/sdk/face/Result;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FrameCollector {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.daon.sdk.face.YUV getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<com.daon.sdk.face.YUV, com.daon.sdk.face.Result> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.daon.sdk.face.Result getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public FrameCollector(int i, float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    public /* synthetic */ FrameCollector(int i, float f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 7 : i, (i2 & 2) != 0 ? 0.73f : f);
    }

    public final boolean isComplete() {
        return this.getInputSizeshNQ4ISI >= this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress getProgress() {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameProgress(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult tryAddFrame(com.daon.sdk.face.YUV image, com.daon.sdk.face.Result result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (isComplete()) {
            return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.AlreadyComplete.INSTANCE;
        }
        float f = result.getQualityResult().getBundle().getFloat("eye_open_score", 0.0f);
        if (f < this.getHighSpeedVideoFpsRangesFor) {
            if (f > 0.42f) {
                return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage(f);
            }
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality(f);
        }
        this.Camera2StreamConfigurationMap.put(image, result);
        int i = this.getInputSizeshNQ4ISI + 1;
        this.getInputSizeshNQ4ISI = i;
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected(i, this.getHighResolutionOutputSizeshNQ4ISI, f);
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame selectBestFrame(kotlin.jvm.functions.Function2<? super com.daon.sdk.face.Result, ? super android.graphics.Rect, java.lang.Boolean> isFrameAcceptable, android.graphics.Rect facePosition) {
        com.daon.sdk.face.QualityResult qualityResult;
        android.os.Bundle bundle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isFrameAcceptable, "");
        java.util.Iterator<java.util.Map.Entry<com.daon.sdk.face.YUV, com.daon.sdk.face.Result>> it = this.Camera2StreamConfigurationMap.entrySet().iterator();
        while (true) {
            float f = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry<com.daon.sdk.face.YUV, com.daon.sdk.face.Result> next = it.next();
            com.daon.sdk.face.YUV key = next.getKey();
            com.daon.sdk.face.Result value = next.getValue();
            if (isFrameAcceptable.invoke(value, facePosition).booleanValue()) {
                float f2 = value.getQualityResult().getBundle().getFloat("eye_open_score", 0.0f);
                com.daon.sdk.face.Result result = this.getHighSpeedVideoFpsRanges;
                if (result != null && (qualityResult = result.getQualityResult()) != null && (bundle = qualityResult.getBundle()) != null) {
                    f = bundle.getFloat("eye_open_score", 0.0f);
                }
                if (this.getHighSpeedVideoFpsRanges == null || f2 > f) {
                    this.getHighSpeedVideoSizes = key;
                    this.getHighSpeedVideoFpsRanges = value;
                }
            }
        }
        com.daon.sdk.face.YUV yuv = this.getHighSpeedVideoSizes;
        com.daon.sdk.face.Result result2 = this.getHighSpeedVideoFpsRanges;
        if (yuv == null || result2 == null) {
            return null;
        }
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.SelectedFrame(yuv, result2, result2.getQualityResult().getBundle().getFloat("eye_open_score", 0.0f), this.getInputSizeshNQ4ISI);
    }

    public final void reset() {
        this.Camera2StreamConfigurationMap.clear();
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputSizeshNQ4ISI = 0;
    }

    public FrameCollector() {
        this(0, 0.0f, 3, null);
    }
}
