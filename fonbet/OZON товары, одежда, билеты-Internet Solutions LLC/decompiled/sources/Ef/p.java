package Ef;

import Ef.h;
import Hf.AbstractC3139b;
import Hf.v;
import Jf.AbstractC3395a;

/* loaded from: classes10.dex */
public final class p extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final Hf.s f7952a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7953b;

    /* renamed from: c, reason: collision with root package name */
    private int f7954c;

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            h.a aVar = (h.a) eVar;
            Jf.c b11 = aVar.b();
            if (hVar.l() >= 4) {
                return null;
            }
            b i11 = p.i(hVar.n(), hVar.o(), hVar.l() + hVar.j(), aVar.a() != null);
            if (i11 == null) {
                return null;
            }
            int j11 = hVar.j();
            int i12 = i11.f7956b;
            q qVar = new q(i12 - j11);
            boolean z11 = b11 instanceof p;
            Hf.s sVar = i11.f7955a;
            if (z11 && p.j((Hf.s) ((p) b11).e(), sVar)) {
                d g10 = d.g(qVar);
                g10.a(i12);
                return g10;
            }
            p pVar = new p(sVar);
            sVar.o(true);
            d g11 = d.g(pVar, qVar);
            g11.a(i12);
            return g11;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final Hf.s f7955a;

        /* renamed from: b, reason: collision with root package name */
        final int f7956b;

        b(Hf.s sVar, int i11) {
            this.f7955a = sVar;
            this.f7956b = i11;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final Hf.s f7957a;

        /* renamed from: b, reason: collision with root package name */
        final int f7958b;

        c(Hf.s sVar, int i11) {
            this.f7957a = sVar;
            this.f7958b = i11;
        }
    }

    public p(Hf.s sVar) {
        this.f7952a = sVar;
    }

    static b i(CharSequence charSequence, int i11, int i12, boolean z11) {
        c cVar;
        char charAt;
        int i13;
        char charAt2;
        char charAt3 = charSequence.charAt(i11);
        boolean z12 = false;
        if (charAt3 == '*' || charAt3 == '+' || charAt3 == '-') {
            int i14 = i11 + 1;
            if (i14 >= charSequence.length() || (charAt = charSequence.charAt(i14)) == '\t' || charAt == ' ') {
                Hf.d dVar = new Hf.d();
                dVar.q(charAt3);
                cVar = new c(dVar, i14);
            }
            cVar = null;
        } else {
            int length = charSequence.length();
            int i15 = 0;
            for (int i16 = i11; i16 < length; i16++) {
                char charAt4 = charSequence.charAt(i16);
                if (charAt4 != ')' && charAt4 != '.') {
                    switch (charAt4) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            i15++;
                            if (i15 > 9) {
                                break;
                            }
                    }
                } else if (i15 >= 1 && ((i13 = i16 + 1) >= charSequence.length() || (charAt2 = charSequence.charAt(i13)) == '\t' || charAt2 == ' ')) {
                    String charSequence2 = charSequence.subSequence(i11, i16).toString();
                    v vVar = new v();
                    vVar.s(Integer.parseInt(charSequence2));
                    vVar.r(charAt4);
                    cVar = new c(vVar, i13);
                }
                cVar = null;
            }
            cVar = null;
        }
        if (cVar != null) {
            int i17 = cVar.f7958b;
            int i18 = (i17 - i11) + i12;
            int length2 = charSequence.length();
            int i19 = i18;
            while (true) {
                if (i17 < length2) {
                    char charAt5 = charSequence.charAt(i17);
                    if (charAt5 == '\t') {
                        i19 = (4 - (i19 % 4)) + i19;
                    } else if (charAt5 == ' ') {
                        i19++;
                    } else {
                        z12 = true;
                    }
                    i17++;
                }
            }
            Hf.s sVar = cVar.f7957a;
            if (!z11 || ((!(sVar instanceof v) || ((v) sVar).q() == 1) && z12)) {
                if (!z12 || i19 - i18 > 4) {
                    i19 = i18 + 1;
                }
                return new b(sVar, i19);
            }
        }
        return null;
    }

    static boolean j(Hf.s sVar, Hf.s sVar2) {
        if ((sVar instanceof Hf.d) && (sVar2 instanceof Hf.d)) {
            return Character.valueOf(((Hf.d) sVar).p()).equals(Character.valueOf(((Hf.d) sVar2).p()));
        }
        if ((sVar instanceof v) && (sVar2 instanceof v)) {
            return Character.valueOf(((v) sVar).p()).equals(Character.valueOf(((v) sVar2).p()));
        }
        return false;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final boolean b() {
        return true;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final boolean c(AbstractC3139b abstractC3139b) {
        if (!(abstractC3139b instanceof Hf.t)) {
            return false;
        }
        if (this.f7953b && this.f7954c == 1) {
            this.f7952a.o(false);
            this.f7953b = false;
        }
        return true;
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7952a;
    }

    @Override // Jf.c
    public final Ef.b h(h hVar) {
        if (hVar.q()) {
            this.f7953b = true;
            this.f7954c = 0;
        } else if (this.f7953b) {
            this.f7954c++;
        }
        return Ef.b.a(hVar.m());
    }
}
