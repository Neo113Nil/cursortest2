package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import l.C1367e;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class t extends ContentFrameLayout {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f13728z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, C1367e c1367e) {
        super(c1367e, null);
        this.f13728z = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f13728z.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x4 < -5 || y4 < -5 || x4 > getWidth() + 5 || y4 > getHeight() + 5) {
                v vVar = this.f13728z;
                vVar.t(vVar.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(AbstractC1464a.w(getContext(), i7));
    }
}
