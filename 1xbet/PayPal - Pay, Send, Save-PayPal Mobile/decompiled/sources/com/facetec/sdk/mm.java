package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mm {
    private final java.lang.String[] b;

    mm(com.facetec.sdk.mm.b bVar) {
        this.b = (java.lang.String[]) bVar.e.toArray(new java.lang.String[bVar.e.size()]);
    }

    @javax.annotation.Nullable
    public final java.lang.String c(java.lang.String str) {
        java.lang.String[] strArr = this.b;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final int e() {
        return this.b.length / 2;
    }

    public final java.lang.String a(int i) {
        return this.b[i << 1];
    }

    public final java.lang.String e(int i) {
        return this.b[(i << 1) + 1];
    }

    public final com.facetec.sdk.mm.b c() {
        com.facetec.sdk.mm.b bVar = new com.facetec.sdk.mm.b();
        java.util.Collections.addAll(bVar.e, this.b);
        return bVar;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        return (obj instanceof com.facetec.sdk.mm) && java.util.Arrays.equals(((com.facetec.sdk.mm) obj).b, this.b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int e = e();
        for (int i = 0; i < e; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(e(i));
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    static void a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                throw new java.lang.IllegalArgumentException(com.facetec.sdk.nh.c("Unexpected char %#04x at %d in header name: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i), str));
            }
        }
    }

    static void b(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("value for name ");
            sb.append(str2);
            sb.append(" == null");
            throw new java.lang.NullPointerException(sb.toString());
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new java.lang.IllegalArgumentException(com.facetec.sdk.nh.c("Unexpected char %#04x at %d in %s value: %s", java.lang.Integer.valueOf(charAt), java.lang.Integer.valueOf(i), str2, str));
            }
        }
    }

    public static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int b;
        private static int c;
        final java.util.List<java.lang.String> e = new java.util.ArrayList(20);

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(byte b2, short s, short s2, java.lang.Object[] objArr) {
            int i;
            int i2 = 20 - (b2 * 17);
            int i3 = 101 - (s2 * 2);
            int i4 = s * 17;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[18 - i4];
            int i5 = 17 - i4;
            if (bArr == null) {
                int i6 = i2;
                int i7 = i5;
                int i8 = 0;
                int i9 = i7 + (-i2) + 3;
                i = i8;
                int i10 = i6;
                i3 = i9;
                i2 = i10;
                bArr2[i] = (byte) i3;
                int i11 = i2 + 1;
                if (i == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i12 = i3;
                i6 = i11;
                i2 = bArr[i11];
                i8 = i + 1;
                i7 = i12;
                int i92 = i7 + (-i2) + 3;
                i = i8;
                int i102 = i6;
                i3 = i92;
                i2 = i102;
                bArr2[i] = (byte) i3;
                int i112 = i2 + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i3;
                int i1122 = i2 + 1;
                if (i == i5) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, kotlin.io.encoding.Base64.padSymbol, -78, -87, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
            $$b = 116;
        }

        public static void b(long j, long j2) {
            int i = c + 117;
            b = i % 128;
            java.lang.Object obj = null;
            if (i % 2 == 0) {
                com.facetec.sdk.by.e.class.getField("a").get(null);
                throw null;
            }
            java.lang.Object obj2 = com.facetec.sdk.by.e.class.getField("a").get(null);
            com.facetec.sdk.gr.b.c();
            com.facetec.sdk.gr.b.c();
            int i2 = b;
            int i3 = i2 & 55;
            int i4 = (i2 | 55) & (~i3);
            int i5 = i3 << 1;
            c = ((i4 & i5) + (i4 | i5)) % 128;
            try {
                byte[] bArr = $$a;
                byte b2 = bArr[9];
                java.lang.Object[] objArr = new java.lang.Object[1];
                d(b2, (byte) (b2 - 1), b2, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                byte b3 = bArr[9];
                byte b4 = (byte) (b3 - 1);
                byte b5 = b3;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                d(b4, b5, (byte) (b5 - 1), objArr2);
                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                method.setAccessible(true);
                method.invoke(null, null, obj2);
                int i6 = b;
                int i7 = i6 ^ 125;
                int i8 = -(-((i6 & 125) << 1));
                int i9 = (i7 & i8) + (i8 | i7);
                c = i9 % 128;
                if (i9 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public final com.facetec.sdk.mm.b b(java.lang.String str, java.lang.String str2) {
            com.facetec.sdk.mm.a(str);
            com.facetec.sdk.mm.b(str2, str);
            return a(str, str2);
        }

        public final com.facetec.sdk.mm.b e(java.lang.String str, java.lang.String str2) {
            com.facetec.sdk.mm.a(str);
            return a(str, str2);
        }

        final com.facetec.sdk.mm.b a(java.lang.String str, java.lang.String str2) {
            this.e.add(str);
            this.e.add(str2.trim());
            return this;
        }

        public final com.facetec.sdk.mm.b e(java.lang.String str) {
            int i = 0;
            while (i < this.e.size()) {
                if (str.equalsIgnoreCase(this.e.get(i))) {
                    this.e.remove(i);
                    this.e.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final com.facetec.sdk.mm.b c(java.lang.String str, java.lang.String str2) {
            com.facetec.sdk.mm.a(str);
            com.facetec.sdk.mm.b(str2, str);
            e(str);
            a(str, str2);
            return this;
        }

        public final com.facetec.sdk.mm b() {
            return new com.facetec.sdk.mm(this);
        }

        static {
            init$0();
            c = 0;
            b = 1;
        }
    }
}
