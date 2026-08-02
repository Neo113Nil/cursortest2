package R2;

import Je.InterfaceC3394a;
import R2.C3922p;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
/* renamed from: R2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3921o extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super C3911e<Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f24398d;

    /* renamed from: e, reason: collision with root package name */
    Serializable f24399e;

    /* renamed from: f, reason: collision with root package name */
    Object f24400f;

    /* renamed from: g, reason: collision with root package name */
    Object f24401g;

    /* renamed from: h, reason: collision with root package name */
    Iterator f24402h;

    /* renamed from: i, reason: collision with root package name */
    int f24403i;

    /* renamed from: j, reason: collision with root package name */
    int f24404j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24405k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C3922p<Object>.a f24406l;

    /* renamed from: R2.o$a */
    public static final class a implements T<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3394a f24407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.I f24408b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Object> f24409c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3922p<Object> f24410d;

        a(InterfaceC3394a interfaceC3394a, kotlin.jvm.internal.I i11, kotlin.jvm.internal.M<Object> m11, C3922p<Object> c3922p) {
            this.f24407a = interfaceC3394a;
            this.f24408b = i11;
            this.f24409c = m11;
            this.f24410d = c3922p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ac, B:30:0x00b4), top: B:26:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d5, B:46:0x00dc), top: B:39:0x0090 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d5, B:46:0x00dc), top: B:39:0x0090 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // R2.T
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(@NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
            C3920n c3920n;
            int i11;
            InterfaceC3394a interfaceC3394a;
            C3922p<Object> c3922p;
            kotlin.jvm.internal.I i12;
            kotlin.jvm.internal.M<Object> m11;
            InterfaceC3394a interfaceC3394a2;
            InterfaceC3394a interfaceC3394a3;
            C3922p<Object> c3922p2;
            T t2;
            kotlin.jvm.internal.M<Object> m12;
            try {
                if (cVar instanceof C3920n) {
                    c3920n = (C3920n) cVar;
                    int i13 = c3920n.f24395k;
                    if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c3920n.f24395k = i13 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c3920n.f24393i;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c3920n.f24395k;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            c3920n.f24388d = function2;
                            interfaceC3394a = this.f24407a;
                            c3920n.f24389e = interfaceC3394a;
                            kotlin.jvm.internal.I i14 = this.f24408b;
                            c3920n.f24390f = i14;
                            kotlin.jvm.internal.M<Object> m13 = this.f24409c;
                            c3920n.f24391g = m13;
                            c3922p = this.f24410d;
                            c3920n.f24392h = c3922p;
                            c3920n.f24395k = 1;
                            if (interfaceC3394a.a(c3920n) != aVar) {
                                i12 = i14;
                                m11 = m13;
                            }
                            return aVar;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Object obj2 = c3920n.f24390f;
                                m12 = (kotlin.jvm.internal.M) c3920n.f24389e;
                                interfaceC3394a2 = (InterfaceC3394a) c3920n.f24388d;
                                try {
                                    Sc.s.b(obj);
                                    t2 = obj2;
                                    m12.f71787a = t2;
                                    m11 = m12;
                                    Object obj3 = m11.f71787a;
                                    interfaceC3394a2.c(null);
                                    return obj3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC3394a2.c(null);
                                    throw th;
                                }
                            }
                            c3922p2 = (C3922p) c3920n.f24390f;
                            m11 = (kotlin.jvm.internal.M) c3920n.f24389e;
                            interfaceC3394a3 = (InterfaceC3394a) c3920n.f24388d;
                            try {
                                Sc.s.b(obj);
                                if (!Intrinsics.d(obj, m11.f71787a)) {
                                    interfaceC3394a2 = interfaceC3394a3;
                                    Object obj32 = m11.f71787a;
                                    interfaceC3394a2.c(null);
                                    return obj32;
                                }
                                c3920n.f24388d = interfaceC3394a3;
                                c3920n.f24389e = m11;
                                c3920n.f24390f = obj;
                                c3920n.f24395k = 3;
                                if (c3922p2.s(obj, false, c3920n) != aVar) {
                                    t2 = obj;
                                    m12 = m11;
                                    interfaceC3394a2 = interfaceC3394a3;
                                    m12.f71787a = t2;
                                    m11 = m12;
                                    Object obj322 = m11.f71787a;
                                    interfaceC3394a2.c(null);
                                    return obj322;
                                }
                                return aVar;
                            } catch (Throwable th3) {
                                th = th3;
                                interfaceC3394a2 = interfaceC3394a3;
                                interfaceC3394a2.c(null);
                                throw th;
                            }
                        }
                        C3922p<Object> c3922p3 = c3920n.f24392h;
                        m11 = c3920n.f24391g;
                        i12 = (kotlin.jvm.internal.I) c3920n.f24390f;
                        InterfaceC3394a interfaceC3394a4 = (InterfaceC3394a) c3920n.f24389e;
                        Function2 function22 = (Function2) c3920n.f24388d;
                        Sc.s.b(obj);
                        c3922p = c3922p3;
                        function2 = function22;
                        interfaceC3394a = interfaceC3394a4;
                        if (!i12.f71783a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj4 = m11.f71787a;
                        c3920n.f24388d = interfaceC3394a;
                        c3920n.f24389e = m11;
                        c3920n.f24390f = c3922p;
                        c3920n.f24391g = null;
                        c3920n.f24392h = null;
                        c3920n.f24395k = 2;
                        Object invoke = function2.invoke(obj4, c3920n);
                        if (invoke != aVar) {
                            interfaceC3394a3 = interfaceC3394a;
                            obj = invoke;
                            c3922p2 = c3922p;
                            if (!Intrinsics.d(obj, m11.f71787a)) {
                            }
                        }
                        return aVar;
                    }
                }
                if (!i12.f71783a) {
                }
            } catch (Throwable th4) {
                th = th4;
                interfaceC3394a2 = interfaceC3394a;
                interfaceC3394a2.c(null);
                throw th;
            }
            c3920n = new C3920n(this, cVar);
            Object obj5 = c3920n.f24393i;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c3920n.f24395k;
            if (i11 != 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3921o(C3922p<Object> c3922p, C3922p<Object>.a aVar, kotlin.coroutines.d<? super C3921o> dVar) {
        super(1, dVar);
        this.f24405k = c3922p;
        this.f24406l = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C3921o(this.f24405k, this.f24406l, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super C3911e<Object>> dVar) {
        return ((C3921o) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC3394a a11;
        kotlin.jvm.internal.I i11;
        kotlin.jvm.internal.M m11;
        kotlin.jvm.internal.M m12;
        List list;
        InterfaceC3394a interfaceC3394a;
        Iterator it;
        InterfaceC3394a interfaceC3394a2;
        kotlin.jvm.internal.I i12;
        kotlin.jvm.internal.M m13;
        a aVar;
        kotlin.jvm.internal.M m14;
        kotlin.jvm.internal.I i13;
        Object obj2;
        Integer version;
        int i14;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i15 = this.f24404j;
        C3922p<Object>.a aVar3 = this.f24406l;
        C3922p<Object> c3922p = this.f24405k;
        if (i15 == 0) {
            Sc.s.b(obj);
            a11 = Je.e.a();
            i11 = new kotlin.jvm.internal.I();
            m11 = new kotlin.jvm.internal.M();
            this.f24398d = a11;
            this.f24399e = i11;
            this.f24400f = m11;
            this.f24401g = m11;
            this.f24404j = 1;
            obj = C3922p.n(c3922p, true, this);
            if (obj != aVar2) {
                m12 = m11;
            }
            return aVar2;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = this.f24403i;
                    obj2 = this.f24398d;
                    Sc.s.b(obj);
                    return new C3911e(i14, ((Number) obj).intValue(), obj2);
                }
                interfaceC3394a = (InterfaceC3394a) this.f24400f;
                m14 = (kotlin.jvm.internal.M) this.f24399e;
                i13 = (kotlin.jvm.internal.I) this.f24398d;
                Sc.s.b(obj);
                try {
                    i13.f71783a = true;
                    Unit unit = Unit.f71690a;
                    interfaceC3394a.c(null);
                    obj2 = m14.f71787a;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    U p11 = c3922p.p();
                    this.f24398d = obj2;
                    this.f24399e = null;
                    this.f24400f = null;
                    this.f24403i = hashCode;
                    this.f24404j = 4;
                    version = p11.getVersion();
                    if (version != aVar2) {
                        i14 = hashCode;
                        obj = version;
                        return new C3911e(i14, ((Number) obj).intValue(), obj2);
                    }
                    return aVar2;
                } catch (Throwable th2) {
                    interfaceC3394a.c(null);
                    throw th2;
                }
            }
            it = this.f24402h;
            aVar = (a) this.f24401g;
            m13 = (kotlin.jvm.internal.M) this.f24400f;
            i12 = (kotlin.jvm.internal.I) this.f24399e;
            interfaceC3394a2 = (InterfaceC3394a) this.f24398d;
            Sc.s.b(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.f24398d = interfaceC3394a2;
                this.f24399e = i12;
                this.f24400f = m13;
                this.f24401g = aVar;
                this.f24402h = it;
                this.f24404j = 2;
                if (function2.invoke(aVar, this) == aVar2) {
                    break;
                }
            }
            m12 = m13;
            i11 = i12;
            interfaceC3394a = interfaceC3394a2;
            ((C3922p.a) aVar3).f24423c = null;
            this.f24398d = i11;
            this.f24399e = m12;
            this.f24400f = interfaceC3394a;
            this.f24401g = null;
            this.f24402h = null;
            this.f24404j = 3;
            if (interfaceC3394a.a(this) != aVar2) {
                m14 = m12;
                i13 = i11;
                i13.f71783a = true;
                Unit unit2 = Unit.f71690a;
                interfaceC3394a.c(null);
                obj2 = m14.f71787a;
                if (obj2 == null) {
                }
                U p112 = c3922p.p();
                this.f24398d = obj2;
                this.f24399e = null;
                this.f24400f = null;
                this.f24403i = hashCode;
                this.f24404j = 4;
                version = p112.getVersion();
                if (version != aVar2) {
                }
            }
            return aVar2;
        }
        m11 = (kotlin.jvm.internal.M) this.f24401g;
        m12 = (kotlin.jvm.internal.M) this.f24400f;
        i11 = (kotlin.jvm.internal.I) this.f24399e;
        a11 = (InterfaceC3394a) this.f24398d;
        Sc.s.b(obj);
        m11.f71787a = ((C3911e) obj).c();
        a aVar4 = new a(a11, i11, m12, c3922p);
        list = ((C3922p.a) aVar3).f24423c;
        if (list == null) {
            interfaceC3394a = a11;
            ((C3922p.a) aVar3).f24423c = null;
            this.f24398d = i11;
            this.f24399e = m12;
            this.f24400f = interfaceC3394a;
            this.f24401g = null;
            this.f24402h = null;
            this.f24404j = 3;
            if (interfaceC3394a.a(this) != aVar2) {
            }
            return aVar2;
        }
        it = list.iterator();
        interfaceC3394a2 = a11;
        i12 = i11;
        m13 = m12;
        aVar = aVar4;
        while (it.hasNext()) {
        }
        m12 = m13;
        i11 = i12;
        interfaceC3394a = interfaceC3394a2;
        ((C3922p.a) aVar3).f24423c = null;
        this.f24398d = i11;
        this.f24399e = m12;
        this.f24400f = interfaceC3394a;
        this.f24401g = null;
        this.f24402h = null;
        this.f24404j = 3;
        if (interfaceC3394a.a(this) != aVar2) {
        }
        return aVar2;
    }
}
