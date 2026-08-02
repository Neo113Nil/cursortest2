package Z;

import A0.J0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import r0.AbstractC2346c;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class j implements Iterable, j4.a {

    /* renamed from: o, reason: collision with root package name */
    public static final j f6198o = new j(0, 0, 0, null);

    /* renamed from: k, reason: collision with root package name */
    public final long f6199k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6200l;

    /* renamed from: m, reason: collision with root package name */
    public final long f6201m;

    /* renamed from: n, reason: collision with root package name */
    public final long[] f6202n;

    public j(long j5, long j6, long j7, long[] jArr) {
        this.f6199k = j5;
        this.f6200l = j6;
        this.f6201m = j7;
        this.f6202n = jArr;
    }

    public final j c(j jVar) {
        j jVar2;
        long[] jArr;
        j jVar3 = f6198o;
        if (jVar == jVar3) {
            return this;
        }
        if (this == jVar3) {
            return jVar3;
        }
        long j5 = jVar.f6201m;
        long j6 = this.f6201m;
        long[] jArr2 = jVar.f6202n;
        long j7 = jVar.f6200l;
        long j8 = jVar.f6199k;
        if (j5 == j6 && jArr2 == (jArr = this.f6202n)) {
            return new j(this.f6199k & (~j8), (~j7) & this.f6200l, j6, jArr);
        }
        if (jArr2 != null) {
            jVar2 = this;
            for (long j9 : jArr2) {
                jVar2 = jVar2.d(j9);
            }
        } else {
            jVar2 = this;
        }
        long j10 = 0;
        long j11 = jVar.f6201m;
        if (j7 != 0) {
            for (int i = 0; i < 64; i++) {
                if ((j7 & (1 << i)) != 0) {
                    jVar2 = jVar2.d(i + j11);
                }
            }
        }
        if (j8 != 0) {
            int i5 = 0;
            while (i5 < 64) {
                if (((1 << i5) & j8) != j10) {
                    jVar2 = jVar2.d(i5 + j11 + 64);
                }
                i5++;
                j10 = 0;
            }
        }
        return jVar2;
    }

    public final j d(long j5) {
        long[] jArr;
        int c5;
        long[] jArr2;
        long j6 = j5 - this.f6201m;
        long j7 = 0;
        if (kotlin.jvm.internal.l.h(j6, j7) >= 0 && kotlin.jvm.internal.l.h(j6, 64) < 0) {
            long j8 = 1 << ((int) j6);
            long j9 = this.f6200l;
            if ((j9 & j8) != 0) {
                return new j(this.f6199k, j9 & (~j8), this.f6201m, this.f6202n);
            }
        } else if (kotlin.jvm.internal.l.h(j6, 64) >= 0 && kotlin.jvm.internal.l.h(j6, 128) < 0) {
            long j10 = 1 << (((int) j6) - 64);
            long j11 = this.f6199k;
            if ((j11 & j10) != 0) {
                return new j(j11 & (~j10), this.f6200l, this.f6201m, this.f6202n);
            }
        } else if (kotlin.jvm.internal.l.h(j6, j7) < 0 && (jArr = this.f6202n) != null && (c5 = q.c(jArr, j5)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (c5 > 0) {
                    X3.l.v0(jArr, jArr3, 0, 0, c5);
                }
                if (c5 < i) {
                    X3.l.v0(jArr, jArr3, c5, c5 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.f6199k, this.f6200l, this.f6201m, jArr2);
        }
        return this;
    }

    public final boolean e(long j5) {
        long[] jArr;
        long j6 = j5 - this.f6201m;
        long j7 = 0;
        return (kotlin.jvm.internal.l.h(j6, j7) < 0 || kotlin.jvm.internal.l.h(j6, (long) 64) >= 0) ? (kotlin.jvm.internal.l.h(j6, (long) 64) < 0 || kotlin.jvm.internal.l.h(j6, (long) 128) >= 0) ? kotlin.jvm.internal.l.h(j6, j7) <= 0 && (jArr = this.f6202n) != null && q.c(jArr, j5) >= 0 : ((1 << (((int) j6) - 64)) & this.f6199k) != 0 : ((1 << ((int) j6)) & this.f6200l) != 0;
    }

    public final j f(j jVar) {
        long j5;
        j jVar2;
        j jVar3 = jVar;
        j jVar4 = f6198o;
        if (jVar3 == jVar4) {
            return this;
        }
        if (this == jVar4) {
            return jVar3;
        }
        long j6 = jVar3.f6201m;
        long j7 = this.f6201m;
        long j8 = this.f6200l;
        long j9 = this.f6199k;
        long[] jArr = jVar3.f6202n;
        long j10 = jVar3.f6200l;
        long j11 = jVar3.f6199k;
        if (j6 == j7) {
            long[] jArr2 = this.f6202n;
            j5 = j8;
            if (jArr == jArr2) {
                return new j(j9 | j11, j5 | j10, j7, jArr2);
            }
        } else {
            j5 = j8;
        }
        int i = 0;
        long[] jArr3 = this.f6202n;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    jVar3 = jVar3.g(j12);
                }
            }
            long j13 = this.f6201m;
            if (j5 != 0) {
                for (int i5 = 0; i5 < 64; i5++) {
                    if (((1 << i5) & j5) != 0) {
                        jVar3 = jVar3.g(i5 + j13);
                    }
                }
            }
            if (j9 != 0) {
                while (i < 64) {
                    if (((1 << i) & j9) != 0) {
                        jVar3 = jVar3.g(i + j13 + 64);
                    }
                    i++;
                }
            }
            return jVar3;
        }
        if (jArr != null) {
            jVar2 = this;
            for (long j14 : jArr) {
                jVar2 = jVar2.g(j14);
            }
        } else {
            jVar2 = this;
        }
        long j15 = jVar3.f6201m;
        if (j10 != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if (((1 << i6) & j10) != 0) {
                    jVar2 = jVar2.g(i6 + j15);
                }
            }
        }
        if (j11 != 0) {
            while (i < 64) {
                if (((1 << i) & j11) != 0) {
                    jVar2 = jVar2.g(i + j15 + 64);
                }
                i++;
            }
        }
        return jVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0162, code lost:
    
        r3 = (r.x) r3.f304k;
        r4 = r3.f19058b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0168, code lost:
    
        if (r4 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017c, code lost:
    
        if (r3 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017f, code lost:
    
        r32 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018d, code lost:
    
        return new Z.j(r26, r28, r30, r32).g(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        r5 = new long[r4];
        r3 = r3.f19057a;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        if (r9 >= r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        r5[r9] = r3[r9];
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
    
        r32 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j g(long j5) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        int i;
        J0 j02;
        r.x xVar;
        long j11 = this.f6201m;
        long j12 = j5 - j11;
        long j13 = 0;
        int h3 = kotlin.jvm.internal.l.h(j12, j13);
        long j14 = this.f6200l;
        long j15 = 1;
        if (h3 < 0 || kotlin.jvm.internal.l.h(j12, 64) >= 0) {
            long j16 = 64;
            int h4 = kotlin.jvm.internal.l.h(j12, j16);
            long j17 = this.f6199k;
            int i5 = 64;
            if (h4 < 0 || kotlin.jvm.internal.l.h(j12, 128) >= 0) {
                long j18 = 128;
                int h5 = kotlin.jvm.internal.l.h(j12, j18);
                long[] jArr = this.f6202n;
                if (h5 < 0) {
                    if (jArr == null) {
                        return new j(this.f6199k, this.f6200l, this.f6201m, new long[]{j5});
                    }
                    int c5 = q.c(jArr, j5);
                    if (c5 < 0) {
                        int i6 = -(c5 + 1);
                        int length = jArr.length;
                        long[] jArr2 = new long[length + 1];
                        X3.l.v0(jArr, jArr2, 0, 0, i6);
                        X3.l.v0(jArr, jArr2, i6 + 1, i6, length);
                        jArr2[i6] = j5;
                        return new j(this.f6199k, this.f6200l, this.f6201m, jArr2);
                    }
                } else if (!e(j5)) {
                    long j19 = 1;
                    long j20 = ((j5 + j19) / j16) * j16;
                    if (kotlin.jvm.internal.l.h(j20, j13) < 0) {
                        j20 = (Long.MAX_VALUE - j18) + j19;
                    }
                    long j21 = j20;
                    J0 j03 = null;
                    long j22 = j14;
                    long j23 = j17;
                    while (true) {
                        if (kotlin.jvm.internal.l.h(j11, j21) >= 0) {
                            j6 = j11;
                            j7 = j22;
                            break;
                        }
                        if (j22 != 0) {
                            if (j03 == null) {
                                J0 j04 = new J0();
                                if (jArr != null) {
                                    long[] copyOf = Arrays.copyOf(jArr, jArr.length);
                                    j10 = j15;
                                    xVar = new r.x(copyOf.length);
                                    int i7 = xVar.f19058b;
                                    if (i7 < 0) {
                                        AbstractC2351a.d("");
                                        throw null;
                                    }
                                    j8 = j21;
                                    if (copyOf.length == 0) {
                                        j9 = j11;
                                    } else {
                                        int length2 = copyOf.length + i7;
                                        long[] jArr3 = xVar.f19057a;
                                        j9 = j11;
                                        if (jArr3.length < length2) {
                                            long[] copyOf2 = Arrays.copyOf(jArr3, Math.max(length2, (jArr3.length * 3) / 2));
                                            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
                                            xVar.f19057a = copyOf2;
                                        }
                                        long[] jArr4 = xVar.f19057a;
                                        int i8 = xVar.f19058b;
                                        if (i7 != i8) {
                                            X3.l.v0(jArr4, jArr4, copyOf.length + i7, i7, i8);
                                        }
                                        X3.l.v0(copyOf, jArr4, i7, 0, copyOf.length);
                                        xVar.f19058b += copyOf.length;
                                    }
                                } else {
                                    j8 = j21;
                                    j9 = j11;
                                    j10 = j15;
                                    xVar = new r.x(16);
                                }
                                j04.f304k = xVar;
                                j02 = j04;
                            } else {
                                j8 = j21;
                                j9 = j11;
                                j10 = j15;
                                j02 = j03;
                            }
                            i = i5;
                            for (int i9 = 0; i9 < i; i9++) {
                                if (((j10 << i9) & j22) != 0) {
                                    ((r.x) j02.f304k).a(j9 + i9);
                                }
                            }
                            j03 = j02;
                        } else {
                            j8 = j21;
                            j9 = j11;
                            j10 = j15;
                            i = i5;
                        }
                        if (j23 == 0) {
                            j6 = j8;
                            j7 = 0;
                            break;
                        }
                        i5 = i;
                        j15 = j10;
                        j22 = j23;
                        j11 = j9 + j16;
                        j23 = 0;
                        j21 = j8;
                    }
                }
            } else {
                long j24 = 1 << (((int) j12) - 64);
                if ((j17 & j24) == 0) {
                    return new j(j17 | j24, this.f6200l, this.f6201m, this.f6202n);
                }
            }
        } else {
            long j25 = 1 << ((int) j12);
            if ((j14 & j25) == 0) {
                return new j(this.f6199k, j14 | j25, this.f6201m, this.f6202n);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC2346c.z(new i(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(X3.o.S(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
