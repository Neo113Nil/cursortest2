package androidx.compose.material3.internal;

import Q0.InterfaceC3829a;
import Q0.InterfaceC3831c;
import androidx.compose.material3.internal.l;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {521}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40251d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p<Object> f40252e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<InterfaceC3829a, InterfaceC3831c<Object>, kotlin.coroutines.d<? super Unit>, Object> f40253f;

    static final class a extends AbstractC7737t implements Function0<InterfaceC3831c<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<Object> f40254b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<Object> pVar) {
            super(0);
            this.f40254b = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC3831c<Object> invoke() {
            return this.f40254b.l();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {522}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC3831c<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40255d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40256e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6511n<InterfaceC3829a, InterfaceC3831c<Object>, kotlin.coroutines.d<? super Unit>, Object> f40257f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<Object> f40258g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p pVar, InterfaceC6511n interfaceC6511n, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f40257f = interfaceC6511n;
            this.f40258g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f40258g, this.f40257f, dVar);
            bVar.f40256e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC3831c<Object> interfaceC3831c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(interfaceC3831c, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            j jVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40255d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC3831c<Object> interfaceC3831c = (InterfaceC3831c) this.f40256e;
                jVar = ((p) this.f40258g).f40298o;
                this.f40255d = 1;
                if (((l.a) this.f40257f).invoke(jVar, interfaceC3831c, this) == aVar) {
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
    g(p<Object> pVar, InterfaceC6511n<? super InterfaceC3829a, ? super InterfaceC3831c<Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, kotlin.coroutines.d<? super g> dVar) {
        super(1, dVar);
        this.f40252e = pVar;
        this.f40253f = interfaceC6511n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new g(this.f40252e, this.f40253f, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40251d;
        if (i11 == 0) {
            Sc.s.b(obj);
            p<Object> pVar = this.f40252e;
            a aVar2 = new a(pVar);
            b bVar = new b(pVar, this.f40253f, null);
            this.f40251d = 1;
            if (e.b(aVar2, bVar, this) == aVar) {
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
