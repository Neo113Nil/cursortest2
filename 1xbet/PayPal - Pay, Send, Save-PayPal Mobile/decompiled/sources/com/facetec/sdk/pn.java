package com.facetec.sdk;

/* loaded from: classes8.dex */
public class pn extends com.facetec.sdk.qe {
    private static final byte[] $$d = null;
    private static final int $$e = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final long f3746a;
    private static final long b;

    @javax.annotation.Nullable
    static com.facetec.sdk.pn d;
    private static boolean h;
    private static char[] i;
    private static int j;
    private static boolean m;
    private boolean e;

    @javax.annotation.Nullable
    private com.facetec.sdk.pn f;
    private long g;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$f(int i2, short s, short s2) {
        int i3;
        int i4;
        int i5;
        int i6 = 1 - (s2 * 4);
        byte[] bArr = $$d;
        int i7 = s + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i5 = 0;
            int i10 = i7 + i9;
            i4 = i5;
            i7 = i8;
            i3 = i10;
            int i11 = i7 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i3;
            if (i5 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i9 = bArr[i11];
            i7 = i3;
            i8 = i11;
            int i102 = i7 + i9;
            i4 = i5;
            i7 = i8;
            i3 = i102;
            int i112 = i7 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i3;
            if (i5 == i6) {
            }
        } else {
            i3 = 122 - i2;
            i4 = 0;
            int i1122 = i7 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i3;
            if (i5 == i6) {
            }
        }
    }

    static void init$0() {
        $$d = new byte[]{36, 13, -41, 72};
        $$e = 116;
    }

    protected void a() {
    }

