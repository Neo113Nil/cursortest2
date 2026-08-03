package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzims implements com.google.android.gms.internal.ads.zzimu {
    private com.google.android.gms.internal.ads.zzind zza;

    public static void zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        com.google.android.gms.internal.ads.zzims zzimsVar = (com.google.android.gms.internal.ads.zzims) zzindVar;
        if (zzimsVar.zza != null) {
            throw new java.lang.IllegalStateException();
        }
        zzimsVar.zza = zzindVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzind zzindVar = this.zza;
        if (zzindVar != null) {
            return zzindVar.zzb();
        }
        throw new java.lang.IllegalStateException();
    }
}
