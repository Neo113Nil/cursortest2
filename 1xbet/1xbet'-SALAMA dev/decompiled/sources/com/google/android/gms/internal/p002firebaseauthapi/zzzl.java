package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.List;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzzl {
    private String zza;
    private List<zzags> zzb;
    private zze zzc;

    public zzzl(String str, List<zzags> list, zze zzeVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzeVar;
    }

    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return a.f0(this.zzb);
    }
}
