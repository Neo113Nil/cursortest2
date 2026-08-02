package A4;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import Sc.C4005g;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import j3.C7248D;
import j3.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y f399a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f400b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f401c;

    public c(@NotNull y player) {
        C3991w0 f7;
        C3991w0 f11;
        Intrinsics.checkNotNullParameter(player, "player");
        this.f399a = player;
        f7 = n1.f(Boolean.valueOf(N.b0(player)), D1.f25195a);
        this.f400b = f7;
        f11 = n1.f(Boolean.valueOf(N.c0(player, true)), D1.f25195a);
        this.f401c = f11;
    }

    public static Unit a(c cVar, y listen, y.b events) {
        Intrinsics.checkNotNullParameter(listen, "$this$listen");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.b(4, 5, 13)) {
            cVar.f401c.setValue(Boolean.valueOf(N.c0(listen, true)));
            cVar.f400b.setValue(Boolean.valueOf(N.b0(listen)));
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f401c.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f400b.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Wc.a d(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        b bVar;
        int i11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f398f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f398f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f396d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f398f;
                if (i11 != 0) {
                    s.b(obj);
                    y yVar = this.f399a;
                    this.f401c.setValue(Boolean.valueOf(N.c0(yVar, true)));
                    this.f400b.setValue(Boolean.valueOf(N.b0(yVar)));
                    Function2 function2 = new Function2() { // from class: A4.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return c.a(c.this, (y) obj2, (y.b) obj3);
                        }
                    };
                    bVar.f398f = 1;
                    if (C7248D.b(yVar, function2, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                throw new C4005g();
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f396d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f398f;
        if (i11 != 0) {
        }
        throw new C4005g();
    }
}
