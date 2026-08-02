package Q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;

/* renamed from: Q2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360g0 extends D5 implements InterfaceC0362h0 {
    @Override // Q2.InterfaceC0362h0
    public final String b() {
        Parcel Y4 = Y(N(), 1);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }

    @Override // Q2.InterfaceC0362h0
    public final String c() {
        Parcel Y4 = Y(N(), 2);
        String readString = Y4.readString();
        Y4.recycle();
        return readString;
    }
}
