package com.google.firebase.auth.internal;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzafz;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* loaded from: classes4.dex */
public class zzb {
    private static final String zza = "zzb";
    private static final zzb zzb = new zzb();
    private String zzc;

    private zzb() {
    }

    public final Task<zzj> zza(final FirebaseAuth firebaseAuth, @Nullable final String str, @Nullable final Activity activity, final boolean z, boolean z2, boolean z3, final RecaptchaAction recaptchaAction) {
        zzac zzacVar = (zzac) firebaseAuth.getFirebaseAuthSettings();
        final zzcg zzc = zzcg.zzc();
        if (!zzagl.zza(firebaseAuth.getApp()) && !zzacVar.zze()) {
            zzacVar.zzc();
            boolean z4 = z2 || zzacVar.zzc();
            final TaskCompletionSource<zzj> taskCompletionSource = new TaskCompletionSource<>();
            Task<String> zzb2 = zzc.zzb();
            if (zzb2 != null) {
                if (zzb2.isSuccessful()) {
                    return Tasks.forResult(new zzm().zzc(zzb2.getResult()).zza());
                }
                zzb2.getException().getMessage();
            }
            if (!z4 && !z3) {
                Task<Void> initializeRecaptchaConfig = firebaseAuth.initializeRecaptchaConfig();
                final boolean z5 = false;
                OnCompleteListener<Void> onCompleteListener = new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zza
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        zzb.zza(zzb.this, taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z, z5, zzc, task);
                    }
                };
                taskCompletionSource = taskCompletionSource;
                initializeRecaptchaConfig.addOnCompleteListener(onCompleteListener);
            } else {
                zza(firebaseAuth, str, activity, z, z4, zzc, taskCompletionSource);
            }
            return taskCompletionSource.getTask();
        }
        return Tasks.forResult(new zzm().zza());
    }

    public static zzb zza() {
        return zzb;
    }

    public static /* synthetic */ void zza(zzb zzbVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z, boolean z2, zzcg zzcgVar, Task task) {
        if (!task.isSuccessful()) {
            task.getException().getMessage();
        }
        if (firebaseAuth.zzb() != null && firebaseAuth.zzb().zzb("PHONE_PROVIDER")) {
            firebaseAuth.zzb().zza(firebaseAuth.getTenantId(), Boolean.FALSE, recaptchaAction).addOnSuccessListener(new zzf(zzbVar, taskCompletionSource)).addOnFailureListener(new zzc(zzbVar, firebaseAuth, str, activity, z, z2, zzcgVar, taskCompletionSource));
        } else {
            zzbVar.zza(firebaseAuth, str, activity, z, z2, zzcgVar, (TaskCompletionSource<zzj>) taskCompletionSource);
        }
    }

    public static /* synthetic */ void zza(zzb zzbVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, zzcg zzcgVar, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new zzm().zza(((IntegrityTokenResponse) task.getResult()).token()).zza());
            return;
        }
        if (task.getException() != null) {
            task.getException().getMessage();
        }
        zzbVar.zza(firebaseAuth, zzcgVar, activity, taskCompletionSource);
    }

    private final void zza(FirebaseAuth firebaseAuth, zzcg zzcgVar, Activity activity, TaskCompletionSource<zzj> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
            return;
        }
        zzbl.zza(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (!zzax.zza().zza(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzaen.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
        } else {
            new zzafz(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new zzg(this, taskCompletionSource)).addOnFailureListener(new zzh(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z, boolean z2, final zzcg zzcgVar, final TaskCompletionSource<zzj> taskCompletionSource) {
        Task<zzahr> zza2;
        if (z && !z2) {
            IntegrityManager create = IntegrityManagerFactory.create(firebaseAuth.getApp().getApplicationContext());
            if (!TextUtils.isEmpty(this.zzc)) {
                zza2 = Tasks.forResult(new zzahr(this.zzc));
            } else {
                zza2 = firebaseAuth.zza();
            }
            zza2.continueWithTask(firebaseAuth.zzf(), new zze(this, str, create)).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzd
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zzb.zza(zzb.this, taskCompletionSource, firebaseAuth, zzcgVar, activity, task);
                }
            });
            return;
        }
        zza(firebaseAuth, zzcgVar, activity, taskCompletionSource);
    }

    public static boolean zza(Exception exc) {
        if (exc instanceof FirebaseAuthMissingActivityForRecaptchaException) {
            return true;
        }
        return (exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN");
    }
}
