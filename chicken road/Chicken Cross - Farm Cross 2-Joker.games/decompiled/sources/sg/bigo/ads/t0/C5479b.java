package sg.bigo.ads.t0;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.M.C5005w;

/* renamed from: sg.bigo.ads.t0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5479b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f13322a;
    public C5005w b;
    public SensorManager c;
    public final List f;
    public long d = 0;
    public final float[] e = new float[3];
    public C5478a g = new C5478a(this);

    public C5479b(Context context, List list, C5005w c5005w) {
        this.f13322a = new WeakReference(context);
        this.f = list;
        this.b = c5005w;
    }

    public final void a() {
        try {
            this.c = (SensorManager) ((Context) this.f13322a.get()).getApplicationContext().getSystemService("sensor");
            Iterator it = this.f.iterator();
            Sensor sensor = null;
            int i = 4;
            while (it.hasNext() && (sensor = this.c.getDefaultSensor((i = ((Integer) it.next()).intValue()))) == null) {
            }
            this.c.registerListener(this.g, sensor, i);
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        SensorManager sensorManager = this.c;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.g);
            this.g = null;
            this.c = null;
        }
        this.b = null;
    }
}
