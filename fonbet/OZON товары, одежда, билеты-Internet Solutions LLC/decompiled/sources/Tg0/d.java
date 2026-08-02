package Tg0;

import Sc.InterfaceC4008j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27173a;

    public d(@NotNull InterfaceC4008j<? extends Sg0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f27173a = repositoryLazy;
    }

    public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11 = ((Sg0.a) this.f27173a.getValue()).b(dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }
}
