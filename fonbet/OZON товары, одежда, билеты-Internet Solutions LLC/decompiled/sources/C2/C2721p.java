package C2;

import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: C2.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2721p extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CancellationSignal f4358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2721p(CancellationSignal cancellationSignal) {
        super(1);
        this.f4358b = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f4358b.cancel();
        return Unit.f71690a;
    }
}
