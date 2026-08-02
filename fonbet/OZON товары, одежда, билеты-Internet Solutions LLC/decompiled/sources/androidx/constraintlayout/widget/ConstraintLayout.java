package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import f2.C6405e;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m2.d;
import m2.e;
import m2.m;
import n2.C8420b;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static j sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private f mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected m2.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private C6405e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<m2.e> mTempMapIdToWidget;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41593a;

        static {
            int[] iArr = new int[e.b.values().length];
            f41593a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41593a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41593a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41593a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements C8420b.InterfaceC1286b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f41664a;

        /* renamed from: b, reason: collision with root package name */
        int f41665b;

        /* renamed from: c, reason: collision with root package name */
        int f41666c;

        /* renamed from: d, reason: collision with root package name */
        int f41667d;

        /* renamed from: e, reason: collision with root package name */
        int f41668e;

        /* renamed from: f, reason: collision with root package name */
        int f41669f;

        /* renamed from: g, reason: collision with root package name */
        int f41670g;

        public c(ConstraintLayout constraintLayout) {
            this.f41664a = constraintLayout;
        }

        private static boolean c(int i11, int i12, int i13) {
            if (i11 == i12) {
                return ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            int mode = View.MeasureSpec.getMode(i11);
            View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i13 == size) {
                return ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            return false;
        }

        @Override // n2.C8420b.InterfaceC1286b
        public final void a() {
            ConstraintLayout constraintLayout = this.f41664a;
            int childCount = constraintLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = constraintLayout.getChildAt(i11);
                if (childAt instanceof g) {
                    ((g) childAt).b();
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    ((androidx.constraintlayout.widget.b) constraintLayout.mConstraintHelpers.get(i12)).updatePostMeasure(constraintLayout);
                }
            }
        }

        @Override // n2.C8420b.InterfaceC1286b
        @SuppressLint({"WrongCall"})
        public final void b(m2.e eVar, C8420b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int max2;
            int i11;
            int i12;
            int childMeasureSpec;
            if (eVar == null) {
                return;
            }
            if (eVar.M() == 8 && !eVar.Z()) {
                aVar.f76300e = 0;
                aVar.f76301f = 0;
                aVar.f76302g = 0;
                return;
            }
            if (eVar.f74116W == null) {
                return;
            }
            e.b bVar = aVar.f76296a;
            e.b bVar2 = aVar.f76297b;
            int i13 = aVar.f76298c;
            int i14 = aVar.f76299d;
            int i15 = this.f41665b + this.f41666c;
            int i16 = this.f41667d;
            View view = (View) eVar.r();
            int[] iArr = a.f41593a;
            int i17 = iArr[bVar.ordinal()];
            m2.d dVar = eVar.f74106M;
            m2.d dVar2 = eVar.f74104K;
            if (i17 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (i17 != 2) {
                if (i17 == 3) {
                    int i18 = this.f41669f;
                    int i19 = dVar2 != null ? dVar2.f74091g : 0;
                    if (dVar != null) {
                        i19 += dVar.f74091g;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i18, i16 + i19, -1);
                } else if (i17 != 4) {
                    makeMeasureSpec = 0;
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f41669f, i16, -2);
                    boolean z11 = eVar.f74156s == 1;
                    int i21 = aVar.f76305j;
                    if (i21 == 1 || i21 == 2) {
                        boolean z12 = view.getMeasuredHeight() == eVar.v() ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
                        if (aVar.f76305j == 2 || !z11 || ((z11 && z12) || (view instanceof g) || eVar.d0())) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.N(), 1073741824);
                        }
                    }
                }
                makeMeasureSpec = childMeasureSpec;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f41669f, i16, -2);
            }
            int i22 = iArr[bVar2.ordinal()];
            if (i22 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else if (i22 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f41670g, i15, -2);
            } else if (i22 == 3) {
                int i23 = this.f41670g;
                int i24 = dVar2 != null ? eVar.f74105L.f74091g : 0;
                if (dVar != null) {
                    i24 += eVar.f74107N.f74091g;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i23, i15 + i24, -1);
            } else if (i22 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f41670g, i15, -2);
                boolean z13 = eVar.f74158t == 1;
                int i25 = aVar.f76305j;
                if (i25 == 1 || i25 == 2) {
                    boolean z14 = view.getMeasuredWidth() == eVar.N() ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
                    if (aVar.f76305j == 2 || !z13 || ((z13 && z14) || (view instanceof g) || eVar.e0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                    }
                }
            }
            m2.f fVar = (m2.f) eVar.f74116W;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (fVar != null && m2.k.b(constraintLayout.mOptimizationLevel, 256) && view.getMeasuredWidth() == eVar.N() && view.getMeasuredWidth() < fVar.N() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.o() && !eVar.c0() && c(eVar.y(), makeMeasureSpec, eVar.N()) && c(eVar.z(), makeMeasureSpec2, eVar.v())) {
                aVar.f76300e = eVar.N();
                aVar.f76301f = eVar.v();
                aVar.f76302g = eVar.o();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z15 = bVar == bVar3 ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
            boolean z16 = bVar2 == bVar3 ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z17 = (bVar2 == bVar4 || bVar2 == e.b.FIXED) ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
            boolean z18 = (bVar == bVar4 || bVar == e.b.FIXED) ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
            boolean z19 = (!z15 || eVar.f74119Z <= 0.0f) ? false : ConstraintLayout.USE_CONSTRAINTS_HELPER;
            boolean z21 = (!z16 || eVar.f74119Z <= 0.0f) ? false : ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i26 = aVar.f76305j;
            if (i26 != 1 && i26 != 2 && z15 && eVar.f74156s == 0 && z16 && eVar.f74158t == 0) {
                i12 = -1;
                baseline = 0;
                max = 0;
                max2 = 0;
            } else {
                if ((view instanceof l) && (eVar instanceof m)) {
                    ((l) view).onMeasure((m) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.H0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i27 = eVar.f74162v;
                max = i27 > 0 ? Math.max(i27, measuredWidth) : measuredWidth;
                int i28 = eVar.f74163w;
                if (i28 > 0) {
                    max = Math.min(i28, max);
                }
                int i29 = eVar.f74165y;
                max2 = i29 > 0 ? Math.max(i29, measuredHeight) : measuredHeight;
                boolean z22 = z18;
                int i31 = eVar.f74166z;
                if (i31 > 0) {
                    max2 = Math.min(i31, max2);
                }
                if (!m2.k.b(constraintLayout.mOptimizationLevel, 1)) {
                    if (z19 && z17) {
                        max = (int) ((max2 * eVar.f74119Z) + 0.5f);
                    } else if (z21 && z22) {
                        max2 = (int) ((max / eVar.f74119Z) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != max2) {
                    if (measuredWidth != max) {
                        i11 = 1073741824;
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    } else {
                        i11 = 1073741824;
                    }
                    if (measuredHeight != max2) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, i11);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    eVar.H0(makeMeasureSpec, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    max2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i12 = -1;
            }
            boolean z23 = baseline != i12 ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
            aVar.f76304i = (max == aVar.f76298c && max2 == aVar.f76299d) ? false : ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (bVar5.f41625c0) {
                z23 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            if (z23 && baseline != -1 && eVar.o() != baseline) {
                aVar.f76304i = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            aVar.f76300e = max;
            aVar.f76301f = max2;
            aVar.f76303h = z23;
            aVar.f76302g = baseline;
        }
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new m2.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static j getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new j();
        }
        return sSharedValues;
    }

    private final m2.e getTargetWidget(int i11) {
        if (i11 == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i11);
        if (view == null && (view = findViewById(i11)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f41653q0;
    }

    private void init(AttributeSet attributeSet, int i11, int i12) {
        this.mLayoutWidget.q0(this);
        this.mLayoutWidget.q1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f41845b, i11, i12);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = obtainStyledAttributes.getIndex(i13);
                if (index == 16) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.P(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.r1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            m2.e viewWidget = getViewWidget(getChildAt(i11));
            if (viewWidget != null) {
                viewWidget.i0();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).r0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof e)) {
                    throw null;
                }
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.h(this);
        }
        this.mLayoutWidget.f74253v0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.mConstraintHelpers.get(i14).updatePreLayout(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof g) {
                ((g) childAt3).c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            m2.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.b(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(m2.e eVar, b bVar, SparseArray<m2.e> sparseArray, int i11, d.a aVar) {
        View view = this.mChildrenByIds.get(i11);
        m2.e eVar2 = sparseArray.get(i11);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f41625c0 = USE_CONSTRAINTS_HELPER;
        d.a aVar2 = d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f41625c0 = USE_CONSTRAINTS_HELPER;
            bVar2.f41653q0.y0(USE_CONSTRAINTS_HELPER);
        }
        eVar.n(aVar2).b(eVar2.n(aVar), bVar.f41597D, bVar.f41596C, USE_CONSTRAINTS_HELPER);
        eVar.y0(USE_CONSTRAINTS_HELPER);
        eVar.n(d.a.TOP).n();
        eVar.n(d.a.BOTTOM).n();
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            if (getChildAt(i11).isLayoutRequested()) {
                z11 = USE_CONSTRAINTS_HELPER;
                break;
            }
            i11++;
        }
        if (z11) {
            setChildrenConstraints();
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void applyConstraintsFromLayoutParams(boolean z11, View view, m2.e eVar, b bVar, SparseArray<m2.e> sparseArray) {
        m2.e eVar2;
        m2.e eVar3;
        m2.e eVar4;
        m2.e eVar5;
        b bVar2;
        float f7;
        int i11;
        m2.e eVar6 = eVar;
        bVar.b();
        eVar6.S0(view.getVisibility());
        if (bVar.f41631f0) {
            eVar6.F0();
            eVar6.S0(8);
        }
        eVar6.q0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).resolveRtl(eVar6, this.mLayoutWidget.l1());
        }
        if (bVar.f41627d0) {
            m2.h hVar = (m2.h) eVar6;
            int i12 = bVar.f41647n0;
            int i13 = bVar.f41649o0;
            float f11 = bVar.f41651p0;
            if (f11 != -1.0f) {
                hVar.h1(f11);
                return;
            } else if (i12 != -1) {
                hVar.f1(i12);
                return;
            } else {
                if (i13 != -1) {
                    hVar.g1(i13);
                    return;
                }
                return;
            }
        }
        int i14 = bVar.f41633g0;
        int i15 = bVar.f41635h0;
        int i16 = bVar.f41637i0;
        int i17 = bVar.f41639j0;
        int i18 = bVar.f41641k0;
        int i19 = bVar.f41643l0;
        float f12 = bVar.f41645m0;
        int i21 = bVar.f41650p;
        if (i21 != -1) {
            m2.e eVar7 = sparseArray.get(i21);
            if (eVar7 != null) {
                float f13 = bVar.f41654r;
                int i22 = bVar.f41652q;
                d.a aVar = d.a.CENTER;
                eVar6.U(aVar, eVar7, aVar, i22, 0);
                eVar6.f74098E = f13;
            }
            bVar2 = bVar;
        } else {
            if (i14 != -1) {
                m2.e eVar8 = sparseArray.get(i14);
                if (eVar8 != null) {
                    d.a aVar2 = d.a.LEFT;
                    eVar6.U(aVar2, eVar8, aVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
                }
            } else if (i15 != -1 && (eVar2 = sparseArray.get(i15)) != null) {
                eVar.U(d.a.LEFT, eVar2, d.a.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
            }
            if (i16 != -1) {
                m2.e eVar9 = sparseArray.get(i16);
                if (eVar9 != null) {
                    eVar.U(d.a.RIGHT, eVar9, d.a.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
                }
            } else if (i17 != -1 && (eVar3 = sparseArray.get(i17)) != null) {
                d.a aVar3 = d.a.RIGHT;
                eVar.U(aVar3, eVar3, aVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
            }
            int i23 = bVar.f41636i;
            if (i23 != -1) {
                m2.e eVar10 = sparseArray.get(i23);
                if (eVar10 != null) {
                    d.a aVar4 = d.a.TOP;
                    eVar.U(aVar4, eVar10, aVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f41660x);
                }
            } else {
                int i24 = bVar.f41638j;
                if (i24 != -1 && (eVar4 = sparseArray.get(i24)) != null) {
                    eVar.U(d.a.TOP, eVar4, d.a.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f41660x);
                }
            }
            int i25 = bVar.f41640k;
            if (i25 != -1) {
                m2.e eVar11 = sparseArray.get(i25);
                if (eVar11 != null) {
                    eVar.U(d.a.BOTTOM, eVar11, d.a.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f41662z);
                }
            } else {
                int i26 = bVar.f41642l;
                if (i26 != -1 && (eVar5 = sparseArray.get(i26)) != null) {
                    d.a aVar5 = d.a.BOTTOM;
                    eVar.U(aVar5, eVar5, aVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f41662z);
                }
            }
            int i27 = bVar.f41644m;
            if (i27 != -1) {
                bVar2 = bVar;
                setWidgetBaseline(eVar, bVar2, sparseArray, i27, d.a.BASELINE);
            } else {
                bVar2 = bVar;
                int i28 = bVar2.f41646n;
                if (i28 != -1) {
                    setWidgetBaseline(eVar, bVar2, sparseArray, i28, d.a.TOP);
                } else {
                    int i29 = bVar2.f41648o;
                    if (i29 != -1) {
                        setWidgetBaseline(eVar, bVar2, sparseArray, i29, d.a.BOTTOM);
                        eVar6 = eVar;
                        if (f12 >= 0.0f) {
                            eVar6.A0(f12);
                        }
                        f7 = bVar2.f41599F;
                        if (f7 >= 0.0f) {
                            eVar6.O0(f7);
                        }
                    }
                }
            }
            eVar6 = eVar;
            if (f12 >= 0.0f) {
            }
            f7 = bVar2.f41599F;
            if (f7 >= 0.0f) {
            }
        }
        if (z11 && ((i11 = bVar2.f41613T) != -1 || bVar2.f41614U != -1)) {
            eVar6.N0(i11, bVar2.f41614U);
        }
        if (bVar2.f41621a0) {
            eVar6.C0(e.b.FIXED);
            eVar6.T0(((ViewGroup.MarginLayoutParams) bVar2).width);
            if (((ViewGroup.MarginLayoutParams) bVar2).width == -2) {
                eVar6.C0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).width == -1) {
            if (bVar2.f41616W) {
                eVar6.C0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.C0(e.b.MATCH_PARENT);
            }
            eVar6.n(d.a.LEFT).f74091g = ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
            eVar6.n(d.a.RIGHT).f74091g = ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
        } else {
            eVar6.C0(e.b.MATCH_CONSTRAINT);
            eVar6.T0(0);
        }
        if (bVar2.f41623b0) {
            eVar6.Q0(e.b.FIXED);
            eVar6.z0(((ViewGroup.MarginLayoutParams) bVar2).height);
            if (((ViewGroup.MarginLayoutParams) bVar2).height == -2) {
                eVar6.Q0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar2).height == -1) {
            if (bVar2.f41617X) {
                eVar6.Q0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.Q0(e.b.MATCH_PARENT);
            }
            eVar6.n(d.a.TOP).f74091g = ((ViewGroup.MarginLayoutParams) bVar2).topMargin;
            eVar6.n(d.a.BOTTOM).f74091g = ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
        } else {
            eVar6.Q0(e.b.MATCH_CONSTRAINT);
            eVar6.z0(0);
        }
        eVar6.s0(bVar2.f41600G);
        float f14 = bVar2.f41601H;
        float[] fArr = eVar6.f74149o0;
        fArr[0] = f14;
        fArr[1] = bVar2.f41602I;
        eVar6.B0(bVar2.f41603J);
        eVar6.P0(bVar2.f41604K);
        eVar6.U0(bVar2.f41619Z);
        eVar6.D0(bVar2.f41605L, bVar2.f41607N, bVar2.f41609P, bVar2.f41611R);
        eVar6.R0(bVar2.f41606M, bVar2.f41608O, bVar2.f41610Q, bVar2.f41612S);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                this.mConstraintHelpers.get(i11).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i13 = (int) ((parseInt / 1080.0f) * width);
                        int i14 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i13;
                        float f11 = i14;
                        float f12 = i13 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f7, f11, f12, f11, paint);
                        float parseInt4 = i14 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f7, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f7, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f11, f12, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C6405e c6405e) {
        this.mLayoutWidget.g1();
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i11, Object obj) {
        if (i11 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.i1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f74140k == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f74140k = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f74140k = "parent";
            }
        }
        if (this.mLayoutWidget.s() == null) {
            m2.f fVar = this.mLayoutWidget;
            fVar.r0(fVar.f74140k);
            Log.v(TAG, " setDebugName " + this.mLayoutWidget.s());
        }
        Iterator<m2.e> it = this.mLayoutWidget.f74253v0.iterator();
        while (it.hasNext()) {
            m2.e next = it.next();
            View view = (View) next.r();
            if (view != null) {
                if (next.f74140k == null && (id2 = view.getId()) != -1) {
                    next.f74140k = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.s() == null) {
                    next.r0(next.f74140k);
                    Log.v(TAG, " setDebugName " + next.s());
                }
            }
        }
        this.mLayoutWidget.H(sb2);
        return sb2.toString();
    }

    public View getViewById(int i11) {
        return this.mChildrenByIds.get(i11);
    }

    public final m2.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f41653q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f41653q0;
        }
        return null;
    }

    protected boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return USE_CONSTRAINTS_HELPER;
    }

    public void loadLayoutDescription(int i11) {
        if (i11 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i11);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View a11;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            b bVar = (b) childAt.getLayoutParams();
            m2.e eVar = bVar.f41653q0;
            if ((childAt.getVisibility() != 8 || bVar.f41627d0 || bVar.f41629e0 || isInEditMode) && !bVar.f41631f0) {
                int O11 = eVar.O();
                int P11 = eVar.P();
                int N11 = eVar.N() + O11;
                int v11 = eVar.v() + P11;
                childAt.layout(O11, P11, N11, v11);
                if ((childAt instanceof g) && (a11 = ((g) childAt).a()) != null) {
                    a11.setVisibility(0);
                    a11.layout(O11, P11, N11, v11);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i16 = 0; i16 < size; i16++) {
                this.mConstraintHelpers.get(i16).updatePostLayout(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.mOnMeasureWidthMeasureSpec == i11) {
            int i13 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (getChildAt(i14).isLayoutRequested()) {
                    this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
                    break;
                }
                i14++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i11;
        this.mOnMeasureHeightMeasureSpec = i12;
        this.mLayoutWidget.t1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.u1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i11, i12);
        resolveMeasuredDimension(i11, i12, this.mLayoutWidget.N(), this.mLayoutWidget.v(), this.mLayoutWidget.m1(), this.mLayoutWidget.k1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        m2.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof m2.h)) {
            b bVar = (b) view.getLayoutParams();
            m2.h hVar = new m2.h();
            bVar.f41653q0 = hVar;
            bVar.f41627d0 = USE_CONSTRAINTS_HELPER;
            hVar.i1(bVar.f41615V);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.validateParams();
            ((b) view.getLayoutParams()).f41629e0 = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        m2.e viewWidget = getViewWidget(view);
        this.mLayoutWidget.f74253v0.remove(viewWidget);
        viewWidget.i0();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    protected void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
        c cVar = this.mMeasurer;
        int i15 = cVar.f41668e;
        int resolveSizeAndState = View.resolveSizeAndState(i13 + cVar.f41667d, i11, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i14 + i15, i12, 0) & 16777215;
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, resolveSizeAndState2);
        if (z11) {
            min |= 16777216;
        }
        if (z12) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    protected void resolveSystem(m2.f fVar, int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        c cVar = this.mMeasurer;
        cVar.f41665b = max;
        cVar.f41666c = max2;
        cVar.f41667d = paddingWidth;
        cVar.f41668e = i14;
        cVar.f41669f = i12;
        cVar.f41670g = i13;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            max3 = max4;
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        setSelfDimensionBehaviour(fVar, mode, i15, mode2, i16);
        fVar.n1(i11, mode, i15, mode2, i16, max3, max);
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i11, Object obj, Object obj2) {
        if (i11 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(str, num);
        }
    }

    @Override // android.view.View
    public void setId(int i11) {
        this.mChildrenByIds.remove(getId());
        super.setId(i11);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i11) {
        if (i11 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i11;
        requestLayout();
    }

    public void setMaxWidth(int i11) {
        if (i11 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i11;
        requestLayout();
    }

    public void setMinHeight(int i11) {
        if (i11 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i11;
        requestLayout();
    }

    public void setMinWidth(int i11) {
        if (i11 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i11;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i11) {
        this.mOptimizationLevel = i11;
        this.mLayoutWidget.r1(i11);
    }

    protected void setSelfDimensionBehaviour(m2.f fVar, int i11, int i12, int i13, int i14) {
        e.b bVar;
        c cVar = this.mMeasurer;
        int i15 = cVar.f41668e;
        int i16 = cVar.f41667d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i11 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.mMinWidth);
            }
        } else if (i11 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i12 = Math.max(0, this.mMinWidth);
            }
            i12 = 0;
        } else if (i11 != 1073741824) {
            bVar = bVar2;
            i12 = 0;
        } else {
            i12 = Math.min(this.mMaxWidth - i16, i12);
            bVar = bVar2;
        }
        if (i13 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinHeight);
            }
        } else if (i13 != 0) {
            if (i13 == 1073741824) {
                i14 = Math.min(this.mMaxHeight - i15, i14);
            }
            i14 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.mMinHeight);
            }
            i14 = 0;
        }
        if (i12 != fVar.N() || i14 != fVar.v()) {
            fVar.f74186x0.j();
        }
        fVar.V0(0);
        fVar.W0(0);
        fVar.J0(this.mMaxWidth - i16);
        fVar.I0(this.mMaxHeight - i15);
        fVar.M0(0);
        fVar.L0(0);
        fVar.C0(bVar);
        fVar.T0(i12);
        fVar.Q0(bVar2);
        fVar.z0(i14);
        fVar.M0(this.mMinWidth - i16);
        fVar.L0(this.mMinHeight - i15);
    }

    public void setState(int i11, int i12, int i13) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.b(i12, i11, i13);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new m2.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new m2.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i11, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new m2.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i11, i12);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f41594A;

        /* renamed from: B, reason: collision with root package name */
        public int f41595B;

        /* renamed from: C, reason: collision with root package name */
        public int f41596C;

        /* renamed from: D, reason: collision with root package name */
        public int f41597D;

        /* renamed from: E, reason: collision with root package name */
        public float f41598E;

        /* renamed from: F, reason: collision with root package name */
        public float f41599F;

        /* renamed from: G, reason: collision with root package name */
        public String f41600G;

        /* renamed from: H, reason: collision with root package name */
        public float f41601H;

        /* renamed from: I, reason: collision with root package name */
        public float f41602I;

        /* renamed from: J, reason: collision with root package name */
        public int f41603J;

        /* renamed from: K, reason: collision with root package name */
        public int f41604K;

        /* renamed from: L, reason: collision with root package name */
        public int f41605L;

        /* renamed from: M, reason: collision with root package name */
        public int f41606M;

        /* renamed from: N, reason: collision with root package name */
        public int f41607N;

        /* renamed from: O, reason: collision with root package name */
        public int f41608O;

        /* renamed from: P, reason: collision with root package name */
        public int f41609P;

        /* renamed from: Q, reason: collision with root package name */
        public int f41610Q;

        /* renamed from: R, reason: collision with root package name */
        public float f41611R;

        /* renamed from: S, reason: collision with root package name */
        public float f41612S;

        /* renamed from: T, reason: collision with root package name */
        public int f41613T;

        /* renamed from: U, reason: collision with root package name */
        public int f41614U;

        /* renamed from: V, reason: collision with root package name */
        public int f41615V;

        /* renamed from: W, reason: collision with root package name */
        public boolean f41616W;

        /* renamed from: X, reason: collision with root package name */
        public boolean f41617X;

        /* renamed from: Y, reason: collision with root package name */
        public String f41618Y;

        /* renamed from: Z, reason: collision with root package name */
        public int f41619Z;

        /* renamed from: a, reason: collision with root package name */
        public int f41620a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f41621a0;

        /* renamed from: b, reason: collision with root package name */
        public int f41622b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f41623b0;

        /* renamed from: c, reason: collision with root package name */
        public float f41624c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f41625c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f41626d;

        /* renamed from: d0, reason: collision with root package name */
        boolean f41627d0;

        /* renamed from: e, reason: collision with root package name */
        public int f41628e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f41629e0;

        /* renamed from: f, reason: collision with root package name */
        public int f41630f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f41631f0;

        /* renamed from: g, reason: collision with root package name */
        public int f41632g;

        /* renamed from: g0, reason: collision with root package name */
        int f41633g0;

        /* renamed from: h, reason: collision with root package name */
        public int f41634h;

        /* renamed from: h0, reason: collision with root package name */
        int f41635h0;

        /* renamed from: i, reason: collision with root package name */
        public int f41636i;

        /* renamed from: i0, reason: collision with root package name */
        int f41637i0;

        /* renamed from: j, reason: collision with root package name */
        public int f41638j;

        /* renamed from: j0, reason: collision with root package name */
        int f41639j0;

        /* renamed from: k, reason: collision with root package name */
        public int f41640k;

        /* renamed from: k0, reason: collision with root package name */
        int f41641k0;

        /* renamed from: l, reason: collision with root package name */
        public int f41642l;

        /* renamed from: l0, reason: collision with root package name */
        int f41643l0;

        /* renamed from: m, reason: collision with root package name */
        public int f41644m;

        /* renamed from: m0, reason: collision with root package name */
        float f41645m0;

        /* renamed from: n, reason: collision with root package name */
        public int f41646n;

        /* renamed from: n0, reason: collision with root package name */
        int f41647n0;

        /* renamed from: o, reason: collision with root package name */
        public int f41648o;

        /* renamed from: o0, reason: collision with root package name */
        int f41649o0;

        /* renamed from: p, reason: collision with root package name */
        public int f41650p;

        /* renamed from: p0, reason: collision with root package name */
        float f41651p0;

        /* renamed from: q, reason: collision with root package name */
        public int f41652q;

        /* renamed from: q0, reason: collision with root package name */
        m2.e f41653q0;

        /* renamed from: r, reason: collision with root package name */
        public float f41654r;

        /* renamed from: s, reason: collision with root package name */
        public int f41655s;

        /* renamed from: t, reason: collision with root package name */
        public int f41656t;

        /* renamed from: u, reason: collision with root package name */
        public int f41657u;

        /* renamed from: v, reason: collision with root package name */
        public int f41658v;

        /* renamed from: w, reason: collision with root package name */
        public int f41659w;

        /* renamed from: x, reason: collision with root package name */
        public int f41660x;

        /* renamed from: y, reason: collision with root package name */
        public int f41661y;

        /* renamed from: z, reason: collision with root package name */
        public int f41662z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f41663a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f41663a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41620a = -1;
            this.f41622b = -1;
            this.f41624c = -1.0f;
            this.f41626d = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41628e = -1;
            this.f41630f = -1;
            this.f41632g = -1;
            this.f41634h = -1;
            this.f41636i = -1;
            this.f41638j = -1;
            this.f41640k = -1;
            this.f41642l = -1;
            this.f41644m = -1;
            this.f41646n = -1;
            this.f41648o = -1;
            this.f41650p = -1;
            this.f41652q = 0;
            this.f41654r = 0.0f;
            this.f41655s = -1;
            this.f41656t = -1;
            this.f41657u = -1;
            this.f41658v = -1;
            this.f41659w = LinearLayoutManager.INVALID_OFFSET;
            this.f41660x = LinearLayoutManager.INVALID_OFFSET;
            this.f41661y = LinearLayoutManager.INVALID_OFFSET;
            this.f41662z = LinearLayoutManager.INVALID_OFFSET;
            this.f41594A = LinearLayoutManager.INVALID_OFFSET;
            this.f41595B = LinearLayoutManager.INVALID_OFFSET;
            this.f41596C = LinearLayoutManager.INVALID_OFFSET;
            this.f41597D = 0;
            this.f41598E = 0.5f;
            this.f41599F = 0.5f;
            this.f41600G = null;
            this.f41601H = -1.0f;
            this.f41602I = -1.0f;
            this.f41603J = 0;
            this.f41604K = 0;
            this.f41605L = 0;
            this.f41606M = 0;
            this.f41607N = 0;
            this.f41608O = 0;
            this.f41609P = 0;
            this.f41610Q = 0;
            this.f41611R = 1.0f;
            this.f41612S = 1.0f;
            this.f41613T = -1;
            this.f41614U = -1;
            this.f41615V = -1;
            this.f41616W = false;
            this.f41617X = false;
            this.f41618Y = null;
            this.f41619Z = 0;
            this.f41621a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41623b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41625c0 = false;
            this.f41627d0 = false;
            this.f41629e0 = false;
            this.f41631f0 = false;
            this.f41633g0 = -1;
            this.f41635h0 = -1;
            this.f41637i0 = -1;
            this.f41639j0 = -1;
            this.f41641k0 = LinearLayoutManager.INVALID_OFFSET;
            this.f41643l0 = LinearLayoutManager.INVALID_OFFSET;
            this.f41645m0 = 0.5f;
            this.f41653q0 = new m2.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f41845b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f41663a.get(index);
                switch (i12) {
                    case 1:
                        this.f41615V = obtainStyledAttributes.getInt(index, this.f41615V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f41650p);
                        this.f41650p = resourceId;
                        if (resourceId == -1) {
                            this.f41650p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f41652q = obtainStyledAttributes.getDimensionPixelSize(index, this.f41652q);
                        break;
                    case 4:
                        float f7 = obtainStyledAttributes.getFloat(index, this.f41654r) % 360.0f;
                        this.f41654r = f7;
                        if (f7 < 0.0f) {
                            this.f41654r = (360.0f - f7) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f41620a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41620a);
                        break;
                    case 6:
                        this.f41622b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41622b);
                        break;
                    case 7:
                        this.f41624c = obtainStyledAttributes.getFloat(index, this.f41624c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f41628e);
                        this.f41628e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f41628e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f41630f);
                        this.f41630f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f41630f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f41632g);
                        this.f41632g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f41632g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f41634h);
                        this.f41634h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f41634h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f41636i);
                        this.f41636i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f41636i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f41638j);
                        this.f41638j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f41638j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f41640k);
                        this.f41640k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f41640k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f41642l);
                        this.f41642l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f41642l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f41644m);
                        this.f41644m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f41644m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f41655s);
                        this.f41655s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f41655s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f41656t);
                        this.f41656t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f41656t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f41657u);
                        this.f41657u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f41657u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f41658v);
                        this.f41658v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f41658v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f41659w = obtainStyledAttributes.getDimensionPixelSize(index, this.f41659w);
                        break;
                    case 22:
                        this.f41660x = obtainStyledAttributes.getDimensionPixelSize(index, this.f41660x);
                        break;
                    case 23:
                        this.f41661y = obtainStyledAttributes.getDimensionPixelSize(index, this.f41661y);
                        break;
                    case 24:
                        this.f41662z = obtainStyledAttributes.getDimensionPixelSize(index, this.f41662z);
                        break;
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                        this.f41594A = obtainStyledAttributes.getDimensionPixelSize(index, this.f41594A);
                        break;
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                        this.f41595B = obtainStyledAttributes.getDimensionPixelSize(index, this.f41595B);
                        break;
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        this.f41616W = obtainStyledAttributes.getBoolean(index, this.f41616W);
                        break;
                    case 28:
                        this.f41617X = obtainStyledAttributes.getBoolean(index, this.f41617X);
                        break;
                    case 29:
                        this.f41598E = obtainStyledAttributes.getFloat(index, this.f41598E);
                        break;
                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                        this.f41599F = obtainStyledAttributes.getFloat(index, this.f41599F);
                        break;
                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f41605L = i13;
                        if (i13 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.f41606M = i14;
                        if (i14 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f41607N = obtainStyledAttributes.getDimensionPixelSize(index, this.f41607N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f41607N) == -2) {
                                this.f41607N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f41609P = obtainStyledAttributes.getDimensionPixelSize(index, this.f41609P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f41609P) == -2) {
                                this.f41609P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        this.f41611R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f41611R));
                        this.f41605L = 2;
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        try {
                            this.f41608O = obtainStyledAttributes.getDimensionPixelSize(index, this.f41608O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f41608O) == -2) {
                                this.f41608O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        try {
                            this.f41610Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f41610Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f41610Q) == -2) {
                                this.f41610Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f41612S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f41612S));
                        this.f41606M = 2;
                        break;
                    default:
                        switch (i12) {
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                d.T(this, obtainStyledAttributes.getString(index));
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                this.f41601H = obtainStyledAttributes.getFloat(index, this.f41601H);
                                break;
                            case 46:
                                this.f41602I = obtainStyledAttributes.getFloat(index, this.f41602I);
                                break;
                            case 47:
                                this.f41603J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f41604K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f41613T = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41613T);
                                break;
                            case 50:
                                this.f41614U = obtainStyledAttributes.getDimensionPixelOffset(index, this.f41614U);
                                break;
                            case 51:
                                this.f41618Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f41646n);
                                this.f41646n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f41646n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f41648o);
                                this.f41648o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f41648o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f41597D = obtainStyledAttributes.getDimensionPixelSize(index, this.f41597D);
                                break;
                            case 55:
                                this.f41596C = obtainStyledAttributes.getDimensionPixelSize(index, this.f41596C);
                                break;
                            default:
                                switch (i12) {
                                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                        d.S(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                        d.S(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f41619Z = obtainStyledAttributes.getInt(index, this.f41619Z);
                                        break;
                                    case 67:
                                        this.f41626d = obtainStyledAttributes.getBoolean(index, this.f41626d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            b();
        }

        public final m2.e a() {
            return this.f41653q0;
        }

        public final void b() {
            this.f41627d0 = false;
            this.f41621a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41623b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            int i11 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i11 == -2 && this.f41616W) {
                this.f41621a0 = false;
                if (this.f41605L == 0) {
                    this.f41605L = 1;
                }
            }
            int i12 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i12 == -2 && this.f41617X) {
                this.f41623b0 = false;
                if (this.f41606M == 0) {
                    this.f41606M = 1;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f41621a0 = false;
                if (i11 == 0 && this.f41605L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f41616W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f41623b0 = false;
                if (i12 == 0 && this.f41606M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f41617X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.f41624c == -1.0f && this.f41620a == -1 && this.f41622b == -1) {
                return;
            }
            this.f41627d0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41621a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41623b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (!(this.f41653q0 instanceof m2.h)) {
                this.f41653q0 = new m2.h();
            }
            ((m2.h) this.f41653q0).i1(this.f41615V);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i17 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i11);
            boolean z11 = false;
            boolean z12 = 1 == getLayoutDirection();
            this.f41637i0 = -1;
            this.f41639j0 = -1;
            this.f41633g0 = -1;
            this.f41635h0 = -1;
            this.f41641k0 = this.f41659w;
            this.f41643l0 = this.f41661y;
            float f7 = this.f41598E;
            this.f41645m0 = f7;
            int i18 = this.f41620a;
            this.f41647n0 = i18;
            int i19 = this.f41622b;
            this.f41649o0 = i19;
            float f11 = this.f41624c;
            this.f41651p0 = f11;
            if (z12) {
                int i21 = this.f41655s;
                if (i21 != -1) {
                    this.f41637i0 = i21;
                } else {
                    int i22 = this.f41656t;
                    if (i22 != -1) {
                        this.f41639j0 = i22;
                    }
                    i12 = this.f41657u;
                    if (i12 != -1) {
                        this.f41635h0 = i12;
                        z11 = true;
                    }
                    i13 = this.f41658v;
                    if (i13 != -1) {
                        this.f41633g0 = i13;
                        z11 = true;
                    }
                    i14 = this.f41594A;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f41643l0 = i14;
                    }
                    i15 = this.f41595B;
                    if (i15 != Integer.MIN_VALUE) {
                        this.f41641k0 = i15;
                    }
                    if (z11) {
                        this.f41645m0 = 1.0f - f7;
                    }
                    if (this.f41627d0 && this.f41615V == 1 && this.f41626d) {
                        if (f11 == -1.0f) {
                            this.f41651p0 = 1.0f - f11;
                            this.f41647n0 = -1;
                            this.f41649o0 = -1;
                        } else if (i18 != -1) {
                            this.f41649o0 = i18;
                            this.f41647n0 = -1;
                            this.f41651p0 = -1.0f;
                        } else if (i19 != -1) {
                            this.f41647n0 = i19;
                            this.f41649o0 = -1;
                            this.f41651p0 = -1.0f;
                        }
                    }
                }
                z11 = true;
                i12 = this.f41657u;
                if (i12 != -1) {
                }
                i13 = this.f41658v;
                if (i13 != -1) {
                }
                i14 = this.f41594A;
                if (i14 != Integer.MIN_VALUE) {
                }
                i15 = this.f41595B;
                if (i15 != Integer.MIN_VALUE) {
                }
                if (z11) {
                }
                if (this.f41627d0) {
                    if (f11 == -1.0f) {
                    }
                }
            } else {
                int i23 = this.f41655s;
                if (i23 != -1) {
                    this.f41635h0 = i23;
                }
                int i24 = this.f41656t;
                if (i24 != -1) {
                    this.f41633g0 = i24;
                }
                int i25 = this.f41657u;
                if (i25 != -1) {
                    this.f41637i0 = i25;
                }
                int i26 = this.f41658v;
                if (i26 != -1) {
                    this.f41639j0 = i26;
                }
                int i27 = this.f41594A;
                if (i27 != Integer.MIN_VALUE) {
                    this.f41641k0 = i27;
                }
                int i28 = this.f41595B;
                if (i28 != Integer.MIN_VALUE) {
                    this.f41643l0 = i28;
                }
            }
            if (this.f41657u == -1 && this.f41658v == -1 && this.f41656t == -1 && this.f41655s == -1) {
                int i29 = this.f41632g;
                if (i29 != -1) {
                    this.f41637i0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                    }
                } else {
                    int i31 = this.f41634h;
                    if (i31 != -1) {
                        this.f41639j0 = i31;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i17 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i17;
                        }
                    }
                }
                int i32 = this.f41628e;
                if (i32 != -1) {
                    this.f41633g0 = i32;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                    return;
                }
                int i33 = this.f41630f;
                if (i33 != -1) {
                    this.f41635h0 = i33;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i16 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i16;
                }
            }
        }

        public b(int i11, int i12) {
            super(i11, i12);
            this.f41620a = -1;
            this.f41622b = -1;
            this.f41624c = -1.0f;
            this.f41626d = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41628e = -1;
            this.f41630f = -1;
            this.f41632g = -1;
            this.f41634h = -1;
            this.f41636i = -1;
            this.f41638j = -1;
            this.f41640k = -1;
            this.f41642l = -1;
            this.f41644m = -1;
            this.f41646n = -1;
            this.f41648o = -1;
            this.f41650p = -1;
            this.f41652q = 0;
            this.f41654r = 0.0f;
            this.f41655s = -1;
            this.f41656t = -1;
            this.f41657u = -1;
            this.f41658v = -1;
            this.f41659w = LinearLayoutManager.INVALID_OFFSET;
            this.f41660x = LinearLayoutManager.INVALID_OFFSET;
            this.f41661y = LinearLayoutManager.INVALID_OFFSET;
            this.f41662z = LinearLayoutManager.INVALID_OFFSET;
            this.f41594A = LinearLayoutManager.INVALID_OFFSET;
            this.f41595B = LinearLayoutManager.INVALID_OFFSET;
            this.f41596C = LinearLayoutManager.INVALID_OFFSET;
            this.f41597D = 0;
            this.f41598E = 0.5f;
            this.f41599F = 0.5f;
            this.f41600G = null;
            this.f41601H = -1.0f;
            this.f41602I = -1.0f;
            this.f41603J = 0;
            this.f41604K = 0;
            this.f41605L = 0;
            this.f41606M = 0;
            this.f41607N = 0;
            this.f41608O = 0;
            this.f41609P = 0;
            this.f41610Q = 0;
            this.f41611R = 1.0f;
            this.f41612S = 1.0f;
            this.f41613T = -1;
            this.f41614U = -1;
            this.f41615V = -1;
            this.f41616W = false;
            this.f41617X = false;
            this.f41618Y = null;
            this.f41619Z = 0;
            this.f41621a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41623b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41625c0 = false;
            this.f41627d0 = false;
            this.f41629e0 = false;
            this.f41631f0 = false;
            this.f41633g0 = -1;
            this.f41635h0 = -1;
            this.f41637i0 = -1;
            this.f41639j0 = -1;
            this.f41641k0 = LinearLayoutManager.INVALID_OFFSET;
            this.f41643l0 = LinearLayoutManager.INVALID_OFFSET;
            this.f41645m0 = 0.5f;
            this.f41653q0 = new m2.e();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f41620a = -1;
            this.f41622b = -1;
            this.f41624c = -1.0f;
            this.f41626d = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41628e = -1;
            this.f41630f = -1;
            this.f41632g = -1;
            this.f41634h = -1;
            this.f41636i = -1;
            this.f41638j = -1;
            this.f41640k = -1;
            this.f41642l = -1;
            this.f41644m = -1;
            this.f41646n = -1;
            this.f41648o = -1;
            this.f41650p = -1;
            this.f41652q = 0;
            this.f41654r = 0.0f;
            this.f41655s = -1;
            this.f41656t = -1;
            this.f41657u = -1;
            this.f41658v = -1;
            this.f41659w = LinearLayoutManager.INVALID_OFFSET;
            this.f41660x = LinearLayoutManager.INVALID_OFFSET;
            this.f41661y = LinearLayoutManager.INVALID_OFFSET;
            this.f41662z = LinearLayoutManager.INVALID_OFFSET;
            this.f41594A = LinearLayoutManager.INVALID_OFFSET;
            this.f41595B = LinearLayoutManager.INVALID_OFFSET;
            this.f41596C = LinearLayoutManager.INVALID_OFFSET;
            this.f41597D = 0;
            this.f41598E = 0.5f;
            this.f41599F = 0.5f;
            this.f41600G = null;
            this.f41601H = -1.0f;
            this.f41602I = -1.0f;
            this.f41603J = 0;
            this.f41604K = 0;
            this.f41605L = 0;
            this.f41606M = 0;
            this.f41607N = 0;
            this.f41608O = 0;
            this.f41609P = 0;
            this.f41610Q = 0;
            this.f41611R = 1.0f;
            this.f41612S = 1.0f;
            this.f41613T = -1;
            this.f41614U = -1;
            this.f41615V = -1;
            this.f41616W = false;
            this.f41617X = false;
            this.f41618Y = null;
            this.f41619Z = 0;
            this.f41621a0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41623b0 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f41625c0 = false;
            this.f41627d0 = false;
            this.f41629e0 = false;
            this.f41631f0 = false;
            this.f41633g0 = -1;
            this.f41635h0 = -1;
            this.f41637i0 = -1;
            this.f41639j0 = -1;
            this.f41641k0 = LinearLayoutManager.INVALID_OFFSET;
            this.f41643l0 = LinearLayoutManager.INVALID_OFFSET;
            this.f41645m0 = 0.5f;
            this.f41653q0 = new m2.e();
        }
    }
}
