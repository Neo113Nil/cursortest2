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
import live.football.scorerepublic.R;
import p000.AbstractC0751u2;
import p000.C0120d;
import p000.C0270h1;
import p000.C0455m2;
import p000.C0603q2;
import p000.ViewOnClickListenerC0123d2;
import p000.ai1;
import p000.go0;
import p000.j22;
import p000.ji1;
import p000.mz0;
import p000.on0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public final int f339A;

    /* JADX INFO: renamed from: B */
    public boolean f340B;

    /* JADX INFO: renamed from: C */
    public final int f341C;

    /* JADX INFO: renamed from: j */
    public final C0120d f342j;

    /* JADX INFO: renamed from: k */
    public final Context f343k;

    /* JADX INFO: renamed from: l */
    public ActionMenuView f344l;

    /* JADX INFO: renamed from: m */
    public C0603q2 f345m;

    /* JADX INFO: renamed from: n */
    public int f346n;

    /* JADX INFO: renamed from: o */
    public ji1 f347o;

    /* JADX INFO: renamed from: p */
    public boolean f348p;

    /* JADX INFO: renamed from: q */
    public boolean f349q;

    /* JADX INFO: renamed from: r */
    public CharSequence f350r;

    /* JADX INFO: renamed from: s */
    public CharSequence f351s;

    /* JADX INFO: renamed from: t */
    public View f352t;

    /* JADX INFO: renamed from: u */
    public View f353u;

    /* JADX INFO: renamed from: v */
    public View f354v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f355w;

    /* JADX INFO: renamed from: x */
    public TextView f356x;

    /* JADX INFO: renamed from: y */
    public TextView f357y;

    /* JADX INFO: renamed from: z */
    public final int f358z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f342j = new C0120d(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f343k = context;
        } else {
            this.f343k = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5190d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : j22.m2807p(context, resourceId));
        this.f358z = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f339A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f346n = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f341C = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m338f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m339g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m340c(AbstractC0751u2 abstractC0751u2) {
        View view = this.f352t;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f341C, (ViewGroup) this, false);
            this.f352t = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f352t);
        }
        View viewFindViewById = this.f352t.findViewById(R.id.action_mode_close_button);
        this.f353u = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0123d2(0, abstractC0751u2));
        on0 on0VarMo2103c = abstractC0751u2.mo2103c();
        C0603q2 c0603q2 = this.f345m;
        if (c0603q2 != null) {
            c0603q2.m4026c();
            C0455m2 c0455m2 = c0603q2.f6320C;
            if (c0455m2 != null && c0455m2.m5814b()) {
                c0455m2.f9404i.dismiss();
            }
        }
        C0603q2 c0603q3 = new C0603q2(getContext());
        this.f345m = c0603q3;
        c0603q3.f6335u = true;
        c0603q3.f6336v = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        on0VarMo2103c.m3706b(this.f345m, this.f343k);
        C0603q2 c0603q4 = this.f345m;
        go0 go0Var = c0603q4.f6331q;
        if (go0Var == null) {
            go0 go0Var2 = (go0) c0603q4.f6327m.inflate(c0603q4.f6329o, (ViewGroup) this, false);
            c0603q4.f6331q = go0Var2;
            go0Var2.mo335b(c0603q4.f6326l);
            c0603q4.mo1485g();
        }
        go0 go0Var3 = c0603q4.f6331q;
        if (go0Var != go0Var3) {
            ((ActionMenuView) go0Var3).setPresenter(c0603q4);
        }
        ActionMenuView actionMenuView = (ActionMenuView) go0Var3;
        this.f344l = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f344l, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m341d() {
        if (this.f355w == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f355w = linearLayout;
            this.f356x = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f357y = (TextView) this.f355w.findViewById(R.id.action_bar_subtitle);
            int i = this.f358z;
            if (i != 0) {
                this.f356x.setTextAppearance(getContext(), i);
            }
            int i2 = this.f339A;
            if (i2 != 0) {
                this.f357y.setTextAppearance(getContext(), i2);
            }
        }
        this.f356x.setText(this.f350r);
        this.f357y.setText(this.f351s);
        boolean zIsEmpty = TextUtils.isEmpty(this.f350r);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f351s);
        this.f357y.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f355w.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f355w.getParent() == null) {
            addView(this.f355w);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m342e() {
        removeAllViews();
        this.f354v = null;
        this.f344l = null;
        this.f345m = null;
        View view = this.f353u;
        if (view != null) {
            view.setOnClickListener(null);
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
        return this.f347o != null ? this.f342j.f1498k : getVisibility();
    }

    public int getContentHeight() {
        return this.f346n;
    }

    public CharSequence getSubtitle() {
        return this.f351s;
    }

    public CharSequence getTitle() {
        return this.f350r;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ji1 ji1Var = this.f347o;
            if (ji1Var != null) {
                ji1Var.m2913b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final ji1 m344i(int i, long j) {
        ji1 ji1Var = this.f347o;
        if (ji1Var != null) {
            ji1Var.m2913b();
        }
        C0120d c0120d = this.f342j;
        if (i != 0) {
            ji1 ji1VarM248a = ai1.m248a(this);
            ji1VarM248a.m2912a(0.0f);
            ji1VarM248a.m2914c(j);
            ((ActionBarContextView) c0120d.f1500m).f347o = ji1VarM248a;
            c0120d.f1498k = i;
            ji1VarM248a.m2915d(c0120d);
            return ji1VarM248a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ji1 ji1VarM248a2 = ai1.m248a(this);
        ji1VarM248a2.m2912a(1.0f);
        ji1VarM248a2.m2914c(j);
        ((ActionBarContextView) c0120d.f1500m).f347o = ji1VarM248a2;
        c0120d.f1498k = i;
        ji1VarM248a2.m2915d(c0120d);
        return ji1VarM248a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, mz0.f5187a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0603q2 c0603q2 = this.f345m;
        if (c0603q2 != null) {
            Configuration configuration2 = c0603q2.f6325k.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            c0603q2.f6339y = i;
            on0 on0Var = c0603q2.f6326l;
            if (on0Var != null) {
                on0Var.m3712p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0603q2 c0603q2 = this.f345m;
        if (c0603q2 != null) {
            c0603q2.m4026c();
            C0455m2 c0455m2 = this.f345m.f6320C;
            if (c0455m2 == null || !c0455m2.m5814b()) {
                return;
            }
            c0455m2.f9404i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f349q = false;
        }
        if (!this.f349q) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f349q = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f349q = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f352t;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f352t.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iM339g = m339g(this.f352t, i7, paddingTop, paddingTop2, z2) + i7;
            paddingRight = z2 ? iM339g - i6 : iM339g + i6;
        }
        LinearLayout linearLayout = this.f355w;
        if (linearLayout != null && this.f354v == null && linearLayout.getVisibility() != 8) {
            paddingRight += m339g(this.f355w, paddingRight, paddingTop, paddingTop2, z2);
        }
        View view2 = this.f354v;
        if (view2 != null) {
            m339g(view2, paddingRight, paddingTop, paddingTop2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f344l;
        if (actionMenuView != null) {
            m339g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C0270h1.m2191g(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C0270h1.m2191g(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f346n;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f352t;
        if (view != null) {
            int iM338f = m338f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f352t.getLayoutParams();
            paddingLeft = iM338f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f344l;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m338f(this.f344l, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f355w;
        if (linearLayout != null && this.f354v == null) {
            if (this.f340B) {
                this.f355w.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f355w.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f355w.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m338f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f354v;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f354v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f346n > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f348p = false;
        }
        if (!this.f348p) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f348p = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f348p = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f346n = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f354v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f354v = view;
        if (view != null && (linearLayout = this.f355w) != null) {
            removeView(linearLayout);
            this.f355w = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f351s = charSequence;
        m341d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f350r = charSequence;
        m341d();
        ai1.m253f(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f340B) {
            requestLayout();
        }
        this.f340B = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
