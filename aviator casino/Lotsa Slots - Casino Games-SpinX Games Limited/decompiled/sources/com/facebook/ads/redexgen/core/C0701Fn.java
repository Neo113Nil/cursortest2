package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0701Fn {
    public static java.lang.reflect.Constructor<?> A00;
    public static java.lang.reflect.Constructor<?> A01;
    public static java.lang.reflect.Method A02;
    public static java.lang.reflect.Method A03;
    public static java.lang.reflect.Method A04;
    public static byte[] A05;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{85, 66, 94, 91, 83, 84, 88, 90, com.google.common.base.Ascii.EM, 81, 86, 84, 82, 85, 88, 88, 92, com.google.common.base.Ascii.EM, 86, 83, 68, com.google.common.base.Ascii.EM, 86, 89, 83, 69, 88, 94, 83, 79, com.google.common.base.Ascii.EM, 90, 82, 83, 94, 86, 4, com.google.common.base.Ascii.EM, 82, 79, 88, 71, 91, 86, 78, 82, 69, com.google.common.base.Ascii.EM, 82, 81, 81, 82, 84, 67, com.google.common.base.Ascii.EM, 115, 82, 81, 86, 66, 91, 67, 97, 94, 83, 82, 88, 113, 69, 86, 90, 82, 103, 69, 88, 84, 82, 68, 68, 88, 69, 19, 113, 86, 84, 67, 88, 69, 78, 19, 117, 66, 94, 91, 83, 82, 69, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 116, 113, 102, 59, 116, 123, 113, 103, 122, 124, 113, 109, 59, 120, 112, 113, 124, 116, 38, 59, 112, 109, 122, 101, 121, 116, 108, 112, 103, 59, 112, 115, 115, 112, 118, 97, 59, 70, 118, 116, 121, 112, 84, 123, 113, 71, 122, 97, 116, 97, 112, 65, 103, 116, 123, 102, 115, 122, 103, 120, 116, 97, 124, 122, 123, 49, 87, 96, 124, 121, 113, 112, 103, 59, 45, 60, com.google.common.base.Ascii.SUB, 39, 60, 41, 60, 33, 39, 38, com.google.common.base.Ascii.FF, 45, 47, 58, 45, 45, 59};
    }

    public static com.facebook.ads.redexgen.core.C4H A00(float f) throws java.lang.Exception {
        A04();
        java.lang.Object newInstance = A00.newInstance(new java.lang.Object[0]);
        A04.invoke(newInstance, java.lang.Float.valueOf(f));
        java.lang.Object builder = A02.invoke(newInstance, new java.lang.Object[0]);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(builder);
        return null;
    }

    public static com.facebook.ads.redexgen.core.C5E A01() throws java.lang.Exception {
        A04();
        java.lang.Object builder = A03.invoke(A01.newInstance(new java.lang.Object[0]), new java.lang.Object[0]);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(builder);
        return null;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
    public static void A04() throws java.lang.Exception {
        java.lang.reflect.Constructor<?> constructor = A00;
        java.lang.String A022 = A02(0, 5, 30);
        if (constructor == null || A04 == null || A02 == null) {
            java.lang.Class<?> cls = java.lang.Class.forName(A02(97, 86, 60));
            A00 = cls.getConstructor(new java.lang.Class[0]);
            java.lang.Class<?> scaleAndRotateTransformationBuilderClass = java.lang.Float.TYPE;
            A04 = cls.getMethod(A02(183, 18, 97), scaleAndRotateTransformationBuilderClass);
            A02 = cls.getMethod(A022, new java.lang.Class[0]);
        }
        if (A01 == null || A03 == null) {
            java.lang.Class<?> cls2 = java.lang.Class.forName(A02(5, 92, 30));
            A01 = cls2.getConstructor(new java.lang.Class[0]);
            A03 = cls2.getMethod(A022, new java.lang.Class[0]);
        }
    }
}
