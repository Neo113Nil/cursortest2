package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.common.logging.a;
import com.google.android.gms.tasks.OnFailureListener;
import defpackage.g;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzage implements OnFailureListener {
    public zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        a aVar;
        aVar = zzagc.zza;
        aVar.b(g.a("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
