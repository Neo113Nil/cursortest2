package p042f4;

import A1.AbstractC0021h;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzagv;
import com.google.firebase.auth.MultiFactorInfo;
import p097n3.a;

/* JADX INFO: loaded from: classes2.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0021h f12936b;

    public L(zzagv zzagvVar) {
        int i7 = 5;
        if (zzagvVar.zzg()) {
            zzagvVar.zzc();
        } else {
            zzagvVar.zzb();
        }
        zzagvVar.zzb();
        AbstractC0021h k7 = null;
        if (!zzagvVar.zzh()) {
            this.f12935a = 3;
            this.f12936b = null;
            return;
        }
        String strZzd = zzagvVar.zzd();
        strZzd.getClass();
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i7 = 6;
                break;
            case "PASSWORD_RESET":
                i7 = 0;
                break;
            case "VERIFY_EMAIL":
                i7 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i7 = 4;
                break;
            case "RECOVER_EMAIL":
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        this.f12935a = i7;
        if (i7 == 4 || i7 == 3) {
            this.f12936b = null;
            return;
        }
        if (zzagvVar.zzf()) {
            String strZzb = zzagvVar.zzb();
            MultiFactorInfo multiFactorInfoD0 = a.d0(zzagvVar.zza());
            k7 = new K();
            D.e(strZzb);
            k7.f364a = strZzb;
            D.i(multiFactorInfoD0);
        } else if (zzagvVar.zzg()) {
            k7 = new I(zzagvVar.zzc(), zzagvVar.zzb());
        } else if (zzagvVar.zze()) {
            String strZzb2 = zzagvVar.zzb();
            k7 = new K();
            D.e(strZzb2);
            k7.f364a = strZzb2;
        }
        this.f12936b = k7;
    }
}
