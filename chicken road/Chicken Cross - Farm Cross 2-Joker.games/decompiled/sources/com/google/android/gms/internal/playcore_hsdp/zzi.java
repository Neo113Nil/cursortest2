package com.google.android.gms.internal.playcore_hsdp;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzi implements zzg {
    private final zzk zza = new zzk();
    private volatile zzg zzb;
    private Object zzc;

    zzi(zzg zzgVar) {
        this.zzb = zzgVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == null) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                if (this.zzb != null) {
                    Object zza = this.zzb.zza();
                    this.zzc = zza;
                    this.zzb = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
