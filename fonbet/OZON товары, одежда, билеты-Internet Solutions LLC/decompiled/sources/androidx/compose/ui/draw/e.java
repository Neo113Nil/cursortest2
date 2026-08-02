package androidx.compose.ui.draw;

import B1.InterfaceC2547p;
import e1.InterfaceC6250b;
import l1.C7809a0;
import q1.AbstractC8972b;

/* loaded from: classes.dex */
public final class e {
    public static androidx.compose.ui.e a(androidx.compose.ui.e eVar, AbstractC8972b abstractC8972b, InterfaceC6250b interfaceC6250b, InterfaceC2547p interfaceC2547p, float f7, C7809a0 c7809a0, int i11) {
        boolean z11 = (i11 & 2) != 0;
        if ((i11 & 4) != 0) {
            interfaceC6250b = InterfaceC6250b.a.e();
        }
        InterfaceC6250b interfaceC6250b2 = interfaceC6250b;
        if ((i11 & 16) != 0) {
            f7 = 1.0f;
        }
        float f11 = f7;
        if ((i11 & 32) != 0) {
            c7809a0 = null;
        }
        return eVar.l0(new PainterElement(abstractC8972b, z11, interfaceC6250b2, interfaceC2547p, f11, c7809a0));
    }
}
