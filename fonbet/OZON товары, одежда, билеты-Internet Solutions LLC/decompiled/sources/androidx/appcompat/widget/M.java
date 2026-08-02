package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;
import java.lang.reflect.Method;
import m.InterfaceC7975b;

/* loaded from: classes8.dex */
public class M implements InterfaceC7975b {

    /* renamed from: A, reason: collision with root package name */
    private static Method f37667A;

    /* renamed from: z, reason: collision with root package name */
    private static Method f37668z;

    /* renamed from: a, reason: collision with root package name */
    private Context f37669a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f37670b;

    /* renamed from: c, reason: collision with root package name */
    I f37671c;

    /* renamed from: f, reason: collision with root package name */
    private int f37674f;

    /* renamed from: g, reason: collision with root package name */
    private int f37675g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37677i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37678j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f37679k;

    /* renamed from: n, reason: collision with root package name */
    private DataSetObserver f37682n;

    /* renamed from: o, reason: collision with root package name */
    private View f37683o;

    /* renamed from: p, reason: collision with root package name */
    private AdapterView.OnItemClickListener f37684p;

    /* renamed from: u, reason: collision with root package name */
    final Handler f37689u;

    /* renamed from: w, reason: collision with root package name */
    private Rect f37691w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f37692x;

    /* renamed from: y, reason: collision with root package name */
    PopupWindow f37693y;

    /* renamed from: d, reason: collision with root package name */
    private int f37672d = -2;

    /* renamed from: e, reason: collision with root package name */
    private int f37673e = -2;

    /* renamed from: h, reason: collision with root package name */
    private int f37676h = 1002;

    /* renamed from: l, reason: collision with root package name */
    private int f37680l = 0;

    /* renamed from: m, reason: collision with root package name */
    int f37681m = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    final g f37685q = new g();

    /* renamed from: r, reason: collision with root package name */
    private final f f37686r = new f();

    /* renamed from: s, reason: collision with root package name */
    private final e f37687s = new e();

    /* renamed from: t, reason: collision with root package name */
    private final c f37688t = new c();

    /* renamed from: v, reason: collision with root package name */
    private final Rect f37690v = new Rect();

