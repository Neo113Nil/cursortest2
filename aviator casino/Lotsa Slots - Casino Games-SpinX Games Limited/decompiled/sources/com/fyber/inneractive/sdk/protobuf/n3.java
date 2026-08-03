package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class n3 {
    public static final com.fyber.inneractive.sdk.protobuf.n3 f = new com.fyber.inneractive.sdk.protobuf.n3(0, new int[0], new java.lang.Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f4208a;
    public int[] b;
    public java.lang.Object[] c;
    public int d;
    public boolean e;

    public n3() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    public static com.fyber.inneractive.sdk.protobuf.n3 a(com.fyber.inneractive.sdk.protobuf.n3 n3Var, com.fyber.inneractive.sdk.protobuf.n3 n3Var2) {
        int i = n3Var.f4208a + n3Var2.f4208a;
        int[] copyOf = java.util.Arrays.copyOf(n3Var.b, i);
        java.lang.System.arraycopy(n3Var2.b, 0, copyOf, n3Var.f4208a, n3Var2.f4208a);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(n3Var.c, i);
        java.lang.System.arraycopy(n3Var2.c, 0, copyOf2, n3Var.f4208a, n3Var2.f4208a);
        return new com.fyber.inneractive.sdk.protobuf.n3(i, copyOf, copyOf2, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.fyber.inneractive.sdk.protobuf.n3)) {
            return false;
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = (com.fyber.inneractive.sdk.protobuf.n3) obj;
        int i = this.f4208a;
        if (i == n3Var.f4208a) {
            int[] iArr = this.b;
            int[] iArr2 = n3Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.c;
                    java.lang.Object[] objArr2 = n3Var.c;
                    int i3 = this.f4208a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4208a;
        int i2 = (i + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        java.lang.Object[] objArr = this.c;
        int i7 = this.f4208a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public n3(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.d = -1;
        this.f4208a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final boolean a(int i, com.fyber.inneractive.sdk.protobuf.w wVar) {
        int t;
        if (!this.e) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            a(i, java.lang.Long.valueOf(wVar.l()));
            return true;
        }
        if (i3 == 1) {
            a(i, java.lang.Long.valueOf(wVar.i()));
            return true;
        }
        if (i3 == 2) {
            a(i, wVar.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                int i4 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
                throw new com.fyber.inneractive.sdk.protobuf.m1();
            }
            a(i, java.lang.Integer.valueOf(wVar.h()));
            return true;
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
        do {
            t = wVar.t();
            if (t == 0) {
                break;
            }
        } while (n3Var.a(t, wVar));
        wVar.a((i2 << 3) | 4);
        a(i, n3Var);
        return true;
    }

    public final void a(int i, java.lang.Object obj) {
        if (this.e) {
            int i2 = this.f4208a;
            int[] iArr = this.b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.b = java.util.Arrays.copyOf(iArr, i3);
                this.c = java.util.Arrays.copyOf(this.c, i3);
            }
            int[] iArr2 = this.b;
            int i4 = this.f4208a;
            iArr2[i4] = i;
            this.c[i4] = obj;
            this.f4208a = i4 + 1;
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public final void a(com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        if (this.f4208a == 0) {
            return;
        }
        c0Var.getClass();
        for (int i = 0; i < this.f4208a; i++) {
            int i2 = this.b[i];
            java.lang.Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0Var.f4181a.b(i3, ((java.lang.Long) obj).longValue());
            } else if (i4 == 1) {
                c0Var.f4181a.a(i3, ((java.lang.Long) obj).longValue());
            } else if (i4 == 2) {
                c0Var.f4181a.a(i3, (com.fyber.inneractive.sdk.protobuf.s) obj);
            } else if (i4 != 3) {
                if (i4 != 5) {
                    int i5 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
                    throw new java.lang.RuntimeException(new com.fyber.inneractive.sdk.protobuf.m1());
                }
                c0Var.f4181a.a(i3, ((java.lang.Integer) obj).intValue());
            } else {
                c0Var.f4181a.c(i3, 3);
                ((com.fyber.inneractive.sdk.protobuf.n3) obj).a(c0Var);
                c0Var.f4181a.c(i3, 4);
            }
        }
    }

    public final int a() {
        int b;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4208a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                b = com.fyber.inneractive.sdk.protobuf.b0.b(i5) + com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                ((java.lang.Long) this.c[i3]).getClass();
                b = com.fyber.inneractive.sdk.protobuf.b0.b(i5) + 8;
            } else if (i6 == 2) {
                com.fyber.inneractive.sdk.protobuf.s sVar = (com.fyber.inneractive.sdk.protobuf.s) this.c[i3];
                b = com.fyber.inneractive.sdk.protobuf.b0.a(sVar) + com.fyber.inneractive.sdk.protobuf.b0.b(i5);
            } else if (i6 != 3) {
                if (i6 != 5) {
                    int i7 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
                    throw new java.lang.IllegalStateException(new com.fyber.inneractive.sdk.protobuf.m1());
                }
                ((java.lang.Integer) this.c[i3]).getClass();
                b = com.fyber.inneractive.sdk.protobuf.b0.b(i5) + 4;
            } else {
                i2 = ((com.fyber.inneractive.sdk.protobuf.n3) this.c[i3]).a() + (com.fyber.inneractive.sdk.protobuf.b0.b(i5) * 2) + i2;
            }
            i2 = b + i2;
        }
        this.d = i2;
        return i2;
    }
}
