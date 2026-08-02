package Q2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;

/* loaded from: classes.dex */
public final class P extends D5 implements Q {
    public P(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 0);
    }

    @Override // Q2.Q
    public final void T1(String str, String str2) {
        Parcel N5 = N();
        N5.writeString(str);
        N5.writeString(str2);
        d1(N5, 1);
    }
}
