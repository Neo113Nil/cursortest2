package com.google.android.gms.internal.ads;

import L2.d;
import android.location.Location;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzbpg implements d {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbpg(Date date, int i7, Set set, Location location, boolean z4, int i8, boolean z7, int i9, String str) {
        this.zza = date;
        this.zzb = i7;
        this.zzc = set;
        this.zze = location;
        this.zzd = z4;
        this.zzf = i8;
        this.zzg = z7;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // L2.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // L2.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    @Override // L2.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // L2.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
