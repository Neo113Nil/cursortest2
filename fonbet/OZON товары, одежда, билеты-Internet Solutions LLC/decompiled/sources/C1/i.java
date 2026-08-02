package C1;

import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.H;
import D1.InterfaceC2807j;
import J0.C3349u1;
import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface i extends l, InterfaceC2807j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // C1.l
    default Object G(@NotNull m mVar) {
        C2804h0 c02;
        if (!getNode().isAttached()) {
            A1.a.a("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = getNode().getParent$ui_release();
        H f7 = C2809k.f(this);
        while (f7 != null) {
            if ((C3349u1.c(f7) & 32) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 32) != 0) {
                        AbstractC2813m abstractC2813m = parent$ui_release;
                        ?? r42 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof i) {
                                i iVar = (i) abstractC2813m;
                                if (iVar.getProvidedValues().a(mVar)) {
                                    return iVar.getProvidedValues().b(mVar);
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 32) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r42 = r42;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 32) != 0) {
                                        i11++;
                                        r42 = r42;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r42.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r42.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r42 = r42;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r42);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
        return mVar.a().invoke();
    }

    @NotNull
    default h getProvidedValues() {
        return b.f4298a;
    }
}
