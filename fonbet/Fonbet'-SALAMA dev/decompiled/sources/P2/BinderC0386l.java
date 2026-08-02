package P2;

import D6.y0;
import F2.C0254t;
import a.AbstractC0603a;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzbyc;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzctx;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdmf;
import com.google.android.gms.internal.ads.zzdpy;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzfay;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzfbz;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffn;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfgb;
import com.google.android.gms.internal.ads.zzfia;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzgaj;
import com.google.android.gms.internal.ads.zzgat;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import org.json.JSONObject;
import p.AbstractC1514a;
import p.AbstractC1520g;
import v0.AbstractC1663a;
import w1.C1759x1;
import w1.C1761y0;

/* renamed from: P2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0386l extends zzbxx {

    /* renamed from: X, reason: collision with root package name */
    public static final ArrayList f5488X = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: Y, reason: collision with root package name */
    public static final ArrayList f5489Y = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: Z, reason: collision with root package name */
    public static final ArrayList f5490Z = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: a0, reason: collision with root package name */
    public static final ArrayList f5491a0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: B, reason: collision with root package name */
    public final zzdqv f5493B;

    /* renamed from: C, reason: collision with root package name */
    public final zzfia f5494C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f5495D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f5496E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f5497F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f5498G;

    /* renamed from: H, reason: collision with root package name */
    public final String f5499H;

    /* renamed from: I, reason: collision with root package name */
    public final String f5500I;

    /* renamed from: K, reason: collision with root package name */
    public final VersionInfoParcel f5502K;

    /* renamed from: L, reason: collision with root package name */
    public String f5503L;

    /* renamed from: M, reason: collision with root package name */
    public final String f5504M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f5505N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f5506O;

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f5507P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f5508Q;

    /* renamed from: U, reason: collision with root package name */
    public final zzbdd f5512U;

    /* renamed from: V, reason: collision with root package name */
    public final G f5513V;

    /* renamed from: W, reason: collision with root package name */
    public final B f5514W;

    /* renamed from: a, reason: collision with root package name */
    public final zzcgb f5515a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5516b;

    /* renamed from: c, reason: collision with root package name */
    public final zzauo f5517c;

    /* renamed from: d, reason: collision with root package name */
    public final zzfbe f5518d;

    /* renamed from: e, reason: collision with root package name */
    public final zzfbz f5519e;

    /* renamed from: f, reason: collision with root package name */
    public final zzgbn f5520f;

    /* renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f5521x;

    /* renamed from: y, reason: collision with root package name */
    public zzbtg f5522y;

    /* renamed from: z, reason: collision with root package name */
    public Point f5523z = new Point();

    /* renamed from: A, reason: collision with root package name */
    public Point f5492A = new Point();

    /* renamed from: J, reason: collision with root package name */
    public final AtomicInteger f5501J = new AtomicInteger(0);

    /* renamed from: R, reason: collision with root package name */
    public final AtomicBoolean f5509R = new AtomicBoolean(false);

    /* renamed from: S, reason: collision with root package name */
    public final AtomicBoolean f5510S = new AtomicBoolean(false);

    /* renamed from: T, reason: collision with root package name */
    public final AtomicInteger f5511T = new AtomicInteger(0);

    public BinderC0386l(zzcgb zzcgbVar, Context context, zzauo zzauoVar, zzfbz zzfbzVar, zzgbn zzgbnVar, ScheduledExecutorService scheduledExecutorService, zzdqv zzdqvVar, zzfia zzfiaVar, VersionInfoParcel versionInfoParcel, zzbdd zzbddVar, zzfbe zzfbeVar, G g3, B b7) {
        ArrayList arrayList;
        this.f5515a = zzcgbVar;
        this.f5516b = context;
        this.f5517c = zzauoVar;
        this.f5518d = zzfbeVar;
        this.f5519e = zzfbzVar;
        this.f5520f = zzgbnVar;
        this.f5521x = scheduledExecutorService;
        this.f5493B = zzdqvVar;
        this.f5494C = zzfiaVar;
        this.f5502K = versionInfoParcel;
        this.f5512U = zzbddVar;
        zzbbp zzbbpVar = zzbby.zzhh;
        C0254t c0254t = C0254t.f2723d;
        this.f5495D = ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue();
        zzbbp zzbbpVar2 = zzbby.zzhg;
        zzbbw zzbbwVar = c0254t.f2726c;
        this.f5496E = ((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue();
        this.f5497F = ((Boolean) zzbbwVar.zzb(zzbby.zzhj)).booleanValue();
        this.f5498G = ((Boolean) zzbbwVar.zzb(zzbby.zzhl)).booleanValue();
        this.f5499H = (String) zzbbwVar.zzb(zzbby.zzhk);
        this.f5500I = (String) zzbbwVar.zzb(zzbby.zzhm);
        this.f5504M = (String) zzbbwVar.zzb(zzbby.zzhn);
        this.f5513V = g3;
        this.f5514W = b7;
        if (((Boolean) zzbbwVar.zzb(zzbby.zzho)).booleanValue()) {
            this.f5505N = z0((String) zzbbwVar.zzb(zzbby.zzhp));
            this.f5506O = z0((String) zzbbwVar.zzb(zzbby.zzhq));
            this.f5507P = z0((String) zzbbwVar.zzb(zzbby.zzhr));
            arrayList = z0((String) zzbbwVar.zzb(zzbby.zzhs));
        } else {
            this.f5505N = f5488X;
            this.f5506O = f5489Y;
            this.f5507P = f5490Z;
            arrayList = f5491a0;
        }
        this.f5508Q = arrayList;
    }

    public static final Uri A0(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i7 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i7) + str + "=" + str2 + "&" + uri2.substring(i7));
    }

    public static zzffy B0(I3.b bVar, zzbyc zzbycVar) {
        if (!zzfgb.zza() || !((Boolean) zzbdr.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzffy zza = ((AbstractC0377c) zzgbc.zzp(bVar)).zza();
            zza.zzd(new ArrayList(Collections.singletonList(zzbycVar.zzb)));
            zzm zzmVar = zzbycVar.zzd;
            zza.zzb(zzmVar == null ? "" : zzmVar.f10745G);
            zza.zzf(zzbycVar.zzd.f10742D);
            return zza;
        } catch (ExecutionException e7) {
            E2.o.f1952C.f1961g.zzw(e7, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public static boolean y0(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final ArrayList z0(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfty.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final AbstractC0377c Z(Context context, String str, String str2, zzr zzrVar, zzm zzmVar, int i7, String str3, Bundle bundle, zzbyc zzbycVar) {
        zzr zzrVar2;
        char c3;
        zzfay zzfayVar = new zzfay();
        if ("REWARDED".equals(str2)) {
            zzfayVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfayVar.zzp().zza(3);
        }
        InterfaceC0376b zzo = this.f5515a.zzo();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(context);
        zzfayVar.zzt(str == null ? "adUnitId" : str);
        zzfayVar.zzH(zzmVar == null ? new zzm(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L) : zzmVar);
        if (zzrVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            zzrVar2 = c3 != 0 ? (c3 == 1 || c3 == 2) ? new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false) : c3 != 3 ? c3 != 4 ? new zzr() : zzr.j() : zzr.k() : new zzr(context, y2.j.f18155i);
        } else {
            zzrVar2 = zzrVar;
        }
        zzfayVar.zzs(zzrVar2);
        zzfayVar.zzz(true);
        zzfayVar.zzA(bundle);
        zzctxVar.zzk(zzfayVar.zzJ());
        zzctxVar.zzi(i7);
        zzo.zza(zzctxVar.zzl());
        C1759x1 c1759x1 = new C1759x1(9, false);
        c1759x1.f17925b = str2;
        c1759x1.f17926c = str3;
        c1759x1.f17927d = zzbycVar;
        zzo.zzb(new C0388n(c1759x1));
        new zzdah();
        return zzo.zzc();
    }

    public final zzgat t0(final String str) {
        final zzdmf[] zzdmfVarArr = new zzdmf[1];
        I3.b zza = this.f5519e.zza();
        zzgaj zzgajVar = new zzgaj() { // from class: P2.e
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                zzdmf zzdmfVar = (zzdmf) obj;
                zzdmfVarArr[0] = zzdmfVar;
                BinderC0386l binderC0386l = BinderC0386l.this;
                Context context = binderC0386l.f5516b;
                zzbtg zzbtgVar = binderC0386l.f5522y;
                Map map = zzbtgVar.zzb;
                JSONObject C02 = AbstractC0603a.C0(context, map, map, zzbtgVar.zza, null);
                JSONObject F02 = AbstractC0603a.F0(binderC0386l.f5516b, binderC0386l.f5522y.zza);
                JSONObject E02 = AbstractC0603a.E0(binderC0386l.f5522y.zza);
                JSONObject D02 = AbstractC0603a.D0(binderC0386l.f5516b, binderC0386l.f5522y.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", C02);
                jSONObject.put("ad_view_signal", F02);
                jSONObject.put("scroll_view_signal", E02);
                jSONObject.put("lock_screen_signal", D02);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", AbstractC0603a.B0(null, binderC0386l.f5516b, binderC0386l.f5492A, binderC0386l.f5523z));
                }
                return zzdmfVar.zzg(str2, jSONObject);
            }
        };
        zzgbn zzgbnVar = this.f5520f;
        I3.b zzn = zzgbc.zzn(zza, zzgajVar, zzgbnVar);
        zzn.addListener(new y0(14, this, zzdmfVarArr), zzgbnVar);
        final int i7 = 0;
        zzgat zzgatVar = (zzgat) zzgbc.zzm((zzgat) zzgbc.zzo(zzgat.zzu(zzn), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzhF)).intValue(), TimeUnit.MILLISECONDS, this.f5521x), new zzfsw() { // from class: P2.j
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                switch (i7) {
                    case 0:
                        ArrayList arrayList = BinderC0386l.f5488X;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = BinderC0386l.f5488X;
                        int i8 = I2.J.f3546b;
                        J2.j.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgbnVar);
        final int i8 = 1;
        return (zzgat) zzgbc.zze(zzgatVar, Exception.class, new zzfsw() { // from class: P2.j
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                switch (i8) {
                    case 0:
                        ArrayList arrayList = BinderC0386l.f5488X;
                        return ((JSONObject) obj).optString("nas");
                    default:
                        ArrayList arrayList2 = BinderC0386l.f5488X;
                        int i82 = I2.J.f3546b;
                        J2.j.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgbnVar);
    }

    public final void u0() {
        if (!((Boolean) zzbed.zzd.zze()).booleanValue()) {
            zzgbc.zzr(((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlc)).booleanValue() ? zzgbc.zzk(new u1.c(this, 9), zzbza.zza) : Z(this.f5516b, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb(), new C1761y0(this, 8), this.f5515a.zzA());
            return;
        }
        G g3 = this.f5513V;
        synchronized (g3) {
            g3.c(true);
            g3.c(false);
        }
    }

    public final void v0() {
        zzbbp zzbbpVar = zzbby.zzjB;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjE)).booleanValue()) {
                return;
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjI)).booleanValue() && this.f5509R.getAndSet(true)) {
                return;
            }
            u0();
        }
    }

    public final void w0(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar, boolean z4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        I3.b bVar;
        Map map;
        int i7 = 1;
        int i8 = 0;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhE)).booleanValue()) {
            int i9 = I2.J.f3546b;
            J2.j.g("The updating URL feature is not enabled.");
            try {
                zzbtdVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                J2.j.e("", e7);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f5506O;
            arrayList2 = this.f5505N;
            if (!hasNext) {
                break;
            } else if (y0((Uri) it.next(), arrayList2, arrayList)) {
                i10++;
            }
        }
        if (i10 > 1) {
            String valueOf = String.valueOf(list);
            int i11 = I2.J.f3546b;
            J2.j.g("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (y0(uri, arrayList2, arrayList)) {
                CallableC0380f callableC0380f = new CallableC0380f(this, uri, interfaceC1506a, i8);
                zzgbn zzgbnVar = this.f5520f;
                I3.b zzb = zzgbnVar.zzb(callableC0380f);
                zzbtg zzbtgVar = this.f5522y;
                if (zzbtgVar == null || (map = zzbtgVar.zzb) == null || map.isEmpty()) {
                    int i12 = I2.J.f3546b;
                    J2.j.f("Asset view map is empty.");
                    bVar = zzb;
                } else {
                    bVar = zzgbc.zzn(zzb, new C0381g(this, 0), zzgbnVar);
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i13 = I2.J.f3546b;
                J2.j.g("Not a Google URL: ".concat(valueOf2));
                bVar = zzgbc.zzh(uri);
            }
            arrayList3.add(bVar);
        }
        zzgbc.zzr(zzgbc.zzd(arrayList3), new C0385k(this, zzbtdVar, z4, i7), this.f5515a.zzA());
    }

    public final void x0(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar, boolean z4) {
        Map map;
        int i7 = 1;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhE)).booleanValue()) {
            try {
                zzbtdVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e7) {
                int i8 = I2.J.f3546b;
                J2.j.e("", e7);
                return;
            }
        }
        CallableC0380f callableC0380f = new CallableC0380f(this, list, interfaceC1506a, i7);
        zzgbn zzgbnVar = this.f5520f;
        I3.b zzb = zzgbnVar.zzb(callableC0380f);
        zzbtg zzbtgVar = this.f5522y;
        if (zzbtgVar == null || (map = zzbtgVar.zzb) == null || map.isEmpty()) {
            int i9 = I2.J.f3546b;
            J2.j.f("Asset view map is empty.");
        } else {
            zzb = zzgbc.zzn(zzb, new C0381g(this, 1), zzgbnVar);
        }
        zzgbc.zzr(zzb, new C0385k(this, zzbtdVar, z4, 0), this.f5515a.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final InterfaceC1506a zze(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, String str, InterfaceC1506a interfaceC1506a3) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjO)).booleanValue()) {
            return new BinderC1507b(null);
        }
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        AbstractC1520g abstractC1520g = (AbstractC1520g) BinderC1507b.t0(interfaceC1506a2);
        AbstractC1514a abstractC1514a = (AbstractC1514a) BinderC1507b.t0(interfaceC1506a3);
        zzbdd zzbddVar = this.f5512U;
        zzbddVar.zzg(context, abstractC1520g, str, abstractC1514a);
        if (((Boolean) zzbed.zzd.zze()).booleanValue()) {
            G g3 = this.f5513V;
            synchronized (g3) {
                g3.c(true);
                g3.c(false);
            }
        }
        if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
            this.f5514W.b();
        }
        return new BinderC1507b(zzbddVar.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    @Override // com.google.android.gms.internal.ads.zzbxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(InterfaceC1506a interfaceC1506a, zzbyc zzbycVar, zzbxv zzbxvVar) {
        int i7;
        I3.b zzh;
        I3.b zzb;
        I3.b bVar;
        I3.b bVar2;
        Bundle bundle = new Bundle();
        zzbbp zzbbpVar = zzbby.zzco;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            bundle.putLong(zzdpy.PUBLIC_API_CALL.zza(), zzbycVar.zzd.f10755Q);
            AbstractC1663a.n(E2.o.f1952C.j, bundle, zzdpy.DYNAMITE_ENTER.zza());
        }
        Context context = (Context) BinderC1507b.t0(interfaceC1506a);
        this.f5516b = context;
        zzffn zza = zzffm.zza(context, 22);
        zza.zzi();
        zzbbp zzbbpVar2 = zzbby.zzhx;
        zzbbw zzbbwVar = c0254t.f2726c;
        int i8 = 0;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && zzbycVar.zzd.f10758c.getBoolean("optimize_for_app_start", false) && Objects.equals(Q0.a.k0(zzbycVar.zzd), "requester_type_8")) {
            i8 = 2;
            if (zzbycVar.zze != 2) {
                i7 = 1;
                if ("UNKNOWN".equals(zzbycVar.zzb)) {
                    List arrayList = new ArrayList();
                    zzbbp zzbbpVar3 = zzbby.zzhw;
                    if (!((String) zzbbwVar.zzb(zzbbpVar3)).isEmpty()) {
                        arrayList = Arrays.asList(((String) zzbbwVar.zzb(zzbbpVar3)).split(","));
                    }
                    if (arrayList.contains(Q0.a.k0(zzbycVar.zzd))) {
                        I3.b zzg = zzgbc.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                        bVar2 = zzgbc.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                        bVar = zzg;
                        zzgbc.zzr(bVar2, new I4.j(this, bVar, zzbycVar, zzbxvVar, zza), this.f5515a.zzA());
                    }
                }
                if (((Boolean) zzbbwVar.zzb(zzbby.zzlc)).booleanValue()) {
                    AbstractC0377c Z6 = Z(this.f5516b, zzbycVar.zza, zzbycVar.zzb, zzbycVar.zzc, zzbycVar.zzd, i7, zzbycVar.zzf, bundle, zzbycVar);
                    zzh = zzgbc.zzh(Z6);
                    zzb = Z6.zzb();
                } else {
                    zzgbn zzgbnVar = zzbza.zza;
                    zzh = zzgbnVar.zzb(new M.b(this, zzbycVar, i7, bundle));
                    zzb = zzgbc.zzn(zzh, new C0383i(), zzgbnVar);
                }
                bVar = zzh;
                bVar2 = zzb;
                zzgbc.zzr(bVar2, new I4.j(this, bVar, zzbycVar, zzbxvVar, zza), this.f5515a.zzA());
            }
        }
        i7 = i8;
        if ("UNKNOWN".equals(zzbycVar.zzb)) {
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzlc)).booleanValue()) {
        }
        bVar = zzh;
        bVar2 = zzb;
        zzgbc.zzr(bVar2, new I4.j(this, bVar, zzbycVar, zzbxvVar, zza), this.f5515a.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg(zzbtg zzbtgVar) {
        this.f5522y = zzbtgVar;
        this.f5519e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        w0(list, interfaceC1506a, zzbtdVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzi(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        x0(list, interfaceC1506a, zzbtdVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzj(InterfaceC1506a interfaceC1506a) {
        zzbbp zzbbpVar = zzbby.zzjA;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzbbp zzbbpVar2 = zzbby.zzhv;
            zzbbw zzbbwVar = c0254t.f2726c;
            if (!((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
                v0();
            }
            WebView webView = (WebView) BinderC1507b.t0(interfaceC1506a);
            if (webView == null) {
                int i7 = I2.J.f3546b;
                J2.j.d("The webView cannot be null.");
                return;
            }
            zzgbn zzgbnVar = zzbza.zzf;
            B b7 = this.f5514W;
            E e7 = new E(webView, b7, zzgbnVar);
            webView.addJavascriptInterface(new C0375a(webView, this.f5517c, this.f5493B, this.f5494C, this.f5518d, this.f5513V, this.f5514W, e7), "gmaSdk");
            if (((Boolean) zzbbwVar.zzb(zzbby.zzjK)).booleanValue()) {
                E2.o.f1952C.f1961g.zzs();
            }
            if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
                b7.b();
                if (((Boolean) zzbed.zzc.zze()).booleanValue()) {
                    zzbza.zzd.scheduleWithFixedDelay(new D(e7, 1), 0L, ((Integer) zzbbwVar.zzb(zzbby.zzjL)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
                v0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzk(InterfaceC1506a interfaceC1506a) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhE)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) BinderC1507b.t0(interfaceC1506a);
            zzbtg zzbtgVar = this.f5522y;
            View view = zzbtgVar == null ? null : zzbtgVar.zza;
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            this.f5523z = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
            if (motionEvent.getAction() == 0) {
                this.f5492A = this.f5523z;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f5523z;
            obtain.setLocation(point.x, point.y);
            this.f5517c.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzl(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        w0(list, interfaceC1506a, zzbtdVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzm(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        x0(list, interfaceC1506a, zzbtdVar, false);
    }
}
