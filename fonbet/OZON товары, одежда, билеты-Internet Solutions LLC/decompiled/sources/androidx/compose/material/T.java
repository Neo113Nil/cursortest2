package androidx.compose.material;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", l = {127}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class T extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39947d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C5210h<Boolean> f39948e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f39949f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f39950g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f39951h;

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5210h<Boolean> f39952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5210h<Boolean> c5210h) {
            super(0);
            this.f39952b = c5210h;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.f39952b.p();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f39953d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f39954e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f39955f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f39956g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, InterfaceC3978p0 interfaceC3978p03, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f39954e = interfaceC3978p0;
            this.f39955f = interfaceC3978p02;
            this.f39956g = interfaceC3978p03;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f39954e, this.f39955f, this.f39956g, dVar);
            bVar.f39953d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((b) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            boolean z11 = this.f39953d;
            int i11 = e0.f40029m;
            if (((Boolean) this.f39954e.getValue()).booleanValue() != z11) {
                Function1 function1 = (Function1) this.f39955f.getValue();
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z11));
                }
                this.f39956g.setValue(Boolean.valueOf(!r2.getValue().booleanValue()));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T(C5210h c5210h, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, InterfaceC3978p0 interfaceC3978p03, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f39948e = c5210h;
        this.f39949f = interfaceC3978p0;
        this.f39950g = interfaceC3978p02;
        this.f39951h = interfaceC3978p03;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        InterfaceC3978p0 interfaceC3978p0 = this.f39950g;
        return new T(this.f39948e, this.f39949f, interfaceC3978p0, this.f39951h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((T) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39947d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h m11 = n1.m(new a(this.f39948e));
            b bVar = new b(this.f39949f, this.f39950g, this.f39951h, null);
            this.f39947d = 1;
            if (C2399j.h(m11, bVar, this) == aVar) {
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
