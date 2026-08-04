package androidx.constraintlayout.motion.widget;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import p169z.u;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8820A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f8821B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View[] f8822C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8823z;

    public MotionHelper(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8823z = false;
        this.f8820A = false;
        k(attributeSet);
    }

    public float getProgress() {
        return this.f8821B;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f944p);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == 1) {
                    this.f8823z = typedArrayObtainStyledAttributes.getBoolean(index, this.f8823z);
                } else if (index == 0) {
                    this.f8820A = typedArrayObtainStyledAttributes.getBoolean(index, this.f8820A);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void r(MotionLayout motionLayout, HashMap map) {
    }

    public void setProgress(float f7) {
        this.f8821B = f7;
        int i7 = 0;
        if (this.f8991b > 0) {
            this.f8822C = j((ConstraintLayout) getParent());
            while (i7 < this.f8991b) {
                View view = this.f8822C[i7];
                i7++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i7 < childCount) {
            boolean z4 = viewGroup.getChildAt(i7) instanceof MotionHelper;
            i7++;
        }
    }

    public void a(int i7) {
    }
}
