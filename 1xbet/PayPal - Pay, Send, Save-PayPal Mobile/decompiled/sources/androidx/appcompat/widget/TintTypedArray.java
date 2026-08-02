package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class TintTypedArray {
    private android.util.TypedValue getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final android.content.res.TypedArray getHighSpeedVideoFpsRangesFor;

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr) {
        return new androidx.appcompat.widget.TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new androidx.appcompat.widget.TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static androidx.appcompat.widget.TintTypedArray obtainStyledAttributes(android.content.Context context, int i, int[] iArr) {
        return new androidx.appcompat.widget.TintTypedArray(context, context.obtainStyledAttributes(i, iArr));
    }

    private TintTypedArray(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = typedArray;
    }

    public android.content.res.TypedArray getWrappedTypeArray() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.graphics.drawable.Drawable getDrawable(int i) {
        int resourceId;
        if (this.getHighSpeedVideoFpsRangesFor.hasValue(i) && (resourceId = this.getHighSpeedVideoFpsRangesFor.getResourceId(i, 0)) != 0) {
            return androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRanges, resourceId);
        }
        return this.getHighSpeedVideoFpsRangesFor.getDrawable(i);
    }

    public android.graphics.drawable.Drawable getDrawableIfKnown(int i) {
        int resourceId;
        if (!this.getHighSpeedVideoFpsRangesFor.hasValue(i) || (resourceId = this.getHighSpeedVideoFpsRangesFor.getResourceId(i, 0)) == 0) {
            return null;
        }
        return androidx.appcompat.widget.AppCompatDrawableManager.get().getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, resourceId, true);
    }

    public android.graphics.Typeface getFont(int i, int i2, androidx.core.content.res.ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.getHighSpeedVideoFpsRangesFor.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.util.TypedValue();
        }
        return androidx.core.content.res.ResourcesCompat.getFont(this.getHighSpeedVideoFpsRanges, resourceId, this.getHighResolutionOutputSizeshNQ4ISI, i2, fontCallback);
    }

    public int length() {
        return this.getHighSpeedVideoFpsRangesFor.length();
    }

    public int getIndexCount() {
        return this.getHighSpeedVideoFpsRangesFor.getIndexCount();
    }

    public int getIndex(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getIndex(i);
    }

    public android.content.res.Resources getResources() {
        return this.getHighSpeedVideoFpsRangesFor.getResources();
    }

    public java.lang.CharSequence getText(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getText(i);
    }

    public java.lang.String getString(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getString(i);
    }

    public java.lang.String getNonResourceString(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getNonResourceString(i);
    }

    public boolean getBoolean(int i, boolean z) {
        return this.getHighSpeedVideoFpsRangesFor.getBoolean(i, z);
    }

    public int getInt(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getInt(i, i2);
    }

    public float getFloat(int i, float f) {
        return this.getHighSpeedVideoFpsRangesFor.getFloat(i, f);
    }

    public int getColor(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getColor(i, i2);
    }

    public android.content.res.ColorStateList getColorStateList(int i) {
        int resourceId;
        android.content.res.ColorStateList colorStateList;
        return (!this.getHighSpeedVideoFpsRangesFor.hasValue(i) || (resourceId = this.getHighSpeedVideoFpsRangesFor.getResourceId(i, 0)) == 0 || (colorStateList = androidx.appcompat.content.res.AppCompatResources.getColorStateList(this.getHighSpeedVideoFpsRanges, resourceId)) == null) ? this.getHighSpeedVideoFpsRangesFor.getColorStateList(i) : colorStateList;
    }

    public int getInteger(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getInteger(i, i2);
    }

    public float getDimension(int i, float f) {
        return this.getHighSpeedVideoFpsRangesFor.getDimension(i, f);
    }

    public int getDimensionPixelOffset(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getDimensionPixelOffset(i, i2);
    }

    public int getDimensionPixelSize(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getDimensionPixelSize(i, i2);
    }

    public int getLayoutDimension(int i, java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.getLayoutDimension(i, str);
    }

    public int getLayoutDimension(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getLayoutDimension(i, i2);
    }

    public float getFraction(int i, int i2, int i3, float f) {
        return this.getHighSpeedVideoFpsRangesFor.getFraction(i, i2, i3, f);
    }

    public int getResourceId(int i, int i2) {
        return this.getHighSpeedVideoFpsRangesFor.getResourceId(i, i2);
    }

    public java.lang.CharSequence[] getTextArray(int i) {
        return this.getHighSpeedVideoFpsRangesFor.getTextArray(i);
    }

    public boolean getValue(int i, android.util.TypedValue typedValue) {
        return this.getHighSpeedVideoFpsRangesFor.getValue(i, typedValue);
    }

    public int getType(int i) {
        return androidx.appcompat.widget.TintTypedArray.Api21Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, i);
    }

    public boolean hasValue(int i) {
        return this.getHighSpeedVideoFpsRangesFor.hasValue(i);
    }

    public android.util.TypedValue peekValue(int i) {
        return this.getHighSpeedVideoFpsRangesFor.peekValue(i);
    }

    public java.lang.String getPositionDescription() {
        return this.getHighSpeedVideoFpsRangesFor.getPositionDescription();
    }

    public void recycle() {
        this.getHighSpeedVideoFpsRangesFor.recycle();
    }

    public int getChangingConfigurations() {
        return androidx.appcompat.widget.TintTypedArray.Api21Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
    }

    /* loaded from: classes5.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        static int getHighSpeedVideoSizes(android.content.res.TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }

        static int getHighResolutionOutputSizeshNQ4ISI(android.content.res.TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }
    }
}
