package sg.bigo.ads.m;

import android.graphics.Rect;
import android.transition.TransitionValues;
import sg.bigo.ads.K0.C4949f;

/* renamed from: sg.bigo.ads.m.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5345x extends C4949f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC5347z f13105a;

    public C5345x(RunnableC5347z runnableC5347z) {
        this.f13105a = runnableC5347z;
    }

    @Override // sg.bigo.ads.K0.C4949f
    public final void a(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues.view == this.f13105a.b.o) {
            Rect rect = (Rect) transitionValues2.values.get("android:changeBounds:bounds");
            transitionValues.values.put("android:changeBounds:bounds", new Rect(rect.centerX(), rect.centerY(), rect.centerX(), rect.centerY()));
        }
    }
}
