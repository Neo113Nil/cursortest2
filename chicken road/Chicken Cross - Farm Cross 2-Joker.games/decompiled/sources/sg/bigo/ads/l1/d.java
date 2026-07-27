package sg.bigo.ads.l1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.k1.C5273n;

/* loaded from: classes3.dex */
public final class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f13061a;
    public b b;
    public final Drawable c;
    public a d;
    public final int e;
    public final int f;
    public final int g;
    public boolean h;
    public final Rect i;
    public final Rect j;
    public final Rect k;
    public final Rect l;
    public boolean m;
    public c n;

    public d(Context context) {
        super(context, null, 0);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        Drawable c = AbstractC4944a.c(context, R.drawable.bigo_ad_ic_close);
        this.c = c;
        this.d = a.d;
        c.setState(FrameLayout.EMPTY_STATE_SET);
        c.setCallback(this);
        this.f13061a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.e = AbstractC4963u.a(context, 50);
        this.f = AbstractC4963u.a(context, 30);
        this.g = AbstractC4963u.a(context, 8);
        setWillNotDraw(false);
        this.m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z) {
        int[] state = this.c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z == (state == iArr)) {
            return;
        }
        Drawable drawable = this.c;
        if (!z) {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        drawable.setState(iArr);
        invalidate(this.j);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.h) {
            this.h = false;
            this.i.set(0, 0, getWidth(), getHeight());
            a aVar = this.d;
            Rect rect = this.i;
            Rect rect2 = this.j;
            int i = this.e;
            Gravity.apply(aVar.f13059a, i, i, rect, rect2);
            this.l.set(this.j);
            Rect rect3 = this.l;
            int i2 = this.g;
            rect3.inset(i2, i2);
            a aVar2 = this.d;
            Rect rect4 = this.l;
            Rect rect5 = this.k;
            int i3 = this.f;
            Gravity.apply(aVar2.f13059a, i3, i3, rect4, rect5);
            this.c.setBounds(this.k);
        }
        if (this.c.isVisible()) {
            this.c.draw(canvas);
        }
    }

    public Rect getCloseBounds() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = this.j;
        return x >= rect.left && y >= rect.top && x < rect.right && y < rect.bottom;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int i = this.f13061a;
        Rect rect = this.j;
        if (x < rect.left - i || y < rect.top - i || x >= rect.right + i || y >= rect.bottom + i || !(this.m || this.c.isVisible())) {
            setClosePressed(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setClosePressed(true);
        } else if (action != 1) {
            if (action == 3) {
                setClosePressed(false);
            }
        } else if (this.c.getState() == FrameLayout.SELECTED_STATE_SET) {
            if (this.n == null) {
                this.n = new c(this);
            }
            postDelayed(this.n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            b bVar = this.b;
            if (bVar != null) {
                ((C5273n) bVar).f13039a.b();
            }
        }
        return true;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.m = z;
    }

    public void setCloseBoundChanged(boolean z) {
        this.h = z;
    }

    public void setCloseBounds(Rect rect) {
        this.j.set(rect);
    }

    public void setClosePosition(a aVar) {
        this.d = aVar;
        this.h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.c.setVisible(z, false)) {
            invalidate(this.j);
        }
    }

    public void setOnCloseListener(b bVar) {
        this.b = bVar;
    }
}
