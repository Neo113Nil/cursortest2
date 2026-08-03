package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbfq extends java.lang.Thread {
    private boolean zza;
    private boolean zzb;
    private final java.lang.Object zzc;
    private final com.google.android.gms.internal.ads.zzbfh zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final java.lang.String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbfq() {
        com.google.android.gms.internal.ads.zzbfh zzbfhVar = new com.google.android.gms.internal.ads.zzbfh();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbfhVar;
        this.zzc = new java.lang.Object();
        this.zzf = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkh.zzd.zze()).intValue();
        this.zzg = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkh.zza.zze()).intValue();
        this.zzh = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkh.zze.zze()).intValue();
        this.zzi = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkh.zzc.zze()).intValue();
        this.zzj = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaG)).intValue();
        this.zzk = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaH)).intValue();
        this.zzl = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaI)).intValue();
        this.zze = ((java.lang.Long) com.google.android.gms.internal.ads.zzbkh.zzf.zze()).intValue();
        this.zzm = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaK);
        this.zzn = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaL)).booleanValue();
        this.zzo = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaM)).booleanValue();
        ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaN)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
    
        if (r0.getWindow() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007e, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0090, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0091, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.extractContent");
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00dc, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ca, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e6 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e6->B:16:0x00e6, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.lang.Object obj;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        android.view.View view;
        while (true) {
            try {
                android.content.Context zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
                if (zze != null) {
                    android.app.ActivityManager activityManager = (android.app.ActivityManager) zze.getSystemService("activity");
                    android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) zze.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                            if (android.os.Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.isInForeground");
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: sleeping");
            zze();
            java.lang.Thread.sleep(this.zze * 1000);
            obj = this.zzc;
            synchronized (obj) {
                while (this.zzb) {
                    try {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchTask: waiting");
                        obj.wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new com.google.android.gms.internal.ads.zzbfm(this, view));
        }
        java.lang.Thread.sleep(this.zze * 1000);
        obj = this.zzc;
        synchronized (obj) {
        }
    }

    public final void zza() {
        synchronized (this.zzc) {
            if (this.zza) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    final void zzb(android.view.View view) {
        try {
            com.google.android.gms.internal.ads.zzbfg zzbfgVar = new com.google.android.gms.internal.ads.zzbfg(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            android.content.Context zze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (zze != null) {
                java.lang.String str = this.zzm;
                if (!android.text.TextUtils.isEmpty(str)) {
                    java.lang.String str2 = (java.lang.String) view.getTag(zze.getResources().getIdentifier((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaJ), "id", zze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            com.google.android.gms.internal.ads.zzbfp zzc = zzc(view, zzbfgVar);
            zzbfgVar.zzi();
            if (zzc.zza == 0 && zzc.zzb == 0) {
                return;
            }
            int i = zzc.zzb;
            if (i == 0 && zzbfgVar.zzl() == 0) {
                return;
            }
            if (i == 0 && this.zzd.zza(zzbfgVar)) {
                return;
            }
            this.zzd.zzc(zzbfgVar);
        } catch (java.lang.Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "ContentFetchTask.fetchContent");
        }
    }

    final com.google.android.gms.internal.ads.zzbfp zzc(android.view.View view, com.google.android.gms.internal.ads.zzbfg zzbfgVar) {
        if (view == null) {
            return new com.google.android.gms.internal.ads.zzbfp(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new android.graphics.Rect());
        if ((view instanceof android.widget.TextView) && !(view instanceof android.widget.EditText)) {
            java.lang.CharSequence text = ((android.widget.TextView) view).getText();
            if (android.text.TextUtils.isEmpty(text)) {
                return new com.google.android.gms.internal.ads.zzbfp(this, 0, 0);
            }
            zzbfgVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new com.google.android.gms.internal.ads.zzbfp(this, 1, 0);
        }
        if ((view instanceof android.webkit.WebView) && !(view instanceof com.google.android.gms.internal.ads.zzcku)) {
            android.webkit.WebView webView = (android.webkit.WebView) view;
            zzbfgVar.zze();
            webView.post(new com.google.android.gms.internal.ads.zzbfo(this, zzbfgVar, webView, globalVisibleRect));
            return new com.google.android.gms.internal.ads.zzbfp(this, 0, 1);
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return new com.google.android.gms.internal.ads.zzbfp(this, 0, 0);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            com.google.android.gms.internal.ads.zzbfp zzc = zzc(viewGroup.getChildAt(i3), zzbfgVar);
            i += zzc.zza;
            i2 += zzc.zzb;
        }
        return new com.google.android.gms.internal.ads.zzbfp(this, i, i2);
    }

    final void zzd(com.google.android.gms.internal.ads.zzbfg zzbfgVar, android.webkit.WebView webView, java.lang.String str, boolean z) {
        zzbfgVar.zzd();
        try {
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String optString = new org.json.JSONObject(str).optString("text");
                if (this.zzn || android.text.TextUtils.isEmpty(webView.getTitle())) {
                    zzbfgVar.zzf(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    java.lang.String title = webView.getTitle();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(title).length() + 1 + java.lang.String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzbfgVar.zzf(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzbfgVar.zza()) {
                this.zzd.zzb(zzbfgVar);
            }
        } catch (org.json.JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (java.lang.Throwable th) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("ContentFetchThread: paused, pause = true");
            java.lang.String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }
}
