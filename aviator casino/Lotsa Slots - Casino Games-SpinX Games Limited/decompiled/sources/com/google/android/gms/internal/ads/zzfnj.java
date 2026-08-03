package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfnj {
    private final com.google.android.gms.internal.ads.zzfmn zza;
    private final com.google.android.gms.internal.ads.zzfng zzb;
    private final com.google.android.gms.internal.ads.zzfmj zzc;
    private com.google.android.gms.internal.ads.zzfnp zze;
    private int zzf = 1;
    private final java.util.ArrayDeque zzd = new java.util.ArrayDeque();

    public zzfnj(com.google.android.gms.internal.ads.zzfmn zzfmnVar, com.google.android.gms.internal.ads.zzfmj zzfmjVar, com.google.android.gms.internal.ads.zzfng zzfngVar) {
        this.zza = zzfmnVar;
        this.zzc = zzfmjVar;
        this.zzb = zzfngVar;
        zzfmjVar.zza(new com.google.android.gms.internal.ads.zzfmi() { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzfmi
            public final /* synthetic */ void zza() {
                com.google.android.gms.internal.ads.zzfnj.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzfnp(r4.zza, r4.zzb, r0);
        r4.zze = r3;
        r3.zza(new com.google.android.gms.internal.ads.zzfne(r4, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return;
     */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhk)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzi()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                java.util.ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                com.google.android.gms.internal.ads.zzfnh zzfnhVar = (com.google.android.gms.internal.ads.zzfnh) arrayDeque.pollFirst();
                if (zzfnhVar == null || (zzfnhVar.zzb() != null && this.zza.zzc(zzfnhVar.zzb()))) {
                    break;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized void zza(com.google.android.gms.internal.ads.zzfnh zzfnhVar) {
        this.zzd.add(zzfnhVar);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfnh zzfnhVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzb(zzfnhVar);
    }

    final /* synthetic */ void zzc() {
        synchronized (this) {
            this.zzf = 1;
            zzd();
        }
    }

    final /* synthetic */ java.util.ArrayDeque zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzfnp zzfnpVar) {
        this.zze = null;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }
}
