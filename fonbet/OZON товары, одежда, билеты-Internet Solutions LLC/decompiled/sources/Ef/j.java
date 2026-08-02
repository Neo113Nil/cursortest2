package Ef;

import Ef.h;
import Hf.AbstractC3139b;
import Jf.AbstractC3395a;

/* loaded from: classes10.dex */
public final class j extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final Hf.l f7908a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7909b;

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            StringBuilder a11;
            if (hVar.l() >= 4) {
                return null;
            }
            CharSequence n11 = hVar.n();
            int o11 = hVar.o();
            j i11 = j.i(o11, n11);
            if (i11 != null) {
                d g10 = d.g(i11);
                g10.b(n11.length());
                return g10;
            }
            int j11 = j.j(o11, n11);
            if (j11 <= 0 || (a11 = ((h.a) eVar).a()) == null) {
                return null;
            }
            d g11 = d.g(new j(j11, a11.toString()));
            g11.b(n11.length());
            g11.h();
            return g11;
        }
    }

    public j(int i11, String str) {
        Hf.l lVar = new Hf.l();
        this.f7908a = lVar;
        lVar.o(i11);
        this.f7909b = str;
    }

    static j i(int i11, CharSequence charSequence) {
        int j11 = Gf.d.j('#', i11, charSequence.length(), charSequence) - i11;
        if (j11 == 0 || j11 > 6) {
            return null;
        }
        int i12 = i11 + j11;
        if (i12 >= charSequence.length()) {
            return new j(j11, "");
        }
        char charAt = charSequence.charAt(i12);
        if (charAt != ' ' && charAt != '\t') {
            return null;
        }
        int length = charSequence.length() - 1;
        while (true) {
            if (length >= i12) {
                char charAt2 = charSequence.charAt(length);
                if (charAt2 != '\t' && charAt2 != ' ') {
                    break;
                }
                length--;
            } else {
                length = i12 - 1;
                break;
            }
        }
        int i13 = length;
        while (true) {
            if (i13 < i12) {
                i13 = i12 - 1;
                break;
            }
            if (charSequence.charAt(i13) != '#') {
                break;
            }
            i13--;
        }
        int i14 = i13;
        while (true) {
            if (i14 >= i12) {
                char charAt3 = charSequence.charAt(i14);
                if (charAt3 != '\t' && charAt3 != ' ') {
                    break;
                }
                i14--;
            } else {
                i14 = i12 - 1;
                break;
            }
        }
        return i14 != i13 ? new j(j11, charSequence.subSequence(i12, i14 + 1).toString()) : new j(j11, charSequence.subSequence(i12, length + 1).toString());
    }

    static int j(int i11, CharSequence charSequence) {
        char charAt = charSequence.charAt(i11);
        if (charAt != '-') {
            if (charAt != '=') {
                return 0;
            }
            if (Gf.d.k(Gf.d.j('=', i11 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length()) {
                return 1;
            }
        }
        return Gf.d.k(Gf.d.j('-', i11 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length() ? 2 : 0;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void a(n nVar) {
        nVar.f(this.f7909b, this.f7908a);
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7908a;
    }

    @Override // Jf.c
    public final b h(h hVar) {
        return null;
    }
}
