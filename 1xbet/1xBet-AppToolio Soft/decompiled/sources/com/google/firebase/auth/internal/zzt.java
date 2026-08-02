package com.google.firebase.auth.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.GetTokenResult;

/* loaded from: classes.dex */
final class zzt implements Runnable {
    private final String zzky;
    final /* synthetic */ zzs zzlm;

    zzt(@NonNull zzs zzsVar, String str) {
        this.zzlm = zzsVar;
        this.zzky = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Logger logger;
        FirebaseApp firebaseApp = FirebaseApp.getInstance(this.zzky);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
        zzx.initialize(firebaseApp.getApplicationContext());
        if (firebaseAuth.getCurrentUser() == null || !zzx.zzlq.get().booleanValue()) {
            return;
        }
        Task<GetTokenResult> accessToken = firebaseAuth.getAccessToken(true);
        logger = zzs.zzdx;
        logger.v("Token refreshing started", new Object[0]);
        accessToken.addOnFailureListener(new zzu(this));
    }
}
