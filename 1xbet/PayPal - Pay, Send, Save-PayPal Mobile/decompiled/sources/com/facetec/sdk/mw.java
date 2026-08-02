package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mw implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    final com.facetec.sdk.mx f3665a;
    final com.facetec.sdk.na b;

    @javax.annotation.Nullable
    public final com.facetec.sdk.mn c;
    final int d;
    public final java.lang.String e;
    final com.facetec.sdk.mm f;

    @javax.annotation.Nullable
    final com.facetec.sdk.mw g;

    @javax.annotation.Nullable
    final com.facetec.sdk.mw h;

    @javax.annotation.Nullable
    public final com.facetec.sdk.nf i;

    @javax.annotation.Nullable
    final com.facetec.sdk.mw j;
    final long k;
    final long m;

    @javax.annotation.Nullable
    private volatile com.facetec.sdk.mf n;

    mw(com.facetec.sdk.mw.c cVar) {
        this.f3665a = cVar.e;
        this.b = cVar.c;
        this.d = cVar.d;
        this.e = cVar.b;
        this.c = cVar.f3667a;
        this.f = cVar.f.b();
        this.i = cVar.h;
        this.j = cVar.j;
        this.h = cVar.i;
        this.g = cVar.g;
        this.m = cVar.m;
        this.k = cVar.l;
    }

    public final com.facetec.sdk.mx d() {
        return this.f3665a;
    }

    public final int e() {
        return this.d;
    }

    public final boolean a() {
        int i = this.d;
        return i >= 200 && i < 300;
    }

    public final com.facetec.sdk.mm c() {
        return this.f;
    }

    @javax.annotation.Nullable
    public final com.facetec.sdk.nf b() {
        return this.i;
    }

    public final com.facetec.sdk.mw.c g() {
        return new com.facetec.sdk.mw.c(this);
    }

    @javax.annotation.Nullable
    public final com.facetec.sdk.mw i() {
        return this.g;
    }

    public final com.facetec.sdk.mf j() {
        com.facetec.sdk.mf mfVar = this.n;
        if (mfVar != null) {
            return mfVar;
        }
        com.facetec.sdk.mf d = com.facetec.sdk.mf.d(this.f);
        this.n = d;
        return d;
    }

    public final long h() {
        return this.m;
    }

    public final long f() {
        return this.k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.facetec.sdk.nf nfVar = this.i;
        if (nfVar == null) {
            throw new java.lang.IllegalStateException("response is not eligible for a body and must not be closed");
        }
        nfVar.close();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Response{protocol=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f3665a.c());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int n;

        /* renamed from: o, reason: collision with root package name */
        private static int f3666o;

        /* renamed from: a, reason: collision with root package name */
        @javax.annotation.Nullable
        com.facetec.sdk.mn f3667a;
        java.lang.String b;

        @javax.annotation.Nullable
        com.facetec.sdk.na c;
        int d;

        @javax.annotation.Nullable
        com.facetec.sdk.mx e;
        public com.facetec.sdk.mm.b f;

        @javax.annotation.Nullable
        public com.facetec.sdk.mw g;

        @javax.annotation.Nullable
        com.facetec.sdk.nf h;

        @javax.annotation.Nullable
        com.facetec.sdk.mw i;

        @javax.annotation.Nullable
        com.facetec.sdk.mw j;
        long l;
        long m;

        static void init$0() {
            $$a = new byte[]{126, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
            $$b = 147;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void k(short s, short s2, int i, java.lang.Object[] objArr) {
            int i2;
            int i3 = s2 * 3;
            byte[] bArr = $$a;
            int i4 = s + 4;
            int i5 = (i * 3) + 99;
            byte[] bArr2 = new byte[18 - i3];
            if (bArr == null) {
                int i6 = i5;
                int i7 = 0;
                int i8 = i4;
                int i9 = i6 + (-i4) + 3;
                i2 = i7;
                int i10 = i8;
                i5 = i9;
                i4 = i10;
                int i11 = i4 + 1;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == 17 - i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i12 = i5;
                i8 = i11;
                i4 = bArr[i11];
                i6 = i12;
                int i92 = i6 + (-i4) + 3;
                i2 = i7;
                int i102 = i8;
                i5 = i92;
                i4 = i102;
                int i112 = i4 + 1;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == 17 - i3) {
                }
            } else {
                i2 = 0;
                int i1122 = i4 + 1;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == 17 - i3) {
                }
            }
        }

        public static void a(long j, long j2) {
            f3666o = (n + 75) % 128;
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[9]);
            byte b2 = (byte) (b + 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            k(b, b2, b2, objArr);
            if (java.lang.Class.forName((java.lang.String) objArr[0]).getField("e").getBoolean(null)) {
                int i = f3666o;
                int i2 = i & 71;
                int i3 = (i ^ 71) | i2;
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                n = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
            byte b3 = (byte) (-bArr[9]);
            byte b4 = (byte) (b3 + 1);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            k(b3, b4, b4, objArr2);
            java.lang.Class.forName((java.lang.String) objArr2[0]).getField("e").setBoolean(null, true);
            int i5 = n;
            f3666o = ((-2) - (~(i5 + 64))) % 128;
            f3666o = (i5 + 19) % 128;
            try {
                java.lang.reflect.Constructor declaredConstructor = com.facetec.sdk.by.AnonymousClass3.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                java.lang.Object[] objArr3 = {declaredConstructor.newInstance(null)};
                java.lang.reflect.Method method = com.facetec.sdk.dk.class.getMethod("e", java.lang.Runnable.class);
                method.setAccessible(true);
                method.invoke(null, objArr3);
                int i6 = f3666o;
                int i7 = ((i6 & (-34)) | ((~i6) & 33)) + ((i6 & 33) << 1);
                n = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public c() {
            this.d = -1;
            this.f = new com.facetec.sdk.mm.b();
        }

        c(com.facetec.sdk.mw mwVar) {
            this.d = -1;
            this.e = mwVar.f3665a;
            this.c = mwVar.b;
            this.d = mwVar.d;
            this.b = mwVar.e;
            this.f3667a = mwVar.c;
            this.f = mwVar.f.c();
            this.h = mwVar.i;
            this.j = mwVar.j;
            this.i = mwVar.h;
            this.g = mwVar.g;
            this.m = mwVar.m;
            this.l = mwVar.k;
        }

        public final com.facetec.sdk.mw.c c(com.facetec.sdk.mx mxVar) {
            this.e = mxVar;
            return this;
        }

        public final com.facetec.sdk.mw.c c(com.facetec.sdk.na naVar) {
            this.c = naVar;
            return this;
        }

        public final com.facetec.sdk.mw.c d(int i) {
            this.d = i;
            return this;
        }

        public final com.facetec.sdk.mw.c d(java.lang.String str) {
            this.b = str;
            return this;
        }

        public final com.facetec.sdk.mw.c c(@javax.annotation.Nullable com.facetec.sdk.mn mnVar) {
            this.f3667a = mnVar;
            return this;
        }

        public final com.facetec.sdk.mw.c c(java.lang.String str, java.lang.String str2) {
            this.f.b(str, str2);
            return this;
        }

        public final com.facetec.sdk.mw.c a(com.facetec.sdk.mm mmVar) {
            this.f = mmVar.c();
            return this;
        }

        public final com.facetec.sdk.mw.c d(@javax.annotation.Nullable com.facetec.sdk.nf nfVar) {
            this.h = nfVar;
            return this;
        }

        public final com.facetec.sdk.mw.c e(@javax.annotation.Nullable com.facetec.sdk.mw mwVar) {
            if (mwVar != null) {
                a("networkResponse", mwVar);
            }
            this.j = mwVar;
            return this;
        }

        public final com.facetec.sdk.mw.c c(@javax.annotation.Nullable com.facetec.sdk.mw mwVar) {
            if (mwVar != null) {
                a("cacheResponse", mwVar);
            }
            this.i = mwVar;
            return this;
        }

        private static void a(java.lang.String str, com.facetec.sdk.mw mwVar) {
            if (mwVar.i != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (mwVar.j != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (mwVar.h != null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            if (mwVar.g == null) {
                return;
            }
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append(".priorResponse != null");
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }

        public final com.facetec.sdk.mw.c d(long j) {
            this.m = j;
            return this;
        }

        public final com.facetec.sdk.mw.c e(long j) {
            this.l = j;
            return this;
        }

        public final com.facetec.sdk.mw b() {
            if (this.e == null) {
                throw new java.lang.IllegalStateException("request == null");
            }
            if (this.c == null) {
                throw new java.lang.IllegalStateException("protocol == null");
            }
            if (this.d < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("code < 0: ");
                sb.append(this.d);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (this.b == null) {
                throw new java.lang.IllegalStateException("message == null");
            }
            return new com.facetec.sdk.mw(this);
        }

        static {
            init$0();
            f3666o = 0;
            n = 1;
        }
    }

    @javax.annotation.Nullable
    public final java.lang.String b(java.lang.String str) {
        java.lang.String c2 = this.f.c(str);
        if (c2 != null) {
            return c2;
        }
        return null;
    }
}
