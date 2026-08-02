package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: hf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0284hf extends FrameLayout {

    /* JADX INFO: renamed from: o */
    public static final int[] f3191o = {R.attr.colorBackground};

    /* JADX INFO: renamed from: j */
    public boolean f3192j;

    /* JADX INFO: renamed from: k */
    public boolean f3193k;

    /* JADX INFO: renamed from: l */
    public final Rect f3194l;

    /* JADX INFO: renamed from: m */
    public final Rect f3195m;

    /* JADX INFO: renamed from: n */
    public final C0312i6 f3196n;

    public AbstractC0284hf(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, live.football.scorerepublic.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f3194l = rect;
        this.f3195m = new Rect();
        C0312i6 c0312i6 = new C0312i6(this);
        this.f3196n = c0312i6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hz0.f3363a, live.football.scorerepublic.R.attr.cardViewStyle, live.football.scorerepublic.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f3191o);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(live.football.scorerepublic.R.color.cardview_light_background) : getResources().getColor(live.football.scorerepublic.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f3192j = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f3193k = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        q31 q31Var = new q31(colorStateListValueOf, dimension);
        c0312i6.f3447k = q31Var;
        setBackgroundDrawable(q31Var);
        setClipToOutline(true);
        setElevation(dimension2);
        p80.m3870o(c0312i6, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((q31) this.f3196n.f3447k).f6360h;
    }

    public float getCardElevation() {
        return ((AbstractC0284hf) this.f3196n.f3448l).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f3194l.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f3194l.left;
    }

    public int getContentPaddingRight() {
        return this.f3194l.right;
    }

    public int getContentPaddingTop() {
        return this.f3194l.top;
    }

    public float getMaxCardElevation() {
        return ((q31) this.f3196n.f3447k).f6357e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f3193k;
    }

    public float getRadius() {
        return ((q31) this.f3196n.f3447k).f6353a;
    }

    public boolean getUseCompatPadding() {
        return this.f3192j;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        q31 q31Var = (q31) this.f3196n.f3447k;
        if (colorStateListValueOf == null) {
            q31Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        q31Var.f6360h = colorStateListValueOf;
        q31Var.f6354b.setColor(colorStateListValueOf.getColorForState(q31Var.getState(), q31Var.f6360h.getDefaultColor()));
        q31Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((AbstractC0284hf) this.f3196n.f3448l).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        p80.m3870o(this.f3196n, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f3193k) {
            this.f3193k = z;
            C0312i6 c0312i6 = this.f3196n;
            p80.m3870o(c0312i6, ((q31) c0312i6.f3447k).f6357e);
        }
    }

    public void setRadius(float f) {
        q31 q31Var = (q31) this.f3196n.f3447k;
        if (f == q31Var.f6353a) {
            return;
        }
        q31Var.f6353a = f;
        q31Var.m4032b(null);
        q31Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f3192j != z) {
            this.f3192j = z;
            C0312i6 c0312i6 = this.f3196n;
            p80.m3870o(c0312i6, ((q31) c0312i6.f3447k).f6357e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        q31 q31Var = (q31) this.f3196n.f3447k;
        if (colorStateList == null) {
            q31Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        q31Var.f6360h = colorStateList;
        q31Var.f6354b.setColor(colorStateList.getColorForState(q31Var.getState(), q31Var.f6360h.getDefaultColor()));
        q31Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
