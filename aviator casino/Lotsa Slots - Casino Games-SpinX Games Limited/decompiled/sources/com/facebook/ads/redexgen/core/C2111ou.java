package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2111ou implements com.facebook.ads.redexgen.core.InterfaceC05197t {
    public static byte[] A05;
    public com.facebook.ads.redexgen.core.EP A00;
    public final int A01;
    public final long A02;
    public final android.content.Context A03;
    public final com.facebook.ads.redexgen.core.A6 A04;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, -31, -44, -31, -30, -75, -48, -46, -29, -34, -31, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, com.google.common.base.Ascii.RS, 33, -49, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, 34, 35, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 35, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SYN, -49, -2, com.google.common.base.Ascii.US, 36, 34, -49, com.google.common.base.Ascii.DC4, 39, 35, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 34, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, 6, 51, 51, 48, 51, -31, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, -31, com.google.common.base.Ascii.ETB, 17, -6, -31, 38, 57, 53, 38, 47, 52, 42, 48, 47, com.google.common.base.Ascii.DLE, 51, 37, 40, 41, 40, -28, 10, 42, 49, 52, 41, 43, 5, 57, 40, 45, 51, com.google.common.base.Ascii.SYN, 41, 50, 40, 41, 54, 41, 54, -14, com.google.common.base.Ascii.SO, 49, 35, 38, 39, 38, -30, com.google.common.base.Ascii.SO, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, com.google.common.base.Ascii.DC4, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, -38, 6, 35, com.google.common.base.Ascii.FS, 41, 42, 47, 45, -5, 47, com.google.common.base.Ascii.RS, 35, 41, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, 40, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US, 44, com.google.common.base.Ascii.US, 44, -24, 4, 39, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, -40, 4, 33, com.google.common.base.Ascii.SUB, 46, 40, 48, com.google.common.base.Ascii.SO, 33, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 39, 10, com.google.common.base.Ascii.GS, 38, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 42, com.google.common.base.Ascii.GS, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, com.google.common.base.Ascii.SO, -60, 3, -5, -6, -1, -9, -55, -60, -5, com.google.common.base.Ascii.SO, 5, 6, 2, -9, com.google.common.base.Ascii.SI, -5, 8, -60, -5, com.google.common.base.Ascii.SO, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, com.google.common.base.Ascii.VT, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, com.google.common.base.Ascii.ESC, 39, 37, -26, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 39, 39, 35, -26, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, 43, -26, com.google.common.base.Ascii.EM, 38, com.google.common.base.Ascii.FS, 42, 39, 33, com.google.common.base.Ascii.FS, 48, -26, 37, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 33, com.google.common.base.Ascii.EM, -21, -26, com.google.common.base.Ascii.GS, 48, 39, 40, 36, com.google.common.base.Ascii.EM, 49, com.google.common.base.Ascii.GS, 42, -26, com.google.common.base.Ascii.GS, 48, 44, -26, com.google.common.base.Ascii.RS, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, -26, 4, 33, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.RS, 36, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, -7, 45, com.google.common.base.Ascii.FS, 33, 39, 10, com.google.common.base.Ascii.GS, 38, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 42, com.google.common.base.Ascii.GS, 42, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, -39, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, com.google.common.base.Ascii.FF, 41, 34, 54, 48, 56, com.google.common.base.Ascii.SYN, 41, 36, 37, 47, com.google.common.base.Ascii.DC2, 37, 46, 36, 37, 50, 37, 50};
    }

    public C2111ou(android.content.Context context) {
        this(context, 0);
    }

    public C2111ou(android.content.Context context, int i) {
        this(context, null, i, 5000L);
    }

    @java.lang.Deprecated
    public C2111ou(android.content.Context context, com.facebook.ads.redexgen.core.A6 a6, int i, long j) {
        this.A00 = new com.facebook.ads.redexgen.core.C2112ov(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = a6;
    }

    private final void A02(android.content.Context context, com.facebook.ads.redexgen.core.A6 a6, long j, android.os.Handler handler, com.facebook.ads.redexgen.core.GQ gq, int extensionRendererIndex, java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC2105oo> arrayList) {
        java.lang.Class<?> cls;
        java.lang.Class<?> clazz;
        java.lang.Class<?> clazz2;
        java.lang.Class<?> clazz3;
        arrayList.add(new com.facebook.ads.redexgen.core.AnonymousClass10(context, com.facebook.ads.redexgen.core.C1792jQ.A0T, new com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters(null, false), com.facebook.ads.redexgen.core.BT.A00, j, a6, false, false, handler, gq, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                cls = java.lang.Class.forName(A00(487, 70, 110));
                clazz = java.lang.Boolean.TYPE;
                clazz2 = java.lang.Long.TYPE;
                clazz3 = java.lang.Integer.TYPE;
            } catch (java.lang.Exception e) {
                e = e;
            }
            try {
                arrayList.add(size, (com.facebook.ads.redexgen.core.InterfaceC2105oo) cls.getConstructor(clazz, clazz2, android.os.Handler.class, com.facebook.ads.redexgen.core.GQ.class, clazz3, clazz3).newInstance(true, java.lang.Long.valueOf(j), handler, gq, 50, 5));
                android.util.Log.i(A00(0, 23, 29), A00(243, 27, 102));
            } catch (java.lang.Exception e2) {
                e = e2;
                throw new java.lang.RuntimeException(A00(127, 33, 111), e);
            }
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    private final void A03(android.content.Context context, com.facebook.ads.redexgen.core.A6 a6, com.facebook.ads.redexgen.core.InterfaceC04063k[] interfaceC04063kArr, android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC05408p interfaceC05408p, int extensionRendererIndex, java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC2105oo> arrayList) {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        java.lang.String A00 = A00(0, 23, 29);
        arrayList.add(new com.facebook.ads.redexgen.core.AnonymousClass12(context, com.facebook.ads.redexgen.core.C1792jQ.A0T, new com.facebook.ads.redexgen.core.MediaCodecRendererMetaParameters(null, false), com.facebook.ads.redexgen.core.BT.A00, a6, false, false, false, handler, interfaceC05408p, com.facebook.ads.redexgen.core.C8R.A02(context), interfaceC04063kArr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
            try {
                arrayList.add(size, (com.facebook.ads.redexgen.core.InterfaceC2105oo) java.lang.Class.forName(A00(415, 72, 19)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC05408p.class, com.facebook.ads.redexgen.core.InterfaceC04063k[].class).newInstance(handler, interfaceC05408p, interfaceC04063kArr));
                android.util.Log.i(A00, A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 28, 104));
            } catch (java.lang.ClassNotFoundException unused) {
                size = extensionRendererIndex2;
                extensionRendererIndex2 = size;
                java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(A00(343, 72, 102)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC05408p.class, com.facebook.ads.redexgen.core.InterfaceC04063k[].class);
                extensionRendererIndex3 = extensionRendererIndex2 + 1;
                arrayList.add(extensionRendererIndex2, (com.facebook.ads.redexgen.core.InterfaceC2105oo) constructor.newInstance(handler, interfaceC05408p, interfaceC04063kArr));
                android.util.Log.i(A00, A00(187, 28, 112));
                try {
                    java.lang.reflect.Constructor<?> constructor2 = java.lang.Class.forName(A00(270, 73, 68)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC05408p.class, com.facebook.ads.redexgen.core.InterfaceC04063k[].class);
                } catch (java.lang.Exception e) {
                    e = e;
                }
                try {
                    arrayList.add(extensionRendererIndex3, (com.facebook.ads.redexgen.core.InterfaceC2105oo) constructor2.newInstance(handler, interfaceC05408p, interfaceC04063kArr));
                    android.util.Log.i(A00, A00(160, 27, 114));
                } catch (java.lang.Exception e2) {
                    e = e2;
                    throw new java.lang.RuntimeException(A00(23, 36, 10), e);
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                throw new java.lang.RuntimeException(A00(93, 34, 93), e);
            }
        } catch (java.lang.ClassNotFoundException unused2) {
        } catch (java.lang.Exception e4) {
            e = e4;
        }
        try {
            java.lang.reflect.Constructor<?> constructor3 = java.lang.Class.forName(A00(343, 72, 102)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC05408p.class, com.facebook.ads.redexgen.core.InterfaceC04063k[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
        } catch (java.lang.ClassNotFoundException unused3) {
        } catch (java.lang.Exception e5) {
            e = e5;
        }
        try {
            try {
                arrayList.add(extensionRendererIndex2, (com.facebook.ads.redexgen.core.InterfaceC2105oo) constructor3.newInstance(handler, interfaceC05408p, interfaceC04063kArr));
                android.util.Log.i(A00, A00(187, 28, 112));
            } catch (java.lang.ClassNotFoundException unused4) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
                java.lang.reflect.Constructor<?> constructor22 = java.lang.Class.forName(A00(270, 73, 68)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC05408p.class, com.facebook.ads.redexgen.core.InterfaceC04063k[].class);
                arrayList.add(extensionRendererIndex3, (com.facebook.ads.redexgen.core.InterfaceC2105oo) constructor22.newInstance(handler, interfaceC05408p, interfaceC04063kArr));
                android.util.Log.i(A00, A00(160, 27, 114));
            } catch (java.lang.Exception e6) {
                e = e6;
                throw new java.lang.RuntimeException(A00(59, 34, 35), e);
            }
            java.lang.reflect.Constructor<?> constructor222 = java.lang.Class.forName(A00(270, 73, 68)).getConstructor(android.os.Handler.class, com.facebook.ads.redexgen.core.InterfaceC05408p.class, com.facebook.ads.redexgen.core.InterfaceC04063k[].class);
            arrayList.add(extensionRendererIndex3, (com.facebook.ads.redexgen.core.InterfaceC2105oo) constructor222.newInstance(handler, interfaceC05408p, interfaceC04063kArr));
            android.util.Log.i(A00, A00(160, 27, 114));
        } catch (java.lang.ClassNotFoundException unused5) {
        }
    }

    private final void A04(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC0593Bf interfaceC0593Bf, android.os.Looper looper, int i, java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC2105oo> arrayList) {
        arrayList.add(new com.facebook.ads.redexgen.core.C03531f(interfaceC0593Bf, looper));
    }

    private final void A05(android.content.Context context, com.facebook.ads.redexgen.core.ES es, android.os.Looper looper, int i, java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC2105oo> arrayList) {
        arrayList.add(new com.facebook.ads.redexgen.core.C03491b(es, looper, this.A00));
    }

    private final com.facebook.ads.redexgen.core.InterfaceC04063k[] A06() {
        return new com.facebook.ads.redexgen.core.InterfaceC04063k[0];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05197t
    public final com.facebook.ads.redexgen.core.InterfaceC2105oo[] A5Y(android.os.Handler handler, com.facebook.ads.redexgen.core.GQ gq, com.facebook.ads.redexgen.core.InterfaceC05408p interfaceC05408p, com.facebook.ads.redexgen.core.ES es, com.facebook.ads.redexgen.core.InterfaceC0593Bf interfaceC0593Bf, com.facebook.ads.redexgen.core.A6 a6) {
        com.facebook.ads.redexgen.core.A6 a62 = a6;
        if (a62 == null) {
            a62 = this.A04;
        }
        java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC2105oo> arrayList = new java.util.ArrayList<>();
        A02(this.A03, a62, this.A02, handler, gq, this.A01, arrayList);
        A03(this.A03, a62, A06(), handler, interfaceC05408p, this.A01, arrayList);
        A05(this.A03, es, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC0593Bf, handler.getLooper(), this.A01, arrayList);
        return (com.facebook.ads.redexgen.core.InterfaceC2105oo[]) arrayList.toArray(new com.facebook.ads.redexgen.core.InterfaceC2105oo[arrayList.size()]);
    }
}
