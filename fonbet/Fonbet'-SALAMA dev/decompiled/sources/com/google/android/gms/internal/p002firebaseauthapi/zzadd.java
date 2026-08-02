package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.MultiFactorInfo;
import f4.InterfaceC1088E;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
final class zzadd extends zzady<String, InterfaceC1088E> {
    private final String zzu;
    private final String zzv;

    public zzadd(String str, String str2) {
        super(4);
        D.f(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        char c3 = 5;
        char c4 = 3;
        zzagv zzagvVar = this.zzm;
        if (zzagvVar.zzg()) {
            zzagvVar.zzc();
        } else {
            zzagvVar.zzb();
        }
        zzagvVar.zzb();
        if (zzagvVar.zzh()) {
            String zzd = zzagvVar.zzd();
            zzd.getClass();
            switch (zzd) {
                case "REVERT_SECOND_FACTOR_ADDITION":
                    c3 = 6;
                    break;
                case "PASSWORD_RESET":
                    c3 = 0;
                    break;
                case "VERIFY_EMAIL":
                    c3 = 1;
                    break;
                case "VERIFY_AND_CHANGE_EMAIL":
                    break;
                case "EMAIL_SIGNIN":
                    c3 = 4;
                    break;
                case "RECOVER_EMAIL":
                    c3 = 2;
                    break;
                default:
                    c3 = 3;
                    break;
            }
            if (c3 != 4 && c3 != 3) {
                if (zzagvVar.zzf()) {
                    String zzb = zzagvVar.zzb();
                    MultiFactorInfo d02 = AbstractC1464a.d0(zzagvVar.zza());
                    D.e(zzb);
                    D.i(d02);
                } else if (zzagvVar.zzg()) {
                    String zzc = zzagvVar.zzc();
                    String zzb2 = zzagvVar.zzb();
                    D.e(zzc);
                    D.e(zzb2);
                } else if (zzagvVar.zze()) {
                    D.e(zzagvVar.zzb());
                }
            }
            c4 = c3;
        }
        if (c4 != 0) {
            zza(new Status(17499, null, null, null));
        } else {
            zzb(this.zzm.zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzd(this.zzu, this.zzv, this.zzb);
    }
}
