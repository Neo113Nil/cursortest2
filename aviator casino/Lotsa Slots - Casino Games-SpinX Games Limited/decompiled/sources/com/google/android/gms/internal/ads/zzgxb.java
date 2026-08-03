package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgxb extends com.google.android.gms.internal.ads.zzguk {
    final /* synthetic */ java.util.Iterator zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgtk zzb;

    zzgxb(java.util.Iterator it, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        this.zza = it;
        this.zzb = zzgtkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguk
    protected final java.lang.Object zza() {
        com.google.android.gms.internal.ads.zzgtk zzgtkVar;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgtkVar = this.zzb;
            next = it.next();
        } while (!zzgtkVar.zza(next));
        return next;
    }
}
