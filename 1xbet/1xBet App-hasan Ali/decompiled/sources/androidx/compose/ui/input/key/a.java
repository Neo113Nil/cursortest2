package androidx.compose.ui.input.key;

import b0.p;
import i4.c;

/* loaded from: classes.dex */
public abstract class a {
    public static final p a(c cVar) {
        return new KeyInputElement(cVar, null);
    }

    public static final p b(p pVar, c cVar) {
        return pVar.c(new KeyInputElement(null, cVar));
    }
}
