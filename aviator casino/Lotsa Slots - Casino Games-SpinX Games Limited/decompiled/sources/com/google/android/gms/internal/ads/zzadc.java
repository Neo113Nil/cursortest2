package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzadc {
    private final android.content.Context zza;
    private boolean zzb;
    private com.google.android.gms.internal.ads.zzvv zzc = com.google.android.gms.internal.ads.zzvv.zzb;
    private final com.google.android.gms.internal.ads.zzvh zzd;
    private android.os.Handler zze;
    private com.google.android.gms.internal.ads.zzaep zzf;

    public zzadc(android.content.Context context) {
        this.zza = context;
        this.zzd = new com.google.android.gms.internal.ads.zzvb(context, null, null);
    }

    public final com.google.android.gms.internal.ads.zzadc zza(com.google.android.gms.internal.ads.zzvv zzvvVar) {
        this.zzc = zzvvVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzadc zzb(android.os.Handler handler) {
        this.zze = handler;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzadc zzc(com.google.android.gms.internal.ads.zzaep zzaepVar) {
        this.zzf = zzaepVar;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.zzf != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.ads.zzade zzd() {
        boolean z;
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzb);
        android.os.Handler handler = this.zze;
        if (handler != null || this.zzf != null) {
            z = false;
            if (handler != null) {
            }
            com.google.android.gms.internal.ads.zzgtj.zzi(z);
            this.zzb = true;
            return new com.google.android.gms.internal.ads.zzade(this);
        }
        z = true;
        com.google.android.gms.internal.ads.zzgtj.zzi(z);
        this.zzb = true;
        return new com.google.android.gms.internal.ads.zzade(this);
    }

    final /* synthetic */ android.content.Context zze() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzvv zzf() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzvh zzg() {
        return this.zzd;
    }

    final /* synthetic */ android.os.Handler zzh() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzaep zzi() {
        return this.zzf;
    }
}
