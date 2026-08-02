package androidx.compose.material3.internal;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.O;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {715}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40230d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f40231e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f40232f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f40233g;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<B0> f40234a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f40235b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f40236c;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {722}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.internal.d$a$a, reason: collision with other inner class name */
        static final class C0742a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f40237d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f40238e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f40239f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ M f40240g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0742a(Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Object obj, M m11, kotlin.coroutines.d<? super C0742a> dVar) {
                super(2, dVar);
                this.f40238e = (kotlin.coroutines.jvm.internal.j) function2;
                this.f40239f = obj;
                this.f40240g = m11;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0742a(this.f40238e, this.f40239f, this.f40240g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0742a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f40237d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f40237d = 1;
                    if (this.f40238e.invoke(this.f40239f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                N.c(this.f40240g, new androidx.compose.material3.internal.a());
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {718}, m = "emit")
        static final class b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f40241d;

            /* renamed from: e, reason: collision with root package name */
            Object f40242e;

            /* renamed from: f, reason: collision with root package name */
            B0 f40243f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f40244g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<T> f40245h;

            /* renamed from: i, reason: collision with root package name */
            int f40246i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.f40245h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f40244g = obj;
                this.f40246i |= LinearLayoutManager.INVALID_OFFSET;
                return this.f40245h.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.jvm.internal.M<B0> m11, M m12, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
            this.f40234a = m11;
            this.f40235b = m12;
            this.f40236c = (kotlin.coroutines.jvm.internal.j) function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            b bVar;
            int i11;
            a<T> aVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i12 = bVar.f40246i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f40246i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = bVar.f40244g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f40246i;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        B0 b02 = this.f40234a.f71787a;
                        if (b02 != null) {
                            b02.j(new androidx.compose.material3.internal.a());
                            bVar.f40241d = this;
                            bVar.f40242e = obj;
                            bVar.f40243f = b02;
                            bVar.f40246i = 1;
                            if (b02.r0(bVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        aVar = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = bVar.f40242e;
                        aVar = (a) bVar.f40241d;
                        Sc.s.b(obj2);
                    }
                    kotlin.jvm.internal.M<B0> m11 = aVar.f40234a;
                    O o11 = O.UNDISPATCHED;
                    ?? r42 = aVar.f40236c;
                    M m12 = aVar.f40235b;
                    m11.f71787a = (T) C10727i.c(m12, null, o11, new C0742a(r42, obj, m12, null), 1);
                    return Unit.f71690a;
                }
            }
            bVar = new b(this, dVar);
            Object obj22 = bVar.f40244g;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = bVar.f40246i;
            if (i11 != 0) {
            }
            kotlin.jvm.internal.M<B0> m112 = aVar.f40234a;
            O o112 = O.UNDISPATCHED;
            ?? r422 = aVar.f40236c;
            M m122 = aVar.f40235b;
            m112.f71787a = (T) C10727i.c(m122, null, o112, new C0742a(r422, obj, m122, null), 1);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Function0<Object> function0, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f40232f = (AbstractC7737t) function0;
        this.f40233g = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f40232f, this.f40233g, dVar);
        dVar2.f40231e = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40230d;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f40231e;
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            InterfaceC2395h m13 = n1.m(this.f40232f);
            a aVar2 = new a(m12, m11, this.f40233g);
            this.f40230d = 1;
            if (((AbstractC2381a) m13).collect(aVar2, this) == aVar) {
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
