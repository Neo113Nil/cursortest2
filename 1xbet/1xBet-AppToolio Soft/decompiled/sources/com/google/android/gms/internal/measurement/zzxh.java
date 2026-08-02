package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzxh {
    private final String zzbpu;
    private final Uri zzbpv;
    private final String zzbpw;
    private final String zzbpx;
    private final boolean zzbpy;
    private final boolean zzbpz;

    public zzxh(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    private zzxh(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.zzbpu = null;
        this.zzbpv = uri;
        this.zzbpw = str2;
        this.zzbpx = str3;
        this.zzbpy = false;
        this.zzbpz = false;
    }

    public final zzwx<Double> zzb(String str, double d) {
        zzwx<Double> zza;
        zza = zzwx.zza(this, str, d);
        return zza;
    }

    public final zzwx<Integer> zzd(String str, int i) {
        zzwx<Integer> zza;
        zza = zzwx.zza(this, str, i);
        return zza;
    }

    public final zzwx<Long> zze(String str, long j) {
        zzwx<Long> zza;
        zza = zzwx.zza(this, str, j);
        return zza;
    }

    public final zzwx<Boolean> zzf(String str, boolean z) {
        zzwx<Boolean> zza;
        zza = zzwx.zza(this, str, z);
        return zza;
    }

    public final zzwx<String> zzv(String str, String str2) {
        zzwx<String> zza;
        zza = zzwx.zza(this, str, str2);
        return zza;
    }
}
