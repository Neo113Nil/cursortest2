package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzabj implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ zzajg zzb;
    private final /* synthetic */ zzael zzc;

    public zzabj(zzaar zzaarVar, zzajg zzajgVar, zzael zzaelVar) {
        this.zzb = zzajgVar;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzc.zza(zzao.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzaft zzaftVar;
        this.zzb.zza(zzahvVar.zzc());
        zzaftVar = this.zza.zza;
        zzaftVar.zza(this.zzb, new zzabm(this, this.zzc, this));
    }
}
