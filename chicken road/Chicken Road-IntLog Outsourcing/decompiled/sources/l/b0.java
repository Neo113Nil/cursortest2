package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class b0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f10826a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10827b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10828c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f10829d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10830e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10831f;

    public b0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f10830e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f10827b = rect3;
        Rect rect4 = new Rect();
        this.f10829d = rect4;
        Rect rect5 = new Rect();
        this.f10828c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f10826a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z5;
        int x5 = (int) motionEvent.getX();
        int y5 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f10831f;
                if (z5 && !this.f10829d.contains(x5, y5)) {
                    z6 = z5;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f10831f;
                    this.f10831f = false;
                }
                z = true;
                z6 = false;
            }
            z6 = z5;
            z = true;
        } else {
            if (this.f10827b.contains(x5, y5)) {
                this.f10831f = true;
                z = true;
            }
            z = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.f10828c;
        View view = this.f10826a;
        if (!z || rect.contains(x5, y5)) {
            motionEvent.setLocation(x5 - rect.left, y5 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
