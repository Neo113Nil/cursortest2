package A;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionLabel;

/* loaded from: classes.dex */
public final class e extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionLabel f14b;

    public /* synthetic */ e(MotionLabel motionLabel, int i7) {
        this.f13a = i7;
        this.f14b = motionLabel;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f13a) {
            case 0:
                MotionLabel motionLabel = this.f14b;
                outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), (Math.min(r3, r4) * motionLabel.f8967f) / 2.0f);
                break;
            default:
                MotionLabel motionLabel2 = this.f14b;
                outline.setRoundRect(0, 0, motionLabel2.getWidth(), motionLabel2.getHeight(), motionLabel2.f8977x);
                break;
        }
    }
}
