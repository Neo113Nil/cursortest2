package Q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class L extends D5 {
    public L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 0);
    }

    public final IBinder t1(BinderC2361b binderC2361b, a1 a1Var, String str, InterfaceC0624Ka interfaceC0624Ka, int i) {
        Parcel N5 = N();
        F5.e(N5, binderC2361b);
        F5.c(N5, a1Var);
        N5.writeString(str);
        F5.e(N5, interfaceC0624Ka);
        N5.writeInt(244410000);
        N5.writeInt(i);
        Parcel Y4 = Y(N5, 2);
        IBinder readStrongBinder = Y4.readStrongBinder();
        Y4.recycle();
        return readStrongBinder;
    }
}
