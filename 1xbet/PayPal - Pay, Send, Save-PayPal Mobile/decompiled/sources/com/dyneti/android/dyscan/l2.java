package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.DyScanView f3321a;
    public final float c;
    public final float d;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public java.lang.String b = com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;

    public l2(com.dyneti.android.dyscan.DyScanView dyScanView) {
        this.f3321a = dyScanView;
        this.c = android.util.TypedValue.applyDimension(1, 60.0f, dyScanView.getResources().getDisplayMetrics());
        this.d = android.util.TypedValue.applyDimension(1, 15.0f, dyScanView.getResources().getDisplayMetrics());
    }

    public final float a() {
        char c;
        float f;
        float c2;
        java.lang.String str = this.b;
        int hashCode = str.hashCode();
        if (hashCode == -1383228885) {
            if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -1364013995) {
            if (hashCode == 115029 && str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return f() - this.c;
        }
        if (c != 1) {
            c2 = c() + f();
            f = this.d;
        } else {
            f = f();
            c2 = (c() - this.c) / 2.0f;
        }
        return c2 + f;
    }

    public final float b() {
        java.lang.String str;
        java.lang.String str2 = this.b;
        int hashCode = str2.hashCode();
        if (hashCode == -1383228885) {
            str = com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM;
        } else {
            if (hashCode != -1364013995) {
                if (hashCode == 115029 && str2.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                    return c() + f() + this.d;
                }
                return f() - this.c;
            }
            str = com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER;
        }
        str2.equals(str);
        return f() - this.c;
    }

    public final float c() {
        if ((this.f3321a.r ? 0.63051707f : 1.586f) >= r0.getWidth() / this.f3321a.getHeight()) {
            return d() / (this.f3321a.r ? 0.63051707f : 1.586f);
        }
        this.f3321a.getCaptureAspectRatio();
        return this.f3321a.getHeight() * 0.9f;
    }

    public final float d() {
        if ((this.f3321a.r ? 0.63051707f : 1.586f) < r0.getWidth() / this.f3321a.getHeight()) {
            return (this.f3321a.r ? 0.63051707f : 1.586f) * c();
        }
        com.dyneti.android.dyscan.DyScanView dyScanView = this.f3321a;
        return this.f3321a.getWidth() * (dyScanView.r == ((dyScanView.getCaptureAspectRatio() > 1.0f ? 1 : (dyScanView.getCaptureAspectRatio() == 1.0f ? 0 : -1)) > 0) ? 0.6f : 0.9f);
    }

    public final float e() {
        return (this.f3321a.getWidth() - d()) / 2.0f;
    }

    public final float f() {
        return (this.f3321a.getHeight() - c()) / 2.0f;
    }
}
