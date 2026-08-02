package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.shape.g;

/* loaded from: classes4.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.a.i;
        if (gVar != null) {
            g.b bVar = gVar.a;
            if (bVar.i != floatValue) {
                bVar.i = floatValue;
                gVar.e = true;
                gVar.invalidateSelf();
            }
        }
    }
}
