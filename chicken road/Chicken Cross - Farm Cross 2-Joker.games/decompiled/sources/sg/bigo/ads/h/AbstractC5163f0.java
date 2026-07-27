package sg.bigo.ads.h;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.Log;
import java.io.File;
import java.util.WeakHashMap;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.CompanionAdActivity;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.LandscapeCompanionAdActivity;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.h.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5163f0 extends sg.bigo.ads.e.m implements InterstitialAd {
    public AbstractC5151c0 S;
    public boolean T;
    public long U;
    public Rect V;

    public AbstractC5163f0(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.T = false;
    }

    public abstract boolean A();

    public abstract Class B();

    public abstract void a(Activity activity);

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final void a(sg.bigo.ads.Q.c cVar) {
        a((sg.bigo.ads.Z0.g) cVar);
    }

    public abstract void a(sg.bigo.ads.Z0.g gVar);

    public abstract boolean c(int i);

    public void d(int i) {
        AdInteractionListener adInteractionListener = this.j;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.t = true;
        sg.bigo.ads.e.l lVar = this.R;
        AbstractC5446j.a(lVar.k);
        lVar.j = false;
    }

    @Override // sg.bigo.ads.e.h
    public void destroyInMainThread() {
        sg.bigo.ads.e.l lVar = this.R;
        AbstractC5446j.a(lVar.k);
        lVar.j = false;
        this.S = null;
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public final void show() {
        a((Activity) null, true);
    }

    public int z() {
        if (A()) {
            return this.k.b.c;
        }
        return 0;
    }

    public final void a(Activity activity, boolean z) {
        String sb;
        a(activity == null, z);
        if (activity != null) {
            a(activity);
        }
        sg.bigo.ads.s1.b.a(e());
        if (((sg.bigo.ads.U0.b) this.k.f12482a).a()) {
            b(2000, 1, "The ad is expired.");
            return;
        }
        if (this.u) {
            b(2000, 1, "The ad is destroyed.");
            return;
        }
        if (t()) {
            b(2003, 0, "This ad cannot be shown repeatedly");
            return;
        }
        try {
            sg.bigo.ads.P.c e = e();
            if (e instanceof InterfaceC5087a) {
                sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) e);
                if (kVar.p()) {
                    Context context = this.k.e;
                    StringBuilder sb2 = new StringBuilder();
                    if (kVar.o()) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                        String str = File.separator;
                        sb = sb3.append(append.append(str).append("video").toString()).append(str).append("vpaid").toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
                        String str2 = File.separator;
                        sb = sb4.append(append2.append(str2).append("video").toString()).append(str2).append("files").toString();
                    }
                    File file = new File(sb2.append(sb).append(File.separator).append(kVar.d()).toString());
                    if (!file.exists()) {
                        if (!new File(file.getParentFile(), file.getName() + ".tmp").exists()) {
                            sg.bigo.ads.s1.b.a(e, new AdError(2010, "resource clear."), true, true);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (activity != null) {
            b(1);
        }
        Context context2 = activity;
        if (activity == null) {
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            context2 = activity;
            if (gVar != null) {
                context2 = activity;
                if (gVar.B.a(16)) {
                    Activity a2 = sg.bigo.ads.a0.o.a();
                    b(2);
                    context2 = a2;
                }
            }
        }
        if (context2 == null) {
            context2 = this.k.e;
        }
        sg.bigo.ads.D0.a aVar = this.e;
        int b = sg.bigo.ads.a0.o.b();
        if (b == 1) {
            aVar.f12253a = 1;
        } else if (b != 2) {
            aVar.f12253a = 0;
        } else {
            aVar.f12253a = 4;
        }
        int i = aVar.f12253a;
        this.f = i;
        sg.bigo.ads.Q.b bVar = this.g;
        if (bVar != null) {
            bVar.f = i;
        }
        a(context2);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public final void show(Activity activity) {
        a(activity, false);
    }

    public void a(Context context) {
        Intent intent;
        boolean z = e() != null && ((sg.bigo.ads.U0.b) e()).b();
        Class B = B();
        WeakHashMap weakHashMap = sg.bigo.ads.Y0.D.f12627a;
        try {
            if (z) {
                int i = AdActivity.b;
                intent = new Intent(context, (Class<?>) LandscapeCompanionAdActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra("impl_clazz", B.getName());
            } else {
                int i2 = AdActivity.b;
                intent = new Intent(context, (Class<?>) CompanionAdActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra("impl_clazz", B.getName());
            }
            int hashCode = hashCode();
            sg.bigo.ads.Y0.D.a(hashCode, this);
            intent.putExtra("ad_identifier", hashCode);
            context.startActivity(intent);
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3000, 10116, Log.getStackTraceString(e), e());
            b(2004, 0, "This ad cannot be open");
        }
    }
}
