package R2;

import R2.C3922p;
import R2.V;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import ze.C11115c;
import ze.l;

/* loaded from: classes.dex */
public final class b0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xe.M f24337a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<T, kotlin.coroutines.d<? super Unit>, Object> f24338b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C11115c f24339c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3907a f24340d;

    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Unit> f24341b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0<T> f24342c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, Throwable, Unit> f24343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Throwable, Unit> function1, b0<T> b0Var, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f24341b = function1;
            this.f24342c = b0Var;
            this.f24343d = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Unit unit;
            Throwable th3 = th2;
            ((C3922p.f) this.f24341b).invoke(th3);
            b0<T> b0Var = this.f24342c;
            ((b0) b0Var).f24339c.l(th3);
            do {
                Object d11 = ze.l.d(((b0) b0Var).f24339c.e());
                if (d11 != null) {
                    ((C3922p.g) this.f24343d).invoke(d11, th3);
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
            } while (unit != null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull xe.M scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f24337a = scope;
        this.f24338b = consumeMessage;
        this.f24339c = ze.k.a(Integer.MAX_VALUE, 6, null);
        this.f24340d = new C3907a();
        B0 b02 = (B0) scope.getCoroutineContext().get(B0.f105374o0);
        if (b02 != null) {
            b02.y(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(V.a aVar) {
        Object b11 = this.f24339c.b(aVar);
        if (b11 instanceof l.a) {
            Throwable c11 = ze.l.c(b11);
            if (c11 != null) {
                throw c11;
            }
            throw new ze.q("Channel was closed normally");
        }
        if (b11 instanceof l.b) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f24340d.c() == 0) {
            C10727i.c(this.f24337a, null, null, new c0(this, null), 3);
        }
    }
}
