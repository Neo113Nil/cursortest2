package R2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f24264d;

    /* renamed from: e, reason: collision with root package name */
    int f24265e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24266f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f24267g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f24268h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<Object>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24269d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Object, kotlin.coroutines.d<Object>, Object> f24270e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3911e<Object> f24271f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, C3911e<Object> c3911e, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f24270e = function2;
            this.f24271f = c3911e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f24270e, this.f24271f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<Object> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24269d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            Object c11 = this.f24271f.c();
            this.f24269d = 1;
            Object invoke = this.f24270e.invoke(c11, this);
            return invoke == aVar ? aVar : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    D(C3922p<Object> c3922p, CoroutineContext coroutineContext, Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, kotlin.coroutines.d<? super D> dVar) {
        super(1, dVar);
        this.f24266f = c3922p;
        this.f24267g = coroutineContext;
        this.f24268h = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new D(this.f24266f, this.f24267g, this.f24268h, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<Object> dVar) {
        return ((D) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r9 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r9 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        C3911e c3911e;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24265e;
        C3922p<Object> c3922p = this.f24266f;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f24265e = 1;
            obj = C3922p.n(c3922p, true, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f24264d;
                    Sc.s.b(obj);
                    return obj2;
                }
                c3911e = (C3911e) this.f24264d;
                Sc.s.b(obj);
                c3911e.b();
                if (!Intrinsics.d(c3911e.c(), obj)) {
                    this.f24264d = obj;
                    this.f24265e = 3;
                    if (c3922p.s(obj, true, this) == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
            Sc.s.b(obj);
        }
        c3911e = (C3911e) obj;
        a aVar2 = new a(this.f24268h, c3911e, null);
        this.f24264d = c3911e;
        this.f24265e = 2;
        obj = C10727i.f(this.f24267g, aVar2, this);
    }
}
