package androidx.compose.material3.internal;

import Q0.InterfaceC3829a;
import Q0.InterfaceC3831c;
import fd.InterfaceC6512o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {569}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40263d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p<Object> f40264e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f40265f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC6512o<InterfaceC3829a, InterfaceC3831c<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> f40266g;

    static final class a extends AbstractC7737t implements Function0<Pair<? extends InterfaceC3831c<Object>, Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<Object> f40267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<Object> pVar) {
            super(0);
            this.f40267b = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends InterfaceC3831c<Object>, Object> invoke() {
            p<Object> pVar = this.f40267b;
            return new Pair<>(pVar.l(), pVar.t());
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {571}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Pair<? extends InterfaceC3831c<Object>, Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40268d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40269e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6512o<InterfaceC3829a, InterfaceC3831c<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> f40270f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<Object> f40271g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC6512o<? super InterfaceC3829a, ? super InterfaceC3831c<Object>, Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, p<Object> pVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40270f = interfaceC6512o;
            this.f40271g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f40270f, this.f40271g, dVar);
            bVar.f40269e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends InterfaceC3831c<Object>, Object> pair, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(pair, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            j jVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40268d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Pair pair = (Pair) this.f40269e;
                InterfaceC3831c<Object> interfaceC3831c = (InterfaceC3831c) pair.a();
                Object b11 = pair.b();
                jVar = ((p) this.f40271g).f40298o;
                this.f40268d = 1;
                if (((androidx.compose.material3.internal.b) this.f40270f).invoke(jVar, interfaceC3831c, b11, this) == aVar) {
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
    i(p<Object> pVar, Object obj, InterfaceC6512o<? super InterfaceC3829a, ? super InterfaceC3831c<Object>, Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6512o, kotlin.coroutines.d<? super i> dVar) {
        super(1, dVar);
        this.f40264e = pVar;
        this.f40265f = obj;
        this.f40266g = interfaceC6512o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new i(this.f40264e, this.f40265f, this.f40266g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40263d;
        if (i11 == 0) {
            Sc.s.b(obj);
            p<Object> pVar = this.f40264e;
            p.e(pVar, this.f40265f);
            a aVar2 = new a(pVar);
            b bVar = new b(this.f40266g, pVar, null);
            this.f40263d = 1;
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
