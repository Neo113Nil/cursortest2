package S1;

import K1.C3421a;
import K1.C3433m;
import K1.C3437q;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;
import k1.C7465k;
import l1.AbstractC7799Q;
import l1.C7801T;
import l1.F0;
import l1.H0;
import l1.InterfaceC7802U;
import l1.K0;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b {
    public static final void a(@NotNull C3433m c3433m, @NotNull InterfaceC7802U interfaceC7802U, @NotNull AbstractC7799Q abstractC7799Q, float f7, H0 h02, V1.i iVar, AbstractC8413f abstractC8413f) {
        interfaceC7802U.save();
        if (c3433m.v().size() <= 1) {
            b(c3433m, interfaceC7802U, abstractC7799Q, f7, h02, iVar, abstractC8413f);
        } else if (abstractC7799Q instanceof K0) {
            b(c3433m, interfaceC7802U, abstractC7799Q, f7, h02, iVar, abstractC8413f);
        } else if (abstractC7799Q instanceof F0) {
            ArrayList v11 = c3433m.v();
            int size = v11.size();
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                C3437q c3437q = (C3437q) v11.get(i11);
                f12 += ((C3421a) c3437q.e()).h();
                f11 = Math.max(f11, ((C3421a) c3437q.e()).A());
            }
            Shader mo70createShaderuvyYCjk = ((F0) abstractC7799Q).mo70createShaderuvyYCjk(C7465k.a(f11, f12));
            Matrix matrix = new Matrix();
            mo70createShaderuvyYCjk.getLocalMatrix(matrix);
            ArrayList v12 = c3433m.v();
            int size2 = v12.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C3437q c3437q2 = (C3437q) v12.get(i12);
                ((C3421a) c3437q2.e()).F(interfaceC7802U, C7801T.a(mo70createShaderuvyYCjk), f7, h02, iVar, abstractC8413f);
                interfaceC7802U.f(0.0f, ((C3421a) c3437q2.e()).h());
                matrix.setTranslate(0.0f, -((C3421a) c3437q2.e()).h());
                mo70createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        interfaceC7802U.p();
    }

    private static final void b(C3433m c3433m, InterfaceC7802U interfaceC7802U, AbstractC7799Q abstractC7799Q, float f7, H0 h02, V1.i iVar, AbstractC8413f abstractC8413f) {
        ArrayList v11 = c3433m.v();
        int size = v11.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3437q c3437q = (C3437q) v11.get(i11);
            ((C3421a) c3437q.e()).F(interfaceC7802U, abstractC7799Q, f7, h02, iVar, abstractC8413f);
            interfaceC7802U.f(0.0f, ((C3421a) c3437q.e()).h());
        }
    }
}
