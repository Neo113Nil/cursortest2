package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pk implements com.facetec.sdk.pj, com.facetec.sdk.pr, java.lang.Cloneable, java.nio.channels.ByteChannel {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3744a;
    private static char d;
    private static char e;
    private static char g;
    private static char j;
    long b;

    @javax.annotation.Nullable
    com.facetec.sdk.qc c;

    private static java.lang.String $$c(byte b, int i, int i2) {
        int i3 = (i2 * 2) + 112;
        int i4 = (i * 2) + 4;
        int i5 = b * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = i5 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            int i7 = bArr[i4];
            i4++;
            i3 += i7;
        }
    }

    static void init$0() {
        $$a = new byte[]{19, -95, -85, 74};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE;
    }

    @Override // com.facetec.sdk.pj, com.facetec.sdk.pr
    public final com.facetec.sdk.pk c() {
        return this;
    }

    @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.facetec.sdk.pj, com.facetec.sdk.qa, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // com.facetec.sdk.pj
    public final /* bridge */ /* synthetic */ com.facetec.sdk.pj t() throws java.io.IOException {
        return this;
    }

    static {
        init$0();
        s();
        f3744a = new byte[]{48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public final long e() {
        return this.b;
    }

    private static void r(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.facetec.sdk.ho hoVar = new com.facetec.sdk.ho();
        char[] cArr = new char[charArray.length];
        hoVar.b = 0;
        char[] cArr2 = new char[2];
        while (hoVar.b < charArray.length) {
            cArr2[0] = charArray[hoVar.b];
            cArr2[1] = charArray[hoVar.b + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (g ^ 2174069992062419062L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(j)};
                    int i4 = c2 + i2;
                    java.lang.Object d2 = com.facetec.sdk.al.d(1497828241);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) android.text.TextUtils.indexOf("", ""), 210 - android.os.Process.getGidForName(""), android.view.View.MeasureSpec.getSize(0) + 23, -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (d ^ 2174069992062419062L))) ^ r15), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(e)};
                    int i5 = charValue + i2;
                    java.lang.Object d3 = com.facetec.sdk.al.d(1497828241);
                    if (d3 == null) {
                        d3 = com.facetec.sdk.al.c((char) ((-1) - android.os.Process.getGidForName("")), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 211, 23 - android.view.View.getDefaultSize(0, 0), -22515351, false, lib.android.paypal.com.magnessdk.g.n2, new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[hoVar.b] = cArr2[0];
            cArr[hoVar.b + 1] = cArr2[1];
            java.lang.Object[] objArr4 = {hoVar, hoVar};
            java.lang.Object d4 = com.facetec.sdk.al.d(-2113314280);
            if (d4 == null) {
                byte b = (byte) 0;
                d4 = com.facetec.sdk.al.c((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31542), (android.os.Process.myTid() >> 22) + 1913, android.view.KeyEvent.normalizeMetaState(0) + 23, 635836640, false, $$c(b, b, b), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d4).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    @Override // com.facetec.sdk.pr
    public final boolean b() {
        return this.b == 0;
    }

    @Override // com.facetec.sdk.pr
    public final void b(long j2) throws java.io.EOFException {
        if (this.b < j2) {
            throw new java.io.EOFException();
        }
    }

    public final com.facetec.sdk.pk b(com.facetec.sdk.pk pkVar, long j2, long j3) {
        if (pkVar == null) {
            throw new java.lang.IllegalArgumentException("out == null");
        }
        com.facetec.sdk.qd.b(this.b, j2, j3);
        if (j3 != 0) {
            pkVar.b += j3;
            com.facetec.sdk.qc qcVar = this.c;
            while (j2 >= qcVar.f3761a - qcVar.e) {
                j2 -= qcVar.f3761a - qcVar.e;
                qcVar = qcVar.j;
            }
            while (j3 > 0) {
                com.facetec.sdk.qc b = qcVar.b();
                b.e = (int) (b.e + j2);
                b.f3761a = java.lang.Math.min(b.e + ((int) j3), b.f3761a);
                com.facetec.sdk.qc qcVar2 = pkVar.c;
                if (qcVar2 == null) {
                    b.i = b;
                    b.j = b;
                    pkVar.c = b;
                } else {
                    qcVar2.i.b(b);
                }
                j3 -= b.f3761a - b.e;
                qcVar = qcVar.j;
                j2 = 0;
            }
        }
        return this;
    }

    public final long a() {
        long j2 = this.b;
        if (j2 == 0) {
            return 0L;
        }
        com.facetec.sdk.qc qcVar = this.c.i;
        return (qcVar.f3761a >= 8192 || !qcVar.b) ? j2 : j2 - (qcVar.f3761a - qcVar.e);
    }

    @Override // com.facetec.sdk.pr
    public final byte j() {
        if (this.b == 0) {
            throw new java.lang.IllegalStateException("size == 0");
        }
        com.facetec.sdk.qc qcVar = this.c;
        int i = qcVar.e;
        int i2 = qcVar.f3761a;
        int i3 = i + 1;
        byte b = qcVar.d[i];
        this.b--;
        if (i3 == i2) {
            this.c = qcVar.e();
            com.facetec.sdk.py.b(qcVar);
            return b;
        }
        qcVar.e = i3;
        return b;
    }

    public final byte d(long j2) {
        com.facetec.sdk.qd.b(this.b, j2, 1L);
        long j3 = this.b;
        if (j3 - j2 > j2) {
            com.facetec.sdk.qc qcVar = this.c;
            while (true) {
                long j4 = qcVar.f3761a - qcVar.e;
                if (j2 >= j4) {
                    j2 -= j4;
                    qcVar = qcVar.j;
                } else {
                    return qcVar.d[qcVar.e + ((int) j2)];
                }
            }
        } else {
            long j5 = j2 - j3;
            com.facetec.sdk.qc qcVar2 = this.c;
            do {
                qcVar2 = qcVar2.i;
                j5 += qcVar2.f3761a - qcVar2.e;
            } while (j5 < 0);
            return qcVar2.d[qcVar2.e + ((int) j5)];
        }
    }

    @Override // com.facetec.sdk.pr
    public final short g() {
        int i;
        int i2;
        if (this.b < 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size < 2: ");
            sb.append(this.b);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.facetec.sdk.qc qcVar = this.c;
        int i3 = qcVar.e;
        int i4 = qcVar.f3761a;
        if (i4 - i3 < 2) {
            i = (j() & 255) << 8;
            i2 = j() & 255;
        } else {
            byte[] bArr = qcVar.d;
            byte b = bArr[i3];
            int i5 = i3 + 2;
            byte b2 = bArr[i3 + 1];
            this.b -= 2;
            if (i5 == i4) {
                this.c = qcVar.e();
                com.facetec.sdk.py.b(qcVar);
            } else {
                qcVar.e = i5;
            }
            i = b2 & 255;
            i2 = (b & 255) << 8;
        }
        return (short) (i | i2);
    }

    @Override // com.facetec.sdk.pr
    public final int f() {
        if (this.b < 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size < 4: ");
            sb.append(this.b);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.facetec.sdk.qc qcVar = this.c;
        int i = qcVar.e;
        int i2 = qcVar.f3761a;
        if (i2 - i < 4) {
            return ((j() & 255) << 24) | ((j() & 255) << 16) | ((j() & 255) << 8) | (j() & 255);
        }
        byte[] bArr = qcVar.d;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        this.b -= 4;
        if (i3 == i2) {
            this.c = qcVar.e();
            com.facetec.sdk.py.b(qcVar);
            return i4;
        }
        qcVar.e = i3;
        return i4;
    }

    @Override // com.facetec.sdk.pr
    public final short i() {
        return com.facetec.sdk.qd.e(g());
    }

    @Override // com.facetec.sdk.pr
    public final int h() {
        return com.facetec.sdk.qd.b(f());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[EDGE_INSN: B:40:0x009c->B:37:0x009c BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    @Override // com.facetec.sdk.pr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l() {
        int i;
        if (this.b == 0) {
            throw new java.lang.IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j2 = 0;
        do {
            com.facetec.sdk.qc qcVar = this.c;
            byte[] bArr = qcVar.d;
            int i3 = qcVar.e;
            int i4 = qcVar.f3761a;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                        sb.append(java.lang.Integer.toHexString(b));
                        throw new java.lang.NumberFormatException(sb.toString());
                    }
                    z = true;
                    if (i3 != i4) {
                        this.c = qcVar.e();
                        com.facetec.sdk.py.b(qcVar);
                    } else {
                        qcVar.e = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j2) != 0) {
                    com.facetec.sdk.pk g2 = new com.facetec.sdk.pk().h(j2).g((int) b);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Number too large: ");
                    sb2.append(g2.k());
                    throw new java.lang.NumberFormatException(sb2.toString());
                }
                j2 = (j2 << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.c != null);
        this.b -= i2;
        return j2;
    }

    public final com.facetec.sdk.pq o() {
        return new com.facetec.sdk.pq(n());
    }

    @Override // com.facetec.sdk.pr
    public final com.facetec.sdk.pq a(long j2) throws java.io.EOFException {
        return new com.facetec.sdk.pq(i(j2));
    }

    public final java.lang.String k() {
        try {
            return d(this.b, com.facetec.sdk.qd.e);
        } catch (java.io.EOFException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    private java.lang.String n(long j2) throws java.io.EOFException {
        return d(j2, com.facetec.sdk.qd.e);
    }

    @Override // com.facetec.sdk.pr
    public final java.lang.String d(java.nio.charset.Charset charset) {
        try {
            return d(this.b, charset);
        } catch (java.io.EOFException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    private java.lang.String d(long j2, java.nio.charset.Charset charset) throws java.io.EOFException {
        com.facetec.sdk.qd.b(this.b, 0L, j2);
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        if (j2 > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.lang.IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(java.lang.String.valueOf(j2)));
        }
        if (j2 == 0) {
            return "";
        }
        com.facetec.sdk.qc qcVar = this.c;
        if (qcVar.e + j2 > qcVar.f3761a) {
            return new java.lang.String(i(j2), charset);
        }
        java.lang.String str = new java.lang.String(qcVar.d, qcVar.e, (int) j2, charset);
        qcVar.e = (int) (qcVar.e + j2);
        this.b -= j2;
        if (qcVar.e == qcVar.f3761a) {
            this.c = qcVar.e();
            com.facetec.sdk.py.b(qcVar);
        }
        return str;
    }

    @Override // com.facetec.sdk.pr
    public final java.lang.String m() throws java.io.EOFException {
        return e(Long.MAX_VALUE);
    }

    @Override // com.facetec.sdk.pr
    public final java.lang.String e(long j2) throws java.io.EOFException {
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException("limit < 0: ".concat(java.lang.String.valueOf(j2)));
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long c = c((byte) 10, 0L, j3);
        if (c != -1) {
            return c(c);
        }
        if (j3 < e() && d(j3 - 1) == 13 && d(j3) == 10) {
            return c(j3);
        }
        com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
        b(pkVar, 0L, java.lang.Math.min(32L, e()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\n not found: limit=");
        sb.append(java.lang.Math.min(e(), j2));
        sb.append(" content=");
        sb.append(pkVar.o().a());
        sb.append(kotlin.text.Typography.ellipsis);
        throw new java.io.EOFException(sb.toString());
    }

    final java.lang.String c(long j2) throws java.io.EOFException {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (d(j3) == 13) {
                java.lang.String n = n(j3);
                g(2L);
                return n;
            }
        }
        java.lang.String n2 = n(j2);
        g(1L);
        return n2;
    }

    public final byte[] n() {
        try {
            return i(this.b);
        } catch (java.io.EOFException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    @Override // com.facetec.sdk.pr
    public final byte[] i(long j2) throws java.io.EOFException {
        com.facetec.sdk.qd.b(this.b, 0L, j2);
        if (j2 > androidx.collection.SieveCacheKt.NodeLinkMask) {
            throw new java.lang.IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(java.lang.String.valueOf(j2)));
        }
        byte[] bArr = new byte[(int) j2];
        d(bArr);
        return bArr;
    }

    @Override // com.facetec.sdk.pr
    public final void d(byte[] bArr) throws java.io.EOFException {
        int i = 0;
        while (i < bArr.length) {
            int c = c(bArr, i, bArr.length - i);
            if (c == -1) {
                throw new java.io.EOFException();
            }
            i += c;
        }
    }

    public final int c(byte[] bArr, int i, int i2) {
        com.facetec.sdk.qd.b(bArr.length, i, i2);
        com.facetec.sdk.qc qcVar = this.c;
        if (qcVar == null) {
            return -1;
        }
        int min = java.lang.Math.min(i2, qcVar.f3761a - qcVar.e);
        try {
            java.lang.Object[] objArr = {qcVar.d, java.lang.Integer.valueOf(qcVar.e), bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(min)};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r("둪\ueae7뉀쯋\u0083踵鄥쯀懶࣫셊\u2fd9쌆⌵䄝븸", 16 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            r("鉤ⶊ\uecfd校侫ퟘ♭ᶙ형\ued57", 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr3);
            cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
            qcVar.e += min;
            this.b -= min;
            if (qcVar.e == qcVar.f3761a) {
                this.c = qcVar.e();
                com.facetec.sdk.py.b(qcVar);
            }
            return min;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        com.facetec.sdk.qc qcVar = this.c;
        if (qcVar == null) {
            return -1;
        }
        int min = java.lang.Math.min(byteBuffer.remaining(), qcVar.f3761a - qcVar.e);
        byteBuffer.put(qcVar.d, qcVar.e, min);
        qcVar.e += min;
        this.b -= min;
        if (qcVar.e == qcVar.f3761a) {
            this.c = qcVar.e();
            com.facetec.sdk.py.b(qcVar);
        }
        return min;
    }

    public final void q() {
        try {
            g(this.b);
        } catch (java.io.EOFException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    @Override // com.facetec.sdk.pr
    public final void g(long j2) throws java.io.EOFException {
        while (j2 > 0) {
            if (this.c == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(j2, r0.f3761a - this.c.e);
            long j3 = min;
            this.b -= j3;
            j2 -= j3;
            this.c.e += min;
            if (this.c.e == this.c.f3761a) {
                com.facetec.sdk.qc qcVar = this.c;
                this.c = qcVar.e();
                com.facetec.sdk.py.b(qcVar);
            }
        }
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk b(com.facetec.sdk.pq pqVar) {
        if (pqVar == null) {
            throw new java.lang.IllegalArgumentException("byteString == null");
        }
        pqVar.b(this);
        return this;
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk c(java.lang.String str) {
        return e(str, 0, str.length());
    }

    public final com.facetec.sdk.pk e(java.lang.String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0: ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > str.length()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                com.facetec.sdk.qc c = c(1);
                byte[] bArr = c.d;
                int i3 = c.f3761a - i;
                int min = java.lang.Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = (i3 + i) - c.f3761a;
                c.f3761a += i5;
                this.b += i5;
            } else {
                if (charAt2 < 2048) {
                    g((charAt2 >> 6) | 192);
                    g((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    g((charAt2 >> '\f') | 224);
                    g(((charAt2 >> 6) & 63) | 128);
                    g((charAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        g(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        g((i7 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        g(((i7 >> 12) & 63) | 128);
                        g(((i7 >> 6) & 63) | 128);
                        g((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public final com.facetec.sdk.pk d(int i) {
        if (i < 128) {
            g(i);
            return this;
        }
        if (i < 2048) {
            g((i >> 6) | 192);
            g((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                g(63);
                return this;
            }
            g((i >> 12) | 224);
            g(((i >> 6) & 63) | 128);
            g((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            g((i >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            g(((i >> 12) & 63) | 128);
            g(((i >> 6) & 63) | 128);
            g((i & 63) | 128);
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected code point: ");
        sb.append(java.lang.Integer.toHexString(i));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk c(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        return e(bArr, 0, bArr.length);
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk e(byte[] bArr, int i, int i2) {
        int i3 = i;
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        long j2 = i2;
        com.facetec.sdk.qd.b(bArr.length, i3, j2);
        int i4 = i2 + i3;
        while (i3 < i4) {
            com.facetec.sdk.qc c = c(1);
            int min = java.lang.Math.min(i4 - i3, 8192 - c.f3761a);
            try {
                java.lang.Object[] objArr = {bArr, java.lang.Integer.valueOf(i3), c.d, java.lang.Integer.valueOf(c.f3761a), java.lang.Integer.valueOf(min)};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                r("둪\ueae7뉀쯋\u0083踵鄥쯀懶࣫셊\u2fd9쌆⌵䄝븸", 15 - android.os.Process.getGidForName(""), objArr2);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                r("鉤ⶊ\uecfd校侫ퟘ♭ᶙ형\ued57", android.view.View.resolveSizeAndState(0, 0, 0) + 9, objArr3);
                cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                i3 += min;
                c.f3761a += min;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        this.b += j2;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (byteBuffer == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            com.facetec.sdk.qc c = c(1);
            int min = java.lang.Math.min(i, 8192 - c.f3761a);
            byteBuffer.get(c.d, c.f3761a, min);
            i -= min;
            c.f3761a += min;
        }
        this.b += remaining;
        return remaining;
    }

    public final long e(com.facetec.sdk.pz pzVar) throws java.io.IOException {
        if (pzVar == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        long j2 = 0;
        while (true) {
            long b = pzVar.b(this, 8192L);
            if (b == -1) {
                return j2;
            }
            j2 += b;
        }
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk g(int i) {
        com.facetec.sdk.qc c = c(1);
        byte[] bArr = c.d;
        int i2 = c.f3761a;
        c.f3761a = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk j(int i) {
        com.facetec.sdk.qc c = c(2);
        byte[] bArr = c.d;
        int i2 = c.f3761a;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        c.f3761a = i2 + 2;
        this.b += 2;
        return this;
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk h(int i) {
        com.facetec.sdk.qc c = c(4);
        byte[] bArr = c.d;
        int i2 = c.f3761a;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        c.f3761a = i2 + 4;
        this.b += 4;
        return this;
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk l(long j2) {
        boolean z;
        if (j2 == 0) {
            return g(48);
        }
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return c("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        int i = j2 < 100000000 ? j2 < 10000 ? j2 < 100 ? j2 < 10 ? 1 : 2 : j2 < 1000 ? 3 : 4 : j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8 : j2 < 1000000000000L ? j2 < okhttp3.internal.connection.RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        if (z) {
            i++;
        }
        com.facetec.sdk.qc c = c(i);
        byte[] bArr = c.d;
        int i2 = c.f3761a + i;
        while (j2 != 0) {
            i2--;
            bArr[i2] = f3744a[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c.f3761a += i;
        this.b += i;
        return this;
    }

    @Override // com.facetec.sdk.pj
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final com.facetec.sdk.pk h(long j2) {
        if (j2 == 0) {
            return g(48);
        }
        int numberOfTrailingZeros = (java.lang.Long.numberOfTrailingZeros(java.lang.Long.highestOneBit(j2)) / 4) + 1;
        com.facetec.sdk.qc c = c(numberOfTrailingZeros);
        byte[] bArr = c.d;
        int i = c.f3761a;
        for (int i2 = (c.f3761a + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f3744a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        c.f3761a += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    final com.facetec.sdk.qc c(int i) {
        if (i <= 0 || i > 8192) {
            throw new java.lang.IllegalArgumentException();
        }
        com.facetec.sdk.qc qcVar = this.c;
        if (qcVar == null) {
            com.facetec.sdk.qc c = com.facetec.sdk.py.c();
            this.c = c;
            c.i = c;
            c.j = c;
            return c;
        }
        com.facetec.sdk.qc qcVar2 = qcVar.i;
        return (qcVar2.f3761a + i > 8192 || !qcVar2.b) ? qcVar2.b(com.facetec.sdk.py.c()) : qcVar2;
    }

    @Override // com.facetec.sdk.qa
    public final void c(com.facetec.sdk.pk pkVar, long j2) {
        com.facetec.sdk.qc qcVar;
        if (pkVar == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        if (pkVar == this) {
            throw new java.lang.IllegalArgumentException("source == this");
        }
        com.facetec.sdk.qd.b(pkVar.b, 0L, j2);
        long j3 = j2;
        while (j3 > 0) {
            if (j3 < pkVar.c.f3761a - pkVar.c.e) {
                com.facetec.sdk.qc qcVar2 = this.c;
                com.facetec.sdk.qc qcVar3 = qcVar2 != null ? qcVar2.i : null;
                if (qcVar3 != null && qcVar3.b) {
                    if ((qcVar3.f3761a + j3) - (qcVar3.c ? 0 : qcVar3.e) <= 8192) {
                        pkVar.c.d(qcVar3, (int) j3);
                        pkVar.b -= j3;
                        this.b += j3;
                        return;
                    }
                }
                com.facetec.sdk.qc qcVar4 = pkVar.c;
                int i = (int) j3;
                if (i <= 0 || i > qcVar4.f3761a - qcVar4.e) {
                    throw new java.lang.IllegalArgumentException();
                }
                if (i >= 1024) {
                    qcVar = qcVar4.b();
                } else {
                    com.facetec.sdk.qc c = com.facetec.sdk.py.c();
                    try {
                        java.lang.Object[] objArr = {qcVar4.d, java.lang.Integer.valueOf(qcVar4.e), c.d, 0, java.lang.Integer.valueOf(i)};
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        r("둪\ueae7뉀쯋\u0083踵鄥쯀懶࣫셊\u2fd9쌆⌵䄝븸", android.view.Gravity.getAbsoluteGravity(0, 0) + 16, objArr2);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        r("鉤ⶊ\uecfd校侫ퟘ♭ᶙ형\ued57", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8, objArr3);
                        cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
                        qcVar = c;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                qcVar.f3761a = qcVar.e + i;
                qcVar4.e += i;
                qcVar4.i.b(qcVar);
                pkVar.c = qcVar;
            }
            com.facetec.sdk.qc qcVar5 = pkVar.c;
            long j4 = qcVar5.f3761a - qcVar5.e;
            pkVar.c = qcVar5.e();
            com.facetec.sdk.qc qcVar6 = this.c;
            if (qcVar6 == null) {
                this.c = qcVar5;
                qcVar5.i = qcVar5;
                qcVar5.j = qcVar5;
            } else {
                com.facetec.sdk.qc b = qcVar6.i.b(qcVar5);
                if (b.i == b) {
                    throw new java.lang.IllegalStateException();
                }
                if (b.i.b) {
                    int i2 = b.f3761a - b.e;
                    if (i2 <= (8192 - b.i.f3761a) + (b.i.c ? 0 : b.i.e)) {
                        b.d(b.i, i2);
                        b.e();
                        com.facetec.sdk.py.b(b);
                    }
                }
            }
            pkVar.b -= j4;
            this.b += j4;
            j3 -= j4;
        }
    }

    @Override // com.facetec.sdk.pz
    public final long b(com.facetec.sdk.pk pkVar, long j2) {
        if (pkVar == null) {
            throw new java.lang.IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j2)));
        }
        long j3 = this.b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        pkVar.c(this, j2);
        return j2;
    }

    @Override // com.facetec.sdk.pr
    public final long p() {
        return c((byte) 0, 0L, Long.MAX_VALUE);
    }

    public final long c(byte b, long j2, long j3) {
        com.facetec.sdk.qc qcVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("size=%s fromIndex=%s toIndex=%s", java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3)));
        }
        long j5 = this.b;
        long j6 = j3 > j5 ? j5 : j3;
        if (j2 == j6 || (qcVar = this.c) == null) {
            return -1L;
        }
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                qcVar = qcVar.i;
                j5 -= qcVar.f3761a - qcVar.e;
            }
        } else {
            while (true) {
                long j7 = (qcVar.f3761a - qcVar.e) + j4;
                if (j7 >= j2) {
                    break;
                }
                qcVar = qcVar.j;
                j4 = j7;
            }
            j5 = j4;
        }
        long j8 = j2;
        while (j5 < j6) {
            byte[] bArr = qcVar.d;
            int min = (int) java.lang.Math.min(qcVar.f3761a, (qcVar.e + j6) - j5);
            for (int i = (int) ((qcVar.e + j8) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - qcVar.e) + j5;
                }
            }
            j5 += qcVar.f3761a - qcVar.e;
            qcVar = qcVar.j;
            j8 = j5;
        }
        return -1L;
    }

    @Override // com.facetec.sdk.pr
    public final boolean e(com.facetec.sdk.pq pqVar) {
        int j2 = pqVar.j();
        if (j2 < 0 || this.b < j2 || pqVar.j() < j2) {
            return false;
        }
        for (int i = 0; i < j2; i++) {
            if (d(i) != pqVar.c(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facetec.sdk.qa
    public final com.facetec.sdk.qe d() {
        return com.facetec.sdk.qe.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facetec.sdk.pk)) {
            return false;
        }
        com.facetec.sdk.pk pkVar = (com.facetec.sdk.pk) obj;
        long j2 = this.b;
        if (j2 != pkVar.b) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        com.facetec.sdk.qc qcVar = this.c;
        com.facetec.sdk.qc qcVar2 = pkVar.c;
        int i = qcVar.e;
        int i2 = qcVar2.e;
        while (j3 < this.b) {
            long min = java.lang.Math.min(qcVar.f3761a - i, qcVar2.f3761a - i2);
            int i3 = 0;
            while (i3 < min) {
                if (qcVar.d[i] != qcVar2.d[i2]) {
                    return false;
                }
                i3++;
                i++;
                i2++;
            }
            if (i == qcVar.f3761a) {
                qcVar = qcVar.j;
                i = qcVar.e;
            }
            if (i2 == qcVar2.f3761a) {
                qcVar2 = qcVar2.j;
                i2 = qcVar2.e;
            }
            j3 += min;
        }
        return true;
    }

    public final int hashCode() {
        com.facetec.sdk.qc qcVar = this.c;
        if (qcVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qcVar.f3761a;
            for (int i3 = qcVar.e; i3 < i2; i3++) {
                i = (i * 31) + qcVar.d[i3];
            }
            qcVar = qcVar.j;
        } while (qcVar != this.c);
        return i;
    }

    public final java.lang.String toString() {
        com.facetec.sdk.pq qbVar;
        long j2 = this.b;
        if (j2 <= androidx.collection.SieveCacheKt.NodeLinkMask) {
            int i = (int) j2;
            if (i == 0) {
                qbVar = com.facetec.sdk.pq.b;
            } else {
                qbVar = new com.facetec.sdk.qb(this, i);
            }
            return qbVar.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.b);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
        if (this.b == 0) {
            return pkVar;
        }
        com.facetec.sdk.qc b = this.c.b();
        pkVar.c = b;
        b.i = b;
        b.j = b;
        com.facetec.sdk.qc qcVar = this.c;
        while (true) {
            qcVar = qcVar.j;
            if (qcVar != this.c) {
                pkVar.c.i.b(qcVar.b());
            } else {
                pkVar.b = this.b;
                return pkVar;
            }
        }
    }

    static void s() {
        d = (char) 55484;
        e = (char) 10431;
        g = (char) 7626;
        j = (char) 14498;
    }
}
