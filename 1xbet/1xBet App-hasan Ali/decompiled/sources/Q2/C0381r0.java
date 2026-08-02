package Q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Q2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381r0 extends D5 implements InterfaceC0383s0 {
    public C0381r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 0);
    }

    @Override // Q2.InterfaceC0383s0
    public final Bundle b() {
        Parcel Y4 = Y(N(), 5);
        Bundle bundle = (Bundle) F5.a(Y4, Bundle.CREATOR);
        Y4.recycle();
        return bundle;
    }

    @Override // Q2.InterfaceC0383s0
    public final c1 c() {
        Parcel Y4 = Y(N(), 4);
        c1 c1Var = (c1) F5.a(Y4, c1.CREATOR);
        Y4.recycle();
        return c1Var;
    }

    @Override // Q2.InterfaceC0383s0
    public final String e() {
        Parcel Y4 = Y(N(), 2);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // Q2.InterfaceC0383s0
    public final String f() {
        Parcel Y4 = Y(N(), 1);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // Q2.InterfaceC0383s0
    public final String g() {
        Parcel Y4 = Y(N(), 6);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // Q2.InterfaceC0383s0
    public final List h() {
        Parcel Y4 = Y(N(), 3);
        ArrayList createTypedArrayList = Y4.createTypedArrayList(c1.CREATOR);
        Y4.recycle();
        return createTypedArrayList;
    }
}
