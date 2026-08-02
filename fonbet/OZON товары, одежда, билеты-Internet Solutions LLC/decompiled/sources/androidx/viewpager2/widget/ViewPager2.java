package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import y2.q;
import y2.s;

/* loaded from: classes8.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f45166a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f45167b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.c f45168c;

    /* renamed from: d, reason: collision with root package name */
    int f45169d;

    /* renamed from: e, reason: collision with root package name */
    boolean f45170e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.i f45171f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayoutManager f45172g;

    /* renamed from: h, reason: collision with root package name */
    private int f45173h;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f45174i;

    /* renamed from: j, reason: collision with root package name */
    RecyclerView f45175j;

    /* renamed from: k, reason: collision with root package name */
    private x f45176k;

    /* renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.f f45177l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.c f45178m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.d f45179n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.e f45180o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f45181p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f45182q;

    /* renamed from: r, reason: collision with root package name */
    private int f45183r;

    /* renamed from: s, reason: collision with root package name */
    h f45184s;

    final class a extends e {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.i
        public final void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f45170e = true;
            viewPager2.f45177l.j();
        }
    }

    final class b extends g {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i11) {
            if (i11 == 0) {
                ViewPager2.this.B();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f45169d != i11) {
                viewPager2.f45169d = i11;
                viewPager2.f45184s.d();
            }
        }
    }

    final class c extends g {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i11) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.f45175j.requestFocus(2);
            }
        }
    }

    private abstract class d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class e extends RecyclerView.i {
        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i11, int i12, int i13) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i11, int i12, Object obj) {
            onChanged();
        }
    }

    private class f extends LinearLayoutManager {
        f(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected final void calculateExtraLayoutSpace(@NonNull RecyclerView.A a11, @NonNull int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int h11 = viewPager2.h();
            if (h11 == -1) {
                super.calculateExtraLayoutSpace(a11, iArr);
                return;
            }
            int j11 = viewPager2.j() * h11;
            iArr[0] = j11;
            iArr[1] = j11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.v vVar, @NonNull RecyclerView.A a11, @NonNull q qVar) {
            super.onInitializeAccessibilityNodeInfo(vVar, a11, qVar);
            ViewPager2.this.f45184s.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean performAccessibilityAction(@NonNull RecyclerView.v vVar, @NonNull RecyclerView.A a11, int i11, Bundle bundle) {
            ViewPager2.this.f45184s.getClass();
            return super.performAccessibilityAction(vVar, a11, i11, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
            return false;
        }
    }

    public static abstract class g {
        public void onPageScrollStateChanged(int i11) {
        }

        public void onPageScrolled(int i11, float f7, int i12) {
        }

        public void onPageSelected(int i11) {
        }
    }

    class h extends d {

        /* renamed from: a, reason: collision with root package name */
        private final s f45189a = new a();

        /* renamed from: b, reason: collision with root package name */
        private final s f45190b = new b();

        /* renamed from: c, reason: collision with root package name */
        private RecyclerView.i f45191c;

        final class a implements s {
            a() {
            }

            @Override // y2.s
            public final boolean a(@NonNull View view) {
                int i11 = ((ViewPager2) view).f45169d + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.o()) {
                    viewPager2.u(i11, true);
                }
                return true;
            }
        }

        final class b implements s {
            b() {
            }

            @Override // y2.s
            public final boolean a(@NonNull View view) {
                int i11 = ((ViewPager2) view).f45169d - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.o()) {
                    viewPager2.u(i11, true);
                }
                return true;
            }
        }

        h() {
        }

        public final void a(RecyclerView.g<?> gVar) {
            d();
            if (gVar != null) {
                gVar.registerAdapterDataObserver(this.f45191c);
            }
        }

        public final void b(RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.unregisterAdapterDataObserver(this.f45191c);
            }
        }

        public final void c(@NonNull RecyclerView recyclerView) {
            int i11 = Y.f42258g;
            recyclerView.setImportantForAccessibility(2);
            this.f45191c = new androidx.viewpager2.widget.h(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
        }

        final void d() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = R.id.accessibilityActionPageLeft;
            Y.x(R.id.accessibilityActionPageLeft, viewPager2);
            Y.x(R.id.accessibilityActionPageRight, viewPager2);
            Y.x(R.id.accessibilityActionPageUp, viewPager2);
            Y.x(R.id.accessibilityActionPageDown, viewPager2);
            if (viewPager2.f45175j.getAdapter() == null || (itemCount = viewPager2.f45175j.getAdapter().getItemCount()) == 0 || !viewPager2.o()) {
                return;
            }
            int i12 = viewPager2.i();
            s sVar = this.f45190b;
            s sVar2 = this.f45189a;
            if (i12 != 0) {
                if (viewPager2.f45169d < itemCount - 1) {
                    Y.z(viewPager2, new q.a(R.id.accessibilityActionPageDown, (String) null), sVar2);
                }
                if (viewPager2.f45169d > 0) {
                    Y.z(viewPager2, new q.a(R.id.accessibilityActionPageUp, (String) null), sVar);
                    return;
                }
                return;
            }
            boolean n11 = viewPager2.n();
            int i13 = n11 ? 16908360 : 16908361;
            if (n11) {
                i11 = 16908361;
            }
            if (viewPager2.f45169d < itemCount - 1) {
                Y.z(viewPager2, new q.a(i13, (String) null), sVar2);
            }
            if (viewPager2.f45169d > 0) {
                Y.z(viewPager2, new q.a(i11, (String) null), sVar);
            }
        }
    }

    public interface i {
        void transformPage(@NonNull View view, float f7);
    }

    private class j extends x {
        j() {
        }

        @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.D
        public final View findSnapView(RecyclerView.o oVar) {
            if (ViewPager2.this.m()) {
                return null;
            }
            return super.findSnapView(oVar);
        }
    }

    private class k extends RecyclerView {
        k(@NonNull Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f45184s.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f45169d);
            accessibilityEvent.setToIndex(viewPager2.f45169d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.o() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.o() && super.onTouchEvent(motionEvent);
        }
    }

    static class l extends View.BaseSavedState {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f45197a;

        /* renamed from: b, reason: collision with root package name */
        int f45198b;

        /* renamed from: c, reason: collision with root package name */
        Parcelable f45199c;

        static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new l[i11];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f45197a = parcel.readInt();
            this.f45198b = parcel.readInt();
            this.f45199c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f45197a);
            parcel.writeInt(this.f45198b);
            parcel.writeParcelable(this.f45199c, i11);
        }
    }

    private static class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f45200a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f45201b;

        m(int i11, RecyclerView recyclerView) {
            this.f45200a = i11;
            this.f45201b = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f45201b.smoothScrollToPosition(this.f45200a);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f45166a = new Rect();
        this.f45167b = new Rect();
        this.f45168c = new androidx.viewpager2.widget.c();
        this.f45170e = false;
        this.f45171f = new a();
        this.f45173h = -1;
        this.f45181p = false;
        this.f45182q = true;
        this.f45183r = -1;
        l(context, null);
    }

    private void l(Context context, AttributeSet attributeSet) {
        this.f45184s = new h();
        k kVar = new k(context);
        this.f45175j = kVar;
        int i11 = Y.f42258g;
        kVar.setId(View.generateViewId());
        this.f45175j.setDescendantFocusability(131072);
        f fVar = new f(context);
        this.f45172g = fVar;
        this.f45175j.setLayoutManager(fVar);
        this.f45175j.setScrollingTouchSlop(1);
        int[] iArr = Y4.a.f34568a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            w(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f45175j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f45175j.addOnChildAttachStateChangeListener(new androidx.viewpager2.widget.g());
            androidx.viewpager2.widget.f fVar2 = new androidx.viewpager2.widget.f(this);
            this.f45177l = fVar2;
            this.f45179n = new androidx.viewpager2.widget.d(this, fVar2, this.f45175j);
            j jVar = new j();
            this.f45176k = jVar;
            jVar.attachToRecyclerView(this.f45175j);
            this.f45175j.addOnScrollListener(this.f45177l);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c();
            this.f45178m = cVar;
            this.f45177l.o(cVar);
            b bVar = new b();
            c cVar2 = new c();
            this.f45178m.a(bVar);
            this.f45178m.a(cVar2);
            this.f45184s.c(this.f45175j);
            this.f45178m.a(this.f45168c);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this.f45172g);
            this.f45180o = eVar;
            this.f45178m.a(eVar);
            RecyclerView recyclerView = this.f45175j;
            attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r() {
        RecyclerView.g adapter;
        if (this.f45173h == -1 || (adapter = this.f45175j.getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f45174i;
        if (parcelable != null) {
            if (adapter instanceof Z4.c) {
                ((Z4.c) adapter).restoreState(parcelable);
            }
            this.f45174i = null;
        }
        int max = Math.max(0, Math.min(this.f45173h, adapter.getItemCount() - 1));
        this.f45169d = max;
        this.f45173h = -1;
        this.f45175j.scrollToPosition(max);
        this.f45184s.d();
    }

    public final void A(@NonNull g gVar) {
        this.f45168c.b(gVar);
    }

    final void B() {
        x xVar = this.f45176k;
        if (xVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View findSnapView = xVar.findSnapView(this.f45172g);
        if (findSnapView == null) {
            return;
        }
        int position = this.f45172g.getPosition(findSnapView);
        if (position != this.f45169d && this.f45177l.e() == 0) {
            this.f45178m.onPageSelected(position);
        }
        this.f45170e = false;
    }

    public final void a(@NonNull RecyclerView.n nVar) {
        this.f45175j.addItemDecoration(nVar);
    }

    public final void b() {
        this.f45179n.a();
    }

    public final void c() {
        this.f45179n.b();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        return this.f45175j.canScrollHorizontally(i11);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i11) {
        return this.f45175j.canScrollVertically(i11);
    }

    public final void d(@SuppressLint({"SupportAnnotationUsage"}) float f7) {
        this.f45179n.c(f7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof l) {
            int i11 = ((l) parcelable).f45197a;
            sparseArray.put(this.f45175j.getId(), sparseArray.get(i11));
            sparseArray.remove(i11);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public final RecyclerView.g e() {
        return this.f45175j.getAdapter();
    }

    public final int f() {
        return this.f45169d;
    }

    public final int g() {
        return this.f45175j.getItemDecorationCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f45184s.getClass();
        this.f45184s.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public final int h() {
        return this.f45183r;
    }

    public final int i() {
        return this.f45172g.getOrientation();
    }

    final int j() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f45175j;
        if (this.f45172g.getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final int k() {
        return this.f45177l.e();
    }

    public final boolean m() {
        return this.f45179n.d();
    }

    final boolean n() {
        return this.f45172g.getLayoutDirection() == 1;
    }

    public final boolean o() {
        return this.f45182q;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        int i12;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.f45175j.getAdapter() == null) {
            i11 = 0;
            i12 = 0;
        } else if (viewPager2.f45172g.getOrientation() == 1) {
            i11 = viewPager2.f45175j.getAdapter().getItemCount();
            i12 = 0;
        } else {
            i12 = viewPager2.f45175j.getAdapter().getItemCount();
            i11 = 0;
        }
        q.A0(accessibilityNodeInfo).M(q.e.a(i11, i12, 0, false));
        RecyclerView.g adapter = viewPager2.f45175j.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.f45182q) {
            return;
        }
        if (viewPager2.f45169d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f45169d < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = this.f45175j.getMeasuredWidth();
        int measuredHeight = this.f45175j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f45166a;
        rect.left = paddingLeft;
        rect.right = (i13 - i11) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i14 - i12) - getPaddingBottom();
        Rect rect2 = this.f45167b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f45175j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f45170e) {
            B();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        measureChild(this.f45175j, i11, i12);
        int measuredWidth = this.f45175j.getMeasuredWidth();
        int measuredHeight = this.f45175j.getMeasuredHeight();
        int measuredState = this.f45175j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i11, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i12, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f45173h = lVar.f45198b;
        this.f45174i = lVar.f45199c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f45197a = this.f45175j.getId();
        int i11 = this.f45173h;
        if (i11 == -1) {
            i11 = this.f45169d;
        }
        lVar.f45198b = i11;
        Parcelable parcelable = this.f45174i;
        if (parcelable != null) {
            lVar.f45199c = parcelable;
            return lVar;
        }
        Object adapter = this.f45175j.getAdapter();
        if (adapter instanceof Z4.c) {
            lVar.f45199c = ((Z4.c) adapter).saveState();
        }
        return lVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final void p(@NonNull g gVar) {
        this.f45168c.a(gVar);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i11, Bundle bundle) {
        this.f45184s.getClass();
        if (i11 != 8192 && i11 != 4096) {
            return super.performAccessibilityAction(i11, bundle);
        }
        h hVar = this.f45184s;
        hVar.getClass();
        if (i11 != 8192 && i11 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int i12 = i11 == 8192 ? viewPager2.f45169d - 1 : viewPager2.f45169d + 1;
        if (viewPager2.o()) {
            viewPager2.u(i12, true);
        }
        return true;
    }

    public final void q(@NonNull RecyclerView.n nVar) {
        this.f45175j.removeItemDecoration(nVar);
    }

    public final void s(RecyclerView.g gVar) {
        RecyclerView.g<?> adapter = this.f45175j.getAdapter();
        this.f45184s.b(adapter);
        RecyclerView.i iVar = this.f45171f;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(iVar);
        }
        this.f45175j.setAdapter(gVar);
        this.f45169d = 0;
        r();
        this.f45184s.a(gVar);
        if (gVar != null) {
            gVar.registerAdapterDataObserver(iVar);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i11) {
        super.setLayoutDirection(i11);
        this.f45184s.d();
    }

    public final void t(int i11, boolean z11) {
        if (this.f45179n.d()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        u(i11, z11);
    }

    final void u(int i11, boolean z11) {
        RecyclerView.g adapter = this.f45175j.getAdapter();
        if (adapter == null) {
            if (this.f45173h != -1) {
                this.f45173h = Math.max(i11, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i11, 0), adapter.getItemCount() - 1);
        if (min == this.f45169d && this.f45177l.h()) {
            return;
        }
        int i12 = this.f45169d;
        if (min == i12 && z11) {
            return;
        }
        double d11 = i12;
        this.f45169d = min;
        this.f45184s.d();
        if (!this.f45177l.h()) {
            d11 = this.f45177l.d();
        }
        this.f45177l.l(min, z11);
        if (!z11) {
            this.f45175j.scrollToPosition(min);
            return;
        }
        double d12 = min;
        if (Math.abs(d12 - d11) <= 3.0d) {
            this.f45175j.smoothScrollToPosition(min);
            return;
        }
        this.f45175j.scrollToPosition(d12 > d11 ? min - 3 : min + 3);
        RecyclerView recyclerView = this.f45175j;
        recyclerView.post(new m(min, recyclerView));
    }

    public final void v(int i11) {
        if (i11 < 1 && i11 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f45183r = i11;
        this.f45175j.requestLayout();
    }

    public final void w(int i11) {
        this.f45172g.setOrientation(i11);
        this.f45184s.d();
    }

    public final void x(i iVar) {
        if (!this.f45181p) {
            this.f45175j.getItemAnimator();
            this.f45181p = true;
        }
        this.f45175j.setItemAnimator(null);
        if (iVar == this.f45180o.a()) {
            return;
        }
        this.f45180o.b(iVar);
        if (this.f45180o.a() == null) {
            return;
        }
        double d11 = this.f45177l.d();
        int i11 = (int) d11;
        float f7 = (float) (d11 - i11);
        this.f45180o.onPageScrolled(i11, f7, Math.round(j() * f7));
    }

    public final void y(boolean z11) {
        this.f45182q = z11;
        this.f45184s.d();
    }

    final void z() {
        View findSnapView = this.f45176k.findSnapView(this.f45172g);
        if (findSnapView == null) {
            return;
        }
        int[] calculateDistanceToFinalSnap = this.f45176k.calculateDistanceToFinalSnap(this.f45172g, findSnapView);
        int i11 = calculateDistanceToFinalSnap[0];
        if (i11 == 0 && calculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f45175j.smoothScrollBy(i11, calculateDistanceToFinalSnap[1]);
    }

    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45166a = new Rect();
        this.f45167b = new Rect();
        this.f45168c = new androidx.viewpager2.widget.c();
        this.f45170e = false;
        this.f45171f = new a();
        this.f45173h = -1;
        this.f45181p = false;
        this.f45182q = true;
        this.f45183r = -1;
        l(context, attributeSet);
    }
}
