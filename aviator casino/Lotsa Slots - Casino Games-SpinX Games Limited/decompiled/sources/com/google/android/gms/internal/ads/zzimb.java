package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzimb implements com.google.android.gms.internal.ads.zzaup {
    private static final com.google.android.gms.internal.ads.zzimm zzg = com.google.android.gms.internal.ads.zzimm.zzb(com.google.android.gms.internal.ads.zzimb.class);
    protected final java.lang.String zza;
    long zzd;
    com.google.android.gms.internal.ads.zzimg zzf;
    private java.nio.ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    protected zzimb(java.lang.String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        if (this.zzc) {
            return;
        }
        try {
            com.google.android.gms.internal.ads.zzimm zzimmVar = zzg;
            java.lang.String str = this.zza;
            zzimmVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new java.lang.String("mem mapping "));
            this.zzh = this.zzf.zze(this.zzd, this.zze);
            this.zzc = true;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final java.lang.String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzb(com.google.android.gms.internal.ads.zzimg zzimgVar, java.nio.ByteBuffer byteBuffer, long j, com.google.android.gms.internal.ads.zzaum zzaumVar) throws java.io.IOException {
        this.zzd = zzimgVar.zzc();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzimgVar;
        zzimgVar.zzd(zzimgVar.zzc() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(java.nio.ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        zzc();
        com.google.android.gms.internal.ads.zzimm zzimmVar = zzg;
        java.lang.String str = this.zza;
        zzimmVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new java.lang.String("parsing details of "));
        java.nio.ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}
