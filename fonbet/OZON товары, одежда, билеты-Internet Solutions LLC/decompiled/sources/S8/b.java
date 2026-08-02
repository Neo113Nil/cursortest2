package S8;

import U8.c;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import l1.C7827j0;
import l1.J0;
import l1.y0;
import n8.InterfaceC8452b;
import n8.e;
import n8.w;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements e {
    public static final int b(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                int i14 = i12 % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i11 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i12 - i16;
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i11 > i12) {
                int i17 = -i13;
                int i18 = i11 % i17;
                if (i18 < 0) {
                    i18 += i17;
                }
                int i19 = i12 % i17;
                if (i19 < 0) {
                    i19 += i17;
                }
                int i21 = (i18 - i19) % i17;
                if (i21 < 0) {
                    i21 += i17;
                }
                return i12 + i21;
            }
        }
        return i12;
    }

    public static androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f7, J0 j02, int i11) {
        boolean z11;
        if ((i11 & 2) != 0) {
            j02 = y0.a();
        }
        J0 j03 = j02;
        if ((i11 & 4) != 0) {
            z11 = Float.compare(f7, (float) 0) > 0;
        } else {
            z11 = false;
        }
        return (Float.compare(f7, (float) 0) > 0 || z11) ? eVar.l0(new ShadowGraphicsLayerElement(f7, j03, z11, C7827j0.a(), C7827j0.a())) : eVar;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return new U8.c(interfaceC8452b.c(w.a(c.a.class)));
    }
}
