package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class d0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f9764a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f9765b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9766c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9767d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9768e;
    public boolean f;

    public d0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f9768e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f9765b = rect3;
        Rect rect4 = new Rect();
        this.f9767d = rect4;
        Rect rect5 = new Rect();
        this.f9766c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f9764a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int x3 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z4 = this.f;
                if (z4 && !this.f9767d.contains(x3, y)) {
                    z5 = z4;
                    z3 = false;
                }
            } else {
                if (action == 3) {
                    z4 = this.f;
                    this.f = false;
                }
                z3 = true;
                z5 = false;
            }
            z5 = z4;
            z3 = true;
        } else {
            if (this.f9765b.contains(x3, y)) {
                this.f = true;
                z3 = true;
            }
            z3 = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.f9766c;
        View view = this.f9764a;
        if (!z3 || rect.contains(x3, y)) {
            motionEvent.setLocation(x3 - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
