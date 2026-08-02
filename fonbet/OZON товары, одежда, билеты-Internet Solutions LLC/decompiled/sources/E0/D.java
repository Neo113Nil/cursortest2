package E0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import S0.n1;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6953d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E f6954e;

    static final class a extends AbstractC7737t implements Function0<CursorAnchorInfo> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f6955b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E e11) {
            super(0);
            this.f6955b = e11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CursorAnchorInfo invoke() {
            CursorAnchorInfo c11;
            c11 = this.f6955b.c();
            return c11;
        }
    }

    static final class b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f6956a;

        b(E e11) {
            this.f6956a = e11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            InterfaceC2945s interfaceC2945s;
            interfaceC2945s = this.f6956a.f6974c;
            interfaceC2945s.d((CursorAnchorInfo) obj);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(E e11, kotlin.coroutines.d<? super D> dVar) {
        super(2, dVar);
        this.f6954e = e11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new D(this.f6954e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((D) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6953d;
        if (i11 == 0) {
            Sc.s.b(obj);
            E e11 = this.f6954e;
            C2406m0 c2406m0 = new C2406m0(new Ae.I(n1.m(new a(e11))));
            b bVar = new b(e11);
            this.f6953d = 1;
            if (c2406m0.collect(bVar, this) == aVar) {
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
