package androidx.compose.ui.focus;

import b0.p;
import g0.o;
import i4.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final p a(o oVar) {
        return new FocusRequesterElement(oVar);
    }

    public static final p b(p pVar, c cVar) {
        return pVar.c(new FocusChangedElement(cVar));
    }
}
