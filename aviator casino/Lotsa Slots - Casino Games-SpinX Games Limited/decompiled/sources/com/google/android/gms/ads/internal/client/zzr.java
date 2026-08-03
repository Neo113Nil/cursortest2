package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzr> CREATOR = new com.google.android.gms.ads.internal.client.zzs();
    public final java.lang.String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final com.google.android.gms.ads.internal.client.zzr[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;
    public boolean zzp;

    public zzr() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static int zza(android.util.DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static com.google.android.gms.ads.internal.client.zzr zzb() {
        return new com.google.android.gms.ads.internal.client.zzr("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static com.google.android.gms.ads.internal.client.zzr zzc() {
        return new com.google.android.gms.ads.internal.client.zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public static com.google.android.gms.ads.internal.client.zzr zzd() {
        return new com.google.android.gms.ads.internal.client.zzr("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    private static int zze(android.util.DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzr(android.content.Context context, com.google.android.gms.ads.AdSize adSize) {
        this(context, new com.google.android.gms.ads.AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzr(android.content.Context context, com.google.android.gms.ads.AdSize[] adSizeArr) {
        int height;
        int i;
        int i2;
        java.lang.String sb;
        int i3;
        double d;
        com.google.android.gms.ads.AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzc.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzc.zzg(adSize);
        this.zzo = com.google.android.gms.ads.zzc.zzd(adSize);
        this.zzp = com.google.android.gms.ads.zzc.zzi(adSize);
        if (isFluid) {
            this.zze = com.google.android.gms.ads.AdSize.BANNER.getWidth();
            height = com.google.android.gms.ads.AdSize.BANNER.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zzh(adSize);
            this.zzb = height;
        } else if (this.zzo) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzc.zze(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        boolean z = this.zze == -1;
        boolean z2 = height == -2;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (r7.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        int i4 = displayMetrics2.heightPixels;
                        int i5 = displayMetrics2.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics2);
                        int i6 = displayMetrics2.heightPixels;
                        int i7 = displayMetrics2.widthPixels;
                        if (i6 == i4 && i7 == i5) {
                            int i8 = displayMetrics.widthPixels;
                            com.google.android.gms.ads.internal.client.zzay.zza();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            i3 = i8 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i3;
                            d = i3 / displayMetrics.density;
                            i = (int) d;
                            if (d - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i3 = displayMetrics.widthPixels;
            this.zzf = i3;
            d = i3 / displayMetrics.density;
            i = (int) d;
            if (d - i >= 0.01d) {
            }
        } else {
            i = this.zze;
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.zzf = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, this.zze);
        }
        if (z2) {
            i2 = zze(displayMetrics);
        } else {
            i2 = this.zzb;
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, i2);
        if (z || z2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(i2).length() + 3);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("_as");
            this.zza = sb2.toString();
        } else {
            if (this.zzn || this.zzo) {
                int i9 = this.zze;
                int i10 = this.zzb;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i9).length() + 1 + java.lang.String.valueOf(i10).length() + 3);
                sb3.append(i9);
                sb3.append("x");
                sb3.append(i10);
                sb3.append("_as");
                sb = sb3.toString();
            } else if (!isFluid) {
                this.zza = adSize.toString();
            } else {
                sb = "320x50_mb";
            }
            this.zza = sb;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new com.google.android.gms.ads.internal.client.zzr[length];
            for (int i11 = 0; i11 < adSizeArr.length; i11++) {
                this.zzg[i11] = new com.google.android.gms.ads.internal.client.zzr(context, adSizeArr[i11]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    zzr(java.lang.String str, int i, int i2, boolean z, int i3, int i4, com.google.android.gms.ads.internal.client.zzr[] zzrVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzrVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
        this.zzp = z10;
    }
}
