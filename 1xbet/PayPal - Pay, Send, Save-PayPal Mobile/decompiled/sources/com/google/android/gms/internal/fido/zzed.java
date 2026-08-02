package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzed {
    private static final com.google.android.gms.internal.fido.zzdz zza = new com.google.android.gms.internal.fido.zzeb();
    private static final com.google.android.gms.internal.fido.zzdy zzb = new com.google.android.gms.internal.fido.zzec();

    public static com.google.android.gms.internal.fido.zzdv zza(java.util.Set set) {
        com.google.android.gms.internal.fido.zzdv zzdvVar = new com.google.android.gms.internal.fido.zzdv(zza, null);
        zzdvVar.zza(zzb);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdvVar.zzg((com.google.android.gms.internal.fido.zzdk) it.next());
        }
        return zzdvVar;
    }
}
