package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzg;

/* loaded from: classes.dex */
public final class zzab implements com.google.firebase.auth.api.internal.zzcg<zzab, zzg.zzb> {
    private String zzad;
    private String zzaf;
    private String zzah;
    private String zzai;
    private long zzaj;
    private boolean zzak;

    @NonNull
    public final String getIdToken() {
        return this.zzaf;
    }

    public final boolean isNewUser() {
        return this.zzak;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzab zza(zzg.zzb zzbVar) {
        zzg.zzb zzbVar2 = zzbVar;
        this.zzad = Strings.emptyToNull(zzbVar2.zzad);
        this.zzah = Strings.emptyToNull(zzbVar2.zzah);
        this.zzaf = Strings.emptyToNull(zzbVar2.zzaf);
        this.zzai = Strings.emptyToNull(zzbVar2.zzai);
        this.zzak = zzbVar2.zzak;
        this.zzaj = zzbVar2.zzaj;
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.zzb> zzag() {
        return zzg.zzb.class;
    }

    @NonNull
    public final String zzap() {
        return this.zzai;
    }

    public final long zzaq() {
        return this.zzaj;
    }
}
