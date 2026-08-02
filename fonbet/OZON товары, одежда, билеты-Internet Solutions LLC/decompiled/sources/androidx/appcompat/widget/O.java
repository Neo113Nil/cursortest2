package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public final class O extends M implements N {

    /* renamed from: C, reason: collision with root package name */
    private static Method f37699C;

    /* renamed from: B, reason: collision with root package name */
    private N f37700B;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z11) {
            popupWindow.setTouchModal(z11);
        }
    }

    public static class c extends I {

        /* renamed from: m, reason: collision with root package name */
        final int f37701m;

        /* renamed from: n, reason: collision with root package name */
        final int f37702n;

        /* renamed from: o, reason: collision with root package name */
        private O f37703o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.appcompat.view.menu.i f37704p;

        public c(Context context, boolean z11) {
            super(context, z11);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f37701m = 21;
                this.f37702n = 22;
            } else {
                this.f37701m = 22;
                this.f37702n = 21;
            }
        }

        public final void d(O o11) {
            this.f37703o = o11;
        }

        @Override // androidx.appcompat.widget.I, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i11;
            int pointToPosition;
            int i12;
            if (this.f37703o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i11 = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i12 = pointToPosition - i11) < 0 || i12 >= fVar.getCount()) ? null : fVar.getItem(i12);
                androidx.appcompat.view.menu.i iVar = this.f37704p;
                if (iVar != item) {
                    androidx.appcompat.view.menu.g c11 = fVar.c();
                    if (iVar != null) {
                        this.f37703o.m(c11, iVar);
                    }
                    this.f37704p = item;
                    if (item != null) {
                        this.f37703o.i(c11, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i11 == this.f37701m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.g().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i11 != this.f37702n) {
                return super.onKeyDown(i11, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).c().e(false);
            return true;
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f37699C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final void G() {
        a.a(this.f37693y, null);
    }

    public final void H() {
        a.b(this.f37693y, null);
    }

    public final void I(N n11) {
        this.f37700B = n11;
    }

    public final void J() {
        int i11 = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.f37693y;
        if (i11 > 28) {
            b.a(popupWindow, false);
            return;
        }
        Method method = f37699C;
        if (method != null) {
            try {
                method.invoke(popupWindow, Boolean.FALSE);
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.N
    public final void i(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
        N n11 = this.f37700B;
        if (n11 != null) {
            n11.i(gVar, iVar);
        }
    }

    @Override // androidx.appcompat.widget.N
    public final void m(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
        N n11 = this.f37700B;
        if (n11 != null) {
            n11.m(gVar, iVar);
        }
    }

    @Override // androidx.appcompat.widget.M
    @NonNull
    final I p(Context context, boolean z11) {
        c cVar = new c(context, z11);
        cVar.d(this);
        return cVar;
    }
}
