package U;

import P.AbstractC0316s0;
import P.Z;
import a.AbstractC0444a;
import java.util.Arrays;
import l4.C2060b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final n f5834e = new n(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f5835a;

    /* renamed from: b, reason: collision with root package name */
    public int f5836b;

    /* renamed from: c, reason: collision with root package name */
    public final W.b f5837c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f5838d;

    public n(int i, int i5, Object[] objArr, W.b bVar) {
        this.f5835a = i;
        this.f5836b = i5;
        this.f5837c = bVar;
        this.f5838d = objArr;
    }

    public static n j(int i, Object obj, Object obj2, int i5, Object obj3, Object obj4, int i6, W.b bVar) {
        if (i6 > 30) {
            return new n(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int B5 = G4.d.B(i, i6);
        int B6 = G4.d.B(i5, i6);
        if (B5 != B6) {
            return new n((1 << B5) | (1 << B6), 0, B5 < B6 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new n(0, 1 << B5, new Object[]{j(i, obj, obj2, i5, obj3, obj4, i6 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i5, int i6, Object obj, Object obj2, int i7, W.b bVar) {
        Object obj3 = this.f5838d[i];
        n j5 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i6, obj, obj2, i7 + 5, bVar);
        int t5 = t(i5);
        int i8 = t5 + 1;
        Object[] objArr = this.f5838d;
        Object[] objArr2 = new Object[objArr.length - 1];
        X3.l.y0(0, i, 6, objArr, objArr2);
        X3.l.t0(i, i + 2, i8, objArr, objArr2);
        objArr2[t5 - 1] = j5;
        X3.l.t0(t5, i8, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f5836b == 0) {
            return this.f5838d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f5835a);
        int length = this.f5838d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, this.f5838d.length), 2);
        int i = c02.f17851k;
        int i5 = c02.f17852l;
        int i6 = c02.f17853m;
        if ((i6 > 0 && i <= i5) || (i6 < 0 && i5 <= i)) {
            while (!kotlin.jvm.internal.l.a(obj, this.f5838d[i])) {
                if (i != i5) {
                    i += i6;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i5, Object obj) {
        int B5 = 1 << G4.d.B(i, i5);
        if (h(B5)) {
            return kotlin.jvm.internal.l.a(obj, this.f5838d[f(B5)]);
        }
        if (!i(B5)) {
            return false;
        }
        n s2 = s(t(B5));
        return i5 == 30 ? s2.c(obj) : s2.d(i, i5 + 5, obj);
    }

    public final boolean e(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (this.f5836b != nVar.f5836b || this.f5835a != nVar.f5835a) {
            return false;
        }
        int length = this.f5838d.length;
        for (int i = 0; i < length; i++) {
            if (this.f5838d[i] != nVar.f5838d[i]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.f5835a) * 2;
    }

    public final Object g(int i, int i5, Object obj) {
        int B5 = 1 << G4.d.B(i, i5);
        if (h(B5)) {
            int f = f(B5);
            if (kotlin.jvm.internal.l.a(obj, this.f5838d[f])) {
                return x(f);
            }
            return null;
        }
        if (!i(B5)) {
            return null;
        }
        n s2 = s(t(B5));
        if (i5 != 30) {
            return s2.g(i, i5 + 5, obj);
        }
        C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, s2.f5838d.length), 2);
        int i6 = c02.f17851k;
        int i7 = c02.f17852l;
        int i8 = c02.f17853m;
        if ((i8 <= 0 || i6 > i7) && (i8 >= 0 || i7 > i6)) {
            return null;
        }
        while (!kotlin.jvm.internal.l.a(obj, s2.f5838d[i6])) {
            if (i6 == i7) {
                return null;
            }
            i6 += i8;
        }
        return s2.x(i6);
    }

    public final boolean h(int i) {
        return (i & this.f5835a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.f5836b) != 0;
    }

    public final n k(int i, e eVar) {
        eVar.a(eVar.f5820o - 1);
        eVar.f5818m = x(i);
        Object[] objArr = this.f5838d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5837c != eVar.f5816k) {
            return new n(0, 0, G4.d.f(i, objArr), eVar.f5816k);
        }
        this.f5838d = G4.d.f(i, objArr);
        return this;
    }

    public final n l(int i, Object obj, Object obj2, int i5, e eVar) {
        e eVar2;
        n l5;
        int B5 = 1 << G4.d.B(i, i5);
        boolean h3 = h(B5);
        W.b bVar = this.f5837c;
        if (h3) {
            int f = f(B5);
            if (!kotlin.jvm.internal.l.a(obj, this.f5838d[f])) {
                eVar.a(eVar.f5820o + 1);
                W.b bVar2 = eVar.f5816k;
                if (bVar != bVar2) {
                    return new n(this.f5835a ^ B5, this.f5836b | B5, a(f, B5, i, obj, obj2, i5, bVar2), bVar2);
                }
                this.f5838d = a(f, B5, i, obj, obj2, i5, bVar2);
                this.f5835a ^= B5;
                this.f5836b |= B5;
                return this;
            }
            eVar.f5818m = x(f);
            if (x(f) == obj2) {
                return this;
            }
            if (bVar == eVar.f5816k) {
                this.f5838d[f + 1] = obj2;
                return this;
            }
            eVar.f5819n++;
            Object[] objArr = this.f5838d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            copyOf[f + 1] = obj2;
            return new n(this.f5835a, this.f5836b, copyOf, eVar.f5816k);
        }
        if (!i(B5)) {
            eVar.a(eVar.f5820o + 1);
            W.b bVar3 = eVar.f5816k;
            int f5 = f(B5);
            if (bVar != bVar3) {
                return new n(this.f5835a | B5, this.f5836b, G4.d.e(this.f5838d, f5, obj, obj2), bVar3);
            }
            this.f5838d = G4.d.e(this.f5838d, f5, obj, obj2);
            this.f5835a |= B5;
            return this;
        }
        int t5 = t(B5);
        n s2 = s(t5);
        if (i5 == 30) {
            C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, s2.f5838d.length), 2);
            int i6 = c02.f17851k;
            int i7 = c02.f17852l;
            int i8 = c02.f17853m;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (!kotlin.jvm.internal.l.a(obj, s2.f5838d[i6])) {
                    if (i6 != i7) {
                        i6 += i8;
                    }
                }
                eVar.f5818m = s2.x(i6);
                if (s2.f5837c == eVar.f5816k) {
                    s2.f5838d[i6 + 1] = obj2;
                    l5 = s2;
                } else {
                    eVar.f5819n++;
                    Object[] objArr2 = s2.f5838d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
                    copyOf2[i6 + 1] = obj2;
                    l5 = new n(0, 0, copyOf2, eVar.f5816k);
                }
                eVar2 = eVar;
            }
            eVar.a(eVar.f5820o + 1);
            l5 = new n(0, 0, G4.d.e(s2.f5838d, 0, obj, obj2), eVar.f5816k);
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            l5 = s2.l(i, obj, obj2, i5 + 5, eVar2);
        }
        return s2 == l5 ? this : r(t5, l5, eVar2.f5816k);
    }

    public final n m(n nVar, int i, W.a aVar, e eVar) {
        Object[] objArr;
        n j5;
        if (this == nVar) {
            aVar.f5998a += b();
            return this;
        }
        int i5 = 0;
        if (i > 30) {
            W.b bVar = eVar.f5816k;
            int i6 = nVar.f5836b;
            Object[] objArr2 = this.f5838d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + nVar.f5838d.length);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            int length = this.f5838d.length;
            C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, nVar.f5838d.length), 2);
            int i7 = c02.f17851k;
            int i8 = c02.f17852l;
            int i9 = c02.f17853m;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    if (c(nVar.f5838d[i7])) {
                        aVar.f5998a++;
                    } else {
                        Object[] objArr3 = nVar.f5838d;
                        copyOf[length] = objArr3[i7];
                        copyOf[length + 1] = objArr3[i7 + 1];
                        length += 2;
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
            if (length != this.f5838d.length) {
                if (length == nVar.f5838d.length) {
                    return nVar;
                }
                if (length == copyOf.length) {
                    return new n(0, 0, copyOf, bVar);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
                return new n(0, 0, copyOf2, bVar);
            }
        } else {
            int i10 = this.f5836b | nVar.f5836b;
            int i11 = this.f5835a;
            int i12 = nVar.f5835a;
            int i13 = (i11 ^ i12) & (~i10);
            int i14 = i11 & i12;
            int i15 = i13;
            while (i14 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i14);
                if (kotlin.jvm.internal.l.a(this.f5838d[f(lowestOneBit)], nVar.f5838d[nVar.f(lowestOneBit)])) {
                    i15 |= lowestOneBit;
                } else {
                    i10 |= lowestOneBit;
                }
                i14 ^= lowestOneBit;
            }
            if ((i10 & i15) != 0) {
                AbstractC0316s0.b("Check failed.");
            }
            n nVar2 = (kotlin.jvm.internal.l.a(this.f5837c, eVar.f5816k) && this.f5835a == i15 && this.f5836b == i10) ? this : new n(i15, i10, new Object[Integer.bitCount(i10) + (Integer.bitCount(i15) * 2)], null);
            int i16 = i10;
            int i17 = 0;
            while (i16 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i16);
                Object[] objArr4 = nVar2.f5838d;
                int length2 = (objArr4.length - 1) - i17;
                if (i(lowestOneBit2)) {
                    j5 = s(t(lowestOneBit2));
                    if (nVar.i(lowestOneBit2)) {
                        j5 = j5.m(nVar.s(nVar.t(lowestOneBit2)), i + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (nVar.h(lowestOneBit2)) {
                        int f = nVar.f(lowestOneBit2);
                        Object obj = nVar.f5838d[f];
                        Object x5 = nVar.x(f);
                        int i18 = eVar.f5820o;
                        objArr = objArr4;
                        j5 = j5.l(obj != null ? obj.hashCode() : i5, obj, x5, i + 5, eVar);
                        if (eVar.f5820o == i18) {
                            aVar.f5998a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (nVar.i(lowestOneBit2)) {
                        n s2 = nVar.s(nVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f5 = f(lowestOneBit2);
                            Object obj2 = this.f5838d[f5];
                            int i19 = i + 5;
                            if (s2.d(obj2 != null ? obj2.hashCode() : 0, i19, obj2)) {
                                aVar.f5998a++;
                            } else {
                                j5 = s2.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f5), i19, eVar);
                            }
                        }
                        j5 = s2;
                    } else {
                        int f6 = f(lowestOneBit2);
                        Object obj3 = this.f5838d[f6];
                        Object x6 = x(f6);
                        int f7 = nVar.f(lowestOneBit2);
                        Object obj4 = nVar.f5838d[f7];
                        j5 = j(obj3 != null ? obj3.hashCode() : 0, obj3, x6, obj4 != null ? obj4.hashCode() : 0, obj4, nVar.x(f7), i + 5, eVar.f5816k);
                    }
                }
                objArr[length2] = j5;
                i17++;
                i16 ^= lowestOneBit2;
                i5 = 0;
            }
            int i20 = 0;
            while (i15 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i15);
                int i21 = i20 * 2;
                if (nVar.h(lowestOneBit3)) {
                    int f8 = nVar.f(lowestOneBit3);
                    Object[] objArr5 = nVar2.f5838d;
                    objArr5[i21] = nVar.f5838d[f8];
                    objArr5[i21 + 1] = nVar.x(f8);
                    if (h(lowestOneBit3)) {
                        aVar.f5998a++;
                    }
                } else {
                    int f9 = f(lowestOneBit3);
                    Object[] objArr6 = nVar2.f5838d;
                    objArr6[i21] = this.f5838d[f9];
                    objArr6[i21 + 1] = x(f9);
                }
                i20++;
                i15 ^= lowestOneBit3;
            }
            if (!e(nVar2)) {
                return nVar.e(nVar2) ? nVar : nVar2;
            }
        }
        return this;
    }

    public final n n(int i, Object obj, int i5, e eVar) {
        n n5;
        int B5 = 1 << G4.d.B(i, i5);
        if (h(B5)) {
            int f = f(B5);
            if (kotlin.jvm.internal.l.a(obj, this.f5838d[f])) {
                return p(f, B5, eVar);
            }
        } else if (i(B5)) {
            int t5 = t(B5);
            n s2 = s(t5);
            if (i5 == 30) {
                C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, s2.f5838d.length), 2);
                int i6 = c02.f17851k;
                int i7 = c02.f17852l;
                int i8 = c02.f17853m;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!kotlin.jvm.internal.l.a(obj, s2.f5838d[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    n5 = s2.k(i6, eVar);
                }
                n5 = s2;
                break;
            }
            n5 = s2.n(i, obj, i5 + 5, eVar);
            return q(s2, n5, t5, B5, eVar.f5816k);
        }
        return this;
    }

    public final n o(int i, Object obj, Object obj2, int i5, e eVar) {
        n nVar;
        n o5;
        int B5 = 1 << G4.d.B(i, i5);
        if (h(B5)) {
            int f = f(B5);
            if (kotlin.jvm.internal.l.a(obj, this.f5838d[f]) && kotlin.jvm.internal.l.a(obj2, x(f))) {
                return p(f, B5, eVar);
            }
        } else if (i(B5)) {
            int t5 = t(B5);
            n s2 = s(t5);
            if (i5 == 30) {
                C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, s2.f5838d.length), 2);
                int i6 = c02.f17851k;
                int i7 = c02.f17852l;
                int i8 = c02.f17853m;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (true) {
                        if (!kotlin.jvm.internal.l.a(obj, s2.f5838d[i6]) || !kotlin.jvm.internal.l.a(obj2, s2.x(i6))) {
                            if (i6 == i7) {
                                break;
                            }
                            i6 += i8;
                        } else {
                            o5 = s2.k(i6, eVar);
                            break;
                        }
                    }
                    nVar = s2;
                }
                o5 = s2;
                nVar = s2;
            } else {
                nVar = s2;
                o5 = nVar.o(i, obj, obj2, i5 + 5, eVar);
            }
            return q(nVar, o5, t5, B5, eVar.f5816k);
        }
        return this;
    }

    public final n p(int i, int i5, e eVar) {
        eVar.a(eVar.f5820o - 1);
        eVar.f5818m = x(i);
        Object[] objArr = this.f5838d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5837c != eVar.f5816k) {
            return new n(i5 ^ this.f5835a, this.f5836b, G4.d.f(i, objArr), eVar.f5816k);
        }
        this.f5838d = G4.d.f(i, objArr);
        this.f5835a ^= i5;
        return this;
    }

    public final n q(n nVar, n nVar2, int i, int i5, W.b bVar) {
        W.b bVar2 = this.f5837c;
        if (nVar2 != null) {
            return (bVar2 == bVar || nVar != nVar2) ? r(i, nVar2, bVar) : this;
        }
        Object[] objArr = this.f5838d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new n(this.f5835a, i5 ^ this.f5836b, G4.d.g(i, objArr), bVar);
        }
        this.f5838d = G4.d.g(i, objArr);
        this.f5836b ^= i5;
        return this;
    }

    public final n r(int i, n nVar, W.b bVar) {
        Object[] objArr = this.f5838d;
        if (objArr.length == 1 && nVar.f5838d.length == 2 && nVar.f5836b == 0) {
            nVar.f5835a = this.f5836b;
            return nVar;
        }
        if (this.f5837c == bVar) {
            objArr[i] = nVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
        copyOf[i] = nVar;
        return new n(this.f5835a, this.f5836b, copyOf, bVar);
    }

    public final n s(int i) {
        Object obj = this.f5838d[i];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>", obj);
        return (n) obj;
    }

    public final int t(int i) {
        return (this.f5838d.length - 1) - Integer.bitCount((i - 1) & this.f5836b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        r14.f834m = w(r12, r4, (U.n) r14.f834m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2.h u(int i, int i5, Object obj, Object obj2) {
        C2.h u5;
        int i6 = 1;
        int B5 = 1 << G4.d.B(i, i5);
        int i7 = 0;
        if (h(B5)) {
            int f = f(B5);
            if (!kotlin.jvm.internal.l.a(obj, this.f5838d[f])) {
                return new C2.h(i6, 2, new n(this.f5835a ^ B5, this.f5836b | B5, a(f, B5, i, obj, obj2, i5, null), null));
            }
            if (x(f) != obj2) {
                Object[] objArr = this.f5838d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
                copyOf[f + 1] = obj2;
                return new C2.h(i7, 2, new n(this.f5835a, this.f5836b, copyOf, null));
            }
        } else {
            if (!i(B5)) {
                return new C2.h(i6, 2, new n(this.f5835a | B5, this.f5836b, G4.d.e(this.f5838d, f(B5), obj, obj2), null));
            }
            int t5 = t(B5);
            n s2 = s(t5);
            if (i5 == 30) {
                C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, s2.f5838d.length), 2);
                int i8 = c02.f17851k;
                int i9 = c02.f17852l;
                int i10 = c02.f17853m;
                if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                    while (!kotlin.jvm.internal.l.a(obj, s2.f5838d[i8])) {
                        if (i8 != i9) {
                            i8 += i10;
                        }
                    }
                    if (obj2 == s2.x(i8)) {
                        u5 = null;
                    } else {
                        Object[] objArr2 = s2.f5838d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
                        copyOf2[i8 + 1] = obj2;
                        u5 = new C2.h(i7, 2, new n(0, 0, copyOf2, null));
                    }
                }
                u5 = new C2.h(i6, 2, new n(0, 0, G4.d.e(s2.f5838d, 0, obj, obj2), null));
                break;
            }
            u5 = s2.u(i, i5 + 5, obj, obj2);
        }
        return null;
    }

    public final n v(int i, Z z3, int i5) {
        n v4;
        int B5 = 1 << G4.d.B(i, i5);
        if (h(B5)) {
            int f = f(B5);
            if (kotlin.jvm.internal.l.a(z3, this.f5838d[f])) {
                Object[] objArr = this.f5838d;
                if (objArr.length != 2) {
                    return new n(this.f5835a ^ B5, this.f5836b, G4.d.f(f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(B5)) {
            int t5 = t(B5);
            n s2 = s(t5);
            if (i5 == 30) {
                C2060b c02 = AbstractC0444a.c0(AbstractC0444a.f0(0, s2.f5838d.length), 2);
                int i6 = c02.f17851k;
                int i7 = c02.f17852l;
                int i8 = c02.f17853m;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!kotlin.jvm.internal.l.a(z3, s2.f5838d[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    Object[] objArr2 = s2.f5838d;
                    v4 = objArr2.length == 2 ? null : new n(0, 0, G4.d.f(i6, objArr2), null);
                }
                v4 = s2;
                break;
            }
            v4 = s2.v(i, z3, i5 + 5);
            if (v4 == null) {
                Object[] objArr3 = this.f5838d;
                if (objArr3.length != 1) {
                    return new n(this.f5835a, B5 ^ this.f5836b, G4.d.g(t5, objArr3), null);
                }
                return null;
            }
            if (s2 != v4) {
                return w(t5, B5, v4);
            }
        }
        return this;
    }

    public final n w(int i, int i5, n nVar) {
        Object[] objArr = nVar.f5838d;
        if (objArr.length != 2 || nVar.f5836b != 0) {
            Object[] objArr2 = this.f5838d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            copyOf[i] = nVar;
            return new n(this.f5835a, this.f5836b, copyOf, null);
        }
        if (this.f5838d.length == 1) {
            nVar.f5835a = this.f5836b;
            return nVar;
        }
        int f = f(i5);
        Object[] objArr3 = this.f5838d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
        X3.l.t0(i + 2, i + 1, objArr3.length, copyOf2, copyOf2);
        X3.l.t0(f + 2, f, i, copyOf2, copyOf2);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new n(this.f5835a ^ i5, i5 ^ this.f5836b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.f5838d[i + 1];
    }
}
