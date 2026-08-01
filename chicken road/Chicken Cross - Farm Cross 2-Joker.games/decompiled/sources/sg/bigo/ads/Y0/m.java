package sg.bigo.ads.Y0;

import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;

/* loaded from: classes3.dex */
public final class m implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12639a;

    public m(x xVar) {
        this.f12639a = xVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f12639a.f == null) {
            return;
        }
        if (bool == null || !bool.booleanValue()) {
            ViewParent parent = this.f12639a.f.getParent();
            if (parent instanceof ViewGroup) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.addTransition(new Fade(1));
                transitionSet.setDuration(300L);
                TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
            }
        }
        this.f12639a.f.setEnabled(true);
        this.f12639a.f.setVisibility(0);
    }
}
