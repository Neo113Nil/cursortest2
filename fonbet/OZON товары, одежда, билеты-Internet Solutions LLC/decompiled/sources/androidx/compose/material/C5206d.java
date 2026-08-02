package androidx.compose.material;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import J0.C3263a;
import S0.n1;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {740}, m = "invokeSuspend")
/* renamed from: androidx.compose.material.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5206d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39993d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f39994e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39995f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f39996g;

    /* renamed from: androidx.compose.material.d$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<B0> f39997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f39998b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f39999c;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {746}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.d$a$a, reason: collision with other inner class name */
        static final class C0739a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f40000d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f40001e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f40002f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ xe.M f40003g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0739a(Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Object obj, xe.M m11, kotlin.coroutines.d<? super C0739a> dVar) {
                super(2, dVar);
                this.f40001e = (kotlin.coroutines.jvm.internal.j) function2;
                this.f40002f = obj;
                this.f40003g = m11;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0739a(this.f40001e, this.f40002f, this.f40003g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0739a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f40000d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f40000d = 1;
                    if (this.f40001e.invoke(this.f40002f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                xe.N.c(this.f40003g, new C3263a());
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {743}, m = "emit")
        /* renamed from: androidx.compose.material.d$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f40004d;

            /* renamed from: e, reason: collision with root package name */
            Object f40005e;

            /* renamed from: f, reason: collision with root package name */
            B0 f40006f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f40007g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<T> f40008h;

            /* renamed from: i, reason: collision with root package name */
            int f40009i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.f40008h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f40007g = obj;
                this.f40009i |= LinearLayoutManager.INVALID_OFFSET;
                return this.f40008h.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.jvm.internal.M<B0> m11, xe.M m12, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
            this.f39997a = m11;
            this.f39998b = m12;
            this.f39999c = (kotlin.coroutines.jvm.internal.j) function2;
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
                int i12 = bVar.f40009i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f40009i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = bVar.f40007g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f40009i;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        B0 b02 = this.f39997a.f71787a;
                        if (b02 != null) {
                            b02.j(new C3263a());
                            bVar.f40004d = this;
                            bVar.f40005e = obj;
                            bVar.f40006f = b02;
                            bVar.f40009i = 1;
                            if (b02.r0(bVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        aVar = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = bVar.f40005e;
                        aVar = (a) bVar.f40004d;
                        Sc.s.b(obj2);
                    }
                    kotlin.jvm.internal.M<B0> m11 = aVar.f39997a;
                    xe.O o11 = xe.O.UNDISPATCHED;
                    ?? r42 = aVar.f39999c;
                    xe.M m12 = aVar.f39998b;
                    m11.f71787a = (T) C10727i.c(m12, null, o11, new C0739a(r42, obj, m12, null), 1);
                    return Unit.f71690a;
                }
            }
            bVar = new b(this, dVar);
            Object obj22 = bVar.f40007g;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = bVar.f40009i;
            if (i11 != 0) {
            }
            kotlin.jvm.internal.M<B0> m112 = aVar.f39997a;
            xe.O o112 = xe.O.UNDISPATCHED;
            ?? r422 = aVar.f39999c;
            xe.M m122 = aVar.f39998b;
            m112.f71787a = (T) C10727i.c(m122, null, o112, new C0739a(r422, obj, m122, null), 1);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5206d(Function0<Object> function0, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C5206d> dVar) {
        super(2, dVar);
        this.f39995f = (AbstractC7737t) function0;
        this.f39996g = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5206d c5206d = new C5206d(this.f39995f, this.f39996g, dVar);
        c5206d.f39994e = obj;
        return c5206d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5206d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39993d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f39994e;
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            InterfaceC2395h m13 = n1.m(this.f39995f);
            a aVar2 = new a(m12, m11, this.f39996g);
            this.f39993d = 1;
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
