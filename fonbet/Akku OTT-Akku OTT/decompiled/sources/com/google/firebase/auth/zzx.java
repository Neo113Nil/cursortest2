package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzx implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
    private final /* synthetic */ FirebaseAuth zza;

    public zzx(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzau
    public final void zza(Status status) {
        int i = status.a;
        if (i == 17011 || i == 17021 || i == 17005) {
            this.zza.signOut();
        }
    }

    @Override // com.google.firebase.auth.internal.zzl
    public final void zza(zzahv zzahvVar, FirebaseUser firebaseUser) {
        this.zza.zza(firebaseUser, zzahvVar, true, true);
    }
}
