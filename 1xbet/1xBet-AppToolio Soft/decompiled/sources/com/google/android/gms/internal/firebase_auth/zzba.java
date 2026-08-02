package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzg;
import java.util.List;

/* loaded from: classes.dex */
public final class zzba implements com.google.firebase.auth.api.internal.zzcg<zzba, zzg.zze> {
    private String zzaf;
    private String zzah;
    private String zzai;
    private long zzaj;
    private String zzbh;
    private String zzbi;
    private String zzbr;
    private zzas zzjr;
    private Boolean zzkg;

    @Nullable
    public final String getEmail() {
        return this.zzah;
    }

    @Nullable
    public final String getIdToken() {
        return this.zzaf;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzba zza(zzg.zze zzeVar) {
        zzg.zze zzeVar2 = zzeVar;
        this.zzah = Strings.emptyToNull(zzeVar2.zzah);
        this.zzbi = Strings.emptyToNull(zzeVar2.zzby);
        this.zzkg = Boolean.valueOf(zzeVar2.zzbk);
        this.zzbh = Strings.emptyToNull(zzeVar2.zzbh);
        this.zzbr = Strings.emptyToNull(zzeVar2.zzbr);
        this.zzjr = zzas.zza(zzeVar2.zzbx);
        this.zzaf = Strings.emptyToNull(zzeVar2.zzaf);
        this.zzai = Strings.emptyToNull(zzeVar2.zzai);
        this.zzaj = zzeVar2.zzaj;
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.zze> zzag() {
        return zzg.zze.class;
    }

    @Nullable
    public final String zzap() {
        return this.zzai;
    }

    public final long zzaq() {
        return this.zzaj;
    }

    public final List<zzaq> zzat() {
        zzas zzasVar = this.zzjr;
        if (zzasVar != null) {
            return zzasVar.zzat();
        }
        return null;
    }
}
