package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zi0 implements t71 {

    /* JADX INFO: renamed from: D */
    public final Handler f9775D;

    /* JADX INFO: renamed from: F */
    public Rect f9777F;

    /* JADX INFO: renamed from: G */
    public boolean f9778G;

    /* JADX INFO: renamed from: H */
    public final C0275h6 f9779H;

    /* JADX INFO: renamed from: j */
    public final Context f9780j;

    /* JADX INFO: renamed from: k */
    public ListAdapter f9781k;

    /* JADX INFO: renamed from: l */
    public C0151dv f9782l;

    /* JADX INFO: renamed from: o */
    public int f9785o;

    /* JADX INFO: renamed from: p */
    public int f9786p;

    /* JADX INFO: renamed from: r */
    public boolean f9788r;

    /* JADX INFO: renamed from: s */
    public boolean f9789s;

    /* JADX INFO: renamed from: t */
    public boolean f9790t;

    /* JADX INFO: renamed from: w */
    public xi0 f9793w;

    /* JADX INFO: renamed from: x */
    public View f9794x;

    /* JADX INFO: renamed from: y */
    public AdapterView.OnItemClickListener f9795y;

    /* JADX INFO: renamed from: m */
    public final int f9783m = -2;

    /* JADX INFO: renamed from: n */
    public int f9784n = -2;

    /* JADX INFO: renamed from: q */
    public final int f9787q = 1002;

    /* JADX INFO: renamed from: u */
    public int f9791u = 0;

    /* JADX INFO: renamed from: v */
    public final int f9792v = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: z */
    public final wi0 f9796z = new wi0(this, 1);

    /* JADX INFO: renamed from: A */
    public final a10 f9772A = new a10(1, this);

    /* JADX INFO: renamed from: B */
    public final yi0 f9773B = new yi0(this);

    /* JADX INFO: renamed from: C */
    public final wi0 f9774C = new wi0(this, 0);

    /* JADX INFO: renamed from: E */
    public final Rect f9776E = new Rect();

    public zi0(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.f9780j = context;
        this.f9775D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5201o, i, 0);
        this.f9785o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f9786p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9788r = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0275h6 c0275h6 = new C0275h6(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, mz0.f5205s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0275h6.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0275h6.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : j22.m2807p(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f9779H = c0275h6;
        c0275h6.setInputMethodMode(1);
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: a */
    public final boolean mo3216a() {
        return this.f9779H.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final int m5911b() {
        return this.f9785o;
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: c */
    public final void mo3217c() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        C0151dv c0151dv;
        C0151dv c0151dv2 = this.f9782l;
        Context context = this.f9780j;
        C0275h6 c0275h6 = this.f9779H;
        if (c0151dv2 == null) {
            C0151dv c0151dvMo982q = mo982q(context, !this.f9778G);
            this.f9782l = c0151dvMo982q;
            c0151dvMo982q.setAdapter(this.f9781k);
            this.f9782l.setOnItemClickListener(this.f9795y);
            this.f9782l.setFocusable(true);
            this.f9782l.setFocusableInTouchMode(true);
            this.f9782l.setOnItemSelectedListener(new ti0(this));
            this.f9782l.setOnScrollListener(this.f9773B);
            c0275h6.setContentView(this.f9782l);
        }
        Drawable background = c0275h6.getBackground();
        Rect rect = this.f9776E;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f9788r) {
                this.f9786p = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM4925a = ui0.m4925a(c0275h6, this.f9794x, this.f9786p, c0275h6.getInputMethodMode() == 2);
        int i3 = this.f9783m;
        if (i3 == -1) {
            paddingBottom = iM4925a + i;
        } else {
            int i4 = this.f9784n;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM1306a = this.f9782l.m1306a(iMakeMeasureSpec, iM4925a);
            paddingBottom = iM1306a + (iM1306a > 0 ? this.f9782l.getPaddingBottom() + this.f9782l.getPaddingTop() + i : 0);
        }
        boolean z = c0275h6.getInputMethodMode() == 2;
        c0275h6.setWindowLayoutType(this.f9787q);
        if (c0275h6.isShowing()) {
            if (this.f9794x.isAttachedToWindow()) {
                int width = this.f9784n;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f9794x.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.f9784n;
                    if (z) {
                        c0275h6.setWidth(i5 == -1 ? -1 : 0);
                        c0275h6.setHeight(0);
                    } else {
                        c0275h6.setWidth(i5 == -1 ? -1 : 0);
                        c0275h6.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0275h6.setOutsideTouchable(true);
                int i6 = width;
                View view = this.f9794x;
                int i7 = this.f9785o;
                int i8 = this.f9786p;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0275h6.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.f9784n;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f9794x.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0275h6.setWidth(width2);
        c0275h6.setHeight(i3);
        vi0.m5162b(c0275h6, true);
        c0275h6.setOutsideTouchable(true);
        c0275h6.setTouchInterceptor(this.f9772A);
        if (this.f9790t) {
            c0275h6.setOverlapAnchor(this.f9789s);
        }
        vi0.m5161a(c0275h6, this.f9777F);
        c0275h6.showAsDropDown(this.f9794x, this.f9785o, this.f9786p, this.f9791u);
        this.f9782l.setSelection(-1);
        if ((!this.f9778G || this.f9782l.isInTouchMode()) && (c0151dv = this.f9782l) != null) {
            c0151dv.setListSelectionHidden(true);
            c0151dv.requestLayout();
        }
        if (this.f9778G) {
            return;
        }
        this.f9775D.post(this.f9774C);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m5912d() {
        return this.f9779H.getBackground();
    }

    @Override // p000.t71
    public final void dismiss() {
        C0275h6 c0275h6 = this.f9779H;
        c0275h6.dismiss();
        c0275h6.setContentView(null);
        this.f9782l = null;
        this.f9775D.removeCallbacks(this.f9796z);
    }

    /* JADX INFO: renamed from: f */
    public final void m5913f(Drawable drawable) {
        this.f9779H.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: g */
    public final void m5914g(int i) {
        this.f9786p = i;
        this.f9788r = true;
    }

    @Override // p000.t71
    /* JADX INFO: renamed from: i */
    public final C0151dv mo3218i() {
        return this.f9782l;
    }

    /* JADX INFO: renamed from: l */
    public final void m5915l(int i) {
        this.f9785o = i;
    }

    /* JADX INFO: renamed from: n */
    public final int m5916n() {
        if (this.f9788r) {
            return this.f9786p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void mo4268p(ListAdapter listAdapter) {
        xi0 xi0Var = this.f9793w;
        if (xi0Var == null) {
            this.f9793w = new xi0(this);
        } else {
            ListAdapter listAdapter2 = this.f9781k;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(xi0Var);
            }
        }
        this.f9781k = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9793w);
        }
        C0151dv c0151dv = this.f9782l;
        if (c0151dv != null) {
            c0151dv.setAdapter(this.f9781k);
        }
    }

    /* JADX INFO: renamed from: q */
    public C0151dv mo982q(Context context, boolean z) {
        return new C0151dv(context, z);
    }

    /* JADX INFO: renamed from: r */
    public final void m5917r(int i) {
        Drawable background = this.f9779H.getBackground();
        if (background == null) {
            this.f9784n = i;
            return;
        }
        Rect rect = this.f9776E;
        background.getPadding(rect);
        this.f9784n = rect.left + rect.right + i;
    }
}
