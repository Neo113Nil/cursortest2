package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzg;

/* loaded from: classes.dex */
public final class zzbm implements com.google.firebase.auth.api.internal.zzcg<zzbm, zzg.zzi> {
    private String zzad;
    private String zzaf;
    private String zzah;
    private String zzai;
    private long zzaj;
    private String zzbh;
    private String zzbr;

    @NonNull
    public final String getIdToken() {
        return this.zzaf;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzbm zza(zzg.zzi zziVar) {
        zzg.zzi zziVar2 = zziVar;
        this.zzad = Strings.emptyToNull(zziVar2.zzad);
        this.zzah = Strings.emptyToNull(zziVar2.zzah);
        this.zzbh = Strings.emptyToNull(zziVar2.zzbh);
        this.zzaf = Strings.emptyToNull(zziVar2.zzaf);
        this.zzbr = Strings.emptyToNull(zziVar2.zzbr);
        this.zzai = Strings.emptyToNull(zziVar2.zzai);
        this.zzaj = zziVar2.zzaj;
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.zzi> zzag() {
        return zzg.zzi.class;
    }

    @NonNull
    public final String zzap() {
        return this.zzai;
    }

    public final long zzaq() {
        return this.zzaj;
    }
}
