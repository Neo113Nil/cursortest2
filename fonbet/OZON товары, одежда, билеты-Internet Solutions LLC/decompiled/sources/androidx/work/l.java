package androidx.work;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class l extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m<Object> f45542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m<Object> mVar) {
        super(1);
        this.f45542b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        androidx.work.impl.utils.futures.c cVar;
        androidx.work.impl.utils.futures.c cVar2;
        androidx.work.impl.utils.futures.c cVar3;
        Throwable th3 = th2;
        m<Object> mVar = this.f45542b;
        if (th3 == null) {
            cVar3 = ((m) mVar).f45543a;
            if (!cVar3.isDone()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (th3 instanceof CancellationException) {
            cVar2 = ((m) mVar).f45543a;
            cVar2.cancel(true);
        } else {
            cVar = ((m) mVar).f45543a;
            Throwable cause = th3.getCause();
            if (cause != null) {
                th3 = cause;
            }
            cVar.l(th3);
        }
        return Unit.f71690a;
    }
}
