package A;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.MotionButton;

/* loaded from: classes.dex */
public final class d extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionButton f12b;

    public /* synthetic */ d(MotionButton motionButton, int i7) {
        this.f11a = i7;
        this.f12b = motionButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f11a) {
            case 0:
                MotionButton motionButton = this.f12b;
                outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), (Math.min(r3, r4) * motionButton.f8930d) / 2.0f);
                break;
            default:
                MotionButton motionButton2 = this.f12b;
                outline.setRoundRect(0, 0, motionButton2.getWidth(), motionButton2.getHeight(), motionButton2.f8931e);
                break;
        }
    }
}
