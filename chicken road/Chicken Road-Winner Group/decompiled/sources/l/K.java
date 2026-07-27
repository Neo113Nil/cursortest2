package l;

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
import g.AbstractC0301a;
import h.AbstractC0323a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.AbstractC1071l;
import k.InterfaceC1077r;

/* loaded from: classes.dex */
public abstract class K implements InterfaceC1077r {

    /* renamed from: w, reason: collision with root package name */
    public static final Method f9710w;

    /* renamed from: x, reason: collision with root package name */
    public static final Method f9711x;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9712a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f9713b;

    /* renamed from: c, reason: collision with root package name */
    public M f9714c;

    /* renamed from: e, reason: collision with root package name */
    public int f9716e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9717g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9718h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9719i;

    /* renamed from: k, reason: collision with root package name */
    public I.b f9721k;

    /* renamed from: l, reason: collision with root package name */
    public View f9722l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1071l f9723m;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f9728r;

    /* renamed from: t, reason: collision with root package name */
    public Rect f9730t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9731u;

    /* renamed from: v, reason: collision with root package name */
    public final r f9732v;

    /* renamed from: d, reason: collision with root package name */
    public int f9715d = -2;

    /* renamed from: j, reason: collision with root package name */
    public int f9720j = 0;

    /* renamed from: n, reason: collision with root package name */
    public final H f9724n = new H(this, 1);

    /* renamed from: o, reason: collision with root package name */
    public final J f9725o = new J(this);

    /* renamed from: p, reason: collision with root package name */
    public final I f9726p = new I(this);

    /* renamed from: q, reason: collision with root package name */
    public final H f9727q = new H(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final Rect f9729s = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f9710w = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f9711x = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public K(Context context, int i3) {
        int resourceId;
        this.f9712a = context;
        this.f9728r = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0301a.f4935k, i3, 0);
        this.f9716e = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9717g = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, null, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0301a.f4939o, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            H.l.c(rVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0323a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f9732v = rVar;
        rVar.setInputMethodMode(1);
    }

    public final void b(ListAdapter listAdapter) {
        I.b bVar = this.f9721k;
        if (bVar == null) {
            this.f9721k = new I.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f9713b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f9713b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9721k);
        }
        M m3 = this.f9714c;
        if (m3 != null) {
            m3.setAdapter(this.f9713b);
        }
    }

    @Override // k.InterfaceC1077r
    public final void d() {
        int i3;
        M m3;
        M m4 = this.f9714c;
        r rVar = this.f9732v;
        Context context = this.f9712a;
        if (m4 == null) {
            M m5 = new M(context, !this.f9731u);
            m5.setHoverListener((N) this);
            this.f9714c = m5;
            m5.setAdapter(this.f9713b);
            this.f9714c.setOnItemClickListener(this.f9723m);
            this.f9714c.setFocusable(true);
            this.f9714c.setFocusableInTouchMode(true);
            this.f9714c.setOnItemSelectedListener(new G(r0, this));
            this.f9714c.setOnScrollListener(this.f9726p);
            rVar.setContentView(this.f9714c);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f9729s;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i3 = rect.bottom + i4;
            if (!this.f9717g) {
                this.f = -i4;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f9722l, this.f, rVar.getInputMethodMode() == 2);
        int i5 = this.f9715d;
        int a3 = this.f9714c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
        int paddingBottom = a3 + (a3 > 0 ? this.f9714c.getPaddingBottom() + this.f9714c.getPaddingTop() + i3 : 0);
        this.f9732v.getInputMethodMode();
        H.l.d(rVar, 1002);
        if (rVar.isShowing()) {
            View view = this.f9722l;
            Field field = D.z.f259a;
            if (view.isAttachedToWindow()) {
                int i6 = this.f9715d;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f9722l.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f9722l, this.f9716e, this.f, i6 < 0 ? -1 : i6, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i7 = this.f9715d;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = this.f9722l.getWidth();
        }
        rVar.setWidth(i7);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f9710w;
            if (method != null) {
                try {
                    method.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f9725o);
        if (this.f9719i) {
            H.l.c(rVar, this.f9718h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f9711x;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f9730t);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f9730t);
        }
        rVar.showAsDropDown(this.f9722l, this.f9716e, this.f, this.f9720j);
        this.f9714c.setSelection(-1);
        if ((!this.f9731u || this.f9714c.isInTouchMode()) && (m3 = this.f9714c) != null) {
            m3.setListSelectionHidden(true);
            m3.requestLayout();
        }
        if (this.f9731u) {
            return;
        }
        this.f9728r.post(this.f9727q);
    }

    @Override // k.InterfaceC1077r
    public final void dismiss() {
        r rVar = this.f9732v;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f9714c = null;
        this.f9728r.removeCallbacks(this.f9724n);
    }

    @Override // k.InterfaceC1077r
    public final ListView g() {
        return this.f9714c;
    }

    @Override // k.InterfaceC1077r
    public final boolean k() {
        return this.f9732v.isShowing();
    }
}
