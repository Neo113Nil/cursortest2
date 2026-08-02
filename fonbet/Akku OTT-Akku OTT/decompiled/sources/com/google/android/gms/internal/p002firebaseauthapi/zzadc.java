package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zzadc extends zzaff<AuthResult, zzl> {
    private final EmailAuthCredential zzv;

    @Nullable
    private final String zzw;

    public zzadc(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        super(2);
        C0875q.h(emailAuthCredential, "credential cannot be null");
        this.zzv = emailAuthCredential;
        C0875q.e(emailAuthCredential.zzc(), "email cannot be null");
        C0875q.e(emailAuthCredential.zzd(), "password cannot be null");
        this.zzw = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zza = zzacq.zza(this.zzc, this.zzk);
        ((zzl) this.zze).zza(this.zzj, zza);
        zzb(new zzz(zza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        String zzc = this.zzv.zzc();
        String zzd = this.zzv.zzd();
        C0875q.d(zzd);
        zzaeoVar.zza(zzc, zzd, this.zzd.zze(), this.zzd.getTenantId(), this.zzw, this.zzb);
    }
}
