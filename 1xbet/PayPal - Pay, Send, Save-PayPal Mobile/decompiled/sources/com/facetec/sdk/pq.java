package com.facetec.sdk;

/* loaded from: classes8.dex */
public class pq implements java.io.Serializable, java.lang.Comparable<com.facetec.sdk.pq> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    public static final com.facetec.sdk.pq b;
    private static char[] d;
    private static int[] f;

    /* renamed from: a, reason: collision with root package name */
    final byte[] f3749a;
    transient int c;
    private transient java.lang.String e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = i2 * 4;
        int i6 = 73 - (i * 3);
        int i7 = 4 - (i3 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7++;
            i6 += i8;
            bArr2[i4] = (byte) i6;
            if (i4 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i8 = bArr[i7];
            i4++;
            i7++;
            i6 += i8;
            bArr2[i4] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{45, -27, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 19};
        $$b = 67;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.facetec.sdk.pq pqVar) {
        com.facetec.sdk.pq pqVar2 = pqVar;
        int j = j();
        int j2 = pqVar2.j();
        int min = java.lang.Math.min(j, j2);
        for (int i = 0; i < min; i++) {
            int c = c(i) & 255;
            int c2 = pqVar2.c(i) & 255;
            if (c != c2) {
                return c < c2 ? -1 : 1;
            }
        }
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    static {
        init$0();
        f();
        d = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
        b = d(new byte[0]);
    }

    pq(byte[] bArr) {
        this.f3749a = bArr;
    }

    public static com.facetec.sdk.pq d(byte... bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("data == null");
        }
        return new com.facetec.sdk.pq((byte[]) bArr.clone());
    }

    private static void k(int[] iArr, int i, java.lang.Object[] objArr) {
        com.facetec.sdk.hl hlVar = new com.facetec.sdk.hl();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f;
        int i2 = -915298838;
        long j = 0;
        int i3 = 1;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i4])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(i2);
                    if (d2 == null) {
                        d2 = com.facetec.sdk.al.c((char) (android.view.MotionEvent.axisFromString("") + 28977), android.widget.ExpandableListView.getPackedPositionChild(j) + 1694, 24 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1855905554, false, "H", new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    iArr3[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).intValue();
                    i4++;
                    i2 = -915298838;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[0] = java.lang.Integer.valueOf(iArr5[i5]);
                java.lang.Object d3 = com.facetec.sdk.al.d(-915298838);
                if (d3 == null) {
                    char packedPositionGroup = (char) (28976 - android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                    float complexToFloat = android.util.TypedValue.complexToFloat(0);
                    java.lang.Class[] clsArr = new java.lang.Class[i3];
                    clsArr[0] = java.lang.Integer.TYPE;
                    d3 = com.facetec.sdk.al.c(packedPositionGroup, 1694 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), 24 - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), 1855905554, false, "H", clsArr);
                }
                iArr6[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).intValue();
                i5++;
                i3 = 1;
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        hlVar.d = 0;
        while (hlVar.d < iArr.length) {
            cArr[0] = (char) (iArr[hlVar.d] >> 16);
            cArr[1] = (char) iArr[hlVar.d];
            cArr[2] = (char) (iArr[hlVar.d + 1] >> 16);
            cArr[3] = (char) iArr[hlVar.d + 1];
            hlVar.c = (cArr[0] << 16) + cArr[1];
            hlVar.e = (cArr[2] << 16) + cArr[3];
            com.facetec.sdk.hl.d(iArr4);
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                hlVar.c ^= iArr4[i6];
                java.lang.Object[] objArr4 = {hlVar, java.lang.Integer.valueOf(com.facetec.sdk.hl.c(hlVar.c)), hlVar, hlVar};
                java.lang.Object d4 = com.facetec.sdk.al.d(-1807501612);
                if (d4 == null) {
                    char scrollBarSize = (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8);
                    int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                    int gidForName = android.os.Process.getGidForName("");
                    byte b2 = (byte) ($$b & 5);
                    byte b3 = (byte) (b2 - 1);
                    d4 = com.facetec.sdk.al.c(scrollBarSize, 407 - (doubleTapTimeout >> 16), 23 - gidForName, 866962476, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) d4).invoke(null, objArr4)).intValue();
                hlVar.c = hlVar.e;
                hlVar.e = intValue;
                i6++;
            }
            int i8 = hlVar.c;
            hlVar.c = hlVar.e;
            hlVar.e = i8;
            hlVar.e ^= iArr4[16];
            hlVar.c ^= iArr4[17];
            int i9 = hlVar.c;
            int i10 = hlVar.e;
            cArr[0] = (char) (hlVar.c >>> 16);
            cArr[1] = (char) hlVar.c;
            cArr[2] = (char) (hlVar.e >>> 16);
            cArr[3] = (char) hlVar.e;
            com.facetec.sdk.hl.d(iArr4);
            cArr2[hlVar.d * 2] = cArr[0];
            cArr2[(hlVar.d * 2) + 1] = cArr[1];
            cArr2[(hlVar.d * 2) + 2] = cArr[2];
            cArr2[(hlVar.d * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {hlVar, hlVar};
            java.lang.Object d5 = com.facetec.sdk.al.d(-260749244);
            if (d5 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                d5 = com.facetec.sdk.al.c((char) (18696 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1788 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, 1469723324, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) d5).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public static com.facetec.sdk.pq d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("s == null");
        }
        com.facetec.sdk.pq pqVar = new com.facetec.sdk.pq(str.getBytes(com.facetec.sdk.qd.e));
        pqVar.e = str;
        return pqVar;
    }

    public java.lang.String e() {
        java.lang.String str = this.e;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = new java.lang.String(this.f3749a, com.facetec.sdk.qd.e);
        this.e = str2;
        return str2;
    }

    public java.lang.String d() {
        return com.facetec.sdk.pl.c(this.f3749a);
    }

    public com.facetec.sdk.pq c() {
        return a("SHA-1");
    }

    public com.facetec.sdk.pq b() {
        return a("SHA-256");
    }

    private com.facetec.sdk.pq a(java.lang.String str) {
        try {
            return d(java.security.MessageDigest.getInstance(str).digest(this.f3749a));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @javax.annotation.Nullable
    public static com.facetec.sdk.pq e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("base64 == null");
        }
        byte[] c = com.facetec.sdk.pl.c(str);
        if (c != null) {
            return new com.facetec.sdk.pq(c);
        }
        return null;
    }

    public java.lang.String a() {
        byte[] bArr = this.f3749a;
        char[] cArr = new char[bArr.length << 1];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            char[] cArr2 = d;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            cArr[i + 1] = cArr2[b2 & com.google.common.base.Ascii.SI];
            i2++;
            i += 2;
        }
        return new java.lang.String(cArr);
    }

    public static com.facetec.sdk.pq c(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Unexpected hex string: ".concat(java.lang.String.valueOf(str)));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) ((c(str.charAt(i2)) << 4) + c(str.charAt(i2 + 1)));
        }
        return d(bArr);
    }

    private static int c(char c) {
        if (c >= '0' && c <= '9') {
            return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            throw new java.lang.IllegalArgumentException("Unexpected hex digit: ".concat(java.lang.String.valueOf(c)));
        }
        return c - '7';
    }

    public com.facetec.sdk.pq h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f3749a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new com.facetec.sdk.pq(bArr2);
            }
            i++;
        }
    }

    public com.facetec.sdk.pq a(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3749a;
        if (i2 > bArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex > length(");
            sb.append(this.f3749a.length);
            sb.append(")");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        try {
            java.lang.Object[] objArr = {bArr, java.lang.Integer.valueOf(i), bArr2, 0, java.lang.Integer.valueOf(i3)};
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            k(new int[]{-19658290, 607735792, 226367612, -550316037, 1350200423, -2114285816, -1093579160, -1580471059}, 16 - android.text.TextUtils.indexOf("", "", 0), objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            k(new int[]{-2102205139, 1498796260, -766284188, 1254027773, 16922930, 586791462}, 9 - (android.os.Process.myPid() >> 22), objArr3);
            cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr);
            return new com.facetec.sdk.pq(bArr2);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public byte c(int i) {
        return this.f3749a[i];
    }

    public int j() {
        return this.f3749a.length;
    }

    public byte[] i() {
        return (byte[]) this.f3749a.clone();
    }

    void b(com.facetec.sdk.pk pkVar) {
        byte[] bArr = this.f3749a;
        pkVar.e(bArr, 0, bArr.length);
    }

    public boolean a(int i, com.facetec.sdk.pq pqVar, int i2, int i3) {
        return pqVar.b(0, this.f3749a, 0, i3);
    }

    public boolean b(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f3749a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && com.facetec.sdk.qd.b(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.facetec.sdk.pq) {
            com.facetec.sdk.pq pqVar = (com.facetec.sdk.pq) obj;
            int j = pqVar.j();
            byte[] bArr = this.f3749a;
            if (j == bArr.length && pqVar.b(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = java.util.Arrays.hashCode(this.f3749a);
        this.c = hashCode;
        return hashCode;
    }

    public java.lang.String toString() {
        if (this.f3749a.length == 0) {
            return "[size=0]";
        }
        java.lang.String e = e();
        int length = e.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = e.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = e.codePointAt(i);
            if ((!java.lang.Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += java.lang.Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i == -1) {
            if (this.f3749a.length <= 64) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("[hex=");
                sb.append(a());
                sb.append("]");
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("[size=");
            sb2.append(this.f3749a.length);
            sb2.append(" hex=");
            sb2.append(a(0, 64).a());
            sb2.append("…]");
            return sb2.toString();
        }
        java.lang.String replace = e.substring(0, i).replace("\\", "\\\\").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\\n").replace("\r", "\\r");
        if (i < e.length()) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("[size=");
            sb3.append(this.f3749a.length);
            sb3.append(" text=");
            sb3.append(replace);
            sb3.append("…]");
            return sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("[text=");
        sb4.append(replace);
        sb4.append("]");
        return sb4.toString();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new java.lang.IllegalArgumentException("in == null");
        }
        if (readInt < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(readInt)));
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new java.io.EOFException();
            }
            i += read;
        }
        com.facetec.sdk.pq pqVar = new com.facetec.sdk.pq(bArr);
        try {
            java.lang.reflect.Field declaredField = com.facetec.sdk.pq.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            declaredField.set(this, pqVar.f3749a);
        } catch (java.lang.IllegalAccessException unused) {
            throw new java.lang.AssertionError();
        } catch (java.lang.NoSuchFieldException unused2) {
            throw new java.lang.AssertionError();
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(this.f3749a.length);
        objectOutputStream.write(this.f3749a);
    }

    static void f() {
        f = new int[]{-1561034042, -1074719583, -356907353, 1323302432, -417228760, 714309887, -1057771815, -99671634, -557536591, 2116243434, 324769606, 1843870975, 1773264121, 550591371, -1938024724, -1969035102, 338737829, 2093897126};
    }
}
