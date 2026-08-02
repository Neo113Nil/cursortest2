package androidx.appcompat.widget;

import P.C0359o;
import P.InterfaceC0361q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import h.AbstractC1174a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l.C1372j;
import n1.C1450e;
import n3.AbstractC1464a;
import w1.C1726n0;
import w1.C1761y0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public Context f8509A;

    /* renamed from: B, reason: collision with root package name */
    public int f8510B;

    /* renamed from: C, reason: collision with root package name */
    public int f8511C;

    /* renamed from: D, reason: collision with root package name */
    public int f8512D;

    /* renamed from: E, reason: collision with root package name */
    public final int f8513E;

    /* renamed from: F, reason: collision with root package name */
    public final int f8514F;

    /* renamed from: G, reason: collision with root package name */
    public int f8515G;

    /* renamed from: H, reason: collision with root package name */
    public int f8516H;

    /* renamed from: I, reason: collision with root package name */
    public int f8517I;

    /* renamed from: J, reason: collision with root package name */
    public int f8518J;

    /* renamed from: K, reason: collision with root package name */
    public E0 f8519K;

    /* renamed from: L, reason: collision with root package name */
    public int f8520L;

    /* renamed from: M, reason: collision with root package name */
    public int f8521M;

    /* renamed from: N, reason: collision with root package name */
    public final int f8522N;

    /* renamed from: O, reason: collision with root package name */
    public CharSequence f8523O;

    /* renamed from: P, reason: collision with root package name */
    public CharSequence f8524P;

    /* renamed from: Q, reason: collision with root package name */
    public ColorStateList f8525Q;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f8526R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8527S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f8528T;

    /* renamed from: U, reason: collision with root package name */
    public final ArrayList f8529U;

    /* renamed from: V, reason: collision with root package name */
    public final ArrayList f8530V;

    /* renamed from: W, reason: collision with root package name */
    public final int[] f8531W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f8532a;

    /* renamed from: a0, reason: collision with root package name */
    public final C0359o f8533a0;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f8534b;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayList f8535b0;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f8536c;
    public f1 c0;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f8537d;

    /* renamed from: d0, reason: collision with root package name */
    public final C1450e f8538d0;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f8539e;

    /* renamed from: e0, reason: collision with root package name */
    public j1 f8540e0;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f8541f;

    /* renamed from: f0, reason: collision with root package name */
    public C0644j f8542f0;

    /* renamed from: g0, reason: collision with root package name */
    public d1 f8543g0;

    /* renamed from: h0, reason: collision with root package name */
    public B3.g f8544h0;

    /* renamed from: i0, reason: collision with root package name */
    public C1761y0 f8545i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f8546j0;

    /* renamed from: k0, reason: collision with root package name */
    public OnBackInvokedCallback f8547k0;

    /* renamed from: l0, reason: collision with root package name */
    public OnBackInvokedDispatcher f8548l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f8549m0;

    /* renamed from: n0, reason: collision with root package name */
    public final b1 f8550n0;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f8551x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatImageButton f8552y;

    /* renamed from: z, reason: collision with root package name */
    public View f8553z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g1();

        /* renamed from: c, reason: collision with root package name */
        public int f8554c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8555d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8554c = parcel.readInt();
            this.f8555d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f8554c);
            parcel.writeInt(this.f8555d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1372j(getContext());
    }

    public static e1 h() {
        e1 e1Var = new e1(-2, -2);
        e1Var.f8618b = 0;
        e1Var.f8617a = 8388627;
        return e1Var;
    }

    public static e1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof e1;
        if (z4) {
            e1 e1Var = (e1) layoutParams;
            e1 e1Var2 = new e1(e1Var);
            e1Var2.f8618b = 0;
            e1Var2.f8618b = e1Var.f8618b;
            return e1Var2;
        }
        if (z4) {
            e1 e1Var3 = new e1((e1) layoutParams);
            e1Var3.f8618b = 0;
            return e1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e1 e1Var4 = new e1(layoutParams);
            e1Var4.f8618b = 0;
            return e1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e1 e1Var5 = new e1(marginLayoutParams);
        e1Var5.f8618b = 0;
        ((ViewGroup.MarginLayoutParams) e1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e1Var5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i7) {
        WeakHashMap weakHashMap = P.U.f5037a;
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                e1 e1Var = (e1) childAt.getLayoutParams();
                if (e1Var.f8618b == 0 && u(childAt) && j(e1Var.f8617a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            e1 e1Var2 = (e1) childAt2.getLayoutParams();
            if (e1Var2.f8618b == 0 && u(childAt2) && j(e1Var2.f8617a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e1 h6 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (e1) layoutParams;
        h6.f8618b = 1;
        if (!z4 || this.f8553z == null) {
            addView(view, h6);
        } else {
            view.setLayoutParams(h6);
            this.f8530V.add(view);
        }
    }

    public final void c() {
        if (this.f8552y == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f8552y = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f8541f);
            this.f8552y.setContentDescription(this.f8551x);
            e1 h6 = h();
            h6.f8617a = (this.f8513E & 112) | 8388611;
            h6.f8618b = 2;
            this.f8552y.setLayoutParams(h6);
            this.f8552y.setOnClickListener(new H2.e(this, 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e1);
    }

    public final void d() {
        if (this.f8519K == null) {
            E0 e02 = new E0();
            e02.f8339a = 0;
            e02.f8340b = 0;
            e02.f8341c = Integer.MIN_VALUE;
            e02.f8342d = Integer.MIN_VALUE;
            e02.f8343e = 0;
            e02.f8344f = 0;
            e02.f8345g = false;
            e02.f8346h = false;
            this.f8519K = e02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f8532a;
        if (actionMenuView.f8235G == null) {
            m.k kVar = (m.k) actionMenuView.getMenu();
            if (this.f8543g0 == null) {
                this.f8543g0 = new d1(this);
            }
            this.f8532a.setExpandedActionViewsExclusive(true);
            kVar.b(this.f8543g0, this.f8509A);
            w();
        }
    }

    public final void f() {
        if (this.f8532a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f8532a = actionMenuView;
            actionMenuView.setPopupTheme(this.f8510B);
            this.f8532a.setOnMenuItemClickListener(this.f8538d0);
            ActionMenuView actionMenuView2 = this.f8532a;
            B3.g gVar = this.f8544h0;
            u1.c cVar = new u1.c(this, 14);
            actionMenuView2.f8240L = gVar;
            actionMenuView2.f8241M = cVar;
            e1 h6 = h();
            h6.f8617a = (this.f8513E & 112) | 8388613;
            this.f8532a.setLayoutParams(h6);
            b(this.f8532a, false);
        }
    }

    public final void g() {
        if (this.f8537d == null) {
            this.f8537d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e1 h6 = h();
            h6.f8617a = (this.f8513E & 112) | 8388611;
            this.f8537d.setLayoutParams(h6);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f8552y;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f8552y;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        E0 e02 = this.f8519K;
        if (e02 != null) {
            return e02.f8345g ? e02.f8339a : e02.f8340b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f8521M;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        E0 e02 = this.f8519K;
        if (e02 != null) {
            return e02.f8339a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        E0 e02 = this.f8519K;
        if (e02 != null) {
            return e02.f8340b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        E0 e02 = this.f8519K;
        if (e02 != null) {
            return e02.f8345g ? e02.f8340b : e02.f8339a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f8520L;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m.k kVar;
        ActionMenuView actionMenuView = this.f8532a;
        return (actionMenuView == null || (kVar = actionMenuView.f8235G) == null || !kVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f8521M, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = P.U.f5037a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = P.U.f5037a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f8520L, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f8539e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f8539e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f8532a.getMenu();
    }

    public View getNavButtonView() {
        return this.f8537d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f8537d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f8537d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public C0644j getOuterActionMenuPresenter() {
        return this.f8542f0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f8532a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f8509A;
    }

    public int getPopupTheme() {
        return this.f8510B;
    }

    public CharSequence getSubtitle() {
        return this.f8524P;
    }

    public final TextView getSubtitleTextView() {
        return this.f8536c;
    }

    public CharSequence getTitle() {
        return this.f8523O;
    }

    public int getTitleMarginBottom() {
        return this.f8518J;
    }

    public int getTitleMarginEnd() {
        return this.f8516H;
    }

    public int getTitleMarginStart() {
        return this.f8515G;
    }

    public int getTitleMarginTop() {
        return this.f8517I;
    }

    public final TextView getTitleTextView() {
        return this.f8534b;
    }

    public InterfaceC0631c0 getWrapper() {
        if (this.f8540e0 == null) {
            this.f8540e0 = new j1(this, true);
        }
        return this.f8540e0;
    }

    public final int j(int i7) {
        WeakHashMap weakHashMap = P.U.f5037a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i7) {
        e1 e1Var = (e1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i9 = e1Var.f8617a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f8522N & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i8;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    public final void n() {
        Iterator it = this.f8535b0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f8533a0.f5095b.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.I) ((InterfaceC0361q) it2.next())).f9360a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f8535b0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f8530V.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8550n0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8528T = false;
        }
        if (!this.f8528T) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8528T = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8528T = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        boolean u4;
        boolean u7;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z7;
        int i17;
        int i18;
        int i19;
        int paddingTop;
        int i20;
        int i21;
        int i22;
        int i23;
        int size;
        int i24;
        int i25;
        int size2;
        int i26;
        int size3;
        int i27;
        int i28;
        int size4;
        int i29;
        WeakHashMap weakHashMap = P.U.f5037a;
        boolean z8 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i30 = width - paddingRight;
        int[] iArr = this.f8531W;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i10 - i8) : 0;
        if (!u(this.f8537d)) {
            i11 = paddingLeft;
        } else {
            if (z8) {
                i12 = r(this.f8537d, i30, min, iArr);
                i11 = paddingLeft;
                if (u(this.f8552y)) {
                    if (z8) {
                        i12 = r(this.f8552y, i12, min, iArr);
                    } else {
                        i11 = q(this.f8552y, i11, min, iArr);
                    }
                }
                if (u(this.f8532a)) {
                    if (z8) {
                        i11 = q(this.f8532a, i11, min, iArr);
                    } else {
                        i12 = r(this.f8532a, i12, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i11);
                iArr[1] = Math.max(0, currentContentInsetRight - (i30 - i12));
                int max = Math.max(i11, currentContentInsetLeft);
                int min2 = Math.min(i12, i30 - currentContentInsetRight);
                if (u(this.f8553z)) {
                    if (z8) {
                        min2 = r(this.f8553z, min2, min, iArr);
                    } else {
                        max = q(this.f8553z, max, min, iArr);
                    }
                }
                if (u(this.f8539e)) {
                    if (z8) {
                        min2 = r(this.f8539e, min2, min, iArr);
                    } else {
                        max = q(this.f8539e, max, min, iArr);
                    }
                }
                u4 = u(this.f8534b);
                u7 = u(this.f8536c);
                if (u4) {
                    i13 = paddingRight;
                    i14 = 0;
                } else {
                    e1 e1Var = (e1) this.f8534b.getLayoutParams();
                    i13 = paddingRight;
                    i14 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin + this.f8534b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
                }
                if (u7) {
                    i15 = width;
                } else {
                    e1 e1Var2 = (e1) this.f8536c.getLayoutParams();
                    i15 = width;
                    i14 += this.f8536c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var2).topMargin + ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin;
                }
                if (!u4 || u7) {
                    AppCompatTextView appCompatTextView = !u4 ? this.f8534b : this.f8536c;
                    AppCompatTextView appCompatTextView2 = !u7 ? this.f8536c : this.f8534b;
                    e1 e1Var3 = (e1) appCompatTextView.getLayoutParams();
                    e1 e1Var4 = (e1) appCompatTextView2.getLayoutParams();
                    if ((u4 || this.f8534b.getMeasuredWidth() <= 0) && (!u7 || this.f8536c.getMeasuredWidth() <= 0)) {
                        i16 = paddingLeft;
                        z7 = false;
                    } else {
                        i16 = paddingLeft;
                        z7 = true;
                    }
                    i17 = this.f8522N & 112;
                    i18 = min;
                    if (i17 != 48) {
                        i19 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var3).topMargin + this.f8517I;
                    } else if (i17 != 80) {
                        int i31 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                        i19 = max;
                        int i32 = ((ViewGroup.MarginLayoutParams) e1Var3).topMargin + this.f8517I;
                        if (i31 < i32) {
                            i31 = i32;
                        } else {
                            int i33 = (((height - paddingBottom) - i14) - i31) - paddingTop2;
                            int i34 = ((ViewGroup.MarginLayoutParams) e1Var3).bottomMargin;
                            int i35 = this.f8518J;
                            if (i33 < i34 + i35) {
                                i31 = Math.max(0, i31 - ((((ViewGroup.MarginLayoutParams) e1Var4).bottomMargin + i35) - i33));
                            }
                        }
                        paddingTop = paddingTop2 + i31;
                    } else {
                        i19 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var4).bottomMargin) - this.f8518J) - i14;
                    }
                    if (z8) {
                        int i36 = (z7 ? this.f8515G : 0) - iArr[0];
                        int max2 = Math.max(0, i36) + i19;
                        iArr[0] = Math.max(0, -i36);
                        if (u4) {
                            e1 e1Var5 = (e1) this.f8534b.getLayoutParams();
                            int measuredWidth = this.f8534b.getMeasuredWidth() + max2;
                            int measuredHeight = this.f8534b.getMeasuredHeight() + paddingTop;
                            this.f8534b.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i20 = measuredWidth + this.f8516H;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin;
                        } else {
                            i20 = max2;
                        }
                        if (u7) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f8536c.getMeasuredWidth() + max2;
                            this.f8536c.layout(max2, i37, measuredWidth2, this.f8536c.getMeasuredHeight() + i37);
                            i21 = measuredWidth2 + this.f8516H;
                        } else {
                            i21 = max2;
                        }
                        max = z7 ? Math.max(i20, i21) : max2;
                    } else {
                        int i38 = (z7 ? this.f8515G : 0) - iArr[1];
                        min2 -= Math.max(0, i38);
                        iArr[1] = Math.max(0, -i38);
                        if (u4) {
                            e1 e1Var6 = (e1) this.f8534b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f8534b.getMeasuredWidth();
                            int measuredHeight2 = this.f8534b.getMeasuredHeight() + paddingTop;
                            this.f8534b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i22 = measuredWidth3 - this.f8516H;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) e1Var6).bottomMargin;
                        } else {
                            i22 = min2;
                        }
                        if (u7) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                            this.f8536c.layout(min2 - this.f8536c.getMeasuredWidth(), i39, min2, this.f8536c.getMeasuredHeight() + i39);
                            i23 = min2 - this.f8516H;
                        } else {
                            i23 = min2;
                        }
                        if (z7) {
                            min2 = Math.min(i22, i23);
                        }
                        max = i19;
                    }
                } else {
                    i16 = paddingLeft;
                    i18 = min;
                }
                ArrayList arrayList = this.f8529U;
                a(arrayList, 3);
                size = arrayList.size();
                i24 = max;
                for (i25 = 0; i25 < size; i25++) {
                    i24 = q((View) arrayList.get(i25), i24, i18, iArr);
                }
                int i40 = i18;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i26 = 0; i26 < size2; i26++) {
                    min2 = r((View) arrayList.get(i26), min2, i40, iArr);
                }
                a(arrayList, 1);
                int i41 = iArr[0];
                int i42 = iArr[1];
                size3 = arrayList.size();
                int i43 = i42;
                int i44 = i41;
                i27 = 0;
                int i45 = 0;
                while (i27 < size3) {
                    View view = (View) arrayList.get(i27);
                    e1 e1Var7 = (e1) view.getLayoutParams();
                    int i46 = ((ViewGroup.MarginLayoutParams) e1Var7).leftMargin - i44;
                    int i47 = ((ViewGroup.MarginLayoutParams) e1Var7).rightMargin - i43;
                    int max3 = Math.max(0, i46);
                    int max4 = Math.max(0, i47);
                    int max5 = Math.max(0, -i46);
                    int max6 = Math.max(0, -i47);
                    i45 += view.getMeasuredWidth() + max3 + max4;
                    i27++;
                    i43 = max6;
                    i44 = max5;
                }
                i28 = ((((i15 - i16) - i13) / 2) + i16) - (i45 / 2);
                int i48 = i45 + i28;
                if (i28 >= i24) {
                    i24 = i48 > min2 ? i28 - (i48 - min2) : i28;
                }
                size4 = arrayList.size();
                for (i29 = 0; i29 < size4; i29++) {
                    i24 = q((View) arrayList.get(i29), i24, i40, iArr);
                }
                arrayList.clear();
            }
            i11 = q(this.f8537d, paddingLeft, min, iArr);
        }
        i12 = i30;
        if (u(this.f8552y)) {
        }
        if (u(this.f8532a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i11);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i30 - i12));
        int max7 = Math.max(i11, currentContentInsetLeft2);
        int min22 = Math.min(i12, i30 - currentContentInsetRight2);
        if (u(this.f8553z)) {
        }
        if (u(this.f8539e)) {
        }
        u4 = u(this.f8534b);
        u7 = u(this.f8536c);
        if (u4) {
        }
        if (u7) {
        }
        if (u4) {
        }
        if (!u4) {
        }
        if (!u7) {
        }
        e1 e1Var32 = (e1) appCompatTextView.getLayoutParams();
        e1 e1Var42 = (e1) appCompatTextView2.getLayoutParams();
        if (u4) {
        }
        i16 = paddingLeft;
        z7 = false;
        i17 = this.f8522N & 112;
        i18 = min;
        if (i17 != 48) {
        }
        if (z8) {
        }
        ArrayList arrayList2 = this.f8529U;
        a(arrayList2, 3);
        size = arrayList2.size();
        i24 = max7;
        while (i25 < size) {
        }
        int i402 = i18;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i26 < size2) {
        }
        a(arrayList2, 1);
        int i412 = iArr[0];
        int i422 = iArr[1];
        size3 = arrayList2.size();
        int i432 = i422;
        int i442 = i412;
        i27 = 0;
        int i452 = 0;
        while (i27 < size3) {
        }
        i28 = ((((i15 - i16) - i13) / 2) + i16) - (i452 / 2);
        int i482 = i452 + i28;
        if (i28 >= i24) {
        }
        size4 = arrayList2.size();
        while (i29 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean a2 = q1.a(this);
        int i16 = !a2 ? 1 : 0;
        int i17 = 0;
        if (u(this.f8537d)) {
            t(this.f8537d, i7, 0, i8, this.f8514F);
            i9 = l(this.f8537d) + this.f8537d.getMeasuredWidth();
            i10 = Math.max(0, m(this.f8537d) + this.f8537d.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f8537d.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (u(this.f8552y)) {
            t(this.f8552y, i7, 0, i8, this.f8514F);
            i9 = l(this.f8552y) + this.f8552y.getMeasuredWidth();
            i10 = Math.max(i10, m(this.f8552y) + this.f8552y.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8552y.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        int[] iArr = this.f8531W;
        iArr[a2 ? 1 : 0] = max2;
        if (u(this.f8532a)) {
            t(this.f8532a, i7, max, i8, this.f8514F);
            i12 = l(this.f8532a) + this.f8532a.getMeasuredWidth();
            i10 = Math.max(i10, m(this.f8532a) + this.f8532a.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8532a.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (u(this.f8553z)) {
            max3 += s(this.f8553z, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, m(this.f8553z) + this.f8553z.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8553z.getMeasuredState());
        }
        if (u(this.f8539e)) {
            max3 += s(this.f8539e, i7, max3, i8, 0, iArr);
            i10 = Math.max(i10, m(this.f8539e) + this.f8539e.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8539e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((e1) childAt.getLayoutParams()).f8618b == 0 && u(childAt)) {
                max3 += s(childAt, i7, max3, i8, 0, iArr);
                i10 = Math.max(i10, m(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i19 = this.f8517I + this.f8518J;
        int i20 = this.f8515G + this.f8516H;
        if (u(this.f8534b)) {
            s(this.f8534b, i7, max3 + i20, i8, i19, iArr);
            int l7 = l(this.f8534b) + this.f8534b.getMeasuredWidth();
            i13 = m(this.f8534b) + this.f8534b.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f8534b.getMeasuredState());
            i15 = l7;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (u(this.f8536c)) {
            i15 = Math.max(i15, s(this.f8536c, i7, max3 + i20, i8, i13 + i19, iArr));
            i13 += m(this.f8536c) + this.f8536c.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f8536c.getMeasuredState());
        }
        int max4 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i15, getSuggestedMinimumWidth()), i7, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i14 << 16);
        if (this.f8546j0) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i17);
        }
        i17 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f9102a);
        ActionMenuView actionMenuView = this.f8532a;
        m.k kVar = actionMenuView != null ? actionMenuView.f8235G : null;
        int i7 = savedState.f8554c;
        if (i7 != 0 && this.f8543g0 != null && kVar != null && (findItem = kVar.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f8555d) {
            b1 b1Var = this.f8550n0;
            removeCallbacks(b1Var);
            post(b1Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        E0 e02 = this.f8519K;
        boolean z4 = i7 == 1;
        if (z4 == e02.f8345g) {
            return;
        }
        e02.f8345g = z4;
        if (!e02.f8346h) {
            e02.f8339a = e02.f8343e;
            e02.f8340b = e02.f8344f;
            return;
        }
        if (z4) {
            int i8 = e02.f8342d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = e02.f8343e;
            }
            e02.f8339a = i8;
            int i9 = e02.f8341c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = e02.f8344f;
            }
            e02.f8340b = i9;
            return;
        }
        int i10 = e02.f8341c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = e02.f8343e;
        }
        e02.f8339a = i10;
        int i11 = e02.f8342d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = e02.f8344f;
        }
        e02.f8340b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m.m mVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d1 d1Var = this.f8543g0;
        if (d1Var != null && (mVar = d1Var.f8613b) != null) {
            savedState.f8554c = mVar.f15170a;
        }
        savedState.f8555d = p();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8527S = false;
        }
        if (!this.f8527S) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8527S = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8527S = false;
        }
        return true;
    }

    public final boolean p() {
        C0644j c0644j;
        ActionMenuView actionMenuView = this.f8532a;
        return (actionMenuView == null || (c0644j = actionMenuView.f8239K) == null || !c0644j.k()) ? false : true;
    }

    public final int q(View view, int i7, int i8, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) e1Var).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int k7 = k(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k7, max + measuredWidth, view.getMeasuredHeight() + k7);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).rightMargin + max;
    }

    public final int r(View view, int i7, int i8, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) e1Var).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int k7 = k(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k7, max, view.getMeasuredHeight() + k7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).leftMargin);
    }

    public final int s(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f8549m0 != z4) {
            this.f8549m0 = z4;
            w();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC1464a.w(getContext(), i7));
    }

    public void setCollapsible(boolean z4) {
        this.f8546j0 = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f8521M) {
            this.f8521M = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f8520L) {
            this.f8520L = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC1464a.w(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC1464a.w(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f8537d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f1 f1Var) {
        this.c0 = f1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f8532a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f8510B != i7) {
            this.f8510B = i7;
            if (i7 == 0) {
                this.f8509A = getContext();
            } else {
                this.f8509A = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f8518J = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f8516H = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f8515G = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f8517I = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public final void t(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        C0644j c0644j;
        ActionMenuView actionMenuView = this.f8532a;
        return (actionMenuView == null || (c0644j = actionMenuView.f8239K) == null || !c0644j.l()) ? false : true;
    }

    public final void w() {
        boolean z4;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = c1.a(this);
            d1 d1Var = this.f8543g0;
            if (d1Var != null && d1Var.f8613b != null && a2 != null) {
                WeakHashMap weakHashMap = P.U.f5037a;
                if (isAttachedToWindow() && this.f8549m0) {
                    z4 = true;
                    if (!z4 && this.f8548l0 == null) {
                        if (this.f8547k0 == null) {
                            this.f8547k0 = c1.b(new a1(this, i7));
                        }
                        c1.c(a2, this.f8547k0);
                        this.f8548l0 = a2;
                        return;
                    }
                    if (!z4 || (onBackInvokedDispatcher = this.f8548l0) == null) {
                    }
                    c1.d(onBackInvokedDispatcher, this.f8547k0);
                    this.f8548l0 = null;
                    return;
                }
            }
            z4 = false;
            if (!z4) {
            }
            if (z4) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8522N = 8388627;
        this.f8529U = new ArrayList();
        this.f8530V = new ArrayList();
        this.f8531W = new int[2];
        this.f8533a0 = new C0359o(new a1(this, 1));
        this.f8535b0 = new ArrayList();
        this.f8538d0 = new C1450e(this, 10);
        this.f8550n0 = new b1(this, 0);
        Context context2 = getContext();
        int[] iArr = AbstractC1174a.f13347z;
        C1726n0 F7 = C1726n0.F(context2, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        this.f8511C = typedArray.getResourceId(28, 0);
        this.f8512D = typedArray.getResourceId(19, 0);
        this.f8522N = typedArray.getInteger(0, 8388627);
        this.f8513E = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f8518J = dimensionPixelOffset;
        this.f8517I = dimensionPixelOffset;
        this.f8516H = dimensionPixelOffset;
        this.f8515G = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f8515G = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f8516H = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f8517I = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f8518J = dimensionPixelOffset5;
        }
        this.f8514F = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        E0 e02 = this.f8519K;
        e02.f8346h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            e02.f8343e = dimensionPixelSize;
            e02.f8339a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            e02.f8344f = dimensionPixelSize2;
            e02.f8340b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            e02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f8520L = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f8521M = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f8541f = F7.u(4);
        this.f8551x = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f8509A = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable u4 = F7.u(16);
        if (u4 != null) {
            setNavigationIcon(u4);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable u7 = F7.u(11);
        if (u7 != null) {
            setLogo(u7);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(F7.q(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(F7.q(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        F7.H();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e1 e1Var = new e1(context, attributeSet);
        e1Var.f8617a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13324b);
        e1Var.f8617a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        e1Var.f8618b = 0;
        return e1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f8552y;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f8552y.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f8552y;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f8541f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f8539e == null) {
                this.f8539e = new AppCompatImageView(getContext(), null, 0);
            }
            if (!o(this.f8539e)) {
                b(this.f8539e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f8539e;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f8539e);
                this.f8530V.remove(this.f8539e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f8539e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f8539e == null) {
            this.f8539e = new AppCompatImageView(getContext(), null, 0);
        }
        AppCompatImageView appCompatImageView = this.f8539e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f8537d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            P6.b.I(this.f8537d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f8537d)) {
                b(this.f8537d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f8537d;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f8537d);
                this.f8530V.remove(this.f8537d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f8537d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f8536c;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f8536c);
                this.f8530V.remove(this.f8536c);
            }
        } else {
            if (this.f8536c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f8536c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f8536c.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f8512D;
                if (i7 != 0) {
                    this.f8536c.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f8526R;
                if (colorStateList != null) {
                    this.f8536c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f8536c)) {
                b(this.f8536c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f8536c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f8524P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f8526R = colorStateList;
        AppCompatTextView appCompatTextView = this.f8536c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f8534b;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f8534b);
                this.f8530V.remove(this.f8534b);
            }
        } else {
            if (this.f8534b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f8534b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f8534b.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f8511C;
                if (i7 != 0) {
                    this.f8534b.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f8525Q;
                if (colorStateList != null) {
                    this.f8534b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f8534b)) {
                b(this.f8534b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f8534b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f8523O = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f8525Q = colorStateList;
        AppCompatTextView appCompatTextView = this.f8534b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
