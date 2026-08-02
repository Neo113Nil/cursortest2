package androidx.appcompat.widget;

import U5.C0441h;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import h.AbstractC1174a;
import java.util.WeakHashMap;
import l.AbstractC1364b;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f8187A;

    /* renamed from: B, reason: collision with root package name */
    public View f8188B;

    /* renamed from: C, reason: collision with root package name */
    public View f8189C;

    /* renamed from: D, reason: collision with root package name */
    public View f8190D;

    /* renamed from: E, reason: collision with root package name */
    public LinearLayout f8191E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f8192F;

    /* renamed from: G, reason: collision with root package name */
    public TextView f8193G;

    /* renamed from: H, reason: collision with root package name */
    public final int f8194H;

    /* renamed from: I, reason: collision with root package name */
    public final int f8195I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8196J;

    /* renamed from: K, reason: collision with root package name */
    public final int f8197K;

    /* renamed from: a, reason: collision with root package name */
    public final C0441h f8198a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8199b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f8200c;

    /* renamed from: d, reason: collision with root package name */
    public C0644j f8201d;

    /* renamed from: e, reason: collision with root package name */
    public int f8202e;

    /* renamed from: f, reason: collision with root package name */
    public P.b0 f8203f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8204x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8205y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f8206z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public static int f(View view, int i7, int i8) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int g(View view, int i7, int i8, int i9, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z4) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC1364b abstractC1364b) {
        int i7 = 1;
        View view = this.f8188B;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f8197K, (ViewGroup) this, false);
            this.f8188B = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f8188B);
        }
        View findViewById = this.f8188B.findViewById(R.id.action_mode_close_button);
        this.f8189C = findViewById;
        findViewById.setOnClickListener(new H2.e(abstractC1364b, i7));
        m.k d7 = abstractC1364b.d();
        C0644j c0644j = this.f8201d;
        if (c0644j != null) {
            c0644j.h();
            C0634e c0634e = c0644j.f8647K;
            if (c0634e != null && c0634e.b()) {
                c0634e.f15199i.dismiss();
            }
        }
        C0644j c0644j2 = new C0644j(getContext());
        this.f8201d = c0644j2;
        c0644j2.f8639C = true;
        c0644j2.f8640D = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        d7.b(this.f8201d, this.f8199b);
        C0644j c0644j3 = this.f8201d;
        m.z zVar = c0644j3.f8658y;
        if (zVar == null) {
            m.z zVar2 = (m.z) c0644j3.f8654d.inflate(c0644j3.f8656f, (ViewGroup) this, false);
            c0644j3.f8658y = zVar2;
            zVar2.a(c0644j3.f8653c);
            c0644j3.f();
        }
        m.z zVar3 = c0644j3.f8658y;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c0644j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) zVar3;
        this.f8200c = actionMenuView;
        WeakHashMap weakHashMap = P.U.f5037a;
        actionMenuView.setBackground(null);
        addView(this.f8200c, layoutParams);
    }

    public final void d() {
        if (this.f8191E == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8191E = linearLayout;
            this.f8192F = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f8193G = (TextView) this.f8191E.findViewById(R.id.action_bar_subtitle);
            int i7 = this.f8194H;
            if (i7 != 0) {
                this.f8192F.setTextAppearance(getContext(), i7);
            }
            int i8 = this.f8195I;
            if (i8 != 0) {
                this.f8193G.setTextAppearance(getContext(), i8);
            }
        }
        this.f8192F.setText(this.f8206z);
        this.f8193G.setText(this.f8187A);
        boolean isEmpty = TextUtils.isEmpty(this.f8206z);
        boolean isEmpty2 = TextUtils.isEmpty(this.f8187A);
        this.f8193G.setVisibility(!isEmpty2 ? 0 : 8);
        this.f8191E.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f8191E.getParent() == null) {
            addView(this.f8191E);
        }
    }

    public final void e() {
        removeAllViews();
        this.f8190D = null;
        this.f8200c = null;
        this.f8201d = null;
        View view = this.f8189C;
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
        return this.f8203f != null ? this.f8198a.f6499c : getVisibility();
    }

    public int getContentHeight() {
        return this.f8202e;
    }

    public CharSequence getSubtitle() {
        return this.f8187A;
    }

    public CharSequence getTitle() {
        return this.f8206z;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            P.b0 b0Var = this.f8203f;
            if (b0Var != null) {
                b0Var.b();
            }
            super.setVisibility(i7);
        }
    }

    public final P.b0 i(int i7, long j) {
        P.b0 b0Var = this.f8203f;
        if (b0Var != null) {
            b0Var.b();
        }
        C0441h c0441h = this.f8198a;
        if (i7 != 0) {
            P.b0 a2 = P.U.a(this);
            a2.a(0.0f);
            a2.c(j);
            ((ActionBarContextView) c0441h.f6500d).f8203f = a2;
            c0441h.f6499c = i7;
            a2.d(c0441h);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        P.b0 a4 = P.U.a(this);
        a4.a(1.0f);
        a4.c(j);
        ((ActionBarContextView) c0441h.f6500d).f8203f = a4;
        c0441h.f6499c = i7;
        a4.d(c0441h);
        return a4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1174a.f13323a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0644j c0644j = this.f8201d;
        if (c0644j != null) {
            Configuration configuration2 = c0644j.f8652b.getResources().getConfiguration();
            int i7 = configuration2.screenWidthDp;
            int i8 = configuration2.screenHeightDp;
            c0644j.f8643G = (configuration2.smallestScreenWidthDp > 600 || i7 > 600 || (i7 > 960 && i8 > 720) || (i7 > 720 && i8 > 960)) ? 5 : (i7 >= 500 || (i7 > 640 && i8 > 480) || (i7 > 480 && i8 > 640)) ? 4 : i7 >= 360 ? 3 : 2;
            m.k kVar = c0644j.f8653c;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0644j c0644j = this.f8201d;
        if (c0644j != null) {
            c0644j.h();
            C0634e c0634e = this.f8201d.f8647K;
            if (c0634e == null || !c0634e.b()) {
                return;
            }
            c0634e.f15199i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8205y = false;
        }
        if (!this.f8205y) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8205y = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8205y = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        boolean a2 = q1.a(this);
        int paddingRight = a2 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8188B;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8188B.getLayoutParams();
            int i11 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i13 = a2 ? paddingRight - i11 : paddingRight + i11;
            int g3 = g(this.f8188B, i13, paddingTop, paddingTop2, a2) + i13;
            paddingRight = a2 ? g3 - i12 : g3 + i12;
        }
        LinearLayout linearLayout = this.f8191E;
        if (linearLayout != null && this.f8190D == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f8191E, paddingRight, paddingTop, paddingTop2, a2);
        }
        View view2 = this.f8190D;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8200c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int i9 = this.f8202e;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.f8188B;
        if (view != null) {
            int f7 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8188B.getLayoutParams();
            paddingLeft = f7 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8200c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f8200c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f8191E;
        if (linearLayout != null && this.f8190D == null) {
            if (this.f8196J) {
                this.f8191E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f8191E.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f8191E.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f8190D;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.f8190D.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f8202e > 0) {
            setMeasuredDimension(size, i9);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8204x = false;
        }
        if (!this.f8204x) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8204x = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8204x = false;
        }
        return true;
    }

    public void setContentHeight(int i7) {
        this.f8202e = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8190D;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8190D = view;
        if (view != null && (linearLayout = this.f8191E) != null) {
            removeView(linearLayout);
            this.f8191E = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8187A = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f8206z = charSequence;
        d();
        P.U.i(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f8196J) {
            requestLayout();
        }
        this.f8196J = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int resourceId;
        this.f8198a = new C0441h(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f8199b = context;
        } else {
            this.f8199b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13326d, i7, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC1464a.w(context, resourceId);
        WeakHashMap weakHashMap = P.U.f5037a;
        setBackground(drawable);
        this.f8194H = obtainStyledAttributes.getResourceId(5, 0);
        this.f8195I = obtainStyledAttributes.getResourceId(4, 0);
        this.f8202e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f8197K = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
