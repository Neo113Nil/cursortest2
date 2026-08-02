package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzeo {
    private static final java.text.SimpleDateFormat zza = new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.ROOT);
    private static final java.text.SimpleDateFormat zzb = new java.text.SimpleDateFormat("MM-dd HH:mm:ss", java.util.Locale.ROOT);
    private static final java.lang.StringBuilder zzc = new java.lang.StringBuilder(33);

    public static java.lang.String zza(long j) {
        return j >= 0 ? zza.format(new java.util.Date(j)) : java.lang.Long.toString(j);
    }

    public static java.lang.String zzb(long j) {
        java.lang.String sb;
        java.lang.StringBuilder sb2 = zzc;
        synchronized (sb2) {
            sb2.setLength(0);
            zzc(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public static java.lang.StringBuilder zzc(long j, java.lang.StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return sb;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(lib.android.paypal.com.magnessdk.g.n2);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
        return sb;
    }
}
