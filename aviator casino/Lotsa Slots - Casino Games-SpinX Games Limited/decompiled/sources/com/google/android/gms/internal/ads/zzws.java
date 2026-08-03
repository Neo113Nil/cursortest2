package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzws extends com.google.android.gms.internal.ads.zzwj {
    private final java.util.HashMap zza = new java.util.HashMap();
    private android.os.Handler zzb;
    private com.google.android.gms.internal.ads.zzin zzc;

    protected zzws() {
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    protected final void zzM() {
        for (com.google.android.gms.internal.ads.zzwr zzwrVar : this.zza.values()) {
            zzwrVar.zza.zzq(zzwrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    protected void zza(com.google.android.gms.internal.ads.zzin zzinVar) {
        this.zzc = zzinVar;
        this.zzb = com.google.android.gms.internal.ads.zzfl.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    protected final void zzc() {
        for (com.google.android.gms.internal.ads.zzwr zzwrVar : this.zza.values()) {
            zzwrVar.zza.zzr(zzwrVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwj
    protected void zzd() {
        java.util.HashMap hashMap = this.zza;
        for (com.google.android.gms.internal.ads.zzwr zzwrVar : hashMap.values()) {
            com.google.android.gms.internal.ads.zzxm zzxmVar = zzwrVar.zza;
            zzxmVar.zzs(zzwrVar.zzb);
            com.google.android.gms.internal.ads.zzwq zzwqVar = zzwrVar.zzc;
            zzxmVar.zzm(zzwqVar);
            zzxmVar.zzo(zzwqVar);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public void zzt() throws java.io.IOException {
        java.util.Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzwr) it.next()).zza.zzt();
        }
    }

    protected abstract void zzu(java.lang.Object obj, com.google.android.gms.internal.ads.zzxm zzxmVar, com.google.android.gms.internal.ads.zzbf zzbfVar);

    protected final void zzv(final java.lang.Object obj, com.google.android.gms.internal.ads.zzxm zzxmVar) {
        java.util.HashMap hashMap = this.zza;
        com.google.android.gms.internal.ads.zzgtj.zza(!hashMap.containsKey(obj));
        com.google.android.gms.internal.ads.zzxl zzxlVar = new com.google.android.gms.internal.ads.zzxl() { // from class: com.google.android.gms.internal.ads.zzwp
            @Override // com.google.android.gms.internal.ads.zzxl
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzxm zzxmVar2, com.google.android.gms.internal.ads.zzbf zzbfVar) {
                com.google.android.gms.internal.ads.zzws.this.zzu(obj, zzxmVar2, zzbfVar);
            }
        };
        com.google.android.gms.internal.ads.zzwq zzwqVar = new com.google.android.gms.internal.ads.zzwq(this, obj);
        hashMap.put(obj, new com.google.android.gms.internal.ads.zzwr(zzxmVar, zzxlVar, zzwqVar));
        android.os.Handler handler = this.zzb;
        handler.getClass();
        zzxmVar.zzl(handler, zzwqVar);
        android.os.Handler handler2 = this.zzb;
        handler2.getClass();
        zzxmVar.zzn(handler2, zzwqVar);
        zzxmVar.zzp(zzxlVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzxmVar.zzr(zzxlVar);
    }

    protected int zzw(java.lang.Object obj, int i) {
        return 0;
    }

    protected com.google.android.gms.internal.ads.zzxk zzx(java.lang.Object obj, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        throw null;
    }

    protected long zzy(java.lang.Object obj, long j, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return j;
    }
}
