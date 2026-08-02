package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C5165h;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9122b;
import r0.InterfaceC9133m;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {835}, m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5166i extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39168d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5167j<Object> f39169e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC9122b, InterfaceC9133m<Object>, kotlin.coroutines.d<? super Unit>, Object> f39170f;

    /* renamed from: androidx.compose.foundation.gestures.i$a */
    static final class a extends AbstractC7737t implements Function0<InterfaceC9133m<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5167j<Object> f39171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5167j<Object> c5167j) {
            super(0);
            this.f39171b = c5167j;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC9133m<Object> invoke() {
            return this.f39171b.j();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {836}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.i$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9133m<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39172d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f39173e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<InterfaceC9122b, InterfaceC9133m<Object>, kotlin.coroutines.d<? super Unit>, Object> f39174f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5167j<Object> f39175g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5167j c5167j, InterfaceC6511n interfaceC6511n, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f39174f = interfaceC6511n;
            this.f39175g = c5167j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f39175g, this.f39174f, dVar);
            bVar.f39173e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC9133m<Object> interfaceC9133m, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(interfaceC9133m, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39172d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC9133m interfaceC9133m = (InterfaceC9133m) this.f39173e;
                C5168k c5168k = ((C5167j) this.f39175g).f39190o;
                this.f39172d = 1;
                if (((C5165h.a) this.f39174f).invoke(c5168k, interfaceC9133m, this) == aVar) {
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
    C5166i(C5167j<Object> c5167j, InterfaceC6511n<? super InterfaceC9122b, ? super InterfaceC9133m<Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, kotlin.coroutines.d<? super C5166i> dVar) {
        super(1, dVar);
        this.f39169e = c5167j;
        this.f39170f = interfaceC6511n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C5166i(this.f39169e, this.f39170f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C5166i) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39168d;
        C5167j<Object> c5167j = this.f39169e;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(c5167j);
            b bVar = new b(c5167j, this.f39170f, null);
            this.f39168d = 1;
            if (C5158a.d(aVar2, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        Object b11 = c5167j.j().b(c5167j.o());
        if (b11 != null) {
            if (Math.abs(c5167j.o() - c5167j.j().e(b11)) < 0.5f && c5167j.k().invoke(b11).booleanValue()) {
                C5167j.g(c5167j, b11);
                C5167j.c(c5167j, b11);
            }
        }
        return Unit.f71690a;
    }
}
