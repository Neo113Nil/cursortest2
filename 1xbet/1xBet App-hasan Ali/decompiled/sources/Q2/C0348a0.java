package Q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import com.google.android.gms.internal.ads.Q9;
import com.google.android.gms.internal.ads.U9;
import java.util.ArrayList;
import java.util.List;
import s3.InterfaceC2360a;

/* renamed from: Q2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348a0 extends D5 implements InterfaceC0352c0 {
    public C0348a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 0);
    }

    @Override // Q2.InterfaceC0352c0
    public final void C0(S0 s02) {
        Parcel N5 = N();
        F5.c(N5, s02);
        d1(N5, 14);
    }

    @Override // Q2.InterfaceC0352c0
    public final void E1(String str, InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        N5.writeString(null);
        F5.e(N5, interfaceC2360a);
        d1(N5, 6);
    }

    @Override // Q2.InterfaceC0352c0
    public final List f() {
        Parcel Y4 = Y(N(), 13);
        ArrayList createTypedArrayList = Y4.createTypedArrayList(Q9.CREATOR);
        Y4.recycle();
        return createTypedArrayList;
    }

    @Override // Q2.InterfaceC0352c0
    public final void k() {
        d1(N(), 1);
    }

    @Override // Q2.InterfaceC0352c0
    public final void p0(String str) {
        Parcel N5 = N();
        N5.writeString(str);
        d1(N5, 18);
    }

    @Override // Q2.InterfaceC0352c0
    public final void r2(U9 u9) {
        Parcel N5 = N();
        F5.e(N5, u9);
        d1(N5, 12);
    }

    @Override // Q2.InterfaceC0352c0
    public final void s0(InterfaceC0624Ka interfaceC0624Ka) {
        Parcel N5 = N();
        F5.e(N5, interfaceC0624Ka);
        d1(N5, 11);
    }
}
