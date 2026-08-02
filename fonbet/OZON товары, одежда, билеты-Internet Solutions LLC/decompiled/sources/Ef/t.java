package Ef;

import Hf.A;
import Hf.AbstractC3139b;
import Jf.AbstractC3395a;

/* loaded from: classes10.dex */
public final class t extends AbstractC3395a {

    /* renamed from: a, reason: collision with root package name */
    private final A f7967a = new A();

    /* loaded from: classes6.dex */
    public static class a extends Jf.b {
        @Override // Jf.d
        public final d a(h hVar, Jf.e eVar) {
            if (hVar.l() >= 4) {
                return null;
            }
            int o11 = hVar.o();
            CharSequence n11 = hVar.n();
            if (!t.i(o11, n11)) {
                return null;
            }
            d g10 = d.g(new t());
            g10.b(n11.length());
            return g10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean i(int i11, CharSequence charSequence) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i11 >= length) {
                if (i12 >= 3 && i13 == 0 && i14 == 0) {
                    return true;
                }
                if (i13 >= 3 && i12 == 0 && i14 == 0) {
                    return true;
                }
                if (i14 < 3 || i12 != 0 || i13 != 0) {
                    break;
                }
                return true;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    i14++;
                } else if (charAt == '-') {
                    i12++;
                } else {
                    if (charAt != '_') {
                        break;
                    }
                    i13++;
                }
            }
            i11++;
        }
    }

    @Override // Jf.c
    public final AbstractC3139b e() {
        return this.f7967a;
    }

    @Override // Jf.c
    public final b h(h hVar) {
        return null;
    }
}
