package O3;

import A0.C0058t;
import J2.u;
import android.app.Activity;
import android.util.Log;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class c extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4052c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f4053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f4054e;

    public c(C0058t c0058t, Activity activity) {
        this.f4054e = c0058t;
        this.f4053d = activity;
    }

    @Override // J2.u
    public final void a() {
        switch (this.f4052c) {
            case 0:
                ((C0058t) this.f4054e).invoke();
                break;
            default:
                Activity activity = this.f4053d;
                e.f4056a = null;
                e.d(activity);
                this.f4054e.invoke();
                break;
        }
    }

    @Override // J2.u
    public final void c(J2.b bVar) {
        switch (this.f4052c) {
            case 0:
                Log.e("AquaAdFlowCoordinator", "AppOpen show fail: " + ((String) bVar.f2696c));
                e.a(this.f4053d);
                ((C0058t) this.f4054e).invoke();
                break;
            default:
                Log.e("AquaAdFlowCoordinator", "Inter show fail: " + ((String) bVar.f2696c));
                Activity activity = this.f4053d;
                e.f4056a = null;
                e.d(activity);
                this.f4054e.invoke();
                break;
        }
    }

    public c(Activity activity, InterfaceC2015a interfaceC2015a) {
        this.f4053d = activity;
        this.f4054e = interfaceC2015a;
    }
}
