package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.O;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public final class i<T> extends AbstractC2635g<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final V f3582d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3583e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B0 f3584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Je.f f3585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ze.u<T> f3586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E<T> f3587d;

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
        /* renamed from: Be.i$a$a, reason: collision with other inner class name */
        static final class C0088a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f3588d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h<T> f3589e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ E<T> f3590f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Je.f f3591g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0088a(InterfaceC2395h<? extends T> interfaceC2395h, E<T> e11, Je.f fVar, kotlin.coroutines.d<? super C0088a> dVar) {
                super(2, dVar);
                this.f3589e = interfaceC2395h;
                this.f3590f = e11;
                this.f3591g = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0088a(this.f3589e, this.f3590f, this.f3591g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0088a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [Je.f] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v3, types: [Je.h] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f3588d;
                ?? r22 = this.f3591g;
                try {
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        InterfaceC2395h<T> interfaceC2395h = this.f3589e;
                        E<T> e11 = this.f3590f;
                        this.f3588d = 1;
                        if (interfaceC2395h.collect(e11, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    r22 = (Je.h) r22;
                    r22.release();
                    return Unit.f71690a;
                } catch (Throwable th2) {
                    ((Je.h) r22).release();
                    throw th2;
                }
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", l = {62}, m = "emit")
        static final class b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f3592d;

            /* renamed from: e, reason: collision with root package name */
            InterfaceC2395h f3593e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f3594f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a<T> f3595g;

            /* renamed from: h, reason: collision with root package name */
            int f3596h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.f3595g = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3594f = obj;
                this.f3596h |= LinearLayoutManager.INVALID_OFFSET;
                return this.f3595g.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(B0 b02, Je.f fVar, ze.u<? super T> uVar, E<T> e11) {
            this.f3584a = b02;
            this.f3585b = fVar;
            this.f3586c = uVar;
            this.f3587d = e11;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC2395h<? extends T> interfaceC2395h, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar;
            int i11;
            a<T> aVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i12 = bVar.f3596h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f3596h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f3594f;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f3596h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        B0 b02 = this.f3584a;
                        if (b02 != null && !b02.isActive()) {
                            throw b02.Z();
                        }
                        bVar.f3592d = this;
                        bVar.f3593e = interfaceC2395h;
                        bVar.f3596h = 1;
                        if (((Je.h) this.f3585b).d(bVar) == aVar2) {
                            return aVar2;
                        }
                        aVar = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC2395h = bVar.f3593e;
                        aVar = (a) bVar.f3592d;
                        Sc.s.b(obj);
                    }
                    C10727i.c(aVar.f3586c, null, null, new C0088a(interfaceC2395h, aVar.f3587d, aVar.f3585b, null), 3);
                    return Unit.f71690a;
                }
            }
            bVar = new b(this, dVar);
            Object obj2 = bVar.f3594f;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = bVar.f3596h;
            if (i11 != 0) {
            }
            C10727i.c(aVar.f3586c, null, null, new C0088a(interfaceC2395h, aVar.f3587d, aVar.f3585b, null), 3);
            return Unit.f71690a;
        }
    }

    public i(@NotNull V v11, int i11, @NotNull CoroutineContext coroutineContext, int i12, @NotNull EnumC11113a enumC11113a) {
        super(coroutineContext, i12, enumC11113a);
        this.f3582d = v11;
        this.f3583e = i11;
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final String c() {
        return "concurrency=" + this.f3583e;
    }

    @Override // Be.AbstractC2635g
    protected final Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = this.f3582d.collect(new a((B0) dVar.getContext().get(B0.f105374o0), Je.k.a(this.f3583e), uVar, new E(uVar)), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new i(this.f3582d, this.f3583e, coroutineContext, i11, enumC11113a);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    public final ze.w<T> g(@NotNull M m11) {
        C2634f c2634f = new C2634f(this, null);
        return ze.s.c(m11, this.f3579a, this.f3580b, EnumC11113a.SUSPEND, O.DEFAULT, c2634f);
    }
}
