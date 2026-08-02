package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.logging.a;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzat implements Runnable {
    final /* synthetic */ zzaq zza;
    private final String zzb;

    public zzat(zzaq zzaqVar, String str) {
        Objects.requireNonNull(zzaqVar);
        this.zza = zzaqVar;
        C0875q.d(str);
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.getInstance(this.zzb));
        if (firebaseAuth.getCurrentUser() != null) {
            Task<GetTokenResult> accessToken = firebaseAuth.getAccessToken(true);
            aVar = zzaq.zzc;
            aVar.c("Token refreshing started", new Object[0]);
            accessToken.addOnFailureListener(new zzas(this));
        }
    }
}
