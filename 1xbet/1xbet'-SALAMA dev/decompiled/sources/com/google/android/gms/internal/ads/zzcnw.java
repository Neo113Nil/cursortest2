package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class zzcnw {
    private final zzcpu zza;
    private final View zzb;
    private final zzfag zzc;
    private final zzceb zzd;

    public zzcnw(View view, zzceb zzcebVar, zzcpu zzcpuVar, zzfag zzfagVar) {
        this.zzb = view;
        this.zzd = zzcebVar;
        this.zza = zzcpuVar;
        this.zzc = zzfagVar;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzceb zzb() {
        return this.zzd;
    }

    public final zzcpu zzc() {
        return this.zza;
    }

    public zzcwc zzd(Set set) {
        return new zzcwc(set);
    }

    public final zzfag zze() {
        return this.zzc;
    }
}
