package P2;

import D6.y0;
import F2.C0254t;
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
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.C1050x1;
import p155w1.C1052y0;

/* JADX INFO: renamed from: P2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0386l extends zzbxx {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final ArrayList f5488X = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ArrayList f5489Y = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final ArrayList f5490Z = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final ArrayList f5491a0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final zzdqv f5493B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final zzfia f5494C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f5495D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f5496E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f5497F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f5498G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f5499H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f5500I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final VersionInfoParcel f5502K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f5503L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f5504M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ArrayList f5505N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList f5506O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final ArrayList f5507P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f5508Q;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final zzbdd f5512U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final G f5513V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final B f5514W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcgb f5515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f5516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzauo f5517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzfbe f5518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzfbz f5519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzgbn f5520f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ScheduledExecutorService f5521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public zzbtg f5522y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Point f5523z = new Point();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Point f5492A = new Point();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final AtomicInteger f5501J = new AtomicInteger(0);

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final AtomicBoolean f5509R = new AtomicBoolean(false);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final AtomicBoolean f5510S = new AtomicBoolean(false);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final AtomicInteger f5511T = new AtomicInteger(0);

    public BinderC0386l(zzcgb zzcgbVar, Context context, zzauo zzauoVar, zzfbz zzfbzVar, zzgbn zzgbnVar, ScheduledExecutorService scheduledExecutorService, zzdqv zzdqvVar, zzfia zzfiaVar, VersionInfoParcel versionInfoParcel, zzbdd zzbddVar, zzfbe zzfbeVar, G g3, B b7) {
        ArrayList arrayListZ0;
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
            arrayListZ0 = z0((String) zzbbwVar.zzb(zzbby.zzhs));
        } else {
            this.f5505N = f5488X;
            this.f5506O = f5489Y;
            this.f5507P = f5490Z;
            arrayListZ0 = f5491a0;
        }
        this.f5508Q = arrayListZ0;
    }

    public static final Uri A0(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i7 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i7) + str + "=" + str2 + "&" + string.substring(i7));
    }

    public static zzffy B0(I3.b bVar, zzbyc zzbycVar) {
        if (!zzfgb.zza() || !((Boolean) zzbdr.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzffy zzffyVarZza = ((AbstractC0377c) zzgbc.zzp(bVar)).zza();
            zzffyVarZza.zzd(new ArrayList(Collections.singletonList(zzbycVar.zzb)));
            zzm zzmVar = zzbycVar.zzd;
            zzffyVarZza.zzb(zzmVar == null ? "" : zzmVar.f10745G);
            zzffyVarZza.zzf(zzbycVar.zzd.f10742D);
            return zzffyVarZza;
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
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfty.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    public final AbstractC0377c Z(Context context, String str, String str2, zzr zzrVar, zzm zzmVar, int i7, String str3, Bundle bundle, zzbyc zzbycVar) {
        zzr zzrVar2;
        byte b7;
        zzfay zzfayVar = new zzfay();
        if ("REWARDED".equals(str2)) {
            zzfayVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfayVar.zzp().zza(3);
        }
        InterfaceC0376b interfaceC0376bZzo = this.f5515a.zzo();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(context);
        zzfayVar.zzt(str == null ? "adUnitId" : str);
        zzfayVar.zzH(zzmVar == null ? new zzm(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L) : zzmVar);
        if (zzrVar == null) {
            switch (str2) {
                case "NATIVE":
                    b7 = 3;
                    break;
                case "APP_OPEN_AD":
                    b7 = 4;
                    break;
                case "REWARDED":
                    b7 = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b7 = 2;
                    break;
                case "BANNER":
                    b7 = 0;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 == 0) {
                zzrVar2 = new zzr(context, p167y2.j.f18161i);
            } else if (b7 == 1 || b7 == 2) {
                zzrVar2 = new zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
            } else if (b7 != 3) {
                zzrVar2 = b7 != 4 ? new zzr() : zzr.j();
            } else {
                zzrVar2 = zzr.k();
            }
        } else {
            zzrVar2 = zzrVar;
        }
        zzfayVar.zzs(zzrVar2);
        zzfayVar.zzz(true);
        zzfayVar.zzA(bundle);
        zzctxVar.zzk(zzfayVar.zzJ());
        zzctxVar.zzi(i7);
        interfaceC0376bZzo.zza(zzctxVar.zzl());
        C1050x1 c1050x1 = new C1050x1(9, false);
        c1050x1.f17931b = str2;
        c1050x1.f17932c = str3;
        c1050x1.f17933d = zzbycVar;
        interfaceC0376bZzo.zzb(new C0388n(c1050x1));
        new zzdah();
        return interfaceC0376bZzo.zzc();
    }

    public final zzgat t0(final String str) {
        final zzdmf[] zzdmfVarArr = new zzdmf[1];
        I3.b bVarZza = this.f5519e.zza();
        zzgaj zzgajVar = new zzgaj() { // from class: P2.e
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) throws JSONException {
                zzdmf zzdmfVar = (zzdmf) obj;
                zzdmfVarArr[0] = zzdmfVar;
                BinderC0386l binderC0386l = this.f5473a;
                Context context = binderC0386l.f5516b;
                zzbtg zzbtgVar = binderC0386l.f5522y;
                Map map = zzbtgVar.zzb;
                JSONObject jSONObjectC0 = p003a.a.C0(context, map, map, zzbtgVar.zza, null);
                JSONObject jSONObjectF0 = p003a.a.F0(binderC0386l.f5516b, binderC0386l.f5522y.zza);
                JSONObject jSONObjectE0 = p003a.a.E0(binderC0386l.f5522y.zza);
                JSONObject jSONObjectD0 = p003a.a.D0(binderC0386l.f5516b, binderC0386l.f5522y.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectC0);
                jSONObject.put("ad_view_signal", jSONObjectF0);
                jSONObject.put("scroll_view_signal", jSONObjectE0);
                jSONObject.put("lock_screen_signal", jSONObjectD0);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", p003a.a.B0(null, binderC0386l.f5516b, binderC0386l.f5492A, binderC0386l.f5523z));
                }
                return zzdmfVar.zzg(str2, jSONObject);
            }
        };
        zzgbn zzgbnVar = this.f5520f;
        I3.b bVarZzn = zzgbc.zzn(bVarZza, zzgajVar, zzgbnVar);
        bVarZzn.addListener(new y0(14, this, zzdmfVarArr), zzgbnVar);
        final int i7 = 0;
        zzgat zzgatVar = (zzgat) zzgbc.zzm((zzgat) zzgbc.zzo(zzgat.zzu(bVarZzn), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzhF)).intValue(), TimeUnit.MILLISECONDS, this.f5521x), new zzfsw() { // from class: P2.j
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
                        int i9 = I2.J.f3546b;
                        J2.j.e("", (Exception) obj);
                        return null;
                }
            }
        }, zzgbnVar);
    }

    public final void u0() {
        if (!((Boolean) zzbed.zzd.zze()).booleanValue()) {
            zzgbc.zzr(((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlc)).booleanValue() ? zzgbc.zzk(new p145u1.c(this, 9), zzbza.zza) : Z(this.f5516b, null, "BANNER", null, null, 0, null, new Bundle(), null).zzb(), new C1052y0(this, 8), this.f5515a.zzA());
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

    public final void w0(List list, p105o3.a aVar, zzbtd zzbtdVar, boolean z4) {
        ArrayList arrayList;
        ArrayList arrayList2;
        I3.b bVarZzn;
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
            boolean zHasNext = it.hasNext();
            arrayList = this.f5506O;
            arrayList2 = this.f5505N;
            if (!zHasNext) {
                break;
            } else if (y0((Uri) it.next(), arrayList2, arrayList)) {
                i10++;
            }
        }
        if (i10 > 1) {
            String strValueOf = String.valueOf(list);
            int i11 = I2.J.f3546b;
            J2.j.g("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (y0(uri, arrayList2, arrayList)) {
                CallableC0380f callableC0380f = new CallableC0380f(this, uri, aVar, i8);
                zzgbn zzgbnVar = this.f5520f;
                I3.b bVarZzb = zzgbnVar.zzb(callableC0380f);
                zzbtg zzbtgVar = this.f5522y;
                if (zzbtgVar == null || (map = zzbtgVar.zzb) == null || map.isEmpty()) {
                    int i12 = I2.J.f3546b;
                    J2.j.f("Asset view map is empty.");
                    bVarZzn = bVarZzb;
                } else {
                    bVarZzn = zzgbc.zzn(bVarZzb, new C0381g(this, 0), zzgbnVar);
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i13 = I2.J.f3546b;
                J2.j.g("Not a Google URL: ".concat(strValueOf2));
                bVarZzn = zzgbc.zzh(uri);
            }
            arrayList3.add(bVarZzn);
        }
        zzgbc.zzr(zzgbc.zzd(arrayList3), new C0385k(this, zzbtdVar, z4, i7), this.f5515a.zzA());
    }

    public final void x0(List list, p105o3.a aVar, zzbtd zzbtdVar, boolean z4) {
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
        CallableC0380f callableC0380f = new CallableC0380f(this, list, aVar, i7);
        zzgbn zzgbnVar = this.f5520f;
        I3.b bVarZzb = zzgbnVar.zzb(callableC0380f);
        zzbtg zzbtgVar = this.f5522y;
        if (zzbtgVar == null || (map = zzbtgVar.zzb) == null || map.isEmpty()) {
            int i9 = I2.J.f3546b;
            J2.j.f("Asset view map is empty.");
        } else {
            bVarZzb = zzgbc.zzn(bVarZzb, new C0381g(this, 1), zzgbnVar);
        }
        zzgbc.zzr(bVarZzb, new C0385k(this, zzbtdVar, z4, 0), this.f5515a.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final p105o3.a zze(p105o3.a aVar, p105o3.a aVar2, String str, p105o3.a aVar3) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjO)).booleanValue()) {
            return new p105o3.b(null);
        }
        Context context = (Context) p105o3.b.t0(aVar);
        p109p.g gVar = (p109p.g) p105o3.b.t0(aVar2);
        p109p.a aVar4 = (p109p.a) p105o3.b.t0(aVar3);
        zzbdd zzbddVar = this.f5512U;
        zzbddVar.zzg(context, gVar, str, aVar4);
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
        return new p105o3.b(zzbddVar.zzb());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:9:0x005f A[PHI: r2
      0x005f: PHI (r2v2 int) = (r2v1 int), (r2v1 int), (r2v1 int), (r2v12 int) binds: [B:6:0x0051, B:8:0x005d, B:11:0x006d, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf(p105o3.a aVar, zzbyc zzbycVar, zzbxv zzbxvVar) {
        int i7;
        I3.b bVarZzh;
        I3.b bVarZzb;
        I3.b bVar;
        I3.b bVarZzg;
        Bundle bundle = new Bundle();
        zzbbp zzbbpVar = zzbby.zzco;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            bundle.putLong(zzdpy.PUBLIC_API_CALL.zza(), zzbycVar.zzd.f10755Q);
            p150v0.a.n(E2.o.f1952C.j, bundle, zzdpy.DYNAMITE_ENTER.zza());
        }
        Context context = (Context) p105o3.b.t0(aVar);
        this.f5516b = context;
        zzffn zzffnVarZza = zzffm.zza(context, 22);
        zzffnVarZza.zzi();
        zzbbp zzbbpVar2 = zzbby.zzhx;
        zzbbw zzbbwVar = c0254t.f2726c;
        int i8 = 0;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && zzbycVar.zzd.f10758c.getBoolean("optimize_for_app_start", false) && Objects.equals(Q0.a.k0(zzbycVar.zzd), "requester_type_8")) {
            i8 = 2;
            if (zzbycVar.zze == 2) {
                i7 = i8;
            } else {
                i7 = 1;
            }
        } else {
            i7 = i8;
        }
        if ("UNKNOWN".equals(zzbycVar.zzb)) {
            List arrayList = new ArrayList();
            zzbbp zzbbpVar3 = zzbby.zzhw;
            if (!((String) zzbbwVar.zzb(zzbbpVar3)).isEmpty()) {
                arrayList = Arrays.asList(((String) zzbbwVar.zzb(zzbbpVar3)).split(","));
            }
            if (arrayList.contains(Q0.a.k0(zzbycVar.zzd))) {
                I3.b bVarZzg2 = zzgbc.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                bVarZzg = zzgbc.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                bVar = bVarZzg2;
            } else {
                if (((Boolean) zzbbwVar.zzb(zzbby.zzlc)).booleanValue()) {
                    zzgbn zzgbnVar = zzbza.zza;
                    bVarZzh = zzgbnVar.zzb(new M.b(this, zzbycVar, i7, bundle));
                    bVarZzb = zzgbc.zzn(bVarZzh, new C0383i(), zzgbnVar);
                } else {
                    AbstractC0377c abstractC0377cZ = Z(this.f5516b, zzbycVar.zza, zzbycVar.zzb, zzbycVar.zzc, zzbycVar.zzd, i7, zzbycVar.zzf, bundle, zzbycVar);
                    bVarZzh = zzgbc.zzh(abstractC0377cZ);
                    bVarZzb = abstractC0377cZ.zzb();
                }
                bVar = bVarZzh;
                bVarZzg = bVarZzb;
            }
        } else {
            if (((Boolean) zzbbwVar.zzb(zzbby.zzlc)).booleanValue()) {
                zzgbn zzgbnVar2 = zzbza.zza;
                bVarZzh = zzgbnVar2.zzb(new M.b(this, zzbycVar, i7, bundle));
                bVarZzb = zzgbc.zzn(bVarZzh, new C0383i(), zzgbnVar2);
            } else {
                AbstractC0377c abstractC0377cZ2 = Z(this.f5516b, zzbycVar.zza, zzbycVar.zzb, zzbycVar.zzc, zzbycVar.zzd, i7, zzbycVar.zzf, bundle, zzbycVar);
                bVarZzh = zzgbc.zzh(abstractC0377cZ2);
                bVarZzb = abstractC0377cZ2.zzb();
            }
            bVar = bVarZzh;
            bVarZzg = bVarZzb;
        }
        zzgbc.zzr(bVarZzg, new I4.j(this, bVar, zzbycVar, zzbxvVar, zzffnVarZza), this.f5515a.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg(zzbtg zzbtgVar) {
        this.f5522y = zzbtgVar;
        this.f5519e.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        w0(list, aVar, zzbtdVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzi(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        x0(list, aVar, zzbtdVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzj(p105o3.a aVar) {
        zzbbp zzbbpVar = zzbby.zzjA;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzbbp zzbbpVar2 = zzbby.zzhv;
            zzbbw zzbbwVar = c0254t.f2726c;
            if (!((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
                v0();
            }
            WebView webView = (WebView) p105o3.b.t0(aVar);
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
    public final void zzk(p105o3.a aVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhE)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) p105o3.b.t0(aVar);
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
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f5523z;
            motionEventObtain.setLocation(point.x, point.y);
            this.f5517c.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzl(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        w0(list, aVar, zzbtdVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzm(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        x0(list, aVar, zzbtdVar, false);
    }
}
