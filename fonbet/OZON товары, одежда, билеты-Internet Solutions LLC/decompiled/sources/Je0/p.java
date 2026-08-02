package Je0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class p extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final p f14691b = new p(0);

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (o.f14686b.get()) {
            int i11 = o.f14688d.get() - o.f14687c.get();
            if (i11 > 0) {
                o.f14685a = Integer.valueOf(i11);
            }
            o.f14686b.set(false);
            o.f14689e = null;
        }
        return Unit.f71690a;
    }
}
