package E9;

import h9.d;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f7647a = b.f7648e;

    public final int a(int[] iArr, int i11, int[] iArr2) throws d {
        b bVar = this.f7647a;
        c cVar = new c(bVar, iArr);
        int[] iArr3 = new int[i11];
        boolean z11 = false;
        for (int i12 = i11; i12 > 0; i12--) {
            int b11 = cVar.b(bVar.c(i12));
            iArr3[i11 - i12] = b11;
            if (b11 != 0) {
                z11 = true;
            }
        }
        if (!z11) {
            return 0;
        }
        c d11 = bVar.d();
        for (int i13 : iArr2) {
            d11 = d11.g(new c(bVar, new int[]{bVar.i(0, bVar.c((iArr.length - 1) - i13)), 1}));
        }
        c cVar2 = new c(bVar, iArr3);
        c b12 = bVar.b(i11, 1);
        if (b12.d() >= cVar2.d()) {
            b12 = cVar2;
            cVar2 = b12;
        }
        c e11 = bVar.e();
        c d12 = bVar.d();
        while (true) {
            c cVar3 = b12;
            b12 = cVar2;
            cVar2 = cVar3;
            c cVar4 = d12;
            c cVar5 = e11;
            e11 = cVar4;
            if (cVar2.d() < i11 / 2) {
                int c11 = e11.c(0);
                if (c11 == 0) {
                    throw d.a();
                }
                int f7 = bVar.f(c11);
                c[] cVarArr = {e11.f(f7), cVar2.f(f7)};
                c cVar6 = cVarArr[0];
                c cVar7 = cVarArr[1];
                int d13 = cVar6.d();
                int[] iArr4 = new int[d13];
                int i14 = 0;
                for (int i15 = 1; i15 < 929 && i14 < d13; i15++) {
                    if (cVar6.b(i15) == 0) {
                        iArr4[i14] = bVar.f(i15);
                        i14++;
                    }
                }
                if (i14 != d13) {
                    throw d.a();
                }
                int d14 = cVar6.d();
                int[] iArr5 = new int[d14];
                for (int i16 = 1; i16 <= d14; i16++) {
                    iArr5[d14 - i16] = bVar.h(i16, cVar6.c(i16));
                }
                c cVar8 = new c(bVar, iArr5);
                int[] iArr6 = new int[d13];
                for (int i17 = 0; i17 < d13; i17++) {
                    int f11 = bVar.f(iArr4[i17]);
                    iArr6[i17] = bVar.h(bVar.i(0, cVar7.b(f11)), bVar.f(cVar8.b(f11)));
                }
                for (int i18 = 0; i18 < d13; i18++) {
                    int length = (iArr.length - 1) - bVar.g(iArr4[i18]);
                    if (length < 0) {
                        throw d.a();
                    }
                    iArr[length] = bVar.i(iArr[length], iArr6[i18]);
                }
                return d13;
            }
            if (cVar2.e()) {
                throw d.a();
            }
            c e12 = bVar.e();
            int f12 = bVar.f(cVar2.c(cVar2.d()));
            while (b12.d() >= cVar2.d() && !b12.e()) {
                int d15 = b12.d() - cVar2.d();
                int h11 = bVar.h(b12.c(b12.d()), f12);
                e12 = e12.a(bVar.b(d15, h11));
                b12 = b12.j(cVar2.h(d15, h11));
            }
            d12 = e12.g(e11).j(cVar5).i();
        }
    }
}
