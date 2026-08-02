package androidx.coordinatorlayout.widget;

import A1.x0;
import C0.C0090i;
import D.b;
import D.c;
import D.e;
import G.h;
import O.d;
import P.C0364u;
import P.G;
import P.I;
import P.InterfaceC0362s;
import P.U;
import P.q0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import k1.g;
import r.l;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0362s {

    /* renamed from: G, reason: collision with root package name */
    public static final String f9027G;

    /* renamed from: H, reason: collision with root package name */
    public static final Class[] f9028H;

    /* renamed from: I, reason: collision with root package name */
    public static final ThreadLocal f9029I;

    /* renamed from: J, reason: collision with root package name */
    public static final C0090i f9030J;

    /* renamed from: K, reason: collision with root package name */
    public static final d f9031K;

    /* renamed from: A, reason: collision with root package name */
    public q0 f9032A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f9033B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f9034C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f9035D;

    /* renamed from: E, reason: collision with root package name */
    public x0 f9036E;

    /* renamed from: F, reason: collision with root package name */
    public final C0364u f9037F;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9038a;

    /* renamed from: b, reason: collision with root package name */
    public final g f9039b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9040c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9041d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9042e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9043f;

    /* renamed from: x, reason: collision with root package name */
    public View f9044x;

    /* renamed from: y, reason: collision with root package name */
    public D.d f9045y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9046z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public SparseArray f9047c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f9047c = new SparseArray(readInt);
            for (int i7 = 0; i7 < readInt; i7++) {
                this.f9047c.append(iArr[i7], readParcelableArray[i7]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            SparseArray sparseArray = this.f9047c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = this.f9047c.keyAt(i8);
                parcelableArr[i8] = (Parcelable) this.f9047c.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f9027G = r02 != null ? r02.getName() : null;
        f9030J = new C0090i(1);
        f9028H = new Class[]{Context.class, AttributeSet.class};
        f9029I = new ThreadLocal();
        f9031K = new d();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9038a = new ArrayList();
        this.f9039b = new g(2);
        this.f9040c = new ArrayList();
        new ArrayList();
        this.f9037F = new C0364u();
        int[] iArr = C.a.f1209a;
        TypedArray obtainStyledAttributes = i7 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f9043f = intArray;
            float f7 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.f9043f[i8] = (int) (r0[i8] * f7);
            }
        }
        this.f9034C = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        n();
        super.setOnHierarchyChangeListener(new b(this));
    }

    public static Rect a() {
        Rect rect = (Rect) f9031K.a();
        return rect == null ? new Rect() : rect;
    }

    public static void e(int i7, Rect rect, Rect rect2, c cVar, int i8, int i9) {
        int i10 = cVar.f1604b;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i7);
        int i11 = cVar.f1605c;
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, i7);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int i14 = absoluteGravity2 & 7;
        int i15 = absoluteGravity2 & 112;
        int width = i14 != 1 ? i14 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i15 != 16 ? i15 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i12 == 1) {
            width -= i8 / 2;
        } else if (i12 != 5) {
            width -= i8;
        }
        if (i13 == 16) {
            height -= i9 / 2;
        } else if (i13 != 80) {
            height -= i9;
        }
        rect2.set(width, height, i8 + width, i9 + height);
    }

    public static c g(View view) {
        c cVar = (c) view.getLayoutParams();
        if (!cVar.f1603a) {
            D.a aVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                aVar = (D.a) cls.getAnnotation(D.a.class);
                if (aVar != null) {
                    break;
                }
            }
            if (aVar != null) {
                try {
                    if (aVar.value().getDeclaredConstructor(null).newInstance(null) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception e7) {
                    Log.e("CoordinatorLayout", "Default behavior class " + aVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                }
            }
            cVar.f1603a = true;
        }
        return cVar;
    }

    public static void l(View view, int i7) {
        c cVar = (c) view.getLayoutParams();
        int i8 = cVar.f1610h;
        if (i8 != i7) {
            WeakHashMap weakHashMap = U.f5037a;
            view.offsetLeftAndRight(i7 - i8);
            cVar.f1610h = i7;
        }
    }

    public static void m(View view, int i7) {
        c cVar = (c) view.getLayoutParams();
        int i8 = cVar.f1611i;
        if (i8 != i7) {
            WeakHashMap weakHashMap = U.f5037a;
            view.offsetTopAndBottom(i7 - i8);
            cVar.f1611i = i7;
        }
    }

    public final void b(c cVar, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(max, max2, i7 + max, i8 + max2);
    }

    public final void c(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            d(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect) {
        ThreadLocal threadLocal = e.f1615a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = e.f1615a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        e.a(this, view, matrix);
        ThreadLocal threadLocal3 = e.f1616b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ((c) view.getLayoutParams()).getClass();
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9034C;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final int f(int i7) {
        int[] iArr = this.f9043f;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i7);
            return 0;
        }
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i7 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        j();
        return Collections.unmodifiableList(this.f9038a);
    }

    public final q0 getLastWindowInsets() {
        return this.f9032A;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0364u c0364u = this.f9037F;
        return c0364u.f5111b | c0364u.f5110a;
    }

    public Drawable getStatusBarBackground() {
        return this.f9034C;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029e A[LOOP:2: B:94:0x029a->B:96:0x029e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i7) {
        int i8;
        Rect rect;
        int i9;
        Rect rect2;
        int i10;
        Rect rect3;
        int i11;
        int i12;
        ArrayList arrayList;
        boolean z4;
        int i13;
        int i14;
        int i15;
        int width;
        int i16;
        int i17;
        int i18;
        int height;
        int i19;
        int i20;
        int i21;
        c cVar;
        int i22;
        d dVar;
        int i23;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i24;
        int i25 = i7;
        WeakHashMap weakHashMap = U.f5037a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f9038a;
        int size = arrayList3.size();
        Rect a2 = a();
        Rect a4 = a();
        Rect a7 = a();
        int i26 = 0;
        while (true) {
            d dVar2 = f9031K;
            if (i26 >= size) {
                Rect rect7 = a7;
                Rect rect8 = a4;
                Rect rect9 = a2;
                rect9.setEmpty();
                dVar2.c(rect9);
                rect8.setEmpty();
                dVar2.c(rect8);
                rect7.setEmpty();
                dVar2.c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i26);
            c cVar2 = (c) view.getLayoutParams();
            if (i25 == 0 && view.getVisibility() == 8) {
                i10 = i25;
                i9 = layoutDirection;
                i8 = i26;
                rect3 = a7;
                rect = a4;
                rect2 = a2;
                i12 = size;
                arrayList = arrayList3;
            } else {
                int i27 = 0;
                while (i27 < i26) {
                    if (cVar2.f1612k == ((View) arrayList3.get(i27))) {
                        c cVar3 = (c) view.getLayoutParams();
                        if (cVar3.j != null) {
                            Rect a8 = a();
                            Rect a9 = a();
                            arrayList2 = arrayList3;
                            Rect a10 = a();
                            d(cVar3.j, a8);
                            c(view, a9, false);
                            i24 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            cVar = cVar2;
                            dVar = dVar2;
                            i23 = i26;
                            i22 = layoutDirection;
                            rect4 = a7;
                            rect5 = a4;
                            rect6 = a2;
                            e(layoutDirection, a8, a10, cVar3, measuredWidth, measuredHeight);
                            if (a10.left == a9.left) {
                                int i28 = a10.top;
                                int i29 = a9.top;
                            }
                            b(cVar3, a10, measuredWidth, measuredHeight);
                            int i30 = a10.left - a9.left;
                            int i31 = a10.top - a9.top;
                            if (i30 != 0) {
                                WeakHashMap weakHashMap2 = U.f5037a;
                                view.offsetLeftAndRight(i30);
                            }
                            if (i31 != 0) {
                                WeakHashMap weakHashMap3 = U.f5037a;
                                view.offsetTopAndBottom(i31);
                            }
                            a8.setEmpty();
                            dVar.c(a8);
                            a9.setEmpty();
                            dVar.c(a9);
                            a10.setEmpty();
                            dVar.c(a10);
                            i27++;
                            dVar2 = dVar;
                            size = i24;
                            arrayList3 = arrayList2;
                            layoutDirection = i22;
                            cVar2 = cVar;
                            i26 = i23;
                            a7 = rect4;
                            a4 = rect5;
                            a2 = rect6;
                        }
                    }
                    cVar = cVar2;
                    i22 = layoutDirection;
                    dVar = dVar2;
                    i23 = i26;
                    rect4 = a7;
                    rect5 = a4;
                    rect6 = a2;
                    arrayList2 = arrayList3;
                    i24 = size;
                    i27++;
                    dVar2 = dVar;
                    size = i24;
                    arrayList3 = arrayList2;
                    layoutDirection = i22;
                    cVar2 = cVar;
                    i26 = i23;
                    a7 = rect4;
                    a4 = rect5;
                    a2 = rect6;
                }
                c cVar4 = cVar2;
                int i32 = layoutDirection;
                O.c cVar5 = dVar2;
                i8 = i26;
                Rect rect10 = a7;
                rect = a4;
                Rect rect11 = a2;
                ArrayList arrayList4 = arrayList3;
                int i33 = size;
                c(view, rect, true);
                if (cVar4.f1608f == 0 || rect.isEmpty()) {
                    i9 = i32;
                    rect2 = rect11;
                } else {
                    i9 = i32;
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar4.f1608f, i9);
                    int i34 = absoluteGravity & 112;
                    if (i34 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i34 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i35 = absoluteGravity & 7;
                    if (i35 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i35 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (cVar4.f1609g != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = U.f5037a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        c cVar6 = (c) view.getLayoutParams();
                        cVar6.getClass();
                        Rect a11 = a();
                        Rect a12 = a();
                        a12.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        a11.set(a12);
                        a12.setEmpty();
                        cVar5.c(a12);
                        if (a11.isEmpty()) {
                            a11.setEmpty();
                            cVar5.c(a11);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(cVar6.f1609g, i9);
                            if ((absoluteGravity2 & 48) != 48 || (i20 = (a11.top - ((ViewGroup.MarginLayoutParams) cVar6).topMargin) - cVar6.f1611i) >= (i21 = rect2.top)) {
                                z4 = false;
                            } else {
                                m(view, i21 - i20);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a11.bottom) - ((ViewGroup.MarginLayoutParams) cVar6).bottomMargin) + cVar6.f1611i) < (i19 = rect2.bottom)) {
                                m(view, height - i19);
                                z4 = true;
                            }
                            if (z4) {
                                i13 = 0;
                            } else {
                                i13 = 0;
                                m(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i17 = (a11.left - ((ViewGroup.MarginLayoutParams) cVar6).leftMargin) - cVar6.f1610h) >= (i18 = rect2.left)) {
                                i14 = i13;
                            } else {
                                l(view, i18 - i17);
                                i14 = 1;
                            }
                            if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - a11.right) - ((ViewGroup.MarginLayoutParams) cVar6).rightMargin) + cVar6.f1610h) >= (i16 = rect2.right)) {
                                i15 = i14;
                            } else {
                                l(view, width - i16);
                                i15 = 1;
                            }
                            if (i15 == 0) {
                                l(view, i13);
                            }
                            a11.setEmpty();
                            cVar5.c(a11);
                            i10 = i7;
                            if (i10 == 2) {
                                rect3 = rect10;
                                rect3.set(((c) view.getLayoutParams()).f1613l);
                                if (rect3.equals(rect)) {
                                    i12 = i33;
                                    arrayList = arrayList4;
                                } else {
                                    ((c) view.getLayoutParams()).f1613l.set(rect);
                                }
                            } else {
                                rect3 = rect10;
                            }
                            i11 = i8 + 1;
                            i12 = i33;
                            while (true) {
                                arrayList = arrayList4;
                                if (i11 >= i12) {
                                    ((c) ((View) arrayList.get(i11)).getLayoutParams()).getClass();
                                    i11++;
                                    arrayList4 = arrayList;
                                }
                            }
                        }
                    }
                }
                i10 = i7;
                if (i10 == 2) {
                }
                i11 = i8 + 1;
                i12 = i33;
                while (true) {
                    arrayList = arrayList4;
                    if (i11 >= i12) {
                        break;
                    }
                    ((c) ((View) arrayList.get(i11)).getLayoutParams()).getClass();
                    i11++;
                    arrayList4 = arrayList;
                }
            }
            i26 = i8 + 1;
            a4 = rect;
            i25 = i10;
            a7 = rect3;
            arrayList3 = arrayList;
            size = i12;
            a2 = rect2;
            layoutDirection = i9;
        }
    }

    public final void i(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        ArrayList arrayList = this.f9040c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        C0090i c0090i = f9030J;
        if (c0090i != null) {
            Collections.sort(arrayList, c0090i);
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((c) ((View) arrayList.get(i8)).getLayoutParams()).getClass();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        O.c cVar;
        ArrayList arrayList = this.f9038a;
        arrayList.clear();
        g gVar = this.f9039b;
        l lVar = (l) gVar.f14675b;
        int i7 = lVar.f16007c;
        int i8 = 0;
        while (true) {
            cVar = (O.c) gVar.f14674a;
            if (i8 >= i7) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) lVar.j(i8);
            if (arrayList2 != null) {
                arrayList2.clear();
                cVar.c(arrayList2);
            }
            i8++;
        }
        lVar.clear();
        int childCount = getChildCount();
        int i9 = 0;
        loop1: while (true) {
            l lVar2 = (l) gVar.f14675b;
            if (i9 >= childCount) {
                ArrayList arrayList3 = (ArrayList) gVar.f14676c;
                arrayList3.clear();
                HashSet hashSet = (HashSet) gVar.f14677d;
                hashSet.clear();
                int i10 = lVar2.f16007c;
                for (int i11 = 0; i11 < i10; i11++) {
                    gVar.p(lVar2.h(i11), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i9);
            c g3 = g(childAt);
            int i12 = g3.f1607e;
            if (i12 == -1) {
                g3.f1612k = null;
                g3.j = null;
            } else {
                View view = g3.j;
                if (view != null && view.getId() == i12) {
                    View view2 = g3.j;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            g3.f1612k = null;
                            g3.j = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    g3.f1612k = view2;
                }
                View findViewById = findViewById(i12);
                g3.j = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i12) + " to anchor view " + childAt);
                    }
                    g3.f1612k = null;
                    g3.j = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            g3.f1612k = null;
                            g3.j = null;
                        }
                    }
                    g3.f1612k = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    g3.f1612k = null;
                    g3.j = null;
                }
            }
            if (!lVar2.containsKey(childAt)) {
                lVar2.put(childAt, null);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                if (i13 != i9) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != g3.f1612k) {
                        WeakHashMap weakHashMap = U.f5037a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((c) childAt2.getLayoutParams()).f1608f, layoutDirection);
                        if (absoluteGravity == 0) {
                            continue;
                        } else if ((Gravity.getAbsoluteGravity(g3.f1609g, layoutDirection) & absoluteGravity) != absoluteGravity) {
                            continue;
                        }
                    }
                    if (!lVar2.containsKey(childAt2) && !lVar2.containsKey(childAt2)) {
                        lVar2.put(childAt2, null);
                    }
                    if (!lVar2.containsKey(childAt2) || !lVar2.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) lVar2.getOrDefault(childAt2, null);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) cVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        lVar2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i9++;
        }
    }

    public final void k() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((c) getChildAt(i7).getLayoutParams()).getClass();
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((c) getChildAt(i8).getLayoutParams()).getClass();
        }
        this.f9041d = false;
    }

    public final void n() {
        WeakHashMap weakHashMap = U.f5037a;
        if (!getFitsSystemWindows()) {
            I.u(this, null);
            return;
        }
        if (this.f9036E == null) {
            this.f9036E = new x0(this, 2);
        }
        I.u(this, this.f9036E);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
        if (this.f9046z) {
            if (this.f9045y == null) {
                this.f9045y = new D.d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9045y);
        }
        if (this.f9032A == null) {
            WeakHashMap weakHashMap = U.f5037a;
            if (getFitsSystemWindows()) {
                G.c(this);
            }
        }
        this.f9042e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        if (this.f9046z && this.f9045y != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9045y);
        }
        View view = this.f9044x;
        if (view != null) {
            onStopNestedScroll(view, 0);
        }
        this.f9042e = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9033B || this.f9034C == null) {
            return;
        }
        q0 q0Var = this.f9032A;
        int d7 = q0Var != null ? q0Var.d() : 0;
        if (d7 > 0) {
            this.f9034C.setBounds(0, 0, getWidth(), d7);
            this.f9034C.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            k();
        }
        i(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        k();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        ArrayList arrayList;
        Rect rect;
        WeakHashMap weakHashMap = U.f5037a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f9038a;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            View view = (View) arrayList2.get(i11);
            if (view.getVisibility() == 8) {
                arrayList = arrayList2;
            } else {
                ((c) view.getLayoutParams()).getClass();
                c cVar = (c) view.getLayoutParams();
                View view2 = cVar.j;
                if (view2 == null && cVar.f1607e != -1) {
                    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
                }
                d dVar = f9031K;
                if (view2 != null) {
                    Rect a2 = a();
                    Rect a4 = a();
                    try {
                        d(view2, a2);
                        c cVar2 = (c) view.getLayoutParams();
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        arrayList = arrayList2;
                        rect = a4;
                        try {
                            e(layoutDirection, a2, a4, cVar2, measuredWidth, measuredHeight);
                            b(cVar2, rect, measuredWidth, measuredHeight);
                            view.layout(rect.left, rect.top, rect.right, rect.bottom);
                            a2.setEmpty();
                            dVar.c(a2);
                            rect.setEmpty();
                            dVar.c(rect);
                        } catch (Throwable th) {
                            th = th;
                            a2.setEmpty();
                            dVar.c(a2);
                            rect.setEmpty();
                            dVar.c(rect);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        rect = a4;
                    }
                } else {
                    arrayList = arrayList2;
                    int i12 = cVar.f1606d;
                    if (i12 >= 0) {
                        c cVar3 = (c) view.getLayoutParams();
                        int i13 = cVar3.f1604b;
                        if (i13 == 0) {
                            i13 = 8388661;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i13, layoutDirection);
                        int i14 = absoluteGravity & 7;
                        int i15 = absoluteGravity & 112;
                        int width = getWidth();
                        int height = getHeight();
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (layoutDirection == 1) {
                            i12 = width - i12;
                        }
                        int f7 = f(i12) - measuredWidth2;
                        if (i14 == 1) {
                            f7 += measuredWidth2 / 2;
                        } else if (i14 == 5) {
                            f7 += measuredWidth2;
                        }
                        int i16 = i15 != 16 ? i15 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
                        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin, Math.min(f7, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) cVar3).rightMargin));
                        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar3).topMargin, Math.min(i16, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) cVar3).bottomMargin));
                        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    } else {
                        c cVar4 = (c) view.getLayoutParams();
                        Rect a7 = a();
                        a7.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar4).bottomMargin);
                        if (this.f9032A != null) {
                            WeakHashMap weakHashMap2 = U.f5037a;
                            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                                a7.left = this.f9032A.b() + a7.left;
                                a7.top = this.f9032A.d() + a7.top;
                                a7.right -= this.f9032A.c();
                                a7.bottom -= this.f9032A.a();
                            }
                        }
                        Rect a8 = a();
                        int i17 = cVar4.f1604b;
                        if ((i17 & 7) == 0) {
                            i17 |= 8388611;
                        }
                        if ((i17 & 112) == 0) {
                            i17 |= 48;
                        }
                        Gravity.apply(i17, view.getMeasuredWidth(), view.getMeasuredHeight(), a7, a8, layoutDirection);
                        view.layout(a8.left, a8.top, a8.right, a8.bottom);
                        a7.setEmpty();
                        dVar.c(a7);
                        a8.setEmpty();
                        dVar.c(a8);
                    }
                }
            }
            i11++;
            arrayList2 = arrayList;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z7;
        int i16;
        ArrayList arrayList;
        boolean z8;
        int max;
        j();
        int childCount = getChildCount();
        int i17 = 0;
        loop0: while (true) {
            if (i17 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = getChildAt(i17);
            l lVar = (l) this.f9039b.f14675b;
            int i18 = lVar.f16007c;
            for (int i19 = 0; i19 < i18; i19++) {
                ArrayList arrayList2 = (ArrayList) lVar.j(i19);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i17++;
        }
        if (z4 != this.f9046z) {
            if (z4) {
                if (this.f9042e) {
                    if (this.f9045y == null) {
                        this.f9045y = new D.d(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f9045y);
                }
                this.f9046z = true;
            } else {
                if (this.f9042e && this.f9045y != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f9045y);
                }
                this.f9046z = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = U.f5037a;
        int layoutDirection = getLayoutDirection();
        boolean z9 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z10 = this.f9032A != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f9038a;
        int size3 = arrayList3.size();
        int i22 = suggestedMinimumWidth;
        int i23 = suggestedMinimumHeight;
        int i24 = 0;
        int i25 = 0;
        while (i25 < size3) {
            View view = (View) arrayList3.get(i25);
            if (view.getVisibility() == 8) {
                i15 = i25;
                i16 = size3;
                arrayList = arrayList3;
                z8 = true;
                z7 = false;
            } else {
                c cVar = (c) view.getLayoutParams();
                int i26 = cVar.f1606d;
                if (i26 < 0 || mode == 0) {
                    i9 = i24;
                    i10 = i25;
                } else {
                    int f7 = f(i26);
                    i9 = i24;
                    int i27 = cVar.f1604b;
                    if (i27 == 0) {
                        i27 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, layoutDirection) & 7;
                    i10 = i25;
                    if ((absoluteGravity == 3 && !z9) || (absoluteGravity == 5 && z9)) {
                        max = Math.max(0, (size - paddingRight) - f7);
                    } else if ((absoluteGravity == 5 && !z9) || (absoluteGravity == 3 && z9)) {
                        max = Math.max(0, f7 - paddingLeft);
                    }
                    i11 = max;
                    if (z10 || view.getFitsSystemWindows()) {
                        i12 = i23;
                        i13 = i7;
                        i14 = i8;
                    } else {
                        int c3 = this.f9032A.c() + this.f9032A.b();
                        i12 = i23;
                        int a2 = this.f9032A.a() + this.f9032A.d();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - c3, mode);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - a2, mode2);
                        i13 = makeMeasureSpec;
                        i14 = makeMeasureSpec2;
                    }
                    int i28 = i9;
                    i15 = i10;
                    z7 = false;
                    int i29 = i22;
                    int i30 = i11;
                    i16 = size3;
                    arrayList = arrayList3;
                    measureChildWithMargins(view, i13, i30, i14, 0);
                    int max2 = Math.max(i29, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                    int max3 = Math.max(i12, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    i22 = max2;
                    i24 = View.combineMeasuredStates(i28, view.getMeasuredState());
                    z8 = true;
                    i23 = max3;
                }
                i11 = 0;
                if (z10) {
                }
                i12 = i23;
                i13 = i7;
                i14 = i8;
                int i282 = i9;
                i15 = i10;
                z7 = false;
                int i292 = i22;
                int i302 = i11;
                i16 = size3;
                arrayList = arrayList3;
                measureChildWithMargins(view, i13, i302, i14, 0);
                int max22 = Math.max(i292, view.getMeasuredWidth() + i20 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                int max32 = Math.max(i12, view.getMeasuredHeight() + i21 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                i22 = max22;
                i24 = View.combineMeasuredStates(i282, view.getMeasuredState());
                z8 = true;
                i23 = max32;
            }
            i25 = i15 + 1;
            size3 = i16;
            arrayList3 = arrayList;
        }
        int i31 = i22;
        int i32 = i24;
        setMeasuredDimension(View.resolveSizeAndState(i31, i7, (-16777216) & i32), View.resolveSizeAndState(i23, i8, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z4) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ((c) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ((c) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        onNestedScroll(view, i7, i8, i9, i10, 0);
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i8) {
        C0364u c0364u = this.f9037F;
        if (i8 == 1) {
            c0364u.f5111b = i7;
        } else {
            c0364u.f5110a = i7;
        }
        this.f9044x = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((c) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((SavedState) parcelable).f9102a);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            childAt.getId();
            g(childAt);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            childAt.getId();
            ((c) childAt.getLayoutParams()).getClass();
        }
        savedState.f9047c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        onStartNestedScroll(view, view2, i7, 0);
        return false;
    }

    @Override // P.InterfaceC0362s
    public final void onStopNestedScroll(View view, int i7) {
        C0364u c0364u = this.f9037F;
        if (i7 == 1) {
            c0364u.f5111b = 0;
        } else {
            c0364u.f5110a = 0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((c) getChildAt(i8).getLayoutParams()).getClass();
        }
        this.f9044x = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        i(motionEvent);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            k();
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        ((c) view.getLayoutParams()).getClass();
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f9041d) {
            return;
        }
        k();
        this.f9041d = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        n();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9035D = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f9034C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9034C = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f9034C.setState(getDrawableState());
                }
                Drawable drawable3 = this.f9034C;
                WeakHashMap weakHashMap = U.f5037a;
                J.b.b(drawable3, getLayoutDirection());
                this.f9034C.setVisible(getVisibility() == 0, false);
                this.f9034C.setCallback(this);
            }
            WeakHashMap weakHashMap2 = U.f5037a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        setStatusBarBackground(i7 != 0 ? h.getDrawable(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z4 = i7 == 0;
        Drawable drawable = this.f9034C;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f9034C.setVisible(z4, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9034C;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c ? new c((c) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // P.InterfaceC0362s
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ((c) childAt.getLayoutParams()).getClass();
            }
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // P.InterfaceC0362s
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ((c) childAt.getLayoutParams()).getClass();
            }
        }
    }

    @Override // P.InterfaceC0362s
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ((c) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }
}
