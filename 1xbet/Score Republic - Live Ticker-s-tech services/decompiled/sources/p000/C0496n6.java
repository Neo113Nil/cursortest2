package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0496n6 extends C0312i6 {

    /* JADX INFO: renamed from: q */
    public final C0459m6 f5302q;

    /* JADX INFO: renamed from: r */
    public Drawable f5303r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f5304s;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f5305t;

    /* JADX INFO: renamed from: u */
    public boolean f5306u;

    /* JADX INFO: renamed from: v */
    public boolean f5307v;

    public C0496n6(C0459m6 c0459m6) {
        super(0, c0459m6);
        this.f5304s = null;
        this.f5305t = null;
        this.f5306u = false;
        this.f5307v = false;
        this.f5302q = c0459m6;
    }

    /* JADX INFO: renamed from: E */
    public final void m3485E() {
        Drawable drawable = this.f5303r;
        if (drawable != null) {
            if (this.f5306u || this.f5307v) {
                Drawable drawableMutate = drawable.mutate();
                this.f5303r = drawableMutate;
                if (this.f5306u) {
                    drawableMutate.setTintList(this.f5304s);
                }
                if (this.f5307v) {
                    this.f5303r.setTintMode(this.f5305t);
                }
                if (this.f5303r.isStateful()) {
                    this.f5303r.setState(this.f5302q.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3486F(Canvas canvas) {
        if (this.f5303r != null) {
            C0459m6 c0459m6 = this.f5302q;
            int max = c0459m6.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5303r.getIntrinsicWidth();
                int intrinsicHeight = this.f5303r.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5303r.setBounds(-i, -i2, i, i2);
                float width = ((c0459m6.getWidth() - c0459m6.getPaddingLeft()) - c0459m6.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c0459m6.getPaddingLeft(), c0459m6.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5303r.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // p000.C0312i6
    /* JADX INFO: renamed from: o */
    public final void mo2544o(AttributeSet attributeSet, int i) {
        super.mo2544o(attributeSet, R.attr.seekBarStyle);
        C0459m6 c0459m6 = this.f5302q;
        Context context = c0459m6.getContext();
        int[] iArr = mz0.f5193g;
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        Context context2 = c0459m6.getContext();
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(c0459m6, context2, iArr, attributeSet, typedArray2, R.attr.seekBarStyle, 0);
        Drawable drawableM3736f = oq0VarM3731n.m3736f(0);
        if (drawableM3736f != null) {
            c0459m6.setThumb(drawableM3736f);
        }
        Drawable drawableM3735e = oq0VarM3731n.m3735e(1);
        Drawable drawable = this.f5303r;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f5303r = drawableM3735e;
        if (drawableM3735e != null) {
            drawableM3735e.setCallback(c0459m6);
            drawableM3735e.setLayoutDirection(c0459m6.getLayoutDirection());
            if (drawableM3735e.isStateful()) {
                drawableM3735e.setState(c0459m6.getDrawableState());
            }
            m3485E();
        }
        c0459m6.invalidate();
        if (typedArray.hasValue(3)) {
            this.f5305t = AbstractC0890xu.m5689b(typedArray.getInt(3, -1), this.f5305t);
            this.f5307v = true;
        }
        if (typedArray.hasValue(2)) {
            this.f5304s = oq0VarM3731n.m3734d(2);
            this.f5306u = true;
        }
        oq0VarM3731n.m3742o();
        m3485E();
    }
}
