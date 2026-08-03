package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzabr implements com.google.android.gms.internal.ads.zzabl {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private com.google.android.gms.internal.ads.zzabj[] zzd = new com.google.android.gms.internal.ads.zzabj[100];

    public zzabr(boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized com.google.android.gms.internal.ads.zzabj zza() {
        com.google.android.gms.internal.ads.zzabj zzabjVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            com.google.android.gms.internal.ads.zzabj[] zzabjVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzabjVar = zzabjVarArr[i2];
            zzabjVar.getClass();
            com.google.android.gms.internal.ads.zzabj zzabjVar2 = zzabjVar;
            zzabjVarArr[i2] = null;
        } else {
            zzabjVar = new com.google.android.gms.internal.ads.zzabj(new byte[65536], 0);
            int i3 = this.zzb;
            com.google.android.gms.internal.ads.zzabj[] zzabjVarArr2 = this.zzd;
            int length = zzabjVarArr2.length;
            if (i3 > length) {
                this.zzd = (com.google.android.gms.internal.ads.zzabj[]) java.util.Arrays.copyOf(zzabjVarArr2, length + length);
                return zzabjVar;
            }
        }
        return zzabjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzabj zzabjVar) {
        com.google.android.gms.internal.ads.zzabj[] zzabjVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzabjVarArr[i] = zzabjVar;
        this.zzb--;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzabk zzabkVar) {
        while (zzabkVar != null) {
            com.google.android.gms.internal.ads.zzabj[] zzabjVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzabjVarArr[i] = zzabkVar.zzd();
            this.zzb--;
            zzabkVar = zzabkVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzd() {
        int i = this.zza;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int max = java.lang.Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i2 = this.zzc;
        if (max >= i2) {
            return;
        }
        java.util.Arrays.fill(this.zzd, max, i2, (java.lang.Object) null);
        this.zzc = max;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }

    public final synchronized int zzh() {
        return this.zzc * 65536;
    }
}
