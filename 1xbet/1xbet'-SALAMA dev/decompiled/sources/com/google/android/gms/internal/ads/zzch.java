package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzch implements zzcg {
    protected zzce zzb;
    protected zzce zzc;
    private zzce zzd;
    private zzce zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzch() {
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzce zzceVar = zzce.zza;
        this.zzd = zzceVar;
        this.zze = zzceVar;
        this.zzb = zzceVar;
        this.zzc = zzceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzce zza(zzce zzceVar) {
        this.zzd = zzceVar;
        this.zze = zzi(zzceVar);
        return zzg() ? this.zze : zzce.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzcg.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzc() {
        this.zzg = zzcg.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzf() {
        zzc();
        this.zzf = zzcg.zza;
        zzce zzceVar = zzce.zza;
        this.zzd = zzceVar;
        this.zze = zzceVar;
        this.zzb = zzceVar;
        this.zzc = zzceVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public boolean zzg() {
        return this.zze != zzce.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public boolean zzh() {
        return this.zzh && this.zzg == zzcg.zza;
    }

    public zzce zzi(zzce zzceVar) {
        throw null;
    }

    public final ByteBuffer zzj(int i7) {
        if (this.zzf.capacity() < i7) {
            this.zzf = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
