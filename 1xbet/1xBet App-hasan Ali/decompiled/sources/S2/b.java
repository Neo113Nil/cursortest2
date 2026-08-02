package S2;

import Q2.InterfaceC0347a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractBinderC0625Kb;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Vi;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class b extends AbstractBinderC0625Kb {

    /* renamed from: l, reason: collision with root package name */
    public final AdOverlayInfoParcel f5284l;

    /* renamed from: m, reason: collision with root package name */
    public final Activity f5285m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5286n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5287o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5288p = false;

    public b(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f5284l = adOverlayInfoParcel;
        this.f5285m = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void J() {
        m mVar = this.f5284l.f7448m;
        if (mVar != null) {
            mVar.h1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void Y0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f5286n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void l() {
        if (this.f5285m.isFinishing()) {
            u3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void n() {
        m mVar = this.f5284l.f7448m;
        if (mVar != null) {
            mVar.t1();
        }
        if (this.f5285m.isFinishing()) {
            u3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final boolean n2() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void t() {
        if (this.f5286n) {
            this.f5285m.finish();
            return;
        }
        this.f5286n = true;
        m mVar = this.f5284l.f7448m;
        if (mVar != null) {
            mVar.Z2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void u() {
        if (this.f5285m.isFinishing()) {
            u3();
        }
    }

    public final synchronized void u3() {
        try {
            if (this.f5287o) {
                return;
            }
            m mVar = this.f5284l.f7448m;
            if (mVar != null) {
                mVar.d1(4);
            }
            this.f5287o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void v() {
        this.f5288p = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void z0(Bundle bundle) {
        m mVar;
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.x8)).booleanValue();
        Activity activity = this.f5285m;
        if (booleanValue && !this.f5288p) {
            activity.requestWindowFeature(1);
        }
        boolean z3 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z3 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f5284l;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z3) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            InterfaceC0347a interfaceC0347a = adOverlayInfoParcel.f7447l;
            if (interfaceC0347a != null) {
                interfaceC0347a.z();
            }
            Vi vi = adOverlayInfoParcel.f7442E;
            if (vi != null) {
                vi.E();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (mVar = adOverlayInfoParcel.f7448m) != null) {
                mVar.N2();
            }
        }
        Q1.j jVar = P2.o.f4767B.f4769a;
        e eVar = adOverlayInfoParcel.f7446k;
        if (Q1.j.i(this.f5285m, eVar, adOverlayInfoParcel.f7454s, eVar.f5321s, null, "")) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void m2(InterfaceC2360a interfaceC2360a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void I2(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0632Lb
    public final void Z1(int i, int i5, Intent intent) {
    }
}
