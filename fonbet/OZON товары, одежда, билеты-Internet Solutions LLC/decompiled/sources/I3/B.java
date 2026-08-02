package I3;

import F3.InterfaceC3018x;
import F3.d0;
import android.util.Pair;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.k0;
import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;
import j3.C7253I;
import j3.C7256L;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m3.N;
import t3.C9734F;

/* loaded from: classes.dex */
public abstract class B extends E {

    /* renamed from: c, reason: collision with root package name */
    private a f11813c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11814a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f11815b;

        /* renamed from: c, reason: collision with root package name */
        private final d0[] f11816c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f11817d;

        /* renamed from: e, reason: collision with root package name */
        private final int[][][] f11818e;

        /* renamed from: f, reason: collision with root package name */
        private final d0 f11819f;

        a(int[] iArr, d0[] d0VarArr, int[] iArr2, int[][][] iArr3, d0 d0Var) {
            this.f11815b = iArr;
            this.f11816c = d0VarArr;
            this.f11818e = iArr3;
            this.f11817d = iArr2;
            this.f11819f = d0Var;
            this.f11814a = iArr.length;
        }

        public final int a(int i11, int i12) {
            d0[] d0VarArr = this.f11816c;
            int i13 = d0VarArr[i11].a(i12).f68962a;
            int[] iArr = new int[i13];
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                if (e(i11, i12, i16) == 4) {
                    iArr[i15] = i16;
                    i15++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i15);
            int i17 = 16;
            int i18 = 0;
            String str = null;
            boolean z11 = false;
            while (i14 < copyOf.length) {
                String str2 = d0VarArr[i11].a(i12).a(copyOf[i14]).f69127o;
                int i19 = i18 + 1;
                if (i18 == 0) {
                    str = str2;
                } else {
                    z11 |= !Objects.equals(str, str2);
                }
                i17 = Math.min(i17, this.f11818e[i11][i12][i14] & 24);
                i14++;
                i18 = i19;
            }
            return z11 ? Math.min(i17, this.f11817d[i11]) : i17;
        }

        public final int b() {
            return this.f11814a;
        }

        public final int c(int i11) {
            return this.f11815b[i11];
        }

        public final d0 d(int i11) {
            return this.f11816c[i11];
        }

        public final int e(int i11, int i12, int i13) {
            return this.f11818e[i11][i12][i13] & 7;
        }

