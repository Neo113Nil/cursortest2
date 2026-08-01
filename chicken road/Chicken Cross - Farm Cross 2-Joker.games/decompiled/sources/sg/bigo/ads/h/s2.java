package sg.bigo.ads.h;

import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.i.C5244p;
import sg.bigo.ads.i.C5245q;
import sg.bigo.ads.m.AbstractC5325d;
import sg.bigo.ads.n.AbstractC5391n;

/* loaded from: classes3.dex */
public final class s2 implements sg.bigo.ads.api.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoController f12925a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sg.bigo.ads.C.l c;
    public final /* synthetic */ H2 d;

    public s2(H2 h2, VideoController videoController, boolean z, sg.bigo.ads.C.l lVar) {
        this.d = h2;
        this.f12925a = videoController;
        this.b = z;
        this.c = lVar;
    }

    @Override // sg.bigo.ads.api.c
    public final void a() {
        H2 h2 = this.d;
        if (h2.p0) {
            h2.C.removeCallbacks(h2.q0);
            h2.p0 = false;
        }
    }

    @Override // sg.bigo.ads.api.c
    public final void b() {
        H2 h2 = this.d;
        if (h2.d0() != 0 || h2.p0) {
            return;
        }
        h2.C.postDelayed(h2.q0, 5000L);
        h2.p0 = true;
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onMuteChange(boolean z) {
        Button button = this.d.n;
        if (button != null) {
            button.setBackgroundResource(z ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute);
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoEnd() {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPause() {
        C5244p c5244p;
        Y0 y0 = this.d.J;
        if (y0 != null) {
            y0.c();
        }
        C5245q c5245q = this.d.n0;
        if (c5245q == null || (c5244p = c5245q.g) == null || c5244p.f || c5244p.b()) {
            return;
        }
        c5245q.g.d();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoPlay() {
        Y0 y0 = this.d.J;
        if (y0 != null) {
            y0.d();
        }
        if (this.d.d0() != 10) {
            C5245q c5245q = this.d.n0;
            if (c5245q != null) {
                c5245q.b();
                return;
            }
            return;
        }
        H2 h2 = this.d;
        AdCountDownButton adCountDownButton = h2.g;
        if (adCountDownButton != null) {
            C5213v c5213v = adCountDownButton.b;
            if (c5213v != null) {
                c5213v.a();
            }
            adCountDownButton.c = true;
            adCountDownButton.e = true;
            adCountDownButton.b(true);
        }
        VideoController W = h2.W();
        sg.bigo.ads.K0.E e = h2.R;
        if (e != null) {
            e.d();
        }
        sg.bigo.ads.K0.E e2 = h2.T;
        if (e2 != null) {
            e2.d();
        }
        C5201r c5201r = h2.U;
        if (c5201r != null) {
            c5201r.d();
        }
        C5150c c5150c = h2.S;
        if (c5150c != null) {
            c5150c.d();
        }
        if (W == null || !W.isPlaying()) {
            return;
        }
        W.pause();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public final void onVideoStart() {
        if (this.d.H.compareAndSet(true, false)) {
            AdCountDownButton adCountDownButton = this.d.g;
            if (adCountDownButton != null) {
                adCountDownButton.c();
                this.d.g.setTakeoverTickEvent(true);
                H2 h2 = this.d;
                h2.j0.i = true;
                h2.E0();
            }
            this.f12925a.notifyPlayViewRegister();
            this.d.u0();
            C5201r c5201r = this.d.U;
            if (c5201r != null) {
                c5201r.a();
                this.d.U = null;
            }
            H2 h22 = this.d;
            if (h22.I) {
                sg.bigo.ads.K0.E e = h22.R;
                if (e != null) {
                    e.e();
                }
                C5150c c5150c = this.d.S;
                if (c5150c != null) {
                    c5150c.e();
                }
            }
            Button button = this.d.n;
            if (button != null && !this.b) {
                button.setVisibility(0);
            }
            H2 h23 = this.d;
            if (h23.m != null) {
                F1 X = h23.X();
                H2 h24 = this.d;
                ViewGroup viewGroup = h24.m;
                int V = h24.V();
                sg.bigo.ads.P.b popPage = X.d.getPopPage();
                ImageView imageView = (ImageView) viewGroup.findViewById(R.id.inter_icon);
                if (imageView != null && !X.d.hasIcon()) {
                    String str = popPage == null ? "" : ((sg.bigo.ads.U0.m) popPage).f12576a;
                    if (!sg.bigo.ads.K0.I.a((CharSequence) str) && URLUtil.isNetworkUrl(str)) {
                        sg.bigo.ads.s0.x.a(X.d.k.e, null, str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) X.d.e())).T, new A1(imageView));
                    } else if (V == 2) {
                        imageView.setImageDrawable(AbstractC4944a.c(imageView.getContext(), R.drawable.bigo_ad_icon_default));
                    } else if (V == 1) {
                        X.l = true;
                        X.a(new C5194o1(X, imageView));
                    } else if (V == 3) {
                        imageView.setImageDrawable(AbstractC4944a.c(imageView.getContext(), R.drawable.bigo_ad_icon_novideo_default));
                    }
                }
                this.d.Y();
            }
            H2 h25 = this.d;
            boolean isMuted = this.f12925a.isMuted();
            Button button2 = h25.n;
            if (button2 != null) {
                button2.setBackgroundResource(isMuted ? R.drawable.bigo_ad_ic_media_mute : R.drawable.bigo_ad_ic_media_unmute);
            }
            Button button3 = this.d.n;
            if (button3 != null) {
                button3.setOnClickListener(new p2(this));
            }
        }
        if ((this.c instanceof sg.bigo.ads.C.t) && (this.d.G0() || this.d.s0())) {
            ((sg.bigo.ads.C.t) this.c).o0 = true;
        }
        F1 X2 = this.d.X();
        X2.f();
        if (X2 instanceof AbstractC5391n) {
            ((AbstractC5391n) X2).r();
        }
        H2 h26 = this.d;
        AbstractC5325d abstractC5325d = h26.i0;
        if (abstractC5325d != null && !abstractC5325d.h.isEmpty()) {
            O1.a(h26, new N1(abstractC5325d));
        }
        H2 h27 = this.d;
        sg.bigo.ads.y.i iVar = h27.M;
        if (iVar == null || iVar.h.isEmpty()) {
            return;
        }
        O1.a(h27, new N1(iVar));
    }
}
