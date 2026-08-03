package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvh extends com.google.android.gms.internal.ads.zzfvk {
    private static final com.google.android.gms.internal.ads.zzfvh zzb = new com.google.android.gms.internal.ads.zzfvh();

    private zzfvh() {
    }

    public static com.google.android.gms.internal.ads.zzfvh zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final boolean zzb() {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzfvi.zza().zzf().iterator();
        while (it.hasNext()) {
            android.view.View zzi = ((com.google.android.gms.internal.ads.zzfuo) it.next()).zzi();
            if (zzi != null && zzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public final void zzc(boolean z) {
        java.util.Iterator it = com.google.android.gms.internal.ads.zzfvi.zza().zze().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfuo) it.next()).zzg().zzf(z);
        }
    }
}
