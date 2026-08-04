package p058i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p078l.e;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends ContentFrameLayout {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f13734z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, e eVar) {
        super(eVar, null);
        this.f13734z = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f13734z.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x4 < -5 || y4 < -5 || x4 > getWidth() + 5 || y4 > getHeight() + 5) {
                v vVar = this.f13734z;
                vVar.t(vVar.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i7) {
        setBackgroundDrawable(a.w(getContext(), i7));
    }
}
