package sg.bigo.ads.D1;

import android.content.Context;
import android.view.ViewGroup;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.P.x;

/* loaded from: classes3.dex */
public final class b implements sg.bigo.ads.R.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f12255a;
    public final Context b;
    public final ViewGroup c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public k j;
    public sg.bigo.ads.r1.i k;
    public final x l;

    public b(Context context, ViewGroup viewGroup, String str, int i, int i2, int i3, String str2, int i4, x xVar) {
        a aVar = new a(this);
        this.f12255a = aVar;
        this.b = context;
        this.c = viewGroup;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
        this.i = i4;
        this.l = xVar;
        k kVar = new k(context, str, i, i2, i3, str2, i4, xVar);
        kVar.setOnRenderProcessGoneListener(aVar);
        this.j = kVar;
        X.a(kVar, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.R.a
    public final void a() {
        this.j.c("window.vpaidwrapper.pauseAd()");
    }
}
