package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import g.AbstractC0444a;
import java.lang.reflect.Field;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1228C extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10747a;

    /* renamed from: b, reason: collision with root package name */
    public int f10748b;

    /* renamed from: c, reason: collision with root package name */
    public int f10749c;

    /* renamed from: d, reason: collision with root package name */
    public int f10750d;

    /* renamed from: e, reason: collision with root package name */
    public int f10751e;

    /* renamed from: f, reason: collision with root package name */
    public int f10752f;

    /* renamed from: g, reason: collision with root package name */
    public float f10753g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10754h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f10755i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f10756j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f10757k;

    /* renamed from: l, reason: collision with root package name */
    public int f10758l;

    /* renamed from: m, reason: collision with root package name */
    public int f10759m;

    /* renamed from: n, reason: collision with root package name */
    public int f10760n;

    /* renamed from: o, reason: collision with root package name */
    public int f10761o;

    public AbstractC1228C(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f10747a = true;
        this.f10748b = -1;
        this.f10749c = 0;
        this.f10751e = 8388659;
        B4.i M5 = B4.i.M(context, attributeSet, AbstractC0444a.f5701i, i2);
        TypedArray typedArray = (TypedArray) M5.f312c;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f10753g = typedArray.getFloat(4, -1.0f);
        this.f10748b = typedArray.getInt(3, -1);
        this.f10754h = typedArray.getBoolean(7, false);
        setDividerDrawable(M5.F(5));
        this.f10760n = typedArray.getInt(8, 0);
        this.f10761o = typedArray.getDimensionPixelSize(6, 0);
        M5.P();
    }

    public final void b(Canvas canvas, int i2) {
        this.f10757k.setBounds(getPaddingLeft() + this.f10761o, i2, (getWidth() - getPaddingRight()) - this.f10761o, this.f10759m + i2);
        this.f10757k.draw(canvas);
    }

    public final void c(Canvas canvas, int i2) {
        this.f10757k.setBounds(i2, getPaddingTop() + this.f10761o, this.f10758l + i2, (getHeight() - getPaddingBottom()) - this.f10761o);
        this.f10757k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1227B;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1227B generateDefaultLayoutParams() {
        int i2 = this.f10750d;
        if (i2 == 0) {
            return new C1227B(-2);
        }
        if (i2 == 1) {
            return new C1227B(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1227B generateLayoutParams(AttributeSet attributeSet) {
        return new C1227B(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1227B generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1227B(layoutParams);
    }

    public final boolean g(int i2) {
        if (i2 == 0) {
            return (this.f10760n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f10760n & 4) != 0;
        }
        if ((this.f10760n & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f10748b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f10748b;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f10748b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i6 = this.f10749c;
        if (this.f10750d == 1 && (i2 = this.f10751e & 112) != 48) {
            if (i2 == 16) {
                i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f10752f) / 2;
            } else if (i2 == 80) {
                i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f10752f;
            }
        }
        return i6 + ((ViewGroup.MarginLayoutParams) ((C1227B) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f10748b;
    }

    public Drawable getDividerDrawable() {
        return this.f10757k;
    }

    public int getDividerPadding() {
        return this.f10761o;
    }

    public int getDividerWidth() {
        return this.f10758l;
    }

    public int getGravity() {
        return this.f10751e;
    }

    public int getOrientation() {
        return this.f10750d;
    }

    public int getShowDividers() {
        return this.f10760n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f10753g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f10757k == null) {
            return;
        }
        int i3 = 0;
        if (this.f10750d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && g(i3)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((C1227B) childAt.getLayoutParams())).topMargin) - this.f10759m);
                }
                i3++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f10759m : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C1227B) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a6 = t0.a(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i3)) {
                C1227B c1227b = (C1227B) childAt3.getLayoutParams();
                c(canvas, a6 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) c1227b).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) c1227b).leftMargin) - this.f10758l);
            }
            i3++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1227B c1227b2 = (C1227B) childAt4.getLayoutParams();
                if (a6) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) c1227b2).leftMargin;
                    i2 = this.f10758l;
                    right = left - i2;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) c1227b2).rightMargin;
                }
            } else if (a6) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f10758l;
                right = left - i2;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = 8;
        if (this.f10750d == 1) {
            int paddingLeft = getPaddingLeft();
            int i23 = i6 - i2;
            int paddingRight = i23 - getPaddingRight();
            int paddingRight2 = (i23 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i24 = this.f10751e;
            int i25 = i24 & 112;
            int i26 = 8388615 & i24;
            int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i3) - this.f10752f : getPaddingTop() + (((i7 - i3) - this.f10752f) / 2);
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View childAt = getChildAt(i27);
                if (childAt != null && childAt.getVisibility() != i22) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C1227B c1227b = (C1227B) childAt.getLayoutParams();
                    int i28 = c1227b.f10746b;
                    if (i28 < 0) {
                        i28 = i26;
                    }
                    Field field = E.G.f566a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i19 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c1227b).leftMargin;
                        i20 = ((ViewGroup.MarginLayoutParams) c1227b).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i21 = ((ViewGroup.MarginLayoutParams) c1227b).leftMargin + paddingLeft;
                        if (g(i27)) {
                            paddingTop += this.f10759m;
                        }
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) c1227b).topMargin;
                        childAt.layout(i21, i29, measuredWidth + i21, i29 + measuredHeight);
                        paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c1227b).bottomMargin + i29;
                    } else {
                        i19 = paddingRight - measuredWidth;
                        i20 = ((ViewGroup.MarginLayoutParams) c1227b).rightMargin;
                    }
                    i21 = i19 - i20;
                    if (g(i27)) {
                    }
                    int i292 = paddingTop + ((ViewGroup.MarginLayoutParams) c1227b).topMargin;
                    childAt.layout(i21, i292, measuredWidth + i21, i292 + measuredHeight);
                    paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) c1227b).bottomMargin + i292;
                }
                i27++;
                i22 = 8;
            }
            return;
        }
        boolean a6 = t0.a(this);
        int paddingTop2 = getPaddingTop();
        int i30 = i7 - i3;
        int paddingBottom = i30 - getPaddingBottom();
        int paddingBottom2 = (i30 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i31 = this.f10751e;
        int i32 = 8388615 & i31;
        int i33 = i31 & 112;
        boolean z5 = this.f10747a;
        int[] iArr = this.f10755i;
        int[] iArr2 = this.f10756j;
        Field field2 = E.G.f566a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i2) - this.f10752f : getPaddingLeft() + (((i6 - i2) - this.f10752f) / 2);
        if (a6) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i34 = 0;
        while (i34 < virtualChildCount2) {
            int i35 = (i8 * i34) + i9;
            View childAt2 = getChildAt(i35);
            if (childAt2 == null) {
                i10 = i9;
                i11 = i8;
                i12 = virtualChildCount2;
                i13 = i33;
                i14 = 1;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C1227B c1227b2 = (C1227B) childAt2.getLayoutParams();
                    i11 = i8;
                    if (z5) {
                        i12 = virtualChildCount2;
                        if (((ViewGroup.MarginLayoutParams) c1227b2).height != -1) {
                            i15 = childAt2.getBaseline();
                            i16 = c1227b2.f10746b;
                            if (i16 < 0) {
                                i16 = i33;
                            }
                            i17 = i16 & 112;
                            i13 = i33;
                            if (i17 != 16) {
                                i18 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((ViewGroup.MarginLayoutParams) c1227b2).topMargin) - ((ViewGroup.MarginLayoutParams) c1227b2).bottomMargin;
                            } else if (i17 == 48) {
                                i18 = ((ViewGroup.MarginLayoutParams) c1227b2).topMargin + paddingTop2;
                                if (i15 != -1) {
                                    i18 = (iArr[1] - i15) + i18;
                                }
                            } else if (i17 != 80) {
                                i18 = paddingTop2;
                            } else {
                                i18 = (paddingBottom - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1227b2).bottomMargin;
                                if (i15 != -1) {
                                    i18 -= iArr2[2] - (childAt2.getMeasuredHeight() - i15);
                                }
                            }
                            if (g(i35)) {
                                paddingLeft2 += this.f10758l;
                            }
                            int i36 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c1227b2).leftMargin;
                            childAt2.layout(i36, i18, i36 + measuredWidth2, i18 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1227b2).rightMargin + i36;
                        }
                    } else {
                        i12 = virtualChildCount2;
                    }
                    i15 = -1;
                    i16 = c1227b2.f10746b;
                    if (i16 < 0) {
                    }
                    i17 = i16 & 112;
                    i13 = i33;
                    if (i17 != 16) {
                    }
                    if (g(i35)) {
                    }
                    int i362 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c1227b2).leftMargin;
                    childAt2.layout(i362, i18, i362 + measuredWidth2, i18 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((ViewGroup.MarginLayoutParams) c1227b2).rightMargin + i362;
                } else {
                    i11 = i8;
                    i12 = virtualChildCount2;
                    i13 = i33;
                }
                i14 = 1;
            }
            i34 += i14;
            i9 = i10;
            i8 = i11;
            virtualChildCount2 = i12;
            i33 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02dc, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == (-1)) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:240:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        char c2;
        int i6;
        int max;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        char c6;
        int i11;
        int i12;
        int i13;
        int i14;
        float f6;
        int i15;
        int i16;
        boolean z;
        int baseline;
        int i17;
        int i18;
        float f7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z5;
        boolean z6;
        C1227B c1227b;
        boolean z7;
        int i24;
        boolean z8;
        int i25;
        int i26;
        int baseline2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z9;
        C1227B c1227b2;
        boolean z10;
        boolean z11;
        int max2;
        int i38 = -2;
        int i39 = 1073741824;
        int i40 = 8;
        int i41 = Integer.MIN_VALUE;
        float f8 = 0.0f;
        boolean z12 = true;
        if (this.f10750d == 1) {
            this.f10752f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int i42 = this.f10748b;
            boolean z13 = this.f10754h;
            boolean z14 = true;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            boolean z15 = false;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            boolean z16 = false;
            float f9 = 0.0f;
            while (i43 < virtualChildCount) {
                View childAt = getChildAt(i43);
                if (childAt == null) {
                    this.f10752f = this.f10752f;
                } else if (childAt.getVisibility() != i40) {
                    if (g(i43)) {
                        this.f10752f += this.f10759m;
                    }
                    C1227B c1227b3 = (C1227B) childAt.getLayoutParams();
                    float f10 = c1227b3.f10745a;
                    f9 += f10;
                    if (mode2 == i39 && ((ViewGroup.MarginLayoutParams) c1227b3).height == 0 && f10 > f8) {
                        int i49 = this.f10752f;
                        this.f10752f = Math.max(i49, ((ViewGroup.MarginLayoutParams) c1227b3).topMargin + i49 + ((ViewGroup.MarginLayoutParams) c1227b3).bottomMargin);
                        i34 = i42;
                        i35 = mode2;
                        i36 = mode;
                        i37 = virtualChildCount;
                        c1227b2 = c1227b3;
                        z10 = true;
                        z9 = true;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c1227b3).height != 0 || f10 <= f8) {
                            i33 = i41;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1227b3).height = i38;
                            i33 = 0;
                        }
                        int i50 = f9 == f8 ? this.f10752f : 0;
                        i34 = i42;
                        i35 = mode2;
                        i36 = mode;
                        i37 = virtualChildCount;
                        z9 = true;
                        c1227b2 = c1227b3;
                        measureChildWithMargins(childAt, i2, 0, i3, i50);
                        if (i33 != i41) {
                            ((ViewGroup.MarginLayoutParams) c1227b2).height = i33;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i51 = this.f10752f;
                        this.f10752f = Math.max(i51, i51 + measuredHeight + ((ViewGroup.MarginLayoutParams) c1227b2).topMargin + ((ViewGroup.MarginLayoutParams) c1227b2).bottomMargin);
                        int i52 = i46;
                        if (z13) {
                            i46 = Math.max(measuredHeight, i52);
                        }
                        z10 = z15;
                    }
                    if (i34 >= 0 && i34 == i43 + 1) {
                        this.f10749c = this.f10752f;
                    }
                    float f11 = c1227b2.f10745a;
                    if (i43 < i34 && f11 > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    mode = i36;
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) c1227b2).width != -1) {
                        z11 = false;
                    } else {
                        z11 = z9;
                        z16 = z11;
                    }
                    int i53 = ((ViewGroup.MarginLayoutParams) c1227b2).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b2).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i53;
                    max2 = Math.max(i47, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i48, childAt.getMeasuredState());
                    boolean z17 = (z14 && ((ViewGroup.MarginLayoutParams) c1227b2).width == -1) ? z9 : false;
                    if (f11 > 0.0f) {
                        if (!z11) {
                            i53 = measuredWidth;
                        }
                        i45 = Math.max(i45, i53);
                    } else {
                        int i54 = i45;
                        if (!z11) {
                            i53 = measuredWidth;
                        }
                        i44 = Math.max(i44, i53);
                        i45 = i54;
                    }
                    z15 = z10;
                    i48 = combineMeasuredStates;
                    z14 = z17;
                    i43++;
                    i42 = i34;
                    i47 = max2;
                    z12 = z9;
                    mode2 = i35;
                    virtualChildCount = i37;
                    i38 = -2;
                    i39 = 1073741824;
                    i40 = 8;
                    i41 = Integer.MIN_VALUE;
                    f8 = 0.0f;
                }
                i34 = i42;
                i35 = mode2;
                i37 = virtualChildCount;
                max2 = i47;
                z9 = true;
                i43++;
                i42 = i34;
                i47 = max2;
                z12 = z9;
                mode2 = i35;
                virtualChildCount = i37;
                i38 = -2;
                i39 = 1073741824;
                i40 = 8;
                i41 = Integer.MIN_VALUE;
                f8 = 0.0f;
            }
            int i55 = mode2;
            int i56 = virtualChildCount;
            boolean z18 = z12;
            int i57 = i44;
            int i58 = i45;
            int i59 = i46;
            int i60 = i47;
            int i61 = i48;
            if (this.f10752f > 0 && g(i56)) {
                this.f10752f += this.f10759m;
            }
            int i62 = i55;
            if (z13 && (i62 == Integer.MIN_VALUE || i62 == 0)) {
                this.f10752f = 0;
                for (int i63 = 0; i63 < i56; i63++) {
                    View childAt2 = getChildAt(i63);
                    if (childAt2 == null) {
                        this.f10752f = this.f10752f;
                    } else if (childAt2.getVisibility() != 8) {
                        C1227B c1227b4 = (C1227B) childAt2.getLayoutParams();
                        int i64 = this.f10752f;
                        this.f10752f = Math.max(i64, i64 + i59 + ((ViewGroup.MarginLayoutParams) c1227b4).topMargin + ((ViewGroup.MarginLayoutParams) c1227b4).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f10752f;
            this.f10752f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, 0);
            int i65 = (16777215 & resolveSizeAndState) - this.f10752f;
            if (z15 || (i65 != 0 && f9 > 0.0f)) {
                float f12 = this.f10753g;
                if (f12 > 0.0f) {
                    f9 = f12;
                }
                this.f10752f = 0;
                int i66 = 0;
                while (i66 < i56) {
                    View childAt3 = getChildAt(i66);
                    if (childAt3.getVisibility() == 8) {
                        i29 = i62;
                    } else {
                        C1227B c1227b5 = (C1227B) childAt3.getLayoutParams();
                        float f13 = c1227b5.f10745a;
                        if (f13 > 0.0f) {
                            int i67 = (int) ((i65 * f13) / f9);
                            f9 -= f13;
                            int i68 = i65 - i67;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1227b5).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b5).rightMargin, ((ViewGroup.MarginLayoutParams) c1227b5).width);
                            if (((ViewGroup.MarginLayoutParams) c1227b5).height == 0) {
                                i32 = 1073741824;
                                if (i62 == 1073741824) {
                                    if (i67 <= 0) {
                                        i67 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i67, 1073741824));
                                    i61 = View.combineMeasuredStates(i61, childAt3.getMeasuredState() & (-256));
                                    i65 = i68;
                                }
                            } else {
                                i32 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i67;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i32));
                            i61 = View.combineMeasuredStates(i61, childAt3.getMeasuredState() & (-256));
                            i65 = i68;
                        }
                        int i69 = ((ViewGroup.MarginLayoutParams) c1227b5).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b5).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i69;
                        int max3 = Math.max(i60, measuredWidth2);
                        i29 = i62;
                        if (mode != 1073741824) {
                            i30 = max3;
                            i31 = -1;
                        } else {
                            i30 = max3;
                            i31 = -1;
                        }
                        i69 = measuredWidth2;
                        i57 = Math.max(i57, i69);
                        boolean z19 = (z14 && ((ViewGroup.MarginLayoutParams) c1227b5).width == i31) ? z18 : false;
                        int i70 = this.f10752f;
                        this.f10752f = Math.max(i70, childAt3.getMeasuredHeight() + i70 + ((ViewGroup.MarginLayoutParams) c1227b5).topMargin + ((ViewGroup.MarginLayoutParams) c1227b5).bottomMargin);
                        z14 = z19;
                        i60 = i30;
                    }
                    i66++;
                    i62 = i29;
                }
                this.f10752f = getPaddingBottom() + getPaddingTop() + this.f10752f;
                i28 = i57;
            } else {
                i28 = Math.max(i57, i58);
                if (z13 && i62 != 1073741824) {
                    for (int i71 = 0; i71 < i56; i71++) {
                        View childAt4 = getChildAt(i71);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((C1227B) childAt4.getLayoutParams()).f10745a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i59, 1073741824));
                        }
                    }
                }
            }
            int i72 = i60;
            if (z14 || mode == 1073741824) {
                i28 = i72;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i28, getSuggestedMinimumWidth()), i2, i61), resolveSizeAndState);
            if (z16) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i73 = 0; i73 < i56; i73++) {
                    View childAt5 = getChildAt(i73);
                    if (childAt5.getVisibility() != 8) {
                        C1227B c1227b6 = (C1227B) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) c1227b6).width == -1) {
                            int i74 = ((ViewGroup.MarginLayoutParams) c1227b6).height;
                            ((ViewGroup.MarginLayoutParams) c1227b6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i3, 0);
                            ((ViewGroup.MarginLayoutParams) c1227b6).height = i74;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f10752f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i2);
        int mode4 = View.MeasureSpec.getMode(i3);
        if (this.f10755i == null || this.f10756j == null) {
            this.f10755i = new int[4];
            this.f10756j = new int[4];
        }
        int[] iArr = this.f10755i;
        int[] iArr2 = this.f10756j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z20 = this.f10747a;
        boolean z21 = this.f10754h;
        boolean z22 = mode3 == 1073741824;
        boolean z23 = true;
        int i75 = 0;
        float f14 = 0.0f;
        int i76 = 0;
        int i77 = 0;
        int i78 = 0;
        int i79 = 0;
        int i80 = 0;
        boolean z24 = false;
        boolean z25 = false;
        while (i77 < virtualChildCount2) {
            View childAt6 = getChildAt(i77);
            if (childAt6 == null) {
                this.f10752f = this.f10752f;
                i23 = i77;
                z5 = z21;
                z6 = z20;
            } else {
                int i81 = i75;
                int i82 = i76;
                if (childAt6.getVisibility() == 8) {
                    z6 = z20;
                    i75 = i81;
                    i76 = i82;
                    i23 = i77;
                    z5 = z21;
                } else {
                    if (g(i77)) {
                        this.f10752f += this.f10758l;
                    }
                    C1227B c1227b7 = (C1227B) childAt6.getLayoutParams();
                    float f15 = c1227b7.f10745a;
                    float f16 = f14 + f15;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) c1227b7).width == 0 && f15 > 0.0f) {
                        if (z22) {
                            i27 = i77;
                            this.f10752f = ((ViewGroup.MarginLayoutParams) c1227b7).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b7).rightMargin + this.f10752f;
                        } else {
                            i27 = i77;
                            int i83 = this.f10752f;
                            this.f10752f = Math.max(i83, ((ViewGroup.MarginLayoutParams) c1227b7).leftMargin + i83 + ((ViewGroup.MarginLayoutParams) c1227b7).rightMargin);
                        }
                        if (z20) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c1227b = c1227b7;
                            i20 = i81;
                            i21 = i82;
                            i23 = i27;
                            z5 = z21;
                            z6 = z20;
                        } else {
                            c1227b = c1227b7;
                            i20 = i81;
                            i21 = i82;
                            i23 = i27;
                            i24 = 1073741824;
                            z5 = z21;
                            z6 = z20;
                            z7 = true;
                            if (mode4 == i24 && ((ViewGroup.MarginLayoutParams) c1227b).height == -1) {
                                z8 = true;
                                z25 = true;
                            } else {
                                z8 = false;
                            }
                            i25 = ((ViewGroup.MarginLayoutParams) c1227b).topMargin + ((ViewGroup.MarginLayoutParams) c1227b).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i25;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i78, childAt6.getMeasuredState());
                            if (z6 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i26 = i25;
                            } else {
                                int i84 = c1227b.f10746b;
                                if (i84 < 0) {
                                    i84 = this.f10751e;
                                }
                                int i85 = (((i84 & 112) >> 4) & (-2)) >> 1;
                                i26 = i25;
                                iArr[i85] = Math.max(iArr[i85], baseline2);
                                iArr2[i85] = Math.max(iArr2[i85], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i21, measuredHeight3);
                            boolean z26 = !z23 && ((ViewGroup.MarginLayoutParams) c1227b).height == -1;
                            if (c1227b.f10745a <= 0.0f) {
                                if (z8) {
                                    measuredHeight3 = i26;
                                }
                                i80 = Math.max(i80, measuredHeight3);
                                i75 = i20;
                            } else {
                                if (z8) {
                                    measuredHeight3 = i26;
                                }
                                i75 = Math.max(i20, measuredHeight3);
                            }
                            i76 = max4;
                            i78 = combineMeasuredStates2;
                            z24 = z7;
                            z23 = z26;
                            f14 = f16;
                        }
                    } else {
                        int i86 = i77;
                        if (((ViewGroup.MarginLayoutParams) c1227b7).width == 0) {
                            f7 = 0.0f;
                            if (f15 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) c1227b7).width = -2;
                                i19 = 0;
                                i20 = i81;
                                i21 = i82;
                                i22 = i19;
                                i23 = i86;
                                z5 = z21;
                                z6 = z20;
                                measureChildWithMargins(childAt6, i2, f16 != f7 ? this.f10752f : 0, i3, 0);
                                if (i22 == Integer.MIN_VALUE) {
                                    c1227b = c1227b7;
                                    ((ViewGroup.MarginLayoutParams) c1227b).width = i22;
                                } else {
                                    c1227b = c1227b7;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z22) {
                                    int i87 = this.f10752f;
                                    this.f10752f = Math.max(i87, i87 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1227b).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b).rightMargin);
                                } else {
                                    this.f10752f = ((ViewGroup.MarginLayoutParams) c1227b).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) c1227b).rightMargin + this.f10752f;
                                }
                                if (z5) {
                                    i79 = Math.max(measuredWidth3, i79);
                                }
                            }
                        } else {
                            f7 = 0.0f;
                        }
                        i19 = Integer.MIN_VALUE;
                        i20 = i81;
                        i21 = i82;
                        i22 = i19;
                        i23 = i86;
                        z5 = z21;
                        z6 = z20;
                        measureChildWithMargins(childAt6, i2, f16 != f7 ? this.f10752f : 0, i3, 0);
                        if (i22 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z22) {
                        }
                        if (z5) {
                        }
                    }
                    z7 = z24;
                    i24 = 1073741824;
                    if (mode4 == i24) {
                    }
                    z8 = false;
                    i25 = ((ViewGroup.MarginLayoutParams) c1227b).topMargin + ((ViewGroup.MarginLayoutParams) c1227b).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i25;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i78, childAt6.getMeasuredState());
                    if (z6) {
                    }
                    i26 = i25;
                    int max42 = Math.max(i21, measuredHeight32);
                    if (z23) {
                    }
                    if (c1227b.f10745a <= 0.0f) {
                    }
                    i76 = max42;
                    i78 = combineMeasuredStates22;
                    z24 = z7;
                    z23 = z26;
                    f14 = f16;
                }
            }
            i77 = i23 + 1;
            z21 = z5;
            z20 = z6;
        }
        int i88 = i76;
        boolean z27 = z21;
        boolean z28 = z20;
        if (this.f10752f > 0 && g(virtualChildCount2)) {
            this.f10752f += this.f10758l;
        }
        int i89 = iArr[1];
        if (i89 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                max = i88;
                i6 = i78;
                if (z27 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f10752f = 0;
                    for (i18 = 0; i18 < virtualChildCount2; i18++) {
                        View childAt7 = getChildAt(i18);
                        if (childAt7 == null) {
                            this.f10752f = this.f10752f;
                        } else if (childAt7.getVisibility() != 8) {
                            C1227B c1227b8 = (C1227B) childAt7.getLayoutParams();
                            if (z22) {
                                this.f10752f = ((ViewGroup.MarginLayoutParams) c1227b8).leftMargin + i79 + ((ViewGroup.MarginLayoutParams) c1227b8).rightMargin + this.f10752f;
                            } else {
                                int i90 = this.f10752f;
                                this.f10752f = Math.max(i90, i90 + i79 + ((ViewGroup.MarginLayoutParams) c1227b8).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b8).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f10752f;
                this.f10752f = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, 0);
                int i91 = (16777215 & resolveSizeAndState2) - this.f10752f;
                if (!z24 || (i91 != 0 && f14 > 0.0f)) {
                    f3 = this.f10753g;
                    if (f3 > 0.0f) {
                        f14 = f3;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f10752f = 0;
                    int i92 = i6;
                    max = -1;
                    i7 = 0;
                    while (i7 < virtualChildCount2) {
                        View childAt8 = getChildAt(i7);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i12 = i91;
                            i13 = virtualChildCount2;
                        } else {
                            C1227B c1227b9 = (C1227B) childAt8.getLayoutParams();
                            float f17 = c1227b9.f10745a;
                            if (f17 > 0.0f) {
                                i13 = virtualChildCount2;
                                int i93 = (int) ((i91 * f17) / f14);
                                float f18 = f14 - f17;
                                int i94 = i91 - i93;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1227b9).topMargin + ((ViewGroup.MarginLayoutParams) c1227b9).bottomMargin, ((ViewGroup.MarginLayoutParams) c1227b9).height);
                                if (((ViewGroup.MarginLayoutParams) c1227b9).width == 0) {
                                    i17 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i93 <= 0) {
                                            i93 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i93, 1073741824), childMeasureSpec2);
                                        i92 = View.combineMeasuredStates(i92, childAt8.getMeasuredState() & (-16777216));
                                        f14 = f18;
                                        i14 = i94;
                                    }
                                } else {
                                    i17 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i93;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i17), childMeasureSpec2);
                                i92 = View.combineMeasuredStates(i92, childAt8.getMeasuredState() & (-16777216));
                                f14 = f18;
                                i14 = i94;
                            } else {
                                i14 = i91;
                                i13 = virtualChildCount2;
                            }
                            if (z22) {
                                f6 = f14;
                                this.f10752f = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1227b9).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b9).rightMargin + this.f10752f;
                                i15 = i14;
                            } else {
                                f6 = f14;
                                int i95 = this.f10752f;
                                i15 = i14;
                                this.f10752f = Math.max(i95, childAt8.getMeasuredWidth() + i95 + ((ViewGroup.MarginLayoutParams) c1227b9).leftMargin + ((ViewGroup.MarginLayoutParams) c1227b9).rightMargin);
                            }
                            boolean z29 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) c1227b9).height == -1;
                            int i96 = ((ViewGroup.MarginLayoutParams) c1227b9).topMargin + ((ViewGroup.MarginLayoutParams) c1227b9).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i96;
                            max = Math.max(max, measuredHeight4);
                            if (!z29) {
                                i96 = measuredHeight4;
                            }
                            i75 = Math.max(i75, i96);
                            if (z23) {
                                i16 = -1;
                                if (((ViewGroup.MarginLayoutParams) c1227b9).height == -1) {
                                    z = true;
                                    if (!z28 && (baseline = childAt8.getBaseline()) != i16) {
                                        int i97 = c1227b9.f10746b;
                                        if (i97 < 0) {
                                            i97 = this.f10751e;
                                        }
                                        int i98 = (((i97 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i98] = Math.max(iArr[i98], baseline);
                                        iArr2[i98] = Math.max(iArr2[i98], measuredHeight4 - baseline);
                                    }
                                    z23 = z;
                                    i12 = i15;
                                    f14 = f6;
                                }
                            } else {
                                i16 = -1;
                            }
                            z = false;
                            if (!z28) {
                            }
                            z23 = z;
                            i12 = i15;
                            f14 = f6;
                        }
                        i7++;
                        i91 = i12;
                        virtualChildCount2 = i13;
                    }
                    i8 = i3;
                    i9 = virtualChildCount2;
                    this.f10752f = getPaddingRight() + getPaddingLeft() + this.f10752f;
                    i10 = iArr[1];
                    if (i10 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c6 = 3;
                        if (iArr[3] == -1) {
                            i11 = 0;
                            i6 = i92;
                        }
                    } else {
                        c6 = 3;
                    }
                    i11 = 0;
                    max = Math.max(max, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i10, iArr[2]))));
                    i6 = i92;
                } else {
                    i75 = Math.max(i75, i80);
                    if (z27 && mode3 != 1073741824) {
                        for (int i99 = 0; i99 < virtualChildCount2; i99++) {
                            View childAt9 = getChildAt(i99);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((C1227B) childAt9.getLayoutParams()).f10745a > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i79, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i8 = i3;
                    i9 = virtualChildCount2;
                    i11 = 0;
                }
                if (!z23 || mode4 == 1073741824) {
                    i75 = max;
                }
                setMeasuredDimension((i6 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i75, getSuggestedMinimumHeight()), i8, i6 << 16));
                if (z25) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i100 = i9;
                while (i11 < i100) {
                    View childAt10 = getChildAt(i11);
                    if (childAt10.getVisibility() != 8) {
                        C1227B c1227b10 = (C1227B) childAt10.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) c1227b10).height == -1) {
                            int i101 = ((ViewGroup.MarginLayoutParams) c1227b10).width;
                            ((ViewGroup.MarginLayoutParams) c1227b10).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i2, 0, makeMeasureSpec3, 0);
                            ((ViewGroup.MarginLayoutParams) c1227b10).width = i101;
                        }
                    }
                    i11++;
                }
                return;
            }
        } else {
            c2 = 3;
        }
        i6 = i78;
        max = Math.max(i88, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(i89, iArr[2]))));
        if (z27) {
            this.f10752f = 0;
            while (i18 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f10752f;
        this.f10752f = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i2, 0);
        int i912 = (16777215 & resolveSizeAndState22) - this.f10752f;
        if (z24) {
        }
        f3 = this.f10753g;
        if (f3 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f10752f = 0;
        int i922 = i6;
        max = -1;
        i7 = 0;
        while (i7 < virtualChildCount2) {
        }
        i8 = i3;
        i9 = virtualChildCount2;
        this.f10752f = getPaddingRight() + getPaddingLeft() + this.f10752f;
        i10 = iArr[1];
        if (i10 != -1) {
        }
        c6 = 3;
        i11 = 0;
        max = Math.max(max, Math.max(iArr2[c6], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c6], Math.max(iArr[0], Math.max(i10, iArr[2]))));
        i6 = i922;
        if (!z23) {
        }
        i75 = max;
        setMeasuredDimension((i6 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i75, getSuggestedMinimumHeight()), i8, i6 << 16));
        if (z25) {
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f10747a = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f10748b = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f10757k) {
            return;
        }
        this.f10757k = drawable;
        if (drawable != null) {
            this.f10758l = drawable.getIntrinsicWidth();
            this.f10759m = drawable.getIntrinsicHeight();
        } else {
            this.f10758l = 0;
            this.f10759m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f10761o = i2;
    }

    public void setGravity(int i2) {
        if (this.f10751e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f10751e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i6 = this.f10751e;
        if ((8388615 & i6) != i3) {
            this.f10751e = i3 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f10754h = z;
    }

    public void setOrientation(int i2) {
        if (this.f10750d != i2) {
            this.f10750d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f10760n) {
            requestLayout();
        }
        this.f10760n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i6 = this.f10751e;
        if ((i6 & 112) != i3) {
            this.f10751e = i3 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f10753g = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
