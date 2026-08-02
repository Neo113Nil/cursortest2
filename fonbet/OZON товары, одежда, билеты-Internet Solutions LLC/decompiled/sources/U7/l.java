package U7;

import S0.InterfaceC3967k;
import T7.C4043z;
import b4.C5531g;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements z.a, C5531g.a {
    public static Sc.o c(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(i11);
        interfaceC3967k.k();
        return new Sc.o();
    }

    @Override // b4.C5531g.a
    public boolean a(int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 67 && i13 == 79 && i14 == 77 && (i15 == 77 || i11 == 2)) {
            return true;
        }
        if (i12 == 77 && i13 == 76 && i14 == 76) {
            return i15 == 84 || i11 == 2;
        }
        return false;
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(S7.q qVar) {
        return n.c((C4043z) qVar);
    }
}
