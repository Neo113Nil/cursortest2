package Ve;

import android.hardware.SensorManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.wn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4740wn extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4740wn(Object obj, int i11) {
        super(0);
        this.f32385b = i11;
        this.f32386c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32385b) {
            case 0:
                Mq mq = (Mq) this.f32386c;
                Object systemService = mq.requireContext().getSystemService("sensor");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
                SensorManager sensorManager = (SensorManager) systemService;
                mq.f29499h = sensorManager;
                mq.f29500i = sensorManager.getDefaultSensor(1);
                ((D5) mq.f29498g.getValue()).f28832a = new Zo(mq);
                return Unit.f71690a;
            default:
                Unit unit = Unit.f71690a;
                ((lm0.e) this.f32386c).b(unit);
                return unit;
        }
    }
}
