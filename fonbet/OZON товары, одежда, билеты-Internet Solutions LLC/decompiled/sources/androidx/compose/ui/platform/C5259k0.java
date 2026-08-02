package androidx.compose.ui.platform;

import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {185}, m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5259k0 extends kotlin.coroutines.jvm.internal.j implements Function2<C5230a1, kotlin.coroutines.d<?>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40900d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f40901e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5262l0 f40902f;

    /* renamed from: androidx.compose.ui.platform.k0$a */
    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5230a1 f40903b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5262l0 f40904c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5230a1 c5230a1, C5262l0 c5262l0) {
            super(1);
            this.f40903b = c5230a1;
            this.f40904c = c5262l0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Q1.M m11;
            this.f40903b.d();
            m11 = this.f40904c.f40907b;
            m11.f();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5259k0(C5262l0 c5262l0, kotlin.coroutines.d<? super C5259k0> dVar) {
        super(2, dVar);
        this.f40902f = c5262l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C5259k0 c5259k0 = new C5259k0(this.f40902f, dVar);
        c5259k0.f40901e = obj;
        return c5259k0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C5230a1 c5230a1, kotlin.coroutines.d<?> dVar) {
        return ((C5259k0) create(c5230a1, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Q1.M m11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40900d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C5230a1 c5230a1 = (C5230a1) this.f40901e;
            this.f40901e = c5230a1;
            C5262l0 c5262l0 = this.f40902f;
            this.f40900d = 1;
            C10737n c10737n = new C10737n(1, Wc.b.b(this));
            c10737n.o();
            m11 = c5262l0.f40907b;
            m11.e();
            c10737n.q(new a(c5230a1, c5262l0));
            Object n11 = c10737n.n();
            if (n11 == aVar) {
                Intrinsics.checkNotNullParameter(this, "frame");
            }
            if (n11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
