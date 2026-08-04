package L5;

import F2.C0254t;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdw;
import java.util.List;
import p155w1.C1050x1;

/* JADX INFO: renamed from: L5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0336o extends AbstractC0331j implements InterfaceC0333l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0334m f4490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p145u1.c f4491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdManagerAdView f4492g;

    public C0336o(int i7, C1050x1 c1050x1, String str, List list, C0334m c0334m, p145u1.c cVar) {
        super(i7);
        c1050x1.getClass();
        str.getClass();
        list.getClass();
        c0334m.getClass();
        this.f4487b = c1050x1;
        this.f4488c = str;
        this.f4489d = list;
        this.f4490e = c0334m;
        this.f4491f = cVar;
    }

    public void a() {
        AdManagerAdView adManagerAdView = this.f4492g;
        if (adManagerAdView != null) {
            this.f4487b.U(this.f4481a, adManagerAdView.getResponseInfo());
        }
    }

    @Override // L5.AbstractC0331j
    public void b() {
        AdManagerAdView adManagerAdView = this.f4492g;
        if (adManagerAdView != null) {
            adManagerAdView.a();
            this.f4492g = null;
        }
    }

    @Override // L5.AbstractC0331j
    public io.flutter.plugin.platform.f c() {
        AdManagerAdView adManagerAdView = this.f4492g;
        if (adManagerAdView == null) {
            return null;
        }
        return new K(adManagerAdView, 0);
    }

    public final void d() {
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) this.f4491f.f16597b);
        this.f4492g = adManagerAdView;
        if (this instanceof C0325d) {
            adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f4492g.setAdUnitId(this.f4488c);
        this.f4492g.setAppEventListener(new C0335n(this));
        List list = this.f4489d;
        p167y2.j[] jVarArr = new p167y2.j[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            jVarArr[i7] = ((C0343w) list.get(i7)).f4508a;
        }
        this.f4492g.setAdSizes(jVarArr);
        this.f4492g.setAdListener(new C(this.f4481a, this.f4487b, this));
        AdManagerAdView adManagerAdView2 = this.f4492g;
        p172z2.b bVarC = this.f4490e.c();
        adManagerAdView2.getClass();
        com.google.android.gms.common.internal.D.d("#008 Must be called on the main UI thread.");
        zzbby.zza(adManagerAdView2.getContext());
        if (((Boolean) zzbdw.zzf.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                J2.b.f3804b.execute(new p083l4.x(13, adManagerAdView2, bVarC, false));
                return;
            }
        }
        adManagerAdView2.f18180a.b(bVarC.f18160a);
    }
}
