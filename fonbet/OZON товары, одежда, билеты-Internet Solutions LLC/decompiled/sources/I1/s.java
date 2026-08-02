package I1;

import D1.AbstractC2813m;
import D1.C2804h0;
import D1.C2809k;
import D1.E0;
import D1.H;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s {
    @NotNull
    public static final r a(@NotNull H h11, boolean z11) {
        C2804h0 c02 = h11.c0();
        Object obj = null;
        if ((C2804h0.c(c02) & 8) != 0) {
            e.c h12 = c02.h();
            loop0: while (true) {
                if (h12 == null) {
                    break;
                }
                if ((h12.getKindSet$ui_release() & 8) != 0) {
                    e.c cVar = h12;
                    U0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof E0) {
                            obj = cVar;
                            break loop0;
                        }
                        if ((cVar.getKindSet$ui_release() & 8) != 0 && (cVar instanceof AbstractC2813m)) {
                            int i11 = 0;
                            for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                if ((J12.getKindSet$ui_release() & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVar = J12;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new U0.b(new e.c[16]);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(J12);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVar = C2809k.b(bVar);
                    }
                }
                if ((h12.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
                h12 = h12.getChild$ui_release();
            }
        }
        Intrinsics.f(obj);
        e.c node = ((E0) obj).getNode();
        l B11 = h11.B();
        Intrinsics.f(B11);
        return new r(node, z11, h11, B11);
    }

    public static final H b(@NotNull H h11, @NotNull Function1<? super H, Boolean> function1) {
        for (H g02 = h11.g0(); g02 != null; g02 = g02.g0()) {
            if (function1.invoke(g02).booleanValue()) {
                return g02;
            }
        }
        return null;
    }

    public static final E0 c(@NotNull H h11) {
        C2804h0 c02 = h11.c0();
        Object obj = null;
        if ((C2804h0.c(c02) & 8) != 0) {
            e.c h12 = c02.h();
            loop0: while (true) {
                if (h12 == null) {
                    break;
                }
                if ((h12.getKindSet$ui_release() & 8) != 0) {
                    e.c cVar = h12;
                    U0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof E0) {
                            if (((E0) cVar).getShouldMergeDescendantSemantics()) {
                                obj = cVar;
                                break loop0;
                            }
                        } else if ((cVar.getKindSet$ui_release() & 8) != 0 && (cVar instanceof AbstractC2813m)) {
                            int i11 = 0;
                            for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                if ((J12.getKindSet$ui_release() & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVar = J12;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new U0.b(new e.c[16]);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(J12);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVar = C2809k.b(bVar);
                    }
                }
                if ((h12.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
                h12 = h12.getChild$ui_release();
            }
        }
        return (E0) obj;
    }
}
