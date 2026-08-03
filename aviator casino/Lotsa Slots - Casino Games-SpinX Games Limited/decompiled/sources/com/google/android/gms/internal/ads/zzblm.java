package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzblm extends com.google.android.gms.internal.ads.zzblw {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final java.lang.String zzd;
    private final java.util.List zze = new java.util.ArrayList();
    private final java.util.List zzf = new java.util.ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = android.graphics.Color.rgb(12, 174, 206);
        zzc = rgb;
        zza = android.graphics.Color.rgb(204, 204, 204);
        zzb = rgb;
    }

    public zzblm(java.lang.String str, java.util.List list, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, int i2, boolean z) {
        this.zzd = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            com.google.android.gms.internal.ads.zzblp zzblpVar = (com.google.android.gms.internal.ads.zzblp) list.get(i3);
            this.zze.add(zzblpVar);
            this.zzf.add(zzblpVar);
        }
        this.zzg = num != null ? num.intValue() : zza;
        this.zzh = num2 != null ? num2.intValue() : zzb;
        this.zzi = num3 != null ? num3.intValue() : 12;
        this.zzj = i;
        this.zzk = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final java.lang.String zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final java.util.List zzc() {
        return this.zzf;
    }

    public final java.util.List zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final int zzg() {
        return this.zzi;
    }

    public final int zzh() {
        return this.zzj;
    }

    public final int zzi() {
        return this.zzk;
    }
}
