package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pe {
    private byte[] f;
    private byte[] i;
    private static final byte[] b = {42};

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f3742a = new java.lang.String[0];
    private static final java.lang.String[] d = {"*"};
    private static final com.facetec.sdk.pe e = new com.facetec.sdk.pe();
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.CountDownLatch g = new java.util.concurrent.CountDownLatch(1);

    public static com.facetec.sdk.pe d() {
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0065, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0063, code lost:
    
        if (r0 == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String[] b(java.lang.String[] strArr) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String[] strArr2;
        java.lang.String[] strArr3;
        java.io.InputStream resourceAsStream;
        int i = 0;
        if (this.c.get() || !this.c.compareAndSet(false, true)) {
            try {
                this.g.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        resourceAsStream = com.facetec.sdk.pe.class.getResourceAsStream("publicsuffixes.gz");
                        break;
                    } catch (java.lang.Throwable th) {
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (java.io.InterruptedIOException unused2) {
                    java.lang.Thread.interrupted();
                    z = true;
                } catch (java.io.IOException e2) {
                    com.facetec.sdk.pa.d().d(5, "Failed to read public suffix list", e2);
                }
            }
            if (resourceAsStream != null) {
                com.facetec.sdk.pr d2 = com.facetec.sdk.pt.d(new com.facetec.sdk.pv(com.facetec.sdk.pt.e(resourceAsStream)));
                try {
                    byte[] bArr = new byte[d2.f()];
                    d2.d(bArr);
                    byte[] bArr2 = new byte[d2.f()];
                    d2.d(bArr2);
                    synchronized (this) {
                        this.f = bArr;
                        this.i = bArr2;
                    }
                    this.g.countDown();
                } finally {
                    com.facetec.sdk.nh.c(d2);
                }
            }
        }
        synchronized (this) {
            if (this.f == null) {
                throw new java.lang.IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr3 = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr3[i2] = strArr[i2].getBytes(com.facetec.sdk.nh.f3678a);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = b(this.f, bArr3, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr4 = (byte[][]) bArr3.clone();
            for (int i4 = 0; i4 < bArr4.length - 1; i4++) {
                bArr4[i4] = b;
                str3 = b(this.f, bArr4, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                java.lang.String b2 = b(this.i, bArr3, i);
                if (b2 != null) {
                    str = b2;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return "!".concat(java.lang.String.valueOf(str)).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return d;
        }
        if (str2 != null) {
            strArr2 = str2.split("\\.");
        } else {
            strArr2 = f3742a;
        }
        if (str3 != null) {
            strArr3 = str3.split("\\.");
        } else {
            strArr3 = f3742a;
        }
        return strArr2.length > strArr3.length ? strArr2 : strArr3;
    }

    private static java.lang.String b(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 >= 0 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new java.lang.String(bArr, i7, i9, com.facetec.sdk.nh.f3678a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }
}
