package sg.bigo.ads.H;

import android.view.View;
import sg.bigo.ads.h.AbstractC5140Q;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12314a;
    public final /* synthetic */ p b;

    public j(p pVar, View view) {
        this.b = pVar;
        this.f12314a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.h()) {
            AbstractC5140Q.a(this.f12314a);
        } else {
            this.f12314a.clearAnimation();
        }
    }
}
