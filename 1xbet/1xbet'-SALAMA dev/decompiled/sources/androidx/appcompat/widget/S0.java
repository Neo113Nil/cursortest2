package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f8410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f8411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f8412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8414f;

    public S0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f8413e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f8410b = rect3;
        Rect rect4 = new Rect();
        this.f8412d = rect4;
        Rect rect5 = new Rect();
        this.f8411c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f8409a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z7;
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z7 = this.f8414f;
                if (z7 && !this.f8412d.contains(x4, y4)) {
                    z8 = z7;
                    z4 = false;
                }
            } else if (action != 3) {
                z4 = true;
                z8 = false;
            } else {
                z7 = this.f8414f;
                this.f8414f = false;
            }
            z8 = z7;
            z4 = true;
        } else if (this.f8410b.contains(x4, y4)) {
            this.f8414f = true;
            z4 = true;
        } else {
            z4 = true;
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        Rect rect = this.f8411c;
        View view = this.f8409a;
        if (!z4 || rect.contains(x4, y4)) {
            motionEvent.setLocation(x4 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
