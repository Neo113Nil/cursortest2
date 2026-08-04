package androidx.preference.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.api.f;
import p137t0.b;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9670b;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f9670b;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f9669a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i7);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i7 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i8);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i8 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i7) {
        this.f9670b = i7;
        super.setMaxHeight(i7);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i7) {
        this.f9669a = i7;
        super.setMaxWidth(i7);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9669a = f.API_PRIORITY_OTHER;
        this.f9670b = f.API_PRIORITY_OTHER;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f16274h, i7, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, f.API_PRIORITY_OTHER));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, f.API_PRIORITY_OTHER));
        typedArrayObtainStyledAttributes.recycle();
    }
}
