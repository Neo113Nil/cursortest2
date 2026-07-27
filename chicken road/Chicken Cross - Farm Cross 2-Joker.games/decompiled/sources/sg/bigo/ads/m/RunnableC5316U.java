package sg.bigo.ads.m;

import android.util.Pair;
import android.view.View;
import android.widget.Button;

/* renamed from: sg.bigo.ads.m.U, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5316U implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Button f13068a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ View c;
    public final /* synthetic */ C5317V d;

    public RunnableC5316U(C5317V c5317v, Button button, Pair pair, View view) {
        this.d = c5317v;
        this.f13068a = button;
        this.b = pair;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.e.h.a((sg.bigo.ads.e.h) this.d.d)) {
            return;
        }
        sg.bigo.ads.h.T.a(this.f13068a, ((Integer) this.b.first).intValue(), new C5315T(this));
    }
}
