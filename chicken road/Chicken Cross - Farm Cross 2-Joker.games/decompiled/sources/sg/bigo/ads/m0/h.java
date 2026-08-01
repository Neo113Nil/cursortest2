package sg.bigo.ads.m0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.P.n;

/* loaded from: classes3.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13115a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ n d;
    public final /* synthetic */ C5353f e;

    public h(View view, RelativeLayout relativeLayout, Context context, n nVar, C5353f c5353f) {
        this.f13115a = view;
        this.b = relativeLayout;
        this.c = context;
        this.d = nVar;
        this.e = c5353f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        X.c(this.f13115a);
        sg.bigo.ads.common.form.render.a.a(this.b, this.c, this.d, this.e, 2);
        C5353f c5353f = this.e;
        if (c5353f != null) {
            c5353f.a(6, c5353f.i, System.currentTimeMillis() - c5353f.h);
        }
    }
}
