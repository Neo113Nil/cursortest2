package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f9 */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        while (true) {
            try {
                Context contextZzb = o.f1952C.f1960f.zzb();
                try {
                    if (contextZzb != null) {
                        ActivityManager activityManager = (ActivityManager) contextZzb.getSystemService("activity");
                        KeyguardManager keyguardManager = (KeyguardManager) contextZzb.getSystemService("keyguard");
                        if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    ActivityManager.RunningAppProcessInfo next = it.next();
                                    if (Process.myPid() == next.pid) {
                                        if (next.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) contextZzb.getSystemService("power")) != null && powerManager.isScreenOn()) {
                                            Activity activityZza = o.f1952C.f1960f.zza();
                                            if (activityZza == null) {
                                                int i7 = J.f3546b;
                                                j.b("ContentFetchThread: no activity. Sleeping.");
                                                zze();
                                            } else {
                                                View viewFindViewById = null;
                                                try {
                                                    if (activityZza.getWindow() != null && activityZza.getWindow().getDecorView() != null) {
                                                        viewFindViewById = activityZza.getWindow().getDecorView().findViewById(R.id.content);
                                                    }
                                                } catch (Exception e7) {
                                                    o.f1952C.f1961g.zzw(e7, "ContentFetchTask.extractContent");
                                                    int i8 = J.f3546b;
                                                    j.b("Failed getting root view of activity. Content not extracted.");
                                                }
                                                if (viewFindViewById != null) {
                                                    viewFindViewById.post(new zzays(this, viewFindViewById));
                                                }
                                            }
                                        }
                                        Thread.sleep(this.zze * zzbbd.zzq.zzf);
                                    }
                                }
                            }
                        }
                        synchronized (this.zzc) {
                            while (this.zzb) {
                                try {
                                    int i9 = J.f3546b;
                                    j.b("ContentFetchTask: waiting");
                                    this.zzc.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                    int i10 = J.f3546b;
                    j.b("ContentFetchTask: sleeping");
                    zze();
                    Thread.sleep(this.zze * zzbbd.zzq.zzf);
                } catch (InterruptedException e8) {
                    int i11 = J.f3546b;
                    j.e("Error in ContentFetchTask", e8);
                } catch (Exception e9) {
                    int i12 = J.f3546b;
                    j.e("Error in ContentFetchTask", e9);
                    o.f1952C.f1961g.zzw(e9, "ContentFetchTask.run");
                }
            } catch (Throwable th) {
                o.f1952C.f1961g.zzw(th, "ContentFetchTask.isInForeground");
            }
            synchronized (this.zzc) {
                while (this.zzb) {
                    int i13 = J.f3546b;
                    j.b("ContentFetchTask: waiting");
                    this.zzc.wait();
                }
            }
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
                        zzayv zzayvVarZza = zza(viewGroup.getChildAt(i9), zzaymVar);
                        i7 += zzayvVarZza.zza;
                        i8 += zzayvVarZza.zzb;
                    }
                    return new zzayv(this, i7, i8);
                }
            }
        }
        return new zzayv(this, 0, 0);
    }

    public final void zzb(View view) {
        try {
            zzaym zzaymVar = new zzaym(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = o.f1952C.f1960f.zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) C0254t.f2723d.f2726c.zzb(zzbby.zzak), "id", contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzayv zzayvVarZza = zza(view, zzaymVar);
            zzaymVar.zzj();
            if (zzayvVarZza.zza == 0 && zzayvVarZza.zzb == 0) {
                return;
            }
            int i7 = zzayvVarZza.zzb;
            if (i7 != 0) {
                if (i7 == 0) {
                }
                this.zzd.zza(zzaymVar);
            } else if (zzaymVar.zzb() == 0) {
                return;
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
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzaymVar.zzi(strOptString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzaymVar.zzi(webView.getTitle() + "\n" + strOptString, z4, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
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
