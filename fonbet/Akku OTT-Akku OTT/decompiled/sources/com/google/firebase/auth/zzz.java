package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzz extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ FirebaseUser zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ FirebaseAuth zzf;

    public zzz(FirebaseAuth firebaseAuth, String str, boolean z, FirebaseUser firebaseUser, String str2, String str3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = firebaseUser;
        this.zzd = str2;
        this.zze = str3;
        Objects.requireNonNull(firebaseAuth);
        this.zzf = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        FirebaseApp firebaseApp;
        FirebaseApp firebaseApp2;
        TextUtils.isEmpty(str);
        if (!this.zzb) {
            FirebaseAuth firebaseAuth = this.zzf;
            zzacq zzacqVar = firebaseAuth.zzd;
            firebaseApp = firebaseAuth.zzf;
            return zzacqVar.zzb(firebaseApp, this.zza, this.zzd, this.zze, str, new FirebaseAuth.zza(this.zzf));
        }
        FirebaseAuth firebaseAuth2 = this.zzf;
        zzacq zzacqVar2 = firebaseAuth2.zzd;
        firebaseApp2 = firebaseAuth2.zzf;
        FirebaseUser firebaseUser = this.zzc;
        C0875q.g(firebaseUser);
        return zzacqVar2.zzb(firebaseApp2, firebaseUser, this.zza, this.zzd, this.zze, str, new FirebaseAuth.zzb(this.zzf));
    }
}
