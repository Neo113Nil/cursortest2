package h;

/* loaded from: classes.dex */
public final class b0 extends android.view.TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f3121b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f3122c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f3123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3124e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3125f;

    public b0(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
        super(rect, view);
        int scaledTouchSlop = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3124e = scaledTouchSlop;
        android.graphics.Rect rect3 = new android.graphics.Rect();
        this.f3121b = rect3;
        android.graphics.Rect rect4 = new android.graphics.Rect();
        this.f3123d = rect4;
        android.graphics.Rect rect5 = new android.graphics.Rect();
        this.f3122c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f3120a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f3125f;
                if (z3 && !this.f3123d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f3125f;
                    this.f3125f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else {
            if (this.f3121b.contains(x2, y2)) {
                this.f3125f = true;
                z2 = true;
            }
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        android.graphics.Rect rect = this.f3122c;
        android.view.View view = this.f3120a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
