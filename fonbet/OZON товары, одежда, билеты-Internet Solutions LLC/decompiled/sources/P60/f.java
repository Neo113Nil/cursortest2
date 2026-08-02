package P60;

import Sc.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledAppsInteractorImpl$limitedParallelMap$2", f = "InstalledAppsInteractorImpl.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f21887d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f21888e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<Object> f21889f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ He.c f21890g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f21891h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledAppsInteractorImpl$limitedParallelMap$2$1$1", f = "InstalledAppsInteractorImpl.kt", l = {131, 100}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f21892d;

        /* renamed from: e, reason: collision with root package name */
        Object f21893e;

        /* renamed from: f, reason: collision with root package name */
        Object f21894f;

        /* renamed from: g, reason: collision with root package name */
        int f21895g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f21896h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Je.f f21897i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f21898j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f21899k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Je.f fVar, Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, Object obj, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21897i = fVar;
            this.f21898j = function2;
            this.f21899k = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f21897i, this.f21898j, this.f21899k, dVar);
            aVar.f21896h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(8:5|6|7|8|9|(1:11)|12|13)(2:23|24))(1:25))(3:34|(1:36)|29)|26|27|(6:30|8|9|(0)|12|13)|29|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
        
            r0 = r9;
            r9 = r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
        /* JADX WARN: Type inference failed for: r0v11, types: [Je.f] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [Je.f] */
        /* JADX WARN: Type inference failed for: r0v7, types: [Je.f] */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Function2<Object, kotlin.coroutines.d<Object>, Object> function2;
            Object obj3;
            ?? r02;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f21895g;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f21896h = (M) this.f21896h;
                obj2 = this.f21897i;
                this.f21892d = obj2;
                Function2<Object, kotlin.coroutines.d<Object>, Object> function22 = this.f21898j;
                this.f21893e = function22;
                Object obj4 = this.f21899k;
                this.f21894f = obj4;
                this.f21895g = 1;
                if (((Je.h) obj2).d(this) != aVar) {
                    function2 = function22;
                    obj3 = obj4;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r02 = (Je.f) this.f21896h;
                try {
                    Sc.s.b(obj);
                    r02 = r02;
                    r.Companion companion = Sc.r.INSTANCE;
                    r02 = r02;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    try {
                        r.Companion companion2 = Sc.r.INSTANCE;
                        obj = Sc.s.a(th3);
                        r02 = r02;
                        return obj instanceof r.b ? null : obj;
                    } finally {
                        r02.release();
                    }
                }
                return obj instanceof r.b ? null : obj;
            }
            obj3 = this.f21894f;
            function2 = (Function2) this.f21893e;
            Je.f fVar = (Je.f) this.f21892d;
            Sc.s.b(obj);
            obj2 = fVar;
            r.Companion companion3 = Sc.r.INSTANCE;
            this.f21896h = obj2;
            this.f21892d = null;
            this.f21893e = null;
            this.f21894f = null;
            this.f21895g = 2;
            Object invoke = function2.invoke(obj3, this);
            if (invoke != aVar) {
                r02 = obj2;
                obj = invoke;
                r.Companion companion4 = Sc.r.INSTANCE;
                r02 = r02;
                return obj instanceof r.b ? null : obj;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(List list, He.c cVar, Function2 function2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f21889f = list;
        this.f21890g = cVar;
        this.f21891h = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        f fVar = new f(this.f21889f, this.f21890g, this.f21891h, dVar);
        fVar.f21888e = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super List<Object>> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f21887d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f21888e;
            Je.f a11 = Je.k.a(6);
            List<Object> list = this.f21889f;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C10727i.a(m11, this.f21890g, null, new a(a11, this.f21891h, it.next(), null), 2));
            }
            this.f21887d = 1;
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
        return C7714v.I((Iterable) obj);
    }
}
