package C2;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: C2.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2717l extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f4352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2717l(CancellationSignal cancellationSignal) {
        super(1);
        this.f4352b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f4352b.cancel();
        return Unit.f71690a;
    }
}
