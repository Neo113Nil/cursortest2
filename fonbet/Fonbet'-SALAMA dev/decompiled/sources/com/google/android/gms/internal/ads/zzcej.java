package com.google.android.gms.internal.ads;

import E2.l;
import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import H2.c;
import H2.m;
import I2.J;
import I2.P;
import I2.Q;
import J2.g;
import J2.j;
import P.U;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m3.e;
import w1.C1718l0;

/* loaded from: classes.dex */
public class zzcej extends WebViewClient implements zzcft {
    public static final /* synthetic */ int zzb = 0;
    private zzdqq zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzeaq zzG;
    private View.OnAttachStateChangeListener zzH;
    protected zzbwy zza;
    private final zzceb zzc;
    private final zzbaw zzd;
    private InterfaceC0217a zzg;
    private m zzh;
    private zzcfr zzi;
    private zzcfs zzj;
    private zzbhp zzk;
    private zzbhr zzl;
    private zzdcp zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private c zzw;
    private zzbrr zzx;
    private E2.b zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrm zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) C0254t.f2723d.f2726c.zzb(zzbby.zzfH)).split(",")));

    public zzcej(zzceb zzcebVar, zzbaw zzbawVar, boolean z4, zzbrr zzbrrVar, zzbrm zzbrmVar, zzeaq zzeaqVar) {
        this.zzd = zzbawVar;
        this.zzc = zzcebVar;
        this.zzs = z4;
        this.zzx = zzbrrVar;
        this.zzG = zzeaqVar;
    }

    private static WebResourceResponse zzW() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaX)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzX(String str, Map map) {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i7 = 0;
            while (true) {
                i7++;
                if (i7 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                o.f1952C.f1957c.z(this.zzc.getContext(), this.zzc.zzm().f10834a, httpURLConnection, 60000);
                g gVar = new g();
                webResourceResponse = null;
                gVar.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                gVar.b(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (!headerField.startsWith("tel:")) {
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i8 = J.f3546b;
                        j.g("Protocol is null");
                        webResourceResponse = zzW();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        int i9 = J.f3546b;
                        j.g("Unsupported scheme: " + protocol);
                        webResourceResponse = zzW();
                        break;
                    }
                    String str2 = "Redirecting to " + headerField;
                    int i10 = J.f3546b;
                    j.b(str2);
                    httpURLConnection.disconnect();
                    url = url2;
                }
            }
            String contentType = httpURLConnection.getContentType();
            String str3 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i11 = 1;
                    while (true) {
                        if (i11 >= split.length) {
                            break;
                        }
                        if (split[i11].trim().startsWith("charset")) {
                            String[] split2 = split[i11].trim().split("=");
                            if (split2.length > 1) {
                                str3 = split2[1].trim();
                                break;
                            }
                        }
                        i11++;
                    }
                }
            }
            String str4 = str3;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            Q q7 = o.f1952C.f1959e;
            int responseCode2 = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            InputStream inputStream = httpURLConnection.getInputStream();
            q7.getClass();
            webResourceResponse = new WebResourceResponse(trim, str4, responseCode2, responseMessage, hashMap, inputStream);
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzY(Map map, List list, String str) {
        if (J.m()) {
            J.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                J.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbiz) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzZ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(final View view, final zzbwy zzbwyVar, final int i7) {
        if (!zzbwyVar.zzi() || i7 <= 0) {
            return;
        }
        zzbwyVar.zzg(view);
        if (zzbwyVar.zzi()) {
            P.f3579l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcec
                @Override // java.lang.Runnable
                public final void run() {
                    zzcej.this.zzaa(view, zzbwyVar, i7 - 1);
                }
            }, 100L);
        }
    }

    private static final boolean zzab(zzceb zzcebVar) {
        return zzcebVar.zzD() != null && zzcebVar.zzD().zzb();
    }

    private static final boolean zzac(boolean z4, zzceb zzcebVar) {
        return (!z4 || zzcebVar.zzO().zzi() || zzcebVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    public static void zzh(zzcej zzcejVar) {
        zzcejVar.zzc.zzad();
        H2.j zzL = zzcejVar.zzc.zzL();
        if (zzL != null) {
            zzL.f3247B.removeView(zzL.f3263e);
            zzL.x0(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft, F2.InterfaceC0217a
    public final void onAdClicked() {
        InterfaceC0217a interfaceC0217a = this.zzg;
        if (interfaceC0217a != null) {
            interfaceC0217a.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        J.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzn(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Toolbar toolbar;
        synchronized (this.zzf) {
            try {
                if (this.zzc.zzaE()) {
                    J.k("Blank page loaded, 1...");
                    this.zzc.zzX();
                    return;
                }
                this.zzB = true;
                zzcfs zzcfsVar = this.zzj;
                if (zzcfsVar != null) {
                    zzcfsVar.zza();
                    this.zzj = null;
                }
                zzk();
                if (this.zzc.zzL() != null) {
                    if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlT)).booleanValue() || (toolbar = this.zzc.zzL().f3257L) == null) {
                        return;
                    }
                    toolbar.setSubtitle(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.zzo = true;
        this.zzp = i7;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzceb zzcebVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcebVar.zzaD(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        J.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzn(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    InterfaceC0217a interfaceC0217a = this.zzg;
                    if (interfaceC0217a != null) {
                        interfaceC0217a.onAdClicked();
                        zzbwy zzbwyVar = this.zza;
                        if (zzbwyVar != null) {
                            zzbwyVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdcp zzdcpVar = this.zzm;
                    if (zzdcpVar != null) {
                        zzdcpVar.zzdd();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                j.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzauo zzI = this.zzc.zzI();
                    zzfbe zzS = this.zzc.zzS();
                    if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || zzS == null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzceb zzcebVar = this.zzc;
                            parse = zzI.zza(parse, context, (View) zzcebVar, zzcebVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzceb zzcebVar2 = this.zzc;
                        parse = zzS.zza(parse, context2, (View) zzcebVar2, zzcebVar2.zzi());
                    }
                } catch (zzaup unused) {
                    j.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                E2.b bVar = this.zzy;
                if (bVar == null || bVar.b()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzceb zzcebVar3 = this.zzc;
                    zzv(zzcVar, true, false, zzcebVar3 != null ? zzcebVar3.zzr() : "");
                } else {
                    bVar.a(str);
                }
            }
        }
        return true;
    }

    public final void zzA(boolean z4, int i7, String str, boolean z7, boolean z8) {
        zzceb zzcebVar = this.zzc;
        boolean zzaF = zzcebVar.zzaF();
        boolean zzac = zzac(zzaF, zzcebVar);
        boolean z9 = true;
        if (!zzac && z7) {
            z9 = false;
        }
        InterfaceC0217a interfaceC0217a = zzac ? null : this.zzg;
        zzcei zzceiVar = zzaF ? null : new zzcei(this.zzc, this.zzh);
        zzbhp zzbhpVar = this.zzk;
        zzbhr zzbhrVar = this.zzl;
        c cVar = this.zzw;
        zzceb zzcebVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(interfaceC0217a, zzceiVar, zzbhpVar, zzbhrVar, cVar, zzcebVar2, z4, i7, str, zzcebVar2.zzm(), z9 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null, z8));
    }

    public final void zzB(String str, zzbiz zzbizVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.zze.put(str, list);
                }
                list.add(zzbizVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzC(zzcfr zzcfrVar) {
        this.zzi = zzcfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzD(int i7, int i8) {
        zzbrm zzbrmVar = this.zzz;
        if (zzbrmVar != null) {
            zzbrmVar.zze(i7, i8);
        }
    }

    public final void zzE(boolean z4) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzF(boolean z4) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzG(boolean z4) {
        synchronized (this.zzf) {
            this.zzv = z4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzH() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzced
                @Override // java.lang.Runnable
                public final void run() {
                    zzcej.zzh(zzcej.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzI(boolean z4) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzJ(zzcfs zzcfsVar) {
        this.zzj = zzcfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzK(zzcln zzclnVar, zzeaf zzeafVar, zzfia zzfiaVar) {
        zzO("/click");
        if (zzeafVar != null && zzfiaVar != null) {
            zzB("/click", new zzfbi(this.zzm, zzclnVar, zzfiaVar, zzeafVar));
            return;
        }
        zzdcp zzdcpVar = this.zzm;
        zzbiz zzbizVar = zzbiy.zza;
        zzB("/click", new zzbhx(zzdcpVar, zzclnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzL(zzcln zzclnVar) {
        zzO("/click");
        zzdcp zzdcpVar = this.zzm;
        zzbiz zzbizVar = zzbiy.zza;
        zzB("/click", new zzbhx(zzdcpVar, zzclnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzM(zzcln zzclnVar, zzeaf zzeafVar, zzdqq zzdqqVar) {
        zzO("/open");
        zzB("/open", new zzbjl(this.zzy, this.zzz, zzeafVar, zzdqqVar, zzclnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzN(zzfaf zzfafVar) {
        if (o.f1952C.f1978y.zzp(this.zzc.getContext())) {
            zzO("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbjf(this.zzc.getContext(), zzfafVar.zzaw));
        }
    }

    public final void zzO(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzP(String str, zzbiz zzbizVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbizVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzQ(String str, e eVar) {
        synchronized (this.zzf) {
            try {
                List<zzbiz> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbiz zzbizVar : list) {
                    if (eVar.apply(zzbizVar)) {
                        arrayList.add(zzbizVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzR() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzu;
        }
        return z4;
    }

    public final boolean zzS() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzv;
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final boolean zzT() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzs;
        }
        return z4;
    }

    public final boolean zzU() {
        boolean z4;
        synchronized (this.zzf) {
            z4 = this.zzt;
        }
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzV(InterfaceC0217a interfaceC0217a, zzbhp zzbhpVar, m mVar, zzbhr zzbhrVar, c cVar, boolean z4, zzbjc zzbjcVar, E2.b bVar, zzbrt zzbrtVar, zzbwy zzbwyVar, final zzeaf zzeafVar, final zzfia zzfiaVar, zzdqq zzdqqVar, zzbjt zzbjtVar, zzdcp zzdcpVar, zzbjs zzbjsVar, zzbjm zzbjmVar, zzbja zzbjaVar, zzcln zzclnVar) {
        E2.b bVar2 = bVar == null ? new E2.b(this.zzc.getContext(), zzbwyVar) : bVar;
        this.zzz = new zzbrm(this.zzc, zzbrtVar);
        this.zza = zzbwyVar;
        zzbbp zzbbpVar = zzbby.zzbe;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzB("/adMetadata", new zzbho(zzbhpVar));
        }
        if (zzbhrVar != null) {
            zzB("/appEvent", new zzbhq(zzbhrVar));
        }
        zzB("/backButton", zzbiy.zzj);
        zzB("/refresh", zzbiy.zzk);
        zzB("/canOpenApp", zzbiy.zzb);
        zzB("/canOpenURLs", zzbiy.zza);
        zzB("/canOpenIntents", zzbiy.zzc);
        zzB("/close", zzbiy.zzd);
        zzB("/customClose", zzbiy.zze);
        zzB("/instrument", zzbiy.zzn);
        zzB("/delayPageLoaded", zzbiy.zzp);
        zzB("/delayPageClosed", zzbiy.zzq);
        zzB("/getLocationInfo", zzbiy.zzr);
        zzB("/log", zzbiy.zzg);
        zzB("/mraid", new zzbjg(bVar2, this.zzz, zzbrtVar));
        zzbrr zzbrrVar = this.zzx;
        if (zzbrrVar != null) {
            zzB("/mraidLoaded", zzbrrVar);
        }
        E2.b bVar3 = bVar2;
        zzB("/open", new zzbjl(bVar2, this.zzz, zzeafVar, zzdqqVar, zzclnVar));
        zzB("/precache", new zzccj());
        zzB("/touch", zzbiy.zzi);
        zzB("/video", zzbiy.zzl);
        zzB("/videoMeta", zzbiy.zzm);
        if (zzeafVar == null || zzfiaVar == null) {
            zzB("/click", new zzbhx(zzdcpVar, zzclnVar));
            zzB("/httpTrack", zzbiy.zzf);
        } else {
            zzB("/click", new zzfbi(zzdcpVar, zzclnVar, zzfiaVar, zzeafVar));
            zzB("/httpTrack", new zzbiz() { // from class: com.google.android.gms.internal.ads.zzfbj
                @Override // com.google.android.gms.internal.ads.zzbiz
                public final void zza(Object obj, Map map) {
                    zzcds zzcdsVar = (zzcds) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        int i7 = J.f3546b;
                        j.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfaf zzD = zzcdsVar.zzD();
                    if (zzD != null && !zzD.zzai) {
                        zzfia.this.zzd(str, zzD.zzax, null);
                        return;
                    }
                    zzfai zzR = ((zzcfe) zzcdsVar).zzR();
                    if (zzR == null) {
                        o.f1952C.f1961g.zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    } else {
                        zzeaf zzeafVar2 = zzeafVar;
                        o.f1952C.j.getClass();
                        zzeafVar2.zzd(new zzeah(System.currentTimeMillis(), zzR.zzb, str, 2));
                    }
                }
            });
        }
        if (o.f1952C.f1978y.zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            zzB("/logScionEvent", new zzbjf(this.zzc.getContext(), hashMap));
        }
        if (zzbjcVar != null) {
            zzB("/setInterstitialProperties", new zzbjb(zzbjcVar));
        }
        zzbbw zzbbwVar = c0254t.f2726c;
        if (zzbjtVar != null && ((Boolean) zzbbwVar.zzb(zzbby.zziU)).booleanValue()) {
            zzB("/inspectorNetworkExtras", zzbjtVar);
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzjn)).booleanValue() && zzbjsVar != null) {
            zzB("/shareSheet", zzbjsVar);
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzjs)).booleanValue() && zzbjmVar != null) {
            zzB("/inspectorOutOfContextTest", zzbjmVar);
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzjw)).booleanValue() && zzbjaVar != null) {
            zzB("/inspectorStorage", zzbjaVar);
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzly)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbiy.zzu);
            zzB("/presentPlayStoreOverlay", zzbiy.zzv);
            zzB("/expandPlayStoreOverlay", zzbiy.zzw);
            zzB("/collapsePlayStoreOverlay", zzbiy.zzx);
            zzB("/closePlayStoreOverlay", zzbiy.zzy);
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzdw)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbiy.zzA);
            zzB("/resetPAID", zzbiy.zzz);
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzlS)).booleanValue()) {
            zzceb zzcebVar = this.zzc;
            if (zzcebVar.zzD() != null && zzcebVar.zzD().zzar) {
                zzB("/writeToLocalStorage", zzbiy.zzB);
                zzB("/clearLocalStorageKeys", zzbiy.zzC);
            }
        }
        this.zzg = interfaceC0217a;
        this.zzh = mVar;
        this.zzk = zzbhpVar;
        this.zzl = zzbhrVar;
        this.zzw = cVar;
        this.zzy = bVar3;
        this.zzm = zzdcpVar;
        this.zzA = zzdqqVar;
        this.zzn = z4;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c6 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #11 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004f, B:15:0x006b, B:17:0x0084, B:19:0x009b, B:20:0x009e, B:21:0x00a1, B:24:0x00bb, B:27:0x00d5, B:29:0x00e6, B:47:0x01b7, B:48:0x0170, B:51:0x029e, B:65:0x0225, B:66:0x024e, B:59:0x01fd, B:61:0x014b, B:82:0x00de, B:83:0x024f, B:85:0x0259, B:87:0x025f, B:89:0x0292, B:93:0x02ad, B:95:0x02b3, B:97:0x02c1), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x029e A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #11 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004f, B:15:0x006b, B:17:0x0084, B:19:0x009b, B:20:0x009e, B:21:0x00a1, B:24:0x00bb, B:27:0x00d5, B:29:0x00e6, B:47:0x01b7, B:48:0x0170, B:51:0x029e, B:65:0x0225, B:66:0x024e, B:59:0x01fd, B:61:0x014b, B:82:0x00de, B:83:0x024f, B:85:0x0259, B:87:0x025f, B:89:0x0292, B:93:0x02ad, B:95:0x02b3, B:97:0x02c1), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f2 A[Catch: all -> 0x01ab, TryCatch #8 {all -> 0x01ab, blocks: (B:42:0x0190, B:44:0x01a2, B:46:0x01ad, B:55:0x01e0, B:57:0x01f2, B:58:0x01f9), top: B:28:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024f A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #11 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004f, B:15:0x006b, B:17:0x0084, B:19:0x009b, B:20:0x009e, B:21:0x00a1, B:24:0x00bb, B:27:0x00d5, B:29:0x00e6, B:47:0x01b7, B:48:0x0170, B:51:0x029e, B:65:0x0225, B:66:0x024e, B:59:0x01fd, B:61:0x014b, B:82:0x00de, B:83:0x024f, B:85:0x0259, B:87:0x025f, B:89:0x0292, B:93:0x02ad, B:95:0x02b3, B:97:0x02c1), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b3 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #11 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004f, B:15:0x006b, B:17:0x0084, B:19:0x009b, B:20:0x009e, B:21:0x00a1, B:24:0x00bb, B:27:0x00d5, B:29:0x00e6, B:47:0x01b7, B:48:0x0170, B:51:0x029e, B:65:0x0225, B:66:0x024e, B:59:0x01fd, B:61:0x014b, B:82:0x00de, B:83:0x024f, B:85:0x0259, B:87:0x025f, B:89:0x0292, B:93:0x02ad, B:95:0x02b3, B:97:0x02c1), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse zzc(String str, Map map) {
        int i7;
        zzbbp zzbbpVar;
        C0254t c0254t;
        InputStream inputStream;
        final boolean z4;
        InputStream inputStream2;
        final boolean z7;
        final boolean z8;
        String str2;
        try {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            String zzc = zzbxo.zzc(str, this.zzc.getContext(), this.zzE, hashMap);
            if (!zzc.equals(str)) {
                return zzX(zzc, map);
            }
            Parcelable.Creator<zzbai> creator = zzbai.CREATOR;
            zzbai zza = zzbai.zza(Uri.parse(str));
            if (zza != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zzf = zzftw.zzb(zzfss.zzc('-')).zzf(parse.getQueryParameter("range"));
                    if (zzf.size() == 2) {
                        int parseInt = Integer.parseInt((String) zzf.get(0));
                        int parseInt2 = Integer.parseInt((String) zzf.get(1)) + 1;
                        if (parseInt > 0) {
                            zza.zzh = parseInt;
                        }
                        i7 = parseInt2 - parseInt;
                        zzbbpVar = zzbby.zzev;
                        c0254t = C0254t.f2723d;
                        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                            zzbaf zzb2 = o.f1952C.f1963i.zzb(zza);
                            if (zzb2 == null || !zzb2.zze()) {
                                inputStream = null;
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzb2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzb2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzb2.zzf()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzb2.zza()));
                                InputStream zzc2 = zzb2.zzc();
                                inputStream = i7 != -1 ? zzfyx.zza(zzc2, i7) : zzc2;
                            }
                        } else {
                            zza.zzi = zzfty.zzc(this.zzc.zzr());
                            zza.zzj = this.zzc.zzf();
                            boolean z9 = zza.zzg;
                            zzbbw zzbbwVar = c0254t.f2726c;
                            try {
                                long longValue = (z9 ? (Long) zzbbwVar.zzb(zzbby.zzex) : (Long) zzbbwVar.zzb(zzbby.zzew)).longValue();
                                o oVar = o.f1952C;
                                oVar.j.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                Future zza2 = zzbat.zza(this.zzc.getContext(), zza);
                                try {
                                    zzbau zzbauVar = (zzbau) zza2.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbauVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbauVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbauVar.zze()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbauVar.zza()));
                                            inputStream2 = zzbauVar.zzc();
                                            if (i7 != -1) {
                                                try {
                                                    inputStream2 = zzfyx.zza(inputStream2, i7);
                                                } catch (InterruptedException e7) {
                                                    e = e7;
                                                    z8 = true;
                                                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                                        o.f1952C.f1961g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza2.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    o.f1952C.j.getClass();
                                                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            zzcej.this.zzc.zzv(z8, elapsedRealtime2);
                                                        }
                                                    });
                                                    str2 = "Cache connection took " + elapsedRealtime2 + "ms";
                                                    J.k(str2);
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                    }
                                                    return !g.c() ? null : null;
                                                } catch (ExecutionException e8) {
                                                    e = e8;
                                                    z7 = true;
                                                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                                        o.f1952C.f1961g.zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza2.cancel(true);
                                                    o.f1952C.j.getClass();
                                                    final long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            zzcej.this.zzc.zzv(z7, elapsedRealtime3);
                                                        }
                                                    });
                                                    str2 = "Cache connection took " + elapsedRealtime3 + "ms";
                                                    J.k(str2);
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!g.c()) {
                                                    }
                                                } catch (TimeoutException e9) {
                                                    e = e9;
                                                    z7 = true;
                                                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                                    }
                                                    zza2.cancel(true);
                                                    o.f1952C.j.getClass();
                                                    final long elapsedRealtime32 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                                    P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            zzcej.this.zzc.zzv(z7, elapsedRealtime32);
                                                        }
                                                    });
                                                    str2 = "Cache connection took " + elapsedRealtime32 + "ms";
                                                    J.k(str2);
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!g.c()) {
                                                    }
                                                }
                                            }
                                            oVar.j.getClass();
                                            final long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            final boolean z10 = true;
                                            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcej.this.zzc.zzv(z10, elapsedRealtime4);
                                                }
                                            });
                                            str2 = "Cache connection took " + elapsedRealtime4 + "ms";
                                        } catch (Throwable th) {
                                            th = th;
                                            z4 = 1;
                                            o.f1952C.j.getClass();
                                            final long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                            P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcej.this.zzc.zzv(z4, elapsedRealtime5);
                                                }
                                            });
                                            J.k("Cache connection took " + elapsedRealtime5 + "ms");
                                            throw th;
                                        }
                                    } catch (InterruptedException e10) {
                                        e = e10;
                                        inputStream2 = null;
                                    } catch (ExecutionException e11) {
                                        e = e11;
                                        inputStream2 = null;
                                        z7 = true;
                                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                        }
                                        zza2.cancel(true);
                                        o.f1952C.j.getClass();
                                        final long elapsedRealtime322 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzcej.this.zzc.zzv(z7, elapsedRealtime322);
                                            }
                                        });
                                        str2 = "Cache connection took " + elapsedRealtime322 + "ms";
                                        J.k(str2);
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                        }
                                        if (!g.c()) {
                                        }
                                    } catch (TimeoutException e12) {
                                        e = e12;
                                        inputStream2 = null;
                                        z7 = true;
                                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                        }
                                        zza2.cancel(true);
                                        o.f1952C.j.getClass();
                                        final long elapsedRealtime3222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzcej.this.zzc.zzv(z7, elapsedRealtime3222);
                                            }
                                        });
                                        str2 = "Cache connection took " + elapsedRealtime3222 + "ms";
                                        J.k(str2);
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                        }
                                        if (!g.c()) {
                                        }
                                    }
                                } catch (InterruptedException e13) {
                                    e = e13;
                                    inputStream2 = null;
                                    z8 = false;
                                } catch (ExecutionException e14) {
                                    e = e14;
                                    inputStream2 = null;
                                    z7 = false;
                                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                    }
                                    zza2.cancel(true);
                                    o.f1952C.j.getClass();
                                    final long elapsedRealtime32222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcej.this.zzc.zzv(z7, elapsedRealtime32222);
                                        }
                                    });
                                    str2 = "Cache connection took " + elapsedRealtime32222 + "ms";
                                    J.k(str2);
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                    }
                                    if (!g.c()) {
                                    }
                                } catch (TimeoutException e15) {
                                    e = e15;
                                    inputStream2 = null;
                                    z7 = false;
                                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzeA)).booleanValue()) {
                                    }
                                    zza2.cancel(true);
                                    o.f1952C.j.getClass();
                                    final long elapsedRealtime322222 = SystemClock.elapsedRealtime() - elapsedRealtime;
                                    P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcej.this.zzc.zzv(z7, elapsedRealtime322222);
                                        }
                                    });
                                    str2 = "Cache connection took " + elapsedRealtime322222 + "ms";
                                    J.k(str2);
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                    }
                                    if (!g.c()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z4 = 0;
                                }
                                J.k(str2);
                                inputStream = inputStream2;
                            } catch (Throwable th3) {
                                th = th3;
                                z4 = zzbbwVar;
                            }
                        }
                        if (inputStream != null) {
                            return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                        }
                    }
                }
                i7 = -1;
                zzbbpVar = zzbby.zzev;
                c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                }
                if (inputStream != null) {
                }
            }
            if (!g.c() && ((Boolean) zzbdu.zzb.zze()).booleanValue()) {
                return zzX(str, map);
            }
        } catch (Exception e16) {
            e = e16;
            o.f1952C.f1961g.zzw(e, "AdWebViewClient.interceptRequest");
            return zzW();
        } catch (NoClassDefFoundError e17) {
            e = e17;
            o.f1952C.f1961g.zzw(e, "AdWebViewClient.interceptRequest");
            return zzW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final E2.b zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzdd() {
        zzdcp zzdcpVar = this.zzm;
        if (zzdcpVar != null) {
            zzdcpVar.zzdd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final zzdqq zze() {
        return this.zzA;
    }

    public final void zzk() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue() && this.zzc.zzl() != null) {
                zzbcf.zza(this.zzc.zzl().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcfr zzcfrVar = this.zzi;
            boolean z4 = false;
            if (!this.zzC && !this.zzo) {
                z4 = true;
            }
            zzcfrVar.zza(z4, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzl() {
        zzbwy zzbwyVar = this.zza;
        if (zzbwyVar != null) {
            zzbwyVar.zzf();
            this.zza = null;
        }
        zzZ();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbrm zzbrmVar = this.zzz;
                if (zzbrmVar != null) {
                    zzbrmVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzm(boolean z4) {
        this.zzE = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzn(Uri uri) {
        J.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            J.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgG)).booleanValue() || o.f1952C.f1961g.zzg() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcee
                @Override // java.lang.Runnable
                public final void run() {
                    int i7 = zzcej.zzb;
                    o.f1952C.f1961g.zzg().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        zzbbp zzbbpVar = zzbby.zzfG;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) c0254t.f2726c.zzb(zzbby.zzfI)).intValue()) {
                J.k("Parsing gmsg query params on BG thread: ".concat(path));
                P p5 = o.f1952C.f1957c;
                p5.getClass();
                zzgbc.zzr(zzgbc.zzj(new l(uri, 1), p5.f3589k), new zzceh(this, list, path, uri), zzbza.zzf);
                return;
            }
        }
        P p7 = o.f1952C.f1957c;
        zzY(P.l(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzo() {
        zzbaw zzbawVar = this.zzd;
        if (zzbawVar != null) {
            zzbawVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzk();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzp() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzq() {
        this.zzD--;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzr(int i7, int i8, boolean z4) {
        zzbrr zzbrrVar = this.zzx;
        if (zzbrrVar != null) {
            zzbrrVar.zzb(i7, i8);
        }
        zzbrm zzbrmVar = this.zzz;
        if (zzbrmVar != null) {
            zzbrmVar.zzd(i7, i8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcft
    public final void zzs() {
        zzbwy zzbwyVar = this.zza;
        if (zzbwyVar != null) {
            WebView zzG = this.zzc.zzG();
            WeakHashMap weakHashMap = U.f5037a;
            if (zzG.isAttachedToWindow()) {
                zzaa(zzG, zzbwyVar, 10);
                return;
            }
            zzZ();
            zzceg zzcegVar = new zzceg(this, zzbwyVar);
            this.zzH = zzcegVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcegVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzu() {
        zzdcp zzdcpVar = this.zzm;
        if (zzdcpVar != null) {
            zzdcpVar.zzu();
        }
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z4, boolean z7, String str) {
        zzceb zzcebVar = this.zzc;
        boolean zzaF = zzcebVar.zzaF();
        boolean z8 = zzac(zzaF, zzcebVar) || z7;
        boolean z9 = z8 || !z4;
        InterfaceC0217a interfaceC0217a = z8 ? null : this.zzg;
        m mVar = zzaF ? null : this.zzh;
        c cVar = this.zzw;
        zzceb zzcebVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcVar, interfaceC0217a, mVar, cVar, zzcebVar2.zzm(), zzcebVar2, z9 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i7) {
        zzeaq zzeaqVar = this.zzG;
        zzceb zzcebVar = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcebVar, zzcebVar.zzm(), str, str2, zzeaqVar));
    }

    public final void zzx(boolean z4, int i7, boolean z7) {
        zzceb zzcebVar = this.zzc;
        boolean zzac = zzac(zzcebVar.zzaF(), zzcebVar);
        boolean z8 = true;
        if (!zzac && z7) {
            z8 = false;
        }
        InterfaceC0217a interfaceC0217a = zzac ? null : this.zzg;
        m mVar = this.zzh;
        c cVar = this.zzw;
        zzceb zzcebVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(interfaceC0217a, mVar, cVar, zzcebVar2, z4, i7, zzcebVar2.zzm(), z8 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrm zzbrmVar = this.zzz;
        boolean zzf = zzbrmVar != null ? zzbrmVar.zzf() : false;
        C1718l0 c1718l0 = o.f1952C.f1956b;
        C1718l0.o(this.zzc.getContext(), adOverlayInfoParcel, !zzf, this.zzA);
        zzbwy zzbwyVar = this.zza;
        if (zzbwyVar != null) {
            String str = adOverlayInfoParcel.f10802C;
            if (str == null && (zzcVar = adOverlayInfoParcel.f10815a) != null) {
                str = zzcVar.f10826b;
            }
            zzbwyVar.zzh(str);
        }
    }

    public final void zzz(boolean z4, int i7, String str, String str2, boolean z7) {
        zzceb zzcebVar = this.zzc;
        boolean zzaF = zzcebVar.zzaF();
        boolean zzac = zzac(zzaF, zzcebVar);
        boolean z8 = true;
        if (!zzac && z7) {
            z8 = false;
        }
        InterfaceC0217a interfaceC0217a = zzac ? null : this.zzg;
        zzcei zzceiVar = zzaF ? null : new zzcei(this.zzc, this.zzh);
        zzbhp zzbhpVar = this.zzk;
        zzbhr zzbhrVar = this.zzl;
        c cVar = this.zzw;
        zzceb zzcebVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(interfaceC0217a, zzceiVar, zzbhpVar, zzbhrVar, cVar, zzcebVar2, z4, i7, str, str2, zzcebVar2.zzm(), z8 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }
}
