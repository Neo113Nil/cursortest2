package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class da0 extends View {

    /* JADX INFO: renamed from: j */
    public boolean f1596j;

    public da0(Context context) {
        super(context);
        this.f1596j = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f1596j = z;
    }

    public void setGuidelineBegin(int i) {
        C0733tl c0733tl = (C0733tl) getLayoutParams();
        if (this.f1596j && c0733tl.f7487a == i) {
            return;
        }
        c0733tl.f7487a = i;
        setLayoutParams(c0733tl);
    }

    public void setGuidelineEnd(int i) {
        C0733tl c0733tl = (C0733tl) getLayoutParams();
        if (this.f1596j && c0733tl.f7489b == i) {
            return;
        }
        c0733tl.f7489b = i;
        setLayoutParams(c0733tl);
    }

    public void setGuidelinePercent(float f) {
        C0733tl c0733tl = (C0733tl) getLayoutParams();
        if (this.f1596j && c0733tl.f7491c == f) {
            return;
        }
        c0733tl.f7491c = f;
        setLayoutParams(c0733tl);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
