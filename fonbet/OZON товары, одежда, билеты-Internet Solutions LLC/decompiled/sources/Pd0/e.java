package Pd0;

import Sc.s;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f22270a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f22271b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.limb.internal.DelayedLinksUseCase$onUIReady$1", f = "DelayedLinksUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            e eVar = e.this;
            Iterator<T> it = eVar.f22270a.a().iterator();
            while (it.hasNext()) {
                eVar.f22271b.a((Kd0.g) it.next());
            }
            return Unit.f71690a;
        }
    }

    public e(@NotNull d delayedLinkRepository, @NotNull b linkHandler) {
        Intrinsics.checkNotNullParameter(delayedLinkRepository, "delayedLinkRepository");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.f22270a = delayedLinkRepository;
        this.f22271b = linkHandler;
    }

    public final void c() {
        C10727i.c(c.a(), null, null, new a(null), 3);
    }
}
