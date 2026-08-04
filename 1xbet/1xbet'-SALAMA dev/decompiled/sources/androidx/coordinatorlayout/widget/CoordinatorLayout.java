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
import androidx.customview.view.AbsSavedState;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p072k1.g;
import p122r.l;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0362s {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f9027G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Class[] f9028H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final ThreadLocal f9029I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final C0090i f9030J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final d f9031K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public q0 f9032A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9033B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f9034C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f9035D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public x0 f9036E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0364u f9037F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f9039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9043f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f9044x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public D.d f9045y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9046z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray f9047c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i7 = parcel.readInt();
            int[] iArr = new int[i7];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f9047c = new SparseArray(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                this.f9047c.append(iArr[i8], parcelableArray[i8]);
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
        Package r7 = CoordinatorLayout.class.getPackage();
        f9027G = r7 != null ? r7.getName() : null;
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
        TypedArray typedArrayObtainStyledAttributes = i7 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f9043f = intArray;
            float f7 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i8 = 0; i8 < length; i8++) {
                int[] iArr2 = this.f9043f;
                iArr2[i8] = (int) (iArr2[i8] * f7);
            }
        }
        this.f9034C = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        n();
        super.setOnHierarchyChangeListener(new b(this));
    }

    public static Rect a() {
        Rect rect = (Rect) f9031K.a();
        return rect == null ? new Rect() : rect;
    }

    public static void e(int i7, Rect rect, Rect rect2, c cVar, int i8, int i9) {
        int iWidth;
        int iHeight;
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
        if (i14 != 1) {
            iWidth = i14 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i15 != 16) {
            iHeight = i15 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i12 == 1) {
            iWidth -= i8 / 2;
        } else if (i12 != 5) {
            iWidth -= i8;
        }
        if (i13 == 16) {
            iHeight -= i9 / 2;
        } else if (i13 != 80) {
            iHeight -= i9;
        }
        rect2.set(iWidth, iHeight, i8 + iWidth, i9 + iHeight);
    }

    public static c g(View view) {
        c cVar = (c) view.getLayoutParams();
        if (!cVar.f1603a) {
            D.a aVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                aVar = (D.a) superclass.getAnnotation(D.a.class);
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
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(iMax, iMax2, i7 + iMax, i8 + iMax2);
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

    /* JADX WARN: Code duplicated, block: B:26:0x00db  */
    /* JADX WARN: Code duplicated, block: B:94:0x0261  */
    public final void h(int i7) {
        int i8;
        Rect rect;
        int i9;
        Rect rect2;
        int i10;
        Rect rect3;
        int i11;
        ArrayList arrayList;
        boolean z4;
        int i12;
        int i13;
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        int height;
        int i18;
        int i19;
        int i20;
        d dVar;
        int i21 = i7;
        WeakHashMap weakHashMap = U.f5037a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f9038a;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i22 = 0;
        while (true) {
            d dVar2 = f9031K;
            if (i22 >= size) {
                Rect rect4 = rectA3;
                Rect rect5 = rectA2;
                Rect rect6 = rectA;
                rect6.setEmpty();
                dVar2.c(rect6);
                rect5.setEmpty();
                dVar2.c(rect5);
                rect4.setEmpty();
                dVar2.c(rect4);
                return;
            }
            View view = (View) arrayList2.get(i22);
            c cVar = (c) view.getLayoutParams();
            if (i21 == 0 && view.getVisibility() == 8) {
                i10 = i21;
                i9 = layoutDirection;
                i8 = i22;
                rect3 = rectA3;
                rect = rectA2;
                rect2 = rectA;
                i11 = size;
                arrayList = arrayList2;
            } else {
                int i23 = 0;
                while (i23 < i22) {
                    if (cVar.f1612k == ((View) arrayList2.get(i23))) {
                        c cVar2 = (c) view.getLayoutParams();
                        if (cVar2.j != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rectA6 = a();
                            d(cVar2.j, rectA4);
                            c(view, rectA5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            dVar = dVar2;
                            e(layoutDirection, rectA4, rectA6, cVar2, measuredWidth, measuredHeight);
                            if (rectA6.left == rectA5.left) {
                                int i24 = rectA6.top;
                                int i25 = rectA5.top;
                            }
                            b(cVar2, rectA6, measuredWidth, measuredHeight);
                            int i26 = rectA6.left - rectA5.left;
                            int i27 = rectA6.top - rectA5.top;
                            if (i26 != 0) {
                                WeakHashMap weakHashMap2 = U.f5037a;
                                view.offsetLeftAndRight(i26);
                            }
                            if (i27 != 0) {
                                WeakHashMap weakHashMap3 = U.f5037a;
                                view.offsetTopAndBottom(i27);
                            }
                            rectA4.setEmpty();
                            dVar.c(rectA4);
                            rectA5.setEmpty();
                            dVar.c(rectA5);
                            rectA6.setEmpty();
                            dVar.c(rectA6);
                        } else {
                            dVar = dVar2;
                        }
                    } else {
                        dVar = dVar2;
                    }
                    i23++;
                    dVar2 = dVar;
                    size = size;
                    arrayList2 = arrayList2;
                    layoutDirection = layoutDirection;
                    cVar = cVar;
                    i22 = i22;
                    rectA3 = rectA3;
                    rectA2 = rectA2;
                    rectA = rectA;
                }
                c cVar3 = cVar;
                int i28 = layoutDirection;
                O.c cVar4 = dVar2;
                i8 = i22;
                Rect rect7 = rectA3;
                rect = rectA2;
                Rect rect8 = rectA;
                ArrayList arrayList3 = arrayList2;
                int i29 = size;
                c(view, rect, true);
                if (cVar3.f1608f == 0 || rect.isEmpty()) {
                    i9 = i28;
                    rect2 = rect8;
                } else {
                    i9 = i28;
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar3.f1608f, i9);
                    int i30 = absoluteGravity & 112;
                    if (i30 == 48) {
                        rect2 = rect8;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i30 != 80) {
                        rect2 = rect8;
                    } else {
                        rect2 = rect8;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i31 = absoluteGravity & 7;
                    if (i31 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i31 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (cVar3.f1609g != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = U.f5037a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        c cVar5 = (c) view.getLayoutParams();
                        cVar5.getClass();
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        rectA7.set(rectA8);
                        rectA8.setEmpty();
                        cVar4.c(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            cVar4.c(rectA7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(cVar5.f1609g, i9);
                            if ((absoluteGravity2 & 48) != 48 || (i19 = (rectA7.top - ((ViewGroup.MarginLayoutParams) cVar5).topMargin) - cVar5.f1611i) >= (i20 = rect2.top)) {
                                z4 = false;
                            } else {
                                m(view, i20 - i19);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) cVar5).bottomMargin) + cVar5.f1611i) < (i18 = rect2.bottom)) {
                                m(view, height - i18);
                                z4 = true;
                            }
                            if (z4) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                                m(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i16 = (rectA7.left - ((ViewGroup.MarginLayoutParams) cVar5).leftMargin) - cVar5.f1610h) >= (i17 = rect2.left)) {
                                i13 = i12;
                            } else {
                                l(view, i17 - i16);
                                i13 = 1;
                            }
                            if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) cVar5).rightMargin) + cVar5.f1610h) >= (i15 = rect2.right)) {
                                i14 = i13;
                            } else {
                                l(view, width - i15);
                                i14 = 1;
                            }
                            if (i14 == 0) {
                                l(view, i12);
                            }
                            rectA7.setEmpty();
                            cVar4.c(rectA7);
                        }
                    }
                }
                i10 = i7;
                if (i10 != 2) {
                    rect3 = rect7;
                    rect3.set(((c) view.getLayoutParams()).f1613l);
                    if (rect3.equals(rect)) {
                        i11 = i29;
                        arrayList = arrayList3;
                    } else {
                        ((c) view.getLayoutParams()).f1613l.set(rect);
                    }
                } else {
                    rect3 = rect7;
                }
                int i32 = i8 + 1;
                i11 = i29;
                while (true) {
                    arrayList = arrayList3;
                    if (i32 < i11) {
                        ((c) ((View) arrayList.get(i32)).getLayoutParams()).getClass();
                        i32++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i22 = i8 + 1;
            rectA2 = rect;
            i21 = i10;
            rectA3 = rect3;
            arrayList2 = arrayList;
            size = i11;
            rectA = rect2;
            layoutDirection = i9;
        }
    }

    public final void i(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        ArrayList arrayList = this.f9040c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
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

    /* JADX WARN: Code duplicated, block: B:100:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.j():void");
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
        int iD = q0Var != null ? q0Var.d() : 0;
        if (iD > 0) {
            this.f9034C.setBounds(0, 0, getWidth(), iD);
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
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) throws Throwable {
        ArrayList arrayList;
        int i11;
        Rect rect;
        WeakHashMap weakHashMap = U.f5037a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f9038a;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            View view = (View) arrayList2.get(i12);
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
                    Rect rectA = a();
                    Rect rectA2 = a();
                    try {
                        d(view2, rectA);
                        c cVar2 = (c) view.getLayoutParams();
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        arrayList = arrayList2;
                        rect = rectA2;
                        try {
                            e(layoutDirection, rectA, rectA2, cVar2, measuredWidth, measuredHeight);
                            b(cVar2, rect, measuredWidth, measuredHeight);
                            view.layout(rect.left, rect.top, rect.right, rect.bottom);
                            rectA.setEmpty();
                            dVar.c(rectA);
                            rect.setEmpty();
                            dVar.c(rect);
                        } catch (Throwable th) {
                            th = th;
                            rectA.setEmpty();
                            dVar.c(rectA);
                            rect.setEmpty();
                            dVar.c(rect);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        rect = rectA2;
                    }
                } else {
                    arrayList = arrayList2;
                    int i13 = cVar.f1606d;
                    if (i13 >= 0) {
                        c cVar3 = (c) view.getLayoutParams();
                        int i14 = cVar3.f1604b;
                        if (i14 == 0) {
                            i14 = 8388661;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i14, layoutDirection);
                        int i15 = absoluteGravity & 7;
                        int i16 = absoluteGravity & 112;
                        int width = getWidth();
                        int height = getHeight();
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (layoutDirection == 1) {
                            i13 = width - i13;
                        }
                        int iF = f(i13) - measuredWidth2;
                        if (i15 == 1) {
                            iF += measuredWidth2 / 2;
                        } else if (i15 == 5) {
                            iF += measuredWidth2;
                        }
                        if (i16 != 16) {
                            i11 = i16 != 80 ? 0 : measuredHeight2;
                        } else {
                            i11 = measuredHeight2 / 2;
                        }
                        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin, Math.min(iF, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) cVar3).rightMargin));
                        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar3).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) cVar3).bottomMargin));
                        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
                    } else {
                        c cVar4 = (c) view.getLayoutParams();
                        Rect rectA3 = a();
                        rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar4).bottomMargin);
                        if (this.f9032A != null) {
                            WeakHashMap weakHashMap2 = U.f5037a;
                            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                                rectA3.left = this.f9032A.b() + rectA3.left;
                                rectA3.top = this.f9032A.d() + rectA3.top;
                                rectA3.right -= this.f9032A.c();
                                rectA3.bottom -= this.f9032A.a();
                            }
                        }
                        Rect rectA4 = a();
                        int i17 = cVar4.f1604b;
                        if ((i17 & 7) == 0) {
                            i17 |= 8388611;
                        }
                        if ((i17 & 112) == 0) {
                            i17 |= 48;
                        }
                        Gravity.apply(i17, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, layoutDirection);
                        view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
                        rectA3.setEmpty();
                        dVar.c(rectA3);
                        rectA4.setEmpty();
                        dVar.c(rectA4);
                    }
                }
            }
            i12++;
            arrayList2 = arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z7;
        boolean z8;
        int iMax;
        j();
        int childCount = getChildCount();
        int i15 = 0;
        loop0: while (true) {
            if (i15 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = getChildAt(i15);
            l lVar = (l) this.f9039b.f14681b;
            int i16 = lVar.f16013c;
            for (int i17 = 0; i17 < i16; i17++) {
                ArrayList arrayList = (ArrayList) lVar.j(i17);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i15++;
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
        int i18 = paddingLeft + paddingRight;
        int i19 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z10 = this.f9032A != null && getFitsSystemWindows();
        ArrayList arrayList2 = this.f9038a;
        int size3 = arrayList2.size();
        int i20 = suggestedMinimumWidth;
        int i21 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i22 = 0;
        while (i22 < size3) {
            View view = (View) arrayList2.get(i22);
            if (view.getVisibility() == 8) {
                i14 = i22;
                z8 = true;
                z7 = false;
            } else {
                c cVar = (c) view.getLayoutParams();
                int i23 = cVar.f1606d;
                if (i23 < 0 || mode == 0) {
                    i9 = iCombineMeasuredStates;
                    i10 = i22;
                } else {
                    int iF = f(i23);
                    i9 = iCombineMeasuredStates;
                    int i24 = cVar.f1604b;
                    if (i24 == 0) {
                        i24 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, layoutDirection) & 7;
                    i10 = i22;
                    if ((absoluteGravity != 3 || z9) && !(absoluteGravity == 5 && z9)) {
                        if ((absoluteGravity == 5 && !z9) || (absoluteGravity == 3 && z9)) {
                            iMax = Math.max(0, iF - paddingLeft);
                        }
                        if (z10 || view.getFitsSystemWindows()) {
                            i12 = i7;
                            i13 = i8;
                        } else {
                            int iC = this.f9032A.c() + this.f9032A.b();
                            int iA = this.f9032A.a() + this.f9032A.d();
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                            i12 = iMakeMeasureSpec;
                            i13 = iMakeMeasureSpec2;
                        }
                        int i25 = i9;
                        i14 = i10;
                        z7 = false;
                        measureChildWithMargins(view, i12, i11, i13, 0);
                        int iMax2 = Math.max(i20, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                        int iMax3 = Math.max(i21, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                        i20 = iMax2;
                        iCombineMeasuredStates = View.combineMeasuredStates(i25, view.getMeasuredState());
                        z8 = true;
                        i21 = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iF);
                    }
                    i11 = iMax;
                    if (z10) {
                        i12 = i7;
                        i13 = i8;
                    } else {
                        i12 = i7;
                        i13 = i8;
                    }
                    int i26 = i9;
                    i14 = i10;
                    z7 = false;
                    measureChildWithMargins(view, i12, i11, i13, 0);
                    int iMax4 = Math.max(i20, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                    int iMax5 = Math.max(i21, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    i20 = iMax4;
                    iCombineMeasuredStates = View.combineMeasuredStates(i26, view.getMeasuredState());
                    z8 = true;
                    i21 = iMax5;
                }
                i11 = 0;
                if (z10) {
                    i12 = i7;
                    i13 = i8;
                } else {
                    i12 = i7;
                    i13 = i8;
                }
                int i27 = i9;
                i14 = i10;
                z7 = false;
                measureChildWithMargins(view, i12, i11, i13, 0);
                int iMax6 = Math.max(i20, view.getMeasuredWidth() + i18 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                int iMax7 = Math.max(i21, view.getMeasuredHeight() + i19 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                i20 = iMax6;
                iCombineMeasuredStates = View.combineMeasuredStates(i27, view.getMeasuredState());
                z8 = true;
                i21 = iMax7;
            }
            i22 = i14 + 1;
            size3 = size3;
            arrayList2 = arrayList2;
        }
        int i28 = i20;
        int i29 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i28, i7, (-16777216) & i29), View.resolveSizeAndState(i21, i8, i29 << 16));
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
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            k();
        }
        return zOnTouchEvent;
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
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f9034C = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
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
        if (layoutParams instanceof c) {
            return new c((c) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
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
