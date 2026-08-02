package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AbstractC5056a;
import androidx.appcompat.widget.C5058c;
import androidx.core.view.C5326k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class ActionBarContextView extends AbstractC5056a {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f37538i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f37539j;

    /* renamed from: k, reason: collision with root package name */
    private View f37540k;

    /* renamed from: l, reason: collision with root package name */
    private View f37541l;

    /* renamed from: m, reason: collision with root package name */
    private View f37542m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f37543n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f37544o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f37545p;

    /* renamed from: q, reason: collision with root package name */
    private int f37546q;

    /* renamed from: r, reason: collision with root package name */
    private int f37547r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37548s;

    /* renamed from: t, reason: collision with root package name */
    private int f37549t;

    final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f37550a;

        a(androidx.appcompat.view.b bVar) {
            this.f37550a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f37550a.c();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    private void j() {
        if (this.f37543n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f37543n = linearLayout;
            this.f37544o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f37545p = (TextView) this.f37543n.findViewById(R.id.action_bar_subtitle);
            int i11 = this.f37546q;
            if (i11 != 0) {
                this.f37544o.setTextAppearance(getContext(), i11);
            }
            int i12 = this.f37547r;
            if (i12 != 0) {
                this.f37545p.setTextAppearance(getContext(), i12);
            }
        }
        this.f37544o.setText(this.f37538i);
        this.f37545p.setText(this.f37539j);
        boolean isEmpty = TextUtils.isEmpty(this.f37538i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f37539j);
        this.f37545p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f37543n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f37543n.getParent() == null) {
            addView(this.f37543n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC5056a
    public final void e(int i11) {
        this.f37857e = i11;
    }

    public final void f() {
        if (this.f37540k == null) {
            l();
        }
    }

    public final CharSequence g() {
        return this.f37539j;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final CharSequence h() {
        return this.f37538i;
    }

    public final void i(androidx.appcompat.view.b bVar) {
        View view = this.f37540k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f37549t, (ViewGroup) this, false);
            this.f37540k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f37540k);
        }
        View findViewById = this.f37540k.findViewById(R.id.action_mode_close_button);
        this.f37541l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g e11 = bVar.e();
        C5058c c5058c = this.f37856d;
        if (c5058c != null) {
            c5058c.z();
            C5058c.a aVar = c5058c.f37879u;
            if (aVar != null) {
                aVar.a();
            }
        }
        C5058c c5058c2 = new C5058c(getContext());
        this.f37856d = c5058c2;
        c5058c2.F();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        e11.c(this.f37856d, this.f37854b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f37856d.o(this);
        this.f37855c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f37855c, layoutParams);
    }

    public final boolean k() {
        return this.f37548s;
    }

    public final void l() {
        removeAllViews();
        this.f37542m = null;
        this.f37855c = null;
        this.f37856d = null;
        View view = this.f37541l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void m(View view) {
        LinearLayout linearLayout;
        View view2 = this.f37542m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f37542m = view;
        if (view != null && (linearLayout = this.f37543n) != null) {
            removeView(linearLayout);
            this.f37543n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void n(CharSequence charSequence) {
        this.f37539j = charSequence;
        j();
    }

    public final void o(CharSequence charSequence) {
        this.f37538i = charSequence;
        j();
        androidx.core.view.Y.E(this, charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5058c c5058c = this.f37856d;
        if (c5058c != null) {
            c5058c.z();
            C5058c.a aVar = this.f37856d.f37879u;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = i0.f37951d;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i13 - i11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.f37540k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37540k.getLayoutParams();
            int i16 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i17 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i18 = z12 ? paddingRight - i16 : paddingRight + i16;
            int d11 = i18 + AbstractC5056a.d(this.f37540k, z12, i18, paddingTop, paddingTop2);
            paddingRight = z12 ? d11 - i17 : d11 + i17;
        }
        LinearLayout linearLayout = this.f37543n;
        if (linearLayout != null && this.f37542m == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC5056a.d(this.f37543n, z12, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f37542m;
        if (view2 != null) {
            AbstractC5056a.d(view2, z12, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i13 - i11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f37855c;
        if (actionMenuView != null) {
            AbstractC5056a.d(actionMenuView, !z12, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i12) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f37857e;
        if (i13 <= 0) {
            i13 = View.MeasureSpec.getSize(i12);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i14 = i13 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, LinearLayoutManager.INVALID_OFFSET);
        View view = this.f37540k;
        if (view != null) {
            int c11 = AbstractC5056a.c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37540k.getLayoutParams();
            paddingLeft = c11 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f37855c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC5056a.c(this.f37855c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f37543n;
        if (linearLayout != null && this.f37542m == null) {
            if (this.f37548s) {
                this.f37543n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f37543n.getMeasuredWidth();
                boolean z11 = measuredWidth <= paddingLeft;
                if (z11) {
                    paddingLeft -= measuredWidth;
                }
                this.f37543n.setVisibility(z11 ? 0 : 8);
            } else {
                paddingLeft = AbstractC5056a.c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f37542m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i15 >= 0) {
                paddingLeft = Math.min(i15, paddingLeft);
            }
            int i17 = layoutParams.height;
            int i18 = i17 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i17 >= 0) {
                i14 = Math.min(i17, i14);
            }
            this.f37542m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i18));
        }
        if (this.f37857e > 0) {
            setMeasuredDimension(size, i13);
            return;
        }
        int childCount = getChildCount();
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            int measuredHeight = getChildAt(i21).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i19) {
                i19 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i19);
    }

    public final void p(boolean z11) {
        if (z11 != this.f37548s) {
            requestLayout();
        }
        this.f37548s = z11;
    }

    public final C5326k0 q(int i11, long j11) {
        C5326k0 c5326k0 = this.f37858f;
        if (c5326k0 != null) {
            c5326k0.b();
        }
        AbstractC5056a.C0715a c0715a = this.f37853a;
        if (i11 != 0) {
            C5326k0 b11 = androidx.core.view.Y.b(this);
            b11.a(0.0f);
            b11.d(j11);
            AbstractC5056a.this.f37858f = b11;
            c0715a.f37862b = i11;
            b11.f(c0715a);
            return b11;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C5326k0 b12 = androidx.core.view.Y.b(this);
        b12.a(1.0f);
        b12.d(j11);
        AbstractC5056a.this.f37858f = b12;
        c0715a.f37862b = i11;
        b12.f(c0715a);
        return b12;
    }

    public final void r() {
        C5058c c5058c = this.f37856d;
        if (c5058c != null) {
            c5058c.G();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        b0 v11 = b0.v(context, attributeSet, C6977a.f65650d, R.attr.actionModeStyle, 0);
        setBackground(v11.g(0));
        this.f37546q = v11.n(5, 0);
        this.f37547r = v11.n(4, 0);
        this.f37857e = v11.m(3, 0);
        this.f37549t = v11.n(2, R.layout.abc_action_mode_close_item_material);
        v11.x();
    }
}
