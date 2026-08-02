package org.tensorflow.lite;

/* loaded from: classes18.dex */
final class TensorImpl implements org.tensorflow.lite.Tensor {
    long Camera2StreamConfigurationMap;
    private final org.tensorflow.lite.Tensor.QuantizationParams getHighResolutionOutputSizeshNQ4ISI;
    private final int[] getHighSpeedVideoFpsRanges;
    private final org.tensorflow.lite.DataType getHighSpeedVideoFpsRangesFor;
    int[] getHighSpeedVideoSizes;

    private static native java.nio.ByteBuffer buffer(long j);

    private static native long create(long j, int i, int i2);

    private static native long createSignatureInputTensor(long j, java.lang.String str);

    private static native long createSignatureOutputTensor(long j, java.lang.String str);

    static native void delete(long j);

    private static native int dtype(long j);

    private static native boolean hasDelegateBufferHandle(long j);

    private static native int index(long j);

    private static native java.lang.String name(long j);

    private static native int numBytes(long j);

    private static native float quantizationScale(long j);

    private static native int quantizationZeroPoint(long j);

    private static native void readMultiDimensionalArray(long j, java.lang.Object obj);

    static native int[] shape(long j);

    private static native int[] shapeSignature(long j);

    private static native void writeDirectBuffer(long j, java.nio.Buffer buffer);

    private static native void writeMultiDimensionalArray(long j, java.lang.Object obj);

    private static native void writeScalar(long j, java.lang.Object obj);

    static org.tensorflow.lite.TensorImpl getHighSpeedVideoSizes(long j, int i) {
        return new org.tensorflow.lite.TensorImpl(create(j, i, 0));
    }

    static org.tensorflow.lite.TensorImpl getHighSpeedVideoFpsRangesFor(long j, java.lang.String str) {
        long createSignatureInputTensor = createSignatureInputTensor(j, str);
        if (createSignatureInputTensor == -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: input ");
            sb.append(str);
            sb.append(" not found.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return new org.tensorflow.lite.TensorImpl(createSignatureInputTensor);
    }

    static org.tensorflow.lite.TensorImpl getHighSpeedVideoFpsRanges(long j, java.lang.String str) {
        long createSignatureOutputTensor = createSignatureOutputTensor(j, str);
        if (createSignatureOutputTensor == -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input error: output ");
            sb.append(str);
            sb.append(" not found.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return new org.tensorflow.lite.TensorImpl(createSignatureOutputTensor);
    }

    @Override // org.tensorflow.lite.Tensor
    public final org.tensorflow.lite.DataType dataType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numDimensions() {
        return this.getHighSpeedVideoSizes.length;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numBytes() {
        return numBytes(this.Camera2StreamConfigurationMap);
    }

    @Override // org.tensorflow.lite.Tensor
    public final int numElements() {
        int i = 1;
        for (int i2 : this.getHighSpeedVideoSizes) {
            i *= i2;
        }
        return i;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shape() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int[] shapeSignature() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.tensorflow.lite.Tensor
    public final int index() {
        return index(this.Camera2StreamConfigurationMap);
    }

    @Override // org.tensorflow.lite.Tensor
    public final java.lang.String name() {
        return name(this.Camera2StreamConfigurationMap);
    }

    @Override // org.tensorflow.lite.Tensor
    public final org.tensorflow.lite.Tensor.QuantizationParams quantizationParams() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    final void Camera2StreamConfigurationMap(java.lang.Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.Camera2StreamConfigurationMap)) {
                throw new java.lang.IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        getHighSpeedVideoSizesFor(obj);
        getOutputFormats(obj);
        if (obj instanceof java.nio.Buffer) {
            getHighSpeedVideoFpsRanges((java.nio.Buffer) obj);
            return;
        }
        if (this.getHighSpeedVideoFpsRangesFor == org.tensorflow.lite.DataType.STRING && this.getHighSpeedVideoSizes.length == 0) {
            writeScalar(this.Camera2StreamConfigurationMap, obj);
        } else if (obj.getClass().isArray()) {
            writeMultiDimensionalArray(this.Camera2StreamConfigurationMap, obj);
        } else {
            writeScalar(this.Camera2StreamConfigurationMap, obj);
        }
    }

    private void getHighSpeedVideoFpsRanges(java.nio.Buffer buffer) {
        if (buffer instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) buffer;
            if (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.Camera2StreamConfigurationMap, buffer);
                return;
            } else {
                buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).put(byteBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.LongBuffer) {
            java.nio.LongBuffer longBuffer = (java.nio.LongBuffer) buffer;
            if (longBuffer.isDirect() && longBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.Camera2StreamConfigurationMap, buffer);
                return;
            } else {
                buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.FloatBuffer) {
            java.nio.FloatBuffer floatBuffer = (java.nio.FloatBuffer) buffer;
            if (floatBuffer.isDirect() && floatBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.Camera2StreamConfigurationMap, buffer);
                return;
            } else {
                buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.IntBuffer) {
            java.nio.IntBuffer intBuffer = (java.nio.IntBuffer) buffer;
            if (intBuffer.isDirect() && intBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.Camera2StreamConfigurationMap, buffer);
                return;
            } else {
                buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asIntBuffer().put(intBuffer);
                return;
            }
        }
        if (buffer instanceof java.nio.ShortBuffer) {
            java.nio.ShortBuffer shortBuffer = (java.nio.ShortBuffer) buffer;
            if (shortBuffer.isDirect() && shortBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.Camera2StreamConfigurationMap, buffer);
                return;
            } else {
                buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(shortBuffer);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Unexpected input buffer type: ".concat(java.lang.String.valueOf(buffer)));
    }

    final void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.Camera2StreamConfigurationMap)) {
                throw new java.lang.IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        getHighSpeedVideoSizesFor(obj);
        getOutputMinFrameDuration(obj);
        if (obj instanceof java.nio.Buffer) {
            getHighSpeedVideoSizes((java.nio.Buffer) obj);
        } else {
            readMultiDimensionalArray(this.Camera2StreamConfigurationMap, obj);
        }
    }

    private void getHighSpeedVideoSizes(java.nio.Buffer buffer) {
        if (buffer instanceof java.nio.ByteBuffer) {
            ((java.nio.ByteBuffer) buffer).put(buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()));
            return;
        }
        if (buffer instanceof java.nio.FloatBuffer) {
            ((java.nio.FloatBuffer) buffer).put(buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer());
            return;
        }
        if (buffer instanceof java.nio.LongBuffer) {
            ((java.nio.LongBuffer) buffer).put(buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asLongBuffer());
        } else if (buffer instanceof java.nio.IntBuffer) {
            ((java.nio.IntBuffer) buffer).put(buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asIntBuffer());
        } else {
            if (buffer instanceof java.nio.ShortBuffer) {
                ((java.nio.ShortBuffer) buffer).put(buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer());
                return;
            }
            throw new java.lang.IllegalArgumentException("Unexpected output buffer type: ".concat(java.lang.String.valueOf(buffer)));
        }
    }

    private int[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(obj);
        if (this.getHighSpeedVideoFpsRangesFor == org.tensorflow.lite.DataType.STRING) {
            java.lang.Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (java.lang.Byte.TYPE.equals(cls)) {
                    highSpeedVideoFpsRangesFor--;
                }
            }
        }
        int[] iArr = new int[highSpeedVideoFpsRangesFor];
        getHighSpeedVideoFpsRanges(obj, 0, iArr);
        return iArr;
    }

