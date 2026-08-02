package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import s3.BinderC2361b;

/* renamed from: Q2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380q0 extends D5 {
    public final InterfaceC0378p0 t1(BinderC2361b binderC2361b, BinderC0610Ia binderC0610Ia) {
        InterfaceC0378p0 c0376o0;
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        F5.e(N5, binderC0610Ia);
        N5.writeInt(244410000);
        Parcel Y4 = Y(N5, 1);
        IBinder readStrongBinder = Y4.readStrongBinder();
        if (readStrongBinder == null) {
            c0376o0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0376o0 = queryLocalInterface instanceof InterfaceC0378p0 ? (InterfaceC0378p0) queryLocalInterface : new C0376o0(readStrongBinder);
        }
        Y4.recycle();
        return c0376o0;
    }
}
