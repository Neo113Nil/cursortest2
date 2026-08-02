package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzbo;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzq extends zzbo<Void> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ ActionCodeSettings zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    public zzq(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        Objects.requireNonNull(firebaseAuth);
        this.zzc = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzbo
    public final Task<Void> zza(@Nullable String str) {
        FirebaseApp firebaseApp;
        String str2;
        TextUtils.isEmpty(str);
        FirebaseAuth firebaseAuth = this.zzc;
        zzacq zzacqVar = firebaseAuth.zzd;
        firebaseApp = firebaseAuth.zzf;
        String str3 = this.zza;
        ActionCodeSettings actionCodeSettings = this.zzb;
        str2 = this.zzc.zzl;
        return zzacqVar.zza(firebaseApp, str3, actionCodeSettings, str2, str);
    }
}
