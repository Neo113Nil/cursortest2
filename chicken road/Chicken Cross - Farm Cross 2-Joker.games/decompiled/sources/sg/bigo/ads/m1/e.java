package sg.bigo.ads.m1;

import android.content.Context;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13125a;
    public final /* synthetic */ g b;

    public e(g gVar, Context context) {
        this.b = gVar;
        this.f13125a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.b;
        gVar.a(this.f13125a, gVar.f12790a, "omsdk-1.3.0.js");
    }
}
