package androidx.preference.internal;

import G4.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes8.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f44613a;

    /* renamed from: b, reason: collision with root package name */
    private int f44614b;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f44613a = Integer.MAX_VALUE;
        this.f44614b = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f9709j, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public final int getMaxHeight() {
        return this.f44614b;
    }

    @Override // android.widget.ImageView
    public final int getMaxWidth() {
        return this.f44613a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i11);
            int i13 = this.f44613a;
            if (i13 != Integer.MAX_VALUE && (i13 < size || mode == 0)) {
                i11 = View.MeasureSpec.makeMeasureSpec(i13, LinearLayoutManager.INVALID_OFFSET);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i12);
            int i14 = this.f44614b;
            if (i14 != Integer.MAX_VALUE && (i14 < size2 || mode2 == 0)) {
                i12 = View.MeasureSpec.makeMeasureSpec(i14, LinearLayoutManager.INVALID_OFFSET);
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.ImageView
    public final void setMaxHeight(int i11) {
        this.f44614b = i11;
        super.setMaxHeight(i11);
    }

    @Override // android.widget.ImageView
    public final void setMaxWidth(int i11) {
        this.f44613a = i11;
        super.setMaxWidth(i11);
    }
}
