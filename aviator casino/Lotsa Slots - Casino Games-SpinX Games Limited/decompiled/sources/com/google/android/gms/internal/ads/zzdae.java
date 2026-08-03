package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdae implements com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzdlk {
    private com.google.android.gms.internal.ads.zzcaw zza;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzfqj zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final java.util.concurrent.Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean();

    zzdae(android.content.Context context, com.google.android.gms.internal.ads.zzfqj zzfqjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.util.concurrent.Executor executor) {
        this.zzc = context;
        this.zzd = zzfqjVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc() {
        com.google.android.gms.internal.ads.zzcaw zzcawVar;
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzbui zzb;
        if (!this.zzb.getAndSet(true)) {
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzo.zze()).booleanValue()) {
                i = 3;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzp.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzn.zze()).booleanValue()) {
                        try {
                            java.lang.String optString = new org.json.JSONObject(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()).optString("local_flag_write");
                            if (android.text.TextUtils.equals(optString, "client")) {
                            }
                        } catch (org.json.JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                if (i2 != 1) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zzc, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzd);
                } else if (i2 == 2) {
                    zzb = com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzc, com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage(), this.zzd);
                }
                com.google.android.gms.internal.ads.zzbuc zzbucVar = com.google.android.gms.internal.ads.zzbuf.zza;
                this.zza = new com.google.android.gms.internal.ads.zzcaz(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbucVar, zzbucVar), this.zze, this.zzf);
                this.zzg = true;
            }
            i = 2;
            i2 = i - 1;
            if (i2 != 1) {
            }
            com.google.android.gms.internal.ads.zzbuc zzbucVar2 = com.google.android.gms.internal.ads.zzbuf.zza;
            this.zza = new com.google.android.gms.internal.ads.zzcaz(this.zzc, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbucVar2, zzbucVar2), this.zze, this.zzf);
            this.zzg = true;
        }
        if (this.zzg && (zzcawVar = this.zza) != null) {
            com.google.common.util.concurrent.ListenableFuture zzb2 = zzcawVar.zzb();
            if (!this.zzh && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzi.zze()).booleanValue()) {
                zzb2.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdad
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzdae.this.zzf();
                    }
                }, this.zzf);
            }
            com.google.android.gms.internal.ads.zzcfu.zza(zzb2, "persistFlagsClient", com.google.android.gms.internal.ads.zzcfr.zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(java.lang.String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        com.google.android.gms.internal.ads.zzbib.zze(this.zzc);
        this.zzh = true;
    }
}
