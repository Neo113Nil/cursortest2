package androidx.viewpager.widget;

import C.o0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import y2.q;

/* loaded from: classes8.dex */
public class ViewPager extends ViewGroup {
    private int mActivePointerId;
    androidx.viewpager.widget.a mAdapter;
    private List<i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private k mObserver;
    private int mOffscreenPageLimit;
    private j mOnPageChangeListener;
    private List<j> mOnPageChangeListeners;
    private int mPageMargin;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<f> COMPARATOR = new a();
    private static final Interpolator sInterpolator = new b();
    private static final n sPositionComparator = new n();

    static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return fVar.f45151b - fVar2.f45151b;
        }
    }

    static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f11 = f7 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.populate();
        }
    }

    final class d implements D {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f45148a = new Rect();

        d() {
        }

        @Override // androidx.core.view.D
        public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
            C5353y0 u11 = Y.u(view, c5353y0);
            if (u11.o()) {
                return u11;
            }
            int j11 = u11.j();
            Rect rect = this.f45148a;
            rect.left = j11;
            rect.top = u11.l();
            rect.right = u11.k();
            rect.bottom = u11.i();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                C5353y0 d11 = Y.d(viewPager.getChildAt(i11), u11);
                rect.left = Math.min(d11.j(), rect.left);
                rect.top = Math.min(d11.l(), rect.top);
                rect.right = Math.min(d11.k(), rect.right);
                rect.bottom = Math.min(d11.i(), rect.bottom);
            }
            int i12 = rect.left;
            int i13 = rect.top;
            int i14 = rect.right;
            int i15 = rect.bottom;
            C5353y0.b bVar = new C5353y0.b(u11);
            bVar.d(androidx.core.graphics.d.b(i12, i13, i14, i15));
            return bVar.a();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        Object f45150a;

        /* renamed from: b, reason: collision with root package name */
        int f45151b;

        /* renamed from: c, reason: collision with root package name */
        boolean f45152c;

        /* renamed from: d, reason: collision with root package name */
        float f45153d;

        /* renamed from: e, reason: collision with root package name */
        float f45154e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f45155a;

        /* renamed from: b, reason: collision with root package name */
        public int f45156b;

        /* renamed from: c, reason: collision with root package name */
        float f45157c;

        /* renamed from: d, reason: collision with root package name */
        boolean f45158d;

        /* renamed from: e, reason: collision with root package name */
        int f45159e;

        /* renamed from: f, reason: collision with root package name */
        int f45160f;

        public g() {
            super(-1, -1);
            this.f45157c = 0.0f;
        }
    }

    class h extends C5305a {
        h() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
        
            if (r0.getCount() > 1) goto L8;
         */
        @Override // androidx.core.view.C5305a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            androidx.viewpager.widget.a aVar2 = viewPager.mAdapter;
            boolean z11 = aVar2 != null;
            accessibilityEvent.setScrollable(z11);
            if (accessibilityEvent.getEventType() != 4096 || (aVar = viewPager.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(viewPager.mCurItem);
            accessibilityEvent.setToIndex(viewPager.mCurItem);
        }

        @Override // androidx.core.view.C5305a
        public final void onInitializeAccessibilityNodeInfo(View view, q qVar) {
            super.onInitializeAccessibilityNodeInfo(view, qVar);
            qVar.K(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            androidx.viewpager.widget.a aVar = viewPager.mAdapter;
            qVar.m0(aVar != null && aVar.getCount() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                qVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                qVar.a(8192);
            }
        }

        @Override // androidx.core.view.C5305a
        public final boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (super.performAccessibilityAction(view, i11, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i11 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i11 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem - 1);
            return true;
        }
    }

    public interface i {
        void a(@NonNull ViewPager viewPager, androidx.viewpager.widget.a aVar);
    }

    public interface j {
        void onPageScrollStateChanged(int i11);

        void onPageScrolled(int i11, float f7, int i12);

        void onPageSelected(int i11);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    public static class l extends O2.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f45163c;

        /* renamed from: d, reason: collision with root package name */
        Parcelable f45164d;

        /* renamed from: e, reason: collision with root package name */
        ClassLoader f45165e;

        static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new l[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }
        }

        public l(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return K00.b.e(this.f45163c, "}", sb2);
        }

        @Override // O2.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f45163c);
            parcel.writeParcelable(this.f45164d, i11);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
            this.f45163c = parcel.readInt();
            this.f45164d = parcel.readParcelable(classLoader);
            this.f45165e = classLoader;
        }
    }

    public static class m implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i11, float f7, int i12) {
        }
    }

    static class n implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z11 = gVar.f45155a;
            return z11 != gVar2.f45155a ? z11 ? 1 : -1 : gVar.f45159e - gVar2.f45159e;
        }
    }

    public ViewPager(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(f fVar, int i11, f fVar2) {
        int i12;
        int i13;
        f fVar3;
        f fVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f7 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i14 = fVar2.f45151b;
            int i15 = fVar.f45151b;
            if (i14 < i15) {
                float f11 = fVar2.f45154e + fVar2.f45153d + f7;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= fVar.f45151b && i17 < this.mItems.size()) {
                    f fVar5 = this.mItems.get(i17);
                    while (true) {
                        fVar4 = fVar5;
                        if (i16 <= fVar4.f45151b || i17 >= this.mItems.size() - 1) {
                            break;
                        }
                        i17++;
                        fVar5 = this.mItems.get(i17);
                    }
                    while (i16 < fVar4.f45151b) {
                        f11 += this.mAdapter.getPageWidth(i16) + f7;
                        i16++;
                    }
                    fVar4.f45154e = f11;
                    f11 += fVar4.f45153d + f7;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.mItems.size() - 1;
                float f12 = fVar2.f45154e;
                while (true) {
                    i14--;
                    if (i14 < fVar.f45151b || size < 0) {
                        break;
                    }
                    f fVar6 = this.mItems.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i14 >= fVar3.f45151b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.mItems.get(size);
                    }
                    while (i14 > fVar3.f45151b) {
                        f12 -= this.mAdapter.getPageWidth(i14) + f7;
                        i14--;
                    }
                    f12 -= fVar3.f45153d + f7;
                    fVar3.f45154e = f12;
                }
            }
        }
        int size2 = this.mItems.size();
        float f13 = fVar.f45154e;
        int i18 = fVar.f45151b;
        int i19 = i18 - 1;
        this.mFirstOffset = i18 == 0 ? f13 : -3.4028235E38f;
        int i21 = count - 1;
        this.mLastOffset = i18 == i21 ? (fVar.f45153d + f13) - 1.0f : Float.MAX_VALUE;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            f fVar7 = this.mItems.get(i22);
            while (true) {
                i13 = fVar7.f45151b;
                if (i19 <= i13) {
                    break;
                }
                f13 -= this.mAdapter.getPageWidth(i19) + f7;
                i19--;
            }
            f13 -= fVar7.f45153d + f7;
            fVar7.f45154e = f13;
            if (i13 == 0) {
                this.mFirstOffset = f13;
            }
            i22--;
            i19--;
        }
        float f14 = fVar.f45154e + fVar.f45153d + f7;
        int i23 = fVar.f45151b + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            f fVar8 = this.mItems.get(i24);
            while (true) {
                i12 = fVar8.f45151b;
                if (i23 >= i12) {
                    break;
                }
                f14 += this.mAdapter.getPageWidth(i23) + f7;
                i23++;
            }
            if (i12 == i21) {
                this.mLastOffset = (fVar8.f45153d + f14) - 1.0f;
            }
            fVar8.f45154e = f14;
            f14 += fVar8.f45153d + f7;
            i24++;
            i23++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z11) {
        boolean z12 = this.mScrollState == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            f fVar = this.mItems.get(i11);
            if (fVar.f45152c) {
                fVar.f45152c = false;
                z12 = true;
            }
        }
        if (z12) {
            if (!z11) {
                this.mEndScrollRunnable.run();
                return;
            }
            Runnable runnable = this.mEndScrollRunnable;
            int i12 = Y.f42258g;
            postOnAnimation(runnable);
        }
    }

    private int determineTargetPage(int i11, float f7, int i12, int i13) {
        if (Math.abs(i13) <= this.mFlingDistance || Math.abs(i12) <= this.mMinimumVelocity) {
            i11 += (int) (f7 + (i11 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i12 <= 0) {
            i11++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).f45151b, Math.min(i11, ((f) o0.b(1, this.mItems)).f45151b));
        }
        return i11;
    }

    private void dispatchOnPageScrolled(int i11, float f7, int i12) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageScrolled(i11, f7, i12);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                j jVar2 = this.mOnPageChangeListeners.get(i13);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i11, f7, i12);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i11, f7, i12);
        }
    }

    private void dispatchOnPageSelected(int i11) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageSelected(i11);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.mOnPageChangeListeners.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i11);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageSelected(i11);
        }
    }

    private void dispatchOnScrollStateChanged(int i11) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i11);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.mOnPageChangeListeners.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i11);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i11);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private f infoForCurrentScrollPosition() {
        int i11;
        int clientWidth = getClientWidth();
        float f7 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i12 = 0;
        boolean z11 = true;
        f fVar = null;
        int i13 = -1;
        float f12 = 0.0f;
        while (i12 < this.mItems.size()) {
            f fVar2 = this.mItems.get(i12);
            if (!z11 && fVar2.f45151b != (i11 = i13 + 1)) {
                fVar2 = this.mTempItem;
                fVar2.f45154e = f7 + f12 + f11;
                fVar2.f45151b = i11;
                fVar2.f45153d = this.mAdapter.getPageWidth(i11);
                i12--;
            }
            f fVar3 = fVar2;
            f7 = fVar3.f45154e;
            float f13 = fVar3.f45153d + f7 + f11;
            if (!z11 && scrollX < f7) {
                break;
            }
            if (scrollX < f13 || i12 == this.mItems.size() - 1) {
                return fVar3;
            }
            int i14 = fVar3.f45151b;
            float f14 = fVar3.f45153d;
            i12++;
            i13 = i14;
            f12 = f14;
            fVar = fVar3;
            z11 = false;
        }
        return fVar;
    }

    private static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean isGutterDrag(float f7, float f11) {
        if (f7 >= this.mGutterSize || f11 <= 0.0f) {
            return f7 > ((float) (getWidth() - this.mGutterSize)) && f11 < 0.0f;
        }
        return true;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i11);
            this.mActivePointerId = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i11) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i12 = this.mPageMargin;
        int i13 = clientWidth + i12;
        float f7 = clientWidth;
        int i14 = infoForCurrentScrollPosition.f45151b;
        float f11 = ((i11 / f7) - infoForCurrentScrollPosition.f45154e) / (infoForCurrentScrollPosition.f45153d + (i12 / f7));
        this.mCalledSuper = false;
        onPageScrolled(i14, f11, (int) (i13 * f11));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f7) {
        boolean z11;
        boolean z12;
        float f11 = this.mLastMotionX - f7;
        this.mLastMotionX = f7;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.mFirstOffset * clientWidth;
        float f13 = this.mLastOffset * clientWidth;
        boolean z13 = false;
        f fVar = this.mItems.get(0);
        f fVar2 = (f) o0.b(1, this.mItems);
        if (fVar.f45151b != 0) {
            f12 = fVar.f45154e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (fVar2.f45151b != this.mAdapter.getCount() - 1) {
            f13 = fVar2.f45154e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f12) {
            if (z11) {
                this.mLeftEdge.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z12) {
                this.mRightEdge.onPull(Math.abs(scrollX - f13) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        }
        int i11 = (int) scrollX;
        this.mLastMotionX = (scrollX - i11) + this.mLastMotionX;
        scrollTo(i11, getScrollY());
        pageScrolled(i11);
        return z13;
    }

    private void recomputeScrollPosition(int i11, int i12, int i13, int i14) {
        if (i12 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
                return;
            }
        }
        f infoForPosition = infoForPosition(this.mCurItem);
        int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f45154e, this.mLastOffset) : 0.0f) * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            completeScroll(false);
            scrollTo(min, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((g) getChildAt(i11).getLayoutParams()).f45155a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i11, boolean z11, int i12, boolean z12) {
        int i13;
        f infoForPosition = infoForPosition(i11);
        if (infoForPosition != null) {
            i13 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.f45154e, this.mLastOffset)) * getClientWidth());
        } else {
            i13 = 0;
        }
        if (z11) {
            smoothScrollTo(i13, 0, i12);
            if (z12) {
                dispatchOnPageSelected(i11);
                return;
            }
            return;
        }
        if (z12) {
            dispatchOnPageSelected(i11);
        }
        completeScroll(false);
        scrollTo(i13, 0);
        pageScrolled(i13);
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.mScrollingCacheEnabled != z11) {
            this.mScrollingCacheEnabled = z11;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.mDrawingOrderedChildren.add(getChildAt(i11));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        f infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f45151b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    f addNewItem(int i11, int i12) {
        f fVar = new f();
        fVar.f45151b = i11;
        fVar.f45150a = this.mAdapter.instantiateItem(this, i11);
        fVar.f45153d = this.mAdapter.getPageWidth(i11);
        if (i12 < 0 || i12 >= this.mItems.size()) {
            this.mItems.add(fVar);
            return fVar;
        }
        this.mItems.add(i12, fVar);
        return fVar;
    }

    public void addOnAdapterChangeListener(@NonNull i iVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(iVar);
    }

    public void addOnPageChangeListener(@NonNull j jVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f infoForChild;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f45151b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean isDecorView = gVar.f45155a | isDecorView(view);
        gVar.f45155a = isDecorView;
        if (!this.mInLayout) {
            super.addView(view, i11, layoutParams);
        } else {
            if (isDecorView) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f45158d = true;
            addViewInLayout(view, i11, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i11) {
        View findNextFocus;
        boolean pageLeft;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
            if (findNextFocus != null || findNextFocus == findFocus) {
                if (i11 != 17 || i11 == 1) {
                    pageLeft = pageLeft();
                } else {
                    if (i11 == 66 || i11 == 2) {
                        pageLeft = pageRight();
                    }
                    pageLeft = false;
                }
            } else if (i11 == 17) {
                pageLeft = (findFocus == null || getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageLeft();
            } else {
                if (i11 == 66) {
                    pageLeft = (findFocus == null || getChildRectInPagerCoordinates(this.mTempRect, findNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, findFocus).left) ? findNextFocus.requestFocus() : pageRight();
                }
                pageLeft = false;
            }
            if (pageLeft) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
            }
            return pageLeft;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
        if (findNextFocus != null) {
        }
        if (i11 != 17) {
        }
        pageLeft = pageLeft();
        if (pageLeft) {
        }
        return pageLeft;
    }

    protected boolean canScroll(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && canScroll(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z11 && view.canScrollHorizontally(-i11);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i11 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i11 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        int i11 = Y.f42258g;
        postInvalidateOnAnimation();
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z11 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i11 = this.mCurItem;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.mItems.size()) {
            f fVar = this.mItems.get(i12);
            int itemPosition = this.mAdapter.getItemPosition(fVar.f45150a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i12);
                    i12--;
                    if (!z12) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z12 = true;
                    }
                    this.mAdapter.destroyItem(this, fVar.f45151b, fVar.f45150a);
                    int i13 = this.mCurItem;
                    if (i13 == fVar.f45151b) {
                        i11 = Math.max(0, Math.min(i13, count - 1));
                    }
                } else {
                    int i14 = fVar.f45151b;
                    if (i14 != itemPosition) {
                        if (i14 == this.mCurItem) {
                            i11 = itemPosition;
                        }
                        fVar.f45151b = itemPosition;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                g gVar = (g) getChildAt(i15).getLayoutParams();
                if (!gVar.f45155a) {
                    gVar.f45157c = 0.0f;
                }
            }
            setCurrentItemInternal(i11, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f45151b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f7) {
        return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z11 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.mAdapter) != null && aVar.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z11 = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z11 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z11) {
            int i11 = Y.f42258g;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        if (this.mDrawingOrder == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((g) this.mDrawingOrderedChildren.get(i12).getLayoutParams()).f45160f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    f infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f infoForChild(View view) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            f fVar = this.mItems.get(i11);
            if (this.mAdapter.isViewFromObject(view, fVar.f45150a)) {
                return fVar;
            }
        }
        return null;
    }

    f infoForPosition(int i11) {
        for (int i12 = 0; i12 < this.mItems.size(); i12++) {
            f fVar = this.mItems.get(i12);
            if (fVar.f45151b == i11) {
                return fVar;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f7 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f7);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f7);
        this.mCloseEnough = (int) (2.0f * f7);
        this.mDefaultGutterSize = (int) (f7 * 16.0f);
        Y.C(this, new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        Y.J(this, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        float f7;
        int i12;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.mPageMargin / width;
        int i13 = 0;
        f fVar = this.mItems.get(0);
        float f12 = fVar.f45154e;
        int size = this.mItems.size();
        int i14 = fVar.f45151b;
        int i15 = this.mItems.get(size - 1).f45151b;
        while (i14 < i15) {
            while (true) {
                i11 = fVar.f45151b;
                if (i14 <= i11 || i13 >= size) {
                    break;
                }
                i13++;
                fVar = this.mItems.get(i13);
            }
            if (i14 == i11) {
                float f13 = fVar.f45154e;
                float f14 = fVar.f45153d;
                f7 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i14);
                f7 = (f12 + pageWidth) * width;
                f12 = pageWidth + f11 + f12;
            }
            if (this.mPageMargin + f7 > scrollX) {
                i12 = scrollX;
                this.mMarginDrawable.setBounds(Math.round(f7), this.mTopPageBounds, Math.round(this.mPageMargin + f7), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                i12 = scrollX;
            }
            if (f7 > i12 + r2) {
                return;
            }
            i14++;
            scrollX = i12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x11 = motionEvent.getX();
            this.mInitialMotionX = x11;
            this.mLastMotionX = x11;
            float y11 = motionEvent.getY();
            this.mInitialMotionY = y11;
            this.mLastMotionY = y11;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i11 = this.mActivePointerId;
            if (i11 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i11);
                float x12 = motionEvent.getX(findPointerIndex);
                float f7 = x12 - this.mLastMotionX;
                float abs = Math.abs(f7);
                float y12 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y12 - this.mInitialMotionY);
                if (f7 != 0.0f && !isGutterDrag(this.mLastMotionX, f7) && canScroll(this, false, (int) f7, (int) x12, (int) y12)) {
                    this.mLastMotionX = x12;
                    this.mLastMotionY = y12;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i12 = this.mTouchSlop;
                if (abs > i12 && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f11 = this.mInitialMotionX;
                    float f12 = this.mTouchSlop;
                    this.mLastMotionX = f7 > 0.0f ? f11 + f12 : f11 - f12;
                    this.mLastMotionY = y12;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i12) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x12)) {
                    int i13 = Y.f42258g;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        f infoForChild;
        int max;
        int i15;
        int max2;
        int i16;
        int childCount = getChildCount();
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f45155a) {
                    int i22 = gVar.f45156b;
                    int i23 = i22 & 7;
                    int i24 = i22 & 112;
                    if (i23 != 1) {
                        if (i23 == 3) {
                            i15 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i23 != 5) {
                            i15 = paddingLeft;
                        } else {
                            max = (i17 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i24 == 16) {
                            if (i24 == 48) {
                                i16 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i24 != 80) {
                                i16 = paddingTop;
                            } else {
                                max2 = (i18 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i25 = paddingLeft + scrollX;
                            childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                            i19++;
                            paddingTop = i16;
                            paddingLeft = i15;
                        } else {
                            max2 = Math.max((i18 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i26 = max2;
                        i16 = paddingTop;
                        paddingTop = i26;
                        int i252 = paddingLeft + scrollX;
                        childAt.layout(i252, paddingTop, childAt.getMeasuredWidth() + i252, childAt.getMeasuredHeight() + paddingTop);
                        i19++;
                        paddingTop = i16;
                        paddingLeft = i15;
                    } else {
                        max = Math.max((i17 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i27 = max;
                    i15 = paddingLeft;
                    paddingLeft = i27;
                    if (i24 == 16) {
                    }
                    int i262 = max2;
                    i16 = paddingTop;
                    paddingTop = i262;
                    int i2522 = paddingLeft + scrollX;
                    childAt.layout(i2522, paddingTop, childAt.getMeasuredWidth() + i2522, childAt.getMeasuredHeight() + paddingTop);
                    i19++;
                    paddingTop = i16;
                    paddingLeft = i15;
                }
            }
        }
        int i28 = (i17 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f45155a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f7 = i28;
                    int i31 = ((int) (infoForChild.f45154e * f7)) + paddingLeft;
                    if (gVar2.f45158d) {
                        gVar2.f45158d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * gVar2.f45157c), 1073741824), View.MeasureSpec.makeMeasureSpec((i18 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i31, paddingTop, childAt2.getMeasuredWidth() + i31, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i18 - paddingBottom;
        this.mDecorChildCount = i19;
        if (this.mFirstLayout) {
            z12 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z12 = false;
        }
        this.mFirstLayout = z12;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        g gVar;
        g gVar2;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f45155a) {
                int i16 = gVar2.f45156b;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z12 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = LinearLayoutManager.INVALID_OFFSET;
                if (z12) {
                    i13 = Integer.MIN_VALUE;
                    i19 = 1073741824;
                } else {
                    i13 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i21 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i21 != -2) {
                    if (i21 == -1) {
                        i21 = paddingLeft;
                    }
                    i19 = 1073741824;
                } else {
                    i21 = paddingLeft;
                }
                int i22 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i22 == -2) {
                    i22 = measuredHeight;
                    i15 = i13;
                } else if (i22 == -1) {
                    i22 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, i19), View.MeasureSpec.makeMeasureSpec(i22, i15));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i14++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f45155a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f45157c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onPageScrolled(int i11, float f7, int i12) {
        int max;
        int i13;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f45155a) {
                    int i15 = gVar.f45156b & 7;
                    if (i15 != 1) {
                        if (i15 == 3) {
                            i13 = childAt.getWidth() + paddingLeft;
                        } else if (i15 != 5) {
                            i13 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i13;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i13 = paddingLeft;
                    paddingLeft = i16;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i13;
                }
            }
        }
        dispatchOnPageScrolled(i11, f7, i12);
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        f infoForChild;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f45151b == this.mCurItem && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i14;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.a());
        androidx.viewpager.widget.a aVar = this.mAdapter;
        ClassLoader classLoader = lVar.f45165e;
        if (aVar != null) {
            aVar.restoreState(lVar.f45164d, classLoader);
            setCurrentItemInternal(lVar.f45163c, false, true);
        } else {
            this.mRestoredCurItem = lVar.f45163c;
            this.mRestoredAdapterState = lVar.f45164d;
            this.mRestoredClassLoader = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f45163c = this.mCurItem;
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null) {
            lVar.f45164d = aVar.saveState();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.mPageMargin;
            recomputeScrollPosition(i11, i13, i15, i15);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z11 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x11 = motionEvent.getX();
            this.mInitialMotionX = x11;
            this.mLastMotionX = x11;
            float y11 = motionEvent.getY();
            this.mInitialMotionY = y11;
            this.mLastMotionY = y11;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z11 = resetTouch();
                    } else {
                        float x12 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x12 - this.mLastMotionX);
                        float y12 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y12 - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f7 = this.mInitialMotionX;
                            this.mLastMotionX = x12 - f7 > 0.0f ? f7 + this.mTouchSlop : f7 - this.mTouchSlop;
                            this.mLastMotionY = y12;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z11 = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z11 = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f11 = clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f45151b, ((scrollX / f11) - infoForCurrentScrollPosition.f45154e) / (infoForCurrentScrollPosition.f45153d + (this.mPageMargin / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z11 = resetTouch();
        }
        if (z11) {
            int i11 = Y.f42258g;
            postInvalidateOnAnimation();
        }
        return true;
    }

    boolean pageLeft() {
        int i11 = this.mCurItem;
        if (i11 <= 0) {
            return false;
        }
        setCurrentItem(i11 - 1, true);
        return true;
    }

    boolean pageRight() {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(@NonNull i iVar) {
        List<i> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void removeOnPageChangeListener(@NonNull j jVar) {
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(jVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i11 = 0; i11 < this.mItems.size(); i11++) {
                f fVar = this.mItems.get(i11);
                this.mAdapter.destroyItem(this, fVar.f45151b, fVar.f45150a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new k();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z11 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z11) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<i> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.mAdapterChangeListeners.get(i12).a(this, aVar);
        }
    }

    public void setCurrentItem(int i11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i11, boolean z11, boolean z12) {
        setCurrentItemInternal(i11, z11, z12, 0);
    }

    void setScrollState(int i11) {
        if (this.mScrollState == i11) {
            return;
        }
        this.mScrollState = i11;
        dispatchOnScrollStateChanged(i11);
    }

    void smoothScrollTo(int i11, int i12, int i13) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i11 - i14;
        int i16 = i12 - scrollY;
        if (i15 == 0 && i16 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f7 = clientWidth;
        float f11 = i17;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i15) * 1.0f) / f7)) * f11) + f11;
        int abs = Math.abs(i13);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(distanceInfluenceForSnapDuration / abs) * 1000.0f) * 4 : (int) (((Math.abs(i15) / ((this.mAdapter.getPageWidth(this.mCurItem) * f7) + this.mPageMargin)) + 1.0f) * 100.0f), 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i14, scrollY, i15, i16, min);
        int i18 = Y.f42258g;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g gVar = new g(context, attributeSet);
        gVar.f45157c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        gVar.f45156b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void populate(int i11) {
        f fVar;
        String hexString;
        f fVar2;
        f infoForChild;
        f fVar3;
        int i12 = this.mCurItem;
        if (i12 != i11) {
            fVar = infoForPosition(i12);
            this.mCurItem = i11;
        } else {
            fVar = null;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i13 = this.mOffscreenPageLimit;
        int max = Math.max(0, this.mCurItem - i13);
        int count = this.mAdapter.getCount();
        int min = Math.min(count - 1, this.mCurItem + i13);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            Ek.a.f(this.mExpectedAdapterCount, count, ", found: ", " Pager id: ", sb2);
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.mAdapter.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.mItems.size()) {
                break;
            }
            fVar2 = this.mItems.get(i14);
            int i15 = fVar2.f45151b;
            int i16 = this.mCurItem;
            if (i15 < i16) {
                i14++;
            }
        }
        if (fVar2 == null && count > 0) {
            fVar2 = addNewItem(this.mCurItem, i14);
        }
        if (fVar2 != null) {
            int i17 = i14 - 1;
            f fVar4 = i17 >= 0 ? this.mItems.get(i17) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - fVar2.f45153d);
            float f7 = 0.0f;
            for (int i18 = this.mCurItem - 1; i18 >= 0; i18--) {
                if (f7 >= paddingLeft && i18 < max) {
                    if (fVar4 == null) {
                        break;
                    }
                    if (i18 == fVar4.f45151b && !fVar4.f45152c) {
                        this.mItems.remove(i17);
                        this.mAdapter.destroyItem(this, i18, fVar4.f45150a);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            fVar3 = this.mItems.get(i17);
                            fVar4 = fVar3;
                        }
                        fVar3 = null;
                        fVar4 = fVar3;
                    }
                } else if (fVar4 == null || i18 != fVar4.f45151b) {
                    f7 += addNewItem(i18, i17 + 1).f45153d;
                    i14++;
                    if (i17 >= 0) {
                        fVar3 = this.mItems.get(i17);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                } else {
                    f7 += fVar4.f45153d;
                    i17--;
                    if (i17 >= 0) {
                        fVar3 = this.mItems.get(i17);
                        fVar4 = fVar3;
                    }
                    fVar3 = null;
                    fVar4 = fVar3;
                }
            }
            float f11 = fVar2.f45153d;
            int i19 = i14 + 1;
            if (f11 < 2.0f) {
                f fVar5 = i19 < this.mItems.size() ? this.mItems.get(i19) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = this.mCurItem;
                while (true) {
                    i21++;
                    if (i21 >= count) {
                        break;
                    }
                    if (f11 >= paddingRight && i21 > min) {
                        if (fVar5 == null) {
                            break;
                        }
                        if (i21 == fVar5.f45151b && !fVar5.f45152c) {
                            this.mItems.remove(i19);
                            this.mAdapter.destroyItem(this, i21, fVar5.f45150a);
                            if (i19 < this.mItems.size()) {
                                fVar5 = this.mItems.get(i19);
                            }
                        }
                    } else if (fVar5 == null || i21 != fVar5.f45151b) {
                        f addNewItem = addNewItem(i21, i19);
                        i19++;
                        f11 += addNewItem.f45153d;
                        fVar5 = i19 < this.mItems.size() ? this.mItems.get(i19) : null;
                    } else {
                        f11 += fVar5.f45153d;
                        i19++;
                        if (i19 < this.mItems.size()) {
                            fVar5 = this.mItems.get(i19);
                        }
                    }
                }
            }
            calculatePageOffsets(fVar2, i14, fVar);
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, fVar2.f45150a);
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f45160f = i22;
            if (!gVar.f45155a && gVar.f45157c == 0.0f && (infoForChild = infoForChild(childAt)) != null) {
                gVar.f45157c = infoForChild.f45153d;
                gVar.f45159e = infoForChild.f45151b;
            }
        }
        sortChildDrawingOrder();
        if (hasFocus()) {
            View findFocus = findFocus();
            f infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
            if (infoForAnyChild == null || infoForAnyChild.f45151b != this.mCurItem) {
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt2 = getChildAt(i23);
                    f infoForChild2 = infoForChild(childAt2);
                    if (infoForChild2 != null && infoForChild2.f45151b == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    void setCurrentItemInternal(int i11, boolean z11, boolean z12, int i12) {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z12 && this.mCurItem == i11 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= this.mAdapter.getCount()) {
            i11 = this.mAdapter.getCount() - 1;
        }
        int i13 = this.mOffscreenPageLimit;
        int i14 = this.mCurItem;
        if (i11 > i14 + i13 || i11 < i14 - i13) {
            for (int i15 = 0; i15 < this.mItems.size(); i15++) {
                this.mItems.get(i15).f45152c = true;
            }
        }
        boolean z13 = this.mCurItem != i11;
        if (!this.mFirstLayout) {
            populate(i11);
            scrollToItem(i11, z11, i12, z13);
        } else {
            this.mCurItem = i11;
            if (z13) {
                dispatchOnPageSelected(i11);
            }
            requestLayout();
        }
    }

    public void setCurrentItem(int i11, boolean z11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, z11, false);
    }
}
