package org.tensorflow.lite;

/* loaded from: classes18.dex */
public interface Tensor {
    java.nio.ByteBuffer asReadOnlyBuffer();

    org.tensorflow.lite.DataType dataType();

    int index();

    java.lang.String name();

    int numBytes();

    int numDimensions();

    int numElements();

    org.tensorflow.lite.Tensor.QuantizationParams quantizationParams();

    int[] shape();

    int[] shapeSignature();

    public static class QuantizationParams {
        private final int Camera2StreamConfigurationMap;
        private final float getHighSpeedVideoSizes;

        public QuantizationParams(float f, int i) {
            this.getHighSpeedVideoSizes = f;
            this.Camera2StreamConfigurationMap = i;
        }

        public float getScale() {
            return this.getHighSpeedVideoSizes;
        }

        public int getZeroPoint() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
