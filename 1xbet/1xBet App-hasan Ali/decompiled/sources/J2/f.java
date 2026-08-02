package J2;

import Q2.A0;
import Q2.D;
import Q2.Z0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC0968f8;
import com.google.android.gms.internal.ads.F7;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2709a;

    /* renamed from: b, reason: collision with root package name */
    public final D f2710b;

    public f(Context context, D d5) {
        this.f2709a = context;
        this.f2710b = d5;
    }

    public final void a(h hVar) {
        A0 a02 = hVar.f2711a;
        Context context = this.f2709a;
        F7.a(context);
        if (((Boolean) AbstractC0968f8.f13456c.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                U2.c.f5860b.execute(new D3.h(6, this, a02, false));
                return;
            }
        }
        try {
            this.f2710b.Z0(Z0.a(context, a02));
        } catch (RemoteException e3) {
            U2.j.g("Failed to load ad.", e3);
        }
    }
}
