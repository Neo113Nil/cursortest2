package sg.bigo.ads.D0;

import android.app.KeyguardManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f12253a = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(View view) {
        KeyguardManager keyguardManager;
        boolean isKeyguardLocked;
        WindowManager.LayoutParams layoutParams;
        int i;
        if (this.f12253a == 4) {
            return 4;
        }
        boolean z = false;
        if (view != null) {
            try {
                keyguardManager = (KeyguardManager) view.getContext().getSystemService("keyguard");
            } catch (Exception unused) {
            }
            if (keyguardManager != null) {
                isKeyguardLocked = keyguardManager.isKeyguardLocked();
                if (!isKeyguardLocked) {
                    return 5;
                }
                if (view != null) {
                    while (true) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
                            Object parent = view.getParent();
                            if (!(parent instanceof View)) {
                                layoutParams = null;
                                break;
                            }
                            view = (View) parent;
                        } else {
                            layoutParams = (WindowManager.LayoutParams) layoutParams2;
                            break;
                        }
                    }
                    if (layoutParams != null && ((i = layoutParams.type) == 2002 || i == 2003 || i == 2006 || i == 2007 || i == 2010 || i == 2038)) {
                        z = true;
                    }
                }
                return z ? 3 : 1;
            }
        }
        isKeyguardLocked = false;
        if (!isKeyguardLocked) {
        }
    }
}
