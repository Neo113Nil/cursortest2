package androidx.core.view;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.core.view.DifferentialMotionFlingController;

/* renamed from: androidx.core.view.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0274n implements DifferentialMotionFlingController.DifferentialVelocityProvider {
    @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
    public final float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        float currentVelocity;
        currentVelocity = DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i);
        return currentVelocity;
    }
}
