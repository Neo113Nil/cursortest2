package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbgq {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ThreadLocal zzb;

    static {
        com.google.android.libraries.places.internal.zzbfv zzf = com.google.android.libraries.places.internal.zzbfw.zzf();
        zzf.zza(-62135596800L);
        zzf.zzb(0);
        com.google.android.libraries.places.internal.zzbfv zzf2 = com.google.android.libraries.places.internal.zzbfw.zzf();
        zzf2.zza(253402300799L);
        zzf2.zzb(org.threeten.bp.Year.MAX_VALUE);
        com.google.android.libraries.places.internal.zzbfv zzf3 = com.google.android.libraries.places.internal.zzbfw.zzf();
        zzf3.zza(0L);
        zzf3.zzb(0);
        zzb = new com.google.android.libraries.places.internal.zzbgp();
        zzb("now");
        zzb("getEpochSecond");
        zzb("getNano");
    }

    public static java.lang.String zza(com.google.android.libraries.places.internal.zzbfw zzbfwVar) {
        long zzc = zzbfwVar.zzc();
        int zze = zzbfwVar.zze();
        if (zzc < -62135596800L || zzc > 253402300799L || zze < 0 || zze >= 1000000000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzc).length() + 135 + java.lang.String.valueOf(zze).length() + 37);
            sb.append("Timestamp is not valid. See proto definition for valid values. Seconds (");
            sb.append(zzc);
            sb.append(") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (");
            sb.append(zze);
            sb.append(") must be in range [0, +999,999,999].");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        long zzc2 = zzbfwVar.zzc();
        int zze2 = zzbfwVar.zze();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(((java.text.SimpleDateFormat) zzb.get()).format(new java.util.Date(zzc2 * 1000)));
        if (zze2 != 0) {
            sb2.append(".");
            sb2.append(zze2 % 1000000 == 0 ? java.lang.String.format(java.util.Locale.ENGLISH, "%1$03d", java.lang.Integer.valueOf(zze2 / 1000000)) : zze2 % 1000 == 0 ? java.lang.String.format(java.util.Locale.ENGLISH, "%1$06d", java.lang.Integer.valueOf(zze2 / 1000)) : java.lang.String.format(java.util.Locale.ENGLISH, "%1$09d", java.lang.Integer.valueOf(zze2)));
        }
        sb2.append("Z");
        return sb2.toString();
    }

    @javax.annotation.Nullable
    private static java.lang.reflect.Method zzb(java.lang.String str) {
        try {
            return java.lang.Class.forName("java.time.Instant").getMethod(str, new java.lang.Class[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
