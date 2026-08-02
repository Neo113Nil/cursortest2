package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zze;

/* loaded from: classes.dex */
public final class zzzk {
    private final zzaej zza;

    public zzzk(zzaej zzaejVar) {
        D.i(zzaejVar);
        this.zza = zzaejVar;
    }

    public final void zzb(String str, String str2, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadeVar);
        zza(str, new zzabc(this, str2, zzadeVar));
    }

    public final void zzc(String str, String str2, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadeVar);
        zza(str, new zzabf(this, str2, zzadeVar));
    }

    public final void zzd(String str, String str2, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        this.zza.zza(new zzagw(str, null, str2), new zzzx(this, zzadeVar));
    }

    public final void zze(String str, String str2, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        this.zza.zza(new zzafm(str, str2), new zzzv(this, zzadeVar));
    }

    public final void zzf(String str, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        zza(str, new zzaag(this, zzadeVar));
    }

    public static void zza(zzzk zzzkVar, zzaht zzahtVar, zzade zzadeVar, zzaem zzaemVar) {
        Status y02;
        if (zzahtVar.zzo()) {
            zze zzb = zzahtVar.zzb();
            String zzc = zzahtVar.zzc();
            String zzj = zzahtVar.zzj();
            if (zzahtVar.zzm()) {
                y02 = new Status(17012, null, null, null);
            } else {
                y02 = AbstractC0603a.y0(zzahtVar.zzd());
            }
            zzadeVar.zza(new zzzi(y02, zzb, zzc, zzj));
            return;
        }
        zzzkVar.zza(new zzagl(zzahtVar.zzi(), zzahtVar.zze(), Long.valueOf(zzahtVar.zza()), "Bearer"), zzahtVar.zzh(), zzahtVar.zzg(), Boolean.valueOf(zzahtVar.zzn()), zzahtVar.zzb(), zzadeVar, zzaemVar);
    }

    public final void zzf(String str, String str2, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadeVar);
        zza(str2, new zzaaj(this, str, zzadeVar));
    }

    private final void zzd(zzagg zzaggVar, zzade zzadeVar) {
        D.i(zzaggVar);
        D.i(zzadeVar);
        this.zza.zza(zzaggVar, new zzaay(this, zzadeVar));
    }

    public final void zzb(String str, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        this.zza.zza(new zzafz(str), new zzzn(this, zzadeVar));
    }

    public final void zzc(String str, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        zza(str, new zzaav(this, zzadeVar));
    }

    public final void zze(String str, zzade zzadeVar) {
        D.i(zzadeVar);
        this.zza.zza(new zzahg(str), new zzabb(this, zzadeVar));
    }

    public final void zzc(zzagg zzaggVar, zzade zzadeVar) {
        zzd(zzaggVar, zzadeVar);
    }

    public final void zzd(String str, zzade zzadeVar) {
        D.i(zzadeVar);
        this.zza.zza(str, new zzaaz(this, zzadeVar));
    }

    public final void zzb(zzagg zzaggVar, zzade zzadeVar) {
        D.e(zzaggVar.zzc());
        D.i(zzadeVar);
        this.zza.zza(zzaggVar, new zzzu(this, zzadeVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadeVar);
        this.zza.zza(new zzahy(str, str2, str3, str4), new zzzp(this, zzadeVar));
    }

    public static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzahg zzahgVar, zzaem zzaemVar) {
        D.i(zzadeVar);
        D.i(zzahgVar);
        D.i(zzaemVar);
        zzzkVar.zza.zza(zzahgVar, new zzaad(zzzkVar, zzadeVar, zzaemVar));
    }

    public static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzahb zzahbVar, zzaem zzaemVar) {
        D.i(zzadeVar);
        D.i(zzaglVar);
        D.i(zzahbVar);
        D.i(zzaemVar);
        zzzkVar.zza.zza(new zzagc(zzaglVar.zzc()), new zzzq(zzzkVar, zzaemVar, zzadeVar, zzaglVar, zzahbVar));
    }

    public static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzage zzageVar, zzahb zzahbVar, zzaem zzaemVar) {
        D.i(zzadeVar);
        D.i(zzaglVar);
        D.i(zzageVar);
        D.i(zzahbVar);
        D.i(zzaemVar);
        zzzkVar.zza.zza(zzahbVar, new zzzt(zzzkVar, zzahbVar, zzageVar, zzadeVar, zzaglVar, zzaemVar));
    }

    public final void zza(String str, String str2, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        zzahb zzahbVar = new zzahb();
        zzahbVar.zze(str);
        zzahbVar.zzh(str2);
        this.zza.zza(zzahbVar, new zzabe(this, zzadeVar));
    }

    public final void zza(zzagw zzagwVar, zzade zzadeVar) {
        D.e(zzagwVar.zzb());
        D.i(zzadeVar);
        this.zza.zza(zzagwVar, new zzzz(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadeVar);
        this.zza.zza(new zzahg(str, str2, null, str3, str4, null), new zzzm(this, zzadeVar));
    }

    public final void zza(String str, zzade zzadeVar) {
        D.e(str);
        D.i(zzadeVar);
        zza(str, new zzaax(this, zzadeVar));
    }

    private final void zza(String str, zzael<zzagl> zzaelVar) {
        D.i(zzaelVar);
        D.e(str);
        zzagl zzb = zzagl.zzb(str);
        if (zzb.zzg()) {
            zzaelVar.zza((zzael<zzagl>) zzb);
        } else {
            this.zza.zza(new zzafz(zzb.zzd()), new zzabh(this, zzaelVar));
        }
    }

    public final void zza(zzafp zzafpVar, String str, zzade zzadeVar) {
        D.i(zzafpVar);
        D.i(zzadeVar);
        zza(str, new zzaap(this, zzafpVar, zzadeVar));
    }

    public final void zza(zzafr zzafrVar, zzade zzadeVar) {
        D.i(zzafrVar);
        D.i(zzadeVar);
        this.zza.zza(zzafrVar, new zzaar(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafn zzafnVar, zzade zzadeVar) {
        D.i(zzafnVar);
        D.i(zzadeVar);
        this.zza.zza(zzafnVar, new zzzr(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagl zzaglVar, String str, String str2, Boolean bool, zze zzeVar, zzade zzadeVar, zzaem zzaemVar) {
        D.i(zzaglVar);
        D.i(zzaemVar);
        D.i(zzadeVar);
        this.zza.zza(new zzagc(zzaglVar.zzc()), new zzzs(this, zzaemVar, str2, str, bool, zzeVar, zzadeVar, zzaglVar));
    }

    public final void zza(zzagi zzagiVar, zzade zzadeVar) {
        D.i(zzagiVar);
        D.i(zzadeVar);
        this.zza.zza(zzagiVar, new zzaas(this, zzadeVar));
    }

    public final void zza(zzagj zzagjVar, zzade zzadeVar) {
        D.i(zzagjVar);
        D.i(zzadeVar);
        this.zza.zza(zzagjVar, new zzaat(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.e(str3);
        D.i(zzadeVar);
        zza(str3, new zzaaa(this, str, str2, str4, str5, zzadeVar));
    }

    public final void zza(String str, zzahr zzahrVar, zzade zzadeVar) {
        D.e(str);
        D.i(zzahrVar);
        D.i(zzadeVar);
        zza(str, new zzaae(this, zzahrVar, zzadeVar));
    }

    public final void zza(String str, zzaia zzaiaVar, zzade zzadeVar) {
        D.e(str);
        D.i(zzaiaVar);
        D.i(zzadeVar);
        zza(str, new zzaac(this, zzaiaVar, zzadeVar));
    }

    public final void zza(zzagy zzagyVar, zzade zzadeVar) {
        this.zza.zza(zzagyVar, new zzaba(this, zzadeVar));
    }

    public final void zza(zzagg zzaggVar, zzade zzadeVar) {
        D.e(zzaggVar.zzd());
        D.i(zzadeVar);
        zzd(zzaggVar, zzadeVar);
    }

    public final void zza(zzagz zzagzVar, zzade zzadeVar) {
        D.e(zzagzVar.zzd());
        D.i(zzadeVar);
        this.zza.zza(zzagzVar, new zzzy(this, zzadeVar));
    }

    public final void zza(zzahr zzahrVar, zzade zzadeVar) {
        D.i(zzahrVar);
        D.i(zzadeVar);
        zzahrVar.zzb(true);
        this.zza.zza(zzahrVar, new zzaan(this, zzadeVar));
    }

    public final void zza(zzahw zzahwVar, zzade zzadeVar) {
        D.i(zzahwVar);
        D.i(zzadeVar);
        this.zza.zza(zzahwVar, new zzzw(this, zzadeVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, String str, zzade zzadeVar) {
        D.i(emailAuthCredential);
        D.i(zzadeVar);
        if (emailAuthCredential.f11845e) {
            zza(emailAuthCredential.f11844d, new zzzo(this, emailAuthCredential, str, zzadeVar));
        } else {
            zza(new zzafn(emailAuthCredential, null, str), zzadeVar);
        }
    }

    public final void zza(zzaia zzaiaVar, zzade zzadeVar) {
        D.i(zzaiaVar);
        D.i(zzadeVar);
        this.zza.zza(zzaiaVar, new zzaab(this, zzadeVar));
    }

    public final void zza(zzahi zzahiVar, zzade zzadeVar) {
        D.i(zzahiVar);
        D.i(zzadeVar);
        this.zza.zza(zzahiVar, new zzaam(this, zzahiVar, zzadeVar));
    }

    public final void zza(zzahk zzahkVar, zzade zzadeVar) {
        D.i(zzahkVar);
        D.i(zzadeVar);
        this.zza.zza(zzahkVar, new zzaaq(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, zzade zzadeVar) {
        D.e(str);
        D.e(str2);
        D.i(zzadeVar);
        zza(str, new zzaal(this, str2, str3, zzadeVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzade zzadeVar) {
        D.e(str);
        D.i(userProfileChangeRequest);
        D.i(zzadeVar);
        zza(str, new zzabd(this, userProfileChangeRequest, zzadeVar));
    }
}
