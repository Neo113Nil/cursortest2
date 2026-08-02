package androidx.constraintlayout.widget;

import B.c;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9017a;

    public Guideline(Context context) {
        super(context);
        this.f9017a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.f9017a = z4;
    }

    public void setGuidelineBegin(int i7) {
        c cVar = (c) getLayoutParams();
        if (this.f9017a && cVar.f727a == i7) {
            return;
        }
        cVar.f727a = i7;
        setLayoutParams(cVar);
    }

    public void setGuidelineEnd(int i7) {
        c cVar = (c) getLayoutParams();
        if (this.f9017a && cVar.f729b == i7) {
            return;
        }
        cVar.f729b = i7;
        setLayoutParams(cVar);
    }

    public void setGuidelinePercent(float f7) {
        c cVar = (c) getLayoutParams();
        if (this.f9017a && cVar.f731c == f7) {
            return;
        }
        cVar.f731c = f7;
        setLayoutParams(cVar);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }

    public Guideline(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9017a = true;
        super.setVisibility(8);
    }
}
