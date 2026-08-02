package P1;

import android.content.Context;
import android.graphics.Typeface;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* renamed from: P1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3796c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21545a;

    public C3796c(@NotNull Context context) {
        this.f21545a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull InterfaceC3808o interfaceC3808o, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C3795b frame;
        int i11;
        C3796c c3796c;
        if (cVar instanceof C3795b) {
            frame = (C3795b) cVar;
            int i12 = frame.f21544h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f21544h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f21542f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f21544h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (interfaceC3808o instanceof AbstractC3794a) {
                        ((AbstractC3794a) interfaceC3808o).getClass();
                        frame.f21544h = 1;
                        throw null;
                    }
                    if (!(interfaceC3808o instanceof Q)) {
                        throw new IllegalArgumentException("Unknown font type: " + interfaceC3808o);
                    }
                    Q q11 = (Q) interfaceC3808o;
                    frame.f21540d = this;
                    frame.f21541e = (Q) interfaceC3808o;
                    frame.f21544h = 2;
                    C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                    c10737n.o();
                    androidx.core.content.res.g.g(this.f21545a, q11.c(), new C3797d(c10737n, q11));
                    obj = c10737n.n();
                    if (obj == aVar) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                    c3796c = this;
                } else {
                    if (i11 == 1) {
                        Sc.s.b(obj);
                        return obj;
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3808o = frame.f21541e;
                    c3796c = frame.f21540d;
                    Sc.s.b(obj);
                }
                return U.a((Typeface) obj, ((Q) interfaceC3808o).d(), c3796c.f21545a);
            }
        }
        frame = new C3795b(this, cVar);
        Object obj2 = frame.f21542f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f21544h;
        if (i11 != 0) {
        }
        return U.a((Typeface) obj2, ((Q) interfaceC3808o).d(), c3796c.f21545a);
    }

    public final Typeface b(InterfaceC3808o interfaceC3808o) {
        if (interfaceC3808o instanceof AbstractC3794a) {
            throw null;
        }
        if (!(interfaceC3808o instanceof Q)) {
            return null;
        }
        int c11 = ((Q) interfaceC3808o).c();
        Context context = this.f21545a;
        Typeface e11 = androidx.core.content.res.g.e(c11, context);
        Intrinsics.f(e11);
        return U.a(e11, ((Q) interfaceC3808o).d(), context);
    }
}
