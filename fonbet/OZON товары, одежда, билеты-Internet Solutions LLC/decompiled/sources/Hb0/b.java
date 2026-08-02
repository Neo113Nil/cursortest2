package Hb0;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import xe.C10754w;
import xe.InterfaceC10750u;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10750u<Unit> f10787a = C10754w.a();

    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object s11 = this.f10787a.s(cVar);
        return s11 == Wc.a.COROUTINE_SUSPENDED ? s11 : Unit.f71690a;
    }

    public final void b() {
        this.f10787a.complete(Unit.f71690a);
    }
}
