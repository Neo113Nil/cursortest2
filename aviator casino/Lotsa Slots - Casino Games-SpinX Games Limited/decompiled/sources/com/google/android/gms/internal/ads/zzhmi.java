package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmi {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhln zzc = com.google.android.gms.internal.ads.zzhmh.zza;
    private static final com.google.android.gms.internal.ads.zzhmi zzd = zzd();
    private final java.util.Map zzb = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.zzhmi zza() {
        return zzd;
    }

    private static com.google.android.gms.internal.ads.zzhmi zzd() {
        com.google.android.gms.internal.ads.zzhmi zzhmiVar = new com.google.android.gms.internal.ads.zzhmi();
        try {
            zzhmiVar.zzb(zzc, com.google.android.gms.internal.ads.zzhma.class);
            return zzhmiVar;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized com.google.android.gms.internal.ads.zzhdq zze(com.google.android.gms.internal.ads.zzheh zzhehVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.android.gms.internal.ads.zzhln zzhlnVar;
        zzhlnVar = (com.google.android.gms.internal.ads.zzhln) this.zzb.get(zzhehVar.getClass());
        if (zzhlnVar == null) {
            java.lang.String obj = zzhehVar.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(obj);
            sb.append(": no key creator for this class was registered.");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return zzhlnVar.zza(zzhehVar, num);
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzhln zzhlnVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        java.util.Map map = this.zzb;
        com.google.android.gms.internal.ads.zzhln zzhlnVar2 = (com.google.android.gms.internal.ads.zzhln) map.get(cls);
        if (zzhlnVar2 != null && !zzhlnVar2.equals(zzhlnVar)) {
            java.lang.String obj = cls.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 60);
            sb.append("Different key creator for parameters class ");
            sb.append(obj);
            sb.append(" already inserted");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        map.put(cls, zzhlnVar);
    }

    public final com.google.android.gms.internal.ads.zzhdq zzc(com.google.android.gms.internal.ads.zzheh zzhehVar, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return zze(zzhehVar, num);
    }
}
