package com.google.firebase.auth.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import com.google.firebase.auth.ActionCodeInfo;
import com.google.firebase.auth.ActionCodeResult;

/* loaded from: classes4.dex */
public final class zzu implements ActionCodeResult {
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final ActionCodeInfo zzd;

    public zzu(zzaif zzaifVar) {
        int i;
        this.zzb = zzaifVar.zzg() ? zzaifVar.zzc() : zzaifVar.zzb();
        this.zzc = zzaifVar.zzb();
        ActionCodeInfo actionCodeInfo = null;
        if (!zzaifVar.zzh()) {
            this.zza = 3;
            this.zzd = null;
            return;
        }
        String zzd = zzaifVar.zzd();
        zzd.getClass();
        i = 5;
        switch (zzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i = 6;
                break;
            case "PASSWORD_RESET":
                i = 0;
                break;
            case "VERIFY_EMAIL":
                i = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i = 4;
                break;
            case "RECOVER_EMAIL":
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        this.zza = i;
        if (i == 4 || i == 3) {
            this.zzd = null;
            return;
        }
        if (zzaifVar.zzf()) {
            actionCodeInfo = new zzv(zzaifVar.zzb(), zzbk.zza(zzaifVar.zza()));
        } else if (zzaifVar.zzg()) {
            actionCodeInfo = new zzt(zzaifVar.zzc(), zzaifVar.zzb());
        } else if (zzaifVar.zze()) {
            actionCodeInfo = new zzs(zzaifVar.zzb());
        }
        this.zzd = actionCodeInfo;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    @Nullable
    public final String getData(int i) {
        if (this.zza == 4) {
            return null;
        }
        if (i == 0) {
            return this.zzb;
        }
        if (i != 1) {
            return null;
        }
        return this.zzc;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    @Nullable
    public final ActionCodeInfo getInfo() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final int getOperation() {
        return this.zza;
    }
}
