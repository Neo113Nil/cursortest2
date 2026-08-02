package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Gr extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2 f29095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Mf f29096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr(Z2 z22, Mf mf2) {
        super(0);
        this.f29095b = z22;
        this.f29096c = mf2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Z2 z22 = this.f29095b;
        C10727i.c(androidx.lifecycle.x0.a(z22), null, null, new K2(z22, this.f29096c, (kotlin.coroutines.d) null), 3);
        return Unit.f71690a;
    }
}
