package O3;

import J2.u;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.internal.ads.C0844ca;

/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f4055c;

    public d(Activity activity) {
        this.f4055c = activity;
    }

    @Override // J2.u
    public final void b(J2.m mVar) {
        e.f4056a = null;
        e.f4057b = false;
        Log.e("AquaAdFlowCoordinator", "Inter load fail: " + ((String) mVar.f2696c));
        e.a(this.f4055c);
    }

    @Override // J2.u
    public final void d(Object obj) {
        C0844ca c0844ca = (C0844ca) obj;
        kotlin.jvm.internal.l.f("freshInterstitial", c0844ca);
        e.f4056a = c0844ca;
        e.f4057b = false;
        Log.d("AquaAdFlowCoordinator", "Inter loaded");
    }
}
