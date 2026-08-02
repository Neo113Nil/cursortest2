package com.google.firebase.auth.internal;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
final class zzm extends zzi {
    private String zza;
    private String zzb;
    private String zzc;

    @Override // com.google.firebase.auth.internal.zzi
    public final zzi zza(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzi zzb(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzi zzc(@Nullable String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzj zza() {
        return new zzn(this.zza, this.zzb, this.zzc);
    }
}
