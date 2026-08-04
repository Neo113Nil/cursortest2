package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.concurrent.ScheduledExecutorService;
import p034e4.k;
import p034e4.n;
import p034e4.o;
import p042f4.w;
import p062i3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzadh {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzzk zzb;
    private final zzaew zzc;

    public zzadh(i iVar, ScheduledExecutorService scheduledExecutorService) {
        D.i(iVar);
        iVar.b();
        Context context = iVar.f7663a;
        D.i(context);
        this.zzb = new zzzk(new zzadv(iVar, zzads.zza()));
        this.zzc = new zzaew(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzadf zzadfVar) {
        D.e(str);
        D.i(zzadfVar);
        this.zzb.zza(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, String str2, zzadf zzadfVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadfVar);
        this.zzb.zzb(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzc(String str, String str2, zzadf zzadfVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadfVar);
        this.zzb.zzc(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzd(String str, String str2, zzadf zzadfVar) {
        D.e(str);
        D.i(zzadfVar);
        this.zzb.zzd(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zze(String str, String str2, zzadf zzadfVar) {
        D.e(str);
        this.zzb.zze(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzf(String str, String str2, zzadf zzadfVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadfVar);
        this.zzb.zzf(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zze(String str, zzadf zzadfVar) {
        D.e(str);
        D.i(zzadfVar);
        this.zzb.zzf(str, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagw zzagwVar, zzadf zzadfVar) {
        D.i(zzagwVar);
        D.e(zzagwVar.zzb());
        D.i(zzadfVar);
        this.zzb.zza(zzagwVar, new zzade(zzadfVar, zza));
    }

    public final void zzd(String str, zzadf zzadfVar) {
        D.i(zzadfVar);
        this.zzb.zze(str, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, zzadf zzadfVar) {
        D.e(str);
        D.i(zzadfVar);
        this.zzb.zzb(str, new zzade(zzadfVar, zza));
    }

    public final void zzc(String str, zzadf zzadfVar) {
        D.e(str);
        D.i(zzadfVar);
        this.zzb.zzc(str, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadf zzadfVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadfVar);
        this.zzb.zza(str, str2, str3, str4, new zzade(zzadfVar, zza));
    }

    public final void zzb(zzagg zzaggVar, zzadf zzadfVar) {
        D.i(zzaggVar);
        D.e(zzaggVar.zzc());
        D.i(zzadfVar);
        this.zzb.zzb(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zzc(zzagg zzaggVar, zzadf zzadfVar) {
        D.i(zzaggVar);
        this.zzb.zzc(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, zzadf zzadfVar) {
        D.e(str);
        D.i(zzadfVar);
        this.zzb.zza(str, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadf zzadfVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadfVar);
        this.zzb.zzb(str, str2, str3, str4, new zzade(zzadfVar, zza));
    }

    public final void zza(k kVar, String str, String str2, String str3, zzadf zzadfVar) {
        zzafp zzafpVarZza;
        D.i(kVar);
        D.f(str, "cachedTokenState should not be empty.");
        D.i(zzadfVar);
        if (kVar instanceof n) {
            PhoneAuthCredential phoneAuthCredential = ((n) kVar).f12699a;
            String str4 = phoneAuthCredential.f11877a;
            D.i(str4);
            String str5 = phoneAuthCredential.f11878b;
            D.i(str5);
            zzafpVarZza = zzaft.zza(str, str4, str5, str2, str3);
        } else if (kVar instanceof o) {
            o oVar = (o) kVar;
            w wVar = oVar.f12701b;
            D.i(wVar);
            D.e(str2);
            String str6 = wVar.f12989f;
            D.e(str6);
            String str7 = oVar.f12700a;
            D.e(str7);
            zzafpVarZza = zzafv.zza(str, str2, str6, str7, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zzafpVarZza, str, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, k kVar, String str2, zzadf zzadfVar) {
        D.e(str);
        D.i(kVar);
        D.i(zzadfVar);
        if (kVar instanceof n) {
            zzzk zzzkVar = this.zzb;
            PhoneAuthCredential phoneAuthCredential = ((n) kVar).f12699a;
            String str3 = phoneAuthCredential.f11877a;
            D.i(str3);
            String str4 = phoneAuthCredential.f11878b;
            D.i(str4);
            zzzkVar.zza(zzafw.zza(str, str3, str4, str2), new zzade(zzadfVar, zza));
            return;
        }
        if (kVar instanceof o) {
            o oVar = (o) kVar;
            zzzk zzzkVar2 = this.zzb;
            String str5 = oVar.f12700a;
            D.e(str5);
            String str6 = oVar.f12702c;
            D.e(str6);
            zzzkVar2.zza(zzafy.zza(str, str5, str2, str6), new zzade(zzadfVar, zza));
            return;
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzagi zzagiVar, zzadf zzadfVar) {
        D.i(zzagiVar);
        this.zzb.zza(zzagiVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagj zzagjVar, zzadf zzadfVar) {
        D.i(zzagjVar);
        this.zzb.zza(zzagjVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadf zzadfVar) {
        D.e(str);
        D.e(str2);
        D.e(str3);
        D.i(zzadfVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, zzahr zzahrVar, zzadf zzadfVar) {
        D.e(str);
        D.i(zzahrVar);
        D.i(zzadfVar);
        this.zzb.zza(str, zzahrVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagp zzagpVar, zzadf zzadfVar) {
        D.i(zzadfVar);
        D.i(zzagpVar);
        String strZzb = zzagpVar.zzb();
        D.e(strZzb);
        this.zzb.zza(strZzb, zzagpVar.zza(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzagy zzagyVar, zzadf zzadfVar) {
        D.i(zzagyVar);
        this.zzb.zza(zzagyVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagg zzaggVar, zzadf zzadfVar) {
        D.i(zzaggVar);
        D.e(zzaggVar.zzd());
        D.i(zzadfVar);
        this.zzb.zza(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagz zzagzVar, zzadf zzadfVar) {
        D.i(zzadfVar);
        D.i(zzagzVar);
        String strZzd = zzagzVar.zzd();
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(strZzd)) {
            if (zzagzVar.zze()) {
                this.zzc.zzc(strZzd);
            } else {
                this.zzc.zzb(zzadeVar, strZzd);
                return;
            }
        }
        long jZzb = zzagzVar.zzb();
        boolean zZzf = zzagzVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzagzVar.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzadeVar, jZzb, zZzf);
        this.zzb.zza(zzagzVar, this.zzc.zza(zzadeVar, strZzd));
    }

    public final void zza(zzahd zzahdVar, zzadf zzadfVar) {
        D.i(zzahdVar);
        D.i(zzadfVar);
        this.zzb.zzd(zzahdVar.zza(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzahr zzahrVar, zzadf zzadfVar) {
        D.i(zzahrVar);
        D.i(zzadfVar);
        this.zzb.zza(zzahrVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzahw zzahwVar, zzadf zzadfVar) {
        D.i(zzahwVar);
        D.i(zzadfVar);
        this.zzb.zza(zzahwVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzafn zzafnVar, zzadf zzadfVar) {
        D.i(zzadfVar);
        D.i(zzafnVar.zzb());
        this.zzb.zza(zzafnVar.zzb(), zzafnVar.zzc(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzzg zzzgVar, zzadf zzadfVar) {
        D.i(zzadfVar);
        D.i(zzzgVar);
        PhoneAuthCredential phoneAuthCredentialZza = zzzgVar.zza();
        D.i(phoneAuthCredentialZza);
        this.zzb.zza(zzaeq.zza(phoneAuthCredentialZza), new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j, boolean z4, boolean z7, String str4, String str5, String str6, boolean z8, zzadf zzadfVar) {
        D.f(str, "idToken should not be empty.");
        D.i(zzadfVar);
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(str2)) {
            if (z4) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzadeVar, str2);
                return;
            }
        }
        zzahm zzahmVarZza = zzahm.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z8)) {
            zzahmVarZza.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadeVar, j, z8);
        this.zzb.zza(zzahmVarZza, this.zzc.zza(zzadeVar, str2));
    }

    public final void zza(zzzj zzzjVar, zzadf zzadfVar) {
        D.i(zzzjVar);
        D.i(zzadfVar);
        String str = zzzjVar.zzb().f11885d;
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(str)) {
            if (zzzjVar.zzh()) {
                this.zzc.zzc(str);
            } else {
                this.zzc.zzb(zzadeVar, str);
                return;
            }
        }
        long jZza = zzzjVar.zza();
        boolean zZzi = zzzjVar.zzi();
        zzahk zzahkVarZza = zzahk.zza(zzzjVar.zze(), zzzjVar.zzb().f11882a, zzzjVar.zzb().f11885d, zzzjVar.zzd(), zzzjVar.zzg(), zzzjVar.zzf(), zzzjVar.zzc());
        if (zza(jZza, zZzi)) {
            zzahkVarZza.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzadeVar, jZza, zZzi);
        this.zzb.zza(zzahkVarZza, this.zzc.zza(zzadeVar, str));
    }

    public final void zza(zzaho zzahoVar, zzadf zzadfVar) {
        D.i(zzadfVar);
        this.zzb.zza(zzahoVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzadf zzadfVar) {
        D.f(str, "cachedTokenState should not be empty.");
        D.f(str2, "uid should not be empty.");
        D.i(zzadfVar);
        this.zzb.zza(str, str2, str3, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzadf zzadfVar) {
        D.e(str);
        D.i(userProfileChangeRequest);
        D.i(zzadfVar);
        this.zzb.zza(str, userProfileChangeRequest, new zzade(zzadfVar, zza));
    }

    private static boolean zza(long j, boolean z4) {
        if (j > 0 && z4) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
