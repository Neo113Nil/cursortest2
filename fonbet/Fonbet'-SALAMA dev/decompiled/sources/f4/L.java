package f4;

import A1.AbstractC0021h;
import com.google.android.gms.internal.p002firebaseauthapi.zzagv;
import com.google.firebase.auth.MultiFactorInfo;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final int f12929a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0021h f12930b;

    public L(zzagv zzagvVar) {
        int i7 = 5;
        if (zzagvVar.zzg()) {
            zzagvVar.zzc();
        } else {
            zzagvVar.zzb();
        }
        zzagvVar.zzb();
        AbstractC0021h abstractC0021h = null;
        if (!zzagvVar.zzh()) {
            this.f12929a = 3;
            this.f12930b = null;
            return;
        }
        String zzd = zzagvVar.zzd();
        zzd.getClass();
        switch (zzd) {
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
        this.f12929a = i7;
        if (i7 == 4 || i7 == 3) {
            this.f12930b = null;
            return;
        }
        if (zzagvVar.zzf()) {
            String zzb = zzagvVar.zzb();
            MultiFactorInfo d02 = AbstractC1464a.d0(zzagvVar.zza());
            abstractC0021h = new K();
            com.google.android.gms.common.internal.D.e(zzb);
            abstractC0021h.f364a = zzb;
            com.google.android.gms.common.internal.D.i(d02);
        } else if (zzagvVar.zzg()) {
            abstractC0021h = new I(zzagvVar.zzc(), zzagvVar.zzb());
        } else if (zzagvVar.zze()) {
            String zzb2 = zzagvVar.zzb();
            abstractC0021h = new K();
            com.google.android.gms.common.internal.D.e(zzb2);
            abstractC0021h.f364a = zzb2;
        }
        this.f12930b = abstractC0021h;
    }
}
