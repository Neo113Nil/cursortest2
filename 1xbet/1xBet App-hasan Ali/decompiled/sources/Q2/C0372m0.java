package Q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;

/* renamed from: Q2.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372m0 extends D5 implements InterfaceC0374n0 {
    public C0372m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 0);
    }

    @Override // Q2.InterfaceC0374n0
    public final void X2(b1 b1Var) {
        Parcel N5 = N();
        F5.c(N5, b1Var);
        d1(N5, 1);
    }

    @Override // Q2.InterfaceC0374n0
    public final boolean c() {
        Parcel Y4 = Y(N(), 2);
        ClassLoader classLoader = F5.f8654a;
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }
}
