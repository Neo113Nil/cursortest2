package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcho {
    private static final boolean zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzbjc zze;
    private final com.google.android.gms.internal.ads.zzbjf zzf;
    private final com.google.android.gms.ads.internal.util.zzbf zzg;
    private final long[] zzh;
    private final java.lang.String[] zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzcgt zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;

    static {
        zza = com.google.android.gms.ads.internal.client.zzay.zzh().nextInt(100) < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoh)).intValue();
    }

    public zzcho(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.internal.ads.zzbjf zzbjfVar, com.google.android.gms.internal.ads.zzbjc zzbjcVar) {
        com.google.android.gms.ads.internal.util.zzbe zzbeVar = new com.google.android.gms.ads.internal.util.zzbe();
        zzbeVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbeVar.zza("1_5", 1.0d, 5.0d);
        zzbeVar.zza("5_10", 5.0d, 10.0d);
        zzbeVar.zza("10_20", 10.0d, 20.0d);
        zzbeVar.zza("20_30", 20.0d, 30.0d);
        zzbeVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbeVar.zzb();
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzr = -1L;
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbjfVar;
        this.zze = zzbjcVar;
        java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzao);
        if (str2 == null) {
            this.zzi = new java.lang.String[0];
            this.zzh = new long[0];
            return;
        }
        java.lang.String[] split = android.text.TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new java.lang.String[length];
        this.zzh = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzh[i] = java.lang.Long.parseLong(split[i]);
            } catch (java.lang.NumberFormatException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzcgt zzcgtVar) {
        com.google.android.gms.internal.ads.zzbjf zzbjfVar = this.zzf;
        com.google.android.gms.internal.ads.zzbix.zza(zzbjfVar, this.zze, "vpc2");
        this.zzj = true;
        zzbjfVar.zzd("vpn", zzcgtVar.zza());
        this.zzo = zzcgtVar;
    }

    public final void zzb() {
        if (!this.zzj || this.zzk) {
            return;
        }
        com.google.android.gms.internal.ads.zzbix.zza(this.zzf, this.zze, "vfr2");
        this.zzk = true;
    }

    public final void zzc() {
        if (!zza || this.zzp) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzc);
        bundle.putString("player", this.zzo.zza());
        for (com.google.android.gms.ads.internal.util.zzbd zzbdVar : this.zzg.zzb()) {
            java.lang.String str = zzbdVar.zza;
            java.lang.String.valueOf(str);
            java.lang.String valueOf = java.lang.String.valueOf(str);
            bundle.putString("fps_c_".concat(valueOf), java.lang.Integer.toString(zzbdVar.zze));
            java.lang.String.valueOf(str);
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            bundle.putString("fps_p_".concat(valueOf2), java.lang.Double.toString(zzbdVar.zzd));
        }
        int i = 0;
        while (true) {
            long[] jArr = this.zzh;
            if (i >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzc().zzg(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                this.zzp = true;
                return;
            }
            java.lang.String str2 = this.zzi[i];
            if (str2 != null) {
                java.lang.Long valueOf3 = java.lang.Long.valueOf(jArr[i]);
                new java.lang.StringBuilder(valueOf3.toString().length() + 3);
                java.util.Objects.toString(valueOf3);
                bundle.putString("fh_".concat(valueOf3.toString()), str2);
            }
            i++;
        }
    }

    public final void zzd(com.google.android.gms.internal.ads.zzcgt zzcgtVar) {
        if (this.zzl && !this.zzm) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzm) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            com.google.android.gms.internal.ads.zzbix.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzk().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zza(java.util.concurrent.TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzr));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzap)).longValue();
        long zzh = zzcgtVar.zzh();
        int i = 0;
        while (true) {
            java.lang.String[] strArr = this.zzi;
            if (i >= strArr.length) {
                return;
            }
            if (strArr[i] == null && longValue > java.lang.Math.abs(zzh - this.zzh[i])) {
                int i2 = 8;
                android.graphics.Bitmap bitmap = zzcgtVar.getBitmap(8, 8);
                long j = 63;
                long j2 = 0;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((android.graphics.Color.blue(pixel) + android.graphics.Color.red(pixel)) + android.graphics.Color.green(pixel) > 128 ? 1L : 0L) << ((int) j);
                        j--;
                        i4++;
                        i2 = 8;
                    }
                    i3++;
                    i2 = 8;
                }
                strArr[i] = java.lang.String.format("%016X", java.lang.Long.valueOf(j2));
                return;
            }
            i++;
        }
    }

    public final void zze() {
        this.zzn = true;
        if (!this.zzk || this.zzl) {
            return;
        }
        com.google.android.gms.internal.ads.zzbix.zza(this.zzf, this.zze, "vfp2");
        this.zzl = true;
    }

    public final void zzf() {
        this.zzn = false;
    }
}
