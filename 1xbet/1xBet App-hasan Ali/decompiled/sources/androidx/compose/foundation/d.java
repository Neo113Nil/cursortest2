package androidx.compose.foundation;

import b0.m;
import b0.o;
import b0.p;
import v.J;
import y.C2654j;
import z0.Z;

/* loaded from: classes.dex */
public abstract class d {
    static {
        new Z() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // z0.Z
            public final o i() {
                return new J();
            }

            @Override // z0.Z
            public final /* bridge */ /* synthetic */ void k(o oVar) {
            }
        };
    }

    public static final p a(p pVar, boolean z3, C2654j c2654j) {
        return pVar.c(z3 ? new FocusableElement(c2654j) : m.f7161k);
    }
}
