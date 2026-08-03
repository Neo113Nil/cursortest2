package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzbe implements com.google.android.ump.ConsentForm {
    private final android.app.Application zzc;
    private final com.google.android.gms.internal.consent_sdk.zzbz zzd;
    private final com.google.android.gms.internal.consent_sdk.zzaq zze;
    private final com.google.android.gms.internal.consent_sdk.zzbs zzf;
    private final com.google.android.gms.internal.consent_sdk.zztm zzg;
    private final com.google.android.gms.internal.consent_sdk.zzcr zzh;
    private android.app.Dialog zzi;
    private com.google.android.gms.internal.consent_sdk.zzbx zzj;
    private final java.util.concurrent.atomic.AtomicBoolean zzk = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicReference zzl = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzm = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzn = new java.util.concurrent.atomic.AtomicReference();
    boolean zza = false;
    boolean zzb = false;

    zzbe(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzad zzadVar, com.google.android.gms.internal.consent_sdk.zzbz zzbzVar, com.google.android.gms.internal.consent_sdk.zzaq zzaqVar, com.google.android.gms.internal.consent_sdk.zzbs zzbsVar, com.google.android.gms.internal.consent_sdk.zztm zztmVar, com.google.android.gms.internal.consent_sdk.zzcr zzcrVar) {
        this.zzc = application;
        this.zzd = zzbzVar;
        this.zze = zzaqVar;
        this.zzf = zzbsVar;
        this.zzg = zztmVar;
        this.zzh = zzcrVar;
    }

    private final void zzk() {
        android.app.Dialog dialog = this.zzi;
        if (dialog != null) {
            dialog.dismiss();
            this.zzi = null;
        }
        this.zzd.zza(null);
        com.google.android.gms.internal.consent_sdk.zzbb zzbbVar = (com.google.android.gms.internal.consent_sdk.zzbb) this.zzn.getAndSet(null);
        if (zzbbVar != null) {
            zzbbVar.zzb();
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(android.app.Activity activity, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zzcz.zza();
        this.zzh.zzf();
        if (!this.zzk.compareAndSet(false, true)) {
            com.google.android.gms.internal.consent_sdk.zzg zzgVar = new com.google.android.gms.internal.consent_sdk.zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            zzl(zzgVar);
            onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
            return;
        }
        this.zzj.zzc();
        com.google.android.gms.internal.consent_sdk.zzbb zzbbVar = new com.google.android.gms.internal.consent_sdk.zzbb(this, activity);
        this.zzc.registerActivityLifecycleCallbacks(zzbbVar);
        this.zzn.set(zzbbVar);
        this.zzd.zza(activity);
        android.app.Dialog dialog = new android.app.Dialog(activity, android.R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzj);
        dialog.setCancelable(false);
        android.view.Window window = dialog.getWindow();
        if (window == null) {
            com.google.android.gms.internal.consent_sdk.zzg zzgVar2 = new com.google.android.gms.internal.consent_sdk.zzg(3, "Activity with null windows is passed in.");
            zzl(zzgVar2);
            onConsentFormDismissedListener.onConsentFormDismissed(zzgVar2.zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, false);
        this.zzm.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzi = dialog;
        this.zzj.zzd("UMP_messagePresented", "");
        zzl(null);
    }

    final com.google.android.gms.internal.consent_sdk.zzbx zzc() {
        return this.zzj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzf(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.zzj = ((com.google.android.gms.internal.consent_sdk.zzby) this.zzg).zzb();
        if (!this.zza) {
            this.zzh.zzi();
        }
        com.google.android.gms.internal.consent_sdk.zzbx zzbxVar = this.zzj;
        zzbxVar.setBackgroundColor(0);
        zzbxVar.getSettings().setJavaScriptEnabled(true);
        zzbxVar.getSettings().setAllowFileAccess(false);
        zzbxVar.getSettings().setAllowContentAccess(false);
        java.lang.Object[] objArr = 0;
        zzbxVar.setWebViewClient(new com.google.android.gms.internal.consent_sdk.zzbv(zzbxVar, null));
        if (!this.zza) {
            this.zzh.zzj();
        }
        this.zzl.set(new com.google.android.gms.internal.consent_sdk.zzbc(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, objArr == true ? 1 : 0));
        com.google.android.gms.internal.consent_sdk.zzbx zzbxVar2 = this.zzj;
        com.google.android.gms.internal.consent_sdk.zzbs zzbsVar = this.zzf;
        zzbxVar2.loadDataWithBaseURL(zzbsVar.zza(), zzbsVar.zzb(), "text/html", "UTF-8", null);
        com.google.android.gms.internal.consent_sdk.zzcz.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzbe.this.zzj(new com.google.android.gms.internal.consent_sdk.zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void zzg(int i) {
        zzk();
        com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (com.google.android.ump.ConsentForm.OnConsentFormDismissedListener) this.zzm.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zze.zzg(i);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    final void zzh(com.google.android.gms.internal.consent_sdk.zzg zzgVar) {
        zzk();
        com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (com.google.android.ump.ConsentForm.OnConsentFormDismissedListener) this.zzm.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        zzl(zzgVar);
        onConsentFormDismissedListener.onConsentFormDismissed(zzgVar.zza());
    }

    final void zzi() {
        com.google.android.gms.internal.consent_sdk.zzbc zzbcVar = (com.google.android.gms.internal.consent_sdk.zzbc) this.zzl.getAndSet(null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza && !this.zzb) {
            this.zzh.zzd(null);
        }
        zzbcVar.onConsentFormLoadSuccess(this);
    }

    final void zzj(com.google.android.gms.internal.consent_sdk.zzg zzgVar) {
        com.google.android.gms.internal.consent_sdk.zzbc zzbcVar = (com.google.android.gms.internal.consent_sdk.zzbc) this.zzl.getAndSet(null);
        if (zzbcVar == null) {
            return;
        }
        if (!this.zza) {
            java.lang.String message = zzgVar.getMessage();
            if (this.zzb) {
                this.zzh.zzb(message);
            } else {
                this.zzh.zzd(message);
            }
        }
        zzbcVar.onConsentFormLoadFailure(zzgVar.zza());
    }

    private final void zzl(com.google.android.gms.internal.consent_sdk.zzg zzgVar) {
        if (this.zza) {
            return;
        }
        java.lang.String message = zzgVar == null ? null : zzgVar.getMessage();
        if (this.zzb) {
            this.zzh.zzb(message);
        } else {
            this.zzh.zze(message);
        }
    }
}
