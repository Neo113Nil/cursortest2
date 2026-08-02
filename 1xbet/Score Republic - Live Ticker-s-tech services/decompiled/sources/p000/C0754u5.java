package p000;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0754u5 extends ContentFrameLayout {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ LayoutInflaterFactory2C0828w5 f7672r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754u5(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5, C0771um c0771um) {
        super(c0771um, null);
        this.f7672r = layoutInflaterFactory2C0828w5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f7672r.m5250t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5 = this.f7672r;
                layoutInflaterFactory2C0828w5.m5249r(layoutInflaterFactory2C0828w5.m5255y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(j22.m2807p(getContext(), i));
    }
}
