package E2;

import F2.C;
import F2.C0222c0;
import F2.F0;
import F2.I0;
import F2.InterfaceC0226e0;
import F2.InterfaceC0260w;
import F2.InterfaceC0265y0;
import F2.InterfaceC0266z;
import F2.L;
import F2.P;
import F2.Z;
import W5.AbstractC0486a1;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbza;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class n extends L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VersionInfoParcel f1943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzr f1944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I3.b f1945c = zzbza.zza.zzb(new l(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q3.o f1947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f1948f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC0266z f1949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public zzauo f1950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AsyncTask f1951z;

    public n(Context context, zzr zzrVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f1946d = context;
        this.f1943a = versionInfoParcel;
        this.f1944b = zzrVar;
        this.f1948f = new WebView(context);
        this.f1947e = new Q3.o(context, str);
        Z(0);
        this.f1948f.setVerticalScrollBarEnabled(false);
        this.f1948f.getSettings().setJavaScriptEnabled(true);
        this.f1948f.setWebViewClient(new j(this));
        this.f1948f.setOnTouchListener(new k(this, 0));
    }

    public final void Z(int i7) {
        if (this.f1948f == null) {
            return;
        }
        this.f1948f.setLayoutParams(new ViewGroup.LayoutParams(-1, i7));
    }

    @Override // F2.M
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzB() {
        D.d("resume must be called on the main UI thread.");
    }

    @Override // F2.M
    public final void zzC(InterfaceC0260w interfaceC0260w) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
        this.f1949x = interfaceC0266z;
    }

    @Override // F2.M
    public final void zzE(P p5) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzF(zzr zzrVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // F2.M
    public final void zzG(Z z4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzI(zzx zzxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzK(zzee zzeeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzL(boolean z4) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzM(zzbsx zzbsxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzO(zzbct zzbctVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzQ(zzbta zzbtaVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzS(zzbvg zzbvgVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzU(zzfx zzfxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final boolean zzY() {
        return false;
    }

    @Override // F2.M
    public final boolean zzZ() {
        return false;
    }

    @Override // F2.M
    public final boolean zzaa() {
        return false;
    }

    @Override // F2.M
    public final boolean zzab(zzm zzmVar) {
        TreeMap treeMap;
        D.j(this.f1948f, "This Search Ad has already been torn down");
        Q3.o oVar = this.f1947e;
        oVar.getClass();
        oVar.f5825d = zzmVar.f10739A.f10735a;
        Bundle bundle = zzmVar.f10742D;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzbdk.zzc.zze();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                treeMap = (TreeMap) oVar.f5824c;
                if (!zHasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    oVar.f5826e = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    treeMap.put(next.substring(4), bundle2.getString(next));
                }
            }
            treeMap.put("SDKVersion", this.f1943a.f10834a);
            if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
                Bundle bundleG0 = Q0.a.g0((Context) oVar.f5823b, (String) zzbdk.zzb.zze());
                for (String str2 : bundleG0.keySet()) {
                    treeMap.put(str2, bundleG0.get(str2).toString());
                }
            }
        }
        this.f1951z = new m(this).execute(new Void[0]);
        return true;
    }

    @Override // F2.M
    public final void zzac(C0222c0 c0222c0) {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // F2.M
    public final zzr zzg() {
        return this.f1944b;
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // F2.M
    public final Z zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // F2.M
    public final F0 zzk() {
        return null;
    }

    @Override // F2.M
    public final I0 zzl() {
        return null;
    }

    @Override // F2.M
    public final p105o3.a zzn() {
        D.d("getAdFrame must be called on the main UI thread.");
        return new p105o3.b(this.f1948f);
    }

    public final String zzq() {
        String str = (String) this.f1947e.f5826e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return AbstractC0486a1.h("https://", str, (String) zzbdk.zzd.zze());
    }

    @Override // F2.M
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // F2.M
    public final String zzs() {
        return null;
    }

    @Override // F2.M
    public final String zzt() {
        return null;
    }

    @Override // F2.M
    public final void zzx() {
        D.d("destroy must be called on the main UI thread.");
        this.f1951z.cancel(true);
        this.f1945c.cancel(false);
        this.f1948f.destroy();
        this.f1948f = null;
    }

    @Override // F2.M
    public final void zzz() {
        D.d("pause must be called on the main UI thread.");
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
    }

    @Override // F2.M
    public final void zzN(boolean z4) {
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
    }

    @Override // F2.M
    public final void zzW(p105o3.a aVar) {
    }

    @Override // F2.M
    public final void zzy(zzm zzmVar, C c3) {
    }
}
