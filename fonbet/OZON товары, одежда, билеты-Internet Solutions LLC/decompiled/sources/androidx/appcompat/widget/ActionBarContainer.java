package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37529a;

    /* renamed from: b, reason: collision with root package name */
    private View f37530b;

    /* renamed from: c, reason: collision with root package name */
    private View f37531c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f37532d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f37533e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f37534f;

    /* renamed from: g, reason: collision with root package name */
    boolean f37535g;

    /* renamed from: h, reason: collision with root package name */
    boolean f37536h;

    /* renamed from: i, reason: collision with root package name */
    private int f37537i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C5057b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6977a.f65647a);
        boolean z11 = false;
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f37532d = drawable;
        Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
        this.f37533e = drawable2;
        this.f37537i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f37535g = true;
            this.f37534f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f37535g ? !(drawable != null || drawable2 != null) : this.f37534f == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
    }

    public final void a(boolean z11) {
        this.f37529a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f37532d;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
        Drawable drawable2 = this.f37533e;
        if (drawable2 != null && drawable2.isStateful()) {
            drawable2.setState(getDrawableState());
        }
        Drawable drawable3 = this.f37534f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        drawable3.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f37532d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f37533e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f37534f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37530b = findViewById(R.id.action_bar);
        this.f37531c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f37529a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (this.f37535g) {
            Drawable drawable = this.f37534f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = false;
            }
        } else {
            Drawable drawable2 = this.f37532d;
            if (drawable2 == null) {
                z12 = false;
            } else if (this.f37530b.getVisibility() == 0) {
                drawable2.setBounds(this.f37530b.getLeft(), this.f37530b.getTop(), this.f37530b.getRight(), this.f37530b.getBottom());
            } else {
                View view = this.f37531c;
                if (view == null || view.getVisibility() != 0) {
                    drawable2.setBounds(0, 0, 0, 0);
                } else {
                    drawable2.setBounds(this.f37531c.getLeft(), this.f37531c.getTop(), this.f37531c.getRight(), this.f37531c.getBottom());
                }
            }
            this.f37536h = false;
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        if (this.f37530b == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = this.f37537i) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i12)), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i11, i12);
        if (this.f37530b == null) {
            return;
        }
        View.MeasureSpec.getMode(i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f37532d;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f37533e;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f37534f;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = this.f37532d;
        boolean z11 = this.f37535g;
        if (drawable == drawable2 && !z11) {
            return true;
        }
        if (drawable == this.f37533e && this.f37536h) {
            return true;
        }
        return (drawable == this.f37534f && z11) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }
}
