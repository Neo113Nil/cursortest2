package sg.bigo.ads.h;

import android.os.SystemClock;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class G1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O1 f12822a;

    public G1(O1 o1) {
        this.f12822a = o1;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f12822a.g = SystemClock.elapsedRealtime();
    }
}
