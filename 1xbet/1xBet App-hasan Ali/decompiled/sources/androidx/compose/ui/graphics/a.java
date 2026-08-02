package androidx.compose.ui.graphics;

import b0.p;
import i0.F;
import i0.J;
import i0.N;
import i0.v;
import i4.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final p a(p pVar, c cVar) {
        return pVar.c(new BlockGraphicsLayerElement(cVar));
    }

    public static p b(p pVar, float f, J j5, int i) {
        if ((i & 32) != 0) {
            f = 0.0f;
        }
        float f5 = f;
        long j6 = N.f17263b;
        if ((i & 2048) != 0) {
            j5 = F.f17222a;
        }
        long j7 = v.f17299a;
        return pVar.c(new GraphicsLayerElement(1.0f, f5, 0.0f, j6, j5, false, j7, j7));
    }

    public static p c(p pVar, float f, float f5, J j5, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f6 = f;
        float f7 = (i & 256) != 0 ? 0.0f : f5;
        long j6 = N.f17263b;
        J j7 = (i & 2048) != 0 ? F.f17222a : j5;
        boolean z3 = (i & 4096) == 0;
        long j8 = v.f17299a;
        return pVar.c(new GraphicsLayerElement(f6, 0.0f, f7, j6, j7, z3, j8, j8));
    }
}
