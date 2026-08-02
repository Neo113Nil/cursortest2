package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0864x4 {

    /* JADX INFO: renamed from: a */
    public final View f8785a;

    /* JADX INFO: renamed from: d */
    public C0290hl f8788d;

    /* JADX INFO: renamed from: e */
    public C0290hl f8789e;

    /* JADX INFO: renamed from: f */
    public C0290hl f8790f;

    /* JADX INFO: renamed from: c */
    public int f8787c = -1;

    /* JADX INFO: renamed from: b */
    public final C0939z5 f8786b = C0939z5.m5859a();

    public C0864x4(View view) {
        this.f8785a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m5515a() {
        View view = this.f8785a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f8788d != null) {
                if (this.f8790f == null) {
                    this.f8790f = new C0290hl();
                }
                C0290hl c0290hl = this.f8790f;
                c0290hl.f3255c = null;
                c0290hl.f3254b = false;
                c0290hl.f3256d = null;
                c0290hl.f3253a = false;
                WeakHashMap weakHashMap = ai1.f194a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c0290hl.f3254b = true;
                    c0290hl.f3255c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c0290hl.f3253a = true;
                    c0290hl.f3256d = backgroundTintMode;
                }
                if (c0290hl.f3254b || c0290hl.f3253a) {
                    C0939z5.m5861d(background, c0290hl, view.getDrawableState());
                    return;
                }
            }
            C0290hl c0290hl2 = this.f8789e;
            if (c0290hl2 != null) {
                C0939z5.m5861d(background, c0290hl2, view.getDrawableState());
                return;
            }
            C0290hl c0290hl3 = this.f8788d;
            if (c0290hl3 != null) {
                C0939z5.m5861d(background, c0290hl3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m5516b() {
        C0290hl c0290hl = this.f8789e;
        if (c0290hl != null) {
            return (ColorStateList) c0290hl.f3255c;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m5517c() {
        C0290hl c0290hl = this.f8789e;
        if (c0290hl != null) {
            return (PorterDuff.Mode) c0290hl.f3256d;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m5518d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM1581f;
        View view = this.f8785a;
        Context context = view.getContext();
        int[] iArr = mz0.f5211y;
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        View view2 = this.f8785a;
        Context context2 = view2.getContext();
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(view2, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f8787c = typedArray.getResourceId(0, -1);
                C0939z5 c0939z5 = this.f8786b;
                Context context3 = view.getContext();
                int i2 = this.f8787c;
                synchronized (c0939z5) {
                    colorStateListM1581f = c0939z5.f9607a.m1581f(context3, i2);
                }
                if (colorStateListM1581f != null) {
                    m5521g(colorStateListM1581f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(oq0VarM3731n.m3734d(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC0890xu.m5689b(typedArray.getInt(2, -1), null));
            }
            oq0VarM3731n.m3742o();
        } catch (Throwable th) {
            oq0VarM3731n.m3742o();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5519e() {
        this.f8787c = -1;
        m5521g(null);
        m5515a();
    }

    /* JADX INFO: renamed from: f */
    public final void m5520f(int i) {
        ColorStateList colorStateListM1581f;
        this.f8787c = i;
        C0939z5 c0939z5 = this.f8786b;
        if (c0939z5 != null) {
            Context context = this.f8785a.getContext();
            synchronized (c0939z5) {
                colorStateListM1581f = c0939z5.f9607a.m1581f(context, i);
            }
        } else {
            colorStateListM1581f = null;
        }
        m5521g(colorStateListM1581f);
        m5515a();
    }

    /* JADX INFO: renamed from: g */
    public final void m5521g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8788d == null) {
                this.f8788d = new C0290hl();
            }
            C0290hl c0290hl = this.f8788d;
            c0290hl.f3255c = colorStateList;
            c0290hl.f3254b = true;
        } else {
            this.f8788d = null;
        }
        m5515a();
    }

    /* JADX INFO: renamed from: h */
    public final void m5522h(ColorStateList colorStateList) {
        if (this.f8789e == null) {
            this.f8789e = new C0290hl();
        }
        C0290hl c0290hl = this.f8789e;
        c0290hl.f3255c = colorStateList;
        c0290hl.f3254b = true;
        m5515a();
    }

    /* JADX INFO: renamed from: i */
    public final void m5523i(PorterDuff.Mode mode) {
        if (this.f8789e == null) {
            this.f8789e = new C0290hl();
        }
        C0290hl c0290hl = this.f8789e;
        c0290hl.f3256d = mode;
        c0290hl.f3253a = true;
        m5515a();
    }
}
