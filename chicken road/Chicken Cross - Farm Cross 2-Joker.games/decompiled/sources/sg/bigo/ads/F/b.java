package sg.bigo.ads.F;

import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f12283a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;

    public b(boolean z, FrameLayout frameLayout, View view) {
        this.f12283a = z;
        this.b = frameLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12283a) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new ChangeBounds());
            transitionSet.setDuration(300L);
            TransitionManager.beginDelayedTransition(this.b, transitionSet);
        }
        if (this.c.getVisibility() != 0) {
            this.c.setVisibility(0);
        }
        View findViewById = this.c.findViewById(R.id.bigo_ad_banner_placeholder_view);
        if (findViewById != null) {
            X.c(findViewById);
        }
    }
}
