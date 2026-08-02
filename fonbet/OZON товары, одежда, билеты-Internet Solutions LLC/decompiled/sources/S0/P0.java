package S0;

import S0.L0;
import Sc.r;
import c1.AbstractC5705I;
import c1.AbstractC5715f;
import c1.C5721l;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10733l;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1054}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class P0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    VL.b f25295d;

    /* renamed from: e, reason: collision with root package name */
    int f25296e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f25297f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ L0 f25298g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<xe.M, InterfaceC3955f0, kotlin.coroutines.d<? super Unit>, Object> f25299h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC3955f0 f25300i;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", l = {1055}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f25301d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f25302e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<xe.M, InterfaceC3955f0, kotlin.coroutines.d<? super Unit>, Object> f25303f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3955f0 f25304g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC6511n<? super xe.M, ? super InterfaceC3955f0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, InterfaceC3955f0 interfaceC3955f0, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f25303f = interfaceC6511n;
            this.f25304g = interfaceC3955f0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f25303f, this.f25304g, dVar);
            aVar.f25302e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f25301d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f25302e;
                this.f25301d = 1;
                if (((L0.h) this.f25303f).invoke(m11, this.f25304g, this) == aVar) {
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

    static final class b extends AbstractC7737t implements Function2<Set<? extends Object>, AbstractC5715f, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0 f25305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(L0 l02) {
            super(2);
            this.f25305b = l02;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, AbstractC5715f abstractC5715f) {
            InterfaceC10733l interfaceC10733l;
            androidx.collection.M m11;
            Set<? extends Object> set2 = set;
            Object obj = this.f25305b.f25244c;
            L0 l02 = this.f25305b;
            synchronized (obj) {
                try {
                    if (((L0.d) l02.f25260s.getValue()).compareTo(L0.d.Idle) >= 0) {
                        m11 = l02.f25249h;
                        if (set2 instanceof U0.c) {
                            androidx.collection.X b11 = ((U0.c) set2).b();
                            Object[] objArr = b11.f38663b;
                            long[] jArr = b11.f38662a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j11 = jArr[i11];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((255 & j11) < 128) {
                                                Object obj2 = objArr[(i11 << 3) + i13];
                                                if (!(obj2 instanceof AbstractC5705I) || ((AbstractC5705I) obj2).w(1)) {
                                                    m11.d(obj2);
                                                }
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i12 != 8) {
                                            break;
                                        }
                                    }
                                    if (i11 == length) {
                                        break;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            for (Object obj3 : set2) {
                                if (!(obj3 instanceof AbstractC5705I) || ((AbstractC5705I) obj3).w(1)) {
                                    m11.d(obj3);
                                }
                            }
                        }
                        interfaceC10733l = l02.U();
                    } else {
                        interfaceC10733l = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC10733l != null) {
                r.Companion companion = Sc.r.INSTANCE;
                ((C10737n) interfaceC10733l).resumeWith(Unit.f71690a);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    P0(L0 l02, InterfaceC6511n<? super xe.M, ? super InterfaceC3955f0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, InterfaceC3955f0 interfaceC3955f0, kotlin.coroutines.d<? super P0> dVar) {
        super(2, dVar);
        this.f25298g = l02;
        this.f25299h = interfaceC6511n;
        this.f25300i = interfaceC3955f0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        P0 p02 = new P0(this.f25298g, this.f25299h, this.f25300i, dVar);
        p02.f25297f = obj;
        return p02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((P0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        List list;
        L0.c cVar;
        Ae.x0 x0Var;
        V0.e eVar;
        Y0.b add;
        xe.B0 b02;
        Throwable th2;
        VL.b bVar;
        List Z11;
        Ae.x0 x0Var2;
        Object obj2;
        L0.c cVar2;
        Ae.x0 x0Var3;
        V0.e eVar2;
        Y0.b remove;
        Ae.x0 x0Var4;
        L0.c cVar3;
        Ae.x0 x0Var5;
        V0.e eVar3;
        Y0.b remove2;
        Ae.x0 x0Var6;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f25296e;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.B0 g10 = xe.E0.g(((xe.M) this.f25297f).getCoroutineContext());
            L0.M(this.f25298g, g10);
            b bVar2 = new b(this.f25298g);
            C5721l.y(C5721l.f56250a);
            synchronized (C5721l.D()) {
                list = C5721l.f56257h;
                C5721l.f56257h = C7714v.q0(bVar2, list);
                Unit unit = Unit.f71690a;
            }
            VL.b bVar3 = new VL.b((Function2) bVar2);
            cVar = this.f25298g.f25263v;
            try {
                do {
                    x0Var = L0.f25240w;
                    eVar = (V0.e) x0Var.getValue();
                    add = eVar.add((Object) cVar);
                    if (eVar != add) {
                        x0Var2 = L0.f25240w;
                    }
                    break;
                } while (!x0Var2.b(eVar, add));
                break;
                Object obj3 = this.f25298g.f25244c;
                L0 l02 = this.f25298g;
                synchronized (obj3) {
                    Z11 = l02.Z();
                }
                int size = Z11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((G) Z11.get(i12)).t();
                }
                a aVar2 = new a(this.f25299h, this.f25300i, null);
                this.f25297f = g10;
                this.f25295d = bVar3;
                this.f25296e = 1;
                if (xe.N.d(aVar2, this) == aVar) {
                    return aVar;
                }
                b02 = g10;
                bVar = bVar3;
            } catch (Throwable th3) {
                b02 = g10;
                th2 = th3;
                bVar = bVar3;
                bVar.a();
                obj2 = this.f25298g.f25244c;
                L0 l03 = this.f25298g;
                synchronized (obj2) {
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.f25295d;
            b02 = (xe.B0) this.f25297f;
            try {
                Sc.s.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                bVar.a();
                obj2 = this.f25298g.f25244c;
                L0 l032 = this.f25298g;
                synchronized (obj2) {
                    try {
                        if (l032.f25245d == b02) {
                            l032.f25245d = null;
                        }
                        l032.U();
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                cVar2 = this.f25298g.f25263v;
                do {
                    x0Var3 = L0.f25240w;
                    eVar2 = (V0.e) x0Var3.getValue();
                    remove = eVar2.remove((Object) cVar2);
                    if (eVar2 == remove) {
                        break;
                    }
                    x0Var4 = L0.f25240w;
                } while (!x0Var4.b(eVar2, remove));
                throw th2;
            }
        }
        bVar.a();
        Object obj4 = this.f25298g.f25244c;
        L0 l04 = this.f25298g;
        synchronized (obj4) {
            try {
                if (l04.f25245d == b02) {
                    l04.f25245d = null;
                }
                l04.U();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        cVar3 = this.f25298g.f25263v;
        do {
            x0Var5 = L0.f25240w;
            eVar3 = (V0.e) x0Var5.getValue();
            remove2 = eVar3.remove((Object) cVar3);
            if (eVar3 == remove2) {
                break;
            }
            x0Var6 = L0.f25240w;
        } while (!x0Var6.b(eVar3, remove2));
        return Unit.f71690a;
    }
}
