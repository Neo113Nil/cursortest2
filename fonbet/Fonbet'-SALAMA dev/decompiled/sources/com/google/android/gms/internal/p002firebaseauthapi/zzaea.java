package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import f4.InterfaceC1099k;

/* loaded from: classes.dex */
final class zzaea implements zzadf {
    final /* synthetic */ zzady zza;

    public zzaea(zzady zzadyVar) {
        this.zza = zzadyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status) {
        String str = status.f11083b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, null, null, null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, null, null, null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, null, null, null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, null, null, null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, null, null, null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, null, null, null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, null, null, null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, null, null, null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, null, null, null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, null, null, null);
            }
        }
        zzady zzadyVar = this.zza;
        if (zzadyVar.zza == 8) {
            zzadyVar.zzu = true;
            zza(new zzaee(this, status));
        } else {
            zzady.zza(zzadyVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb(String str) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 8);
        zza(new zzadz(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc(String str) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 7);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb() {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 6);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc() {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 9);
        zzady.zza(this.zza);
    }

    private final void zza(zzaeg zzaegVar) {
        this.zza.zzi.execute(new zzaed(this, zzaegVar));
    }

    private final void zza(Status status, AuthCredential authCredential, String str, String str2) {
        zzady.zza(this.zza, status);
        zzady zzadyVar = this.zza;
        zzadyVar.zzn = authCredential;
        zzadyVar.zzo = str;
        zzadyVar.zzp = str2;
        InterfaceC1099k interfaceC1099k = zzadyVar.zzf;
        if (interfaceC1099k != null) {
            interfaceC1099k.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(String str) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 8);
        this.zza.zzu = true;
        zza(new zzaeb(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzafl zzaflVar) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 3);
        zzady zzadyVar = this.zza;
        zzadyVar.zzl = zzaflVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza() {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 5);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzi zzziVar) {
        zza(zzziVar.zza(), zzziVar.zzb(), zzziVar.zzc(), zzziVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzl zzzlVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzq = zzzlVar;
        zzadyVar.zza(AbstractC0603a.y0("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 2);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagh zzaghVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzs = zzaghVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagm zzagmVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzr = zzagmVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar, zzage zzageVar) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type: " + i7, i7 == 2);
        zzady zzadyVar = this.zza;
        zzadyVar.zzj = zzaglVar;
        zzadyVar.zzk = zzageVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagv zzagvVar) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 4);
        zzady zzadyVar = this.zza;
        zzadyVar.zzm = zzagvVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzaha zzahaVar) {
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzahh zzahhVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzt = zzahhVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type: " + i7, i7 == 1);
        zzady zzadyVar = this.zza;
        zzadyVar.zzj = zzaglVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(PhoneAuthCredential phoneAuthCredential) {
        int i7 = this.zza.zza;
        D.k("Unexpected response type " + i7, i7 == 8);
        this.zza.zzu = true;
        zza(new zzaec(this, phoneAuthCredential));
    }
}
