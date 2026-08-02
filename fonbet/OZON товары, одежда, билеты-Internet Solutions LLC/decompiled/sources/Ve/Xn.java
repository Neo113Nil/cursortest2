package Ve;

import android.hardware.SensorManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class Xn extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30413b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Xn(Object obj, int i11) {
        super(0);
        this.f30413b = i11;
        this.f30414c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30413b) {
            case 0:
                Mq mq = (Mq) this.f30414c;
                SensorManager sensorManager = mq.f29499h;
                if (sensorManager != null) {
                    sensorManager.unregisterListener((D5) mq.f29498g.getValue());
                }
                return Unit.f71690a;
            default:
                Unit unit = Unit.f71690a;
                ((lm0.e) this.f30414c).b(unit);
                return unit;
        }
    }
}
