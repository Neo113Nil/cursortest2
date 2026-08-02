package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import i3.C1263a;
import w1.L;

/* loaded from: classes.dex */
final class zzaey implements OnFailureListener {
    public zzaey(zzaew zzaewVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        C1263a c1263a;
        c1263a = zzaew.zza;
        c1263a.c(L.i("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
