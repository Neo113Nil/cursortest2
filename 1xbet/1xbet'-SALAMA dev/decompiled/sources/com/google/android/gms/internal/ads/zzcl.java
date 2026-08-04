package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class zzcl {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcl() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzcl zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcl zzd(float f7) {
        this.zzm = f7;
        return this;
    }

    public final zzcl zze(float f7, int i7) {
        this.zze = f7;
        this.zzf = i7;
        return this;
    }

    public final zzcl zzf(int i7) {
        this.zzg = i7;
        return this;
    }

    public final zzcl zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcl zzh(float f7) {
        this.zzh = f7;
        return this;
    }

    public final zzcl zzi(int i7) {
        this.zzi = i7;
        return this;
    }

    public final zzcl zzj(float f7) {
        this.zzo = f7;
        return this;
    }

    public final zzcl zzk(float f7) {
        this.zzl = f7;
        return this;
    }

    public final zzcl zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcl zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcl zzn(float f7, int i7) {
        this.zzk = f7;
        this.zzj = i7;
        return this;
    }

    public final zzcl zzo(int i7) {
        this.zzn = i7;
        return this;
    }

    public final zzcn zzp() {
        return new zzcn(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, null);
    }

    public final CharSequence zzq() {
        return this.zza;
    }

    public /* synthetic */ zzcl(zzcn zzcnVar, zzcm zzcmVar) {
        this.zza = zzcnVar.zza;
        this.zzb = zzcnVar.zzd;
        this.zzc = zzcnVar.zzb;
        this.zzd = zzcnVar.zzc;
        this.zze = zzcnVar.zze;
        this.zzf = zzcnVar.zzf;
        this.zzg = zzcnVar.zzg;
        this.zzh = zzcnVar.zzh;
        this.zzi = zzcnVar.zzi;
        this.zzj = zzcnVar.zzl;
        this.zzk = zzcnVar.zzm;
        this.zzl = zzcnVar.zzj;
        this.zzm = zzcnVar.zzk;
        this.zzn = zzcnVar.zzn;
        this.zzo = zzcnVar.zzo;
    }
}
