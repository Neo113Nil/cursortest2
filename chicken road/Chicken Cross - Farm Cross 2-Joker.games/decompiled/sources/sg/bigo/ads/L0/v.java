package sg.bigo.ads.L0;

import android.view.View;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12417a;
    public final /* synthetic */ int b;
    public final /* synthetic */ y c;

    public v(y yVar, View view, int i) {
        this.c = yVar;
        this.f12417a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A a2 = this.c.b;
        if (a2 != null) {
            a2.a(this.f12417a, this.b);
        }
    }
}
