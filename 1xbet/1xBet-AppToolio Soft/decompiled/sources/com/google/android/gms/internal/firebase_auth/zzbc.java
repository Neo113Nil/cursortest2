package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzg;

/* loaded from: classes.dex */
public final class zzbc implements com.google.firebase.auth.api.internal.zzcg<zzbc, zzg.zzf> {
    private String zzaf;
    private String zzah;
    private String zzai;
    private long zzaj;
    private String zzbh;

    public final String getIdToken() {
        return this.zzaf;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzbc zza(zzg.zzf zzfVar) {
        zzg.zzf zzfVar2 = zzfVar;
        this.zzaf = Strings.emptyToNull(zzfVar2.zzaf);
        this.zzbh = Strings.emptyToNull(zzfVar2.zzbh);
        this.zzah = Strings.emptyToNull(zzfVar2.zzah);
        this.zzai = Strings.emptyToNull(zzfVar2.zzai);
        this.zzaj = zzfVar2.zzaj;
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.zzf> zzag() {
        return zzg.zzf.class;
    }

    @NonNull
    public final String zzap() {
        return this.zzai;
    }

    public final long zzaq() {
        return this.zzaj;
    }
}
