package sg.bigo.ads.L;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: sg.bigo.ads.L.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4977k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12388a;
    public final /* synthetic */ View b;

    public RunnableC4977k(ViewGroup viewGroup, View view) {
        this.f12388a = viewGroup;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.b, PropertyValuesHolder.ofKeyframe("translationX", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.72f, this.f12388a.getMeasuredWidth())));
        if (r.f12395a == null) {
            r.f12395a = new ArrayList();
        }
        r.f12395a.add(ofPropertyValuesHolder);
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
    }
}
