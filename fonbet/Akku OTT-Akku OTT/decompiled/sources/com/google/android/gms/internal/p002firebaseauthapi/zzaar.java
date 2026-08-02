package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0875q;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.zze;

/* loaded from: classes4.dex */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        C0875q.g(zzaftVar);
        this.zza = zzaftVar;
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, @Nullable String str2, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    public final void zze(String str, @Nullable String str2, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    public static void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        Status zza;
        if (zzajdVar.zzo()) {
            zze zzb = zzajdVar.zzb();
            String zzc = zzajdVar.zzc();
            String zzj = zzajdVar.zzj();
            if (zzajdVar.zzm()) {
                zza = new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL, null, null, null);
            } else {
                zza = zzao.zza(zzajdVar.zzd());
            }
            zzaelVar.zza(new zzaap(zza, zzb, zzc, zzj));
            return;
        }
        zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        C0875q.g(zzahmVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zze(@Nullable String str, zzael zzaelVar) {
        C0875q.g(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zzd(@Nullable String str, zzael zzaelVar) {
        C0875q.g(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        C0875q.d(zzahmVar.zzc());
        C0875q.g(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzb(String str, String str2, @Nullable String str3, @Nullable String str4, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        C0875q.g(zzaelVar);
        C0875q.g(zzaimVar);
        C0875q.g(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        C0875q.g(zzaelVar);
        C0875q.g(zzahvVar);
        C0875q.g(zzailVar);
        C0875q.g(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    public static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        C0875q.g(zzaelVar);
        C0875q.g(zzahvVar);
        C0875q.g(zzahkVar);
        C0875q.g(zzailVar);
        C0875q.g(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zza(String str, @Nullable String str2, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        C0875q.d(zzaicVar.zzb());
        C0875q.g(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(String str, String str2, @Nullable String str3, @Nullable String str4, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv<zzahv> zzafvVar) {
        C0875q.g(zzafvVar);
        C0875q.d(str);
        zzahv zzb = zzahv.zzb(str);
        if (zzb.zzg()) {
            zzafvVar.zza((zzafv<zzahv>) zzb);
        } else {
            this.zza.zza(new zzahj(zzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        C0875q.g(zzagzVar);
        C0875q.g(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        C0875q.g(zzahbVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagx zzagxVar, zzael zzaelVar) {
        C0875q.g(zzagxVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahv zzahvVar, @Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable zze zzeVar, zzael zzaelVar, zzafs zzafsVar) {
        C0875q.g(zzahvVar);
        C0875q.g(zzafsVar);
        C0875q.g(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, zzeVar, zzaelVar, zzahvVar));
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        C0875q.g(zzahoVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        C0875q.g(zzahtVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.d(str3);
        C0875q.g(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzajbVar);
        C0875q.g(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(zzajgVar);
        C0875q.g(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        C0875q.d(zzahmVar.zzd());
        C0875q.g(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        C0875q.d(zzaijVar.zzd());
        C0875q.g(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        C0875q.g(zzajbVar);
        C0875q.g(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        C0875q.g(zzajcVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzajcVar, new zzabd(this, zzaelVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, @Nullable String str, zzael zzaelVar) {
        C0875q.g(emailAuthCredential);
        C0875q.g(zzaelVar);
        if (emailAuthCredential.zzg()) {
            zza(emailAuthCredential.zzb(), new zzaav(this, emailAuthCredential, str, zzaelVar));
        } else {
            zza(new zzagx(emailAuthCredential, null, str), zzaelVar);
        }
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        C0875q.g(zzajgVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        C0875q.g(zzaioVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        C0875q.g(zzaiqVar);
        C0875q.g(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(String str, String str2, @Nullable String str3, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.d(str2);
        C0875q.g(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzael zzaelVar) {
        C0875q.d(str);
        C0875q.g(userProfileChangeRequest);
        C0875q.g(zzaelVar);
        zza(str, new zzack(this, userProfileChangeRequest, zzaelVar));
    }
}
