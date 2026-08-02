package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeSettings;

/* loaded from: classes.dex */
public final class zzan implements com.google.firebase.auth.api.internal.zzdp<zzl> {
    private String zzaf;
    private String zzah;
    private ActionCodeSettings zzhb;
    private String zzjw;

    public zzan(@NonNull int i) {
        this.zzjw = i != 1 ? i != 4 ? i != 6 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final zzan zza(@NonNull ActionCodeSettings actionCodeSettings) {
        this.zzhb = (ActionCodeSettings) Preconditions.checkNotNull(actionCodeSettings);
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzdp
    public final /* synthetic */ zzl zzao() {
        char c;
        zzl zzlVar = new zzl();
        String str = this.zzjw;
        int hashCode = str.hashCode();
        int i = 1;
        if (hashCode == -1452371317) {
            if (str.equals("PASSWORD_RESET")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1341836234) {
            if (hashCode == 870738373 && str.equals("EMAIL_SIGNIN")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("VERIFY_EMAIL")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                break;
            case 1:
                i = 4;
                break;
            case 2:
                i = 6;
                break;
            default:
                i = Integer.MIN_VALUE;
                break;
        }
        zzlVar.zzao = i;
        zzlVar.zzah = this.zzah;
        zzlVar.zzaf = this.zzaf;
        ActionCodeSettings actionCodeSettings = this.zzhb;
        if (actionCodeSettings != null) {
            zzlVar.zzat = actionCodeSettings.getUrl();
            zzlVar.zzau = this.zzhb.getIOSBundle();
            zzlVar.zzav = this.zzhb.zzf();
            zzlVar.zzaw = this.zzhb.getAndroidPackageName();
            zzlVar.zzax = this.zzhb.getAndroidInstallApp();
            zzlVar.zzay = this.zzhb.getAndroidMinimumVersion();
            zzlVar.zzaz = this.zzhb.canHandleCodeInApp();
        }
        return zzlVar;
    }

    public final zzan zzp(@NonNull String str) {
        this.zzah = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzan zzq(@NonNull String str) {
        this.zzaf = Preconditions.checkNotEmpty(str);
        return this;
    }
}
