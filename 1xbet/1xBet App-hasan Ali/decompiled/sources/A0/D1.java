package A0;

import android.view.View;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;
import java.util.ArrayList;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class D1 implements InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u4.c f170k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0059t0 f171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P.F0 f172m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f173n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f174o;

    public D1(u4.c cVar, C0059t0 c0059t0, P.F0 f02, kotlin.jvm.internal.w wVar, View view) {
        this.f170k = cVar;
        this.f171l = c0059t0;
        this.f172m = f02;
        this.f173n = wVar;
        this.f174o = view;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        switch (z1.f601a[enumC0486o.ordinal()]) {
            case 1:
                AbstractC2282w.p(this.f170k, null, new C1(this.f173n, this.f172m, interfaceC0491u, this, this.f174o, null), 1);
                return;
            case 2:
                C0059t0 c0059t0 = this.f171l;
                if (c0059t0 != null) {
                    P.W w5 = (P.W) c0059t0.f579m;
                    synchronized (w5.f4412l) {
                        try {
                            if (!w5.e()) {
                                ArrayList arrayList = (ArrayList) w5.f4413m;
                                w5.f4413m = (ArrayList) w5.f4414n;
                                w5.f4414n = arrayList;
                                w5.f4411k = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((a4.c) arrayList.get(i)).resumeWith(W3.o.f6046a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f172m.K();
                return;
            case 3:
                this.f172m.C();
                return;
            case 4:
                this.f172m.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new D2.e();
        }
    }
}