    static class a {
        static int a(PopupWindow popupWindow, View view, int i11, boolean z11) {
            return popupWindow.getMaxAvailableHeight(view, i11, z11);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z11) {
            popupWindow.setIsClippedToScreen(z11);
        }
    }

    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            I i11 = M.this.f37671c;
            if (i11 != null) {
                i11.c(true);
                i11.requestLayout();
            }
        }
    }

    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            M m11 = M.this;
            if (m11.f37693y.isShowing()) {
                m11.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            M.this.dismiss();
        }
    }

    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i11, int i12, int i13) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i11) {
            if (i11 == 1) {
                M m11 = M.this;
                if (m11.f37693y.getInputMethodMode() == 2 || m11.f37693y.getContentView() == null) {
                    return;
                }
                Handler handler = m11.f37689u;
                g gVar = m11.f37685q;
                handler.removeCallbacks(gVar);
                gVar.run();
            }
        }
    }

    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            M m11 = M.this;
            if (action == 0 && (popupWindow = m11.f37693y) != null && popupWindow.isShowing() && x11 >= 0 && x11 < m11.f37693y.getWidth() && y11 >= 0 && y11 < m11.f37693y.getHeight()) {
                m11.f37689u.postDelayed(m11.f37685q, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            m11.f37689u.removeCallbacks(m11.f37685q);
            return false;
        }
    }

    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            M m11 = M.this;
            I i11 = m11.f37671c;
            if (i11 == null || !i11.isAttachedToWindow() || m11.f37671c.getCount() <= m11.f37671c.getChildCount() || m11.f37671c.getChildCount() > m11.f37681m) {
                return;
            }
            m11.f37693y.setInputMethodMode(2);
            m11.show();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f37668z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f37667A = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public M(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this.f37669a = context;
        this.f37689u = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6977a.f65661o, i11, 0);
        this.f37674f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f37675g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f37677i = true;
        }
        obtainStyledAttributes.recycle();
        C5070o c5070o = new C5070o(context, attributeSet, i11, 0);
        b0 v11 = b0.v(context, attributeSet, C6977a.f65665s, i11, 0);
        if (v11.s(2)) {
            androidx.core.widget.j.a(c5070o, v11.a(2, false));
        }
        c5070o.setBackgroundDrawable(v11.g(0));
        v11.x();
        this.f37693y = c5070o;
        c5070o.setInputMethodMode(1);
    }

    public final void A(Rect rect) {
        this.f37691w = rect != null ? new Rect(rect) : null;
    }

    public final void B() {
        this.f37693y.setInputMethodMode(2);
    }

    public final void C() {
        this.f37692x = true;
        this.f37693y.setFocusable(true);
    }

    public final void D(PopupWindow.OnDismissListener onDismissListener) {
        this.f37693y.setOnDismissListener(onDismissListener);
    }

    public final void E(AdapterView.OnItemClickListener onItemClickListener) {
        this.f37684p = onItemClickListener;
    }

    public final void F() {
        this.f37679k = true;
        this.f37678j = true;
    }

    @Override // m.InterfaceC7975b
    public final boolean a() {
        return this.f37693y.isShowing();
    }

    public final Drawable b() {
        return this.f37693y.getBackground();
    }

    public final void c(int i11) {
        this.f37675g = i11;
        this.f37677i = true;
    }

    @Override // m.InterfaceC7975b
    public final void dismiss() {
        PopupWindow popupWindow = this.f37693y;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f37671c = null;
        this.f37689u.removeCallbacks(this.f37685q);
    }

    public final int f() {
        if (this.f37677i) {
            return this.f37675g;
        }
        return 0;
    }

    public final int g() {
        return this.f37674f;
    }

    @Override // m.InterfaceC7975b
    public final ListView h() {
        return this.f37671c;
    }

    public final void j(int i11) {
        this.f37674f = i11;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f37682n;
        if (dataSetObserver == null) {
            this.f37682n = new d();
        } else {
            ListAdapter listAdapter2 = this.f37670b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f37670b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f37682n);
        }
        I i11 = this.f37671c;
        if (i11 != null) {
            i11.setAdapter(this.f37670b);
        }
    }

    public final void o(Drawable drawable) {
        this.f37693y.setBackgroundDrawable(drawable);
    }

    @NonNull
    I p(Context context, boolean z11) {
        return new I(context, z11);
    }

    public final Object q() {
        if (this.f37693y.isShowing()) {
            return this.f37671c.getSelectedItem();
        }
        return null;
    }

    public final long r() {
        if (this.f37693y.isShowing()) {
            return this.f37671c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public final int s() {
        if (this.f37693y.isShowing()) {
            return this.f37671c.getSelectedItemPosition();
        }
        return -1;
    }

    @Override // m.InterfaceC7975b
    public final void show() {
        int i11;
        int paddingBottom;
        I i12;
        I i13 = this.f37671c;
        PopupWindow popupWindow = this.f37693y;
        Context context = this.f37669a;
        if (i13 == null) {
            I p11 = p(context, !this.f37692x);
            this.f37671c = p11;
            p11.setAdapter(this.f37670b);
            this.f37671c.setOnItemClickListener(this.f37684p);
            this.f37671c.setFocusable(true);
            this.f37671c.setFocusableInTouchMode(true);
            this.f37671c.setOnItemSelectedListener(new L(this));
            this.f37671c.setOnScrollListener(this.f37687s);
            popupWindow.setContentView(this.f37671c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f37690v;
        if (background != null) {
            background.getPadding(rect);
            int i14 = rect.top;
            i11 = rect.bottom + i14;
            if (!this.f37677i) {
                this.f37675g = -i14;
            }
        } else {
            rect.setEmpty();
            i11 = 0;
        }
        int a11 = a.a(popupWindow, this.f37683o, this.f37675g, popupWindow.getInputMethodMode() == 2);
        int i15 = this.f37672d;
        if (i15 == -1) {
            paddingBottom = a11 + i11;
        } else {
            int i16 = this.f37673e;
            int a12 = this.f37671c.a(i16 != -2 ? i16 != -1 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), LinearLayoutManager.INVALID_OFFSET), a11);
            paddingBottom = a12 + (a12 > 0 ? this.f37671c.getPaddingBottom() + this.f37671c.getPaddingTop() + i11 : 0);
        }
        boolean z11 = this.f37693y.getInputMethodMode() == 2;
        androidx.core.widget.j.b(popupWindow, this.f37676h);
        if (popupWindow.isShowing()) {
            if (this.f37683o.isAttachedToWindow()) {
                int i17 = this.f37673e;
                if (i17 == -1) {
                    i17 = -1;
                } else if (i17 == -2) {
                    i17 = this.f37683o.getWidth();
                }
                if (i15 == -1) {
                    i15 = z11 ? paddingBottom : -1;
                    if (z11) {
                        popupWindow.setWidth(this.f37673e == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f37673e == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i15 == -2) {
                    i15 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view = this.f37683o;
                int i18 = this.f37674f;
                int i19 = this.f37675g;
                if (i17 < 0) {
                    i17 = -1;
                }
                popupWindow.update(view, i18, i19, i17, i15 < 0 ? -1 : i15);
                return;
            }
            return;
        }
        int i21 = this.f37673e;
        if (i21 == -1) {
            i21 = -1;
        } else if (i21 == -2) {
            i21 = this.f37683o.getWidth();
        }
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = paddingBottom;
        }
        popupWindow.setWidth(i21);
        popupWindow.setHeight(i15);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f37668z;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f37686r);
        if (this.f37679k) {
            androidx.core.widget.j.a(popupWindow, this.f37678j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f37667A;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.f37691w);
                } catch (Exception e11) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e11);
                }
            }
        } else {
            b.a(popupWindow, this.f37691w);
        }
        popupWindow.showAsDropDown(this.f37683o, this.f37674f, this.f37675g, this.f37680l);
        this.f37671c.setSelection(-1);
        if ((!this.f37692x || this.f37671c.isInTouchMode()) && (i12 = this.f37671c) != null) {
            i12.c(true);
            i12.requestLayout();
        }
        if (this.f37692x) {
            return;
        }
        this.f37689u.post(this.f37688t);
    }

    public final View t() {
        if (this.f37693y.isShowing()) {
            return this.f37671c.getSelectedView();
        }
        return null;
    }

    public final int u() {
        return this.f37673e;
    }

    public final boolean v() {
        return this.f37692x;
    }

    public final void w(View view) {
        this.f37683o = view;
    }

    public final void x() {
        this.f37693y.setAnimationStyle(0);
    }

    public final void y(int i11) {
        Drawable background = this.f37693y.getBackground();
        if (background == null) {
            this.f37673e = i11;
            return;
        }
        Rect rect = this.f37690v;
        background.getPadding(rect);
        this.f37673e = rect.left + rect.right + i11;
    }

    public final void z(int i11) {
        this.f37680l = i11;
    }
}