    private static int getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (java.lang.reflect.Array.getLength(obj) == 0) {
            throw new java.lang.IllegalArgumentException("Array lengths cannot be 0.");
        }
        return getHighSpeedVideoFpsRangesFor(java.lang.reflect.Array.get(obj, 0)) + 1;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.Object obj, int i, int[] iArr) {
        if (iArr == null || i == iArr.length) {
            return;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        int i2 = iArr[i];
        if (i2 == 0) {
            iArr[i] = length;
        } else if (i2 != length) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Mismatched lengths (%d and %d) in dimension %d", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i)));
        }
        int i3 = i + 1;
        if (i3 != iArr.length) {
            for (int i4 = 0; i4 < length; i4++) {
                getHighSpeedVideoFpsRanges(java.lang.reflect.Array.get(obj, i4), i3, iArr);
            }
        }
    }

    private TensorImpl(long j) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = org.tensorflow.lite.DataTypeUtils.getHighResolutionOutputSizeshNQ4ISI(dtype(j));
        this.getHighSpeedVideoSizes = shape(j);
        this.getHighSpeedVideoFpsRanges = shapeSignature(j);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.tensorflow.lite.Tensor.QuantizationParams(quantizationScale(j), quantizationZeroPoint(j));
    }

    private void getOutputMinFrameDuration(java.lang.Object obj) {
        if (obj instanceof java.nio.Buffer) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            int numBytes = numBytes();
            int capacity = obj instanceof java.nio.ByteBuffer ? buffer.capacity() : buffer.capacity() * this.getHighSpeedVideoFpsRangesFor.byteSize();
            if (numBytes > capacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", name(), java.lang.Integer.valueOf(numBytes), java.lang.Integer.valueOf(capacity)));
            }
            return;
        }
        int[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(obj);
        if (!java.util.Arrays.equals(highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", name(), java.util.Arrays.toString(this.getHighSpeedVideoSizes), java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI)));
        }
    }

    private void getOutputFormats(java.lang.Object obj) {
        if (obj instanceof java.nio.Buffer) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            int numBytes = numBytes();
            int capacity = obj instanceof java.nio.ByteBuffer ? buffer.capacity() : buffer.capacity() * this.getHighSpeedVideoFpsRangesFor.byteSize();
            if (numBytes != capacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", name(), java.lang.Integer.valueOf(numBytes), java.lang.Integer.valueOf(capacity)));
            }
            return;
        }
        int[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(obj);
        if (!java.util.Arrays.equals(highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", name(), java.util.Arrays.toString(this.getHighSpeedVideoSizes), java.util.Arrays.toString(highResolutionOutputSizeshNQ4ISI)));
        }
    }

    private void getHighSpeedVideoSizesFor(java.lang.Object obj) {
        org.tensorflow.lite.DataType dataType;
        if (obj instanceof java.nio.ByteBuffer) {
            return;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (!java.lang.Float.TYPE.equals(cls)) {
                if (java.lang.Integer.TYPE.equals(cls)) {
                    dataType = org.tensorflow.lite.DataType.INT32;
                } else if (java.lang.Short.TYPE.equals(cls)) {
                    dataType = org.tensorflow.lite.DataType.INT16;
                } else if (java.lang.Byte.TYPE.equals(cls)) {
                    if (this.getHighSpeedVideoFpsRangesFor == org.tensorflow.lite.DataType.STRING) {
                        dataType = org.tensorflow.lite.DataType.STRING;
                    } else {
                        dataType = org.tensorflow.lite.DataType.UINT8;
                    }
                } else if (java.lang.Long.TYPE.equals(cls)) {
                    dataType = org.tensorflow.lite.DataType.INT64;
                } else if (java.lang.Boolean.TYPE.equals(cls)) {
                    dataType = org.tensorflow.lite.DataType.BOOL;
                } else {
                    if (java.lang.String.class.equals(cls)) {
                        dataType = org.tensorflow.lite.DataType.STRING;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("DataType error: cannot resolve DataType of ");
                    sb.append(obj.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            dataType = org.tensorflow.lite.DataType.FLOAT32;
        } else {
            if (!java.lang.Float.class.equals(cls) && !(obj instanceof java.nio.FloatBuffer)) {
                if (java.lang.Integer.class.equals(cls) || (obj instanceof java.nio.IntBuffer)) {
                    dataType = org.tensorflow.lite.DataType.INT32;
                } else if (java.lang.Short.class.equals(cls) || (obj instanceof java.nio.ShortBuffer)) {
                    dataType = org.tensorflow.lite.DataType.INT16;
                } else if (java.lang.Byte.class.equals(cls)) {
                    dataType = org.tensorflow.lite.DataType.UINT8;
                } else if (java.lang.Long.class.equals(cls) || (obj instanceof java.nio.LongBuffer)) {
                    dataType = org.tensorflow.lite.DataType.INT64;
                } else if (java.lang.Boolean.class.equals(cls)) {
                    dataType = org.tensorflow.lite.DataType.BOOL;
                } else {
                    if (java.lang.String.class.equals(cls)) {
                        dataType = org.tensorflow.lite.DataType.STRING;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("DataType error: cannot resolve DataType of ");
                    sb2.append(obj.getClass().getName());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            }
            dataType = org.tensorflow.lite.DataType.FLOAT32;
        }
        if (dataType != this.getHighSpeedVideoFpsRangesFor && !org.tensorflow.lite.DataTypeUtils.getHighSpeedVideoFpsRangesFor(dataType).equals(org.tensorflow.lite.DataTypeUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor))) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", this.getHighSpeedVideoFpsRangesFor, obj.getClass().getName(), dataType));
        }
    }

    @Override // org.tensorflow.lite.Tensor
    public final java.nio.ByteBuffer asReadOnlyBuffer() {
        return buffer(this.Camera2StreamConfigurationMap).order(java.nio.ByteOrder.nativeOrder()).asReadOnlyBuffer().order(java.nio.ByteOrder.nativeOrder());
    }

    final int[] getHighSpeedVideoSizes(java.lang.Object obj) {
        if (obj == null || (obj instanceof java.nio.Buffer)) {
            return null;
        }
        getHighSpeedVideoSizesFor(obj);
        int[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(obj);
        if (java.util.Arrays.equals(this.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI)) {
            return null;
        }
        return highResolutionOutputSizeshNQ4ISI;
    }
}
