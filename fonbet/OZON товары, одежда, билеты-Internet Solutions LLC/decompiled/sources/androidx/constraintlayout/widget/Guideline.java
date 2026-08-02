package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    private boolean f41672a;

    public Guideline(Context context) {
        super(context);
        this.f41672a = true;
        super.setVisibility(8);
    }

    public final void a(int i11) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f41672a && bVar.f41620a == i11) {
            return;
        }
        bVar.f41620a = i11;
        setLayoutParams(bVar);
    }

    public final void b(int i11) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f41672a && bVar.f41622b == i11) {
            return;
        }
        bVar.f41622b = i11;
        setLayoutParams(bVar);
    }

    public final void c(float f7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f41672a && bVar.f41624c == f7) {
            return;
        }
        bVar.f41624c = f7;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i11) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41672a = true;
        super.setVisibility(8);
    }
}
