package S50;

import D90.b;
import Sc.k;
import Sc.n;
import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Function0<Unit> f25865a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f25866b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f25867c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25868d;

    /* renamed from: e, reason: collision with root package name */
    private long f25869e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0513a f25870f;

    /* renamed from: S50.a$a, reason: collision with other inner class name */
    public static final class C0513a implements SensorEventListener {
        C0513a() {
        }

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i11) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent event) {
            Function0<Unit> f7;
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.sensor.getType() != 9) {
                return;
            }
            float f11 = event.values[2];
            long currentTimeMillis = System.currentTimeMillis();
            a aVar = a.this;
            if (!aVar.f25868d && f11 < -8.0f) {
                aVar.f25868d = true;
                aVar.f25869e = currentTimeMillis;
            } else {
                if (!aVar.f25868d || f11 <= -5.0f) {
                    return;
                }
                aVar.f25868d = false;
                if (currentTimeMillis - aVar.f25869e > 1300 || (f7 = aVar.f()) == null) {
                    return;
                }
                f7.invoke();
            }
        }
    }

    public a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        n nVar = n.PUBLICATION;
        this.f25866b = k.a(nVar, new D90.a(application, 2));
        this.f25867c = k.a(nVar, new b(this, 1));
        this.f25870f = new C0513a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Sc.j, java.lang.Object] */
    public static Sensor a(a aVar) {
        SensorManager sensorManager = (SensorManager) aVar.f25866b.getValue();
        if (sensorManager != null) {
            return sensorManager.getDefaultSensor(9);
        }
        return null;
    }

    public final Function0<Unit> f() {
        return this.f25865a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Sc.j, java.lang.Object] */
    public final void g() {
        this.f25868d = false;
        Sensor sensor = (Sensor) this.f25867c.getValue();
        if (sensor != null) {
            ?? r12 = this.f25866b;
            SensorManager sensorManager = (SensorManager) r12.getValue();
            C0513a c0513a = this.f25870f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(c0513a);
            }
            SensorManager sensorManager2 = (SensorManager) r12.getValue();
            if (sensorManager2 != null) {
                sensorManager2.registerListener(c0513a, sensor, 2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Sc.j, java.lang.Object] */
    public final void h() {
        SensorManager sensorManager;
        this.f25868d = false;
        if (((Sensor) this.f25867c.getValue()) == null || (sensorManager = (SensorManager) this.f25866b.getValue()) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f25870f);
    }

    public final void i(Function0<Unit> function0) {
        this.f25865a = function0;
    }
}
