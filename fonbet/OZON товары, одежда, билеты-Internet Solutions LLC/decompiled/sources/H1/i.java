package H1;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class i extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f10485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(CancellationSignal cancellationSignal) {
        super(1);
        this.f10485b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        if (th2 != null) {
            this.f10485b.cancel();
        }
        return Unit.f71690a;
    }
}
