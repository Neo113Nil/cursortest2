package n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import h.AbstractC1986a;
import java.lang.reflect.Method;
import m.AbstractC2072j;
import m.InterfaceC2078p;
import r0.AbstractC2346c;

/* renamed from: n.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2131e0 implements InterfaceC2078p {

    /* renamed from: G, reason: collision with root package name */
    public static final Method f18219G;

    /* renamed from: H, reason: collision with root package name */
    public static final Method f18220H;

    /* renamed from: I, reason: collision with root package name */
    public static final Method f18221I;

    /* renamed from: B, reason: collision with root package name */
    public final Handler f18223B;

    /* renamed from: D, reason: collision with root package name */
    public Rect f18225D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f18226E;

    /* renamed from: F, reason: collision with root package name */
    public final C2149t f18227F;

    /* renamed from: k, reason: collision with root package name */
    public final Context f18228k;

    /* renamed from: l, reason: collision with root package name */
    public ListAdapter f18229l;

    /* renamed from: m, reason: collision with root package name */
    public C2139i0 f18230m;

    /* renamed from: o, reason: collision with root package name */
    public int f18232o;

    /* renamed from: p, reason: collision with root package name */
    public int f18233p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18234q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18235r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18236s;

    /* renamed from: u, reason: collision with root package name */
    public C2127c0 f18238u;

    /* renamed from: v, reason: collision with root package name */
    public View f18239v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC2072j f18240w;

    /* renamed from: n, reason: collision with root package name */
    public int f18231n = -2;

    /* renamed from: t, reason: collision with root package name */
    public int f18237t = 0;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC2125b0 f18241x = new RunnableC2125b0(this, 1);

    /* renamed from: y, reason: collision with root package name */
    public final P2.k f18242y = new P2.k(1, this);

    /* renamed from: z, reason: collision with root package name */
    public final C2129d0 f18243z = new C2129d0(this);

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC2125b0 f18222A = new RunnableC2125b0(this, 0);

    /* renamed from: C, reason: collision with root package name */
    public final Rect f18224C = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f18219G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f18221I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f18220H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC2131e0(Context context, int i) {
        int resourceId;
        this.f18228k = context;
        this.f18223B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1986a.f17177k, i, 0);
        this.f18232o = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f18233p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f18234q = true;
        }
        obtainStyledAttributes.recycle();
        C2149t c2149t = new C2149t(context, null, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC1986a.f17181o, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            c2149t.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        c2149t.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC2346c.p(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f18227F = c2149t;
        c2149t.setInputMethodMode(1);
    }

    @Override // m.InterfaceC2078p
    public final void b() {
        int i;
        int a5;
        C2139i0 c2139i0;
        C2139i0 c2139i02 = this.f18230m;
        C2149t c2149t = this.f18227F;
        Context context = this.f18228k;
        if (c2139i02 == null) {
            C2139i0 c2139i03 = new C2139i0(context, !this.f18226E);
            c2139i03.setHoverListener((j0) this);
            this.f18230m = c2139i03;
            c2139i03.setAdapter(this.f18229l);
            this.f18230m.setOnItemClickListener(this.f18240w);
            this.f18230m.setFocusable(true);
            this.f18230m.setFocusableInTouchMode(true);
            this.f18230m.setOnItemSelectedListener(new Y(this));
            this.f18230m.setOnScrollListener(this.f18243z);
            c2149t.setContentView(this.f18230m);
        }
        Drawable background = c2149t.getBackground();
        Rect rect = this.f18224C;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f18234q) {
                this.f18233p = -i5;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z3 = c2149t.getInputMethodMode() == 2;
        View view = this.f18239v;
        int i6 = this.f18233p;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f18220H;
            if (method != null) {
                try {
                    a5 = ((Integer) method.invoke(c2149t, view, Integer.valueOf(i6), Boolean.valueOf(z3))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a5 = c2149t.getMaxAvailableHeight(view, i6);
        } else {
            a5 = Z.a(c2149t, view, i6, z3);
        }
        int i7 = this.f18231n;
        int a6 = this.f18230m.a(i7 != -2 ? i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a5);
        int paddingBottom = a6 + (a6 > 0 ? this.f18230m.getPaddingBottom() + this.f18230m.getPaddingTop() + i : 0);
        this.f18227F.getInputMethodMode();
        c2149t.setWindowLayoutType(1002);
        if (c2149t.isShowing()) {
            if (this.f18239v.isAttachedToWindow()) {
                int i8 = this.f18231n;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.f18239v.getWidth();
                }
                c2149t.setOutsideTouchable(true);
                c2149t.update(this.f18239v, this.f18232o, this.f18233p, i8 < 0 ? -1 : i8, paddingBottom >= 0 ? paddingBottom : -1);
                return;
            }
            return;
        }
        int i9 = this.f18231n;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = this.f18239v.getWidth();
        }
        c2149t.setWidth(i9);
        c2149t.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f18219G;
            if (method2 != null) {
                try {
                    method2.invoke(c2149t, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2123a0.b(c2149t, true);
        }
        c2149t.setOutsideTouchable(true);
        c2149t.setTouchInterceptor(this.f18242y);
        if (this.f18236s) {
            c2149t.setOverlapAnchor(this.f18235r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f18221I;
            if (method3 != null) {
                try {
                    method3.invoke(c2149t, this.f18225D);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            AbstractC2123a0.a(c2149t, this.f18225D);
        }
        c2149t.showAsDropDown(this.f18239v, this.f18232o, this.f18233p, this.f18237t);
        this.f18230m.setSelection(-1);
        if ((!this.f18226E || this.f18230m.isInTouchMode()) && (c2139i0 = this.f18230m) != null) {
            c2139i0.setListSelectionHidden(true);
            c2139i0.requestLayout();
        }
        if (this.f18226E) {
            return;
        }
        this.f18223B.post(this.f18222A);
    }

    public final void c(ListAdapter listAdapter) {
        C2127c0 c2127c0 = this.f18238u;
        if (c2127c0 == null) {
            this.f18238u = new C2127c0(this);
        } else {
            ListAdapter listAdapter2 = this.f18229l;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2127c0);
            }
        }
        this.f18229l = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f18238u);
        }
        C2139i0 c2139i0 = this.f18230m;
        if (c2139i0 != null) {
            c2139i0.setAdapter(this.f18229l);
        }
    }

    @Override // m.InterfaceC2078p
    public final ListView d() {
        return this.f18230m;
    }

    @Override // m.InterfaceC2078p
    public final void dismiss() {
        C2149t c2149t = this.f18227F;
        c2149t.dismiss();
        c2149t.setContentView(null);
        this.f18230m = null;
        this.f18223B.removeCallbacks(this.f18241x);
    }

    @Override // m.InterfaceC2078p
    public final boolean i() {
        return this.f18227F.isShowing();
    }
}
