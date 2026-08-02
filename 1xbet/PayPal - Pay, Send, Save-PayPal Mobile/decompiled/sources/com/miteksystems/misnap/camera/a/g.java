package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001b\u0010\u0003\u001a\u0006*\u00020\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006\"\u0018\u0010\t\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b\"\u0018\u0010\u0007\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006\"\u0018\u0010\r\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0018\u0010\u000f\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006\"\u0018\u0010\u0011\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b\"\u0018\u0010\u0012\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b"}, d2 = {"", "p0", "Ljava/nio/FloatBuffer;", "getHighSpeedVideoFpsRangesFor", "([F)Ljava/nio/FloatBuffer;", "getHighSpeedVideoFpsRanges", "[F", "Camera2StreamConfigurationMap", "Ljava/nio/FloatBuffer;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "getOutputFormats", "getHighSpeedVideoSizesFor", "getInputFormats", "getOutputSizeshNQ4ISI", "getOutputMinFrameDurationlomOqCM", "getOutputStallDuration"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class g {
    private static final float[] Camera2StreamConfigurationMap;
    private static final float[] getHighResolutionOutputSizeshNQ4ISI;
    private static final float[] getHighSpeedVideoFpsRanges;
    private static final java.nio.FloatBuffer getHighSpeedVideoFpsRangesFor;
    private static final java.nio.FloatBuffer getHighSpeedVideoSizes;
    private static final java.nio.FloatBuffer getHighSpeedVideoSizesFor;
    private static final float[] getInputFormats;
    private static final float[] getInputSizeshNQ4ISI;
    private static final float[] getOutputFormats;
    private static final java.nio.FloatBuffer getOutputMinFrameDuration;
    private static final java.nio.FloatBuffer getOutputSizeshNQ4ISI;
    private static final java.nio.FloatBuffer getOutputStallDuration;

    private static final java.nio.FloatBuffer getHighSpeedVideoFpsRangesFor(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        getHighSpeedVideoFpsRanges = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        Camera2StreamConfigurationMap = fArr2;
        getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(fArr);
        getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        getHighResolutionOutputSizeshNQ4ISI = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        getInputSizeshNQ4ISI = fArr4;
        getOutputMinFrameDuration = getHighSpeedVideoFpsRangesFor(fArr3);
        getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRangesFor(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        getInputFormats = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        getOutputFormats = fArr6;
        getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor(fArr5);
        getOutputStallDuration = getHighSpeedVideoFpsRangesFor(fArr6);
    }
}
