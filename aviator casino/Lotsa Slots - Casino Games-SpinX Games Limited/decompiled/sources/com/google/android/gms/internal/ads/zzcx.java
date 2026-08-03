package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcx {
    private static final java.lang.String zzA;
    private static final java.lang.String zzB;
    private static final java.lang.String zzC;
    private static final java.lang.String zzD;
    private static final java.lang.String zzE;
    private static final java.lang.String zzF;
    private static final java.lang.String zzG;
    private static final java.lang.String zzH;
    private static final java.lang.String zzI;
    private static final java.lang.String zzq;
    private static final java.lang.String zzr;
    private static final java.lang.String zzs;
    private static final java.lang.String zzt;
    private static final java.lang.String zzu;
    private static final java.lang.String zzv;
    private static final java.lang.String zzw;
    private static final java.lang.String zzx;
    private static final java.lang.String zzy;
    private static final java.lang.String zzz;
    public final java.lang.CharSequence zza;
    public final android.text.Layout.Alignment zzb;
    public final android.text.Layout.Alignment zzc;
    public final android.graphics.Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;

    static {
        com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
        zzcwVar.zza("");
        zzcwVar.zzr();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzq = java.lang.Integer.toString(0, 36);
        zzr = java.lang.Integer.toString(17, 36);
        zzs = java.lang.Integer.toString(1, 36);
        zzt = java.lang.Integer.toString(2, 36);
        java.lang.Integer.toString(3, 36);
        zzu = java.lang.Integer.toString(18, 36);
        zzv = java.lang.Integer.toString(4, 36);
        zzw = java.lang.Integer.toString(5, 36);
        zzx = java.lang.Integer.toString(6, 36);
        zzy = java.lang.Integer.toString(7, 36);
        zzz = java.lang.Integer.toString(8, 36);
        zzA = java.lang.Integer.toString(9, 36);
        zzB = java.lang.Integer.toString(10, 36);
        zzC = java.lang.Integer.toString(11, 36);
        zzD = java.lang.Integer.toString(12, 36);
        zzE = java.lang.Integer.toString(13, 36);
        zzF = java.lang.Integer.toString(14, 36);
        zzG = java.lang.Integer.toString(15, 36);
        zzH = java.lang.Integer.toString(16, 36);
        zzI = java.lang.Integer.toString(19, 36);
    }

    public final boolean equals(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzcx zzcxVar = (com.google.android.gms.internal.ads.zzcx) obj;
            if (android.text.TextUtils.equals(this.zza, zzcxVar.zza) && this.zzb == zzcxVar.zzb && this.zzc == zzcxVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzcxVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzcxVar.zzd == null) && this.zze == zzcxVar.zze && this.zzf == zzcxVar.zzf && this.zzg == zzcxVar.zzg && this.zzh == zzcxVar.zzh && this.zzi == zzcxVar.zzi && this.zzj == zzcxVar.zzj && this.zzk == zzcxVar.zzk && this.zzl == zzcxVar.zzl && this.zzm == zzcxVar.zzm && this.zzn == zzcxVar.zzn && this.zzo == zzcxVar.zzo && this.zzp == zzcxVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, java.lang.Float.valueOf(this.zze), java.lang.Integer.valueOf(this.zzf), java.lang.Integer.valueOf(this.zzg), java.lang.Float.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi), java.lang.Float.valueOf(this.zzj), java.lang.Float.valueOf(this.zzk), false, java.lang.Integer.valueOf(androidx.core.view.ViewCompat.MEASURED_STATE_MASK), java.lang.Integer.valueOf(this.zzl), java.lang.Float.valueOf(this.zzm), java.lang.Integer.valueOf(this.zzn), java.lang.Float.valueOf(this.zzo), java.lang.Integer.valueOf(this.zzp));
    }

    public final com.google.android.gms.internal.ads.zzcw zza() {
        return new com.google.android.gms.internal.ads.zzcw(this, null);
    }

    public final android.os.Bundle zzb() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzq, charSequence);
            if (charSequence instanceof android.text.Spanned) {
                java.util.ArrayList<? extends android.os.Parcelable> zza = com.google.android.gms.internal.ads.zzda.zza((android.text.Spanned) charSequence);
                if (!zza.isEmpty()) {
                    bundle.putParcelableArrayList(zzr, zza);
                }
            }
        }
        bundle.putSerializable(zzs, this.zzb);
        bundle.putSerializable(zzt, this.zzc);
        bundle.putFloat(zzv, this.zze);
        bundle.putInt(zzw, this.zzf);
        bundle.putInt(zzx, this.zzg);
        bundle.putFloat(zzy, this.zzh);
        bundle.putInt(zzz, this.zzi);
        bundle.putInt(zzA, this.zzl);
        bundle.putFloat(zzB, this.zzm);
        bundle.putFloat(zzC, this.zzj);
        bundle.putFloat(zzD, this.zzk);
        bundle.putBoolean(zzF, false);
        bundle.putInt(zzE, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        bundle.putInt(zzG, this.zzn);
        bundle.putFloat(zzH, this.zzo);
        bundle.putInt(zzI, this.zzp);
        android.graphics.Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.android.gms.internal.ads.zzgtj.zzi(bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzu, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    /* synthetic */ zzcx(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.text.Layout.Alignment alignment2, android.graphics.Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7, byte[] bArr) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            com.google.android.gms.internal.ads.zzgtj.zza(bitmap == null);
        }
        if (charSequence instanceof android.text.Spanned) {
            this.zza = android.text.SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = f2;
        this.zzi = i3;
        this.zzj = f4;
        this.zzk = f5;
        this.zzl = i4;
        this.zzm = f3;
        this.zzn = i6;
        this.zzo = f6;
        this.zzp = i7;
    }
}
