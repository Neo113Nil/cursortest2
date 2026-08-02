package com.google.firebase.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzj implements OnCompleteListener<com.google.firebase.auth.internal.zzj> {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzj(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, String str) {
        this.zza = phoneAuthOptions;
        this.zzb = str;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<com.google.firebase.auth.internal.zzj> task) {
        String zzd;
        String zzb;
        String zzc;
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zza;
        String str;
        String str2;
        if (task.isSuccessful()) {
            zzd = task.getResult().zzd();
            zzb = task.getResult().zzb();
            zzc = task.getResult().zzc();
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                exception.getMessage();
            }
            if (exception != null && com.google.firebase.auth.internal.zzb.zza(exception)) {
                FirebaseAuth.zza((FirebaseException) exception, this.zza, this.zzb);
                return;
            } else {
                zzc = null;
                zzd = null;
                zzb = null;
            }
        }
        long longValue = this.zza.zzg().longValue();
        zza = this.zzc.zza(this.zza.zzh(), this.zza.zze());
        if (TextUtils.isEmpty(zzd)) {
            zza = this.zzc.zza(this.zza, zza, task.getResult());
        }
        PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks = zza;
        MultiFactorSession zzc2 = this.zza.zzc();
        C0875q.g(zzc2);
        com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) zzc2;
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(zzc) && this.zzc.zzb() != null && this.zzc.zzb().zza("PHONE_PROVIDER")) {
            zzc = "NO_RECAPTCHA";
        }
        String str3 = zzc;
        if (zzamVar.zzd()) {
            zzacq zzacqVar = this.zzc.zzd;
            String zzh = this.zza.zzh();
            C0875q.g(zzh);
            str2 = this.zzc.zzj;
            zzacqVar.zza(zzamVar, zzh, str2, longValue, this.zza.zzd() != null, this.zza.zzk(), zzd, zzb, str3, this.zzc.zzh(), onVerificationStateChangedCallbacks, this.zza.zzi(), this.zza.zza());
            return;
        }
        zzacq zzacqVar2 = this.zzc.zzd;
        PhoneMultiFactorInfo zzf = this.zza.zzf();
        C0875q.g(zzf);
        str = this.zzc.zzj;
        zzacqVar2.zza(zzamVar, zzf, str, longValue, this.zza.zzd() != null, this.zza.zzk(), zzd, zzb, str3, this.zzc.zzh(), onVerificationStateChangedCallbacks, this.zza.zzi(), this.zza.zza());
    }
}
