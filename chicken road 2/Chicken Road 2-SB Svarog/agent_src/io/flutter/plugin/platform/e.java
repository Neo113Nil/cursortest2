package io.flutter.plugin.platform;

import F.AbstractActivityC0005f;
import F.InterfaceC0008i;
import F.t;
import a.AbstractC0018a;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import m.s;
import m.v;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f668a;

    /* renamed from: b, reason: collision with root package name */
    public final C.a f669b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0008i f670c;

    /* renamed from: d, reason: collision with root package name */
    public O.f f671d;

    /* renamed from: e, reason: collision with root package name */
    public int f672e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f673f = false;

    public e(AbstractActivityC0005f abstractActivityC0005f, C.a aVar, AbstractActivityC0005f abstractActivityC0005f2) {
        t tVar = new t(28, this);
        this.f668a = abstractActivityC0005f;
        this.f669b = aVar;
        aVar.f5d = tVar;
        this.f670c = abstractActivityC0005f2;
        this.f672e = 1280;
    }

    public final void a(O.f fVar) {
        Window window = this.f668a.getWindow();
        window.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        AbstractC0018a vVar = i2 >= 30 ? new v(window) : i2 >= 26 ? new m.t(window) : new s(window);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        int i4 = fVar.f292b;
        if (i4 != 0) {
            int a2 = AbstractC0071c.a(i4);
            if (a2 == 0) {
                vVar.z(false);
            } else if (a2 == 1) {
                vVar.z(true);
            }
        }
        Integer num = fVar.f291a;
        if (num != null && i3 < 35) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = fVar.f293c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            int i5 = fVar.f295e;
            if (i5 != 0) {
                int a3 = AbstractC0071c.a(i5);
                if (a3 == 0) {
                    vVar.y(false);
                } else if (a3 == 1) {
                    vVar.y(true);
                }
            }
            Integer num2 = fVar.f294d;
            if (num2 != null && i3 < 35) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = fVar.f296f;
        if (num3 != null && i3 >= 28 && i3 < 35) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = fVar.f297g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f671d = fVar;
    }

    public final void b() {
        boolean z2 = this.f673f;
        Activity activity = this.f668a;
        if (z2) {
            AbstractC0018a.A(activity.getWindow(), false);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(this.f672e);
        }
        O.f fVar = this.f671d;
        if (fVar != null) {
            a(fVar);
        }
    }
}
