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
final class zzab extends zzbo<Void> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    public zzab(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        Objects.requireNonNull(firebaseAuth);
        this.zzd = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzcf] */
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<Void> zza(@Nullable String str) {
        FirebaseApp firebaseApp;
        FirebaseApp firebaseApp2;
        if (this.zza) {
            TextUtils.isEmpty(str);
            FirebaseAuth firebaseAuth = this.zzd;
            zzacq zzacqVar = firebaseAuth.zzd;
            firebaseApp2 = firebaseAuth.zzf;
            return zzacqVar.zza(firebaseApp2, this.zzb, this.zzc, str, (zzcf) new FirebaseAuth.zzb(this.zzd));
        }
        String zzc = this.zzc.zzc();
        String zzd = this.zzc.zzd();
        TextUtils.isEmpty(str);
        FirebaseAuth firebaseAuth2 = this.zzd;
        zzacq zzacqVar2 = firebaseAuth2.zzd;
        firebaseApp = firebaseAuth2.zzf;
        FirebaseUser firebaseUser = this.zzb;
        C0875q.d(zzd);
        return zzacqVar2.zza(firebaseApp, firebaseUser, zzc, zzd, this.zzb.getTenantId(), str, new FirebaseAuth.zzb(this.zzd));
    }
}
