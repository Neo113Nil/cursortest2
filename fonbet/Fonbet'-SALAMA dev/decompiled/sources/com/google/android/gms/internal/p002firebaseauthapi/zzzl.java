package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.List;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
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
        return AbstractC1464a.f0(this.zzb);
    }
}
