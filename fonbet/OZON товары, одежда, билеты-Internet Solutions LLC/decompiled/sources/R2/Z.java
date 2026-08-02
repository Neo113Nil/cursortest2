package R2;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import xe.C10754w;
import xe.H0;
import xe.InterfaceC10750u;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Je.d f24334a = Je.e.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<Unit> f24335b = C10754w.a();

    public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object s11 = this.f24335b.s(dVar);
        return s11 == Wc.a.COROUTINE_SUSPENDED ? s11 : Unit.f71690a;
    }

    protected abstract Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:25:0x0062, B:27:0x006c, B:30:0x0076), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:25:0x0062, B:27:0x006c, B:30:0x0076), top: B:24:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [Je.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Y y11;
        int i11;
        Je.d dVar;
        Z z11;
        InterfaceC3394a interfaceC3394a;
        Throwable th2;
        Z z12;
        try {
            if (cVar instanceof Y) {
                y11 = (Y) cVar;
                int i12 = y11.f24333h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    y11.f24333h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = y11.f24331f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = y11.f24333h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (((H0) this.f24335b).l0()) {
                            return Unit.f71690a;
                        }
                        y11.f24329d = this;
                        dVar = this.f24334a;
                        y11.f24330e = dVar;
                        y11.f24333h = 1;
                        if (dVar.a(y11) != aVar) {
                            z11 = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = y11.f24330e;
                        z12 = y11.f24329d;
                        try {
                            Sc.s.b(obj);
                            InterfaceC10750u<Unit> interfaceC10750u = z12.f24335b;
                            Unit unit = Unit.f71690a;
                            interfaceC10750u.complete(unit);
                            interfaceC3394a.c(null);
                            return unit;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC3394a.c(null);
                            throw th2;
                        }
                    }
                    ?? r22 = y11.f24330e;
                    z11 = y11.f24329d;
                    Sc.s.b(obj);
                    dVar = r22;
                    if (!((H0) z11.f24335b).l0()) {
                        Unit unit2 = Unit.f71690a;
                        dVar.c(null);
                        return unit2;
                    }
                    y11.f24329d = z11;
                    y11.f24330e = dVar;
                    y11.f24333h = 2;
                    if (z11.b(y11) != aVar) {
                        interfaceC3394a = dVar;
                        z12 = z11;
                        InterfaceC10750u<Unit> interfaceC10750u2 = z12.f24335b;
                        Unit unit3 = Unit.f71690a;
                        interfaceC10750u2.complete(unit3);
                        interfaceC3394a.c(null);
                        return unit3;
                    }
                    return aVar;
                }
            }
            if (!((H0) z11.f24335b).l0()) {
            }
        } catch (Throwable th4) {
            interfaceC3394a = dVar;
            th2 = th4;
            interfaceC3394a.c(null);
            throw th2;
        }
        y11 = new Y(this, cVar);
        Object obj2 = y11.f24331f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = y11.f24333h;
        if (i11 != 0) {
        }
    }
}
