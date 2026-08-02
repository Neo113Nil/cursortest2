package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzbo;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzn extends zzbo<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzn(FirebaseAuth firebaseAuth, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<AuthResult> zza(@Nullable String str) {
        FirebaseApp firebaseApp;
        String str2;
        TextUtils.isEmpty(str);
        FirebaseAuth firebaseAuth = this.zzc;
        zzacq zzacqVar = firebaseAuth.zzd;
        firebaseApp = firebaseAuth.zzf;
        String str3 = this.zza;
        String str4 = this.zzb;
        str2 = this.zzc.zzl;
        return zzacqVar.zza(firebaseApp, str3, str4, str2, str, new FirebaseAuth.zza(this.zzc));
    }
}
