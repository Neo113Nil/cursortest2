package Ve;

import Lm0.a;
import android.hardware.SensorManager;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: Ve.ni, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4476ni extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4476ni(Object obj, int i11) {
        super(0);
        this.f31662b = i11;
        this.f31663c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31662b) {
            case 0:
                a.b bVar = Lm0.a.f17149a;
                bVar.b("TDsBinding");
                bVar.i("redirect " + ((Uri) this.f31663c), new Object[0]);
                break;
            default:
                Mq mq = (Mq) this.f31663c;
                SensorManager sensorManager = mq.f29499h;
                if (sensorManager != null) {
                    sensorManager.registerListener((D5) mq.f29498g.getValue(), mq.f29500i, 2);
                }
                break;
        }
        return Unit.f71690a;
    }
}
