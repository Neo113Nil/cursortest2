package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9840b;

    public /* synthetic */ h(l lVar, int i7) {
        this.f9839a = i7;
        this.f9840b = lVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f7, Transformation transformation) {
        switch (this.f9839a) {
            case 0:
                l lVar = this.f9840b;
                int abs = !lVar.mUsingCustomStart ? lVar.mSpinnerOffsetEnd - Math.abs(lVar.mOriginalOffsetTop) : lVar.mSpinnerOffsetEnd;
                lVar.setTargetOffsetTopAndBottom((lVar.mFrom + ((int) ((abs - r1) * f7))) - lVar.mCircleView.getTop());
                e eVar = lVar.mProgress;
                float f8 = 1.0f - f7;
                d dVar = eVar.f9828a;
                if (f8 != dVar.f9819p) {
                    dVar.f9819p = f8;
                }
                eVar.invalidateSelf();
                break;
            case 1:
                l lVar2 = this.f9840b;
                float f9 = lVar2.mStartingScale;
                lVar2.setAnimationProgress(((-f9) * f7) + f9);
                lVar2.moveToStart(f7);
                break;
            case 2:
                this.f9840b.setAnimationProgress(f7);
                break;
            case 3:
                this.f9840b.setAnimationProgress(1.0f - f7);
                break;
            default:
                this.f9840b.moveToStart(f7);
                break;
        }
    }
}
