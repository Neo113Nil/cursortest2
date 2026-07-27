package com.startapp.sdk.ads.list3d;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.t6;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f3010a;

    public c(List3DView list3DView) {
        this.f3010a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        List3DView list3DView = this.f3010a;
        if (list3DView.f2995l == null) {
            return;
        }
        boolean z3 = false;
        View childAt = list3DView.getChildAt(0);
        if (childAt != null) {
            List3DView list3DView2 = this.f3010a;
            list3DView2.getClass();
            int a3 = List3DView.a(childAt);
            List3DView list3DView3 = this.f3010a;
            list3DView2.f2989e = a3 - list3DView3.f2990g;
            t6 t6Var = list3DView3.f2995l;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j3 = t6Var.f4363e;
            if (j3 != 0) {
                int i3 = (int) (currentAnimationTimeMillis - j3);
                if (i3 > 50) {
                    i3 = 50;
                }
                rg rgVar = (rg) t6Var;
                float f3 = rgVar.f4360b;
                float f4 = rgVar.f4359a;
                float f5 = rgVar.f4361c;
                if (f4 <= f5) {
                    f5 = rgVar.f4362d;
                    if (f4 >= f5) {
                        f = 0.0f;
                        float f6 = (f * rgVar.f4303g) + f3;
                        rgVar.f4359a = ((i3 * f6) / 1000.0f) + f4;
                        rgVar.f4360b = f6 * rgVar.f;
                    }
                }
                f = f5 - f4;
                float f62 = (f * rgVar.f4303g) + f3;
                rgVar.f4359a = ((i3 * f62) / 1000.0f) + f4;
                rgVar.f4360b = f62 * rgVar.f;
            }
            t6Var.f4363e = currentAnimationTimeMillis;
            List3DView list3DView4 = this.f3010a;
            list3DView4.b(((int) list3DView4.f2995l.f4359a) - list3DView4.f2989e);
        }
        t6 t6Var2 = this.f3010a.f2995l;
        boolean z4 = Math.abs(t6Var2.f4360b) < 0.5f;
        float f7 = t6Var2.f4359a;
        if (f7 - 0.4f < t6Var2.f4361c && f7 + 0.4f > t6Var2.f4362d) {
            z3 = true;
        }
        if (z4 && z3) {
            return;
        }
        this.f3010a.postDelayed(this, 16L);
    }
}
