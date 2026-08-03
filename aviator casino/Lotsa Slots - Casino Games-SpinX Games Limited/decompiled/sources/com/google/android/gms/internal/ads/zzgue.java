package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgue implements com.google.android.gms.internal.ads.zzgub {
    private static final com.google.android.gms.internal.ads.zzgub zzb = com.google.android.gms.internal.ads.zzgud.zza;
    private final com.google.android.gms.internal.ads.zzgui zza = new com.google.android.gms.internal.ads.zzgui();
    private volatile com.google.android.gms.internal.ads.zzgub zzc;
    private java.lang.Object zzd;

    zzgue(com.google.android.gms.internal.ads.zzgub zzgubVar) {
        this.zzc = zzgubVar;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.zzc;
        if (obj == zzb) {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(obj);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final java.lang.Object zza() {
        com.google.android.gms.internal.ads.zzgub zzgubVar = this.zzc;
        com.google.android.gms.internal.ads.zzgub zzgubVar2 = zzb;
        if (zzgubVar != zzgubVar2) {
            synchronized (this.zza) {
                if (this.zzc != zzgubVar2) {
                    java.lang.Object zza = this.zzc.zza();
                    this.zzd = zza;
                    this.zzc = zzgubVar2;
                    return zza;
                }
            }
        }
        return this.zzd;
    }
}
