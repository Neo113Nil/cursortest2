package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C5344u;
import androidx.core.view.InterfaceC5348w;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;
import j.C7232a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.r {
    private static final String TAG = "Toolbar";
    private m.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private V mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    g.a mMenuBuilderCallback;
    final C5344u mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private C5058c mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private f0 mWrapper;

    final class a implements ActionMenuView.e {
        a() {
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* loaded from: classes8.dex */
    final class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final void a(@NonNull androidx.appcompat.view.menu.g gVar) {
            Toolbar toolbar = Toolbar.this;
            if (!toolbar.mMenuView.p()) {
                toolbar.mMenuHostHelper.h(gVar);
            }
            g.a aVar = toolbar.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
            g.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.b(gVar, iVar);
        }
    }

    /* loaded from: classes8.dex */
    final class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    /* loaded from: classes8.dex */
    static class e {
        static OnBackInvokedDispatcher a(@NonNull View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @NonNull
        static OnBackInvokedCallback b(@NonNull final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.d0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(@NonNull Object obj, @NonNull Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes8.dex */
    private class f implements androidx.appcompat.view.menu.m {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.g f37823a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.i f37824b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public final void b(androidx.appcompat.view.menu.g gVar, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.m
        public final Parcelable c() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean d(androidx.appcompat.view.menu.i iVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.ensureCollapseButtonView();
            ViewParent parent = toolbar.mCollapseButtonView.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            View actionView = iVar.getActionView();
            toolbar.mExpandedActionView = actionView;
            this.f37824b = iVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
                }
                g generateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f37109a = (toolbar.mButtonGravity & 112) | 8388611;
                generateDefaultLayoutParams.f37826b = 2;
                toolbar.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                toolbar.addView(toolbar.mExpandedActionView);
            }
            toolbar.removeChildrenForExpandedActionView();
            toolbar.requestLayout();
            iVar.o(true);
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).d();
            }
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public final void e(boolean z11) {
            if (this.f37824b != null) {
                androidx.appcompat.view.menu.g gVar = this.f37823a;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.f37823a.getItem(i11) == this.f37824b) {
                            return;
                        }
                    }
                }
                j(this.f37824b);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean f() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public final void g(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f37823a;
            if (gVar2 != null && (iVar = this.f37824b) != null) {
                gVar2.f(iVar);
            }
            this.f37823a = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean j(androidx.appcompat.view.menu.i iVar) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).b();
            }
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar.mExpandedActionView = null;
            toolbar.addChildrenForExpandedActionView();
            this.f37824b = null;
            toolbar.requestLayout();
            iVar.o(false);
            toolbar.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public final void k(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.m
        public final boolean l(androidx.appcompat.view.menu.q qVar) {
            return false;
        }
    }

    public static class g extends AbstractC5051a.C0712a {

        /* renamed from: b, reason: collision with root package name */
        int f37826b;

        public g(int i11, int i12) {
            super(i11, i12);
            this.f37826b = 0;
            this.f37109a = 8388627;
        }
    }

    /* loaded from: classes8.dex */
    public interface h {
        boolean a(androidx.appcompat.view.menu.i iVar);
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i11) {
        boolean z11 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
        list.clear();
        if (!z11) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f37826b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(gVar.f37109a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f37826b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(gVar2.f37109a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f37826b = 1;
        if (!z11 || this.mExpandedActionView == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new V();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.r() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.mMenuView.k();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.s();
            gVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.x(this.mPopupTheme);
            this.mMenuView.u(this.mMenuViewItemClickListener);
            this.mMenuView.t(this.mActionMenuPresenterCallback, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f37109a = (this.mButtonGravity & 112) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f37109a = (this.mButtonGravity & 112) | 8388611;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i11) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i11) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = i11 > 0 ? (measuredHeight - i11) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(gVar.f37109a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i12;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i12;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    private int getChildVerticalGravity(int i11) {
        int i12 = i11 & 112;
        return (i12 == 16 || i12 == 48 || i12 == 80) ? i12 : this.mGravity & 112;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i11 = 0; i11 < menu.size(); i11++) {
            arrayList.add(menu.getItem(i11));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            View view = list.get(i13);
            g gVar = (g) view.getLayoutParams();
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i11;
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i12;
            int max = Math.max(0, i15);
            int max2 = Math.max(0, i16);
            int max3 = Math.max(0, -i15);
            int max4 = Math.max(0, -i16);
            i14 += view.getMeasuredWidth() + max + max2;
            i13++;
            i12 = max4;
            i11 = max3;
        }
        return i14;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int layoutChildLeft(View view, int i11, int[] iArr, int i12) {
        g gVar = (g) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i13) + i11;
        iArr[0] = Math.max(0, -i13);
        int childTop = getChildTop(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    private int layoutChildRight(View view, int i11, int[] iArr, int i12) {
        g gVar = (g) view.getLayoutParams();
        int i13 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i11 - Math.max(0, i13);
        iArr[1] = Math.max(0, -i13);
        int childTop = getChildTop(view, i12);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i11, int i12, int i13, int i14, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i15 = marginLayoutParams.leftMargin - iArr[0];
        int i16 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i16) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i15);
        iArr[1] = Math.max(0, -i16);
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + max + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i11, int i12, int i13, int i14, int i15) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i13, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i15 >= 0) {
            if (mode != 0) {
                i15 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i15);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.e(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.r
    public void addMenuProvider(@NonNull InterfaceC5348w interfaceC5348w) {
        this.mMenuHostHelper.b(interfaceC5348w);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.q();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f37824b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f37109a = (this.mButtonGravity & 112) | 8388611;
            generateDefaultLayoutParams.f37826b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        V v11 = this.mContentInsets;
        if (v11 != null) {
            return v11.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i11 = this.mContentInsetEndWithActions;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        V v11 = this.mContentInsets;
        if (v11 != null) {
            return v11.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        V v11 = this.mContentInsets;
        if (v11 != null) {
            return v11.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        V v11 = this.mContentInsets;
        if (v11 != null) {
            return v11.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i11 = this.mContentInsetStartWithNavigation;
        return i11 != Integer.MIN_VALUE ? i11 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g r11;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (r11 = actionMenuView.r()) == null || !r11.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.k();
    }

    View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C5058c getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.l();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public F getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new f0(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f37824b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.n();
    }

    public void inflateMenu(int i11) {
        getMenuInflater().inflate(i11, getMenu());
    }

    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.p();
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (layout.getEllipsisCount(i11) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029a A[LOOP:0: B:40:0x0298->B:41:0x029a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ef A[LOOP:2: B:53:0x02ed->B:54:0x02ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int max;
        boolean shouldLayout;
        boolean shouldLayout2;
        boolean z12;
        int i17;
        int i18;
        int paddingTop;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int size;
        int i25;
        int i26;
        int size2;
        int i27;
        int i28;
        int size3;
        boolean z13 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i29 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int i31 = androidx.core.view.Y.f42258g;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i14 - i12) : 0;
        if (!shouldLayout(this.mNavButtonView)) {
            i15 = paddingLeft;
        } else {
            if (z13) {
                i16 = layoutChildRight(this.mNavButtonView, i29, iArr, min);
                i15 = paddingLeft;
                if (shouldLayout(this.mCollapseButtonView)) {
                    if (z13) {
                        i16 = layoutChildRight(this.mCollapseButtonView, i16, iArr, min);
                    } else {
                        i15 = layoutChildLeft(this.mCollapseButtonView, i15, iArr, min);
                    }
                }
                if (shouldLayout(this.mMenuView)) {
                    if (z13) {
                        i15 = layoutChildLeft(this.mMenuView, i15, iArr, min);
                    } else {
                        i16 = layoutChildRight(this.mMenuView, i16, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i15);
                iArr[1] = Math.max(0, currentContentInsetRight - (i29 - i16));
                max = Math.max(i15, currentContentInsetLeft);
                int min2 = Math.min(i16, i29 - currentContentInsetRight);
                if (shouldLayout(this.mExpandedActionView)) {
                    if (z13) {
                        min2 = layoutChildRight(this.mExpandedActionView, min2, iArr, min);
                    } else {
                        max = layoutChildLeft(this.mExpandedActionView, max, iArr, min);
                    }
                }
                if (shouldLayout(this.mLogoView)) {
                    if (z13) {
                        min2 = layoutChildRight(this.mLogoView, min2, iArr, min);
                    } else {
                        max = layoutChildLeft(this.mLogoView, max, iArr, min);
                    }
                }
                shouldLayout = shouldLayout(this.mTitleTextView);
                shouldLayout2 = shouldLayout(this.mSubtitleTextView);
                if (shouldLayout) {
                    z12 = z13;
                    i17 = 0;
                } else {
                    g gVar = (g) this.mTitleTextView.getLayoutParams();
                    z12 = z13;
                    i17 = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                }
                if (!shouldLayout2) {
                    g gVar2 = (g) this.mSubtitleTextView.getLayoutParams();
                    i17 = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i17;
                }
                if (!shouldLayout || shouldLayout2) {
                    TextView textView = !shouldLayout ? this.mTitleTextView : this.mSubtitleTextView;
                    TextView textView2 = !shouldLayout2 ? this.mSubtitleTextView : this.mTitleTextView;
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    int i32 = i17;
                    boolean z14 = (!shouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (shouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                    i18 = this.mGravity & 112;
                    int i33 = max;
                    if (i18 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.mTitleMarginTop;
                    } else if (i18 != 80) {
                        int i34 = (((height - paddingTop2) - paddingBottom) - i32) / 2;
                        int i35 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                        int i36 = this.mTitleMarginTop;
                        if (i34 < i35 + i36) {
                            i34 = i35 + i36;
                        } else {
                            int i37 = (((height - paddingBottom) - i32) - i34) - paddingTop2;
                            int i38 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i39 = this.mTitleMarginBottom;
                            if (i37 < i38 + i39) {
                                i34 = Math.max(0, i34 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i39) - i37));
                            }
                        }
                        paddingTop = paddingTop2 + i34;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.mTitleMarginBottom) - i32;
                    }
                    if (z12) {
                        i19 = 0;
                        int i41 = (z14 ? this.mTitleMarginStart : 0) - iArr[0];
                        max = Math.max(0, i41) + i33;
                        iArr[0] = Math.max(0, -i41);
                        if (shouldLayout) {
                            g gVar5 = (g) this.mTitleTextView.getLayoutParams();
                            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + max;
                            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                            this.mTitleTextView.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i21 = measuredWidth + this.mTitleMarginEnd;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i21 = max;
                        }
                        if (shouldLayout2) {
                            int i42 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.mSubtitleTextView.getMeasuredWidth() + max;
                            this.mSubtitleTextView.layout(max, i42, measuredWidth2, this.mSubtitleTextView.getMeasuredHeight() + i42);
                            i22 = measuredWidth2 + this.mTitleMarginEnd;
                        } else {
                            i22 = max;
                        }
                        if (z14) {
                            max = Math.max(i21, i22);
                        }
                        addCustomViewsWithGravity(this.mTempViews, 3);
                        size = this.mTempViews.size();
                        i25 = max;
                        for (i26 = i19; i26 < size; i26++) {
                            i25 = layoutChildLeft(this.mTempViews.get(i26), i25, iArr, min);
                        }
                        addCustomViewsWithGravity(this.mTempViews, 5);
                        size2 = this.mTempViews.size();
                        for (i27 = i19; i27 < size2; i27++) {
                            min2 = layoutChildRight(this.mTempViews.get(i27), min2, iArr, min);
                        }
                        addCustomViewsWithGravity(this.mTempViews, 1);
                        int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
                        i28 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (viewListMeasuredWidth / 2);
                        int i43 = viewListMeasuredWidth + i28;
                        if (i28 >= i25) {
                            i25 = i43 > min2 ? i28 - (i43 - min2) : i28;
                        }
                        size3 = this.mTempViews.size();
                        while (i19 < size3) {
                            i25 = layoutChildLeft(this.mTempViews.get(i19), i25, iArr, min);
                            i19++;
                        }
                        this.mTempViews.clear();
                        return;
                    }
                    int i44 = (z14 ? this.mTitleMarginStart : 0) - iArr[1];
                    min2 -= Math.max(0, i44);
                    iArr[1] = Math.max(0, -i44);
                    if (shouldLayout) {
                        g gVar6 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth3 = min2 - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i23 = measuredWidth3 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i23 = min2;
                    }
                    if (shouldLayout2) {
                        int i45 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(min2 - this.mSubtitleTextView.getMeasuredWidth(), i45, min2, this.mSubtitleTextView.getMeasuredHeight() + i45);
                        i24 = min2 - this.mTitleMarginEnd;
                    } else {
                        i24 = min2;
                    }
                    if (z14) {
                        min2 = Math.min(i23, i24);
                    }
                    max = i33;
                }
                i19 = 0;
                addCustomViewsWithGravity(this.mTempViews, 3);
                size = this.mTempViews.size();
                i25 = max;
                while (i26 < size) {
                }
                addCustomViewsWithGravity(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                while (i27 < size2) {
                }
                addCustomViewsWithGravity(this.mTempViews, 1);
                int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
                i28 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (viewListMeasuredWidth2 / 2);
                int i432 = viewListMeasuredWidth2 + i28;
                if (i28 >= i25) {
                }
                size3 = this.mTempViews.size();
                while (i19 < size3) {
                }
                this.mTempViews.clear();
                return;
            }
            i15 = layoutChildLeft(this.mNavButtonView, paddingLeft, iArr, min);
        }
        i16 = i29;
        if (shouldLayout(this.mCollapseButtonView)) {
        }
        if (shouldLayout(this.mMenuView)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i15);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i29 - i16));
        max = Math.max(i15, currentContentInsetLeft2);
        int min22 = Math.min(i16, i29 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
        }
        if (shouldLayout(this.mLogoView)) {
        }
        shouldLayout = shouldLayout(this.mTitleTextView);
        shouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (shouldLayout) {
        }
        if (!shouldLayout2) {
        }
        if (!shouldLayout) {
        }
        if (!shouldLayout) {
        }
        if (!shouldLayout2) {
        }
        g gVar32 = (g) textView.getLayoutParams();
        g gVar42 = (g) textView2.getLayoutParams();
        int i322 = i17;
        if (shouldLayout) {
        }
        i18 = this.mGravity & 112;
        int i332 = max;
        if (i18 != 48) {
        }
        if (z12) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        char c11;
        char c12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        int[] iArr2 = this.mTempMargins;
        int i19 = i0.f37951d;
        if (getLayoutDirection() == 1) {
            c12 = 1;
            c11 = 0;
        } else {
            c11 = 1;
            c12 = 0;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i11, 0, i12, 0, this.mMaxButtonHeight);
            i13 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i14 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i15 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i11, 0, i12, 0, this.mMaxButtonHeight);
            i13 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i14 = Math.max(i14, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i15 = View.combineMeasuredStates(i15, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i13);
        iArr2[c12] = Math.max(0, currentContentInsetStart - i13);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i11, max, i12, 0, this.mMaxButtonHeight);
            i16 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i14 = Math.max(i14, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i15 = View.combineMeasuredStates(i15, this.mMenuView.getMeasuredState());
        } else {
            i16 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i16);
        iArr2[c11] = Math.max(0, currentContentInsetEnd - i16);
        if (shouldLayout(this.mExpandedActionView)) {
            iArr = iArr2;
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i15 = View.combineMeasuredStates(i15, this.mExpandedActionView.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i11, max2, i12, 0, iArr);
            i14 = Math.max(i14, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i15 = View.combineMeasuredStates(i15, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((g) childAt.getLayoutParams()).f37826b == 0 && shouldLayout(childAt)) {
                max2 += measureChildCollapseMargins(childAt, i11, max2, i12, 0, iArr);
                int max3 = Math.max(i14, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i15 = View.combineMeasuredStates(i15, childAt.getMeasuredState());
                i14 = max3;
            } else {
                max2 = max2;
            }
        }
        int i22 = max2;
        int i23 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i24 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i11, i22 + i24, i12, i23, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            int measuredHeight = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i15 = View.combineMeasuredStates(i15, this.mTitleTextView.getMeasuredState());
            i17 = measuredWidth;
            i18 = measuredHeight;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i17 = Math.max(i17, measureChildCollapseMargins(this.mSubtitleTextView, i11, i22 + i24, i12, i23 + i18, iArr));
            i18 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i15 = View.combineMeasuredStates(i15, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i22 + i17, getSuggestedMinimumWidth()), i11, (-16777216) & i15), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(i14, i18), getSuggestedMinimumHeight()), i12, i15 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.g r11 = actionMenuView != null ? actionMenuView.r() : null;
        int i11 = iVar.f37827c;
        if (i11 != 0 && this.mExpandedMenuPresenter != null && r11 != null && (findItem = r11.findItem(i11)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f37828d) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        ensureContentInsets();
        this.mContentInsets.f(i11 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (iVar = fVar.f37824b) != null) {
            iVar2.f37827c = iVar.getItemId();
        }
        iVar2.f37828d = isOverflowMenuShowing();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f37826b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.r
    public void removeMenuProvider(@NonNull InterfaceC5348w interfaceC5348w) {
        this.mMenuHostHelper.i(interfaceC5348w);
    }

    public void setBackInvokedCallbackEnabled(boolean z11) {
        if (this.mBackInvokedCallbackEnabled != z11) {
            this.mBackInvokedCallbackEnabled = z11;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i11) {
        setCollapseContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setCollapseIcon(int i11) {
        setCollapseIcon(C7232a.a(getContext(), i11));
    }

    public void setCollapsible(boolean z11) {
        this.mCollapsible = z11;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i11) {
        if (i11 < 0) {
            i11 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i11 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i11) {
        if (i11 < 0) {
            i11 = LinearLayoutManager.INVALID_OFFSET;
        }
        if (i11 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i11;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i11, int i12) {
        ensureContentInsets();
        this.mContentInsets.e(i11, i12);
    }

    public void setContentInsetsRelative(int i11, int i12) {
        ensureContentInsets();
        this.mContentInsets.g(i11, i12);
    }

    public void setLogo(int i11) {
        setLogo(C7232a.a(getContext(), i11));
    }

    public void setLogoDescription(int i11) {
        setLogoDescription(getContext().getText(i11));
    }

    public void setMenu(androidx.appcompat.view.menu.g gVar, C5058c c5058c) {
        if (gVar == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.g r11 = this.mMenuView.r();
        if (r11 == gVar) {
            return;
        }
        if (r11 != null) {
            r11.A(this.mOuterActionMenuPresenter);
            r11.A(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        c5058c.C();
        if (gVar != null) {
            gVar.c(c5058c, this.mPopupContext);
            gVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c5058c.g(this.mPopupContext, null);
            this.mExpandedMenuPresenter.g(this.mPopupContext, null);
            c5058c.e(true);
            this.mExpandedMenuPresenter.e(true);
        }
        this.mMenuView.x(this.mPopupTheme);
        this.mMenuView.y(c5058c);
        this.mOuterActionMenuPresenter = c5058c;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(m.a aVar, g.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.t(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i11) {
        setNavigationContentDescription(i11 != 0 ? getContext().getText(i11) : null);
    }

    public void setNavigationIcon(int i11) {
        setNavigationIcon(C7232a.a(getContext(), i11));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.v(drawable);
    }

    public void setPopupTheme(int i11) {
        if (this.mPopupTheme != i11) {
            this.mPopupTheme = i11;
            if (i11 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setSubtitle(int i11) {
        setSubtitle(getContext().getText(i11));
    }

    public void setSubtitleTextAppearance(Context context, int i11) {
        this.mSubtitleTextAppearance = i11;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    public void setSubtitleTextColor(int i11) {
        setSubtitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setTitle(int i11) {
        setTitle(getContext().getText(i11));
    }

    public void setTitleMargin(int i11, int i12, int i13, int i14) {
        this.mTitleMarginStart = i11;
        this.mTitleMarginTop = i12;
        this.mTitleMarginEnd = i13;
        this.mTitleMarginBottom = i14;
        requestLayout();
    }

    public void setTitleMarginBottom(int i11) {
        this.mTitleMarginBottom = i11;
        requestLayout();
    }

    public void setTitleMarginEnd(int i11) {
        this.mTitleMarginEnd = i11;
        requestLayout();
    }

    public void setTitleMarginStart(int i11) {
        this.mTitleMarginStart = i11;
        requestLayout();
    }

    public void setTitleMarginTop(int i11) {
        this.mTitleMarginTop = i11;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i11) {
        this.mTitleTextAppearance = i11;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i11);
        }
    }

    public void setTitleTextColor(int i11) {
        setTitleTextColor(ColorStateList.valueOf(i11));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.z();
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a11 = e.a(this);
            boolean z11 = hasExpandedActionView() && a11 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z11 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new Hn.a(this, 1));
                }
                e.c(a11, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = a11;
                return;
            }
            if (z11 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public void addMenuProvider(@NonNull InterfaceC5348w interfaceC5348w, @NonNull androidx.lifecycle.J j11) {
        this.mMenuHostHelper.c(interfaceC5348w, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            g0.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.mSubtitleTextAppearance;
                if (i11 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i11 = this.mTitleTextAppearance;
                if (i11 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i11);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends O2.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f37827c;

        /* renamed from: d, reason: collision with root package name */
        boolean f37828d;

        final class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new i[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f37827c = parcel.readInt();
            this.f37828d = parcel.readInt() != 0;
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f37827c);
            parcel.writeInt(this.f37828d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C5344u(new Runnable() { // from class: androidx.appcompat.widget.c0
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        Context context2 = getContext();
        int[] iArr = C6977a.f65671y;
        b0 v11 = b0.v(context2, attributeSet, iArr, i11, 0);
        androidx.core.view.Y.B(this, context, iArr, attributeSet, v11.r(), i11);
        this.mTitleTextAppearance = v11.n(28, 0);
        this.mSubtitleTextAppearance = v11.n(19, 0);
        this.mGravity = v11.l(0, this.mGravity);
        this.mButtonGravity = v11.l(2, 48);
        int e11 = v11.e(22, 0);
        e11 = v11.s(27) ? v11.e(27, e11) : e11;
        this.mTitleMarginBottom = e11;
        this.mTitleMarginTop = e11;
        this.mTitleMarginEnd = e11;
        this.mTitleMarginStart = e11;
        int e12 = v11.e(25, -1);
        if (e12 >= 0) {
            this.mTitleMarginStart = e12;
        }
        int e13 = v11.e(24, -1);
        if (e13 >= 0) {
            this.mTitleMarginEnd = e13;
        }
        int e14 = v11.e(26, -1);
        if (e14 >= 0) {
            this.mTitleMarginTop = e14;
        }
        int e15 = v11.e(23, -1);
        if (e15 >= 0) {
            this.mTitleMarginBottom = e15;
        }
        this.mMaxButtonHeight = v11.f(13, -1);
        int e16 = v11.e(9, LinearLayoutManager.INVALID_OFFSET);
        int e17 = v11.e(5, LinearLayoutManager.INVALID_OFFSET);
        int f7 = v11.f(7, 0);
        int f11 = v11.f(8, 0);
        ensureContentInsets();
        this.mContentInsets.e(f7, f11);
        if (e16 != Integer.MIN_VALUE || e17 != Integer.MIN_VALUE) {
            this.mContentInsets.g(e16, e17);
        }
        this.mContentInsetStartWithNavigation = v11.e(10, LinearLayoutManager.INVALID_OFFSET);
        this.mContentInsetEndWithActions = v11.e(6, LinearLayoutManager.INVALID_OFFSET);
        this.mCollapseIcon = v11.g(4);
        this.mCollapseDescription = v11.p(3);
        CharSequence p11 = v11.p(21);
        if (!TextUtils.isEmpty(p11)) {
            setTitle(p11);
        }
        CharSequence p12 = v11.p(18);
        if (!TextUtils.isEmpty(p12)) {
            setSubtitle(p12);
        }
        this.mPopupContext = getContext();
        setPopupTheme(v11.n(17, 0));
        Drawable g10 = v11.g(16);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p13 = v11.p(15);
        if (!TextUtils.isEmpty(p13)) {
            setNavigationContentDescription(p13);
        }
        Drawable g11 = v11.g(11);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p14 = v11.p(12);
        if (!TextUtils.isEmpty(p14)) {
            setLogoDescription(p14);
        }
        if (v11.s(29)) {
            setTitleTextColor(v11.c(29));
        }
        if (v11.s(20)) {
            setSubtitleTextColor(v11.c(20));
        }
        if (v11.s(14)) {
            inflateMenu(v11.n(14, 0));
        }
        v11.x();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull InterfaceC5348w interfaceC5348w, @NonNull androidx.lifecycle.J j11, @NonNull AbstractC5434v.b bVar) {
        this.mMenuHostHelper.d(interfaceC5348w, j11, bVar);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.f37109a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6977a.f65648b);
        gVar.f37109a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        gVar.f37826b = 0;
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            g gVar = (g) layoutParams;
            g gVar2 = new g(gVar);
            gVar2.f37826b = 0;
            gVar2.f37826b = gVar.f37826b;
            return gVar2;
        }
        if (layoutParams instanceof AbstractC5051a.C0712a) {
            g gVar3 = new g((AbstractC5051a.C0712a) layoutParams);
            gVar3.f37826b = 0;
            return gVar3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            g gVar4 = new g(marginLayoutParams);
            gVar4.f37826b = 0;
            ((ViewGroup.MarginLayoutParams) gVar4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) gVar4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) gVar4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin = marginLayoutParams.bottomMargin;
            return gVar4;
        }
        g gVar5 = new g(layoutParams);
        gVar5.f37826b = 0;
        return gVar5;
    }
}
