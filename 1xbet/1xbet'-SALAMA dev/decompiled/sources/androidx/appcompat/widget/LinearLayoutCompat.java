package androidx.appcompat.widget;

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
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int[] f8365A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Drawable f8366B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8367C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f8368D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8369E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f8370F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8376f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f8377x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8378y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f8379z;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8371a = true;
        this.f8372b = -1;
        this.f8373c = 0;
        this.f8375e = 8388659;
        int[] iArr = p051h.a.f13342o;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        int i8 = typedArray.getInt(1, -1);
        if (i8 >= 0) {
            setOrientation(i8);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f8377x = typedArray.getFloat(4, -1.0f);
        this.f8372b = typedArray.getInt(3, -1);
        this.f8378y = typedArray.getBoolean(7, false);
        setDividerDrawable(c1017n0F.u(5));
        this.f8369E = typedArray.getInt(8, 0);
        this.f8370F = typedArray.getDimensionPixelSize(6, 0);
        c1017n0F.H();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0636p0;
    }

    public final void e(Canvas canvas, int i7) {
        this.f8366B.setBounds(getPaddingLeft() + this.f8370F, i7, (getWidth() - getPaddingRight()) - this.f8370F, this.f8368D + i7);
        this.f8366B.draw(canvas);
    }

    public final void f(Canvas canvas, int i7) {
        this.f8366B.setBounds(i7, getPaddingTop() + this.f8370F, this.f8367C + i7, (getHeight() - getPaddingBottom()) - this.f8370F);
        this.f8366B.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0636p0 generateDefaultLayoutParams() {
        int i7 = this.f8374d;
        if (i7 == 0) {
            return new C0636p0(-2, -2);
        }
        if (i7 == 1) {
            return new C0636p0(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f8372b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f8372b;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8372b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f8373c;
        if (this.f8374d == 1 && (i7 = this.f8375e & 112) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8376f) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8376f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0636p0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8372b;
    }

    public Drawable getDividerDrawable() {
        return this.f8366B;
    }

    public int getDividerPadding() {
        return this.f8370F;
    }

    public int getDividerWidth() {
        return this.f8367C;
    }

    public int getGravity() {
        return this.f8375e;
    }

    public int getOrientation() {
        return this.f8374d;
    }

    public int getShowDividers() {
        return this.f8369E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8377x;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0636p0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0636p0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0636p0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0636p0(layoutParams);
    }

    public final boolean j(int i7) {
        if (i7 == 0) {
            return (this.f8369E & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f8369E & 4) != 0;
        }
        if ((this.f8369E & 2) == 0) {
            return false;
        }
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (getChildAt(i8).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        int bottom;
        if (this.f8366B == null) {
            return;
        }
        int i8 = 0;
        if (this.f8374d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i8 < virtualChildCount) {
                View childAt = getChildAt(i8);
                if (childAt != null && childAt.getVisibility() != 8 && j(i8)) {
                    e(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0636p0) childAt.getLayoutParams())).topMargin) - this.f8368D);
                }
                i8++;
            }
            if (j(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f8368D;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0636p0) childAt2.getLayoutParams())).bottomMargin;
                }
                e(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = q1.a(this);
        while (i8 < virtualChildCount2) {
            View childAt3 = getChildAt(i8);
            if (childAt3 != null && childAt3.getVisibility() != 8 && j(i8)) {
                C0636p0 c0636p0 = (C0636p0) childAt3.getLayoutParams();
                f(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0636p0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0636p0).leftMargin) - this.f8367C);
            }
            i8++;
        }
        if (j(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0636p0 c0636p1 = (C0636p0) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0636p1).leftMargin;
                    i7 = this.f8367C;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0636p1).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f8367C;
                right = left - i7;
            }
            f(canvas, right);
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

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int paddingLeft;
        int i11;
        int i12;
        int i13;
        int i14;
        int baseline;
        int i15;
        int i16;
        int measuredHeight;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (this.f8374d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i21 = i9 - i7;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f8375e;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            if (i23 != 16) {
                paddingTop = i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i10) - i8) - this.f8376f;
            } else {
                paddingTop = getPaddingTop() + (((i10 - i8) - this.f8376f) / 2);
            }
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt != null && childAt.getVisibility() != i20) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0636p0 c0636p0 = (C0636p0) childAt.getLayoutParams();
                    int i26 = ((LinearLayout.LayoutParams) c0636p0).gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    WeakHashMap weakHashMap = P.U.f5037a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i19 = ((LinearLayout.LayoutParams) c0636p0).leftMargin + paddingLeft2;
                        } else {
                            i17 = paddingRight - measuredWidth;
                            i18 = ((LinearLayout.LayoutParams) c0636p0).rightMargin;
                        }
                        if (j(i25)) {
                            paddingTop += this.f8368D;
                        }
                        int i27 = paddingTop + ((LinearLayout.LayoutParams) c0636p0).topMargin;
                        childAt.layout(i19, i27, measuredWidth + i19, i27 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0636p0).bottomMargin + i27;
                    } else {
                        i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c0636p0).leftMargin;
                        i18 = ((LinearLayout.LayoutParams) c0636p0).rightMargin;
                    }
                    i19 = i17 - i18;
                    if (j(i25)) {
                        paddingTop += this.f8368D;
                    }
                    int i28 = paddingTop + ((LinearLayout.LayoutParams) c0636p0).topMargin;
                    childAt.layout(i19, i28, measuredWidth + i19, i28 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0636p0).bottomMargin + i28;
                }
                i25++;
                i20 = 8;
            }
            return;
        }
        boolean zA = q1.a(this);
        int paddingTop2 = getPaddingTop();
        int i29 = i10 - i8;
        int paddingBottom = i29 - getPaddingBottom();
        int paddingBottom2 = (i29 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i30 = this.f8375e;
        int i31 = 8388615 & i30;
        int i32 = i30 & 112;
        boolean z7 = this.f8371a;
        int[] iArr = this.f8379z;
        int[] iArr2 = this.f8365A;
        WeakHashMap weakHashMap2 = P.U.f5037a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i31, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i9) - i7) - this.f8376f;
        } else {
            paddingLeft = getPaddingLeft() + (((i9 - i7) - this.f8376f) / 2);
        }
        if (zA) {
            i12 = virtualChildCount2 - 1;
            i11 = -1;
        } else {
            i11 = 1;
            i12 = 0;
        }
        int i33 = 0;
        while (i33 < virtualChildCount2) {
            int i34 = (i11 * i33) + i12;
            View childAt2 = getChildAt(i34);
            if (childAt2 == null) {
                i11 = i11;
                i13 = virtualChildCount2;
                i32 = i32;
                i14 = 1;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0636p0 c0636p1 = (C0636p0) childAt2.getLayoutParams();
                    if (z7) {
                        i13 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) c0636p1).height != -1 ? childAt2.getBaseline() : -1;
                        i15 = ((LinearLayout.LayoutParams) c0636p1).gravity;
                        if (i15 < 0) {
                            i15 = i32;
                        }
                        i16 = i15 & 112;
                        if (i16 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0636p1).topMargin) - ((LinearLayout.LayoutParams) c0636p1).bottomMargin;
                        } else if (i16 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) c0636p1).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i16 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0636p1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (j(i34)) {
                            paddingLeft += this.f8367C;
                        }
                        int i35 = paddingLeft + ((LinearLayout.LayoutParams) c0636p1).leftMargin;
                        childAt2.layout(i35, measuredHeight, i35 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0636p1).rightMargin + i35;
                    } else {
                        i13 = virtualChildCount2;
                    }
                    i15 = ((LinearLayout.LayoutParams) c0636p1).gravity;
                    if (i15 < 0) {
                        i15 = i32;
                    }
                    i16 = i15 & 112;
                    if (i16 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0636p1).topMargin) - ((LinearLayout.LayoutParams) c0636p1).bottomMargin;
                    } else if (i16 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) c0636p1).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i16 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0636p1).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (j(i34)) {
                        paddingLeft += this.f8367C;
                    }
                    int i36 = paddingLeft + ((LinearLayout.LayoutParams) c0636p1).leftMargin;
                    childAt2.layout(i36, measuredHeight, i36 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0636p1).rightMargin + i36;
                } else {
                    i13 = virtualChildCount2;
                }
                i14 = 1;
            }
            i33 += i14;
            i12 = i12;
            i11 = i11;
            virtualChildCount2 = i13;
            i32 = i32;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0486  */
    /* JADX WARN: Code duplicated, block: B:214:0x048b  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x04de  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:240:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0552  */
    /* JADX WARN: Code duplicated, block: B:252:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x055d  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:288:0x0600  */
    /* JADX WARN: Code duplicated, block: B:289:0x060c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0691  */
    /* JADX WARN: Code duplicated, block: B:315:0x0698  */
    /* JADX WARN: Code duplicated, block: B:318:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:373:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:381:0x0806  */
    /* JADX WARN: Code duplicated, block: B:388:0x083d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0860  */
    /* JADX WARN: Code duplicated, block: B:393:0x086e  */
    /* JADX WARN: Code duplicated, block: B:395:0x087a  */
    /* JADX WARN: Code duplicated, block: B:397:0x0886  */
    /* JADX WARN: Code duplicated, block: B:398:0x089b  */
    /* JADX WARN: Code duplicated, block: B:429:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        char c3;
        int iMax;
        int i9;
        float f7;
        int i10;
        int i11;
        int i12;
        char c4;
        int i13;
        View childAt;
        int i14;
        int i15;
        int i16;
        int baseline;
        int i17;
        int iMakeMeasureSpec;
        int i18;
        View childAt2;
        C0636p0 c0636p0;
        int i19;
        View childAt3;
        C0636p0 c0636p1;
        float f8;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z4;
        boolean z7;
        C0636p0 c0636p2;
        int measuredWidth;
        boolean z8;
        int i26;
        boolean z9;
        int i27;
        int measuredHeight;
        boolean z10;
        int baseline2;
        int i28;
        int i29;
        boolean z11;
        int i30;
        int i31;
        boolean z12;
        C0636p0 c0636p3;
        boolean z13;
        int i32;
        boolean z14;
        int iMax2;
        int i33 = -2;
        int i34 = 1073741824;
        int i35 = 8;
        int i36 = Integer.MIN_VALUE;
        float f9 = 0.0f;
        boolean z15 = true;
        if (this.f8374d == 1) {
            this.f8376f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int i37 = this.f8372b;
            boolean z16 = this.f8378y;
            boolean z17 = true;
            int i38 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z18 = false;
            int iMax5 = 0;
            int i39 = 0;
            int i40 = 0;
            boolean z19 = false;
            float f10 = 0.0f;
            while (i38 < virtualChildCount) {
                View childAt4 = getChildAt(i38);
                if (childAt4 == null) {
                    this.f8376f = this.f8376f;
                } else {
                    if (childAt4.getVisibility() != i35) {
                        if (j(i38)) {
                            this.f8376f += this.f8368D;
                        }
                        C0636p0 c0636p4 = (C0636p0) childAt4.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) c0636p4).weight;
                        f10 += f11;
                        if (mode2 == i34 && ((LinearLayout.LayoutParams) c0636p4).height == 0 && f11 > f9) {
                            int i41 = this.f8376f;
                            this.f8376f = Math.max(i41, ((LinearLayout.LayoutParams) c0636p4).topMargin + i41 + ((LinearLayout.LayoutParams) c0636p4).bottomMargin);
                            c0636p3 = c0636p4;
                            z13 = true;
                            z12 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) c0636p4).height != 0 || f11 <= f9) {
                                i31 = i36;
                            } else {
                                ((LinearLayout.LayoutParams) c0636p4).height = i33;
                                i31 = 0;
                            }
                            int i42 = f10 == f9 ? this.f8376f : 0;
                            z12 = true;
                            c0636p3 = c0636p4;
                            measureChildWithMargins(childAt4, i7, 0, i8, i42);
                            if (i31 != i36) {
                                ((LinearLayout.LayoutParams) c0636p3).height = i31;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i43 = this.f8376f;
                            this.f8376f = Math.max(i43, i43 + measuredHeight2 + ((LinearLayout.LayoutParams) c0636p3).topMargin + ((LinearLayout.LayoutParams) c0636p3).bottomMargin);
                            int i44 = iMax5;
                            if (z16) {
                                iMax5 = Math.max(measuredHeight2, i44);
                            }
                            z13 = z18;
                        }
                        if (i37 >= 0 && i37 == i38 + 1) {
                            this.f8373c = this.f8376f;
                        }
                        if (i38 < i37 && ((LinearLayout.LayoutParams) c0636p3).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i32 = mode;
                        if (i32 == 1073741824 || ((LinearLayout.LayoutParams) c0636p3).width != -1) {
                            z14 = false;
                        } else {
                            z14 = z12;
                            z19 = z14;
                        }
                        int i45 = ((LinearLayout.LayoutParams) c0636p3).leftMargin + ((LinearLayout.LayoutParams) c0636p3).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i45;
                        iMax2 = Math.max(i39, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i40, childAt4.getMeasuredState());
                        boolean z20 = (z17 && ((LinearLayout.LayoutParams) c0636p3).width == -1) ? z12 : false;
                        if (((LinearLayout.LayoutParams) c0636p3).weight > 0.0f) {
                            if (!z14) {
                                i45 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i45);
                        } else {
                            int i46 = iMax4;
                            if (!z14) {
                                i45 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i45);
                            iMax4 = i46;
                        }
                        z18 = z13;
                        i40 = iCombineMeasuredStates;
                        z17 = z20;
                    }
                    i38++;
                    mode = i32;
                    i39 = iMax2;
                    i37 = i37;
                    z15 = z12;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i33 = -2;
                    i34 = 1073741824;
                    i35 = 8;
                    i36 = Integer.MIN_VALUE;
                    f9 = 0.0f;
                }
                i37 = i37;
                mode2 = mode2;
                i32 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i39;
                z12 = true;
                i38++;
                mode = i32;
                i39 = iMax2;
                i37 = i37;
                z15 = z12;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i33 = -2;
                i34 = 1073741824;
                i35 = 8;
                i36 = Integer.MIN_VALUE;
                f9 = 0.0f;
            }
            int i47 = mode2;
            int i48 = mode;
            int i49 = virtualChildCount;
            boolean z21 = z15;
            int iMax6 = iMax3;
            int i50 = iMax4;
            int i51 = iMax5;
            int i52 = i39;
            int iCombineMeasuredStates2 = i40;
            if (this.f8376f > 0 && j(i49)) {
                this.f8376f += this.f8368D;
            }
            int i53 = i47;
            if (z16 && (i53 == Integer.MIN_VALUE || i53 == 0)) {
                this.f8376f = 0;
                for (int i54 = 0; i54 < i49; i54++) {
                    View childAt5 = getChildAt(i54);
                    if (childAt5 == null) {
                        this.f8376f = this.f8376f;
                    } else if (childAt5.getVisibility() != 8) {
                        C0636p0 c0636p5 = (C0636p0) childAt5.getLayoutParams();
                        int i55 = this.f8376f;
                        this.f8376f = Math.max(i55, i55 + i51 + ((LinearLayout.LayoutParams) c0636p5).topMargin + ((LinearLayout.LayoutParams) c0636p5).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f8376f;
            this.f8376f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, 0);
            int i56 = (16777215 & iResolveSizeAndState) - this.f8376f;
            if (z18 || (i56 != 0 && f10 > 0.0f)) {
                float f12 = this.f8377x;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                this.f8376f = 0;
                int i57 = 0;
                while (i57 < i49) {
                    View childAt6 = getChildAt(i57);
                    if (childAt6.getVisibility() == 8) {
                        i28 = i53;
                    } else {
                        C0636p0 c0636p6 = (C0636p0) childAt6.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) c0636p6).weight;
                        if (f13 > 0.0f) {
                            int i58 = (int) ((i56 * f13) / f10);
                            f10 -= f13;
                            int i59 = i56 - i58;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0636p6).leftMargin + ((LinearLayout.LayoutParams) c0636p6).rightMargin, ((LinearLayout.LayoutParams) c0636p6).width);
                            if (((LinearLayout.LayoutParams) c0636p6).height == 0) {
                                i30 = 1073741824;
                                if (i53 == 1073741824) {
                                    if (i58 <= 0) {
                                        i58 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i58, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i56 = i59;
                            } else {
                                i30 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i58;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i30));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i56 = i59;
                        }
                        int i60 = ((LinearLayout.LayoutParams) c0636p6).leftMargin + ((LinearLayout.LayoutParams) c0636p6).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i60;
                        int iMax7 = Math.max(i52, measuredWidth3);
                        if (i48 != 1073741824) {
                            i28 = i53;
                            i29 = -1;
                            if (((LinearLayout.LayoutParams) c0636p6).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i60);
                            if (z17 || ((LinearLayout.LayoutParams) c0636p6).width != i29) {
                                z11 = false;
                            } else {
                                z11 = z21;
                            }
                            int i61 = this.f8376f;
                            this.f8376f = Math.max(i61, childAt6.getMeasuredHeight() + i61 + ((LinearLayout.LayoutParams) c0636p6).topMargin + ((LinearLayout.LayoutParams) c0636p6).bottomMargin);
                            z17 = z11;
                            i52 = iMax7;
                        } else {
                            i28 = i53;
                            i29 = -1;
                        }
                        i60 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i60);
                        if (z17) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        int i62 = this.f8376f;
                        this.f8376f = Math.max(i62, childAt6.getMeasuredHeight() + i62 + ((LinearLayout.LayoutParams) c0636p6).topMargin + ((LinearLayout.LayoutParams) c0636p6).bottomMargin);
                        z17 = z11;
                        i52 = iMax7;
                    }
                    i57++;
                    i53 = i28;
                }
                this.f8376f = getPaddingBottom() + getPaddingTop() + this.f8376f;
            } else {
                iMax6 = Math.max(iMax6, i50);
                if (z16 && i53 != 1073741824) {
                    for (int i63 = 0; i63 < i49; i63++) {
                        View childAt7 = getChildAt(i63);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0636p0) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i51, 1073741824));
                        }
                    }
                }
            }
            int i64 = i52;
            if (z17 || i48 == 1073741824) {
                iMax6 = i64;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i7, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z19) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i65 = 0; i65 < i49; i65++) {
                    View childAt8 = getChildAt(i65);
                    if (childAt8.getVisibility() != 8) {
                        C0636p0 c0636p7 = (C0636p0) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0636p7).width == -1) {
                            int i66 = ((LinearLayout.LayoutParams) c0636p7).height;
                            ((LinearLayout.LayoutParams) c0636p7).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i8, 0);
                            ((LinearLayout.LayoutParams) c0636p7).height = i66;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f8376f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i7);
        int mode4 = View.MeasureSpec.getMode(i8);
        if (this.f8379z == null || this.f8365A == null) {
            this.f8379z = new int[4];
            this.f8365A = new int[4];
        }
        int[] iArr = this.f8379z;
        int[] iArr2 = this.f8365A;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z22 = this.f8371a;
        boolean z23 = this.f8378y;
        boolean z24 = mode3 == 1073741824;
        boolean z25 = true;
        int iMax8 = 0;
        float f14 = 0.0f;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z26 = false;
        boolean z27 = false;
        while (i68 < virtualChildCount2) {
            View childAt9 = getChildAt(i68);
            if (childAt9 == null) {
                this.f8376f = this.f8376f;
                i25 = i68;
                z4 = z23;
                z7 = z22;
            } else {
                int i70 = iMax8;
                int i71 = i67;
                if (childAt9.getVisibility() == 8) {
                    z7 = z22;
                    iMax8 = i70;
                    i67 = i71;
                    i25 = i68;
                    z4 = z23;
                } else {
                    if (j(i68)) {
                        this.f8376f += this.f8367C;
                    }
                    C0636p0 c0636p8 = (C0636p0) childAt9.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) c0636p8).weight;
                    float f16 = f14 + f15;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0636p8).width == 0 && f15 > 0.0f) {
                        if (z24) {
                            this.f8376f = ((LinearLayout.LayoutParams) c0636p8).leftMargin + ((LinearLayout.LayoutParams) c0636p8).rightMargin + this.f8376f;
                        } else {
                            int i72 = this.f8376f;
                            this.f8376f = Math.max(i72, ((LinearLayout.LayoutParams) c0636p8).leftMargin + i72 + ((LinearLayout.LayoutParams) c0636p8).rightMargin);
                        }
                        if (z22) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            c0636p2 = c0636p8;
                            i22 = i70;
                            i23 = i71;
                            i25 = i68;
                            z4 = z23;
                            z7 = z22;
                        } else {
                            c0636p2 = c0636p8;
                            i22 = i70;
                            i23 = i71;
                            i25 = i68;
                            i26 = 1073741824;
                            z4 = z23;
                            z7 = z22;
                            z8 = true;
                        }
                        if (mode4 == i26 && ((LinearLayout.LayoutParams) c0636p2).height == -1) {
                            z9 = true;
                            z27 = true;
                        } else {
                            z9 = false;
                        }
                        i27 = ((LinearLayout.LayoutParams) c0636p2).topMargin + ((LinearLayout.LayoutParams) c0636p2).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i27;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i69, childAt9.getMeasuredState());
                        if (!z7 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i73 = ((LinearLayout.LayoutParams) c0636p2).gravity;
                            if (i73 < 0) {
                                i73 = this.f8375e;
                            }
                            int i74 = (((i73 & 112) >> 4) & (-2)) >> 1;
                            iArr[i74] = Math.max(iArr[i74], baseline2);
                            iArr2[i74] = Math.max(iArr2[i74], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(i23, measuredHeight);
                        if (z25 || ((LinearLayout.LayoutParams) c0636p2).height != -1) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (((LinearLayout.LayoutParams) c0636p2).weight > 0.0f) {
                            if (z9) {
                                measuredHeight = i27;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax8 = i22;
                        } else {
                            if (z9) {
                                measuredHeight = i27;
                            }
                            iMax8 = Math.max(i22, measuredHeight);
                        }
                        i67 = iMax11;
                        i69 = iCombineMeasuredStates3;
                        z26 = z8;
                        z25 = z10;
                        f14 = f16;
                    } else {
                        int i75 = i68;
                        if (((LinearLayout.LayoutParams) c0636p8).width == 0) {
                            f8 = 0.0f;
                            if (f15 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0636p8).width = -2;
                                i20 = 0;
                            }
                            if (f16 == f8) {
                                i21 = this.f8376f;
                            } else {
                                i21 = 0;
                            }
                            i22 = i70;
                            i23 = i71;
                            i24 = i20;
                            i25 = i75;
                            z4 = z23;
                            z7 = z22;
                            measureChildWithMargins(childAt9, i7, i21, i8, 0);
                            if (i24 != Integer.MIN_VALUE) {
                                c0636p2 = c0636p8;
                                ((LinearLayout.LayoutParams) c0636p2).width = i24;
                            } else {
                                c0636p2 = c0636p8;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z24) {
                                this.f8376f = ((LinearLayout.LayoutParams) c0636p2).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c0636p2).rightMargin + this.f8376f;
                            } else {
                                int i76 = this.f8376f;
                                this.f8376f = Math.max(i76, i76 + measuredWidth + ((LinearLayout.LayoutParams) c0636p2).leftMargin + ((LinearLayout.LayoutParams) c0636p2).rightMargin);
                            }
                            if (z4) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f8 = 0.0f;
                        }
                        i20 = Integer.MIN_VALUE;
                        if (f16 == f8) {
                            i21 = this.f8376f;
                        } else {
                            i21 = 0;
                        }
                        i22 = i70;
                        i23 = i71;
                        i24 = i20;
                        i25 = i75;
                        z4 = z23;
                        z7 = z22;
                        measureChildWithMargins(childAt9, i7, i21, i8, 0);
                        if (i24 != Integer.MIN_VALUE) {
                            c0636p2 = c0636p8;
                            ((LinearLayout.LayoutParams) c0636p2).width = i24;
                        } else {
                            c0636p2 = c0636p8;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z24) {
                            this.f8376f = ((LinearLayout.LayoutParams) c0636p2).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c0636p2).rightMargin + this.f8376f;
                        } else {
                            int i77 = this.f8376f;
                            this.f8376f = Math.max(i77, i77 + measuredWidth + ((LinearLayout.LayoutParams) c0636p2).leftMargin + ((LinearLayout.LayoutParams) c0636p2).rightMargin);
                        }
                        if (z4) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z8 = z26;
                    i26 = 1073741824;
                    if (mode4 == i26) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    i27 = ((LinearLayout.LayoutParams) c0636p2).topMargin + ((LinearLayout.LayoutParams) c0636p2).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i27;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i69, childAt9.getMeasuredState());
                    if (!z7) {
                    }
                    int iMax12 = Math.max(i23, measuredHeight);
                    if (z25) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (((LinearLayout.LayoutParams) c0636p2).weight > 0.0f) {
                        if (z9) {
                            measuredHeight = i27;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax8 = i22;
                    } else {
                        if (z9) {
                            measuredHeight = i27;
                        }
                        iMax8 = Math.max(i22, measuredHeight);
                    }
                    i67 = iMax12;
                    i69 = iCombineMeasuredStates4;
                    z26 = z8;
                    z25 = z10;
                    f14 = f16;
                }
            }
            i68 = i25 + 1;
            z23 = z4;
            z22 = z7;
        }
        int i78 = i67;
        boolean z28 = z23;
        boolean z29 = z22;
        if (this.f8376f > 0 && j(virtualChildCount2)) {
            this.f8376f += this.f8367C;
        }
        int i79 = iArr[1];
        if (i79 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c3 = 3;
            if (iArr[3] == -1) {
                iMax = i78;
            }
            if (z28 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f8376f = 0;
                for (i19 = 0; i19 < virtualChildCount2; i19++) {
                    childAt3 = getChildAt(i19);
                    if (childAt3 == null) {
                        this.f8376f = this.f8376f;
                    } else if (childAt3.getVisibility() == 8) {
                        c0636p1 = (C0636p0) childAt3.getLayoutParams();
                        if (z24) {
                            this.f8376f = ((LinearLayout.LayoutParams) c0636p1).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0636p1).rightMargin + this.f8376f;
                        } else {
                            int i80 = this.f8376f;
                            this.f8376f = Math.max(i80, i80 + iMax9 + ((LinearLayout.LayoutParams) c0636p1).leftMargin + ((LinearLayout.LayoutParams) c0636p1).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f8376f;
            this.f8376f = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, 0);
            i9 = (16777215 & iResolveSizeAndState2) - this.f8376f;
            if (!z26 || (i9 != 0 && f14 > 0.0f)) {
                f7 = this.f8377x;
                if (f7 > 0.0f) {
                    f14 = f7;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f8376f = 0;
                int iCombineMeasuredStates5 = i69;
                iMax = -1;
                i10 = 0;
                while (i10 < virtualChildCount2) {
                    childAt = getChildAt(i10);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i14 = i9;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        C0636p0 c0636p9 = (C0636p0) childAt.getLayoutParams();
                        float f17 = ((LinearLayout.LayoutParams) c0636p9).weight;
                        if (f17 > 0.0f) {
                            int i81 = (int) ((i9 * f17) / f14);
                            float f18 = f14 - f17;
                            int i82 = i9 - i81;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0636p9).topMargin + ((LinearLayout.LayoutParams) c0636p9).bottomMargin, ((LinearLayout.LayoutParams) c0636p9).height);
                            if (((LinearLayout.LayoutParams) c0636p9).width == 0) {
                                i17 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i81 <= 0) {
                                        i81 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i81, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f14 = f18;
                                i15 = i82;
                            } else {
                                i17 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i81;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i17), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f14 = f18;
                            i15 = i82;
                        } else {
                            i15 = i9;
                        }
                        if (z24) {
                            this.f8376f = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0636p9).leftMargin + ((LinearLayout.LayoutParams) c0636p9).rightMargin + this.f8376f;
                        } else {
                            int i83 = this.f8376f;
                            this.f8376f = Math.max(i83, childAt.getMeasuredWidth() + i83 + ((LinearLayout.LayoutParams) c0636p9).leftMargin + ((LinearLayout.LayoutParams) c0636p9).rightMargin);
                        }
                        boolean z30 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0636p9).height == -1;
                        int i84 = ((LinearLayout.LayoutParams) c0636p9).topMargin + ((LinearLayout.LayoutParams) c0636p9).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i84;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z30) {
                            i84 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i84);
                        if (z25) {
                            i16 = -1;
                            boolean z31 = ((LinearLayout.LayoutParams) c0636p9).height == -1;
                            if (!z29 && (baseline = childAt.getBaseline()) != i16) {
                                int i85 = ((LinearLayout.LayoutParams) c0636p9).gravity;
                                if (i85 < 0) {
                                    i85 = this.f8375e;
                                }
                                int i86 = (((i85 & 112) >> 4) & (-2)) >> 1;
                                iArr[i86] = Math.max(iArr[i86], baseline);
                                iArr2[i86] = Math.max(iArr2[i86], measuredHeight4 - baseline);
                            }
                            z25 = z31;
                            i14 = i15;
                            f14 = f14;
                        } else {
                            i16 = -1;
                        }
                        if (!z29) {
                        }
                        z25 = z31;
                        i14 = i15;
                        f14 = f14;
                    }
                    i10++;
                    i9 = i14;
                    virtualChildCount2 = virtualChildCount2;
                }
                i11 = virtualChildCount2;
                this.f8376f = getPaddingRight() + getPaddingLeft() + this.f8376f;
                i12 = iArr[1];
                if (i12 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c4 = 3;
                    if (iArr[3] == -1) {
                        i13 = 0;
                    }
                    i69 = iCombineMeasuredStates5;
                } else {
                    c4 = 3;
                }
                i13 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i12, iArr[2]))));
                i69 = iCombineMeasuredStates5;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z28 && mode3 != 1073741824) {
                    for (int i87 = 0; i87 < virtualChildCount2; i87++) {
                        View childAt10 = getChildAt(i87);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0636p0) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i11 = virtualChildCount2;
                i13 = 0;
            }
            if (z25 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i69 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i8, i69 << 16));
            if (z27) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i18 = i11;
                while (i13 < i18) {
                    childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        c0636p0 = (C0636p0) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0636p0).height == -1) {
                            int i88 = ((LinearLayout.LayoutParams) c0636p0).width;
                            ((LinearLayout.LayoutParams) c0636p0).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i7, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) c0636p0).width = i88;
                        }
                    }
                    i13++;
                }
            }
        }
        c3 = 3;
        iMax = Math.max(i78, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i79, iArr[2]))));
        if (z28) {
            this.f8376f = 0;
            while (i19 < virtualChildCount2) {
                childAt3 = getChildAt(i19);
                if (childAt3 == null) {
                    this.f8376f = this.f8376f;
                } else if (childAt3.getVisibility() == 8) {
                    c0636p1 = (C0636p0) childAt3.getLayoutParams();
                    if (z24) {
                        this.f8376f = ((LinearLayout.LayoutParams) c0636p1).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0636p1).rightMargin + this.f8376f;
                    } else {
                        int i89 = this.f8376f;
                        this.f8376f = Math.max(i89, i89 + iMax9 + ((LinearLayout.LayoutParams) c0636p1).leftMargin + ((LinearLayout.LayoutParams) c0636p1).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f8376f;
        this.f8376f = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i7, 0);
        i9 = (16777215 & iResolveSizeAndState3) - this.f8376f;
        if (z26) {
            f7 = this.f8377x;
            if (f7 > 0.0f) {
                f14 = f7;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f8376f = 0;
            int iCombineMeasuredStates6 = i69;
            iMax = -1;
            i10 = 0;
            while (i10 < virtualChildCount2) {
                childAt = getChildAt(i10);
                if (childAt != null) {
                    i14 = i9;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i14 = i9;
                    virtualChildCount2 = virtualChildCount2;
                }
                i10++;
                i9 = i14;
                virtualChildCount2 = virtualChildCount2;
            }
            i11 = virtualChildCount2;
            this.f8376f = getPaddingRight() + getPaddingLeft() + this.f8376f;
            i12 = iArr[1];
            if (i12 != -1) {
                c4 = 3;
                i13 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i12, iArr[2]))));
            } else {
                c4 = 3;
                i13 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i12, iArr[2]))));
            }
            i69 = iCombineMeasuredStates6;
        } else {
            f7 = this.f8377x;
            if (f7 > 0.0f) {
                f14 = f7;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f8376f = 0;
            int iCombineMeasuredStates7 = i69;
            iMax = -1;
            i10 = 0;
            while (i10 < virtualChildCount2) {
                childAt = getChildAt(i10);
                if (childAt != null) {
                    i14 = i9;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i14 = i9;
                    virtualChildCount2 = virtualChildCount2;
                }
                i10++;
                i9 = i14;
                virtualChildCount2 = virtualChildCount2;
            }
            i11 = virtualChildCount2;
            this.f8376f = getPaddingRight() + getPaddingLeft() + this.f8376f;
            i12 = iArr[1];
            if (i12 != -1) {
                c4 = 3;
                i13 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i12, iArr[2]))));
            } else {
                c4 = 3;
                i13 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i12, iArr[2]))));
            }
            i69 = iCombineMeasuredStates7;
        }
        if (z25) {
            iMax8 = iMax;
        } else {
            iMax8 = iMax;
        }
        setMeasuredDimension((i69 & (-16777216)) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i8, i69 << 16));
        if (z27) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i18 = i11;
            while (i13 < i18) {
                childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != 8) {
                    c0636p0 = (C0636p0) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0636p0).height == -1) {
                        int i810 = ((LinearLayout.LayoutParams) c0636p0).width;
                        ((LinearLayout.LayoutParams) c0636p0).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i7, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) c0636p0).width = i810;
                    }
                }
                i13++;
            }
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f8371a = z4;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f8372b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8366B) {
            return;
        }
        this.f8366B = drawable;
        if (drawable != null) {
            this.f8367C = drawable.getIntrinsicWidth();
            this.f8368D = drawable.getIntrinsicHeight();
        } else {
            this.f8367C = 0;
            this.f8368D = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f8370F = i7;
    }

    public void setGravity(int i7) {
        if (this.f8375e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f8375e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f8375e;
        if ((8388615 & i9) != i8) {
            this.f8375e = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f8378y = z4;
    }

    public void setOrientation(int i7) {
        if (this.f8374d != i7) {
            this.f8374d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f8369E) {
            requestLayout();
        }
        this.f8369E = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f8375e;
        if ((i9 & 112) != i8) {
            this.f8375e = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.f8377x = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
