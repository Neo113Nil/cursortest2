package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class c0 {
    public static java.lang.String a(int i) {
        if (i <= 0) {
            return "00:00:00.000";
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long j = i;
        long hours = timeUnit.toHours(j);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
        long millis = j - timeUnit2.toMillis(hours);
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return java.lang.String.format("%02d:%02d:%02d.%03d", java.lang.Long.valueOf(hours), java.lang.Long.valueOf(minutes), java.lang.Long.valueOf(seconds), java.lang.Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - java.util.concurrent.TimeUnit.SECONDS.toMillis(seconds))));
    }

    public static java.lang.String a(long j, long j2, long j3) {
        long j4 = (j - j2) - j3;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j4);
        long millis = timeUnit.toMillis(j4 - java.util.concurrent.TimeUnit.SECONDS.toMillis(seconds));
        java.util.Locale locale = java.util.Locale.US;
        return seconds + "." + millis;
    }
}
