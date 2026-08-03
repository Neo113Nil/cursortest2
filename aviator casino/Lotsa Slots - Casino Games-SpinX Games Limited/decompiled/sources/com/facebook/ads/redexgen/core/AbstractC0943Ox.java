package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0943Ox extends android.graphics.drawable.Drawable {
    public static java.lang.String[] A00 = {"Bq6maawZ0clc1FQAmj5JQZ", "VAIBWau0AGjNNTEN3MsesX9vol", "j9uAnr9SO1508v2Fml3gke", "ZCgsP4jhFD2e5OZklqeZfYu5I7s7wZNA", "gWy56vmTKK0E", "vsILSp0QdnJQHstvTHvz6zn3fr5EWYkf", "Ft8tZM9UwubEJUOv9H1JFeEwlzUnh", "KM7boO2xaC3ZbV22lXcue9aE71LlUQ5e"};
    public static final double A01 = java.lang.Math.cos(java.lang.Math.toRadians(45.0d));

    public static float A00(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - A01) * f2));
        }
        return f;
    }

    public static float A01(float f, float f2, boolean z) {
        if (z) {
            return (float) ((1.5f * f) + ((1.0d - A01) * f2));
        }
        float f3 = 1.5f * f;
        if (A00[6].length() == 2) {
            throw new java.lang.RuntimeException();
        }
        A00[3] = "QZbxm3QXOF2yqMmVze25YX6oNvKBlq6Q";
        return f3;
    }
}
