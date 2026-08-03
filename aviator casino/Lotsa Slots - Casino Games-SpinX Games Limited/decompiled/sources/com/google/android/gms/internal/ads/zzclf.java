package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public class zzclf extends android.webkit.WebViewClient implements com.google.android.gms.internal.ads.zzcms {
    public static final /* synthetic */ int zzc = 0;
    private com.google.android.gms.internal.ads.zzdzl zzA;
    private com.google.android.gms.internal.ads.zzdbn zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;
    private final com.google.android.gms.internal.ads.zzekr zzH;
    private android.view.View.OnAttachStateChangeListener zzI;
    protected final com.google.android.gms.internal.ads.zzcku zza;
    protected com.google.android.gms.internal.ads.zzcdn zzb;
    private final com.google.android.gms.internal.ads.zzbhp zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private com.google.android.gms.internal.ads.zzcmq zzi;
    private com.google.android.gms.internal.ads.zzcmr zzj;
    private com.google.android.gms.internal.ads.zzbog zzk;
    private com.google.android.gms.internal.ads.zzboi zzl;
    private com.google.android.gms.internal.ads.zzdky zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private com.google.android.gms.internal.ads.zzbyf zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final java.util.HashMap zze = new java.util.HashMap();
    private final java.lang.Object zzf = new java.lang.Object();
    private int zzp = 0;
    private java.lang.String zzq = "";
    private java.lang.String zzr = "";
    private com.google.android.gms.internal.ads.zzbya zzz = null;
    private final java.util.HashSet zzG = new java.util.HashSet(java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgH)).split(",")));

    public zzclf(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, boolean z, com.google.android.gms.internal.ads.zzbyf zzbyfVar, com.google.android.gms.internal.ads.zzbya zzbyaVar, com.google.android.gms.internal.ads.zzekr zzekrVar) {
        this.zzd = zzbhpVar;
        this.zza = zzckuVar;
        this.zzs = z;
        this.zzx = zzbyfVar;
        this.zzH = zzekrVar;
    }

    private final void zzac(final android.view.View view, final com.google.android.gms.internal.ads.zzcdn zzcdnVar, final int i) {
        if (!zzcdnVar.zzc() || i <= 0) {
            return;
        }
        zzcdnVar.zzd(view);
        if (zzcdnVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcld
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzclf.this.zzU(view, zzcdnVar, i);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((android.view.View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static android.webkit.WebResourceResponse zzae() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbv)).booleanValue()) {
            return new android.webkit.WebResourceResponse("", "", new java.io.ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0119, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016a, code lost:
    
        r0 = r7.getHeaderFields();
        r14 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0183, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0185, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018f, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0195, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a1, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a3, code lost:
    
        r14.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b9, code lost:
    
        r10 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r10, r11, r7.getResponseCode(), r7.getResponseMessage(), r14, r7.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0137, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013c, code lost:
    
        if (r0.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013f, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0141, code lost:
    
        if (r1 >= r0.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014f, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0151, code lost:
    
        r2 = r0[r1].trim().split(com.ironsource.X3.j.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015e, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0160, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0167, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011d, code lost:
    
        r10 = r0.split(";")[0].trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.webkit.WebResourceResponse zzaf(java.lang.String str, java.util.Map map) throws java.io.IOException {
        android.webkit.WebResourceResponse webResourceResponse;
        java.net.URL url = new java.net.URL(str);
        try {
            android.net.TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw new java.io.IOException("Too many redirects (20)");
                }
                int i2 = com.google.android.gms.internal.ads.zzfzr.zzb;
                java.net.URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (java.util.Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                if (!(openConnection instanceof java.net.HttpURLConnection)) {
                    throw new java.io.IOException("Invalid protocol.");
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.util.zzs zzc2 = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
                    zzc2.zzb(zzckuVar.getContext(), zzckuVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        break;
                    }
                    java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                    if (headerField == null) {
                        throw new java.io.IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    java.net.URL url2 = new java.net.URL(url, headerField);
                    java.lang.String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponse = zzae();
                        break;
                    }
                    if (!protocol.equals(androidx.webkit.ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        java.lang.String sb2 = sb.toString();
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        webResourceResponse = zzae();
                        break;
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    java.lang.String sb4 = sb3.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(sb4);
                    httpURLConnection.disconnect();
                    url = url2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            android.net.TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(java.util.Map map, java.util.List list, java.lang.String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (java.lang.String str2 : map.keySet()) {
                java.lang.String str3 = (java.lang.String) map.get(str2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 4 + java.lang.String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzbpq) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzai(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        return zzckuVar.zzC() != null && zzckuVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z, com.google.android.gms.internal.ads.zzcku zzckuVar) {
        return (!z || zzckuVar.zzN().zzg() || zzckuVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri parse = android.net.Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        synchronized (this.zzf) {
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
            if (zzckuVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzckuVar.zzY();
                return;
            }
            this.zzC = true;
            com.google.android.gms.internal.ads.zzcmr zzcmrVar = this.zzj;
            if (zzcmrVar != null) {
                zzcmrVar.zza();
                this.zzj = null;
            }
            zzu();
            com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zza;
            if (zzckuVar2.zzL() != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzns)).booleanValue()) {
                    zzckuVar2.zzL().zzz(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
        return zzL(str, java.util.Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
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
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(java.lang.String.valueOf(str)));
        android.net.Uri parse = android.net.Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                java.lang.String scheme = parse.getScheme();
                if (androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzb;
                        if (zzcdnVar != null) {
                            zzcdnVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    com.google.android.gms.internal.ads.zzdky zzdkyVar = this.zzm;
                    if (zzdkyVar != null) {
                        zzdkyVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
            if (zzckuVar.zzD().willNotDraw()) {
                java.lang.String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(java.lang.String.valueOf(str)));
            } else {
                try {
                    com.google.android.gms.internal.ads.zzbap zzS = zzckuVar.zzS();
                    com.google.android.gms.internal.ads.zzflc zzT = zzckuVar.zzT();
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznw)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, zzckuVar.getContext(), (android.view.View) zzckuVar, zzckuVar.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, zzckuVar.getContext(), (android.view.View) zzckuVar, zzckuVar.zzj());
                    }
                } catch (com.google.android.gms.internal.ads.zzbaq unused) {
                    java.lang.String.valueOf(str);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(java.lang.String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    com.google.android.gms.internal.ads.zzcku zzckuVar2 = this.zza;
                    zzv(zzcVar, true, false, zzckuVar2 != null ? zzckuVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        com.google.android.gms.internal.ads.zzbya zzbyaVar = this.zzz;
        boolean zzd = zzbyaVar != null ? zzbyaVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzb;
        if (zzcdnVar != null) {
            java.lang.String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcdnVar.zzb(str);
        }
    }

    public final void zzB(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        synchronized (this.zzf) {
            java.util.HashMap hashMap = this.zze;
            java.util.List list = (java.util.List) hashMap.get(str);
            if (list == null) {
                list = new java.util.concurrent.CopyOnWriteArrayList();
                hashMap.put(str, list);
            }
            list.add(zzbpqVar);
        }
    }

    public final void zzC(java.lang.String str, com.google.android.gms.internal.ads.zzbpq zzbpqVar) {
        synchronized (this.zzf) {
            java.util.List list = (java.util.List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbpqVar);
        }
    }

    public final void zzD(java.lang.String str) {
        synchronized (this.zzf) {
            java.util.List list = (java.util.List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(java.lang.String str, com.google.android.gms.common.util.Predicate predicate) {
        synchronized (this.zzf) {
            java.util.List<com.google.android.gms.internal.ads.zzbpq> list = (java.util.List) this.zze.get(str);
            if (list == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.ads.zzbpq zzbpqVar : list) {
                if (predicate.apply(zzbpqVar)) {
                    arrayList.add(zzbpqVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzb;
        if (zzcdnVar != null) {
            zzcdnVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
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
            com.google.android.gms.internal.ads.zzbya zzbyaVar = this.zzz;
            if (zzbyaVar != null) {
                zzbyaVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzG(com.google.android.gms.internal.ads.zzcmq zzcmqVar) {
        this.zzi = zzcmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzH(com.google.android.gms.internal.ads.zzcmr zzcmrVar) {
        this.zzj = zzcmrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final com.google.android.gms.internal.ads.zzdzl zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzJ(com.google.android.gms.internal.ads.zzdbn zzdbnVar) {
        this.zzB = zzdbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final com.google.android.gms.internal.ads.zzdbn zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TRY_ENTER, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:45:0x01ae, B:46:0x016e, B:49:0x02bc, B:64:0x0236, B:65:0x0269, B:58:0x0204, B:60:0x013d, B:80:0x00d1, B:81:0x026a, B:83:0x0274, B:85:0x027a, B:87:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bc A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:45:0x01ae, B:46:0x016e, B:49:0x02bc, B:64:0x0236, B:65:0x0269, B:58:0x0204, B:60:0x013d, B:80:0x00d1, B:81:0x026a, B:83:0x0274, B:85:0x027a, B:87:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9 A[Catch: all -> 0x01df, TryCatch #11 {all -> 0x01df, blocks: (B:41:0x0189, B:43:0x019b, B:44:0x01a3, B:54:0x01e7, B:56:0x01f9, B:57:0x0200), top: B:27:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026a A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:45:0x01ae, B:46:0x016e, B:49:0x02bc, B:64:0x0236, B:65:0x0269, B:58:0x0204, B:60:0x013d, B:80:0x00d1, B:81:0x026a, B:83:0x0274, B:85:0x027a, B:87:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d1 A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:45:0x01ae, B:46:0x016e, B:49:0x02bc, B:64:0x0236, B:65:0x0269, B:58:0x0204, B:60:0x013d, B:80:0x00d1, B:81:0x026a, B:83:0x0274, B:85:0x027a, B:87:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e4 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final android.webkit.WebResourceResponse zzL(java.lang.String str, java.util.Map map) {
        int i;
        java.io.InputStream inputStream;
        java.io.InputStream zzb;
        java.lang.String str2;
        final boolean z;
        final boolean z2;
        java.lang.String sb;
        try {
            java.util.Map hashMap = new java.util.HashMap();
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
            if (zzckuVar.zzC() != null) {
                hashMap = zzckuVar.zzC().zzaw;
            }
            java.lang.String zza = com.google.android.gms.internal.ads.zzceb.zza(str, zzckuVar.getContext(), this.zzF, hashMap);
            if (!zza.equals(str)) {
                return zzaf(zza, map);
            }
            android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbhb> creator = com.google.android.gms.internal.ads.zzbhb.CREATOR;
            com.google.android.gms.internal.ads.zzbhb zza2 = com.google.android.gms.internal.ads.zzbhb.zza(android.net.Uri.parse(str));
            if (zza2 != null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                android.net.Uri parse = android.net.Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    java.util.List zze = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc('-')).zze(parse.getQueryParameter("range"));
                    if (zze.size() == 2) {
                        int parseInt = java.lang.Integer.parseInt((java.lang.String) zze.get(0));
                        int parseInt2 = java.lang.Integer.parseInt((java.lang.String) zze.get(1)) + 1;
                        if (parseInt > 0) {
                            zza2.zzh = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        final boolean z3 = "X-Afma-Gcache-CachedBytes";
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfk)).booleanValue()) {
                            com.google.android.gms.internal.ads.zzbgy zzc2 = com.google.android.gms.ads.internal.zzt.zzj().zzc(zza2);
                            if (zzc2 == null || !zzc2.zza()) {
                                inputStream = null;
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", java.lang.Boolean.toString(zzc2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", java.lang.Boolean.toString(zzc2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", java.lang.Boolean.toString(zzc2.zze()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", java.lang.Long.toString(zzc2.zzf()));
                                zzb = zzc2.zzb();
                                if (i != -1) {
                                    inputStream = com.google.android.gms.internal.ads.zzgzm.zzb(zzb, i);
                                }
                            }
                            if (inputStream != null) {
                                return new android.webkit.WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                            }
                        } else {
                            zza2.zzi = com.google.android.gms.internal.ads.zzgua.zza(zzckuVar.zzn());
                            zza2.zzj = zzckuVar.zzp();
                            try {
                                long longValue = (zza2.zzg ? (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfm) : (java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfl)).longValue();
                                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                                com.google.android.gms.ads.internal.zzt.zzz();
                                java.util.concurrent.Future zza3 = com.google.android.gms.internal.ads.zzbhm.zza(zzckuVar.getContext(), zza2);
                                try {
                                    com.google.android.gms.internal.ads.zzbhn zzbhnVar = (com.google.android.gms.internal.ads.zzbhn) zza3.get(longValue, java.util.concurrent.TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", java.lang.Boolean.toString(zzbhnVar.zzc()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", java.lang.Boolean.toString(zzbhnVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", java.lang.Boolean.toString(zzbhnVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", java.lang.Long.toString(zzbhnVar.zze()));
                                            zzb = zzbhnVar.zzb();
                                            if (i != -1) {
                                                try {
                                                    zzb = com.google.android.gms.internal.ads.zzgzm.zzb(zzb, i);
                                                } catch (java.lang.InterruptedException e) {
                                                    e = e;
                                                    z2 = true;
                                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    java.lang.Thread.currentThread().interrupt();
                                                    final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzckz
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            com.google.android.gms.internal.ads.zzclf.this.zzX(z2, elapsedRealtime2);
                                                        }
                                                    });
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    return !com.google.android.gms.ads.internal.util.client.zzl.zzj() ? null : null;
                                                } catch (java.util.concurrent.ExecutionException e2) {
                                                    e = e2;
                                                    str2 = "AdWebViewClient.interceptRequest.gcache";
                                                    z = true;
                                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            com.google.android.gms.internal.ads.zzclf.this.zzW(z, elapsedRealtime3);
                                                        }
                                                    });
                                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    sb = sb3.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (java.util.concurrent.TimeoutException e3) {
                                                    e = e3;
                                                    str2 = "AdWebViewClient.interceptRequest.gcache";
                                                    z = true;
                                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            com.google.android.gms.internal.ads.zzclf.this.zzW(z, elapsedRealtime32);
                                                        }
                                                    });
                                                    java.lang.StringBuilder sb32 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    sb = sb32.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                }
                                            }
                                            final long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final boolean z4 = true;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable(z4, elapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzckx
                                                private final /* synthetic */ long zzb;

                                                {
                                                    this.zzb = elapsedRealtime4;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    com.google.android.gms.internal.ads.zzclf.this.zzV(true, this.zzb);
                                                }
                                            });
                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(elapsedRealtime4);
                                            sb4.append("ms");
                                            sb = sb4.toString();
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            z3 = 1;
                                            final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcla
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    com.google.android.gms.internal.ads.zzclf.this.zzY(z3, elapsedRealtime5);
                                                }
                                            });
                                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime5).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(elapsedRealtime5);
                                            sb5.append("ms");
                                            com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                            throw th;
                                        }
                                    } catch (java.lang.InterruptedException e4) {
                                        e = e4;
                                        zzb = null;
                                    } catch (java.util.concurrent.ExecutionException e5) {
                                        e = e5;
                                        str2 = "AdWebViewClient.interceptRequest.gcache";
                                        zzb = null;
                                        z = true;
                                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                com.google.android.gms.internal.ads.zzclf.this.zzW(z, elapsedRealtime322);
                                            }
                                        });
                                        java.lang.StringBuilder sb322 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        sb = sb322.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (java.util.concurrent.TimeoutException e6) {
                                        e = e6;
                                        str2 = "AdWebViewClient.interceptRequest.gcache";
                                        zzb = null;
                                        z = true;
                                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                com.google.android.gms.internal.ads.zzclf.this.zzW(z, elapsedRealtime3222);
                                            }
                                        });
                                        java.lang.StringBuilder sb3222 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime3222).length() + 24);
                                        sb3222.append("Cache connection took ");
                                        sb3222.append(elapsedRealtime3222);
                                        sb3222.append("ms");
                                        sb = sb3222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    }
                                } catch (java.lang.InterruptedException e7) {
                                    e = e7;
                                    zzb = null;
                                    z2 = false;
                                } catch (java.util.concurrent.ExecutionException e8) {
                                    e = e8;
                                    str2 = "AdWebViewClient.interceptRequest.gcache";
                                    zzb = null;
                                    z = false;
                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            com.google.android.gms.internal.ads.zzclf.this.zzW(z, elapsedRealtime32222);
                                        }
                                    });
                                    java.lang.StringBuilder sb32222 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime32222).length() + 24);
                                    sb32222.append("Cache connection took ");
                                    sb32222.append(elapsedRealtime32222);
                                    sb32222.append("ms");
                                    sb = sb32222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (java.util.concurrent.TimeoutException e9) {
                                    e = e9;
                                    str2 = "AdWebViewClient.interceptRequest.gcache";
                                    zzb = null;
                                    z = false;
                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfp)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            com.google.android.gms.internal.ads.zzclf.this.zzW(z, elapsedRealtime322222);
                                        }
                                    });
                                    java.lang.StringBuilder sb322222 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime322222).length() + 24);
                                    sb322222.append("Cache connection took ");
                                    sb322222.append(elapsedRealtime322222);
                                    sb322222.append("ms");
                                    sb = sb322222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    z3 = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(sb);
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        }
                        inputStream = zzb;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                final boolean z32 = "X-Afma-Gcache-CachedBytes";
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfk)).booleanValue()) {
                }
                inputStream = zzb;
                if (inputStream != null) {
                }
            }
            if (!com.google.android.gms.ads.internal.util.client.zzl.zzj() && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkm.zzb.zze()).booleanValue()) {
                return zzaf(str, map);
            }
        } catch (java.lang.Exception | java.lang.NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzclb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcku zzckuVar = com.google.android.gms.internal.ads.zzclf.this.zza;
                    zzckuVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzL = zzckuVar.zzL();
                    if (zzL != null) {
                        zzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z) {
        this.zzF = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzP(int i, int i2) {
        com.google.android.gms.internal.ads.zzbya zzbyaVar = this.zzz;
        if (zzbyaVar != null) {
            zzbyaVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzQ(android.net.Uri uri) {
        java.lang.String valueOf = java.lang.String.valueOf(uri);
        java.lang.String.valueOf(valueOf);
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(java.lang.String.valueOf(valueOf)));
        java.util.HashMap hashMap = this.zze;
        java.lang.String path = uri.getPath();
        java.util.List list = (java.util.List) hashMap.get(path);
        if (path == null || list == null) {
            java.lang.String valueOf2 = java.lang.String.valueOf(uri);
            java.lang.String.valueOf(valueOf2);
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(java.lang.String.valueOf(valueOf2)));
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhH)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final java.lang.String substring = (path == null || path.length() < 2) ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL : path.substring(1);
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzclc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = com.google.android.gms.internal.ads.zzclf.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(substring);
                }
            });
            return;
        }
        java.lang.String encodedQuery = uri.getEncodedQuery();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgG)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgI)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new com.google.android.gms.internal.ads.zzckw(this, list, path, uri), com.google.android.gms.internal.ads.zzcfr.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzT(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzS(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzT(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    final /* synthetic */ void zzU(android.view.View view, com.google.android.gms.internal.ads.zzcdn zzcdnVar, int i) {
        zzac(view, zzcdnVar, i - 1);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzY(true, j);
    }

    final /* synthetic */ void zzZ(android.view.View view, com.google.android.gms.internal.ads.zzcdn zzcdnVar, int i) {
        zzac(view, zzcdnVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zza(int i, int i2, boolean z) {
        com.google.android.gms.internal.ads.zzbyf zzbyfVar = this.zzx;
        if (zzbyfVar != null) {
            zzbyfVar.zzb(i, i2);
        }
        com.google.android.gms.internal.ads.zzbya zzbyaVar = this.zzz;
        if (zzbyaVar != null) {
            zzbyaVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzab(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.internal.ads.zzbog zzbogVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzboi zzboiVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, com.google.android.gms.internal.ads.zzbpt zzbptVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzbyh zzbyhVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzbql zzbqlVar, com.google.android.gms.internal.ads.zzdky zzdkyVar, com.google.android.gms.internal.ads.zzbqk zzbqkVar, com.google.android.gms.internal.ads.zzbqe zzbqeVar, com.google.android.gms.internal.ads.zzbpr zzbprVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzeao zzeaoVar, com.google.android.gms.internal.ads.zzdbs zzdbsVar, com.google.android.gms.internal.ads.zzdbn zzdbnVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcdnVar, null) : zzbVar;
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        this.zzz = new com.google.android.gms.internal.ads.zzbya(zzckuVar, zzbyhVar);
        this.zzb = zzcdnVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbE)).booleanValue()) {
            zzB("/adMetadata", new com.google.android.gms.internal.ads.zzbof(zzbogVar));
        }
        if (zzboiVar != null) {
            zzB("/appEvent", new com.google.android.gms.internal.ads.zzboh(zzboiVar));
        }
        zzB("/backButton", com.google.android.gms.internal.ads.zzbpp.zzj);
        zzB("/refresh", com.google.android.gms.internal.ads.zzbpp.zzk);
        zzB("/canOpenApp", com.google.android.gms.internal.ads.zzbpp.zzb);
        zzB("/canOpenURLs", com.google.android.gms.internal.ads.zzbpp.zza);
        zzB("/canOpenIntents", com.google.android.gms.internal.ads.zzbpp.zzc);
        zzB("/close", com.google.android.gms.internal.ads.zzbpp.zzd);
        zzB("/customClose", com.google.android.gms.internal.ads.zzbpp.zze);
        zzB("/instrument", com.google.android.gms.internal.ads.zzbpp.zzn);
        zzB("/delayPageLoaded", com.google.android.gms.internal.ads.zzbpp.zzp);
        zzB("/delayPageClosed", com.google.android.gms.internal.ads.zzbpp.zzq);
        zzB("/getLocationInfo", com.google.android.gms.internal.ads.zzbpp.zzr);
        zzB("/log", com.google.android.gms.internal.ads.zzbpp.zzg);
        zzB("/mraid", new com.google.android.gms.internal.ads.zzbpx(zzbVar2, this.zzz, zzbyhVar));
        com.google.android.gms.internal.ads.zzbyf zzbyfVar = this.zzx;
        if (zzbyfVar != null) {
            zzB("/mraidLoaded", zzbyfVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new com.google.android.gms.internal.ads.zzbqd(zzbVar2, this.zzz, zzekgVar, zzdzlVar, zzctjVar, zzdbsVar));
        zzB("/precache", new com.google.android.gms.internal.ads.zzcjb());
        zzB("/touch", com.google.android.gms.internal.ads.zzbpp.zzi);
        zzB("/video", com.google.android.gms.internal.ads.zzbpp.zzl);
        zzB("/videoMeta", com.google.android.gms.internal.ads.zzbpp.zzm);
        if (zzekgVar == null || zzfscVar == null) {
            zzB("/click", com.google.android.gms.internal.ads.zzbpp.zzb(zzdkyVar, zzctjVar));
            zzB("/httpTrack", com.google.android.gms.internal.ads.zzbpp.zzf);
        } else {
            zzB("/click", com.google.android.gms.internal.ads.zzflj.zza(zzekgVar, zzfscVar, zzctjVar, zzdkyVar));
            zzB("/httpTrack", com.google.android.gms.internal.ads.zzflj.zzb(zzekgVar, zzfscVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzckuVar.getContext())) {
            java.util.Map hashMap = new java.util.HashMap();
            if (zzckuVar.zzC() != null) {
                hashMap = zzckuVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new com.google.android.gms.internal.ads.zzbpw(zzckuVar.getContext(), hashMap));
        }
        if (zzbptVar != null) {
            zzB("/setInterstitialProperties", new com.google.android.gms.internal.ads.zzbps(zzbptVar));
        }
        if (zzbqlVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbqlVar);
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkH)).booleanValue() && zzbqkVar != null) {
            zzB("/shareSheet", zzbqkVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziK)).booleanValue() && zzeaoVar != null) {
            zzB("/onDeviceStorageEvent", new com.google.android.gms.internal.ads.zzbpy(zzeaoVar));
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue() && zzbqeVar != null) {
            zzB("/inspectorOutOfContextTest", zzbqeVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkR)).booleanValue() && zzbprVar != null) {
            zzB("/inspectorStorage", zzbprVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmX)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", com.google.android.gms.internal.ads.zzbpp.zzu);
            zzB("/presentPlayStoreOverlay", com.google.android.gms.internal.ads.zzbpp.zzv);
            zzB("/expandPlayStoreOverlay", com.google.android.gms.internal.ads.zzbpp.zzw);
            zzB("/collapsePlayStoreOverlay", com.google.android.gms.internal.ads.zzbpp.zzx);
            zzB("/closePlayStoreOverlay", com.google.android.gms.internal.ads.zzbpp.zzy);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzej)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", com.google.android.gms.internal.ads.zzbpp.zzA);
            zzB("/resetPAID", com.google.android.gms.internal.ads.zzbpp.zzz);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznr)).booleanValue() && zzckuVar.zzC() != null && zzckuVar.zzC().zzar) {
            zzB("/writeToLocalStorage", com.google.android.gms.internal.ads.zzbpp.zzB);
            zzB("/clearLocalStorageKeys", com.google.android.gms.internal.ads.zzbpp.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbogVar;
        this.zzl = zzboiVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdkyVar;
        this.zzA = zzdzlVar;
        this.zzB = zzdbnVar;
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzb(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzckuVar.getContext())) {
            zzD("/logScionEvent");
            new java.util.HashMap();
            zzB("/logScionEvent", new com.google.android.gms.internal.ads.zzbpw(zzckuVar.getContext(), zzfkfVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzc(com.google.android.gms.internal.ads.zzctj zzctjVar) {
        zzD("/click");
        zzB("/click", com.google.android.gms.internal.ads.zzbpp.zzb(this.zzm, zzctjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzd(com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzfsc zzfscVar) {
        zzD("/click");
        if (zzekgVar == null || zzfscVar == null) {
            zzB("/click", com.google.android.gms.internal.ads.zzbpp.zzb(this.zzm, zzctjVar));
        } else {
            zzB("/click", com.google.android.gms.internal.ads.zzflj.zza(zzekgVar, zzfscVar, zzctjVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
        com.google.android.gms.internal.ads.zzdky zzdkyVar = this.zzm;
        if (zzdkyVar != null) {
            zzdkyVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        com.google.android.gms.internal.ads.zzdky zzdkyVar = this.zzm;
        if (zzdkyVar != null) {
            zzdkyVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zze(com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        zzD("/open");
        zzB("/open", new com.google.android.gms.internal.ads.zzbqd(this.zzy, this.zzz, zzekgVar, zzdzlVar, zzctjVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzj(com.google.android.gms.internal.ads.zzcdn zzcdnVar) {
        this.zzb = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final boolean zzk() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final android.view.ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final android.view.ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzq() {
        com.google.android.gms.internal.ads.zzcdn zzcdnVar = this.zzb;
        if (zzcdnVar != null) {
            com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
            android.webkit.WebView zzD = zzckuVar.zzD();
            if (androidx.core.view.ViewCompat.isAttachedToWindow(zzD)) {
                zzac(zzD, zzcdnVar, 10);
                return;
            }
            zzad();
            com.google.android.gms.internal.ads.zzckv zzckvVar = new com.google.android.gms.internal.ads.zzckv(this, zzcdnVar);
            this.zzI = zzckvVar;
            ((android.view.View) zzckuVar).addOnAttachStateChangeListener(zzckvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcms
    public final void zzt() {
        com.google.android.gms.internal.ads.zzbhp zzbhpVar = this.zzd;
        if (zzbhpVar != null) {
            zzbhpVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = com.google.android.gms.games.GamesActivityResultCodes.RESULT_APP_MISCONFIGURED;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue()) {
                com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
                if (zzckuVar.zzq() != null) {
                    com.google.android.gms.internal.ads.zzbix.zza(zzckuVar.zzq().zzc(), zzckuVar.zzi(), "awfllc");
                }
            }
            com.google.android.gms.internal.ads.zzcmq zzcmqVar = this.zzi;
            boolean z = false;
            if (!this.zzD && !this.zzo) {
                z = true;
            }
            zzcmqVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, java.lang.String str) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        boolean zzW = zzckuVar.zzW();
        boolean z3 = zzaj(zzW, zzckuVar) || z2;
        zzA(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzcVar, z3 ? null : this.zzg, zzW ? null : this.zzh, this.zzw, zzckuVar.zzs(), zzckuVar, z3 || !z ? null : this.zzm, str));
    }

    public final void zzw(java.lang.String str, java.lang.String str2, int i) {
        com.google.android.gms.internal.ads.zzekr zzekrVar = this.zzH;
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        zzA(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzckuVar, zzckuVar.zzs(), str, str2, 14, zzekrVar));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        boolean zzaj = zzaj(zzckuVar.zzW(), zzckuVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        zzA(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzaj ? null : this.zzg, this.zzh, this.zzw, zzckuVar, z, i, zzckuVar.zzs(), z3 ? null : this.zzm, zzai(zzckuVar) ? this.zzH : null));
    }

    public final void zzy(boolean z, int i, java.lang.String str, boolean z2, boolean z3) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        boolean zzW = zzckuVar.zzW();
        boolean zzaj = zzaj(zzW, zzckuVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        zzA(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzaj ? null : this.zzg, zzW ? null : new com.google.android.gms.internal.ads.zzcle(zzckuVar, this.zzh), this.zzk, this.zzl, this.zzw, zzckuVar, z, i, str, zzckuVar.zzs(), z4 ? null : this.zzm, zzai(zzckuVar) ? this.zzH : null, z3));
    }

    public final void zzz(boolean z, int i, java.lang.String str, java.lang.String str2, boolean z2) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        boolean zzW = zzckuVar.zzW();
        boolean zzaj = zzaj(zzW, zzckuVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        zzA(new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel(zzaj ? null : this.zzg, zzW ? null : new com.google.android.gms.internal.ads.zzcle(zzckuVar, this.zzh), this.zzk, this.zzl, this.zzw, zzckuVar, z, i, str, str2, zzckuVar.zzs(), z3 ? null : this.zzm, zzai(zzckuVar) ? this.zzH : null));
    }
}
