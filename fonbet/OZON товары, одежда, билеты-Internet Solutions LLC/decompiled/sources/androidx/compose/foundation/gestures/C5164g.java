package androidx.compose.foundation.gestures;

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
import r0.C9121a;
import xe.B0;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1114}, m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5164g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39137d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f39138e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f39139f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f39140g;

    /* renamed from: androidx.compose.foundation.gestures.g$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<B0> f39141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ xe.M f39142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f39143c;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1120}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.g$a$a, reason: collision with other inner class name */
        static final class C0725a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f39144d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f39145e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object f39146f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ xe.M f39147g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0725a(Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Object obj, xe.M m11, kotlin.coroutines.d<? super C0725a> dVar) {
                super(2, dVar);
                this.f39145e = (kotlin.coroutines.jvm.internal.j) function2;
                this.f39146f = obj;
                this.f39147g = m11;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0725a(this.f39145e, this.f39146f, this.f39147g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0725a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f39144d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f39144d = 1;
                    if (this.f39145e.invoke(this.f39146f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                xe.N.c(this.f39147g, new C9121a());
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {1117}, m = "emit")
        /* renamed from: androidx.compose.foundation.gestures.g$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f39148d;

            /* renamed from: e, reason: collision with root package name */
            Object f39149e;

            /* renamed from: f, reason: collision with root package name */
            B0 f39150f;

            /* renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f39151g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<T> f39152h;

            /* renamed from: i, reason: collision with root package name */
            int f39153i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(a<? super T> aVar, kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
                this.f39152h = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39151g = obj;
                this.f39153i |= LinearLayoutManager.INVALID_OFFSET;
                return this.f39152h.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.jvm.internal.M<B0> m11, xe.M m12, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
            this.f39141a = m11;
            this.f39142b = m12;
            this.f39143c = (kotlin.coroutines.jvm.internal.j) function2;
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
                int i12 = bVar.f39153i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f39153i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = bVar.f39151g;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = bVar.f39153i;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        B0 b02 = this.f39141a.f71787a;
                        if (b02 != null) {
                            b02.j(new C9121a());
                            bVar.f39148d = this;
                            bVar.f39149e = obj;
                            bVar.f39150f = b02;
                            bVar.f39153i = 1;
                            if (b02.r0(bVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        aVar = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = bVar.f39149e;
                        aVar = (a) bVar.f39148d;
                        Sc.s.b(obj2);
                    }
                    kotlin.jvm.internal.M<B0> m11 = aVar.f39141a;
                    xe.O o11 = xe.O.UNDISPATCHED;
                    ?? r42 = aVar.f39143c;
                    xe.M m12 = aVar.f39142b;
                    m11.f71787a = (T) C10727i.c(m12, null, o11, new C0725a(r42, obj, m12, null), 1);
                    return Unit.f71690a;
                }
            }
            bVar = new b(this, dVar);
            Object obj22 = bVar.f39151g;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = bVar.f39153i;
            if (i11 != 0) {
            }
            kotlin.jvm.internal.M<B0> m112 = aVar.f39141a;
            xe.O o112 = xe.O.UNDISPATCHED;
            ?? r422 = aVar.f39143c;
            xe.M m122 = aVar.f39142b;
            m112.f71787a = (T) C10727i.c(m122, null, o112, new C0725a(r422, obj, m122, null), 1);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5164g(Function0<Object> function0, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C5164g> dVar) {
        super(2, dVar);
        this.f39139f = (AbstractC7737t) function0;
        this.f39140g = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5164g c5164g = new C5164g(this.f39139f, this.f39140g, dVar);
        c5164g.f39138e = obj;
        return c5164g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5164g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39137d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f39138e;
            kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
            InterfaceC2395h m13 = n1.m(this.f39139f);
            a aVar2 = new a(m12, m11, this.f39140g);
            this.f39137d = 1;
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
