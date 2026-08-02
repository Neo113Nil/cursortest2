package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzg;

/* loaded from: classes.dex */
public final class zzbh implements com.google.firebase.auth.api.internal.zzcg<zzbh, zzg.C0009zzg> {
    private String zzad;
    private String zzaf;
    private String zzah;
    private String zzai;
    private long zzaj;
    private boolean zzak;
    private String zzbh;
    private String zzbr;
    private String zzdf;
    private String zzj;
    private boolean zzkl;
    private boolean zzkm;
    private String zzkn;
    private String zzko;

    public final String getIdToken() {
        return this.zzaf;
    }

    public final String getProviderId() {
        return this.zzj;
    }

    public final String getRawUserInfo() {
        return this.zzdf;
    }

    public final boolean isNewUser() {
        return this.zzak;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzbh zza(zzg.C0009zzg c0009zzg) {
        zzg.C0009zzg c0009zzg2 = c0009zzg;
        this.zzkl = c0009zzg2.zzcu;
        this.zzkm = c0009zzg2.zzdb;
        this.zzaf = Strings.emptyToNull(c0009zzg2.zzaf);
        this.zzai = Strings.emptyToNull(c0009zzg2.zzai);
        this.zzaj = c0009zzg2.zzaj;
        this.zzad = Strings.emptyToNull(c0009zzg2.zzad);
        this.zzah = Strings.emptyToNull(c0009zzg2.zzah);
        this.zzbh = Strings.emptyToNull(c0009zzg2.zzbh);
        this.zzbr = Strings.emptyToNull(c0009zzg2.zzbr);
        this.zzj = Strings.emptyToNull(c0009zzg2.zzj);
        this.zzdf = Strings.emptyToNull(c0009zzg2.zzdf);
        this.zzak = c0009zzg2.zzak;
        this.zzkn = c0009zzg2.zzcx;
        this.zzko = c0009zzg2.zzdd;
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.C0009zzg> zzag() {
        return zzg.C0009zzg.class;
    }

    @Nullable
    public final String zzap() {
        return this.zzai;
    }

    public final long zzaq() {
        return this.zzaj;
    }

    @Nullable
    public final com.google.firebase.auth.zzd zzav() {
        if (TextUtils.isEmpty(this.zzkn) && TextUtils.isEmpty(this.zzko)) {
            return null;
        }
        return com.google.firebase.auth.zzd.zza(this.zzj, this.zzko, this.zzkn);
    }

    public final boolean zzbe() {
        return this.zzkl;
    }
}
