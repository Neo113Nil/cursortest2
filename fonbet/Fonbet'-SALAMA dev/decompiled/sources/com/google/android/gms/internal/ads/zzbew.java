package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbew extends zzbfi {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbew(Drawable drawable, Uri uri, double d7, int i7, int i8) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d7;
        this.zzd = i7;
        this.zze = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final double zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final Uri zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final InterfaceC1506a zzf() {
        return new BinderC1507b(this.zza);
    }
}
