package Ae;

import Be.AbstractC2635g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* renamed from: Ae.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2387d<T> extends AbstractC2635g<T> {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f964f = AtomicIntegerFieldUpdater.newUpdater(C2387d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ze.w<T> f965d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f966e;

    public /* synthetic */ C2387d(ze.w wVar, boolean z11) {
        this(wVar, z11, kotlin.coroutines.g.f71771a, -3, EnumC11113a.SUSPEND);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final String c() {
        return "channel=" + this.f965d;
    }

    @Override // Be.AbstractC2635g, Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (this.f3580b != -3) {
            Object collect = super.collect(interfaceC2397i, dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
        boolean z11 = this.f966e;
        if (z11 && f964f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object c11 = C2407n.c(interfaceC2397i, this.f965d, z11, dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    protected final Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11 = C2407n.c(new Be.E(uVar), this.f965d, this.f966e, dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new C2387d(this.f965d, this.f966e, coroutineContext, i11, enumC11113a);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    public final InterfaceC2395h<T> f() {
        return new C2387d(this.f965d, this.f966e);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    public final ze.w<T> g(@NotNull xe.M m11) {
        if (!this.f966e || f964f.getAndSet(this, 1) == 0) {
            return this.f3580b == -3 ? this.f965d : super.g(m11);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2387d(@NotNull ze.w<? extends T> wVar, boolean z11, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        super(coroutineContext, i11, enumC11113a);
        this.f965d = wVar;
        this.f966e = z11;
        this.consumed$volatile = 0;
    }
}
