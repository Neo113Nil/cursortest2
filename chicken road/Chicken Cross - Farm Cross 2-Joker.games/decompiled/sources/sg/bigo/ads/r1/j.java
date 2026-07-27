package sg.bigo.ads.r1;

import android.content.Context;
import java.io.File;
import sg.bigo.ads.P.x;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class j extends q {
    public final sg.bigo.ads.D1.b k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public j(Context context, int i, int i2, sg.bigo.ads.R.b bVar, InterfaceC5087a interfaceC5087a) {
        super(context, bVar, interfaceC5087a);
        String sb;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = false;
        h hVar = new h(this);
        this.p = false;
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
        sg.bigo.ads.z1.p pVar = kVar.D0;
        sg.bigo.ads.B1.a aVar = pVar != null ? pVar.z : null;
        StringBuilder sb2 = new StringBuilder();
        if (kVar.o()) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder append = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
            String str = File.separator;
            sb = sg.bigo.ads.U.p.a(append, str, "video", sb3, str).append("vpaid").toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            StringBuilder append2 = new StringBuilder().append(sg.bigo.ads.U.q.a(context));
            String str2 = File.separator;
            sb = sg.bigo.ads.U.p.a(append2, str2, "video", sb4, str2).append("files").toString();
        }
        String sb5 = sb2.append(sb).append(File.separator).append(kVar.d()).toString();
        sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) interfaceC5087a;
        int i3 = sg.bigo.ads.P.a.a(bVar2.l) ? 3 : 1;
        String trim = aVar != null ? aVar.f12214a.trim() : "";
        int i4 = sg.bigo.ads.P.a.b(bVar2.l) ? 3 : bVar.f12516a;
        if (kVar.Z0 == null) {
            kVar.Z0 = new x(kVar.v0);
        }
        sg.bigo.ads.D1.b bVar3 = new sg.bigo.ads.D1.b(context, this, sb5, i, i2, i3, trim, i4, kVar.Z0);
        this.k = bVar3;
        bVar3.j.setVPAIDEvenListener(hVar);
        bVar3.k = new i(this);
    }

    @Override // sg.bigo.ads.R.a
    public final void a() {
        this.k.a();
        this.o = false;
    }

    @Override // sg.bigo.ads.r1.a
    public final boolean b() {
        return this.n;
    }

    @Override // sg.bigo.ads.r1.a
    public final void c() {
        if (this.i || this.p) {
            if (this.p) {
                a(false);
            }
        } else if (this.l == 1) {
            b(false);
        } else {
            this.k.j.c("window.vpaidwrapper.resumeAd()");
        }
    }

    @Override // sg.bigo.ads.r1.q
    public final boolean d() {
        return this.m;
    }

    @Override // sg.bigo.ads.r1.a
    public final void destroy() {
        a(false);
    }

    public String getAdCompanions() {
        return this.k.j.getAdCompanions();
    }

    @Override // sg.bigo.ads.r1.q
    public int getAdDuration() {
        return this.k.j.getAdDuration();
    }

    public boolean getAdExpanded() {
        return this.k.j.getAdExpanded();
    }

    public int getAdHeight() {
        return this.k.j.getAdHeight();
    }

    public boolean getAdIcons() {
        return this.k.j.getAdIcons();
    }

    public boolean getAdLinear() {
        return this.k.j.getAdLinear();
    }

    @Override // sg.bigo.ads.r1.q
    public int getAdRemainingTime() {
        return this.k.j.getAdRemainingTime();
    }

    public boolean getAdSkippableState() {
        return this.k.j.getAdSkippableState();
    }

    public float getAdVolume() {
        return this.k.j.getAdVolume();
    }

    public int getAdWidth() {
        return this.k.j.getAdWidth();
    }

    @Override // sg.bigo.ads.r1.q
    public int getPlayStatus() {
        return this.l;
    }

    public void setAdVolume(float f) {
        this.k.j.setAdVolume(f);
    }

    @Override // sg.bigo.ads.r1.q
    public void setMute(boolean z) {
        setAdVolume(z ? 0.0f : 1.0f);
    }

    public void setVPAIDClickable(boolean z) {
        this.k.j.setVPAIDClickable(z);
    }

    @Override // sg.bigo.ads.r1.q
    public final void b(boolean z) {
        this.i = false;
        if (!this.m) {
            this.o = z;
            return;
        }
        sg.bigo.ads.D1.k kVar = this.k.j;
        kVar.r.b(3);
        kVar.c("window.vpaidwrapper.startAd()");
        if (!sg.bigo.ads.I0.f.j(getContext())) {
            AbstractC5496a.b("VPAIDPlayView", "screen is off, start ad cancel");
        } else {
            setPlayOrPauseViewHidden(true);
            a(true);
        }
    }
}
