package Be;

import Ae.InterfaceC2395h;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import xe.O;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public final class n<T> extends AbstractC2635g<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Iterable<InterfaceC2395h<T>> f3620d;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3621d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<T> f3622e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ E<T> f3623f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2395h<? extends T> interfaceC2395h, E<T> e11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3622e = interfaceC2395h;
            this.f3623f = e11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f3622e, this.f3623f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3621d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f3621d = 1;
                if (this.f3622e.collect(this.f3623f, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull Iterable<? extends InterfaceC2395h<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        super(coroutineContext, i11, enumC11113a);
        this.f3620d = iterable;
    }

    @Override // Be.AbstractC2635g
    protected final Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        E e11 = new E(uVar);
        Iterator<InterfaceC2395h<T>> it = this.f3620d.iterator();
        while (it.hasNext()) {
            C10727i.c(uVar, null, null, new a(it.next(), e11, null), 3);
        }
        return Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new n(this.f3620d, coroutineContext, i11, enumC11113a);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    public final ze.w<T> g(@NotNull M m11) {
        C2634f c2634f = new C2634f(this, null);
        return ze.s.c(m11, this.f3579a, this.f3580b, EnumC11113a.SUSPEND, O.DEFAULT, c2634f);
    }
}
