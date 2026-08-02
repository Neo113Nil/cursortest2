package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.zze;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzaas {
    private String zza;
    private List<zzahy> zzb;

    @Nullable
    private zze zzc;

    public zzaas(String str, List<zzahy> list, @Nullable zze zzeVar) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzeVar;
    }

    @Nullable
    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<MultiFactorInfo> zzc() {
        return zzbk.zza(this.zzb);
    }
}
