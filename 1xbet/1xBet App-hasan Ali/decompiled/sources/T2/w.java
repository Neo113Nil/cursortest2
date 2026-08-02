package T2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import com.google.android.gms.internal.ads.F5;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class w extends D5 implements x {
    @Override // T2.x
    public final void zze(InterfaceC2360a interfaceC2360a) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        d1(N5, 2);
    }

    @Override // T2.x
    public final boolean zzf(InterfaceC2360a interfaceC2360a, String str, String str2) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        N5.writeString(str);
        N5.writeString(str2);
        Parcel Y4 = Y(N5, 1);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }

    @Override // T2.x
    public final boolean zzg(InterfaceC2360a interfaceC2360a, R2.a aVar) {
        Parcel N5 = N();
        F5.e(N5, interfaceC2360a);
        F5.c(N5, aVar);
        Parcel Y4 = Y(N5, 3);
        boolean z3 = Y4.readInt() != 0;
        Y4.recycle();
        return z3;
    }
}
