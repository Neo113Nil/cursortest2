package Jf0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<W2.f> f14697a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f.a<Integer> f14698b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f.a<Integer> f14699c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f14700d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityConfigDataSource$clear$2", f = "DomainReachabilityConfigDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Jf0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0273a extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14701d;

        C0273a() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0273a c0273a = new C0273a(2, dVar);
            c0273a.f14701d = obj;
            return c0273a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0273a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((W2.b) this.f14701d).f();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityConfigDataSource$saveDomainsLimit$2", f = "DomainReachabilityConfigDataSource.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14702d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14704f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f14704f = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = a.this.new b(this.f14704f, dVar);
            bVar.f14702d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((W2.b) this.f14702d).i(a.this.f14699c, new Integer(this.f14704f));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityConfigDataSource$saveParallelPingLimit$2", f = "DomainReachabilityConfigDataSource.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14705d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14707f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f14707f = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = a.this.new c(this.f14707f, dVar);
            cVar.f14705d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            ((W2.b) this.f14705d).i(a.this.f14698b, new Integer(this.f14707f));
            return Unit.f71690a;
        }
    }

    public static final class d implements InterfaceC2395h<Lf0.f> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f14708a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f14709b;

        /* renamed from: Jf0.a$d$a, reason: collision with other inner class name */
        public static final class C0274a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f14710a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f14711b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityConfigDataSource$special$$inlined$map$1$2", f = "DomainReachabilityConfigDataSource.kt", l = {223}, m = "emit")
            /* renamed from: Jf0.a$d$a$a, reason: collision with other inner class name */
            public static final class C0275a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f14712d;

                /* renamed from: e, reason: collision with root package name */
                int f14713e;

                public C0275a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f14712d = obj;
                    this.f14713e |= LinearLayoutManager.INVALID_OFFSET;
                    return C0274a.this.emit(null, this);
                }
            }

            public C0274a(InterfaceC2397i interfaceC2397i, a aVar) {
                this.f14710a = interfaceC2397i;
                this.f14711b = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0275a c0275a;
                int i11;
                if (dVar instanceof C0275a) {
                    c0275a = (C0275a) dVar;
                    int i12 = c0275a.f14713e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0275a.f14713e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0275a.f14712d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0275a.f14713e;
                        if (i11 != 0) {
                            s.b(obj2);
                            W2.f fVar = (W2.f) obj;
                            a aVar2 = this.f14711b;
                            Lf0.f fVar2 = new Lf0.f((Integer) fVar.c(aVar2.f14699c), (Integer) fVar.c(aVar2.f14698b));
                            c0275a.f14713e = 1;
                            if (this.f14710a.emit(fVar2, c0275a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0275a = new C0275a(dVar);
                Object obj22 = c0275a.f14712d;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0275a.f14713e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public d(InterfaceC2395h interfaceC2395h, a aVar) {
            this.f14708a = interfaceC2395h;
            this.f14709b = aVar;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super Lf0.f> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f14708a.collect(new C0274a(interfaceC2397i, this.f14709b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public a(@NotNull InterfaceC3917k<W2.f> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f14697a = dataStore;
        this.f14698b = W2.i.b("parallelPingLimit");
        this.f14699c = W2.i.b("domainsLimit");
        this.f14700d = new d(dataStore.getData(), this);
    }

    public final Object c(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f14697a, new C0273a(), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @NotNull
    public final d d() {
        return this.f14700d;
    }

    public final Object e(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f14697a, new b(i11, null), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final Object f(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = W2.j.a(this.f14697a, new c(i11, null), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
