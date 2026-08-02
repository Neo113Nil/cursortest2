package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcf;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzac extends zzbo<AuthResult> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    public zzac(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.zzd = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        FirebaseApp firebaseApp;
        FirebaseApp firebaseApp2;
        TextUtils.isEmpty(str);
        if (!this.zza) {
            FirebaseAuth firebaseAuth = this.zzd;
            zzacq zzacqVar = firebaseAuth.zzd;
            firebaseApp = firebaseAuth.zzf;
            return zzacqVar.zza(firebaseApp, this.zzc, str, (com.google.firebase.auth.internal.zzl) new FirebaseAuth.zza(this.zzd));
        }
        FirebaseAuth firebaseAuth2 = this.zzd;
        zzacq zzacqVar2 = firebaseAuth2.zzd;
        firebaseApp2 = firebaseAuth2.zzf;
        FirebaseUser firebaseUser = this.zzb;
        C0875q.g(firebaseUser);
        return zzacqVar2.zzb(firebaseApp2, firebaseUser, this.zzc, str, (zzcf) new FirebaseAuth.zzb(this.zzd));
    }
}
