package Ef;

import Hf.AbstractC3139b;
import Jf.AbstractC3395a;

/* loaded from: classes10.dex */
public final class c extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final Hf.c f7866a = new Hf.c();

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            int o11 = hVar.o();
            if (!c.j(hVar, o11)) {
                return null;
            }
            int l11 = hVar.l() + hVar.j();
            int i11 = l11 + 1;
            if (Gf.d.h(o11 + 1, hVar.n())) {
                i11 = l11 + 2;
            }
            d g10 = d.g(new c());
            g10.a(i11);
            return g10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(h hVar, int i11) {
        CharSequence n11 = hVar.n();
        return hVar.l() < 4 && i11 < n11.length() && n11.charAt(i11) == '>';
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7866a;
    }

    @Override // Jf.c
    public final b h(h hVar) {
        int o11 = hVar.o();
        if (!j(hVar, o11)) {
            return null;
        }
        int l11 = hVar.l() + hVar.j();
        int i11 = l11 + 1;
        if (Gf.d.h(o11 + 1, hVar.n())) {
            i11 = l11 + 2;
        }
        return new b(-1, i11, false);
    }
}
