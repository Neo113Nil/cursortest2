package sg.bigo.ads.t;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.Y0.x;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes3.dex */
public class i extends x {
    public final sg.bigo.ads.T0.q l0;
    public View m0;
    public ProgressBar n0;
    public boolean o0;
    public boolean p0;
    public final LandingPageStyleConfig q0;

    public i(Activity activity) {
        super(activity);
        this.o0 = false;
        this.p0 = true;
        Intent intent = activity.getIntent();
        this.q0 = intent == null ? null : (LandingPageStyleConfig) intent.getParcelableExtra("layout_style");
        sg.bigo.ads.P.c cVar = this.B;
        if (cVar != null) {
            this.l0 = ((sg.bigo.ads.U0.b) cVar).I;
        }
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public void C() {
        super.C();
        Q();
        if (F()) {
            ProgressBar progressBar = this.e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.g;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.j1.h
    public final boolean F() {
        return 1 == a("video_play_page.support_browser", "layer.support_browser", "endpage.support_browser");
    }

    public final void Q() {
        View view;
        if (!this.o0 && 1 == a("video_play_page.is_loading", "layer.is_loading", "endpage.is_loading")) {
            if (this.m0 == null || this.n0 == null) {
                ViewStub viewStub = (ViewStub) this.f12687a.findViewById(R.id.bigo_web_loading_container);
                if (viewStub != null) {
                    View inflate = viewStub.inflate();
                    this.m0 = inflate;
                    if (inflate != null) {
                        this.n0 = (ProgressBar) inflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                    }
                }
            }
            View view2 = this.m0;
            int i = 5;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.n0;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int a2 = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
            if (a2 == 2) {
                i = 3;
            } else if (a2 != 3) {
                i = a2 != 4 ? a2 : 10;
            }
            if (i > 1 && (view = this.m0) != null) {
                view.postDelayed(new h(this), i * 1000);
            }
            this.o0 = true;
        }
    }

    public final int a(String str, String str2, String str3) {
        int i;
        LandingPageStyleConfig landingPageStyleConfig;
        str.hashCode();
        i = 2;
        switch (str) {
            case "video_play_page.webview2_force_time":
                break;
            case "video_play_page.loading_timing":
            case "video_play_page.is_loading":
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        sg.bigo.ads.T0.q qVar = this.l0;
        if (qVar == null || (landingPageStyleConfig = this.q0) == null) {
            return i;
        }
        int i2 = landingPageStyleConfig.c;
        if (i2 == 0) {
            Integer a2 = z.a(qVar.a(str));
            if (a2 != null) {
                return a2.intValue();
            }
            return 0;
        }
        if (i2 == 1) {
            Integer a3 = z.a(qVar.a(str3));
            if (a3 != null) {
                return a3.intValue();
            }
            return 0;
        }
        if (i2 != 9 && i2 != 10) {
            return i;
        }
        Integer a4 = z.a(qVar.a(str2));
        if (a4 != null) {
            return a4.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public void b(String str) {
        View view;
        super.b(str);
        if (this.m0 != null) {
            int a2 = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
            if (a2 == 2) {
                a2 = 3;
            } else if (a2 == 3) {
                a2 = 5;
            } else if (a2 == 4) {
                a2 = 10;
            }
            if (a2 > 1 || (view = this.m0) == null) {
                return;
            }
            this.o0 = false;
            view.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public final void h(int i) {
        this.J = Math.max(this.J, i);
        ProgressBar progressBar = this.n0;
        if (progressBar == null || i <= 5) {
            return;
        }
        if (i > 95) {
            i = 95;
        }
        progressBar.setProgress(i);
    }

    @Override // sg.bigo.ads.Y0.x, sg.bigo.ads.j1.h
    public void a(String str, boolean z) {
        Q();
        super.a(str, z);
        if (this.p0) {
            this.p0 = false;
            return;
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.f.setEnabled(false);
        }
        int a2 = a("video_play_page.webview2_force_time", "layer.webview2_force_time", "endpage.webview2_force_time");
        if (a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4) {
            this.P = a2 + 1;
        } else {
            this.P = 0;
        }
        P();
    }
}
