package A5;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.I;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r3v1, types: [A5.g, T, androidx.lifecycle.I] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull AbstractC5434v abstractC5434v, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f frame;
        int i11;
        AbstractC5434v abstractC5434v2;
        M m11;
        Throwable th2;
        I i12;
        I i13;
        if (cVar instanceof f) {
            frame = (f) cVar;
            int i14 = frame.f422g;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f422g = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f421f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f422g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (abstractC5434v.b().a(AbstractC5434v.b.STARTED)) {
                        return Unit.f71690a;
                    }
                    M m12 = new M();
                    try {
                        frame.f419d = abstractC5434v;
                        frame.f420e = m12;
                        frame.f422g = 1;
                        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                        c10737n.o();
                        ?? gVar = new g(c10737n);
                        m12.f71787a = gVar;
                        abstractC5434v.a(gVar);
                        Object n11 = c10737n.n();
                        if (n11 == aVar) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (n11 == aVar) {
                            return aVar;
                        }
                        abstractC5434v2 = abstractC5434v;
                        m11 = m12;
                    } catch (Throwable th3) {
                        abstractC5434v2 = abstractC5434v;
                        m11 = m12;
                        th2 = th3;
                        i12 = (I) m11.f71787a;
                        if (i12 != null) {
                            abstractC5434v2.e(i12);
                        }
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m11 = frame.f420e;
                    abstractC5434v2 = frame.f419d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        i12 = (I) m11.f71787a;
                        if (i12 != null) {
                        }
                        throw th2;
                    }
                }
                i13 = (I) m11.f71787a;
                if (i13 != null) {
                    abstractC5434v2.e(i13);
                }
                return Unit.f71690a;
            }
        }
        frame = new f(cVar);
        Object obj2 = frame.f421f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f422g;
        if (i11 != 0) {
        }
        i13 = (I) m11.f71787a;
        if (i13 != null) {
        }
        return Unit.f71690a;
    }
}
