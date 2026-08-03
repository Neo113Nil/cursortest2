package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzguc implements java.io.Serializable, com.google.android.gms.internal.ads.zzgub {
    final com.google.android.gms.internal.ads.zzgub zza;
    volatile transient boolean zzb;
    transient java.lang.Object zzc;
    private final transient com.google.android.gms.internal.ads.zzgui zzd = new com.google.android.gms.internal.ads.zzgui();

    zzguc(com.google.android.gms.internal.ads.zzgub zzgubVar) {
        this.zza = zzgubVar;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        if (this.zzb) {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.zza;
        }
        java.lang.String obj2 = obj.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final java.lang.Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    java.lang.Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
