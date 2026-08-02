package androidx.compose.material;

import J0.InterfaceC3268b;
import androidx.compose.material.C5213k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {540}, m = "invokeSuspend")
/* renamed from: androidx.compose.material.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5209g extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40034d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40035e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC3268b, J0.M<Object>, kotlin.coroutines.d<? super Unit>, Object> f40036f;

    /* renamed from: androidx.compose.material.g$a */
    static final class a extends AbstractC7737t implements Function0<J0.M<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5210h<Object> f40037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5210h<Object> c5210h) {
            super(0);
            this.f40037b = c5210h;
        }

        @Override // kotlin.jvm.functions.Function0
        public final J0.M<Object> invoke() {
            return this.f40037b.l();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {541}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.g$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<J0.M<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40038d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40039e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<InterfaceC3268b, J0.M<Object>, kotlin.coroutines.d<? super Unit>, Object> f40040f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5210h<Object> f40041g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5210h c5210h, InterfaceC6511n interfaceC6511n, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f40040f = interfaceC6511n;
            this.f40041g = c5210h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f40041g, this.f40040f, dVar);
            bVar.f40039e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J0.M<Object> m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40038d;
            if (i11 == 0) {
                Sc.s.b(obj);
                J0.M<Object> m11 = (J0.M) this.f40039e;
                C5211i c5211i = ((C5210h) this.f40041g).f40056o;
                this.f40038d = 1;
                if (((C5213k.a) this.f40040f).invoke(c5211i, m11, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C5209g(C5210h<Object> c5210h, InterfaceC6511n<? super InterfaceC3268b, ? super J0.M<Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, kotlin.coroutines.d<? super C5209g> dVar) {
        super(1, dVar);
        this.f40035e = c5210h;
        this.f40036f = interfaceC6511n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C5209g(this.f40035e, this.f40036f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5209g) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40034d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C5210h<Object> c5210h = this.f40035e;
            a aVar2 = new a(c5210h);
            b bVar = new b(c5210h, this.f40036f, null);
            this.f40034d = 1;
            if (C5204b.b(aVar2, bVar, this) == aVar) {
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
