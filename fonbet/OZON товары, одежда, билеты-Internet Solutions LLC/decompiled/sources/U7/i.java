package U7;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.F1;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.F;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements AbstractC5887f.a, com.google.gson.internal.o {
    public static int a(int i11, int i12, int i13, int i14) {
        return ((i11 * i12) / i13) + i14;
    }

    public static void b(C3969l c3969l, androidx.compose.ui.e eVar, int i11) {
        F1.b(c3969l, eVar, InterfaceC2801g.a.f());
        c3969l.o(i11);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(F f7, S7.r rVar) {
        return j.b(f7, rVar);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new ConcurrentSkipListMap();
    }
}
