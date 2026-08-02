package S0;

import S0.L0;
import Sc.C4001c;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class M0 extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L0 f25288b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f25289c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(L0 l02, Throwable th2) {
        super(1);
        this.f25288b = l02;
        this.f25289c = th2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        Throwable th3 = th2;
        Object obj = this.f25288b.f25244c;
        L0 l02 = this.f25288b;
        Throwable th4 = this.f25289c;
        synchronized (obj) {
            if (th4 == null) {
                th4 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        C4001c.a(th4, th3);
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            l02.f25246e = th4;
            l02.f25260s.setValue(L0.d.ShutDown);
        }
        return Unit.f71690a;
    }
}
