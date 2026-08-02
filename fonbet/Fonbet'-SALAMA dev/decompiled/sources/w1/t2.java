package w1;

import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17871c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17872d;

    /* renamed from: e, reason: collision with root package name */
    public final Location f17873e;

    public t2(boolean z4, boolean z7, Location location) {
        super(2, (byte) 0);
        this.f17871c = z4;
        this.f17872d = z7;
        this.f17873e = location;
    }

    @Override // D1.a
    public final JSONObject a() {
        Location location;
        boolean z4;
        double d7;
        double d8;
        double d9;
        boolean z7;
        float verticalAccuracyMeters;
        float bearingAccuracyDegrees;
        float speedAccuracyMetersPerSecond;
        JSONObject a2 = super.a();
        boolean z8 = this.f17871c;
        a2.put("fl.report.location.enabled", z8);
        if (z8) {
            boolean z9 = this.f17872d;
            a2.put("fl.location.permission.status", z9);
            if (z9 && (location = this.f17873e) != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                    d7 = verticalAccuracyMeters;
                    bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                    d8 = bearingAccuracyDegrees;
                    speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                    d9 = speedAccuracyMetersPerSecond;
                    z4 = location.hasBearingAccuracy();
                    z7 = location.hasSpeedAccuracy();
                } else {
                    z4 = false;
                    d7 = 0.0d;
                    d8 = 0.0d;
                    d9 = 0.0d;
                    z7 = false;
                }
                a2.put("fl.precision.value", -1);
                a2.put("fl.latitude.value", location.getLatitude());
                a2.put("fl.longitude.value", location.getLongitude());
                a2.put("fl.horizontal.accuracy.value", location.getAccuracy());
                a2.put("fl.time.epoch.value", location.getTime());
                a2.put("fl.time.uptime.value", TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()));
                a2.put("fl.altitude.value", location.getAltitude());
                a2.put("fl.vertical.accuracy.value", d7);
                a2.put("fl.bearing.value", location.getBearing());
                a2.put("fl.speed.value", location.getSpeed());
                a2.put("fl.bearing.accuracy.available", z4);
                a2.put("fl.speed.accuracy.available", z7);
                a2.put("fl.bearing.accuracy.degrees", d8);
                a2.put("fl.speed.accuracy.meters.per.sec", d9);
            }
        }
        return a2;
    }
}
