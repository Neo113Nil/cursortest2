package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped = false;
        private int mShowDividersId;
        private int mWeightSumId;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            int mapBoolean;
            int mapInt;
            int mapGravity;
            int mapIntEnum;
            int mapFloat;
            int mapObject;
            int mapInt2;
            int mapBoolean2;
            int mapIntFlag;
            mapBoolean = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.mBaselineAlignedId = mapBoolean;
            mapInt = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.mBaselineAlignedChildIndexId = mapInt;
            mapGravity = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.mGravityId = mapGravity;
            mapIntEnum = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new IntFunction<String>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                public String apply(int i) {
                    return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
                }
            });
            this.mOrientationId = mapIntEnum;
            mapFloat = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.mWeightSumId = mapFloat;
            mapObject = propertyMapper.mapObject("divider", androidx.appcompat.R.attr.divider);
            this.mDividerId = mapObject;
            mapInt2 = propertyMapper.mapInt("dividerPadding", androidx.appcompat.R.attr.dividerPadding);
            this.mDividerPaddingId = mapInt2;
            mapBoolean2 = propertyMapper.mapBoolean("measureWithLargestChild", androidx.appcompat.R.attr.measureWithLargestChild);
            this.mMeasureWithLargestChildId = mapBoolean2;
            mapIntFlag = propertyMapper.mapIntFlag("showDividers", androidx.appcompat.R.attr.showDividers, new IntFunction<Set<String>>() { // from class: androidx.appcompat.widget.LinearLayoutCompat.InspectionCompanion.2
                @Override // java.util.function.IntFunction
                public Set<String> apply(int i) {
                    HashSet hashSet = new HashSet();
                    if (i == 0) {
                        hashSet.add("none");
                    }
                    if (i == 1) {
                        hashSet.add("beginning");
                    }
                    if (i == 2) {
                        hashSet.add("middle");
                    }
                    if (i == 4) {
                        hashSet.add("end");
                    }
                    return hashSet;
                }
            });
            this.mShowDividersId = mapIntFlag;
            this.mPropertiesMapped = true;
        }

        public void readProperties(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw C0191g.d();
            }
            propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.mDividerId, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void forceUniformHeight(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    i3 = i2;
                    measureChildWithMargins(virtualChildAt, i3, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    i3 = i2;
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, isLayoutRtl ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        char c;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i15 = i4 - i2;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        boolean z2 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i16, getLayoutDirection());
        char c2 = 2;
        boolean z3 = true;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        if (isLayoutRtl) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i18 = 0;
        while (i18 < virtualChildCount) {
            int i19 = (i6 * i18) + i5;
            int i20 = i18;
            View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i19) + paddingLeft;
                i8 = i20;
                i7 = paddingTop;
                c = c2;
                z = z3;
            } else {
                c = c2;
                z = z3;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i21 = paddingLeft;
                    if (z2) {
                        i9 = measuredHeight;
                        if (((LinearLayout.LayoutParams) layoutParams).height != -1) {
                            i10 = virtualChildAt.getBaseline();
                            i11 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i11 < 0) {
                                i11 = i17;
                            }
                            i12 = i11 & 112;
                            i7 = paddingTop;
                            if (i12 == 16) {
                                if (i12 == 48) {
                                    i13 = i7 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                    if (i10 != -1) {
                                        i13 = (iArr[z ? 1 : 0] - i10) + i13;
                                    }
                                } else if (i12 != 80) {
                                    i13 = i7;
                                } else {
                                    i13 = (paddingBottom - i9) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if (i10 != -1) {
                                        i14 = iArr2[c] - (virtualChildAt.getMeasuredHeight() - i10);
                                    }
                                }
                                int i22 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (hasDividerBeforeChildAt(i19) ? i21 + this.mDividerWidth : i21);
                                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i22, i13, measuredWidth, i9);
                                int nextLocationOffset = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i22;
                                i8 = getChildrenSkipCount(virtualChildAt, i19) + i20;
                                paddingLeft = nextLocationOffset;
                            } else {
                                i13 = ((paddingBottom2 - i9) / 2) + i7 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                i14 = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            }
                            i13 -= i14;
                            int i222 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (hasDividerBeforeChildAt(i19) ? i21 + this.mDividerWidth : i21);
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i222, i13, measuredWidth, i9);
                            int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i222;
                            i8 = getChildrenSkipCount(virtualChildAt, i19) + i20;
                            paddingLeft = nextLocationOffset2;
                        }
                    } else {
                        i9 = measuredHeight;
                    }
                    i10 = -1;
                    i11 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i11 < 0) {
                    }
                    i12 = i11 & 112;
                    i7 = paddingTop;
                    if (i12 == 16) {
                    }
                    i13 -= i14;
                    int i2222 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (hasDividerBeforeChildAt(i19) ? i21 + this.mDividerWidth : i21);
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i2222, i13, measuredWidth, i9);
                    int nextLocationOffset22 = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + i2222;
                    i8 = getChildrenSkipCount(virtualChildAt, i19) + i20;
                    paddingLeft = nextLocationOffset22;
                } else {
                    i7 = paddingTop;
                    i8 = i20;
                }
            }
            i18 = i8 + 1;
            c2 = c;
            z3 = z;
            paddingTop = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.mGravity;
        int i10 = i9 & 112;
        int i11 = i9 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : (((i4 - i2) - this.mTotalLength) / 2) + getPaddingTop();
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(i12) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i13 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else if (absoluteGravity != 5) {
                    i7 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    int i14 = i7;
                    if (hasDividerBeforeChildAt(i12)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i15 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(virtualChildAt, i14, getLocationOffset(virtualChildAt) + i15, measuredWidth, measuredHeight);
                    int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i15;
                    i12 += getChildrenSkipCount(virtualChildAt, i12);
                    paddingTop = nextLocationOffset;
                    i12++;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i7 = i5 - i6;
                int i142 = i7;
                if (hasDividerBeforeChildAt(i12)) {
                }
                int i152 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                setChildFrame(virtualChildAt, i142, getLocationOffset(virtualChildAt) + i152, measuredWidth, measuredHeight);
                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i152;
                i12 += getChildrenSkipCount(virtualChildAt, i12);
                paddingTop = nextLocationOffset2;
                i12++;
            }
            i12++;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0463  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int baseline;
        int i12;
        int i13;
        float f2;
        int i14;
        char c;
        int i15;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        boolean z3;
        int[] iArr2;
        View view;
        boolean z4;
        boolean z5;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z6 = this.mBaselineAligned;
        boolean z7 = this.mUseLargestChild;
        int i21 = 1073741824;
        boolean z8 = mode == 1073741824;
        boolean z9 = z7;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z10 = false;
        int i25 = 0;
        boolean z11 = false;
        boolean z12 = true;
        float f3 = 0.0f;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            i3 = i23;
            if (i22 >= virtualChildCount) {
                break;
            }
            boolean z13 = z6;
            View virtualChildAt = getVirtualChildAt(i22);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(i22) + this.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                i22 += getChildrenSkipCount(virtualChildAt, i22);
            } else {
                if (hasDividerBeforeChildAt(i22)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                float f4 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f5 = f3 + f4;
                if (mode == i21 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f4 > 0.0f) {
                    if (z8) {
                        this.mTotalLength = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + this.mTotalLength;
                    } else {
                        int i28 = this.mTotalLength;
                        this.mTotalLength = Math.max(i28, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i28 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z13) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i17 = virtualChildCount;
                        i18 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i17 = virtualChildCount;
                        i18 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z10 = true;
                    }
                    i19 = i3;
                    i20 = 1073741824;
                    z3 = z9;
                    view = virtualChildAt;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f4 <= 0.0f) {
                        c = 65534;
                        i15 = Integer.MIN_VALUE;
                    } else {
                        c = 65534;
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i15 = 0;
                    }
                    if (f5 == 0.0f) {
                        z2 = z9;
                        i16 = this.mTotalLength;
                    } else {
                        z2 = z9;
                        i16 = 0;
                    }
                    i17 = virtualChildCount;
                    i18 = mode;
                    iArr = iArr3;
                    i19 = i3;
                    i20 = 1073741824;
                    z3 = z2;
                    iArr2 = iArr4;
                    int i29 = i15;
                    measureChildBeforeLayout(virtualChildAt, i22, i, i16, i2, 0);
                    view = virtualChildAt;
                    if (i29 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i29;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z8) {
                        this.mTotalLength = getNextLocationOffset(view) + ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + this.mTotalLength;
                    } else {
                        int i30 = this.mTotalLength;
                        this.mTotalLength = Math.max(i30, getNextLocationOffset(view) + i30 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z3) {
                        i24 = Math.max(measuredWidth, i24);
                    }
                }
                if (mode2 == i20 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                    z4 = false;
                } else {
                    z4 = true;
                    z11 = true;
                }
                int i31 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i31;
                i25 = View.combineMeasuredStates(i25, view.getMeasuredState());
                if (!z13 || (baseline2 = view.getBaseline()) == -1) {
                    z5 = z4;
                } else {
                    int i32 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i32 < 0) {
                        i32 = this.mGravity;
                    }
                    int i33 = (((i32 & 112) >> 4) & (-2)) >> 1;
                    z5 = z4;
                    iArr[i33] = Math.max(iArr[i33], baseline2);
                    iArr2[i33] = Math.max(iArr2[i33], measuredHeight - baseline2);
                }
                int max = Math.max(i19, measuredHeight);
                z12 = z12 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                    if (!z5) {
                        i31 = measuredHeight;
                    }
                    i27 = Math.max(i27, i31);
                } else {
                    if (!z5) {
                        i31 = measuredHeight;
                    }
                    i26 = Math.max(i26, i31);
                }
                i22 += getChildrenSkipCount(view, i22);
                i23 = max;
                f3 = f5;
                i22++;
                z9 = z3;
                iArr4 = iArr2;
                z6 = z13;
                mode = i18;
                iArr3 = iArr;
                virtualChildCount = i17;
                i21 = 1073741824;
            }
            i17 = virtualChildCount;
            i18 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i23 = i3;
            z3 = z9;
            i22++;
            z9 = z3;
            iArr4 = iArr2;
            z6 = z13;
            mode = i18;
            iArr3 = iArr;
            virtualChildCount = i17;
            i21 = 1073741824;
        }
        boolean z14 = z6;
        int i34 = virtualChildCount;
        int i35 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i36 = i25;
        boolean z15 = z9;
        if (this.mTotalLength > 0) {
            i4 = i34;
            if (hasDividerBeforeChildAt(i4)) {
                this.mTotalLength += this.mDividerWidth;
            }
        } else {
            i4 = i34;
        }
        int i37 = iArr5[1];
        int max2 = (i37 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i3 : Math.max(i3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i37, iArr5[2]))));
        if (z15) {
            i5 = i35;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.mTotalLength = 0;
                int i38 = 0;
                while (i38 < i4) {
                    View virtualChildAt2 = getVirtualChildAt(i38);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength = measureNullChild(i38) + this.mTotalLength;
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        i38 += getChildrenSkipCount(virtualChildAt2, i38);
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                        if (z8) {
                            f2 = f3;
                            this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + i24 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + this.mTotalLength;
                            i14 = max2;
                            i38++;
                            f3 = f2;
                            max2 = i14;
                        } else {
                            f2 = f3;
                            int i39 = this.mTotalLength;
                            i14 = max2;
                            this.mTotalLength = Math.max(i39, getNextLocationOffset(virtualChildAt2) + i39 + i24 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                            i38++;
                            f3 = f2;
                            max2 = i14;
                        }
                    }
                    f2 = f3;
                    i14 = max2;
                    i38++;
                    f3 = f2;
                    max2 = i14;
                }
            }
            f = f3;
        } else {
            f = f3;
            i5 = i35;
        }
        int i40 = max2;
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
        int i41 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z10 || (i41 != 0 && f > 0.0f)) {
            float f6 = this.mWeightSum;
            if (f6 > 0.0f) {
                f = f6;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            int i42 = i36;
            int i43 = -1;
            int i44 = 0;
            while (i44 < i4) {
                View virtualChildAt3 = getVirtualChildAt(i44);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i10 = resolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f7 > 0.0f) {
                        int i45 = (int) ((i41 * f7) / f);
                        f -= f7;
                        i41 -= i45;
                        i10 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i13 = 1073741824;
                            if (i5 == 1073741824) {
                                if (i45 <= 0) {
                                    i45 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i45, 1073741824), childMeasureSpec);
                                i42 = View.combineMeasuredStates(i42, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                            }
                        } else {
                            i13 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i45;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i13), childMeasureSpec);
                        i42 = View.combineMeasuredStates(i42, virtualChildAt3.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                    } else {
                        i10 = resolveSizeAndState;
                    }
                    if (z8) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + this.mTotalLength;
                    } else {
                        int i46 = this.mTotalLength;
                        this.mTotalLength = Math.max(i46, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i46 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                    }
                    boolean z16 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i47 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i47;
                    i43 = Math.max(i43, measuredHeight2);
                    if (!z16) {
                        i47 = measuredHeight2;
                    }
                    int max3 = Math.max(i26, i47);
                    if (z12) {
                        i11 = -1;
                        if (((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z = true;
                            if (z14 && (baseline = virtualChildAt3.getBaseline()) != i11) {
                                i12 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                                if (i12 < 0) {
                                    i12 = this.mGravity;
                                }
                                int i48 = (((i12 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i48] = Math.max(iArr5[i48], baseline);
                                iArr6[i48] = Math.max(iArr6[i48], measuredHeight2 - baseline);
                            }
                            i26 = max3;
                            z12 = z;
                        }
                    } else {
                        i11 = -1;
                    }
                    z = false;
                    if (z14) {
                        i12 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i12 < 0) {
                        }
                        int i482 = (((i12 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i482] = Math.max(iArr5[i482], baseline);
                        iArr6[i482] = Math.max(iArr6[i482], measuredHeight2 - baseline);
                    }
                    i26 = max3;
                    z12 = z;
                }
                i44++;
                resolveSizeAndState = i10;
            }
            i6 = resolveSizeAndState;
            i7 = ViewCompat.MEASURED_STATE_MASK;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i49 = iArr5[1];
            i40 = (i49 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i43 : Math.max(i43, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i49, iArr5[2]))));
            i8 = i42;
            i9 = i26;
        } else {
            i9 = Math.max(i26, i27);
            if (z15 && i5 != 1073741824) {
                for (int i50 = 0; i50 < i4; i50++) {
                    View virtualChildAt4 = getVirtualChildAt(i50);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState;
            i8 = i36;
            i7 = ViewCompat.MEASURED_STATE_MASK;
        }
        if (z12 || mode2 == 1073741824) {
            i9 = i40;
        }
        setMeasuredDimension(i6 | (i8 & i7), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i9, getSuggestedMinimumHeight()), i2, i8 << 16));
        if (z11) {
            forceUniformHeight(i4, i);
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        boolean z;
        int i16;
        boolean z2;
        int max;
        int i17;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i18 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f = 0.0f;
        boolean z6 = true;
        while (true) {
            int i25 = 8;
            if (i19 >= virtualChildCount) {
                float f2 = f;
                int i26 = i20;
                int i27 = virtualChildCount;
                int i28 = mode2;
                boolean z7 = z3;
                int i29 = i21;
                int i30 = i22;
                int i31 = i23;
                if (this.mTotalLength > 0) {
                    i3 = i27;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i27;
                }
                int i32 = i28;
                if (z7 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.mTotalLength = 0;
                    int i33 = 0;
                    while (i33 < i3) {
                        View virtualChildAt = getVirtualChildAt(i33);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(i33) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i25) {
                            i33 += getChildrenSkipCount(virtualChildAt, i33);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i34 = this.mTotalLength;
                            this.mTotalLength = Math.max(i34, getNextLocationOffset(virtualChildAt) + i34 + i29 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        }
                        i33++;
                        i25 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
                int i35 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z4 || (i35 != 0 && f2 > 0.0f)) {
                    float f3 = this.mWeightSum;
                    if (f3 <= 0.0f) {
                        f3 = f2;
                    }
                    this.mTotalLength = 0;
                    float f4 = f3;
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i37);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i5 = i32;
                            i6 = i37;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f5 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f5 > 0.0f) {
                                i6 = i37;
                                int i38 = (int) ((i36 * f5) / f4);
                                f4 -= f5;
                                i36 -= i38;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i8 = 1073741824;
                                    if (i32 == 1073741824) {
                                        i5 = i32;
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i38 > 0 ? i38 : 0, 1073741824));
                                        i31 = View.combineMeasuredStates(i31, virtualChildAt2.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i8 = 1073741824;
                                }
                                i5 = i32;
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i38;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                i31 = View.combineMeasuredStates(i31, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i5 = i32;
                                i6 = i37;
                            }
                            int i39 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i39;
                            i30 = Math.max(i30, measuredWidth);
                            if (mode != 1073741824) {
                                i7 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width == -1) {
                                    measuredWidth = i39;
                                }
                            } else {
                                i7 = -1;
                            }
                            int max2 = Math.max(i24, measuredWidth);
                            boolean z8 = z6 && ((LinearLayout.LayoutParams) layoutParams2).width == i7;
                            int i40 = this.mTotalLength;
                            this.mTotalLength = Math.max(i40, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i40 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            i24 = max2;
                            z6 = z8;
                        }
                        i37 = i6 + 1;
                        i32 = i5;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    i4 = i24;
                } else {
                    i4 = Math.max(i24, i26);
                    if (z7 && i32 != 1073741824) {
                        for (int i41 = 0; i41 < i3; i41++) {
                            View virtualChildAt3 = getVirtualChildAt(i41);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                            }
                        }
                    }
                }
                if (!z6 && mode != 1073741824) {
                    i30 = i4;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i30, getSuggestedMinimumWidth()), i, i31), resolveSizeAndState);
                if (z5) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
            float f6 = f;
            View virtualChildAt4 = getVirtualChildAt(i19);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(i19) + this.mTotalLength;
            } else if (virtualChildAt4.getVisibility() == 8) {
                i19 += getChildrenSkipCount(virtualChildAt4, i19);
            } else {
                if (hasDividerBeforeChildAt(i19)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                float f7 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                float f8 = f6 + f7;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f7 > 0.0f) {
                    int i42 = this.mTotalLength;
                    this.mTotalLength = Math.max(i42, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i42 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    i16 = i20;
                    i12 = virtualChildCount;
                    i13 = mode2;
                    z4 = true;
                    view = virtualChildAt4;
                    i15 = i22;
                    i14 = i23;
                    z = z3;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f7 <= 0.0f) {
                        i9 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                        i9 = 0;
                    }
                    if (f8 == 0.0f) {
                        int i43 = i23;
                        i11 = this.mTotalLength;
                        i10 = i43;
                    } else {
                        i10 = i23;
                        i11 = 0;
                    }
                    int i44 = i21;
                    i12 = virtualChildCount;
                    i13 = mode2;
                    i14 = i10;
                    i15 = i22;
                    view = virtualChildAt4;
                    z = z3;
                    i16 = i20;
                    measureChildBeforeLayout(view, i19, i, 0, i2, i11);
                    if (i9 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams3).height = i9;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i45 = this.mTotalLength;
                    this.mTotalLength = Math.max(i45, getNextLocationOffset(view) + i45 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    i21 = z ? Math.max(measuredHeight2, i44) : i44;
                }
                if (i18 >= 0 && i18 == i19 + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (i19 < i18 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                    z5 = true;
                }
                int i46 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i46;
                max = Math.max(i15, measuredWidth2);
                int i47 = i21;
                int combineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                if (z6) {
                    i17 = combineMeasuredStates;
                    if (((LinearLayout.LayoutParams) layoutParams3).width == -1) {
                        z6 = true;
                        if (((LinearLayout.LayoutParams) layoutParams3).weight <= 0.0f) {
                            if (!z2) {
                                i46 = measuredWidth2;
                            }
                            i16 = Math.max(i16, i46);
                        } else {
                            if (!z2) {
                                i46 = measuredWidth2;
                            }
                            i24 = Math.max(i24, i46);
                        }
                        i19 += getChildrenSkipCount(view, i19);
                        f = f8;
                        i21 = i47;
                        i23 = i17;
                        i19++;
                        i22 = max;
                        i20 = i16;
                        z3 = z;
                        mode2 = i13;
                        virtualChildCount = i12;
                    }
                } else {
                    i17 = combineMeasuredStates;
                }
                z6 = false;
                if (((LinearLayout.LayoutParams) layoutParams3).weight <= 0.0f) {
                }
                i19 += getChildrenSkipCount(view, i19);
                f = f8;
                i21 = i47;
                i23 = i17;
                i19++;
                i22 = max;
                i20 = i16;
                z3 = z;
                mode2 = i13;
                virtualChildCount = i12;
            }
            i16 = i20;
            i12 = virtualChildCount;
            i13 = mode2;
            z = z3;
            f = f6;
            max = i22;
            i19++;
            i22 = max;
            i20 = i16;
            z3 = z;
            mode2 = i13;
            virtualChildCount = i12;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(@GravityInt int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.LinearLayoutCompat, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.LinearLayoutCompat, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int i2 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
