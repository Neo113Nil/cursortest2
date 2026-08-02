package C2;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: C2.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2719n extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f4356b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2719n(CancellationSignal cancellationSignal) {
        super(1);
        this.f4356b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f4356b.cancel();
        return Unit.f71690a;
    }
}
