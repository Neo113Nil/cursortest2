package sg.bigo.ads.i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.i.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5236h {

    /* renamed from: a, reason: collision with root package name */
    public final C5241m f12983a;
    public View b;
    public ProgressBar c;
    public ViewGroup d;
    public RunnableC5232d e;
    public C5234f f;
    public C5242n g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k = 0;

    public C5236h(C5241m c5241m) {
        this.f12983a = c5241m;
    }

    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        RunnableC5232d runnableC5232d = this.e;
        if (runnableC5232d != null) {
            C5241m c5241m = this.f12983a;
            if (c5241m.e == runnableC5232d) {
                c5241m.e = null;
            }
            this.e = null;
        }
        C5234f c5234f = this.f;
        if (c5234f != null) {
            C5241m c5241m2 = this.f12983a;
            if (c5241m2.g == c5234f) {
                c5241m2.g = null;
            }
            this.f = null;
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
            X.c(this.b);
            this.b = null;
        }
        this.c = null;
        this.d = null;
        this.g = null;
        this.h = false;
    }

    public final void a(Context context, ViewGroup viewGroup) {
        int min;
        if (this.i || this.h) {
            return;
        }
        this.h = true;
        this.d = viewGroup;
        View a2 = AbstractC4944a.a(viewGroup.getContext(), R.layout.bigo_ad_webview_loading, viewGroup, false);
        this.b = a2;
        if (a2 == null) {
            AbstractC5496a.a("ForcePlayableFallback", "show: failed to inflate loading view");
        } else {
            X.a(a2, viewGroup, new FrameLayout.LayoutParams(-1, -1, 17), -1);
            this.b.setVisibility(0);
            ProgressBar progressBar = (ProgressBar) this.b.findViewById(R.id.bigo_ad_webview_loading_progress);
            this.c = progressBar;
            int i = this.f12983a.p.j;
            if (progressBar != null && (min = Math.min(i, 95)) > this.k) {
                this.k = min;
                this.c.setProgress(min);
            }
        }
        RunnableC5232d runnableC5232d = new RunnableC5232d(this);
        this.e = runnableC5232d;
        C5241m c5241m = this.f12983a;
        c5241m.e = runnableC5232d;
        C5234f c5234f = new C5234f(this);
        this.f = c5234f;
        c5241m.g = c5234f;
        if (!c5241m.f12988a || context == null) {
            return;
        }
        c5241m.u = true;
        c5241m.p.a(context);
    }
}
