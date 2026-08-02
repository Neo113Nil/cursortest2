package D1;

import J0.C3349u1;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
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
    public static final I0 a(@NotNull InterfaceC2807j interfaceC2807j, Object obj) {
        C2804h0 c02;
        if (!interfaceC2807j.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = interfaceC2807j.getNode().getParent$ui_release();
        H f7 = C2809k.f(interfaceC2807j);
        while (f7 != null) {
            if ((C3349u1.c(f7) & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        AbstractC2813m abstractC2813m = parent$ui_release;
                        ?? r42 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof I0) {
                                I0 i02 = (I0) abstractC2813m;
                                if (obj.equals(i02.K0())) {
                                    return i02;
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 262144) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r42 = r42;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 262144) != 0) {
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
        return null;
    }

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
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final <T extends I0> T b(@NotNull T t2) {
        C2804h0 c02;
        if (!t2.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = t2.getNode().getParent$ui_release();
        H f7 = C2809k.f(t2);
        while (f7 != null) {
            if ((C3349u1.c(f7) & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        AbstractC2813m abstractC2813m = parent$ui_release;
                        ?? r52 = 0;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof I0) {
                                T t11 = (T) abstractC2813m;
                                if (Intrinsics.d(t2.K0(), t11.K0()) && t2.getClass() == t11.getClass()) {
                                    return t11;
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 262144) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r52 = r52;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 262144) != 0) {
                                        i11++;
                                        r52 = r52;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r52.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r52.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r52 = r52;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r52);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void c(@NotNull x1.r rVar, @NotNull Function1 function1) {
        C2804h0 c02;
        if (!rVar.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c parent$ui_release = rVar.getNode().getParent$ui_release();
        H f7 = C2809k.f(rVar);
        while (f7 != null) {
            if ((C3349u1.c(f7) & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        AbstractC2813m abstractC2813m = parent$ui_release;
                        ?? r52 = 0;
                        while (abstractC2813m != 0) {
                            boolean z11 = true;
                            if (abstractC2813m instanceof I0) {
                                I0 i02 = (I0) abstractC2813m;
                                if (Intrinsics.d(rVar.K0(), i02.K0()) && x1.r.class == i02.getClass()) {
                                    z11 = ((Boolean) function1.invoke(i02)).booleanValue();
                                }
                                if (!z11) {
                                    return;
                                }
                            } else {
                                if (((abstractC2813m.getKindSet$ui_release() & 262144) != 0) && (abstractC2813m instanceof AbstractC2813m)) {
                                    e.c J12 = abstractC2813m.J1();
                                    int i11 = 0;
                                    abstractC2813m = abstractC2813m;
                                    r52 = r52;
                                    while (J12 != null) {
                                        if ((J12.getKindSet$ui_release() & 262144) != 0) {
                                            i11++;
                                            r52 = r52;
                                            if (i11 == 1) {
                                                abstractC2813m = J12;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new U0.b(new e.c[16]);
                                                }
                                                if (abstractC2813m != 0) {
                                                    r52.b(abstractC2813m);
                                                    abstractC2813m = 0;
                                                }
                                                r52.b(J12);
                                            }
                                        }
                                        J12 = J12.getChild$ui_release();
                                        abstractC2813m = abstractC2813m;
                                        r52 = r52;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                            }
                            abstractC2813m = C2809k.b(r52);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            f7 = f7.g0();
            parent$ui_release = (f7 == null || (c02 = f7.c0()) == null) ? null : c02.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final <T extends I0> void d(@NotNull T t2, @NotNull Function1<? super T, ? extends H0> function1) {
        if (!t2.getNode().isAttached()) {
            A1.a.b("visitSubtreeIf called on an unattached node");
            throw null;
        }
        U0.b bVar = new U0.b(new e.c[16]);
        e.c child$ui_release = t2.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            C2809k.a(bVar, t2.getNode());
        } else {
            bVar.b(child$ui_release);
        }
        while (bVar.p()) {
            e.c cVar = (e.c) Pk0.b.b(1, bVar);
            if ((cVar.getAggregateChildKindSet$ui_release() & 262144) != 0) {
                for (e.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.getChild$ui_release()) {
                    if ((cVar2.getKindSet$ui_release() & 262144) != 0) {
                        ?? r82 = 0;
                        AbstractC2813m abstractC2813m = cVar2;
                        while (abstractC2813m != 0) {
                            if (abstractC2813m instanceof I0) {
                                I0 i02 = (I0) abstractC2813m;
                                H0 invoke = (Intrinsics.d(t2.K0(), i02.K0()) && t2.getClass() == i02.getClass()) ? function1.invoke(i02) : H0.ContinueTraversal;
                                if (invoke == H0.CancelTraversal) {
                                    return;
                                }
                                if (invoke == H0.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((abstractC2813m.getKindSet$ui_release() & 262144) != 0 && (abstractC2813m instanceof AbstractC2813m)) {
                                e.c J12 = abstractC2813m.J1();
                                int i11 = 0;
                                abstractC2813m = abstractC2813m;
                                r82 = r82;
                                while (J12 != null) {
                                    if ((J12.getKindSet$ui_release() & 262144) != 0) {
                                        i11++;
                                        r82 = r82;
                                        if (i11 == 1) {
                                            abstractC2813m = J12;
                                        } else {
                                            if (r82 == 0) {
                                                r82 = new U0.b(new e.c[16]);
                                            }
                                            if (abstractC2813m != 0) {
                                                r82.b(abstractC2813m);
                                                abstractC2813m = 0;
                                            }
                                            r82.b(J12);
                                        }
                                    }
                                    J12 = J12.getChild$ui_release();
                                    abstractC2813m = abstractC2813m;
                                    r82 = r82;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC2813m = C2809k.b(r82);
                        }
                    }
                }
            }
            C2809k.a(bVar, cVar);
        }
    }
}
