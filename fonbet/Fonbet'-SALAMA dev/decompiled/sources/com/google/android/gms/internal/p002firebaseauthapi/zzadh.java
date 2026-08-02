package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import android.content.Context;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import e4.AbstractC1037k;
import e4.C1040n;
import e4.C1041o;
import f4.w;
import i3.C1263a;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzadh {
    private static final C1263a zza = new C1263a("FirebaseAuth", "FirebaseAuthFallback:");
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

    public final void zza(AbstractC1037k abstractC1037k, String str, String str2, String str3, zzadf zzadfVar) {
        zzafp zza2;
        D.i(abstractC1037k);
        D.f(str, "cachedTokenState should not be empty.");
        D.i(zzadfVar);
        if (abstractC1037k instanceof C1040n) {
            PhoneAuthCredential phoneAuthCredential = ((C1040n) abstractC1037k).f12693a;
            String str4 = phoneAuthCredential.f11877a;
            D.i(str4);
            String str5 = phoneAuthCredential.f11878b;
            D.i(str5);
            zza2 = zzaft.zza(str, str4, str5, str2, str3);
        } else if (abstractC1037k instanceof C1041o) {
            C1041o c1041o = (C1041o) abstractC1037k;
            w wVar = c1041o.f12695b;
            D.i(wVar);
            D.e(str2);
            String str6 = wVar.f12983f;
            D.e(str6);
            String str7 = c1041o.f12694a;
            D.e(str7);
            zza2 = zzafv.zza(str, str2, str6, str7, str3);
        } else {
            throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
        }
        this.zzb.zza(zza2, str, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, AbstractC1037k abstractC1037k, String str2, zzadf zzadfVar) {
        D.e(str);
        D.i(abstractC1037k);
        D.i(zzadfVar);
        if (abstractC1037k instanceof C1040n) {
            zzzk zzzkVar = this.zzb;
            PhoneAuthCredential phoneAuthCredential = ((C1040n) abstractC1037k).f12693a;
            String str3 = phoneAuthCredential.f11877a;
            D.i(str3);
            String str4 = phoneAuthCredential.f11878b;
            D.i(str4);
            zzzkVar.zza(zzafw.zza(str, str3, str4, str2), new zzade(zzadfVar, zza));
            return;
        }
        if (abstractC1037k instanceof C1041o) {
            C1041o c1041o = (C1041o) abstractC1037k;
            zzzk zzzkVar2 = this.zzb;
            String str5 = c1041o.f12694a;
            D.e(str5);
            String str6 = c1041o.f12696c;
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
        String zzb = zzagpVar.zzb();
        D.e(zzb);
        this.zzb.zza(zzb, zzagpVar.zza(), new zzade(zzadfVar, zza));
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
        String zzd = zzagzVar.zzd();
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(zzd)) {
            if (zzagzVar.zze()) {
                this.zzc.zzc(zzd);
            } else {
                this.zzc.zzb(zzadeVar, zzd);
                return;
            }
        }
        long zzb = zzagzVar.zzb();
        boolean zzf = zzagzVar.zzf();
        if (zza(zzb, zzf)) {
            zzagzVar.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzadeVar, zzb, zzf);
        this.zzb.zza(zzagzVar, this.zzc.zza(zzadeVar, zzd));
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
        PhoneAuthCredential zza2 = zzzgVar.zza();
        D.i(zza2);
        this.zzb.zza(zzaeq.zza(zza2), new zzade(zzadfVar, zza));
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
        zzahm zza2 = zzahm.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j, z8)) {
            zza2.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadeVar, j, z8);
        this.zzb.zza(zza2, this.zzc.zza(zzadeVar, str2));
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
        long zza2 = zzzjVar.zza();
        boolean zzi = zzzjVar.zzi();
        zzahk zza3 = zzahk.zza(zzzjVar.zze(), zzzjVar.zzb().f11882a, zzzjVar.zzb().f11885d, zzzjVar.zzd(), zzzjVar.zzg(), zzzjVar.zzf(), zzzjVar.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzadeVar, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzadeVar, str));
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
