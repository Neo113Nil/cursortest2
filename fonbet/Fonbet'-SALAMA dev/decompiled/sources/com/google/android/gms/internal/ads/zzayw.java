package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzayw extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzayn zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzayw() {
        zzayn zzaynVar = new zzayn();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzaynVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbdp.zzd.zze()).intValue();
        this.zzg = ((Long) zzbdp.zza.zze()).intValue();
        this.zzh = ((Long) zzbdp.zze.zze()).intValue();
        this.zzi = ((Long) zzbdp.zzc.zze()).intValue();
        zzbbp zzbbpVar = zzbby.zzah;
        C0254t c0254t = C0254t.f2723d;
        this.zzj = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        this.zzk = ((Integer) c0254t.f2726c.zzb(zzbby.zzai)).intValue();
        this.zzl = ((Integer) c0254t.f2726c.zzb(zzbby.zzaj)).intValue();
        this.zze = ((Long) zzbdp.zzf.zze()).intValue();
        this.zzm = (String) c0254t.f2726c.zzb(zzbby.zzal);
        this.zzn = ((Boolean) c0254t.f2726c.zzb(zzbby.zzam)).booleanValue();
        this.zzo = ((Boolean) c0254t.f2726c.zzb(zzbby.zzan)).booleanValue();
        ((Boolean) c0254t.f2726c.zzb(zzbby.zzao)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = E2.o.f1952C.f1960f.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        r1 = I2.J.f3546b;
        J2.j.b("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0095, code lost:
    
        E2.o.f1952C.f1961g.zzw(r0, "ContentFetchTask.extractContent");
        r2 = I2.J.f3546b;
        J2.j.b("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00de, code lost:
    
        r1 = I2.J.f3546b;
        J2.j.e("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cd, code lost:
    
        r1 = I2.J.f3546b;
        J2.j.e("Error in ContentFetchTask", r0);
        E2.o.f1952C.f1961g.zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e8->B:16:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        View view;
        while (true) {
            try {
                Context zzb = o.f1952C.f1960f.zzb();
                if (zzb != null) {
                    ActivityManager activityManager = (ActivityManager) zzb.getSystemService("activity");
                    KeyguardManager keyguardManager = (KeyguardManager) zzb.getSystemService("keyguard");
                    if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (Process.myPid() == next.pid) {
                                break;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                o.f1952C.f1961g.zzw(th, "ContentFetchTask.isInForeground");
            }
            int i7 = J.f3546b;
            j.b("ContentFetchTask: sleeping");
            zze();
            Thread.sleep(this.zze * zzbbd.zzq.zzf);
            synchronized (this.zzc) {
                while (this.zzb) {
                    try {
                        int i8 = J.f3546b;
                        j.b("ContentFetchTask: waiting");
                        this.zzc.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (view != null) {
            view.post(new zzays(this, view));
        }
        Thread.sleep(this.zze * zzbbd.zzq.zzf);
        synchronized (this.zzc) {
        }
    }

    public final zzayv zza(View view, zzaym zzaymVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzaymVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzayv(this, 1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof zzceb)) {
                    WebView webView = (WebView) view;
                    zzaymVar.zzf();
                    webView.post(new zzayu(this, zzaymVar, webView, globalVisibleRect));
                    return new zzayv(this, 0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i7 = 0;
                    int i8 = 0;
                    for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                        zzayv zza = zza(viewGroup.getChildAt(i9), zzaymVar);
                        i7 += zza.zza;
                        i8 += zza.zzb;
                    }
                    return new zzayv(this, i7, i8);
                }
            }
        }
        return new zzayv(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r11 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(View view) {
        try {
            zzaym zzaymVar = new zzaym(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context zzb = o.f1952C.f1960f.zzb();
            if (zzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(zzb.getResources().getIdentifier((String) C0254t.f2723d.f2726c.zzb(zzbby.zzak), "id", zzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzayv zza = zza(view, zzaymVar);
            zzaymVar.zzj();
            if (zza.zza == 0 && zza.zzb == 0) {
                return;
            }
            int i7 = zza.zzb;
            if (i7 == 0) {
                if (zzaymVar.zzb() == 0) {
                    return;
                }
            }
            if (this.zzd.zzc(zzaymVar)) {
                return;
            }
            this.zzd.zza(zzaymVar);
        } catch (Exception e7) {
            int i8 = J.f3546b;
            j.e("Exception in fetchContentOnUIThread", e7);
            o.f1952C.f1961g.zzw(e7, "ContentFetchTask.fetchContent");
        }
    }

    public final void zzc(zzaym zzaymVar, WebView webView, String str, boolean z4) {
        zzaymVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzaymVar.zzi(optString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzaymVar.zzi(webView.getTitle() + "\n" + optString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzaymVar.zzl()) {
                this.zzd.zzb(zzaymVar);
            }
        } catch (JSONException unused) {
            int i7 = J.f3546b;
            j.b("Json string may be malformed.");
        } catch (Throwable th) {
            int i8 = J.f3546b;
            j.c("Failed to get webview content.", th);
            o.f1952C.f1961g.zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i7 = J.f3546b;
                    j.b("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            int i7 = J.f3546b;
            j.b("ContentFetchThread: paused, pause = true");
        }
    }
}
