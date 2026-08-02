package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class A0 extends ListPopupWindow implements InterfaceC0668v0 {

    /* renamed from: T, reason: collision with root package name */
    public static final Method f8176T;

    /* renamed from: S, reason: collision with root package name */
    public C1719l1 f8177S;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8176T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final C0649l0 a(Context context, boolean z4) {
        C0676z0 c0676z0 = new C0676z0(context, z4);
        c0676z0.setHoverListener(this);
        return c0676z0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0668v0
    public final void d(m.k kVar, m.m mVar) {
        C1719l1 c1719l1 = this.f8177S;
        if (c1719l1 != null) {
            c1719l1.d(kVar, mVar);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0668v0
    public final void o(m.k kVar, m.m mVar) {
        C1719l1 c1719l1 = this.f8177S;
        if (c1719l1 != null) {
            c1719l1.o(kVar, mVar);
        }
    }
}