        public final d0 f() {
            return this.f11819f;
        }
    }

    @Override // I3.E
    public final void g(a aVar) {
        this.f11813c = aVar;
    }

    @Override // I3.E
    public final F i(k0[] k0VarArr, d0 d0Var, InterfaceC3018x.b bVar, AbstractC7252H abstractC7252H) throws C5449k {
        boolean z11;
        boolean z12;
        int i11;
        int[] iArr;
        d0 d0Var2 = d0Var;
        boolean z13 = true;
        int[] iArr2 = new int[k0VarArr.length + 1];
        int length = k0VarArr.length + 1;
        C7253I[][] c7253iArr = new C7253I[length][];
        int[][][] iArr3 = new int[k0VarArr.length + 1][][];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = d0Var2.f8644a;
            c7253iArr[i12] = new C7253I[i13];
            iArr3[i12] = new int[i13][];
        }
        int length2 = k0VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            iArr4[i14] = k0VarArr[i14].B();
        }
        int i15 = 0;
        while (i15 < d0Var2.f8644a) {
            C7253I a11 = d0Var2.a(i15);
            boolean z14 = a11.f68964c == 5 ? z13 : false;
            int length3 = k0VarArr.length;
            boolean z15 = z13;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int length4 = k0VarArr.length;
                z12 = z13;
                i11 = a11.f68962a;
                if (i16 >= length4) {
                    break;
                }
                k0 k0Var = k0VarArr[i16];
                int i18 = 0;
                int i19 = 0;
                while (i19 < i11) {
                    i18 = Math.max(i18, k0Var.e(a11.a(i19)) & 7);
                    i19++;
                    iArr2 = iArr2;
                }
                int[] iArr5 = iArr2;
                boolean z16 = iArr5[i16] == 0 ? z12 : false;
                if (i18 > i17 || (i18 == i17 && z14 && !z15 && z16)) {
                    i17 = i18;
                    z15 = z16;
                    length3 = i16;
                }
                i16++;
                z13 = z12;
                iArr2 = iArr5;
            }
            int[] iArr6 = iArr2;
            if (length3 == k0VarArr.length) {
                iArr = new int[i11];
            } else {
                k0 k0Var2 = k0VarArr[length3];
                int[] iArr7 = new int[i11];
                for (int i21 = 0; i21 < i11; i21++) {
                    iArr7[i21] = k0Var2.e(a11.a(i21));
                }
                iArr = iArr7;
            }
            int i22 = iArr6[length3];
            c7253iArr[length3][i22] = a11;
            iArr3[length3][i22] = iArr;
            iArr6[length3] = i22 + 1;
            i15++;
            d0Var2 = d0Var;
            z13 = z12;
            iArr2 = iArr6;
        }
        int[] iArr8 = iArr2;
        boolean z17 = z13;
        d0[] d0VarArr = new d0[k0VarArr.length];
        String[] strArr = new String[k0VarArr.length];
        int[] iArr9 = new int[k0VarArr.length];
        for (int i23 = 0; i23 < k0VarArr.length; i23++) {
            int i24 = iArr8[i23];
            d0VarArr[i23] = new d0((C7253I[]) N.S(i24, c7253iArr[i23]));
            iArr3[i23] = (int[][]) N.S(i24, iArr3[i23]);
            strArr[i23] = k0VarArr[i23].getName();
            iArr9[i23] = ((AbstractC5444f) k0VarArr[i23]).v();
        }
        a aVar = new a(iArr9, d0VarArr, iArr4, iArr3, new d0((C7253I[]) N.S(iArr8[k0VarArr.length], c7253iArr[k0VarArr.length])));
        Pair<C9734F[], y[]> m11 = m(aVar, iArr3, iArr4, bVar, abstractC7252H);
        C[] cArr = (C[]) m11.second;
        List[] listArr = new List[cArr.length];
        for (int i25 = 0; i25 < cArr.length; i25++) {
            C c11 = cArr[i25];
            listArr[i25] = c11 != null ? AbstractC5880y.B(c11) : AbstractC5880y.v();
        }
        AbstractC5880y.a aVar2 = new AbstractC5880y.a();
        for (int i26 = 0; i26 < aVar.b(); i26++) {
            d0 d11 = aVar.d(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < d11.f8644a; i27++) {
                C7253I a12 = d11.a(i27);
                boolean z18 = aVar.a(i26, i27) != 0 ? z17 : false;
                int i28 = a12.f68962a;
                int[] iArr10 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < a12.f68962a; i29++) {
                    iArr10[i29] = aVar.e(i26, i27, i29);
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        C c12 = (C) list.get(i31);
                        if (c12.g().equals(a12) && c12.f(i29) != -1) {
                            z11 = z17;
                            break;
                        }
                        i31++;
                    }
                    zArr[i29] = z11;
                }
                aVar2.e(new C7256L.a(a12, z18, iArr10, zArr));
            }
        }
        d0 f7 = aVar.f();
        for (int i32 = 0; i32 < f7.f8644a; i32++) {
            C7253I a13 = f7.a(i32);
            int[] iArr11 = new int[a13.f68962a];
            Arrays.fill(iArr11, 0);
            aVar2.e(new C7256L.a(a13, false, iArr11, new boolean[a13.f68962a]));
        }
        return new F((C9734F[]) m11.first, (y[]) m11.second, new C7256L(aVar2.j()), aVar);
    }

    public final a l() {
        return this.f11813c;
    }

    protected abstract Pair<C9734F[], y[]> m(a aVar, int[][][] iArr, int[] iArr2, InterfaceC3018x.b bVar, AbstractC7252H abstractC7252H) throws C5449k;
}
