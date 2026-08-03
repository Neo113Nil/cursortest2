package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvg implements com.google.android.gms.internal.ads.zzfvj {
    private static final com.google.android.gms.internal.ads.zzfvg zza = new com.google.android.gms.internal.ads.zzfvg(new com.google.android.gms.internal.ads.zzfvk());
    private java.util.Date zzb;
    private boolean zzc;
    private final com.google.android.gms.internal.ads.zzfvk zzd;
    private boolean zze;

    private zzfvg(com.google.android.gms.internal.ads.zzfvk zzfvkVar) {
        this.zzd = zzfvkVar;
    }

    public static com.google.android.gms.internal.ads.zzfvg zza() {
        return zza;
    }

    public final java.util.Date zzb() {
        java.util.Date date = this.zzb;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    public final void zzc(android.content.Context context) {
        if (this.zzc) {
            return;
        }
        com.google.android.gms.internal.ads.zzfvk zzfvkVar = this.zzd;
        zzfvkVar.zzd(context);
        zzfvkVar.zzg(this);
        zzfvkVar.zze();
        this.zze = zzfvkVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final void zzd(boolean z) {
        if (!this.zze && z) {
            java.util.Date date = new java.util.Date();
            java.util.Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    java.util.Iterator it = com.google.android.gms.internal.ads.zzfvi.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.zzfuo) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z;
    }
}
