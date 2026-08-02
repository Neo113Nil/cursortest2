package com.facetec.sdk;

/* loaded from: classes8.dex */
final class df {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String[] f3507a;
    final boolean e;
    private final float b = 0.8f;
    private final float c = 1.0f;
    private final float d = 0.5f;
    private final float h = 0.8f;
    private final float j = 0.55f;
    private final float g = 0.6f;
    private final float i = 0.45f;
    private final float f = 0.5f;

    df() {
        java.lang.String[] strArr = {"2109119DG", "M2010J19CG", "Pixel 6a"};
        this.f3507a = strArr;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            if (android.os.Build.MODEL.contains(strArr[i])) {
                z = true;
                break;
            }
            i++;
        }
        this.e = z;
    }

    final float a() {
        return this.e ? 0.6f : 1.0f;
    }

    final float c() {
        return this.e ? 0.45f : 0.5f;
    }
}
