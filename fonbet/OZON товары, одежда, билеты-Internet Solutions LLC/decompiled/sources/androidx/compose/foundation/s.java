package androidx.compose.foundation;

import D1.C0;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;
import x1.EnumC10640o;
import xe.C10727i;
import xe.M;

/* loaded from: classes8.dex */
final class s extends e.c implements C0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private t0.q f39743a;

    /* renamed from: b, reason: collision with root package name */
    private t0.j f39744b;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {94}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39745d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return s.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39745d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f39745d = 1;
                if (s.I1(s.this, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {95}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39747d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return s.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39747d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f39747d = 1;
                if (s.J1(s.this, this) == aVar) {
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

    public s(@NotNull t0.q qVar) {
        this.f39743a = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I1(s sVar, kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        int i11;
        t0.j jVar;
        sVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f39728h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f39728h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = qVar.f39726f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = qVar.f39728h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (sVar.f39744b == null) {
                        jVar = new t0.j();
                        t0.q qVar2 = sVar.f39743a;
                        qVar.f39724d = sVar;
                        qVar.f39725e = jVar;
                        qVar.f39728h = 1;
                        if (qVar2.emit(jVar, qVar) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t0.j jVar2 = qVar.f39725e;
                s sVar2 = (s) qVar.f39724d;
                Sc.s.b(obj);
                jVar = jVar2;
                sVar = sVar2;
                sVar.f39744b = jVar;
                return Unit.f71690a;
            }
        }
        qVar = new q(sVar, cVar);
        Object obj2 = qVar.f39726f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar.f39728h;
        if (i11 != 0) {
        }
        sVar.f39744b = jVar;
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J1(s sVar, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        sVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f39732g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f39732g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f39730e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f39732g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    t0.j jVar = sVar.f39744b;
                    if (jVar != null) {
                        t0.k kVar = new t0.k(jVar);
                        t0.q qVar = sVar.f39743a;
                        rVar.f39729d = sVar;
                        rVar.f39732g = 1;
                        if (qVar.emit(kVar, rVar) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) rVar.f39729d;
                Sc.s.b(obj);
                sVar.f39744b = null;
                return Unit.f71690a;
            }
        }
        rVar = new r(sVar, cVar);
        Object obj2 = rVar.f39730e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f39732g;
        if (i11 != 0) {
        }
        sVar.f39744b = null;
        return Unit.f71690a;
    }

    private final void K1() {
        t0.j jVar = this.f39744b;
        if (jVar != null) {
            this.f39743a.tryEmit(new t0.k(jVar));
            this.f39744b = null;
        }
    }

    public final void L1(@NotNull t0.q qVar) {
        if (Intrinsics.d(this.f39743a, qVar)) {
            return;
        }
        K1();
        this.f39743a = qVar;
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        K1();
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        if (enumC10640o == EnumC10640o.Main) {
            int e11 = c10638m.e();
            if (e11 == 4) {
                C10727i.c(getCoroutineScope(), null, null, new a(null), 3);
            } else if (e11 == 5) {
                C10727i.c(getCoroutineScope(), null, null, new b(null), 3);
            }
        }
    }

    @Override // D1.C0
    public final void r0() {
        K1();
    }
}
