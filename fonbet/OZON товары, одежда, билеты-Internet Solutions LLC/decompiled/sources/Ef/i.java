package Ef;

import Hf.AbstractC3139b;
import Jf.AbstractC3395a;

/* loaded from: classes10.dex */
public final class i extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final Hf.j f7905a;

    /* renamed from: b, reason: collision with root package name */
    private String f7906b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f7907c;

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            int o11;
            i i11;
            int l11 = hVar.l();
            if (l11 >= 4 || (i11 = i.i((o11 = hVar.o()), l11, hVar.n())) == null) {
                return null;
            }
            d g10 = d.g(i11);
            g10.b(i11.f7905a.p() + o11);
            return g10;
        }
    }

    public i(int i11, char c11, int i12) {
        Hf.j jVar = new Hf.j();
        this.f7905a = jVar;
        this.f7907c = new StringBuilder();
        jVar.s(c11);
        jVar.u(i11);
        jVar.t(i12);
    }

    static i i(int i11, int i12, CharSequence charSequence) {
        int length = charSequence.length();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i11; i15 < length; i15++) {
            char charAt = charSequence.charAt(i15);
            if (charAt == '`') {
                i13++;
            } else {
                if (charAt != '~') {
                    break;
                }
                i14++;
            }
        }
        if (i13 < 3 || i14 != 0) {
            if (i14 < 3 || i13 != 0) {
                return null;
            }
            return new i(i14, '~', i12);
        }
        int i16 = i11 + i13;
        int length2 = charSequence.length();
        while (true) {
            if (i16 >= length2) {
                i16 = -1;
                break;
            }
            if (charSequence.charAt(i16) == '`') {
                break;
            }
            i16++;
        }
        if (i16 != -1) {
            return null;
        }
        return new i(i13, '`', i12);
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7905a;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void f(CharSequence charSequence) {
        if (this.f7906b == null) {
            this.f7906b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f7907c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void g() {
        String c11 = Gf.a.c(this.f7906b.trim());
        Hf.j jVar = this.f7905a;
        jVar.v(c11);
        jVar.w(this.f7907c.toString());
    }

    @Override // Jf.c
    public final b h(h hVar) {
        int o11 = hVar.o();
        int m11 = hVar.m();
        CharSequence n11 = hVar.n();
        int l11 = hVar.l();
        Hf.j jVar = this.f7905a;
        if (l11 < 4) {
            char n12 = jVar.n();
            int p11 = jVar.p();
            int j11 = Gf.d.j(n12, o11, n11.length(), n11) - o11;
            if (j11 >= p11 && Gf.d.k(o11 + j11, n11.length(), n11) == n11.length()) {
                return new b(-1, -1, true);
            }
        }
        int length = n11.length();
        for (int o12 = jVar.o(); o12 > 0 && m11 < length && n11.charAt(m11) == ' '; o12--) {
            m11++;
        }
        return b.a(m11);
    }
}
