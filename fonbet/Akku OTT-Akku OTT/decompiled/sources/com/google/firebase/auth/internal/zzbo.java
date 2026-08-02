package com.google.firebase.auth.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes4.dex */
public abstract class zzbo<T> {
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> Task<T> zza(zzbx zzbxVar, RecaptchaAction recaptchaAction, @Nullable String str, Continuation<String, Task<T>> continuation) {
        Task<String> zza = zzbxVar.zza(str, Boolean.FALSE, recaptchaAction);
        return zza.continueWithTask(continuation).continueWithTask(new zzbt(str, zzbxVar, recaptchaAction, continuation));
    }

    public abstract Task<T> zza(@Nullable String str);

    public final Task<T> zza(final FirebaseAuth firebaseAuth, @Nullable final String str, final RecaptchaAction recaptchaAction, String str2) {
        final Continuation continuation = new Continuation() { // from class: com.google.firebase.auth.internal.zzbq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                zzbo zzboVar = zzbo.this;
                if (task.isSuccessful()) {
                    return zzboVar.zza((String) task.getResult());
                }
                Exception exception = task.getException();
                C0875q.g(exception);
                exception.getMessage();
                return zzboVar.zza("NO_RECAPTCHA");
            }
        };
        zzbx zzb = firebaseAuth.zzb();
        if (zzb != null && zzb.zzb(str2)) {
            return zza(zzb, recaptchaAction, str, continuation);
        }
        return (Task<T>) zza(null).continueWithTask(new Continuation() { // from class: com.google.firebase.auth.internal.zzbr
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzbo.zza(RecaptchaAction.this, firebaseAuth, str, continuation, task);
            }
        });
    }

    public static /* synthetic */ Task zza(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) throws Exception {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        C0875q.g(exception);
        if (zzaen.zzd(exception)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                String.valueOf(recaptchaAction);
            }
            if (firebaseAuth.zzb() == null) {
                firebaseAuth.zza(new zzbx(firebaseAuth.getApp(), firebaseAuth));
            }
            return zza(firebaseAuth.zzb(), recaptchaAction, str, continuation);
        }
        String.valueOf(recaptchaAction);
        exception.getMessage();
        return Tasks.forException(exception);
    }
}
