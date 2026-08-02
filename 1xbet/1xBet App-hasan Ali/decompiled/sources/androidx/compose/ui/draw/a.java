package androidx.compose.ui.draw;

import b0.p;
import i0.C2006k;
import i4.c;
import o0.C2195B;

/* loaded from: classes.dex */
public abstract class a {
    public static final p a(p pVar, c cVar) {
        return pVar.c(new DrawBehindElement(cVar));
    }

    public static final p b(p pVar, c cVar) {
        return pVar.c(new DrawWithCacheElement(cVar));
    }

    public static final p c(p pVar, c cVar) {
        return pVar.c(new DrawWithContentElement(cVar));
    }

    public static p d(p pVar, C2195B c2195b, C2006k c2006k) {
        return pVar.c(new PainterElement(c2195b, c2006k));
    }
}
