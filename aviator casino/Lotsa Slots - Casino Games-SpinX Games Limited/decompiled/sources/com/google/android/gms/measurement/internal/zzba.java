package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzba extends com.google.android.gms.measurement.internal.zzje {
    private long zza;
    private java.lang.String zzb;

    zzba(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    protected final boolean zza() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.zza = java.util.concurrent.TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), java.util.concurrent.TimeUnit.MILLISECONDS);
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String lowerCase = locale.getLanguage().toLowerCase(java.util.Locale.ENGLISH);
        java.lang.String lowerCase2 = locale.getCountry().toLowerCase(java.util.Locale.ENGLISH);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(lowerCase).length() + 1 + java.lang.String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.zzb = sb.toString();
        return false;
    }

    public final long zzb() {
        zzw();
        return this.zza;
    }

    public final java.lang.String zzc() {
        zzw();
        return this.zzb;
    }
}
