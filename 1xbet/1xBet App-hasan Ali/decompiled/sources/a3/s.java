package a3;

import Q2.C0375o;
import android.os.Binder;
import com.google.android.gms.internal.ads.A4;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C1035gm;
import com.google.android.gms.internal.ads.C1348nm;
import com.google.android.gms.internal.ads.C1428pc;
import com.google.android.gms.internal.ads.C1797xm;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Hw;
import com.google.android.gms.internal.ads.InterfaceC1897zw;
import com.google.android.gms.internal.ads.Qw;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final Qw f6616a;

    /* renamed from: b, reason: collision with root package name */
    public final C0375o f6617b;

    public s(Qw qw, C0375o c0375o) {
        this.f6616a = qw;
        this.f6617b = c0375o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        E3.a d5;
        C1428pc c1428pc = (C1428pc) obj;
        C0375o c0375o = this.f6617b;
        String str = c1428pc.f14998n;
        T2.L l5 = P2.o.f4767B.f4771c;
        if (T2.L.d(str)) {
            d5 = AbstractC1400ot.Z(new C1797xm(1));
        } else {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.b7)).booleanValue()) {
                d5 = ((C0606Hd) c0375o.f5044n).d(new A4(6, c0375o, c1428pc));
            } else {
                d5 = ((C1348nm) c0375o.f5045o).d(c1428pc);
            }
        }
        return AbstractC1400ot.j0(AbstractC1400ot.X((Hw) AbstractC1400ot.l0(Hw.r(d5), ((Integer) Q2.r.f5053d.f5056c.a(F7.m5)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) c0375o.f5042l), Throwable.class, new C1035gm(c0375o, c1428pc, Binder.getCallingUid(), 1), (C0606Hd) c0375o.f5043m), new C0461e(2, c1428pc), this.f6616a);
    }
}
