package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import com.google.firebase.auth.internal.zzcf;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzo extends zzbo<AuthResult> {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ EmailAuthCredential zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzo(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = firebaseUser;
        this.zzb = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        FirebaseApp firebaseApp;
        TextUtils.isEmpty(str);
        FirebaseAuth firebaseAuth = this.zzc;
        zzacq zzacqVar = firebaseAuth.zzd;
        firebaseApp = firebaseAuth.zzf;
        return zzacqVar.zza(firebaseApp, this.zza, (AuthCredential) this.zzb, str, (zzcf) new FirebaseAuth.zzb(this.zzc));
    }
}
