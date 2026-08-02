package com.facetec.sdk;

/* loaded from: classes8.dex */
public class qe {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    public static final com.facetec.sdk.qe c;
    private static int d;

    /* renamed from: a, reason: collision with root package name */
    private long f3762a;
    private long b;
    private boolean e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$i(byte b, int i, byte b2) {
        int i2;
        int i3;
        byte[] bArr = $$g;
        int i4 = (b * 3) + 113;
        int i5 = i + 4;
        int i6 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            i5++;
            i7 = bArr[i5];
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    static void init$0() {
        $$g = new byte[]{94, -24, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 108};
        $$h = 204;
    }

    static {
        init$0();
        g();
        c = new com.facetec.sdk.qe() { // from class: com.facetec.sdk.qe.2
            @Override // com.facetec.sdk.qe
            public final com.facetec.sdk.qe a(long j, java.util.concurrent.TimeUnit timeUnit) {
                return this;
            }

            @Override // com.facetec.sdk.qe
            public final com.facetec.sdk.qe c(long j) {
                return this;
            }

            @Override // com.facetec.sdk.qe
            public final void j() throws java.io.IOException {
            }
        };
    }

    public com.facetec.sdk.qe a(long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("timeout < 0: ".concat(java.lang.String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new java.lang.IllegalArgumentException("unit == null");
        }
        this.b = timeUnit.toNanos(j);
        return this;
    }

    public long e_() {
        return this.b;
    }

    private static void n(boolean z, int i, java.lang.String str, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.hp hpVar = new com.facetec.sdk.hp();
        char[] cArr = new char[i];
        hpVar.d = 0;
        while (hpVar.d < i) {
            hpVar.b = charArray[hpVar.d];
            cArr[hpVar.d] = (char) (i2 + hpVar.b);
            int i4 = hpVar.d;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(d)};
                java.lang.Object d2 = com.facetec.sdk.al.d(-1738479149);
                if (d2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    d2 = com.facetec.sdk.al.c((char) (android.graphics.Color.rgb(0, 0, 0) + 16796701), 730 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1066373931, false, $$i(b, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr3 = {hpVar, hpVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(1965925374);
                if (d3 == null) {
                    d3 = com.facetec.sdk.al.c((char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24338), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1622, 24 - (android.view.ViewConfiguration.getTouchSlop() >> 8), -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            hpVar.f3630a = i3;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - hpVar.f3630a, hpVar.f3630a);
            java.lang.System.arraycopy(cArr2, hpVar.f3630a, cArr, 0, i - hpVar.f3630a);
        }
        if (z) {
            char[] cArr3 = new char[i];
            hpVar.d = 0;
            while (hpVar.d < i) {
                cArr3[hpVar.d] = cArr[(i - hpVar.d) - 1];
                java.lang.Object[] objArr4 = {hpVar, hpVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(1965925374);
                if (d4 == null) {
                    d4 = com.facetec.sdk.al.c((char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24338), android.view.View.resolveSize(0, 0) + 1621, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, -758982394, false, "v", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d4).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public boolean a_() {
        return this.e;
    }

    public long b_() {
        if (!this.e) {
            throw new java.lang.IllegalStateException("No deadline");
        }
        return this.f3762a;
    }

    public com.facetec.sdk.qe c(long j) {
        this.e = true;
        this.f3762a = j;
        return this;
    }

    public com.facetec.sdk.qe c_() {
        this.b = 0L;
        return this;
    }

    public com.facetec.sdk.qe d_() {
        this.e = false;
        return this;
    }

    public void j() throws java.io.IOException {
        if (java.lang.Thread.interrupted()) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.e) {
            long j = this.f3762a;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                n(true, 16 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\f\uffff\nￌ\uffff\u0014\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005", 143 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.getTrimmedLength("") + 8, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                n(true, 16777224 + android.graphics.Color.rgb(0, 0, 0), "\u0006\u0002￭\b\u0007\ufffa\u0007\ufffe", 148 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 8 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
                if (j - ((java.lang.Long) cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null)).longValue() <= 0) {
                    throw new java.io.InterruptedIOException("deadline reached");
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

    static void g() {
        d = 780577492;
    }
}
