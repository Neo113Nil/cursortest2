package com.google.firebase.auth.api.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzh implements zzdk<com.google.android.gms.internal.firebase_auth.zzba> {
    private final /* synthetic */ zzcb zzfl;
    private final /* synthetic */ zza zzfm;
    private final /* synthetic */ zzdj zzfo;
    private final /* synthetic */ com.google.android.gms.internal.firebase_auth.zzao zzfp;
    private final /* synthetic */ com.google.android.gms.internal.firebase_auth.zzaz zzfq;
    private final /* synthetic */ com.google.android.gms.internal.firebase_auth.zzaj zzfr;

    zzh(zza zzaVar, com.google.android.gms.internal.firebase_auth.zzaz zzazVar, com.google.android.gms.internal.firebase_auth.zzaj zzajVar, zzcb zzcbVar, com.google.android.gms.internal.firebase_auth.zzao zzaoVar, zzdj zzdjVar) {
        this.zzfm = zzaVar;
        this.zzfq = zzazVar;
        this.zzfr = zzajVar;
        this.zzfl = zzcbVar;
        this.zzfp = zzaoVar;
        this.zzfo = zzdjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    @Override // com.google.firebase.auth.api.internal.zzdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void onSuccess(@NonNull com.google.android.gms.internal.firebase_auth.zzba zzbaVar) {
        com.google.android.gms.internal.firebase_auth.zzaj zzajVar;
        List<com.google.android.gms.internal.firebase_auth.zzaq> zzat;
        com.google.android.gms.internal.firebase_auth.zzao zza;
        com.google.android.gms.internal.firebase_auth.zzba zzbaVar2 = zzbaVar;
        String str = null;
        if (this.zzfq.zzu("EMAIL")) {
            this.zzfr.zzl(null);
        } else if (this.zzfq.getEmail() != null) {
            this.zzfr.zzl(this.zzfq.getEmail());
        }
        if (this.zzfq.zzu("DISPLAY_NAME")) {
            this.zzfr.zzm(null);
        } else if (this.zzfq.getDisplayName() != null) {
            this.zzfr.zzm(this.zzfq.getDisplayName());
        }
        if (!this.zzfq.zzu("PHOTO_URL")) {
            if (this.zzfq.zzt() != null) {
                zzajVar = this.zzfr;
                str = this.zzfq.zzt();
            }
            if (!TextUtils.isEmpty(this.zzfq.getPassword())) {
                this.zzfr.zzo(Base64Utils.encode("redacted".getBytes()));
            }
            zzat = zzbaVar2.zzat();
            if (zzat == null) {
                zzat = new ArrayList<>();
            }
            this.zzfr.zzb(zzat);
            zzcb zzcbVar = this.zzfl;
            zza zzaVar = this.zzfm;
            zza = zza.zza(this.zzfp, zzbaVar2);
            zzcbVar.zza(zza, this.zzfr);
        }
        zzajVar = this.zzfr;
        zzajVar.zzn(str);
        if (!TextUtils.isEmpty(this.zzfq.getPassword())) {
        }
        zzat = zzbaVar2.zzat();
        if (zzat == null) {
        }
        this.zzfr.zzb(zzat);
        zzcb zzcbVar2 = this.zzfl;
        zza zzaVar2 = this.zzfm;
        zza = zza.zza(this.zzfp, zzbaVar2);
        zzcbVar2.zza(zza, this.zzfr);
    }

    @Override // com.google.firebase.auth.api.internal.zzdj
    public final void zzc(@Nullable String str) {
        this.zzfo.zzc(str);
    }
}
