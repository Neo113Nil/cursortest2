package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends ListPopupWindow implements InterfaceC0647v0 {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Method f8176T;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C1010l1 f8177S;

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
    public final C0628l0 a(Context context, boolean z4) {
        C0655z0 c0655z0 = new C0655z0(context, z4);
        c0655z0.setHoverListener(this);
        return c0655z0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0647v0
    public final void d(p086m.k kVar, p086m.m mVar) {
        C1010l1 c1010l1 = this.f8177S;
        if (c1010l1 != null) {
            c1010l1.d(kVar, mVar);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0647v0
    public final void o(p086m.k kVar, p086m.m mVar) {
        C1010l1 c1010l1 = this.f8177S;
        if (c1010l1 != null) {
            c1010l1.o(kVar, mVar);
        }
    }
}
