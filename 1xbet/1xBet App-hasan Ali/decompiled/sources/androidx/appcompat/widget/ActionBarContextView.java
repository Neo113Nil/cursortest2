package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import game.betting133.sports1xbet.R;
import h.AbstractC1986a;
import n.I0;
import n1.C;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public int f6690k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6691l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6692m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f6693n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f6694o;

    /* renamed from: p, reason: collision with root package name */
    public View f6695p;

    /* renamed from: q, reason: collision with root package name */
    public LinearLayout f6696q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f6697r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f6698s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6699t;

    /* renamed from: u, reason: collision with root package name */
    public final int f6700u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6701v;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1986a.f17172d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC2346c.p(context, resourceId));
        this.f6699t = obtainStyledAttributes.getResourceId(5, 0);
        this.f6700u = obtainStyledAttributes.getResourceId(4, 0);
        this.f6690k = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z3) {
            view.layout(i - measuredWidth, i7, i, measuredHeight + i7);
        } else {
            view.layout(i, i7, i + measuredWidth, measuredHeight + i7);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f6696q == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f6696q = linearLayout;
            this.f6697r = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f6698s = (TextView) this.f6696q.findViewById(R.id.action_bar_subtitle);
            int i = this.f6699t;
            if (i != 0) {
                this.f6697r.setTextAppearance(getContext(), i);
            }
            int i5 = this.f6700u;
            if (i5 != 0) {
                this.f6698s.setTextAppearance(getContext(), i5);
            }
        }
        this.f6697r.setText(this.f6693n);
        this.f6698s.setText(this.f6694o);
        boolean isEmpty = TextUtils.isEmpty(this.f6693n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f6694o);
        this.f6698s.setVisibility(!isEmpty2 ? 0 : 8);
        this.f6696q.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f6696q.getParent() == null) {
            addView(this.f6696q);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f6690k;
    }

    public CharSequence getSubtitle() {
        return this.f6694o;
    }

    public CharSequence getTitle() {
        return this.f6693n;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1986a.f17169a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f6692m = false;
        }
        if (!this.f6692m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f6692m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f6692m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        boolean z5 = I0.f18161a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingRight = z6 ? (i6 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f6696q;
        if (linearLayout != null && this.f6695p == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f6696q, paddingRight, paddingTop, paddingTop2, z6);
        }
        View view = this.f6695p;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, z6);
        }
        if (z6) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i6 = this.f6690k;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f6696q;
        if (linearLayout != null && this.f6695p == null) {
            if (this.f6701v) {
                this.f6696q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f6696q.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f6696q.setVisibility(z3 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f6695p;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = Math.min(i10, i7);
            }
            this.f6695p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f6690k > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6691l = false;
        }
        if (!this.f6691l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f6691l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f6691l = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f6690k = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f6695p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f6695p = view;
        if (view != null && (linearLayout = this.f6696q) != null) {
            removeView(linearLayout);
            this.f6696q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f6694o = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f6693n = charSequence;
        a();
        C.e(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f6701v) {
            requestLayout();
        }
        this.f6701v = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
