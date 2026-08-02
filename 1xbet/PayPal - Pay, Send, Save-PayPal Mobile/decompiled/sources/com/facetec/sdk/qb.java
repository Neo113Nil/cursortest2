package com.facetec.sdk;

/* loaded from: classes8.dex */
final class qb extends com.facetec.sdk.pq {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static long h;
    private static char[] j;
    private transient byte[][] d;
    private transient int[] e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$f(short s, short s2, int i) {
        int i2;
        int i3 = s2 + 4;
        int i4 = i + 102;
        byte[] bArr = $$d;
        int i5 = s * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i3;
            int i9 = 0;
            int i10 = i3 + i7;
            i2 = i9;
            int i11 = i8;
            i4 = i10;
            i3 = i11;
            int i12 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new java.lang.String(bArr2, 0);
            }
            int i13 = i4;
            i8 = i12;
            i3 = bArr[i12];
            i7 = i13;
            int i102 = i3 + i7;
            i2 = i9;
            int i112 = i8;
            i4 = i102;
            i3 = i112;
            int i122 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static void init$0() {
        $$d = new byte[]{116, -106, 85, com.visa.cbp.getEncExpo.IResultReceiver2};
        $$e = 23;
    }

    qb(com.facetec.sdk.pk pkVar, int i) {
        super(null);
        com.facetec.sdk.qd.b(pkVar.b, 0L, i);
        com.facetec.sdk.qc qcVar = pkVar.c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (qcVar.f3761a == qcVar.e) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += qcVar.f3761a - qcVar.e;
            i4++;
            qcVar = qcVar.j;
        }
        this.d = new byte[i4][];
        this.e = new int[i4 << 1];
        com.facetec.sdk.qc qcVar2 = pkVar.c;
        int i5 = 0;
        while (i2 < i) {
            this.d[i5] = qcVar2.d;
            i2 += qcVar2.f3761a - qcVar2.e;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.e;
            iArr[i5] = i2;
            iArr[this.d.length + i5] = qcVar2.e;
            qcVar2.c = true;
            i5++;
            qcVar2 = qcVar2.j;
        }
    }

    private static void l(char c, int i, int i2, java.lang.Object[] objArr) {
        com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
        long[] jArr = new long[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            int i3 = hhVar.e;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(j[i + i3])};
                java.lang.Object d = com.facetec.sdk.al.d(-719238807);
                if (d == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    d = com.facetec.sdk.al.c((char) (android.graphics.Color.red(0) + 45150), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2102, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 24, 1926116241, false, $$f(b, b2, (byte) (b2 + 4)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i3), java.lang.Long.valueOf(h), java.lang.Integer.valueOf(c)};
                java.lang.Object d2 = com.facetec.sdk.al.d(671690243);
                if (d2 == null) {
                    byte b3 = (byte) 0;
                    d2 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getSize(0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1834, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, -1880730373, false, $$f(b3, (byte) (b3 - 1), (byte) $$d.length), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr3)).longValue();
                java.lang.Object[] objArr4 = {hhVar, hhVar};
                java.lang.Object d3 = com.facetec.sdk.al.d(898558648);
                if (d3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    d3 = com.facetec.sdk.al.c((char) android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2342, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, -1839099840, false, $$f(b4, b5, (byte) (b5 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d3).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        hhVar.e = 0;
        while (hhVar.e < i2) {
            cArr[hhVar.e] = (char) jArr[hhVar.e];
            java.lang.Object[] objArr5 = {hhVar, hhVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
            if (d4 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                d4 = com.facetec.sdk.al.c((char) (android.view.MotionEvent.axisFromString("") + 1), 2341 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, -1839099840, false, $$f(b6, b7, (byte) (b7 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.facetec.sdk.pq
    public final java.lang.String e() {
        return g().e();
    }

    @Override // com.facetec.sdk.pq
    public final java.lang.String d() {
        return g().d();
    }

    @Override // com.facetec.sdk.pq
    public final java.lang.String a() {
        return g().a();
    }

    @Override // com.facetec.sdk.pq
    public final com.facetec.sdk.pq h() {
        return g().h();
    }

    @Override // com.facetec.sdk.pq
    public final com.facetec.sdk.pq c() {
        return g().c();
    }

    @Override // com.facetec.sdk.pq
    public final com.facetec.sdk.pq b() {
        return g().b();
    }

    @Override // com.facetec.sdk.pq
    public final com.facetec.sdk.pq a(int i, int i2) {
        return g().a(i, i2);
    }

    @Override // com.facetec.sdk.pq
    public final byte c(int i) {
        com.facetec.sdk.qd.b(this.e[this.d.length - 1], i, 1L);
        int a2 = a(i);
        int i2 = a2 == 0 ? 0 : this.e[a2 - 1];
        int[] iArr = this.e;
        byte[][] bArr = this.d;
        return bArr[a2][(i - i2) + iArr[bArr.length + a2]];
    }

    private int a(int i) {
        int binarySearch = java.util.Arrays.binarySearch(this.e, 0, this.d.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.facetec.sdk.pq
    public final int j() {
        return this.e[this.d.length - 1];
    }

    @Override // com.facetec.sdk.pq
    public final byte[] i() {
        int[] iArr = this.e;
        byte[][] bArr = this.d;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.e;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            try {
                java.lang.Object[] objArr = {this.d[i], java.lang.Integer.valueOf(i3), bArr2, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i4 - i2)};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                l((char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38677), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                l((char) (9048 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 17, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 10, objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                i++;
                i2 = i4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return bArr2;
    }

    @Override // com.facetec.sdk.pq
    final void b(com.facetec.sdk.pk pkVar) {
        int length = this.d.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.e;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            com.facetec.sdk.qc qcVar = new com.facetec.sdk.qc(this.d[i], i3, (i3 + i4) - i2);
            if (pkVar.c == null) {
                qcVar.i = qcVar;
                qcVar.j = qcVar;
                pkVar.c = qcVar;
            } else {
                pkVar.c.i.b(qcVar);
            }
            i++;
            i2 = i4;
        }
        pkVar.b += i2;
    }

    @Override // com.facetec.sdk.pq
    public final boolean a(int i, com.facetec.sdk.pq pqVar, int i2, int i3) {
        if (j() - i3 < 0) {
            return false;
        }
        int a2 = a(0);
        while (i3 > 0) {
            int i4 = a2 == 0 ? 0 : this.e[a2 - 1];
            int min = java.lang.Math.min(i3, ((this.e[a2] - i4) + i4) - i);
            int[] iArr = this.e;
            byte[][] bArr = this.d;
            if (!pqVar.b(i2, bArr[a2], (i - i4) + iArr[bArr.length + a2], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            a2++;
        }
        return true;
    }

    @Override // com.facetec.sdk.pq
    public final boolean b(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > j() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int a2 = a(i);
        while (i3 > 0) {
            int i4 = a2 == 0 ? 0 : this.e[a2 - 1];
            int min = java.lang.Math.min(i3, ((this.e[a2] - i4) + i4) - i);
            int[] iArr = this.e;
            byte[][] bArr2 = this.d;
            if (!com.facetec.sdk.qd.b(bArr2[a2], (i - i4) + iArr[bArr2.length + a2], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            a2++;
        }
        return true;
    }

    private com.facetec.sdk.pq g() {
        return new com.facetec.sdk.pq(i());
    }

    @Override // com.facetec.sdk.pq
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.facetec.sdk.pq) {
            com.facetec.sdk.pq pqVar = (com.facetec.sdk.pq) obj;
            if (pqVar.j() == j() && a(0, pqVar, 0, j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facetec.sdk.pq
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int length = this.d.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.d[i2];
            int[] iArr = this.e;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            for (int i7 = i5; i7 < (i6 - i4) + i5; i7++) {
                i3 = (i3 * 31) + bArr[i7];
            }
            i2++;
            i4 = i6;
        }
        this.c = i3;
        return i3;
    }

    @Override // com.facetec.sdk.pq
    public final java.lang.String toString() {
        return g().toString();
    }

    private java.lang.Object writeReplace() {
        return g();
    }

    static {
        init$0();
        j = new char[]{64357, 5006, 10937, 16846, 22689, 30467, 36398, 42305, 48232, 54465, 58268, 64214, 4604, 10267, 18218, 24130, 20259, 42960, 40688, 62851, 60603, 49985, 14957, 4370, 2107};
        h = -1419279281276156678L;
    }
}
