package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.logging.a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.TotpSecret;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzaeo {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaar zzb;
    private final zzagc zzc;

    public zzaeo(FirebaseApp firebaseApp, ScheduledExecutorService scheduledExecutorService) {
        C0875q.g(firebaseApp);
        Context applicationContext = firebaseApp.getApplicationContext();
        C0875q.g(applicationContext);
        this.zzb = new zzaar(new zzafb(firebaseApp, zzafc.zza()));
        this.zzc = new zzagc(applicationContext, scheduledExecutorService);
    }

    public final void zza(String str, @Nullable String str2, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, @Nullable String str2, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, @Nullable String str2, zzaem zzaemVar) {
        C0875q.d(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        C0875q.g(zzaicVar);
        C0875q.d(zzaicVar.zzb());
        C0875q.g(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(@Nullable String str, zzaem zzaemVar) {
        C0875q.g(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, @Nullable String str4, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zzb(@NonNull zzahm zzahmVar, zzaem zzaemVar) {
        C0875q.g(zzahmVar);
        C0875q.d(zzahmVar.zzc());
        C0875q.g(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        C0875q.g(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, @Nullable String str3, @Nullable String str4, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(MultiFactorAssertion multiFactorAssertion, String str, @Nullable String str2, @Nullable String str3, zzaem zzaemVar) {
        zzagz zza2;
        C0875q.g(multiFactorAssertion);
        C0875q.e(str, "cachedTokenState should not be empty.");
        C0875q.g(zzaemVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential zza3 = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            String zzc = zza3.zzc();
            C0875q.g(zzc);
            String smsCode = zza3.getSmsCode();
            C0875q.g(smsCode);
            zza2 = zzahd.zza(str, zzc, smsCode, str2, str3);
        } else if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            TotpSecret zza4 = totpMultiFactorAssertion.zza();
            C0875q.g(zza4);
            C0875q.d(str2);
            String sessionInfo = zza4.getSessionInfo();
            C0875q.d(sessionInfo);
            String zzc2 = totpMultiFactorAssertion.zzc();
            C0875q.d(zzc2);
            zza2 = zzahf.zza(str, str2, sessionInfo, zzc2, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, MultiFactorAssertion multiFactorAssertion, @Nullable String str2, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(multiFactorAssertion);
        C0875q.g(zzaemVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            PhoneAuthCredential zza2 = ((PhoneMultiFactorAssertion) multiFactorAssertion).zza();
            zzaar zzaarVar = this.zzb;
            String zzc = zza2.zzc();
            C0875q.g(zzc);
            String smsCode = zza2.getSmsCode();
            C0875q.g(smsCode);
            zzaarVar.zza(zzahc.zza(str, zzc, smsCode, str2), new zzael(zzaemVar, zza));
            return;
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            TotpMultiFactorAssertion totpMultiFactorAssertion = (TotpMultiFactorAssertion) multiFactorAssertion;
            zzaar zzaarVar2 = this.zzb;
            String zzc2 = totpMultiFactorAssertion.zzc();
            C0875q.d(zzc2);
            String zzb = totpMultiFactorAssertion.zzb();
            C0875q.d(zzb);
            zzaarVar2.zza(zzahe.zza(str, zzc2, str2, zzb), new zzael(zzaemVar, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        C0875q.g(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        C0875q.g(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.d(str3);
        C0875q.g(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(zzajbVar);
        C0875q.g(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        C0875q.g(zzaemVar);
        C0875q.g(zzahzVar);
        String zzb = zzahzVar.zzb();
        C0875q.d(zzb);
        this.zzb.zza(zzb, zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        C0875q.g(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(@NonNull zzahm zzahmVar, zzaem zzaemVar) {
        C0875q.g(zzahmVar);
        C0875q.d(zzahmVar.zzd());
        C0875q.g(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        C0875q.g(zzaemVar);
        C0875q.g(zzaijVar);
        String zzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(zzd)) {
            if (zzaijVar.zze()) {
                this.zzc.zzb(zzd);
            } else {
                this.zzc.zzb(zzaelVar, zzd);
                return;
            }
        }
        long zzb = zzaijVar.zzb();
        boolean zzf = zzaijVar.zzf();
        if (zza(zzb, zzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzaelVar, zzb, zzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, zzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        C0875q.g(zzainVar);
        C0875q.g(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        C0875q.g(zzajbVar);
        C0875q.g(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        C0875q.g(zzajcVar);
        C0875q.g(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        C0875q.g(zzaemVar);
        C0875q.g(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        C0875q.g(zzaemVar);
        C0875q.g(zzaanVar);
        PhoneAuthCredential zza2 = zzaanVar.zza();
        C0875q.g(zza2);
        this.zzb.zza(zzafw.zza(zza2), new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, long j, boolean z, boolean z2, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z3, zzaem zzaemVar) {
        C0875q.e(str, "idToken should not be empty.");
        C0875q.g(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaelVar, str2);
                return;
            }
        }
        zzais zza2 = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z3)) {
            zza2.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j, z3);
        this.zzb.zza(zza2, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        C0875q.g(zzaaqVar);
        C0875q.g(zzaemVar);
        String phoneNumber = zzaaqVar.zzb().getPhoneNumber();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(phoneNumber)) {
            if (zzaaqVar.zzh()) {
                this.zzc.zzb(phoneNumber);
            } else {
                this.zzc.zzb(zzaelVar, phoneNumber);
                return;
            }
        }
        long zza2 = zzaaqVar.zza();
        boolean zzi = zzaaqVar.zzi();
        zzaiq zza3 = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().getUid(), zzaaqVar.zzb().getPhoneNumber(), zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(phoneNumber, zzaelVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzaelVar, phoneNumber));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        C0875q.g(zzaemVar);
        this.zzb.zza(zzaiuVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, @Nullable String str3, zzaem zzaemVar) {
        C0875q.e(str, "cachedTokenState should not be empty.");
        C0875q.e(str2, "uid should not be empty.");
        C0875q.g(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzaem zzaemVar) {
        C0875q.d(str);
        C0875q.g(userProfileChangeRequest);
        C0875q.g(zzaemVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        zza.b("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
