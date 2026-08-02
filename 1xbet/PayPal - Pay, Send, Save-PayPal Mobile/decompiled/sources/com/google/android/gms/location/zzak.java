package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzak {
    public static final /* synthetic */ int zza = 0;
    private static final java.text.DecimalFormat zzb = new java.text.DecimalFormat(".000000", java.text.DecimalFormatSymbols.getInstance(java.util.Locale.ROOT));
    private static final java.text.DecimalFormat zzc;
    private static final java.lang.StringBuilder zzd;

    static {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat(".##", java.text.DecimalFormatSymbols.getInstance(java.util.Locale.ROOT));
        zzc = decimalFormat;
        decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
        zzd = new java.lang.StringBuilder();
    }

    public static java.lang.StringBuilder zza(android.location.Location location, java.lang.StringBuilder sb) {
        sb.ensureCapacity(100);
        if (location == null) {
            sb.append((java.lang.String) null);
            return sb;
        }
        sb.append("{");
        sb.append(location.getProvider());
        sb.append(", ");
        if (androidx.core.location.LocationCompat.isMock(location)) {
            sb.append("mock, ");
        }
        java.text.DecimalFormat decimalFormat = zzb;
        sb.append(decimalFormat.format(location.getLatitude()));
        sb.append(",");
        sb.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb.append("±");
            sb.append(zzc.format(location.getAccuracy()));
            sb.append("m");
        }
        if (location.hasAltitude()) {
            sb.append(", alt=");
            java.text.DecimalFormat decimalFormat2 = zzc;
            sb.append(decimalFormat2.format(location.getAltitude()));
            if (androidx.core.location.LocationCompat.hasVerticalAccuracy(location)) {
                sb.append("±");
                sb.append(decimalFormat2.format(androidx.core.location.LocationCompat.getVerticalAccuracyMeters(location)));
            }
            sb.append("m");
        }
        if (location.hasSpeed()) {
            sb.append(", spd=");
            java.text.DecimalFormat decimalFormat3 = zzc;
            sb.append(decimalFormat3.format(location.getSpeed()));
            if (androidx.core.location.LocationCompat.hasSpeedAccuracy(location)) {
                sb.append("±");
                sb.append(decimalFormat3.format(androidx.core.location.LocationCompat.getSpeedAccuracyMetersPerSecond(location)));
            }
            sb.append("m/s");
        }
        if (location.hasBearing()) {
            sb.append(", brg=");
            java.text.DecimalFormat decimalFormat4 = zzc;
            sb.append(decimalFormat4.format(location.getBearing()));
            if (androidx.core.location.LocationCompat.hasBearingAccuracy(location)) {
                sb.append("±");
                sb.append(decimalFormat4.format(androidx.core.location.LocationCompat.getBearingAccuracyDegrees(location)));
            }
            sb.append("°");
        }
        android.os.Bundle extras = location.getExtras();
        java.lang.String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb.append(", fl=");
            sb.append(string);
        }
        android.os.Bundle extras2 = location.getExtras();
        java.lang.String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb.append(", lv=");
            sb.append(string2);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        sb.append(", ert=");
        sb.append(com.google.android.gms.internal.identity.zzeo.zza(androidx.core.location.LocationCompat.getElapsedRealtimeMillis(location) + (currentTimeMillis - elapsedRealtime)));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb;
    }
}
