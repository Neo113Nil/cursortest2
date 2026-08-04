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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p155w1.C1017n0;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f8509A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f8510B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8511C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f8512D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f8513E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f8514F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f8515G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f8516H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f8517I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f8518J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public E0 f8519K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f8520L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f8521M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f8522N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public CharSequence f8523O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public CharSequence f8524P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f8525Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ColorStateList f8526R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f8527S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f8528T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final ArrayList f8529U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final ArrayList f8530V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int[] f8531W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f8532a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C0359o f8533a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppCompatTextView f8534b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f8535b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatTextView f8536c;
    public f1 c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f8537d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final p096n1.e f8538d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f8539e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public j1 f8540e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f8541f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C0623j f8542f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d1 f8543g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public B3.g f8544h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public C1052y0 f8545i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f8546j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OnBackInvokedCallback f8547k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public OnBackInvokedDispatcher f8548l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f8549m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final b1 f8550n0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CharSequence f8551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AppCompatImageButton f8552y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f8553z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g1();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
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
        return new p078l.j(getContext());
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
        e1 e1VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            e1VarI = h();
        } else {
            e1VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (e1) layoutParams;
        }
        e1VarI.f8618b = 1;
        if (!z4 || this.f8553z == null) {
            addView(view, e1VarI);
        } else {
            view.setLayoutParams(e1VarI);
            this.f8530V.add(view);
        }
    }

    public final void c() {
        if (this.f8552y == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f8552y = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f8541f);
            this.f8552y.setContentDescription(this.f8551x);
            e1 e1VarH = h();
            e1VarH.f8617a = (this.f8513E & 112) | 8388611;
            e1VarH.f8618b = 2;
            this.f8552y.setLayoutParams(e1VarH);
            this.f8552y.setOnClickListener(new H2.e(this, 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e1);
    }

    public final void d() {
        if (this.f8519K == null) {
            E0 e7 = new E0();
            e7.f8339a = 0;
            e7.f8340b = 0;
            e7.f8341c = Integer.MIN_VALUE;
            e7.f8342d = Integer.MIN_VALUE;
            e7.f8343e = 0;
            e7.f8344f = 0;
            e7.f8345g = false;
            e7.f8346h = false;
            this.f8519K = e7;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f8532a;
        if (actionMenuView.f8235G == null) {
            p086m.k kVar = (p086m.k) actionMenuView.getMenu();
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
            p145u1.c cVar = new p145u1.c(this, 14);
            actionMenuView2.f8240L = gVar;
            actionMenuView2.f8241M = cVar;
            e1 e1VarH = h();
            e1VarH.f8617a = (this.f8513E & 112) | 8388613;
            this.f8532a.setLayoutParams(e1VarH);
            b(this.f8532a, false);
        }
    }

    public final void g() {
        if (this.f8537d == null) {
            this.f8537d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e1 e1VarH = h();
            e1VarH.f8617a = (this.f8513E & 112) | 8388611;
            this.f8537d.setLayoutParams(e1VarH);
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
        E0 e7 = this.f8519K;
        if (e7 != null) {
            return e7.f8345g ? e7.f8339a : e7.f8340b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f8521M;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        E0 e7 = this.f8519K;
        if (e7 != null) {
            return e7.f8339a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        E0 e7 = this.f8519K;
        if (e7 != null) {
            return e7.f8340b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        E0 e7 = this.f8519K;
        if (e7 != null) {
            return e7.f8345g ? e7.f8340b : e7.f8339a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f8520L;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p086m.k kVar;
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

    public C0623j getOuterActionMenuPresenter() {
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

    public InterfaceC0610c0 getWrapper() {
        if (this.f8540e0 == null) {
            this.f8540e0 = new j1(this, true);
        }
        return this.f8540e0;
    }

    public final int j(int i7) {
        WeakHashMap weakHashMap = P.U.f5037a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
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
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin;
        if (iMax < i10) {
            iMax = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
            if (i11 < i12) {
                iMax = Math.max(0, iMax - (i12 - i11));
            }
        }
        return paddingTop + iMax;
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
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8528T = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8528T = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262  */
    /* JADX WARN: Code duplicated, block: B:101:0x0284  */
    /* JADX WARN: Code duplicated, block: B:103:0x0287  */
    /* JADX WARN: Code duplicated, block: B:104:0x028c  */
    /* JADX WARN: Code duplicated, block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0317 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x031d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x025f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        e1 e1Var;
        e1 e1Var2;
        boolean z7;
        int i11;
        int i12;
        int paddingTop;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax3;
        int i19;
        int i20;
        int i21;
        int i22;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i23;
        int i24;
        int size2;
        int i25;
        int size3;
        int i26;
        int i27;
        int i28;
        int measuredWidth;
        int i29;
        int i30;
        int size4;
        int i31;
        WeakHashMap weakHashMap = P.U.f5037a;
        boolean z8 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i32 = width - paddingRight;
        int[] iArr = this.f8531W;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i10 - i8) : 0;
        if (u(this.f8537d)) {
            if (z8) {
                iR = r(this.f8537d, i32, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(this.f8537d, paddingLeft, iMin2, iArr);
            }
            if (u(this.f8552y)) {
                if (z8) {
                    iR = r(this.f8552y, iR, iMin2, iArr);
                } else {
                    iQ = q(this.f8552y, iQ, iMin2, iArr);
                }
            }
            if (u(this.f8532a)) {
                if (z8) {
                    iQ = q(this.f8532a, iQ, iMin2, iArr);
                } else {
                    iR = r(this.f8532a, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i32 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i32 - currentContentInsetRight);
            if (u(this.f8553z)) {
                if (z8) {
                    iMin = r(this.f8553z, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f8553z, iMax, iMin2, iArr);
                }
            }
            if (u(this.f8539e)) {
                if (z8) {
                    iMin = r(this.f8539e, iMin, iMin2, iArr);
                } else {
                    iMax = q(this.f8539e, iMax, iMin2, iArr);
                }
            }
            zU = u(this.f8534b);
            zU2 = u(this.f8536c);
            if (zU) {
                e1 e1Var3 = (e1) this.f8534b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) e1Var3).bottomMargin + this.f8534b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var3).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                e1 e1Var4 = (e1) this.f8536c.getLayoutParams();
                measuredHeight += this.f8536c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var4).topMargin + ((ViewGroup.MarginLayoutParams) e1Var4).bottomMargin;
            }
            if (!zU || zU2) {
                if (zU) {
                    appCompatTextView = this.f8534b;
                } else {
                    appCompatTextView = this.f8536c;
                }
                if (zU2) {
                    appCompatTextView2 = this.f8536c;
                } else {
                    appCompatTextView2 = this.f8534b;
                }
                e1Var = (e1) appCompatTextView.getLayoutParams();
                e1Var2 = (e1) appCompatTextView2.getLayoutParams();
                z7 = (!zU && this.f8534b.getMeasuredWidth() > 0) || (zU2 && this.f8536c.getMeasuredWidth() > 0);
                i11 = this.f8522N & 112;
                i12 = iMin2;
                if (i11 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f8517I;
                } else if (i11 != 80) {
                    iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i19 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f8517I;
                    if (iMax3 < i19) {
                        iMax3 = i19;
                    } else {
                        i20 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                        i21 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
                        i22 = this.f8518J;
                        if (i20 < i21 + i22) {
                            iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin + i22) - i20));
                        }
                    }
                    paddingTop = paddingTop2 + iMax3;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin) - this.f8518J) - measuredHeight;
                }
                if (z8) {
                    if (z7) {
                        i16 = this.f8515G;
                    } else {
                        i16 = 0;
                    }
                    int i33 = i16 - iArr[1];
                    iMin -= Math.max(0, i33);
                    iArr[1] = Math.max(0, -i33);
                    if (zU) {
                        e1 e1Var5 = (e1) this.f8534b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f8534b.getMeasuredWidth();
                        int measuredHeight2 = this.f8534b.getMeasuredHeight() + paddingTop;
                        this.f8534b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i17 = measuredWidth2 - this.f8516H;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) e1Var5).bottomMargin;
                    } else {
                        i17 = iMin;
                    }
                    if (zU2) {
                        int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                        this.f8536c.layout(iMin - this.f8536c.getMeasuredWidth(), i34, iMin, this.f8536c.getMeasuredHeight() + i34);
                        i18 = iMin - this.f8516H;
                    } else {
                        i18 = iMin;
                    }
                    if (z7) {
                        iMin = Math.min(i17, i18);
                    }
                    iMax = iMax;
                } else {
                    if (z7) {
                        i13 = this.f8515G;
                    } else {
                        i13 = 0;
                    }
                    int i35 = i13 - iArr[0];
                    iMax2 = Math.max(0, i35) + iMax;
                    iArr[0] = Math.max(0, -i35);
                    if (zU) {
                        e1 e1Var6 = (e1) this.f8534b.getLayoutParams();
                        int measuredWidth3 = this.f8534b.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.f8534b.getMeasuredHeight() + paddingTop;
                        this.f8534b.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i14 = measuredWidth3 + this.f8516H;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) e1Var6).bottomMargin;
                    } else {
                        i14 = iMax2;
                    }
                    if (zU2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f8536c.getMeasuredWidth() + iMax2;
                        this.f8536c.layout(iMax2, i36, measuredWidth4, this.f8536c.getMeasuredHeight() + i36);
                        i15 = measuredWidth4 + this.f8516H;
                    } else {
                        i15 = iMax2;
                    }
                    if (z7) {
                        iMax = Math.max(i14, i15);
                    } else {
                        iMax = iMax2;
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                i12 = iMin2;
            }
            arrayList = this.f8529U;
            a(arrayList, 3);
            size = arrayList.size();
            iQ2 = iMax;
            for (i23 = 0; i23 < size; i23++) {
                iQ2 = q((View) arrayList.get(i23), iQ2, i12, iArr);
            }
            i24 = i12;
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i25 = 0; i25 < size2; i25++) {
                iMin = r((View) arrayList.get(i25), iMin, i24, iArr);
            }
            a(arrayList, 1);
            int i37 = iArr[0];
            int i38 = iArr[1];
            size3 = arrayList.size();
            i26 = i38;
            i27 = i37;
            i28 = 0;
            measuredWidth = 0;
            while (i28 < size3) {
                View view = (View) arrayList.get(i28);
                e1 e1Var7 = (e1) view.getLayoutParams();
                int i39 = ((ViewGroup.MarginLayoutParams) e1Var7).leftMargin - i27;
                int i40 = ((ViewGroup.MarginLayoutParams) e1Var7).rightMargin - i26;
                int iMax4 = Math.max(0, i39);
                int iMax5 = Math.max(0, i40);
                int iMax6 = Math.max(0, -i39);
                int iMax7 = Math.max(0, -i40);
                measuredWidth += view.getMeasuredWidth() + iMax4 + iMax5;
                i28++;
                i26 = iMax7;
                i27 = iMax6;
            }
            i29 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i30 = measuredWidth + i29;
            if (i29 >= iQ2) {
                if (i30 > iMin) {
                    iQ2 = i29 - (i30 - iMin);
                } else {
                    iQ2 = i29;
                }
            }
            size4 = arrayList.size();
            for (i31 = 0; i31 < size4; i31++) {
                iQ2 = q((View) arrayList.get(i31), iQ2, i24, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i32;
        if (u(this.f8552y)) {
            if (z8) {
                iR = r(this.f8552y, iR, iMin2, iArr);
            } else {
                iQ = q(this.f8552y, iQ, iMin2, iArr);
            }
        }
        if (u(this.f8532a)) {
            if (z8) {
                iQ = q(this.f8532a, iQ, iMin2, iArr);
            } else {
                iR = r(this.f8532a, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i32 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i32 - currentContentInsetRight2);
        if (u(this.f8553z)) {
            if (z8) {
                iMin = r(this.f8553z, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f8553z, iMax, iMin2, iArr);
            }
        }
        if (u(this.f8539e)) {
            if (z8) {
                iMin = r(this.f8539e, iMin, iMin2, iArr);
            } else {
                iMax = q(this.f8539e, iMax, iMin2, iArr);
            }
        }
        zU = u(this.f8534b);
        zU2 = u(this.f8536c);
        if (zU) {
            e1 e1Var8 = (e1) this.f8534b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) e1Var8).bottomMargin + this.f8534b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var8).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            e1 e1Var9 = (e1) this.f8536c.getLayoutParams();
            measuredHeight += this.f8536c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e1Var9).topMargin + ((ViewGroup.MarginLayoutParams) e1Var9).bottomMargin;
        }
        if (zU) {
            if (zU) {
                appCompatTextView = this.f8534b;
            } else {
                appCompatTextView = this.f8536c;
            }
            if (zU2) {
                appCompatTextView2 = this.f8536c;
            } else {
                appCompatTextView2 = this.f8534b;
            }
            e1Var = (e1) appCompatTextView.getLayoutParams();
            e1Var2 = (e1) appCompatTextView2.getLayoutParams();
            if (zU) {
            }
            i11 = this.f8522N & 112;
            i12 = iMin2;
            if (i11 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f8517I;
            } else if (i11 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i19 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f8517I;
                if (iMax3 < i19) {
                    iMax3 = i19;
                } else {
                    i20 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i21 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
                    i22 = this.f8518J;
                    if (i20 < i21 + i22) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin + i22) - i20));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin) - this.f8518J) - measuredHeight;
            }
            if (z8) {
                if (z7) {
                    i16 = this.f8515G;
                } else {
                    i16 = 0;
                }
                int i310 = i16 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zU) {
                    e1 e1Var10 = (e1) this.f8534b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f8534b.getMeasuredWidth();
                    int measuredHeight4 = this.f8534b.getMeasuredHeight() + paddingTop;
                    this.f8534b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i17 = measuredWidth5 - this.f8516H;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) e1Var10).bottomMargin;
                } else {
                    i17 = iMin;
                }
                if (zU2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                    this.f8536c.layout(iMin - this.f8536c.getMeasuredWidth(), i311, iMin, this.f8536c.getMeasuredHeight() + i311);
                    i18 = iMin - this.f8516H;
                } else {
                    i18 = iMin;
                }
                if (z7) {
                    iMin = Math.min(i17, i18);
                }
                iMax = iMax;
            } else {
                if (z7) {
                    i13 = this.f8515G;
                } else {
                    i13 = 0;
                }
                int i312 = i13 - iArr[0];
                iMax2 = Math.max(0, i312) + iMax;
                iArr[0] = Math.max(0, -i312);
                if (zU) {
                    e1 e1Var11 = (e1) this.f8534b.getLayoutParams();
                    int measuredWidth6 = this.f8534b.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.f8534b.getMeasuredHeight() + paddingTop;
                    this.f8534b.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i14 = measuredWidth6 + this.f8516H;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) e1Var11).bottomMargin;
                } else {
                    i14 = iMax2;
                }
                if (zU2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f8536c.getMeasuredWidth() + iMax2;
                    this.f8536c.layout(iMax2, i313, measuredWidth7, this.f8536c.getMeasuredHeight() + i313);
                    i15 = measuredWidth7 + this.f8516H;
                } else {
                    i15 = iMax2;
                }
                if (z7) {
                    iMax = Math.max(i14, i15);
                } else {
                    iMax = iMax2;
                }
            }
        } else {
            if (zU) {
                appCompatTextView = this.f8534b;
            } else {
                appCompatTextView = this.f8536c;
            }
            if (zU2) {
                appCompatTextView2 = this.f8536c;
            } else {
                appCompatTextView2 = this.f8534b;
            }
            e1Var = (e1) appCompatTextView.getLayoutParams();
            e1Var2 = (e1) appCompatTextView2.getLayoutParams();
            if (zU) {
            }
            i11 = this.f8522N & 112;
            i12 = iMin2;
            if (i11 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f8517I;
            } else if (i11 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i19 = ((ViewGroup.MarginLayoutParams) e1Var).topMargin + this.f8517I;
                if (iMax3 < i19) {
                    iMax3 = i19;
                } else {
                    i20 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i21 = ((ViewGroup.MarginLayoutParams) e1Var).bottomMargin;
                    i22 = this.f8518J;
                    if (i20 < i21 + i22) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin + i22) - i20));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e1Var2).bottomMargin) - this.f8518J) - measuredHeight;
            }
            if (z8) {
                if (z7) {
                    i16 = this.f8515G;
                } else {
                    i16 = 0;
                }
                int i314 = i16 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zU) {
                    e1 e1Var12 = (e1) this.f8534b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f8534b.getMeasuredWidth();
                    int measuredHeight6 = this.f8534b.getMeasuredHeight() + paddingTop;
                    this.f8534b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i17 = measuredWidth8 - this.f8516H;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) e1Var12).bottomMargin;
                } else {
                    i17 = iMin;
                }
                if (zU2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                    this.f8536c.layout(iMin - this.f8536c.getMeasuredWidth(), i315, iMin, this.f8536c.getMeasuredHeight() + i315);
                    i18 = iMin - this.f8516H;
                } else {
                    i18 = iMin;
                }
                if (z7) {
                    iMin = Math.min(i17, i18);
                }
                iMax = iMax;
            } else {
                if (z7) {
                    i13 = this.f8515G;
                } else {
                    i13 = 0;
                }
                int i316 = i13 - iArr[0];
                iMax2 = Math.max(0, i316) + iMax;
                iArr[0] = Math.max(0, -i316);
                if (zU) {
                    e1 e1Var13 = (e1) this.f8534b.getLayoutParams();
                    int measuredWidth9 = this.f8534b.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.f8534b.getMeasuredHeight() + paddingTop;
                    this.f8534b.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i14 = measuredWidth9 + this.f8516H;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) e1Var13).bottomMargin;
                } else {
                    i14 = iMax2;
                }
                if (zU2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e1) this.f8536c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f8536c.getMeasuredWidth() + iMax2;
                    this.f8536c.layout(iMax2, i317, measuredWidth10, this.f8536c.getMeasuredHeight() + i317);
                    i15 = measuredWidth10 + this.f8516H;
                } else {
                    i15 = iMax2;
                }
                if (z7) {
                    iMax = Math.max(i14, i15);
                } else {
                    iMax = iMax2;
                }
            }
        }
        arrayList = this.f8529U;
        a(arrayList, 3);
        size = arrayList.size();
        iQ2 = iMax;
        while (i23 < size) {
            iQ2 = q((View) arrayList.get(i23), iQ2, i12, iArr);
        }
        i24 = i12;
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i25 < size2) {
            iMin = r((View) arrayList.get(i25), iMin, i24, iArr);
        }
        a(arrayList, 1);
        int i318 = iArr[0];
        int i319 = iArr[1];
        size3 = arrayList.size();
        i26 = i319;
        i27 = i318;
        i28 = 0;
        measuredWidth = 0;
        while (i28 < size3) {
            View view2 = (View) arrayList.get(i28);
            e1 e1Var14 = (e1) view2.getLayoutParams();
            int i320 = ((ViewGroup.MarginLayoutParams) e1Var14).leftMargin - i27;
            int i41 = ((ViewGroup.MarginLayoutParams) e1Var14).rightMargin - i26;
            int iMax8 = Math.max(0, i320);
            int iMax9 = Math.max(0, i41);
            int iMax10 = Math.max(0, -i320);
            int iMax11 = Math.max(0, -i41);
            measuredWidth += view2.getMeasuredWidth() + iMax8 + iMax9;
            i28++;
            i26 = iMax11;
            i27 = iMax10;
        }
        i29 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i30 = measuredWidth + i29;
        if (i29 >= iQ2) {
            if (i30 > iMin) {
                iQ2 = i29 - (i30 - iMin);
            } else {
                iQ2 = i29;
            }
        }
        size4 = arrayList.size();
        while (i31 < size4) {
            iQ2 = q((View) arrayList.get(i31), iQ2, i24, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int iL;
        int iMax;
        int iCombineMeasuredStates;
        int iL2;
        int iM;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = q1.a(this);
        int i9 = !zA ? 1 : 0;
        int i10 = 0;
        if (u(this.f8537d)) {
            t(this.f8537d, i7, 0, i8, this.f8514F);
            iL = l(this.f8537d) + this.f8537d.getMeasuredWidth();
            iMax = Math.max(0, m(this.f8537d) + this.f8537d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f8537d.getMeasuredState());
        } else {
            iL = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.f8552y)) {
            t(this.f8552y, i7, 0, i8, this.f8514F);
            iL = l(this.f8552y) + this.f8552y.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f8552y) + this.f8552y.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8552y.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iL);
        int iMax4 = Math.max(0, currentContentInsetStart - iL);
        int[] iArr = this.f8531W;
        iArr[zA ? 1 : 0] = iMax4;
        if (u(this.f8532a)) {
            t(this.f8532a, i7, iMax3, i8, this.f8514F);
            iL2 = l(this.f8532a) + this.f8532a.getMeasuredWidth();
            iMax = Math.max(iMax, m(this.f8532a) + this.f8532a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8532a.getMeasuredState());
        } else {
            iL2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iL2);
        iArr[i9] = Math.max(0, currentContentInsetEnd - iL2);
        if (u(this.f8553z)) {
            iMax5 += s(this.f8553z, i7, iMax5, i8, 0, iArr);
            iMax = Math.max(iMax, m(this.f8553z) + this.f8553z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8553z.getMeasuredState());
        }
        if (u(this.f8539e)) {
            iMax5 += s(this.f8539e, i7, iMax5, i8, 0, iArr);
            iMax = Math.max(iMax, m(this.f8539e) + this.f8539e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f8539e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e1) childAt.getLayoutParams()).f8618b == 0 && u(childAt)) {
                iMax5 += s(childAt, i7, iMax5, i8, 0, iArr);
                iMax = Math.max(iMax, m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i12 = this.f8517I + this.f8518J;
        int i13 = this.f8515G + this.f8516H;
        if (u(this.f8534b)) {
            s(this.f8534b, i7, iMax5 + i13, i8, i12, iArr);
            int iL3 = l(this.f8534b) + this.f8534b.getMeasuredWidth();
            iM = m(this.f8534b) + this.f8534b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f8534b.getMeasuredState());
            iMax2 = iL3;
        } else {
            iM = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.f8536c)) {
            iMax2 = Math.max(iMax2, s(this.f8536c, i7, iMax5 + i13, i8, iM + i12, iArr));
            iM += m(this.f8536c) + this.f8536c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f8536c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16);
        if (!this.f8546j0) {
            i10 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i10 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f9102a);
        ActionMenuView actionMenuView = this.f8532a;
        p086m.k kVar = actionMenuView != null ? actionMenuView.f8235G : null;
        int i7 = savedState.f8554c;
        if (i7 != 0 && this.f8543g0 != null && kVar != null && (menuItemFindItem = kVar.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
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
        E0 e7 = this.f8519K;
        boolean z4 = i7 == 1;
        if (z4 == e7.f8345g) {
            return;
        }
        e7.f8345g = z4;
        if (!e7.f8346h) {
            e7.f8339a = e7.f8343e;
            e7.f8340b = e7.f8344f;
            return;
        }
        if (z4) {
            int i8 = e7.f8342d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = e7.f8343e;
            }
            e7.f8339a = i8;
            int i9 = e7.f8341c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = e7.f8344f;
            }
            e7.f8340b = i9;
            return;
        }
        int i10 = e7.f8341c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = e7.f8343e;
        }
        e7.f8339a = i10;
        int i11 = e7.f8342d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = e7.f8344f;
        }
        e7.f8340b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p086m.m mVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d1 d1Var = this.f8543g0;
        if (d1Var != null && (mVar = d1Var.f8613b) != null) {
            savedState.f8554c = mVar.f15176a;
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
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8527S = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8527S = false;
        }
        return true;
    }

    public final boolean p() {
        C0623j c0623j;
        ActionMenuView actionMenuView = this.f8532a;
        return (actionMenuView == null || (c0623j = actionMenuView.f8239K) == null || !c0623j.k()) ? false : true;
    }

    public final int q(View view, int i7, int i8, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) e1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i9) + i7;
        iArr[0] = Math.max(0, -i9);
        int iK = k(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iK, iMax + measuredWidth, view.getMeasuredHeight() + iK);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).rightMargin + iMax;
    }

    public final int r(View view, int i7, int i8, int[] iArr) {
        e1 e1Var = (e1) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) e1Var).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int iK = k(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iK, iMax, view.getMeasuredHeight() + iK);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) e1Var).leftMargin);
    }

    public final int s(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + iMax + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
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
        setCollapseIcon(p097n3.a.w(getContext(), i7));
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
        setLogo(p097n3.a.w(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(p097n3.a.w(getContext(), i7));
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
        C0623j c0623j;
        ActionMenuView actionMenuView = this.f8532a;
        return (actionMenuView == null || (c0623j = actionMenuView.f8239K) == null || !c0623j.l()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void w() {
        boolean z4;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c1.a(this);
            d1 d1Var = this.f8543g0;
            if (d1Var == null || d1Var.f8613b == null || onBackInvokedDispatcherA == null) {
                z4 = false;
            } else {
                WeakHashMap weakHashMap = P.U.f5037a;
                if (isAttachedToWindow() && this.f8549m0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 && this.f8548l0 == null) {
                if (this.f8547k0 == null) {
                    this.f8547k0 = c1.b(new a1(this, i7));
                }
                c1.c(onBackInvokedDispatcherA, this.f8547k0);
                this.f8548l0 = onBackInvokedDispatcherA;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.f8548l0) == null) {
                return;
            }
            c1.d(onBackInvokedDispatcher, this.f8547k0);
            this.f8548l0 = null;
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
        this.f8538d0 = new p096n1.e(this, 10);
        this.f8550n0 = new b1(this, 0);
        Context context2 = getContext();
        int[] iArr = p051h.a.f13353z;
        C1017n0 c1017n0F = C1017n0.F(context2, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
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
        E0 e7 = this.f8519K;
        e7.f8346h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            e7.f8343e = dimensionPixelSize;
            e7.f8339a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            e7.f8344f = dimensionPixelSize2;
            e7.f8340b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            e7.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f8520L = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f8521M = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f8541f = c1017n0F.u(4);
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
        Drawable drawableU = c1017n0F.u(16);
        if (drawableU != null) {
            setNavigationIcon(drawableU);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableU2 = c1017n0F.u(11);
        if (drawableU2 != null) {
            setLogo(drawableU2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c1017n0F.q(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c1017n0F.q(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c1017n0F.H();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e1 e1Var = new e1(context, attributeSet);
        e1Var.f8617a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p051h.a.f13330b);
        e1Var.f8617a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
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
