package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcw {
    private java.lang.CharSequence zza;
    private android.graphics.Bitmap zzb;
    private android.text.Layout.Alignment zzc;
    private android.text.Layout.Alignment zzd;
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
    private int zzp;

    public zzcw() {
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

    /* synthetic */ zzcw(com.google.android.gms.internal.ads.zzcx zzcxVar, byte[] bArr) {
        this.zza = zzcxVar.zza;
        this.zzb = zzcxVar.zzd;
        this.zzc = zzcxVar.zzb;
        this.zzd = zzcxVar.zzc;
        this.zze = zzcxVar.zze;
        this.zzf = zzcxVar.zzf;
        this.zzg = zzcxVar.zzg;
        this.zzh = zzcxVar.zzh;
        this.zzi = zzcxVar.zzi;
        this.zzj = zzcxVar.zzl;
        this.zzk = zzcxVar.zzm;
        this.zzl = zzcxVar.zzj;
        this.zzm = zzcxVar.zzk;
        this.zzn = zzcxVar.zzn;
        this.zzo = zzcxVar.zzo;
        this.zzp = zzcxVar.zzp;
    }

    public final com.google.android.gms.internal.ads.zzcw zza(java.lang.CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = null;
        return this;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.CharSequence zzb() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzcw zzc(android.graphics.Bitmap bitmap) {
        this.zzb = bitmap;
        this.zza = null;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzd(android.text.Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zze(android.text.Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzf(float f, int i) {
        this.zze = f;
        this.zzf = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzg(int i) {
        this.zzg = i;
        return this;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int zzh() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzcw zzi(float f) {
        this.zzh = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzj(int i) {
        this.zzi = i;
        return this;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int zzk() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzcw zzl(float f, int i) {
        this.zzk = f;
        this.zzj = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzm(float f) {
        this.zzl = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzn(float f) {
        this.zzm = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzo(int i) {
        this.zzn = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzp(float f) {
        this.zzo = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcw zzq(int i) {
        this.zzp = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzcx zzr() {
        return new com.google.android.gms.internal.ads.zzcx(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, this.zzn, this.zzo, this.zzp, null);
    }
}
