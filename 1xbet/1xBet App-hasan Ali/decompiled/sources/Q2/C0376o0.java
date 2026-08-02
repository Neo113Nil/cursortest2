package Q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import s3.InterfaceC2360a;

/* renamed from: Q2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376o0 extends D5 implements InterfaceC0378p0 {
    public C0376o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 0);
    }

    @Override // Q2.InterfaceC0378p0
    public final void a2(String str, InterfaceC2360a interfaceC2360a, InterfaceC2360a interfaceC2360a2) {
        Parcel N5 = N();
        N5.writeString(str);
        F5.e(N5, interfaceC2360a);
        F5.e(N5, interfaceC2360a2);
        d1(N5, 1);
    }
}
