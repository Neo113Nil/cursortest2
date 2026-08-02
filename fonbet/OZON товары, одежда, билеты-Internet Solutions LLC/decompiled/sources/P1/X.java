package P1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class X extends AbstractC7737t implements Function1<Z, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y f21533b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ W f21534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X(Y y11, W w11) {
        super(1);
        this.f21533b = y11;
        this.f21534c = w11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Z z11) {
        O1.b bVar;
        O1.b bVar2;
        Z z12 = z11;
        S1.p b11 = this.f21533b.b();
        Y y11 = this.f21533b;
        W w11 = this.f21534c;
        synchronized (b11) {
            try {
                if (z12.c()) {
                    bVar2 = y11.f21536b;
                    bVar2.b(w11, z12);
                } else {
                    bVar = y11.f21536b;
                    bVar.c(w11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.f71690a;
    }
}
