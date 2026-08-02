package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.BinderC0610Ia;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0624Ka;

/* loaded from: classes.dex */
public final class X extends D5 implements Z {
    @Override // Q2.Z
    public final InterfaceC0624Ka getAdapterCreator() {
        Parcel Y4 = Y(N(), 2);
        InterfaceC0624Ka u32 = BinderC0610Ia.u3(Y4.readStrongBinder());
        Y4.recycle();
        return u32;
    }

    @Override // Q2.Z
    public final I0 getLiteSdkVersion() {
        Parcel Y4 = Y(N(), 1);
        I0 i02 = (I0) F5.a(Y4, I0.CREATOR);
        Y4.recycle();
        return i02;
    }
}
