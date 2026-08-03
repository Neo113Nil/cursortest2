package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzblp extends com.google.android.gms.internal.ads.zzbmd {
    private final android.graphics.drawable.Drawable zza;
    private final android.net.Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final java.util.Map zzf;

    public zzblp(android.graphics.drawable.Drawable drawable, android.net.Uri uri, double d, int i, int i2, java.util.Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d;
        this.zzd = i;
        this.zze = i2;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final android.net.Uri zzc() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final java.util.Map zzg() {
        return this.zzf;
    }
}
