package p155w1;

import D1.a;
import android.location.Location;
import android.os.Build;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Location f17879e;

    public t2(boolean z4, boolean z7, Location location) {
        super(2, (byte) 0);
        this.f17877c = z4;
        this.f17878d = z7;
        this.f17879e = location;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        Location location;
        boolean zHasBearingAccuracy;
        double verticalAccuracyMeters;
        double bearingAccuracyDegrees;
        double speedAccuracyMetersPerSecond;
        boolean zHasSpeedAccuracy;
        JSONObject jSONObjectA = super.a();
        boolean z4 = this.f17877c;
        jSONObjectA.put("fl.report.location.enabled", z4);
        if (z4) {
            boolean z7 = this.f17878d;
            jSONObjectA.put("fl.location.permission.status", z7);
            if (z7 && (location = this.f17879e) != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                    bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                    speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                    zHasBearingAccuracy = location.hasBearingAccuracy();
                    zHasSpeedAccuracy = location.hasSpeedAccuracy();
                } else {
                    zHasBearingAccuracy = false;
                    verticalAccuracyMeters = 0.0d;
                    bearingAccuracyDegrees = 0.0d;
                    speedAccuracyMetersPerSecond = 0.0d;
                    zHasSpeedAccuracy = false;
                }
                jSONObjectA.put("fl.precision.value", -1);
                jSONObjectA.put("fl.latitude.value", location.getLatitude());
                jSONObjectA.put("fl.longitude.value", location.getLongitude());
                jSONObjectA.put("fl.horizontal.accuracy.value", location.getAccuracy());
                jSONObjectA.put("fl.time.epoch.value", location.getTime());
                jSONObjectA.put("fl.time.uptime.value", TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()));
                jSONObjectA.put("fl.altitude.value", location.getAltitude());
                jSONObjectA.put("fl.vertical.accuracy.value", verticalAccuracyMeters);
                jSONObjectA.put("fl.bearing.value", location.getBearing());
                jSONObjectA.put("fl.speed.value", location.getSpeed());
                jSONObjectA.put("fl.bearing.accuracy.available", zHasBearingAccuracy);
                jSONObjectA.put("fl.speed.accuracy.available", zHasSpeedAccuracy);
                jSONObjectA.put("fl.bearing.accuracy.degrees", bearingAccuracyDegrees);
                jSONObjectA.put("fl.speed.accuracy.meters.per.sec", speedAccuracyMetersPerSecond);
            }
        }
        return jSONObjectA;
    }
}
