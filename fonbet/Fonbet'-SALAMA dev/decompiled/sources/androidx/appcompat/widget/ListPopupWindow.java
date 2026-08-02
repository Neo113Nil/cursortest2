package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import h.AbstractC1174a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.InterfaceC1414B;

/* loaded from: classes.dex */
public class ListPopupWindow implements InterfaceC1414B {

    /* renamed from: Q, reason: collision with root package name */
    public static final Method f8380Q;

    /* renamed from: R, reason: collision with root package name */
    public static final Method f8381R;

    /* renamed from: A, reason: collision with root package name */
    public boolean f8382A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f8383B;

    /* renamed from: C, reason: collision with root package name */
    public int f8384C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8385D;

    /* renamed from: E, reason: collision with root package name */
    public Y.b f8386E;

    /* renamed from: F, reason: collision with root package name */
    public View f8387F;

    /* renamed from: G, reason: collision with root package name */
    public AdapterView.OnItemClickListener f8388G;

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC0664t0 f8389H;

    /* renamed from: I, reason: collision with root package name */
    public final E2.k f8390I;

    /* renamed from: J, reason: collision with root package name */
    public final C0666u0 f8391J;

    /* renamed from: K, reason: collision with root package name */
    public final RunnableC0664t0 f8392K;

    /* renamed from: L, reason: collision with root package name */
    public final Handler f8393L;

    /* renamed from: M, reason: collision with root package name */
    public final Rect f8394M;

    /* renamed from: N, reason: collision with root package name */
    public Rect f8395N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f8396O;

    /* renamed from: P, reason: collision with root package name */
    public final PopupWindow f8397P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8398a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f8399b;

    /* renamed from: c, reason: collision with root package name */
    public C0649l0 f8400c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8401d;

    /* renamed from: e, reason: collision with root package name */
    public int f8402e;

    /* renamed from: f, reason: collision with root package name */
    public int f8403f;

    /* renamed from: x, reason: collision with root package name */
    public int f8404x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8405y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8406z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8380Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f8381R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public C0649l0 a(Context context, boolean z4) {
        return new C0649l0(context, z4);
    }

    @Override // m.InterfaceC1414B
    public final boolean b() {
        return this.f8397P.isShowing();
    }

    public final int c() {
        return this.f8403f;
    }

    @Override // m.InterfaceC1414B
    public final void dismiss() {
        PopupWindow popupWindow = this.f8397P;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f8400c = null;
        this.f8393L.removeCallbacks(this.f8389H);
    }

    public final void e(int i7) {
        this.f8403f = i7;
    }

    public final Drawable g() {
        return this.f8397P.getBackground();
    }

    @Override // m.InterfaceC1414B
    public final C0649l0 h() {
        return this.f8400c;
    }

    public final void j(Drawable drawable) {
        this.f8397P.setBackgroundDrawable(drawable);
    }

    public final void k(int i7) {
        this.f8404x = i7;
        this.f8406z = true;
    }

    public final int n() {
        if (this.f8406z) {
            return this.f8404x;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        Y.b bVar = this.f8386E;
        if (bVar == null) {
            this.f8386E = new Y.b(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f8399b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f8399b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8386E);
        }
        C0649l0 c0649l0 = this.f8400c;
        if (c0649l0 != null) {
            c0649l0.setAdapter(this.f8399b);
        }
    }

    public final void q(int i7) {
        Drawable background = this.f8397P.getBackground();
        if (background == null) {
            this.f8402e = i7;
            return;
        }
        Rect rect = this.f8394M;
        background.getPadding(rect);
        this.f8402e = rect.left + rect.right + i7;
    }

    @Override // m.InterfaceC1414B
    public final void show() {
        int i7;
        int paddingBottom;
        C0649l0 c0649l0;
        C0649l0 c0649l02 = this.f8400c;
        PopupWindow popupWindow = this.f8397P;
        Context context = this.f8398a;
        if (c0649l02 == null) {
            C0649l0 a2 = a(context, !this.f8396O);
            this.f8400c = a2;
            a2.setAdapter(this.f8399b);
            this.f8400c.setOnItemClickListener(this.f8388G);
            this.f8400c.setFocusable(true);
            this.f8400c.setFocusableInTouchMode(true);
            this.f8400c.setOnItemSelectedListener(new C0659q0(this, 0));
            this.f8400c.setOnScrollListener(this.f8391J);
            popupWindow.setContentView(this.f8400c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f8394M;
        if (background != null) {
            background.getPadding(rect);
            int i8 = rect.top;
            i7 = rect.bottom + i8;
            if (!this.f8406z) {
                this.f8404x = -i8;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        int a4 = AbstractC0660r0.a(popupWindow, this.f8387F, this.f8404x, popupWindow.getInputMethodMode() == 2);
        int i9 = this.f8401d;
        if (i9 == -1) {
            paddingBottom = a4 + i7;
        } else {
            int i10 = this.f8402e;
            int a7 = this.f8400c.a(i10 != -2 ? i10 != -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), a4);
            paddingBottom = a7 + (a7 > 0 ? this.f8400c.getPaddingBottom() + this.f8400c.getPaddingTop() + i7 : 0);
        }
        boolean z4 = this.f8397P.getInputMethodMode() == 2;
        V.k.d(popupWindow, this.f8405y);
        if (popupWindow.isShowing()) {
            View view = this.f8387F;
            WeakHashMap weakHashMap = P.U.f5037a;
            if (view.isAttachedToWindow()) {
                int i11 = this.f8402e;
                if (i11 == -1) {
                    i11 = -1;
                } else if (i11 == -2) {
                    i11 = this.f8387F.getWidth();
                }
                if (i9 == -1) {
                    i9 = z4 ? paddingBottom : -1;
                    if (z4) {
                        popupWindow.setWidth(this.f8402e == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f8402e == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i9 == -2) {
                    i9 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                popupWindow.update(this.f8387F, this.f8403f, this.f8404x, i11 < 0 ? -1 : i11, i9 < 0 ? -1 : i9);
                return;
            }
            return;
        }
        int i12 = this.f8402e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.f8387F.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = paddingBottom;
        }
        popupWindow.setWidth(i12);
        popupWindow.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8380Q;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0662s0.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f8390I);
        if (this.f8383B) {
            V.k.c(popupWindow, this.f8382A);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f8381R;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.f8395N);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            AbstractC0662s0.a(popupWindow, this.f8395N);
        }
        popupWindow.showAsDropDown(this.f8387F, this.f8403f, this.f8404x, this.f8384C);
        this.f8400c.setSelection(-1);
        if ((!this.f8396O || this.f8400c.isInTouchMode()) && (c0649l0 = this.f8400c) != null) {
            c0649l0.setListSelectionHidden(true);
            c0649l0.requestLayout();
        }
        if (this.f8396O) {
            return;
        }
        this.f8393L.post(this.f8392K);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f8401d = -2;
        this.f8402e = -2;
        this.f8405y = 1002;
        this.f8384C = 0;
        this.f8385D = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f8389H = new RunnableC0664t0(this, 1);
        this.f8390I = new E2.k(this, 1);
        this.f8391J = new C0666u0(this);
        this.f8392K = new RunnableC0664t0(this, 0);
        this.f8394M = new Rect();
        this.f8398a = context;
        this.f8393L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13337p, i7, 0);
        this.f8403f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8404x = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8406z = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i7, 0);
        appCompatPopupWindow.a(context, attributeSet, i7);
        this.f8397P = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
