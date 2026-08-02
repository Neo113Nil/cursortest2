package F0;

import Ae.AbstractC2381a;
import Ae.C2399j;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class y extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f8366d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2990k f8367e;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$1", f = "TextFieldSelectionState.kt", l = {424}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8368d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2990k f8369e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2990k c2990k, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f8369e = c2990k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f8369e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8368d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f8368d = 1;
                C2990k c2990k = this.f8369e;
                c2990k.getClass();
                Object collect = new Ae.I(C2399j.p(n1.m(new z(c2990k)), A.f8167a)).collect(new B(c2990k), this);
                if (collect != aVar) {
                    collect = Unit.f71690a;
                }
                if (collect == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2$2", f = "TextFieldSelectionState.kt", l = {425}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8370d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2990k f8371e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2990k c2990k, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f8371e = c2990k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f8371e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8370d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f8370d = 1;
                C2990k c2990k = this.f8371e;
                c2990k.getClass();
                Object collect = ((AbstractC2381a) n1.m(new C(c2990k))).collect(new D(c2990k), this);
                if (collect != aVar) {
                    collect = Unit.f71690a;
                }
                if (collect == aVar) {
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
    y(C2990k c2990k, kotlin.coroutines.d<? super y> dVar) {
        super(2, dVar);
        this.f8367e = c2990k;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        y yVar = new y(this.f8367e, dVar);
        yVar.f8366d = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        xe.M m11 = (xe.M) this.f8366d;
        C2990k c2990k = this.f8367e;
        C10727i.c(m11, null, null, new a(c2990k, null), 3);
        return C10727i.c(m11, null, null, new b(c2990k, null), 3);
    }
}
