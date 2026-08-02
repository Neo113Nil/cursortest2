package androidx.lifecycle;

import De.C2862e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5411d<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5423j<T> f43263a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.jvm.internal.j f43264b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f43265c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f43266d;

    /* renamed from: e, reason: collision with root package name */
    private xe.B0 f43267e;

    /* renamed from: f, reason: collision with root package name */
    private xe.B0 f43268f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f43269d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5411d<T> f43270e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5411d<T> c5411d, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f43270e = c5411d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f43270e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f43269d;
            C5411d<T> c5411d = this.f43270e;
            if (i11 == 0) {
                Sc.s.b(obj);
                c5411d.getClass();
                this.f43269d = 1;
                if (xe.Y.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            if (!((C5411d) c5411d).f43263a.hasActiveObservers()) {
                xe.B0 b02 = ((C5411d) c5411d).f43267e;
                if (b02 != null) {
                    b02.j(null);
                }
                ((C5411d) c5411d).f43267e = null;
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.d$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f43271d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f43272e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5411d<T> f43273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5411d<T> c5411d, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f43273f = c5411d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f43273f, dVar);
            bVar.f43272e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f43271d;
            C5411d<T> c5411d = this.f43273f;
            if (i11 == 0) {
                Sc.s.b(obj);
                S s11 = new S(((C5411d) c5411d).f43263a, ((xe.M) this.f43272e).getCoroutineContext());
                Function2 function2 = ((C5411d) c5411d).f43264b;
                this.f43271d = 1;
                if (function2.invoke(s11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            ((C5411d) c5411d).f43266d.invoke();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5411d(@NotNull C5423j liveData, @NotNull Function2 block, @NotNull C2862e scope, @NotNull Function0 onDone) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.f43263a = liveData;
        this.f43264b = (kotlin.coroutines.jvm.internal.j) block;
        this.f43265c = scope;
        this.f43266d = onDone;
    }

    public final void f() {
        if (this.f43268f != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f43268f = C10727i.c(this.f43265c, De.s.f6650a.x(), null, new a(this, null), 2);
    }

    public final void g() {
        xe.B0 b02 = this.f43268f;
        if (b02 != null) {
            ((xe.H0) b02).j(null);
        }
        this.f43268f = null;
        if (this.f43267e != null) {
            return;
        }
        this.f43267e = C10727i.c(this.f43265c, null, null, new b(this, null), 3);
    }
}
