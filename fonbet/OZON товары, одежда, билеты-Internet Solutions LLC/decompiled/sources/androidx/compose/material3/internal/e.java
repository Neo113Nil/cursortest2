package androidx.compose.material3.internal;

import Q0.InterfaceC3831c;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import xe.N;

/* loaded from: classes8.dex */
public final class e {
    @NotNull
    public static final <T> InterfaceC3831c<T> a(@NotNull Function1<? super Q0.d<T>, Unit> function1) {
        Q0.d dVar = new Q0.d();
        function1.invoke(dVar);
        return new t(dVar.b());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Function0 function0, Function2 function2, kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f40229e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f40229e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f40228d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f40229e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    d dVar = new d(function0, function2, null);
                    cVar2.f40229e = 1;
                    if (N.d(dVar, cVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        cVar2 = new c(cVar);
        Object obj2 = cVar2.f40228d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f40229e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    public static final Object c(@NotNull p pVar, Object obj, float f7, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object h11 = pVar.h(obj, EnumC8372M.Default, new b(pVar, f7, null), jVar);
        return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
    }

    @NotNull
    public static final <T> androidx.compose.ui.e d(@NotNull androidx.compose.ui.e eVar, @NotNull p<T> pVar, @NotNull EnumC9142v enumC9142v, @NotNull Function2<? super Z1.q, ? super Z1.b, ? extends Pair<? extends InterfaceC3831c<T>, ? extends T>> function2) {
        return eVar.l0(new DraggableAnchorsElement(pVar, function2, enumC9142v));
    }
}
