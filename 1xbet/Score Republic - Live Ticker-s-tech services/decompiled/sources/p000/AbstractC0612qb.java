package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: qb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0612qb extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public final float f6446j;

    /* JADX INFO: renamed from: k */
    public final float f6447k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f6448l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f6449m;

    public AbstractC0612qb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6449m = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, lz0.f4932a, 0, 0);
        try {
            this.f6446j = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            this.f6447k = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.f6448l = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m4046d(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: e */
    public static int m4047e(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: f */
    public static void m4048f(View view, int i, int i2, int i3, int i4) {
        m80.m3345l("\tleft, right", i, i3);
        m80.m3345l("\ttop, bottom", i2, i4);
        view.layout(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public final int m4049a(int i) {
        if (getMaxHeightPct() <= 0.0f) {
            m80.m3343j("Height: restrict by spec");
            return View.MeasureSpec.getSize(i);
        }
        m80.m3343j("Height: restrict by pct");
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4.0f) * 4;
    }

    /* JADX INFO: renamed from: b */
    public final int m4050b(int i) {
        if (getMaxWidthPct() <= 0.0f) {
            m80.m3343j("Width: restrict by spec");
            return View.MeasureSpec.getSize(i);
        }
        m80.m3343j("Width: restrict by pct");
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4.0f) * 4;
    }

    /* JADX INFO: renamed from: c */
    public final View m4051c(int i) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        C0270h1.m2191g(j11.m2773h("No such child: ", i));
        return null;
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f6448l;
    }

    public float getMaxHeightPct() {
        return this.f6447k;
    }

    public float getMaxWidthPct() {
        return this.f6446j;
    }

    public List<View> getVisibleChildren() {
        return this.f6449m;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        m80.m3345l("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        super.measureChildWithMargins(view, i, i2, i3, i4);
        m80.m3345l("\tactual  (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m80.m3343j("============ BEGIN LAYOUT ============");
        m80.m3343j("onLayout: l: " + i + ", t: " + i2 + ", r: " + i3 + ", b: " + i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m80.m3343j("============ BEGIN MEASURE ============");
        m80.m3345l("Display", getDisplayMetrics().widthPixels, getDisplayMetrics().heightPixels);
        ArrayList arrayList = this.f6449m;
        arrayList.clear();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            } else {
                m80.m3344k("Skipping GONE child", i3);
            }
        }
    }
}
