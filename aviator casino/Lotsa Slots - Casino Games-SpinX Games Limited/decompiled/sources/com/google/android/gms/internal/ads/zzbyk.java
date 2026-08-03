package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyk extends com.google.android.gms.ads.nativead.NativeAd.Image {
    private final com.google.android.gms.internal.ads.zzbme zzb;
    private final android.graphics.drawable.Drawable zzc;
    private final android.net.Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|(17:5|6|7|8|9|10|11|12|13|14|15|16|17|18|(2:23|24)|20|21)|40|6|7|8|9|10|11|12|13|14|15|16|17|18|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r2);
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0031, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0032, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r5);
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0023, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0024, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzg("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbyk(com.google.android.gms.internal.ads.zzbme zzbmeVar) {
        android.graphics.drawable.Drawable drawable;
        com.google.android.gms.dynamic.IObjectWrapper zzb;
        this.zzb = zzbmeVar;
        java.util.Map map = null;
        try {
            zzb = zzbmeVar.zzb();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
        if (zzb != null) {
            drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzb);
            this.zzc = drawable;
            android.net.Uri uri = this.zzb.zzc();
            this.zzd = uri;
            double d = this.zzb.zzd();
            this.zze = d;
            int i = -1;
            int i2 = this.zzb.zze();
            this.zzf = i2;
            i = this.zzb.zzf();
            this.zzg = i;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeP)).booleanValue()) {
                try {
                    map = this.zzb.zzg();
                } catch (android.os.RemoteException unused) {
                }
            }
            this.zza = map;
        }
        drawable = null;
        this.zzc = drawable;
        android.net.Uri uri2 = this.zzb.zzc();
        this.zzd = uri2;
        double d2 = this.zzb.zzd();
        this.zze = d2;
        int i3 = -1;
        int i22 = this.zzb.zze();
        this.zzf = i22;
        i3 = this.zzb.zzf();
        this.zzg = i3;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeP)).booleanValue()) {
        }
        this.zza = map;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final android.graphics.drawable.Drawable getDrawable() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final android.net.Uri getUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zzg;
    }
}
