package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b80 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: j */
    public final a80 f756j;

    /* JADX INFO: renamed from: k */
    public boolean f757k;

    /* JADX INFO: renamed from: l */
    public boolean f758l;

    /* JADX INFO: renamed from: m */
    public boolean f759m;

    /* JADX INFO: renamed from: o */
    public int f761o;

    /* JADX INFO: renamed from: q */
    public boolean f763q;

    /* JADX INFO: renamed from: r */
    public Paint f764r;

    /* JADX INFO: renamed from: s */
    public Rect f765s;

    /* JADX INFO: renamed from: n */
    public boolean f760n = true;

    /* JADX INFO: renamed from: p */
    public final int f762p = -1;

    public b80(a80 a80Var) {
        this.f756j = a80Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m601a() {
        o80.m3645f("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f759m);
        h80 h80Var = this.f756j.f61a;
        if (h80Var.f3081a.f9241l.f3465c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f757k) {
            return;
        }
        this.f757k = true;
        ArrayList arrayList = h80Var.f3083c;
        if (h80Var.f3090j) {
            C0270h1.m2191g("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            C0270h1.m2191g("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !h80Var.f3086f) {
            h80Var.f3086f = true;
            h80Var.f3090j = false;
            h80Var.m2226a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f759m) {
            return;
        }
        if (this.f763q) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f765s == null) {
                this.f765s = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f765s);
            this.f763q = false;
        }
        h80 h80Var = this.f756j.f61a;
        f80 f80Var = h80Var.f3089i;
        Bitmap bitmap = f80Var != null ? f80Var.f2349p : h80Var.f3092l;
        if (this.f765s == null) {
            this.f765s = new Rect();
        }
        Rect rect = this.f765s;
        if (this.f764r == null) {
            this.f764r = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f764r);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f756j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f756j.f61a.f3096p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f756j.f61a.f3095o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f757k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f763q = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f764r == null) {
            this.f764r = new Paint(2);
        }
        this.f764r.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f764r == null) {
            this.f764r = new Paint(2);
        }
        this.f764r.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        o80.m3645f("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f759m);
        this.f760n = z;
        if (!z) {
            this.f757k = false;
            h80 h80Var = this.f756j.f61a;
            ArrayList arrayList = h80Var.f3083c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                h80Var.f3086f = false;
            }
        } else if (this.f758l) {
            m601a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f758l = true;
        this.f761o = 0;
        if (this.f760n) {
            m601a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f758l = false;
        this.f757k = false;
        h80 h80Var = this.f756j.f61a;
        ArrayList arrayList = h80Var.f3083c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            h80Var.f3086f = false;
        }
    }
}
