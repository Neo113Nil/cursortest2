package com.google.android.gms.internal.p002firebaseauthapi;

import Y3.i;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzz;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import e4.AbstractC1039m;
import e4.C1036j;
import e4.C1040n;
import e4.C1041o;
import f4.C1095g;
import f4.InterfaceC1088E;
import f4.InterfaceC1097i;
import f4.InterfaceC1099k;
import f4.L;
import f4.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class zzabj extends zzaei {
    public zzabj(i iVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzadh(iVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(i iVar, String str, String str2) {
        return zza((zzabi) new zzabi(str, str2).zza(iVar));
    }

    public final Task<L> zzb(i iVar, String str, String str2) {
        return zza((zzabl) new zzabl(str, str2).zza(iVar));
    }

    public final Task<C1095g> zzc(i iVar, String str, String str2) {
        return zza((zzabp) new zzabp(str, str2).zza(iVar));
    }

    public final Task<Void> zzd(i iVar, FirebaseUser firebaseUser, String str, z zVar) {
        return zza((zzacz) new zzacz(str).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, String str, String str2, String str3) {
        return zza((zzabk) new zzabk(str, str2, str3).zza(iVar));
    }

    public final Task<Void> zzb(i iVar, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.f11840z = 6;
        return zza((zzaci) new zzaci(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(iVar));
    }

    public final Task<AuthResult> zzc(i iVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, z zVar) {
        return zza((zzaby) new zzaby(authCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<AuthResult> zza(i iVar, String str, String str2, String str3, String str4, InterfaceC1088E interfaceC1088E) {
        return zza((zzabn) new zzabn(str, str2, str3, str4).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<String> zzd(i iVar, String str, String str2) {
        return zza((zzadd) new zzadd(str, str2).zza(iVar));
    }

    public final Task<Void> zzb(i iVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, z zVar) {
        return zza((zzabz) new zzabz(authCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zzc(i iVar, FirebaseUser firebaseUser, String str, z zVar) {
        return zza((zzacw) new zzacw(str).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, InterfaceC1097i interfaceC1097i) {
        return zza((zzabm) new zzabm().zza(firebaseUser).zza((zzady<Void, InterfaceC1097i>) interfaceC1097i).zza((InterfaceC1099k) interfaceC1097i));
    }

    public final Task<AuthResult> zzb(i iVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, z zVar) {
        return zza((zzaca) new zzaca(emailAuthCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, C1040n c1040n, FirebaseUser firebaseUser, String str, InterfaceC1088E interfaceC1088E) {
        zzaer.zza();
        zzabo zzaboVar = new zzabo(c1040n, ((zzad) firebaseUser).f11908a.zzf(), str, null);
        zzaboVar.zza(iVar).zza((zzady<Void, InterfaceC1088E>) interfaceC1088E);
        return zza(zzaboVar);
    }

    public final Task<AuthResult> zzb(i iVar, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, z zVar) {
        return zza((zzacc) new zzacc(str, str2, str3, str4).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, C1041o c1041o, FirebaseUser firebaseUser, String str, String str2, InterfaceC1088E interfaceC1088E) {
        zzabo zzaboVar = new zzabo(c1041o, ((zzad) firebaseUser).f11908a.zzf(), str, str2);
        zzaboVar.zza(iVar).zza((zzady<Void, InterfaceC1088E>) interfaceC1088E);
        return zza(zzaboVar);
    }

    public final Task<AuthResult> zzb(i iVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, z zVar) {
        zzaer.zza();
        return zza((zzace) new zzace(phoneAuthCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<AuthResult> zza(i iVar, FirebaseUser firebaseUser, C1040n c1040n, String str, InterfaceC1088E interfaceC1088E) {
        zzaer.zza();
        zzabr zzabrVar = new zzabr(c1040n, str, null);
        zzabrVar.zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E);
        if (firebaseUser != null) {
            zzabrVar.zza(firebaseUser);
        }
        return zza(zzabrVar);
    }

    public final Task<AuthResult> zzb(i iVar, String str, String str2, String str3, String str4, InterfaceC1088E interfaceC1088E) {
        return zza((zzacp) new zzacp(str, str2, str3, str4).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<AuthResult> zza(i iVar, FirebaseUser firebaseUser, C1041o c1041o, String str, String str2, InterfaceC1088E interfaceC1088E) {
        zzabr zzabrVar = new zzabr(c1041o, str, str2);
        zzabrVar.zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E);
        if (firebaseUser != null) {
            zzabrVar.zza(firebaseUser);
        }
        return zza(zzabrVar);
    }

    public final Task<AuthResult> zzb(i iVar, FirebaseUser firebaseUser, String str, z zVar) {
        D.i(iVar);
        D.e(str);
        D.i(firebaseUser);
        D.i(zVar);
        ArrayList arrayList = ((zzad) firebaseUser).f11913f;
        if ((arrayList != null && !arrayList.contains(str)) || firebaseUser.k()) {
            return Tasks.forException(zzadg.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        if (!str.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) {
            return zza((zzacx) new zzacx(str).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
        }
        return zza((zzacu) new zzacu().zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<C1036j> zza(i iVar, FirebaseUser firebaseUser, String str, z zVar) {
        return zza((zzabq) new zzabq(str).zza(iVar).zza(firebaseUser).zza((zzady<C1036j, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.f11840z = 1;
        return zza((zzaci) new zzaci(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(iVar));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.f11840z = 7;
        return zza(new zzada(str, str2, actionCodeSettings));
    }

    public final Task<zzagh> zza() {
        return zza(new zzabt());
    }

    public final Task<zzagm> zza(String str, String str2) {
        return zza(new zzabs(str, str2));
    }

    public final Task<AuthResult> zza(i iVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, z zVar) {
        D.i(iVar);
        D.i(authCredential);
        D.i(firebaseUser);
        D.i(zVar);
        ArrayList arrayList = ((zzad) firebaseUser).f11913f;
        if (arrayList != null && arrayList.contains(authCredential.j())) {
            return Tasks.forException(zzadg.zza(new Status(17015, null, null, null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (TextUtils.isEmpty(emailAuthCredential.f11843c)) {
                return zza((zzabv) new zzabv(emailAuthCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
            }
            return zza((zzabw) new zzabw(emailAuthCredential).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzaer.zza();
            return zza((zzabx) new zzabx((PhoneAuthCredential) authCredential).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
        }
        return zza((zzabu) new zzabu(authCredential).zza(iVar).zza(firebaseUser).zza((zzady<AuthResult, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, z zVar) {
        return zza((zzacb) new zzacb(emailAuthCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, z zVar) {
        return zza((zzacd) new zzacd(str, str2, str3, str4).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, z zVar) {
        zzaer.zza();
        return zza((zzacf) new zzacf(phoneAuthCredential, str).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, z zVar) {
        return zza((zzach) new zzach().zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacg(str, str2, str3, str4));
    }

    public final Task<Void> zza(i iVar, ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzacj) new zzacj(str, actionCodeSettings).zza(iVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacl(str));
    }

    public final Task<AuthResult> zza(i iVar, InterfaceC1088E interfaceC1088E, String str) {
        return zza((zzack) new zzack(str).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<AuthResult> zza(i iVar, AuthCredential authCredential, String str, InterfaceC1088E interfaceC1088E) {
        return zza((zzacn) new zzacn(authCredential, str).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<AuthResult> zza(i iVar, String str, String str2, InterfaceC1088E interfaceC1088E) {
        return zza((zzacm) new zzacm(str, str2).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<AuthResult> zza(i iVar, EmailAuthCredential emailAuthCredential, String str, InterfaceC1088E interfaceC1088E) {
        return zza((zzaco) new zzaco(emailAuthCredential, str).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<AuthResult> zza(i iVar, PhoneAuthCredential phoneAuthCredential, String str, InterfaceC1088E interfaceC1088E) {
        zzaer.zza();
        return zza((zzacr) new zzacr(phoneAuthCredential, str).zza(iVar).zza((zzady<AuthResult, InterfaceC1088E>) interfaceC1088E));
    }

    public final Task<Void> zza(zzao zzaoVar, String str, String str2, long j, boolean z4, boolean z7, String str3, String str4, String str5, boolean z8, AbstractC1039m abstractC1039m, Executor executor, Activity activity) {
        zzacq zzacqVar = new zzacq(zzaoVar, str, str2, j, z4, z7, str3, str4, str5, z8);
        zzacqVar.zza(abstractC1039m, activity, executor, str);
        return zza(zzacqVar);
    }

    public final Task<zzahh> zza(zzao zzaoVar, String str) {
        return zza(new zzact(zzaoVar, str));
    }

    public final Task<Void> zza(zzao zzaoVar, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j, boolean z4, boolean z7, String str2, String str3, String str4, boolean z8, AbstractC1039m abstractC1039m, Executor executor, Activity activity) {
        String str5 = zzaoVar.f11926b;
        D.e(str5);
        zzacs zzacsVar = new zzacs(phoneMultiFactorInfo, str5, str, j, z4, z7, str2, str3, str4, z8);
        zzacsVar.zza(abstractC1039m, activity, executor, phoneMultiFactorInfo.f11882a);
        return zza(zzacsVar);
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, String str, String str2, z zVar) {
        return zza((zzacv) new zzacv(((zzad) firebaseUser).f11908a.zzf(), str, str2).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, z zVar) {
        zzaer.zza();
        return zza((zzacy) new zzacy(phoneAuthCredential).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public final Task<Void> zza(i iVar, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, z zVar) {
        return zza((zzadb) new zzadb(userProfileChangeRequest).zza(iVar).zza(firebaseUser).zza((zzady<Void, InterfaceC1088E>) zVar).zza((InterfaceC1099k) zVar));
    }

    public static zzad zza(i iVar, zzage zzageVar) {
        D.i(iVar);
        D.i(zzageVar);
        ArrayList arrayList = new ArrayList();
        zzz zzzVar = new zzz();
        D.e("firebase");
        String zzi = zzageVar.zzi();
        D.e(zzi);
        zzzVar.f11939a = zzi;
        zzzVar.f11940b = "firebase";
        zzzVar.f11944f = zzageVar.zzh();
        zzzVar.f11941c = zzageVar.zzg();
        Uri zzc = zzageVar.zzc();
        if (zzc != null) {
            zzzVar.f11942d = zzc.toString();
            zzzVar.f11943e = zzc;
        }
        zzzVar.f11946y = zzageVar.zzm();
        zzzVar.f11947z = null;
        zzzVar.f11945x = zzageVar.zzj();
        arrayList.add(zzzVar);
        List<zzagr> zzl = zzageVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i7 = 0; i7 < zzl.size(); i7++) {
                zzagr zzagrVar = zzl.get(i7);
                zzz zzzVar2 = new zzz();
                D.i(zzagrVar);
                zzzVar2.f11939a = zzagrVar.zzd();
                String zzf = zzagrVar.zzf();
                D.e(zzf);
                zzzVar2.f11940b = zzf;
                zzzVar2.f11941c = zzagrVar.zzb();
                Uri zza = zzagrVar.zza();
                if (zza != null) {
                    zzzVar2.f11942d = zza.toString();
                    zzzVar2.f11943e = zza;
                }
                zzzVar2.f11944f = zzagrVar.zzc();
                zzzVar2.f11945x = zzagrVar.zze();
                zzzVar2.f11946y = false;
                zzzVar2.f11947z = zzagrVar.zzg();
                arrayList.add(zzzVar2);
            }
        }
        zzad zzadVar = new zzad(iVar, arrayList);
        zzadVar.f11916z = new zzaf(zzageVar.zzb(), zzageVar.zza());
        zzadVar.f11904A = zzageVar.zzn();
        zzadVar.f11905B = zzageVar.zze();
        zzadVar.o(AbstractC1464a.f0(zzageVar.zzk()));
        List zzd = zzageVar.zzd();
        if (zzd == null) {
            zzd = new ArrayList();
        }
        zzadVar.f11907D = zzd;
        return zzadVar;
    }

    public final void zza(i iVar, zzagz zzagzVar, AbstractC1039m abstractC1039m, Activity activity, Executor executor) {
        zza((zzadc) new zzadc(zzagzVar).zza(iVar).zza(abstractC1039m, activity, executor, zzagzVar.zzd()));
    }
}
