package com.google.android.gms.internal.ads;

import C0.RunnableC0085d;
import E2.f;
import E2.i;
import E2.o;
import F2.C0252s;
import F2.C0254t;
import H2.j;
import I2.C0294b;
import I2.I;
import I2.J;
import I2.K;
import I2.P;
import R0.d;
import R0.w;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.e;
import n3.AbstractC1464a;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;
import w1.C1761y0;

/* loaded from: classes.dex */
final class zzcfa extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzceb {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcfd zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbex zzE;
    private zzbev zzF;
    private zzazk zzG;
    private int zzH;
    private int zzI;
    private zzbck zzJ;
    private final zzbck zzK;
    private zzbck zzL;
    private final zzbcl zzM;
    private int zzN;
    private j zzO;
    private boolean zzP;
    private final I zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbaw zzY;
    private boolean zzZ;
    private final zzcfu zzb;
    private final zzauo zzc;
    private final zzfbe zzd;
    private final zzbdf zze;
    private final VersionInfoParcel zzf;
    private i zzg;
    private final E2.a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfaf zzk;
    private zzfai zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcej zzo;
    private j zzp;
    private zzebm zzq;
    private zzebk zzr;
    private zzcfv zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcfa(zzcfu zzcfuVar, zzcfv zzcfvVar, String str, boolean z4, boolean z7, zzauo zzauoVar, zzbdf zzbdfVar, VersionInfoParcel versionInfoParcel, zzbcn zzbcnVar, i iVar, E2.a aVar, zzbaw zzbawVar, zzfaf zzfafVar, zzfai zzfaiVar, zzfbe zzfbeVar) {
        super(zzcfuVar);
        zzfai zzfaiVar2;
        int i7 = 2;
        boolean z8 = false;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcfuVar;
        this.zzs = zzcfvVar;
        this.zzt = str;
        this.zzw = z4;
        this.zzc = zzauoVar;
        this.zzd = zzfbeVar;
        this.zze = zzbdfVar;
        this.zzf = versionInfoParcel;
        this.zzg = iVar;
        this.zzh = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        P p5 = o.f1952C.f1957c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.zzi = displayMetrics;
        this.zzj = displayMetrics.density;
        this.zzY = zzbawVar;
        this.zzk = zzfafVar;
        this.zzl = zzfaiVar;
        this.zzQ = new I(zzcfuVar.zza(), this, this);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlC)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e7) {
            int i8 = J.f3546b;
            J2.j.e("Unable to enable Javascript.", e7);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        zzbbp zzbbpVar = zzbby.zzlB;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        zzbbp zzbbpVar2 = zzbby.zznd;
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        o oVar = o.f1952C;
        settings.setUserAgentString(oVar.f1957c.x(zzcfuVar, versionInfoParcel.f10834a));
        Context context = getContext();
        AbstractC1464a.e0(context, new f(i7, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        addJavascriptInterface(new zzcfh(this, new zzcfg(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbcl zzbclVar = new zzbcl(new zzbcn(true, "make_wv", this.zzt));
        this.zzM = zzbclVar;
        zzbclVar.zza().zzc(null);
        if (((Boolean) zzbbwVar.zzb(zzbby.zzcb)).booleanValue() && (zzfaiVar2 = this.zzl) != null && zzfaiVar2.zzb != null) {
            zzbclVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbclVar.zza();
        zzbck zzf = zzbcn.zzf();
        this.zzK = zzf;
        zzbclVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        if (C1761y0.f17930d == null) {
            C1761y0.f17930d = new C1761y0(5, z8);
        }
        C1761y0 c1761y0 = C1761y0.f17930d;
        c1761y0.getClass();
        J.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(zzcfuVar);
        if (!defaultUserAgent.equals((String) c1761y0.f17932b)) {
            if (g.getRemoteContext(zzcfuVar) == null) {
                zzcfuVar.getSharedPreferences("admob_user_agent", 0).edit().putString(Session.JsonKeys.USER_AGENT, WebSettings.getDefaultUserAgent(zzcfuVar)).apply();
            }
            c1761y0.f17932b = defaultUserAgent;
        }
        J.k("User agent is updated.");
        oVar.f1961g.zzt();
    }

    private final synchronized void zzba() {
        zzfaf zzfafVar = this.zzk;
        if (zzfafVar != null && zzfafVar.zzam) {
            int i7 = J.f3546b;
            J2.j.b("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            int i8 = J.f3546b;
            J2.j.b("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i9 = J.f3546b;
        J2.j.b("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        o.f1952C.f1961g.zzr();
    }

    private final synchronized void zzbc() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbd(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z4 ? "0" : "1");
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf(String str) {
        final String str2 = "about:blank";
        try {
            P.f3579l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcev
                public final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    zzcfa zzcfaVar = zzcfa.this;
                    String str3 = this.zzb;
                    super/*android.webkit.WebView*/.loadUrl("about:blank");
                }
            });
        } catch (Throwable th) {
            o.f1952C.f1961g.zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            int i7 = J.f3546b;
            J2.j.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbcf.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcci) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbi() {
        zzbcl zzbclVar = this.zzM;
        if (zzbclVar == null) {
            return;
        }
        zzbcn zza2 = zzbclVar.zza();
        zzbcd zzg = o.f1952C.f1961g.zzg();
        if (zzg != null) {
            zzg.zzf(zza2);
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl = o.f1952C.f1961g.zzl();
        this.zzy = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0028 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0001, B:6:0x002f, B:8:0x0033, B:9:0x0040, B:14:0x0059, B:16:0x0078, B:18:0x0080, B:20:0x0086, B:23:0x0090, B:26:0x00a1, B:29:0x000f, B:31:0x0013, B:36:0x0028, B:37:0x002d, B:38:0x001a, B:40:0x0020), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void destroy() {
        View decorView;
        ViewTreeObserver viewTreeObserver;
        try {
            zzbi();
            I i7 = this.zzQ;
            i7.f3544e = false;
            Activity activity = i7.f3541b;
            if (activity != null && i7.f3542c) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(i7.f3545f);
                    }
                    i7.f3542c = false;
                }
                viewTreeObserver = null;
                if (viewTreeObserver != null) {
                }
                i7.f3542c = false;
            }
            j jVar = this.zzp;
            if (jVar != null) {
                jVar.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzl();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            o.f1952C.f1953A.zzd(this);
            zzbh();
            this.zzv = true;
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkM)).booleanValue()) {
                J.k("Destroying the WebView immediately...");
                zzX();
                return;
            }
            Activity zza2 = this.zzb.zza();
            if (zza2 != null && zza2.isDestroyed()) {
                J.k("Destroying the WebView immediately...");
                zzX();
            } else {
                J.k("Initiating WebView self destruct sequence in 3...");
                J.k("Loading blank page in WebView, 2...");
                zzbf("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            int i7 = J.f3546b;
            J2.j.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkN)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzbza.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceu
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.evaluateJavascript(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzl();
                        o.f1952C.f1953A.zzd(this);
                        zzbh();
                        zzbb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            int i7 = J.f3546b;
            J2.j.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            int i7 = J.f3546b;
            J2.j.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            int i7 = J.f3546b;
            J2.j.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcex
                @Override // java.lang.Runnable
                public final void run() {
                    super/*android.webkit.WebView*/.loadUrl(str);
                }
            });
        } catch (Throwable th) {
            o.f1952C.f1961g.zzw(th, "AdWebViewImpl.loadUrl");
            int i8 = J.f3546b;
            J2.j.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb, F2.InterfaceC0217a
    public final void onAdClicked() {
        zzcej zzcejVar = this.zzo;
        if (zzcejVar != null) {
            zzcejVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z4 = true;
            if (!zzaE()) {
                I i7 = this.zzQ;
                i7.f3543d = true;
                if (i7.f3544e) {
                    i7.a();
                }
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z7 = this.zzC;
            zzcej zzcejVar = this.zzo;
            if (zzcejVar == null || !zzcejVar.zzU()) {
                z4 = z7;
            } else {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
            }
            zzbd(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0011, B:10:0x0015, B:15:0x002a, B:16:0x002f, B:17:0x001c, B:19:0x0022, B:20:0x0034, B:22:0x003b, B:24:0x003f, B:26:0x0045, B:28:0x004b, B:30:0x0055, B:31:0x0061), top: B:2:0x0001 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        zzcej zzcejVar;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    I i7 = this.zzQ;
                    i7.f3543d = false;
                    Activity activity = i7.f3541b;
                    if (activity != null && i7.f3542c) {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            viewTreeObserver = decorView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeOnGlobalLayoutListener(i7.f3545f);
                            }
                            i7.f3542c = false;
                        }
                        viewTreeObserver = null;
                        if (viewTreeObserver != null) {
                        }
                        i7.f3542c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcejVar = this.zzo) != null && zzcejVar.zzU() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlb)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            P p5 = o.f1952C.f1957c;
            P.p(getContext(), intent);
        } catch (ActivityNotFoundException e7) {
            String f7 = AbstractC1663a.f("Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i7 = J.f3546b;
            J2.j.b(f7);
            o.f1952C.f1961g.zzw(e7, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        j zzL = zzL();
        if (zzL != null && zzaZ && zzL.f3248C) {
            zzL.f3248C = false;
            zzL.f3261c.zzaa();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bd A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:17:0x0026, B:19:0x002e, B:22:0x0033, B:24:0x003b, B:26:0x004d, B:29:0x0052, B:31:0x0059, B:34:0x0063, B:37:0x0068, B:40:0x0079, B:41:0x0091, B:45:0x0080, B:48:0x0085, B:52:0x009e, B:54:0x00a6, B:56:0x00b8, B:59:0x00bd, B:61:0x00d9, B:62:0x00e1, B:65:0x00dd, B:66:0x00e6, B:68:0x00ee, B:71:0x00f9, B:78:0x011d, B:80:0x0124, B:83:0x012b, B:85:0x013d, B:87:0x014b, B:90:0x0158, B:94:0x015d, B:96:0x01a5, B:97:0x01a9, B:99:0x01b0, B:104:0x01bd, B:106:0x01c3, B:107:0x01c6, B:109:0x01ca, B:110:0x01d3, B:116:0x01de), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:17:0x0026, B:19:0x002e, B:22:0x0033, B:24:0x003b, B:26:0x004d, B:29:0x0052, B:31:0x0059, B:34:0x0063, B:37:0x0068, B:40:0x0079, B:41:0x0091, B:45:0x0080, B:48:0x0085, B:52:0x009e, B:54:0x00a6, B:56:0x00b8, B:59:0x00bd, B:61:0x00d9, B:62:0x00e1, B:65:0x00dd, B:66:0x00e6, B:68:0x00ee, B:71:0x00f9, B:78:0x011d, B:80:0x0124, B:83:0x012b, B:85:0x013d, B:87:0x014b, B:90:0x0158, B:94:0x015d, B:96:0x01a5, B:97:0x01a9, B:99:0x01b0, B:104:0x01bd, B:106:0x01c3, B:107:0x01c6, B:109:0x01ca, B:110:0x01d3, B:116:0x01de), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:17:0x0026, B:19:0x002e, B:22:0x0033, B:24:0x003b, B:26:0x004d, B:29:0x0052, B:31:0x0059, B:34:0x0063, B:37:0x0068, B:40:0x0079, B:41:0x0091, B:45:0x0080, B:48:0x0085, B:52:0x009e, B:54:0x00a6, B:56:0x00b8, B:59:0x00bd, B:61:0x00d9, B:62:0x00e1, B:65:0x00dd, B:66:0x00e6, B:68:0x00ee, B:71:0x00f9, B:78:0x011d, B:80:0x0124, B:83:0x012b, B:85:0x013d, B:87:0x014b, B:90:0x0158, B:94:0x015d, B:96:0x01a5, B:97:0x01a9, B:99:0x01b0, B:104:0x01bd, B:106:0x01c3, B:107:0x01c6, B:109:0x01ca, B:110:0x01d3, B:116:0x01de), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i7, int i8) {
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12 = 0;
        if (zzaE()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzf()) {
            if (this.zzs.zzh()) {
                super.onMeasure(i7, i8);
                return;
            }
            if (this.zzs.zzj()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzea)).booleanValue()) {
                    super.onMeasure(i7, i8);
                    return;
                }
                zzcfd zzq = zzq();
                float zze = zzq != null ? zzq.zze() : 0.0f;
                if (zze == 0.0f) {
                    super.onMeasure(i7, i8);
                    return;
                }
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i8);
                float f7 = size2 * zze;
                int i13 = (int) (size / zze);
                if (size2 == 0) {
                    if (i13 != 0) {
                        i11 = (int) (i13 * zze);
                        i12 = size;
                        i10 = i13;
                        setMeasuredDimension(Math.min(i11, i12), Math.min(i13, i10));
                        return;
                    }
                    size2 = 0;
                }
                int i14 = (int) f7;
                if (size != 0) {
                    i12 = size;
                } else if (i14 != 0) {
                    i13 = (int) (i14 / zze);
                    i10 = size2;
                    i11 = i14;
                    i12 = i11;
                    setMeasuredDimension(Math.min(i11, i12), Math.min(i13, i10));
                    return;
                }
                i10 = size2;
                i11 = i14;
                setMeasuredDimension(Math.min(i11, i12), Math.min(i13, i10));
                return;
            }
            if (this.zzs.zzg()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzef)).booleanValue()) {
                    super.onMeasure(i7, i8);
                    return;
                }
                zzag("/contentHeight", new zzcey(this));
                zzaW("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f8 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i7);
                int i15 = this.zzI;
                setMeasuredDimension(size3, i15 != -1 ? (int) (i15 * f8) : View.MeasureSpec.getSize(i8));
                return;
            }
            if (this.zzs.zzi()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i7);
            int size4 = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size5 = View.MeasureSpec.getSize(i8);
            int i16 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i9 = Integer.MAX_VALUE;
                if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                    i16 = size5;
                }
                zzcfv zzcfvVar = this.zzs;
                z4 = zzcfvVar.zzb <= i9 || zzcfvVar.zza > i16;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfx)).booleanValue()) {
                    zzcfv zzcfvVar2 = this.zzs;
                    float f9 = zzcfvVar2.zzb;
                    float f10 = this.zzj;
                    z4 &= f9 / f10 <= ((float) i9) / f10 && ((float) zzcfvVar2.zza) / f10 <= ((float) i16) / f10;
                }
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.zzn) {
                        this.zzY.zzc(10002);
                        this.zzn = true;
                    }
                    zzcfv zzcfvVar3 = this.zzs;
                    setMeasuredDimension(zzcfvVar3.zzb, zzcfvVar3.zza);
                    return;
                }
                zzcfv zzcfvVar4 = this.zzs;
                float f11 = zzcfvVar4.zzb;
                float f12 = this.zzj;
                String str = "Not enough space to show ad. Needs " + ((int) (f11 / f12)) + "x" + ((int) (zzcfvVar4.zza / f12)) + " dp, but only has " + ((int) (size4 / f12)) + "x" + ((int) (size5 / f12)) + " dp.";
                int i17 = J.f3546b;
                J2.j.g(str);
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (this.zzm) {
                    return;
                }
                this.zzY.zzc(10001);
                this.zzm = true;
                return;
            }
            i9 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            i16 = size5;
            zzcfv zzcfvVar5 = this.zzs;
            if (zzcfvVar5.zzb <= i9) {
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfx)).booleanValue()) {
            }
            if (z4) {
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmA)).booleanValue() && d.a("MUTE_AUDIO")) {
                int i7 = J.f3546b;
                J2.j.b("Muting webview");
                Uri uri = w.f5874a;
                if (!S0.w.f6283Q.b()) {
                    throw S0.w.a();
                }
                w.f(this).f6313a.setAudioMuted(true);
            }
        } catch (Exception e7) {
            int i8 = J.f3546b;
            J2.j.e("Could not pause webview.", e7);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmD)).booleanValue()) {
                o.f1952C.f1961g.zzw(e7, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmA)).booleanValue() && d.a("MUTE_AUDIO")) {
                int i7 = J.f3546b;
                J2.j.b("Unmuting webview");
                Uri uri = w.f5874a;
                if (!S0.w.f6283Q.b()) {
                    throw S0.w.a();
                }
                w.f(this).f6313a.setAudioMuted(false);
            }
        } catch (Exception e7) {
            int i8 = J.f3546b;
            J2.j.e("Could not resume webview.", e7);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmD)).booleanValue()) {
                o.f1952C.f1961g.zzw(e7, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdI)).booleanValue() && this.zzo.zzR();
        if ((!this.zzo.zzU() || this.zzo.zzS()) && !z4) {
            zzauo zzauoVar = this.zzc;
            if (zzauoVar != null) {
                zzauoVar.zzd(motionEvent);
            }
            zzbdf zzbdfVar = this.zze;
            if (zzbdfVar != null) {
                zzbdfVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbex zzbexVar = this.zzE;
                    if (zzbexVar != null) {
                        zzbexVar.zzd(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzceb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcej) {
            this.zzo = (zzcej) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e7) {
            int i7 = J.f3546b;
            J2.j.e("Could not stop loading webview.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzA(int i7) {
        this.zzN = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzB(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzC(zzcfd zzcfdVar) {
        if (this.zzB == null) {
            this.zzB = zzcfdVar;
        } else {
            int i7 = J.f3546b;
            J2.j.d("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcds
    public final zzfaf zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfq
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfo
    public final zzauo zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized zzazk zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized zzbex zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized j zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized j zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final /* synthetic */ zzcft zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfn
    public final synchronized zzcfv zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized zzebk zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized zzebm zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfe
    public final zzfai zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final zzfbe zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final I3.b zzT() {
        zzbdf zzbdfVar = this.zze;
        return zzbdfVar == null ? zzgbc.zzh(null) : zzbdfVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzW(zzfaf zzfafVar, zzfai zzfaiVar) {
        this.zzk = zzfafVar;
        this.zzl = zzfaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzX() {
        J.k("Destroying WebView!");
        zzbb();
        P.f3579l.post(new zzcez(this));
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.f10834a);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzZ(int i7) {
        if (i7 == 0) {
            zzbcl zzbclVar = this.zzM;
            zzbcf.zza(zzbclVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i7));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i7));
        hashMap.put("version", this.zzf.f10834a);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zza(String str) {
        zzaW(str);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaA(String str, e eVar) {
        zzcej zzcejVar = this.zzo;
        if (zzcejVar != null) {
            zzcejVar.zzQ(str, eVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaD(final boolean z4, final int i7) {
        destroy();
        this.zzY.zzb(new zzbav() { // from class: com.google.android.gms.internal.ads.zzcew
            @Override // com.google.android.gms.internal.ads.zzbav
            public final void zza(zzbbd.zzt.zza zzaVar) {
                int i8 = zzcfa.zza;
                zzbbd.zzbl.zza zzb = zzbbd.zzbl.zzb();
                boolean zzf = zzb.zzf();
                boolean z7 = z4;
                if (zzf != z7) {
                    zzb.zzd(z7);
                }
                zzb.zze(i7);
                zzaVar.zzab(zzb.zzbr());
            }
        });
        this.zzY.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z7, String str) {
        this.zzo.zzv(zzcVar, z4, z7, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaK(String str, String str2, int i7) {
        this.zzo.zzw(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaL(boolean z4, int i7, boolean z7) {
        this.zzo.zzx(z4, i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaM(boolean z4, int i7, String str, String str2, boolean z7) {
        this.zzo.zzz(z4, i7, str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.zzcfl
    public final void zzaN(boolean z4, int i7, String str, boolean z7, boolean z8) {
        this.zzo.zzA(z4, i7, str, z7, z8);
    }

    public final zzcej zzaO() {
        return this.zzo;
    }

    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaV(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, null);
        } else {
            int i7 = J.f3546b;
            J2.j.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaW(String str) {
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaV(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
        } else {
            int i7 = J.f3546b;
            J2.j.g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        o.f1952C.f1961g.zzy(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r10.zzV != r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r10.zzV != r9) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaZ() {
        int i7;
        int i8;
        boolean z4 = false;
        if (this.zzo.zzT() || this.zzo.zzU()) {
            J2.d dVar = C0252s.f2717f.f2718a;
            int round = Math.round(r0.widthPixels / this.zzi.density);
            int round2 = Math.round(r0.heightPixels / this.zzi.density);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i7 = round;
                i8 = round2;
            } else {
                P p5 = o.f1952C.f1957c;
                int[] m7 = P.m(zza2);
                int round3 = Math.round(m7[0] / this.zzi.density);
                i8 = Math.round(m7[1] / this.zzi.density);
                i7 = round3;
            }
            P p7 = o.f1952C.f1957c;
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == round && this.zzR == round2 && this.zzT == i7 && this.zzU == i8) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzag)).booleanValue()) {
                }
            }
            if (this.zzS == round && this.zzR == round2) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzag)).booleanValue()) {
                }
                this.zzS = round;
                this.zzR = round2;
                this.zzT = i7;
                this.zzU = i8;
                this.zzV = rotation;
                new zzbrs(this, "").zzj(round, round2, i7, i8, this.zzi.density, rotation);
                return z4;
            }
            z4 = true;
            this.zzS = round;
            this.zzR = round2;
            this.zzT = i7;
            this.zzU = i8;
            this.zzV = rotation;
            new zzbrs(this, "").zzj(round, round2, i7, i8, this.zzi.density, rotation);
            return z4;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbcl zzbclVar = this.zzM;
            zzbcf.zza(zzbclVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbck zzf = zzbcn.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.f10834a);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzab() {
        boolean z4;
        float f7;
        HashMap hashMap = new HashMap(3);
        o oVar = o.f1952C;
        C0294b c0294b = oVar.f1962h;
        synchronized (c0294b) {
            z4 = c0294b.f3591a;
        }
        hashMap.put("app_muted", String.valueOf(z4));
        hashMap.put("app_volume", String.valueOf(oVar.f1962h.a()));
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                f7 = streamVolume / streamMaxVolume;
                hashMap.put("device_volume", String.valueOf(f7));
                zzd("volume", hashMap);
            }
        }
        f7 = 0.0f;
        hashMap.put("device_volume", String.valueOf(f7));
        zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzac(boolean z4) {
        this.zzo.zzm(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzad() {
        I i7 = this.zzQ;
        i7.f3544e = true;
        if (i7.f3543d) {
            i7.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        try {
            if (zzaE()) {
                int i7 = J.f3546b;
                J2.j.g("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String str5 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzad);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e7) {
                int i8 = J.f3546b;
                J2.j.h("Unable to build MRAID_ENV", e7);
                str4 = null;
            }
            super.loadDataWithBaseURL(str, zzcfm.zzb(str2, str4), "text/html", "UTF-8", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbck zzf = zzbcn.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzag(String str, zzbiz zzbizVar) {
        zzcej zzcejVar = this.zzo;
        if (zzcejVar != null) {
            zzcejVar.zzB(str, zzbizVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzah() {
        J.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzai(j jVar) {
        this.zzp = jVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzaj(zzcfv zzcfvVar) {
        this.zzs = zzcfvVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzak(zzazk zzazkVar) {
        this.zzG = zzazkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzal(boolean z4) {
        this.zzz = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.f3541b = this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzao(boolean z4) {
        j jVar = this.zzp;
        if (jVar != null) {
            jVar.y0(this.zzo.zzT(), z4);
        } else {
            this.zzu = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzap(zzbev zzbevVar) {
        this.zzF = zzbevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzaq(boolean z4) {
        try {
            boolean z7 = this.zzw;
            this.zzw = z4;
            zzba();
            if (z4 != z7) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzae)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                new zzbrs(this, "").zzl(true != z4 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzar(zzbex zzbexVar) {
        this.zzE = zzbexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzas(zzebk zzebkVar) {
        this.zzr = zzebkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzat(zzebm zzebmVar) {
        this.zzq = zzebmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzau(int i7) {
        j jVar = this.zzp;
        if (jVar != null) {
            jVar.Z(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzav(boolean z4) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzaw(j jVar) {
        this.zzO = jVar;
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzax(boolean z4) {
        j jVar;
        int i7 = this.zzH + (true != z4 ? -1 : 1);
        this.zzH = i7;
        if (i7 > 0 || (jVar = this.zzp) == null) {
            return;
        }
        synchronized (jVar.f3249D) {
            try {
                jVar.f3252G = true;
                RunnableC0085d runnableC0085d = jVar.f3251F;
                if (runnableC0085d != null) {
                    K k7 = P.f3579l;
                    k7.removeCallbacks(runnableC0085d);
                    k7.post(jVar.f3251F);
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final synchronized void zzay(boolean z4) {
        if (z4) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        j jVar = this.zzp;
        if (jVar != null) {
            if (z4) {
                jVar.f3247B.setBackgroundColor(0);
            } else {
                jVar.f3247B.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb
    public final void zzaz(String str, zzbiz zzbizVar) {
        zzcej zzcejVar = this.zzo;
        if (zzcejVar != null) {
            zzcejVar.zzP(str, zzbizVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzb(String str, String str2) {
        zzaW(AbstractC1663a.o(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzd(String str, Map map) {
        try {
            zze(str, C0252s.f2717f.f2718a.k(map));
        } catch (JSONException unused) {
            int i7 = J.f3546b;
            J2.j.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzcej zzcejVar = this.zzo;
        if (zzcejVar != null) {
            zzcejVar.zzdd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb, E2.i
    public final synchronized void zzde() {
        i iVar = this.zzg;
        if (iVar != null) {
            iVar.zzde();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzceb, E2.i
    public final synchronized void zzdf() {
        i iVar = this.zzg;
        if (iVar != null) {
            iVar.zzdf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzdg() {
        j zzL = zzL();
        if (zzL != null) {
            zzL.f3247B.f3242b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        boolean z4;
        synchronized (this) {
            z4 = zzaxwVar.zzj;
            this.zzC = z4;
        }
        zzbd(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder l7 = k.l("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String sb = l7.toString();
        int i7 = J.f3546b;
        J2.j.b("Dispatching AFMA event: ".concat(sb));
        zzaW(l7.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcaw
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final E2.a zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final zzbck zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final zzbcl zzl() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcfp, com.google.android.gms.internal.ads.zzcaw
    public final VersionInfoParcel zzm() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final zzcal zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized zzcci zzo(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcci) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzp(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final synchronized zzcfd zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized String zzr() {
        zzfai zzfaiVar = this.zzl;
        if (zzfaiVar == null) {
            return null;
        }
        return zzfaiVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized String zzs() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzceb, com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzt(String str, zzcci zzcciVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzcciVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
        zzcej zzcejVar = this.zzo;
        if (zzcejVar != null) {
            zzcejVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzv(boolean z4, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z4 ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzw() {
        zzbev zzbevVar = this.zzF;
        if (zzbevVar != null) {
            final zzdlg zzdlgVar = (zzdlg) zzbevVar;
            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdle
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdlg.this.zzd();
                    } catch (RemoteException e7) {
                        int i7 = J.f3546b;
                        J2.j.i("#007 Could not call remote method.", e7);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzx(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzy(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzz(boolean z4) {
        this.zzo.zzE(false);
    }
}
