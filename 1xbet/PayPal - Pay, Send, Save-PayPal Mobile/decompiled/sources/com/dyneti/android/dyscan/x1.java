package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f3351a;
    public final int[] b;
    public final org.tensorflow.lite.Interpreter.Options c;
    public java.nio.ByteBuffer d;
    public org.tensorflow.lite.Interpreter e;
    public final java.nio.ByteBuffer f;
    public final float[][] g;

    public x1(java.nio.ByteBuffer byteBuffer) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f3351a = hashMap;
        this.b = new int[326880];
        org.tensorflow.lite.Interpreter.Options options = new org.tensorflow.lite.Interpreter.Options();
        this.c = options;
        this.d = byteBuffer;
        this.e = new org.tensorflow.lite.Interpreter(this.d, options);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(1307520);
        this.f = allocateDirect;
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 3);
        this.g = fArr;
        if (this.e == null) {
            throw new java.io.IOException("Orientation model is not a valid tflite flatbuffer");
        }
        hashMap.put(0, fArr);
    }
}
