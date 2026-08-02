package Ql0;

import De.C2862e;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sb.C9647a;
import xe.C10727i;
import xe.C10747s0;
import xe.I;
import yl0.C10923h;
import yl0.InterfaceC10918c;

/* loaded from: classes8.dex */
public final class c implements Ql0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C2862e f23801a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C9647a f23802b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Za.d f23803c;

    public static final class a extends AbstractC7737t implements Function1<C10923h<Unit>.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2862e f23804b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f23805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2862e c2862e, c cVar) {
            super(1);
            this.f23804b = c2862e;
            this.f23805c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C10923h<Unit>.a aVar) {
            C10923h<Unit>.a create = aVar;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            C10727i.c(this.f23804b, null, null, new Ql0.b(create, null, this.f23805c), 3);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC10918c {
        public b(C2862e c2862e) {
        }

        @Override // yl0.InterfaceC10918c
        public final void onComplete() {
        }
    }

    /* renamed from: Ql0.c$c, reason: collision with other inner class name */
    public static final class C0479c implements InterfaceC10918c {
        @Override // yl0.InterfaceC10918c
        public final void onComplete() {
        }
    }

    public c(@NotNull C2862e scope, @NotNull C9647a checkHostsAvailabilityUseCase, @NotNull Za.d rootLogger) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(checkHostsAvailabilityUseCase, "checkHostsAvailabilityUseCase");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f23801a = scope;
        this.f23802b = checkHostsAvailabilityUseCase;
        this.f23803c = rootLogger.a(this);
    }

    @Override // Ql0.a
    @NotNull
    public final C10923h<Unit> a() {
        this.f23803c.info("Check push availability");
        C2862e c2862e = this.f23801a;
        a block = new a(c2862e, this);
        Intrinsics.checkNotNullParameter(block, "block");
        C10923h<Unit> c10923h = new C10923h<>(0);
        block.invoke(new C10923h.a());
        I i11 = (I) c2862e.getCoroutineContext().get(I.f105397a);
        Executor a11 = i11 != null ? C10747s0.a(i11) : null;
        if (a11 == null) {
            c10923h.g(new b(c2862e));
            return c10923h;
        }
        c10923h.f(a11, new C0479c());
        return c10923h;
    }
}
