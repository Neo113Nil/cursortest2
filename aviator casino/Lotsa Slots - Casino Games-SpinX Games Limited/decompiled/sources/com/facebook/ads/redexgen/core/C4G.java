package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4G, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4G implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"LhLlUYOA3naT6ewiIfSatK6wPnwZfiw3", "Yilysgn0AAb9YtLDTNJji2mPRB", "c9oRdUKVrFFtnTa1I", "KQ", "xlNtsgcQCcIfApmgkmgvKWlCiiYZcHMk", "hc66151z6q5iwEh2NbNUTWK4J8", "zFcjHNMQlzxWDemIwLbPjRBcPW9AB4cx", "Z4gs05w13PySoO170q3JfxFVkqHBiozt"};
    public static final int[] A08;
    public android.graphics.SurfaceTexture A00;
    public android.opengl.EGLContext A01;
    public android.opengl.EGLDisplay A02;
    public android.opengl.EGLSurface A03;
    public final android.os.Handler A04;
    public final int[] A05 = new int[1];

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{72, 74, 79, 38, 75, 82, 82, 86, 72, 38, 82, 81, 73, 76, 74, 3, 73, 68, 76, 79, 72, 71, com.google.common.base.Ascii.GS, 3, 86, 88, 70, 70, 72, 86, 86, 32, 8, 69, com.google.common.base.Ascii.SI, 3, 81, 88, 80, 38, 82, 81, 73, 76, 74, 86, 62, 19, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 32, 8, 71, com.google.common.base.Ascii.SI, 3, 70, 82, 81, 73, 76, 74, 86, 62, 19, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 32, 8, 86, -27, -25, -20, -61, -14, -27, -31, -12, -27, -61, -17, -18, -12, -27, -8, -12, -96, -26, -31, -23, -20, -27, -28, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ESC, -14, 33, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.DC4, -1, 17, 36, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, 33, 2, 36, 33, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC4, -49, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC4, 19, -6, -4, 1, -36, -6, 9, -39, -2, 8, 5, 1, -10, com.google.common.base.Ascii.SO, -75, -5, -10, -2, 1, -6, -7, 67, 69, 74, 39, 76, 71, 82, 71, 63, 74, 71, 88, 67, -2, 68, 63, 71, 74, 67, 66, 2, 4, 9, -22, -2, 8, 2, -32, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, 2, com.google.common.base.Ascii.VT, 17, -67, 3, -2, 6, 9, 2, 1, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC2, -19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DC4, -6, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.EM, -58, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.VT, 10, -44, -58, -21, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, -32, -58};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public C4G(android.os.Handler handler) {
        this.A04 = handler;
    }

    public static android.opengl.EGLConfig A00(android.opengl.EGLDisplay eGLDisplay) {
        android.opengl.EGLConfig[] configs = new android.opengl.EGLConfig[1];
        int[] iArr = new int[1];
        boolean success = android.opengl.EGL14.eglChooseConfig(eGLDisplay, A08, 0, configs, 0, 1, iArr, 0);
        if (success && iArr[0] > 0 && configs[0] != null) {
            return configs[0];
        }
        throw new com.facebook.ads.redexgen.core.C4E(com.facebook.ads.redexgen.core.C5C.A0n(A04(0, 67, 111), java.lang.Boolean.valueOf(success), java.lang.Integer.valueOf(iArr[0]), configs[0]));
    }

    public static android.opengl.EGLContext A01(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new com.facebook.ads.redexgen.core.C4E(A04(67, 23, 12));
    }

    public static android.opengl.EGLDisplay A02() {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new com.facebook.ads.redexgen.core.C4E(A04(120, 20, 33));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new com.facebook.ads.redexgen.core.C4E(A04(140, 20, 106));
        }
        return eglGetDisplay;
    }

    public static android.opengl.EGLSurface A03(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.opengl.EGLContext eGLContext, int i) {
        int[] pbufferAttributes;
        android.opengl.EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eglCreatePbufferSurface == null) {
                throw new com.facebook.ads.redexgen.core.C4E(A04(90, 30, 59));
            }
        }
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            throw new com.facebook.ads.redexgen.core.C4E(A04(160, 21, 41));
        }
        return eglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
        } else {
            throw new com.facebook.ads.redexgen.core.C4E(A04(181, 29, 50) + java.lang.Integer.toHexString(glGetError));
        }
    }

    public final android.graphics.SurfaceTexture A07() {
        return (android.graphics.SurfaceTexture) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
    }

    /* JADX WARN: Finally extract failed */
    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                android.opengl.GLES20.glDeleteTextures(1, this.A05, 0);
            }
            if (this.A03 != null && !this.A03.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.A02, this.A03);
            }
            android.opengl.EGLContext eGLContext = this.A01;
            java.lang.String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                A07[0] = "QNIttSd1jDkmqHhtWtb4AUHxJPK3ppH8";
                if (eGLContext != null) {
                    android.opengl.EGL14.eglDestroyContext(this.A02, this.A01);
                }
                this.A02 = null;
                this.A01 = null;
                this.A03 = null;
                this.A00 = null;
                if (A07[0].charAt(22) != 'k') {
                    A07[0] = "tPWKOfvaIXpYJ8rWJX79LPHjnVzX8xxm";
                    return;
                }
            }
            throw new java.lang.RuntimeException();
        } catch (java.lang.Throwable th) {
            if (this.A03 != null && !this.A03.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.A02, this.A03);
            }
            if (this.A01 != null) {
                android.opengl.EGL14.eglDestroyContext(this.A02, this.A01);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
            throw th;
        }
    }

    public final void A09(int i) {
        this.A02 = A02();
        android.opengl.EGLConfig A00 = A00(this.A02);
        this.A01 = A01(this.A02, A00, i);
        this.A03 = A03(this.A02, A00, this.A01, i);
        A06(this.A05);
        this.A00 = new android.graphics.SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
