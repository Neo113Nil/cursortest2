package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuthException;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzh implements OnFailureListener {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzh(zzb zzbVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
        Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        String unused;
        unused = zzb.zza;
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder("Failed to get reCAPTCHA token with error [");
        sb.append(message);
        sb.append("]- calling backend without app verification");
        if ((exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.zza.setException(exc);
        } else {
            this.zza.setResult(new zzm().zza());
        }
    }
}
