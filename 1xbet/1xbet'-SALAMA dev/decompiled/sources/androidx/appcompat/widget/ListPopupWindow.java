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
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements p086m.B {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Method f8380Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final Method f8381R;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8382A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8383B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8384C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f8385D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Y.b f8386E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f8387F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public AdapterView.OnItemClickListener f8388G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC0643t0 f8389H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final E2.k f8390I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0645u0 f8391J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RunnableC0643t0 f8392K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Handler f8393L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f8394M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Rect f8395N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f8396O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final PopupWindow f8397P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f8399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0628l0 f8400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8403f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8404x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8405y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
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

    public C0628l0 a(Context context, boolean z4) {
        return new C0628l0(context, z4);
    }

    @Override // p086m.B
    public final boolean b() {
        return this.f8397P.isShowing();
    }

    public final int c() {
        return this.f8403f;
    }

    @Override // p086m.B
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

    @Override // p086m.B
    public final C0628l0 h() {
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
        C0628l0 c0628l0 = this.f8400c;
        if (c0628l0 != null) {
            c0628l0.setAdapter(this.f8399b);
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

    @Override // p086m.B
    public final void show() {
        int i7;
        int iMakeMeasureSpec;
        int paddingBottom;
        C0628l0 c0628l0;
        C0628l0 c0628l1 = this.f8400c;
        PopupWindow popupWindow = this.f8397P;
        Context context = this.f8398a;
        if (c0628l1 == null) {
            C0628l0 c0628l0A = a(context, !this.f8396O);
            this.f8400c = c0628l0A;
            c0628l0A.setAdapter(this.f8399b);
            this.f8400c.setOnItemClickListener(this.f8388G);
            this.f8400c.setFocusable(true);
            this.f8400c.setFocusableInTouchMode(true);
            this.f8400c.setOnItemSelectedListener(new C0638q0(this, 0));
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
        int iA = AbstractC0639r0.a(popupWindow, this.f8387F, this.f8404x, popupWindow.getInputMethodMode() == 2);
        int i9 = this.f8401d;
        if (i9 == -1) {
            paddingBottom = iA + i7;
        } else {
            int i10 = this.f8402e;
            if (i10 != -2) {
                iMakeMeasureSpec = i10 != -1 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f8400c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f8400c.getPaddingBottom() + this.f8400c.getPaddingTop() + i7 : 0);
        }
        boolean z4 = this.f8397P.getInputMethodMode() == 2;
        V.k.d(popupWindow, this.f8405y);
        if (popupWindow.isShowing()) {
            View view = this.f8387F;
            WeakHashMap weakHashMap = P.U.f5037a;
            if (view.isAttachedToWindow()) {
                int width = this.f8402e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f8387F.getWidth();
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
                popupWindow.update(this.f8387F, this.f8403f, this.f8404x, width < 0 ? -1 : width, i9 < 0 ? -1 : i9);
                return;
            }
            return;
        }
        int width2 = this.f8402e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f8387F.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = paddingBottom;
        }
        popupWindow.setWidth(width2);
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
            AbstractC0641s0.b(popupWindow, true);
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
            AbstractC0641s0.a(popupWindow, this.f8395N);
        }
        popupWindow.showAsDropDown(this.f8387F, this.f8403f, this.f8404x, this.f8384C);
        this.f8400c.setSelection(-1);
        if ((!this.f8396O || this.f8400c.isInTouchMode()) && (c0628l0 = this.f8400c) != null) {
            c0628l0.setListSelectionHidden(true);
            c0628l0.requestLayout();
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
        this.f8389H = new RunnableC0643t0(this, 1);
        this.f8390I = new E2.k(this, 1);
        this.f8391J = new C0645u0(this);
        this.f8392K = new RunnableC0643t0(this, 0);
        this.f8394M = new Rect();
        this.f8398a = context;
        this.f8393L = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p051h.a.f13343p, i7, 0);
        this.f8403f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8404x = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8406z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i7, 0);
        appCompatPopupWindow.a(context, attributeSet, i7);
        this.f8397P = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
