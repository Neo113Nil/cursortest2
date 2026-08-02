package Ef;

import Hf.AbstractC3139b;
import Hf.w;
import Jf.AbstractC3395a;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class l extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final Hf.p f7915a = new Hf.p();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f7916b = new ArrayList();

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            if (hVar.l() < 4 || hVar.q() || (hVar.i().e() instanceof w)) {
                return null;
            }
            d g10 = d.g(new l());
            g10.a(hVar.j() + 4);
            return g10;
        }
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7915a;
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void f(CharSequence charSequence) {
        this.f7916b.add(charSequence);
    }

    @Override // Jf.AbstractC3395a, Jf.c
    public final void g() {
        int i11;
        ArrayList arrayList = this.f7916b;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                CharSequence charSequence = (CharSequence) arrayList.get(size);
                int length = charSequence.length();
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        char charAt = charSequence.charAt(i12);
                        if (charAt != ' ') {
                            switch (charAt) {
                            }
                        }
                        i12++;
                    } else {
                        i12 = -1;
                    }
                }
                if (i12 == -1) {
                    size--;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (i11 = 0; i11 < size + 1; i11++) {
            sb2.append((CharSequence) arrayList.get(i11));
            sb2.append('\n');
        }
        this.f7915a.o(sb2.toString());
    }

    @Override // Jf.c
    public final b h(h hVar) {
        if (hVar.l() >= 4) {
            return new b(-1, hVar.j() + 4, false);
        }
        if (hVar.q()) {
            return b.a(hVar.o());
        }
        return null;
    }
}
