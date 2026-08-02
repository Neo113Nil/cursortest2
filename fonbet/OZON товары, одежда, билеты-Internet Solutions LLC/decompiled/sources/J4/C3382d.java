package J4;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.B0;
import xe.H0;

/* renamed from: J4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3382d extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f13872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ B0 f13873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3382d(CancellationSignal cancellationSignal, B0 b02) {
        super(1);
        this.f13872b = cancellationSignal;
        this.f13873c = b02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        CancellationSignal cancellationSignal = this.f13872b;
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
        ((H0) this.f13873c).j(null);
        return Unit.f71690a;
    }
}
