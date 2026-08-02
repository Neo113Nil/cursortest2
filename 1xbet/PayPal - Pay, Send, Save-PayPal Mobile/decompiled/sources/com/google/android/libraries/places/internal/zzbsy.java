package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbsy implements com.google.android.libraries.places.internal.zzbmb {
    @Override // com.google.android.libraries.places.internal.zzbmb
    public final /* synthetic */ java.lang.Object zza(java.lang.String str) {
        com.google.common.base.Preconditions.checkArgument(str.length() > 0, "empty timeout");
        com.google.common.base.Preconditions.checkArgument(str.length() <= 9, "bad timeout format");
        long parseLong = java.lang.Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return java.lang.Long.valueOf(parseLong);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid timeout unit: %s", java.lang.Character.valueOf(charAt)));
    }

    @Override // com.google.android.libraries.places.internal.zzbmb
    public final /* synthetic */ java.lang.String zzb(java.lang.Object obj) {
        long max = java.lang.Math.max(1L, ((java.lang.Long) obj).longValue());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        if (max < 100000000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(max).length() + 1);
            sb.append(max);
            sb.append("n");
            return sb.toString();
        }
        if (max < 100000000000L) {
            long micros = timeUnit.toMicros(max);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(micros).length() + 1);
            sb2.append(micros);
            sb2.append("u");
            return sb2.toString();
        }
        if (max < 100000000000000L) {
            long millis = timeUnit.toMillis(max);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(millis).length() + 1);
            sb3.append(millis);
            sb3.append("m");
            return sb3.toString();
        }
        if (max < 100000000000000000L) {
            long seconds = timeUnit.toSeconds(max);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(seconds).length() + 1);
            sb4.append(seconds);
            sb4.append("S");
            return sb4.toString();
        }
        if (max < 6000000000000000000L) {
            long minutes = timeUnit.toMinutes(max);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(minutes).length() + 1);
            sb5.append(minutes);
            sb5.append("M");
            return sb5.toString();
        }
        long hours = timeUnit.toHours(max);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(hours).length() + 1);
        sb6.append(hours);
        sb6.append("H");
        return sb6.toString();
    }

    zzbsy() {
    }
}
