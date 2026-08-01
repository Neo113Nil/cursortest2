package sg.bigo.ads.h;

import android.view.View;

/* loaded from: classes3.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12837a;

    public L0(View view) {
        this.f12837a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12837a.setVisibility(0);
    }
}
