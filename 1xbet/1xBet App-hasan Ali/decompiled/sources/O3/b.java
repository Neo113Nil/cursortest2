package O3;

import A0.C0058t;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.internal.ads.C0788b6;

/* loaded from: classes.dex */
public final class b extends L2.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f4050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0058t f4051d;

    public b(C0058t c0058t, Activity activity) {
        this.f4050c = activity;
        this.f4051d = c0058t;
    }

    @Override // J2.u
    public final void b(J2.m mVar) {
        Log.e("AquaAdFlowCoordinator", "AppOpen fail: " + ((String) mVar.f2696c));
        this.f4051d.invoke();
    }

    @Override // J2.u
    public final void d(Object obj) {
        C0788b6 c0788b6 = (C0788b6) obj;
        kotlin.jvm.internal.l.f("openScreenAd", c0788b6);
        C0058t c0058t = this.f4051d;
        Activity activity = this.f4050c;
        c0788b6.f12764b.f13098k = new c(c0058t, activity);
        c0788b6.b(activity);
    }
}
