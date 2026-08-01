package sg.bigo.ads.L0;

import android.view.View;

/* loaded from: classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12416a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ y d;

    public u(y yVar, View view, int i, float f) {
        this.d = yVar;
        this.f12416a = view;
        this.b = i;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a2 = this.d.b;
        if (a2 != null) {
            a2.a(this.f12416a, this.b, this.c);
        }
    }
}
