package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzcr {
    private final android.app.Application zzd;
    private final com.google.android.gms.internal.consent_sdk.zzco zze;
    private final java.util.concurrent.Executor zzf;
    private final boolean zzg;
    private final java.util.concurrent.atomic.AtomicReference zzh = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    private final java.util.concurrent.atomic.AtomicReference zzi = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    private final java.util.concurrent.atomic.AtomicReference zzj = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    private final java.util.concurrent.atomic.AtomicReference zzk = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    private final java.util.concurrent.atomic.AtomicReference zzl = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    public final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference(new java.util.ArrayDeque());
    final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference(null);

    zzcr(com.google.android.gms.internal.consent_sdk.zzad zzadVar, android.app.Application application, java.util.concurrent.Executor executor, com.google.android.gms.internal.consent_sdk.zzco zzcoVar, boolean z) {
        this.zzg = z;
        this.zzd = application;
        this.zze = zzcoVar;
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        java.lang.String str = (java.lang.String) this.zza.get();
        if (str == null) {
            android.util.Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzl;
        int size = ((java.util.Queue) atomicReference.get()).size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.consent_sdk.zzif zzifVar = (com.google.android.gms.internal.consent_sdk.zzif) ((java.util.Queue) atomicReference.get()).poll();
            if (zzifVar != null) {
                try {
                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URI(str).toURL().openConnection();
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, android.webkit.WebSettings.getDefaultUserAgent(this.zzd));
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                    zzifVar.zzE(httpURLConnection.getOutputStream());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200 && responseCode != 204) {
                        android.util.Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new java.util.Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                        ((java.util.Queue) atomicReference.get()).add(zzifVar);
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(java.lang.String.valueOf(e.getMessage())));
                    ((java.util.Queue) this.zzl.get()).add(zzifVar);
                } catch (java.net.URISyntaxException e2) {
                    android.util.Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e2.getMessage());
                }
            }
        }
    }

    private final void zzm(java.util.Queue queue, int i, int i2, java.lang.String str) {
        java.lang.Long l = (java.lang.Long) queue.poll();
        if (l != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - l.longValue();
            if (str != null) {
                i = i2;
            }
            java.util.concurrent.atomic.AtomicReference atomicReference = this.zzl;
            ((java.util.Queue) atomicReference.get()).add(this.zze.zza(i, str, currentTimeMillis));
            if (this.zzg) {
                ((java.util.ArrayDeque) this.zzc.get()).addAll((java.util.Collection) atomicReference.get());
            }
            this.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcq
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.consent_sdk.zzcr.this.zzl();
                }
            });
        }
    }

    public final void zzb(java.lang.String str) {
        zzm((java.util.Queue) this.zzj.get(), 10, 11, str);
    }

    public final void zzc() {
        ((java.util.Queue) this.zzj.get()).add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void zzd(java.lang.String str) {
        zzm((java.util.Queue) this.zzb.get(), 4, 5, str);
    }

    public final void zze(java.lang.String str) {
        zzm((java.util.Queue) this.zzi.get(), 6, 7, str);
    }

    public final void zzf() {
        ((java.util.Queue) this.zzi.get()).add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void zzg(java.lang.String str) {
        zzm((java.util.Queue) this.zzh.get(), 8, 9, str);
    }

    public final void zzh() {
        ((java.util.Queue) this.zzh.get()).add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void zzi() {
        ((java.util.Queue) this.zzk.get()).add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void zzj() {
        zzm((java.util.Queue) this.zzk.get(), 3, 2, null);
    }

    public final void zzk(java.lang.String str) {
        this.zza.set(str);
    }
}
