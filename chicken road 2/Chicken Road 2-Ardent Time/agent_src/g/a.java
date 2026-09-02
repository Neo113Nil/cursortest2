package g;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2909c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f2910d;

    /* renamed from: e, reason: collision with root package name */
    public h.RunnableC0133B f2911e;

    /* renamed from: f, reason: collision with root package name */
    public h.RunnableC0133B f2912f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2913g;

    /* renamed from: h, reason: collision with root package name */
    public int f2914h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2915i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2916j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2917k;

    public a(android.view.View view) {
        this.f2915i = new int[2];
        this.f2910d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2907a = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        this.f2908b = tapTimeout;
        this.f2909c = (android.view.ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        h.RunnableC0133B runnableC0133B = this.f2912f;
        android.view.View view = this.f2910d;
        if (runnableC0133B != null) {
            view.removeCallbacks(runnableC0133B);
        }
        h.RunnableC0133B runnableC0133B2 = this.f2911e;
        if (runnableC0133B2 != null) {
            view.removeCallbacks(runnableC0133B2);
        }
    }

    public final g.l b() {
        h.C0148f c0148f;
        switch (this.f2916j) {
            case 0:
                g.b bVar = ((androidx.appcompat.view.menu.ActionMenuItemView) this.f2917k).f1958j;
                if (bVar == null || (c0148f = ((h.C0149g) bVar).f3158a.f3179s) == null) {
                    return null;
                }
                return c0148f.a();
            default:
                h.C0148f c0148f2 = ((h.C0150h) this.f2917k).f3160c.f3178r;
                if (c0148f2 == null) {
                    return null;
                }
                return c0148f2.a();
        }
    }

    public final boolean c() {
        g.l b2;
        switch (this.f2916j) {
            case 0:
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = (androidx.appcompat.view.menu.ActionMenuItemView) this.f2917k;
                g.i iVar = actionMenuItemView.f1956h;
                return iVar != null && iVar.a(actionMenuItemView.f1953e) && (b2 = b()) != null && b2.i();
            default:
                ((h.C0150h) this.f2917k).f3160c.j();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        h.AbstractC0167z abstractC0167z;
        boolean z4 = this.f2913g;
        android.view.View view2 = this.f2910d;
        if (z4) {
            g.l b2 = b();
            if (b2 != null && b2.i() && (abstractC0167z = (h.AbstractC0167z) b2.j()) != null && abstractC0167z.isShown()) {
                android.view.MotionEvent obtainNoHistory = android.view.MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2915i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC0167z.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = abstractC0167z.b(this.f2914h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            switch (this.f2916j) {
                case 1:
                    h.C0151i c0151i = ((h.C0150h) this.f2917k).f3160c;
                    if (c0151i.t == null) {
                        c0151i.i();
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    g.l b4 = b();
                    if (b4 != null && b4.i()) {
                        b4.dismiss();
                    }
                    z3 = true;
                    break;
            }
            if (z3) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2914h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f2907a;
                                float f3 = -f2;
                                if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = android.os.SystemClock.uptimeMillis();
                                            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f2914h = motionEvent.getPointerId(0);
                    if (this.f2911e == null) {
                        this.f2911e = new h.RunnableC0133B(this, 0);
                    }
                    view2.postDelayed(this.f2911e, this.f2908b);
                    if (this.f2912f == null) {
                        this.f2912f = new h.RunnableC0133B(this, 1);
                    }
                    view2.postDelayed(this.f2912f, this.f2909c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f2913g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f2913g = false;
        this.f2914h = -1;
        h.RunnableC0133B runnableC0133B = this.f2911e;
        if (runnableC0133B != null) {
            this.f2910d.removeCallbacks(runnableC0133B);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView) {
        this((android.view.View) actionMenuItemView);
        this.f2916j = 0;
        this.f2917k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(h.C0150h c0150h, h.C0150h c0150h2) {
        this(c0150h2);
        this.f2916j = 1;
        this.f2917k = c0150h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
