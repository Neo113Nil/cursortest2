package androidx.constraintlayout.utils.widget;

import A.d;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Path f8932f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewOutlineProvider f8933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RectF f8934y;

    public MotionButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8930d = 0.0f;
        this.f8931e = Float.NaN;
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f938i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == 10) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRound() {
        return this.f8931e;
    }

    public float getRoundPercent() {
        return this.f8930d;
    }

    public void setRound(float f7) {
        if (Float.isNaN(f7)) {
            this.f8931e = f7;
            float f8 = this.f8930d;
            this.f8930d = -1.0f;
            setRoundPercent(f8);
            return;
        }
        boolean z4 = this.f8931e != f7;
        this.f8931e = f7;
        if (f7 != 0.0f) {
            if (this.f8932f == null) {
                this.f8932f = new Path();
            }
            if (this.f8934y == null) {
                this.f8934y = new RectF();
            }
            if (this.f8933x == null) {
                d dVar = new d(this, 1);
                this.f8933x = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            this.f8934y.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8932f.reset();
            Path path = this.f8932f;
            RectF rectF = this.f8934y;
            float f9 = this.f8931e;
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f7) {
        boolean z4 = this.f8930d != f7;
        this.f8930d = f7;
        if (f7 != 0.0f) {
            if (this.f8932f == null) {
                this.f8932f = new Path();
            }
            if (this.f8934y == null) {
                this.f8934y = new RectF();
            }
            if (this.f8933x == null) {
                d dVar = new d(this, 0);
                this.f8933x = dVar;
                setOutlineProvider(dVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f8930d) / 2.0f;
            this.f8934y.set(0.0f, 0.0f, width, height);
            this.f8932f.reset();
            this.f8932f.addRoundRect(this.f8934y, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }
}