    static {
        init$0();
        f();
        long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(60L);
        f3746a = millis;
        b = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void b() {
        if (this.e) {
            throw new java.lang.IllegalStateException("Unbalanced enter/exit");
        }
        long e_ = e_();
        boolean a_ = a_();
        if (e_ != 0 || a_) {
            this.e = true;
            a(this, e_, a_);
        }
    }

    private static void a(com.facetec.sdk.pn pnVar, long j2, boolean z) {
        synchronized (com.facetec.sdk.pn.class) {
            if (d == null) {
                d = new com.facetec.sdk.pn();
                new com.facetec.sdk.pn.d().start();
            }
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                l(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                l(null, null, 127 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr2);
                long longValue = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue();
                if (j2 != 0 && z) {
                    pnVar.g = java.lang.Math.min(j2, pnVar.b_() - longValue) + longValue;
                } else if (j2 != 0) {
                    pnVar.g = j2 + longValue;
                } else if (z) {
                    pnVar.g = pnVar.b_();
                } else {
                    throw new java.lang.AssertionError();
                }
                long a2 = pnVar.a(longValue);
                com.facetec.sdk.pn pnVar2 = d;
                while (true) {
                    com.facetec.sdk.pn pnVar3 = pnVar2.f;
                    if (pnVar3 == null || a2 < pnVar3.a(longValue)) {
                        break;
                    } else {
                        pnVar2 = pnVar2.f;
                    }
                }
                pnVar.f = pnVar2.f;
                pnVar2.f = pnVar;
                if (pnVar2 == d) {
                    com.facetec.sdk.pn.class.notify();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final boolean e() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return d(this);
    }

    private static boolean d(com.facetec.sdk.pn pnVar) {
        synchronized (com.facetec.sdk.pn.class) {
            com.facetec.sdk.pn pnVar2 = d;
            while (pnVar2 != null) {
                com.facetec.sdk.pn pnVar3 = pnVar2.f;
                if (pnVar3 == pnVar) {
                    pnVar2.f = pnVar.f;
                    pnVar.f = null;
                    return false;
                }
                pnVar2 = pnVar3;
            }
            return true;
        }
    }

    private static void l(int[] iArr, java.lang.String str, int i2, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hn hnVar = new com.facetec.sdk.hn();
        char[] cArr = i;
        int i3 = -1;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i4 = 1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(484843984);
                    if (d2 == null) {
                        byte b2 = (byte) i3;
                        d2 = com.facetec.sdk.al.c((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1810, 22 - android.text.TextUtils.indexOf("", c, 0, 0), -1157014744, false, $$f((byte) 57, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = -1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(j)};
        java.lang.Object d3 = com.facetec.sdk.al.d(-1796435875);
        if (d3 == null) {
            byte b3 = (byte) (-1);
            d3 = com.facetec.sdk.al.c((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 662, 24 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 855894693, false, $$f((byte) 56, b3, (byte) (b3 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
        int i6 = 870267758;
        if (m) {
            hnVar.c = bArr2.length;
            char[] cArr3 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr3[hnVar.f3629a] = (char) (cArr[bArr2[(hnVar.c - 1) - hnVar.f3629a] + i2] - intValue);
                java.lang.Object[] objArr4 = {hnVar, hnVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(i6);
                if (d4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    d4 = com.facetec.sdk.al.c((char) android.view.Gravity.getAbsoluteGravity(0, 0), 1235 - android.graphics.ImageFormat.getBitsPerPixel(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25, -1808776810, false, $$f(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                i6 = 870267758;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (h) {
            hnVar.c = charArray.length;
            char[] cArr4 = new char[hnVar.c];
            hnVar.f3629a = 0;
            while (hnVar.f3629a < hnVar.c) {
                cArr4[hnVar.f3629a] = (char) (cArr[charArray[(hnVar.c - i4) - hnVar.f3629a] - i2] - intValue);
                java.lang.Object[] objArr5 = {hnVar, hnVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(870267758);
                if (d5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    d5 = com.facetec.sdk.al.c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + i4), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1235, 25 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1808776810, false, $$f(b6, b7, (byte) (b7 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
                i4 = 1;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        hnVar.c = iArr.length;
        char[] cArr5 = new char[hnVar.c];
        hnVar.f3629a = 0;
        while (hnVar.f3629a < hnVar.c) {
            cArr5[hnVar.f3629a] = (char) (cArr[iArr[(hnVar.c - 1) - hnVar.f3629a] - i2] - intValue);
            hnVar.f3629a++;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private long a(long j2) {
        return this.g - j2;
    }

    final void e(boolean z) throws java.io.IOException {
        if (e() && z) {
            throw b(null);
        }
    }

    final java.io.IOException d(java.io.IOException iOException) throws java.io.IOException {
        return !e() ? iOException : b(iOException);
    }

    protected java.io.IOException b(@javax.annotation.Nullable java.io.IOException iOException) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    static final class d extends java.lang.Thread {
        d() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.a();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            while (true) {
                synchronized (com.facetec.sdk.pn.class) {
                    com.facetec.sdk.pn c = com.facetec.sdk.pn.c();
                    if (c != null) {
                        if (c == com.facetec.sdk.pn.d) {
                            com.facetec.sdk.pn.d = null;
                            return;
                        }
                    }
                }
            }
        }
    }

    @javax.annotation.Nullable
    static com.facetec.sdk.pn c() throws java.lang.InterruptedException {
        com.facetec.sdk.pn pnVar = d.f;
        try {
            if (pnVar == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                l(null, null, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                l(null, null, 127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr2);
                long longValue = ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue();
                com.facetec.sdk.pn.class.wait(f3746a);
                if (d.f == null) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    l(null, null, android.graphics.Color.alpha(0) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr3);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    l(null, null, 127 - android.text.TextUtils.getTrimmedLength(""), "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr4);
                    if (((java.lang.Long) cls2.getMethod((java.lang.String) objArr4[0], null).invoke(null, null)).longValue() - longValue >= b) {
                        return d;
                    }
                }
                return null;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            l(null, null, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, "\u008d\u008c\u008b\u008a\u0089\u0088\u0084\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0081", objArr5);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            l(null, null, android.view.View.resolveSizeAndState(0, 0, 0) + 127, "\u008c\u008d\u0090\u008f\u008e\u0086\u0082\u0086", objArr6);
            long a2 = pnVar.a(((java.lang.Long) cls3.getMethod((java.lang.String) objArr6[0], null).invoke(null, null)).longValue());
            if (a2 > 0) {
                long j2 = a2 / 1000000;
                com.facetec.sdk.pn.class.wait(j2, (int) (a2 - (1000000 * j2)));
                return null;
            }
            d.f = pnVar.f;
            pnVar.f = null;
            return pnVar;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void f() {
        i = new char[]{5809, 5816, 5765, 5837, 5775, 5773, 5810, 5798, 5760, 5766, 5767, 5812, 5772, 5770, 5799, 5808};
        j = -1919674597;
        h = true;
        m = true;
    }
}
