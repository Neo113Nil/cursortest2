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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f8187A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f8188B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f8189C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f8190D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f8191E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f8192F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f8193G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f8194H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f8195I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f8196J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f8197K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0441h f8198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f8200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0623j f8201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P.b0 f8203f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8204x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8205y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
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

    public final void c(p078l.b bVar) {
        int i7 = 1;
        View view = this.f8188B;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f8197K, (ViewGroup) this, false);
            this.f8188B = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f8188B);
        }
        View viewFindViewById = this.f8188B.findViewById(R.id.action_mode_close_button);
        this.f8189C = viewFindViewById;
        viewFindViewById.setOnClickListener(new H2.e(bVar, i7));
        p086m.k kVarD = bVar.d();
        C0623j c0623j = this.f8201d;
        if (c0623j != null) {
            c0623j.h();
            C0613e c0613e = c0623j.f8647K;
            if (c0613e != null && c0613e.b()) {
                c0613e.f15205i.dismiss();
            }
        }
        C0623j c0623j2 = new C0623j(getContext());
        this.f8201d = c0623j2;
        c0623j2.f8639C = true;
        c0623j2.f8640D = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        kVarD.b(this.f8201d, this.f8199b);
        C0623j c0623j3 = this.f8201d;
        p086m.z zVar = c0623j3.f8658y;
        if (zVar == null) {
            p086m.z zVar2 = (p086m.z) c0623j3.f8654d.inflate(c0623j3.f8656f, (ViewGroup) this, false);
            c0623j3.f8658y = zVar2;
            zVar2.a(c0623j3.f8653c);
            c0623j3.f();
        }
        p086m.z zVar3 = c0623j3.f8658y;
        if (zVar != zVar3) {
            ((ActionMenuView) zVar3).setPresenter(c0623j3);
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
        boolean zIsEmpty = TextUtils.isEmpty(this.f8206z);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f8187A);
        this.f8193G.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f8191E.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
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
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
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
            P.b0 b0VarA = P.U.a(this);
            b0VarA.a(0.0f);
            b0VarA.c(j);
            ((ActionBarContextView) c0441h.f6500d).f8203f = b0VarA;
            c0441h.f6499c = i7;
            b0VarA.d(c0441h);
            return b0VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        P.b0 b0VarA2 = P.U.a(this);
        b0VarA2.a(1.0f);
        b0VarA2.c(j);
        ((ActionBarContextView) c0441h.f6500d).f8203f = b0VarA2;
        c0441h.f6499c = i7;
        b0VarA2.d(c0441h);
        return b0VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p051h.a.f13329a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0623j c0623j = this.f8201d;
        if (c0623j != null) {
            Configuration configuration2 = c0623j.f8652b.getResources().getConfiguration();
            int i8 = configuration2.screenWidthDp;
            int i9 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
                i7 = 5;
            } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
                i7 = 4;
            } else {
                i7 = i8 >= 360 ? 3 : 2;
            }
            c0623j.f8643G = i7;
            p086m.k kVar = c0623j.f8653c;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0623j c0623j = this.f8201d;
        if (c0623j != null) {
            c0623j.h();
            C0613e c0613e = this.f8201d.f8647K;
            if (c0613e == null || !c0613e.b()) {
                return;
            }
            c0613e.f15205i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8205y = false;
        }
        if (!this.f8205y) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
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
        boolean zA = q1.a(this);
        int paddingRight = zA ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8188B;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8188B.getLayoutParams();
            int i11 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i13 = zA ? paddingRight - i11 : paddingRight + i11;
            int iG = g(this.f8188B, i13, paddingTop, paddingTop2, zA) + i13;
            paddingRight = zA ? iG - i12 : iG + i12;
        }
        LinearLayout linearLayout = this.f8191E;
        if (linearLayout != null && this.f8190D == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f8191E, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.f8190D;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8200c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
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
        int size2 = this.f8202e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i8);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f8188B;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8188B.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8200c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f8200c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f8191E;
        if (linearLayout != null && this.f8190D == null) {
            if (this.f8196J) {
                this.f8191E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f8191E.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f8191E.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f8190D;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i11 >= 0) {
                iMin = Math.min(i11, iMin);
            }
            this.f8190D.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.f8202e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8204x = false;
        }
        if (!this.f8204x) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
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
        int resourceId;
        super(context, attributeSet, i7);
        this.f8198a = new C0441h(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f8199b = context;
        } else {
            this.f8199b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p051h.a.f13332d, i7, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : p097n3.a.w(context, resourceId);
        WeakHashMap weakHashMap = P.U.f5037a;
        setBackground(drawable);
        this.f8194H = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f8195I = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f8202e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f8197K = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
