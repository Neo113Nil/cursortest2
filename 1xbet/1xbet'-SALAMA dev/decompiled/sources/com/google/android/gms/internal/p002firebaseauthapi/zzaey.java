package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
final class zzaey implements OnFailureListener {
    public zzaey(zzaew zzaewVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzaew.zza.c(L.i("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
