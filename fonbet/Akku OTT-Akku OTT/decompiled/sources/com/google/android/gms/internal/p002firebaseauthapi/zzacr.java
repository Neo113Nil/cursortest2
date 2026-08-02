package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzl;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zzacr extends zzaff<Void, zzl> {
    private final zzaic zzv;

    public zzacr(String str, String str2, @Nullable String str3) {
        super(4);
        C0875q.e(str, "code cannot be null or empty");
        C0875q.e(str2, "new password cannot be null or empty");
        this.zzv = new zzaic(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
