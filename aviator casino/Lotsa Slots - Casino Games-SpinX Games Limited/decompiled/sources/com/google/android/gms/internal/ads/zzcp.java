package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzcp implements com.google.android.gms.internal.ads.zzco {
    protected com.google.android.gms.internal.ads.zzcl zzb;
    protected com.google.android.gms.internal.ads.zzcl zzc;
    private com.google.android.gms.internal.ads.zzcl zzd;
    private com.google.android.gms.internal.ads.zzcl zze;
    private java.nio.ByteBuffer zzf;
    private java.nio.ByteBuffer zzg;
    private boolean zzh;

    public zzcp() {
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        com.google.android.gms.internal.ads.zzcl zzclVar = com.google.android.gms.internal.ads.zzcl.zza;
        this.zzd = zzclVar;
        this.zze = zzclVar;
        this.zzb = zzclVar;
        this.zzc = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public /* synthetic */ long zza(long j) {
        return com.google.android.gms.internal.ads.zzco.CC.$default$zza(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final com.google.android.gms.internal.ads.zzcl zzb(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        this.zzd = zzclVar;
        this.zze = zzm(zzclVar);
        return zzc() ? this.zze : com.google.android.gms.internal.ads.zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public boolean zzc() {
        return this.zze != com.google.android.gms.internal.ads.zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zze() {
        this.zzh = true;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public java.nio.ByteBuffer zzf() {
        java.nio.ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public boolean zzg() {
        return this.zzh && this.zzg == zza;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    @java.lang.Deprecated
    public final void zzh() {
        com.google.android.gms.internal.ads.zzcm zzcmVar = com.google.android.gms.internal.ads.zzcm.zza;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzi(com.google.android.gms.internal.ads.zzcm zzcmVar) {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzo(zzcmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzj() {
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzg = byteBuffer;
        this.zzh = false;
        this.zzf = byteBuffer;
        com.google.android.gms.internal.ads.zzcl zzclVar = com.google.android.gms.internal.ads.zzcl.zza;
        this.zzd = zzclVar;
        this.zze = zzclVar;
        this.zzb = zzclVar;
        this.zzc = zzclVar;
        zzp();
    }

    protected final java.nio.ByteBuffer zzk(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected final boolean zzl() {
        return this.zzg.hasRemaining();
    }

    protected com.google.android.gms.internal.ads.zzcl zzm(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        throw null;
    }

    protected void zzn() {
    }

    protected void zzo(com.google.android.gms.internal.ads.zzcm zzcmVar) {
    }

    protected void zzp() {
    }
}
