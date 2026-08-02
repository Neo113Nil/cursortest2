package P60;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledBankAppsInteractorImpl$getInstalledBankApps$2", f = "InstalledBankAppsInteractorImpl.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<? extends n>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f21908d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q f21909e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledBankAppsInteractorImpl$getInstalledBankApps$2$1", f = "InstalledBankAppsInteractorImpl.kt", l = {107}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<? extends n>>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f21910d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f21911e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Je.f f21912f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f21913g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledBankAppsInteractorImpl$getInstalledBankApps$2$1$1$1", f = "InstalledBankAppsInteractorImpl.kt", l = {239}, m = "invokeSuspend")
        /* renamed from: P60.p$a$a, reason: collision with other inner class name */
        static final class C0433a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<? extends n>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            Object f21914d;

            /* renamed from: e, reason: collision with root package name */
            q f21915e;

            /* renamed from: f, reason: collision with root package name */
            P60.c f21916f;

            /* renamed from: g, reason: collision with root package name */
            int f21917g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Je.f f21918h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ q f21919i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ P60.c f21920j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0433a(Je.f fVar, q qVar, P60.c cVar, kotlin.coroutines.d<? super C0433a> dVar) {
                super(2, dVar);
                this.f21918h = fVar;
                this.f21919i = qVar;
                this.f21920j = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0433a(this.f21918h, this.f21919i, this.f21920j, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends n>> dVar) {
                return ((C0433a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                q qVar;
                Je.f fVar;
                P60.c cVar;
                List f7;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f21917g;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Je.f fVar2 = this.f21918h;
                    this.f21914d = fVar2;
                    qVar = this.f21919i;
                    this.f21915e = qVar;
                    P60.c cVar2 = this.f21920j;
                    this.f21916f = cVar2;
                    this.f21917g = 1;
                    if (((Je.h) fVar2).d(this) == aVar) {
                        return aVar;
                    }
                    fVar = fVar2;
                    cVar = cVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = this.f21916f;
                    qVar = this.f21915e;
                    fVar = (Je.f) this.f21914d;
                    Sc.s.b(obj);
                }
                try {
                    f7 = qVar.f(cVar);
                    return f7;
                } finally {
                    fVar.release();
                }
            }
        }

        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b(Long.valueOf(((n) t2).c()), Long.valueOf(((n) t11).c()));
            }
        }

        public static final class c<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f21921a;

            public c(b bVar) {
                this.f21921a = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                int compare = this.f21921a.compare(t2, t11);
                return compare != 0 ? compare : Vc.a.b(((n) t2).d(), ((n) t11).d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Je.f fVar, q qVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21912f = fVar;
            this.f21913g = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f21912f, this.f21913g, dVar);
            aVar.f21911e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends n>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21910d;
            if (i11 == 0) {
                Sc.s.b(obj);
                M m11 = (M) this.f21911e;
                Xc.a<P60.c> b11 = P60.c.b();
                ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
                Iterator<E> it = b11.iterator();
                while (it.hasNext()) {
                    arrayList.add(C10727i.a(m11, null, null, new C0433a(this.f21912f, this.f21913g, (P60.c) it.next(), null), 3));
                }
                this.f21910d = 1;
                obj = C10721f.a(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return C7714v.I0(new c(new b()), C7714v.N((Iterable) obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, kotlin.coroutines.d<? super p> dVar) {
        super(2, dVar);
        this.f21909e = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f21909e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends n>> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21908d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(Je.k.a(8), this.f21909e, null);
            this.f21908d = 1;
            obj = N.d(aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        List list = (List) obj;
        L80.a.a("InstalledBanksAppsInteractor", "Найдено " + list.size() + " банковских приложений: " + list);
        return obj;
    }
}
