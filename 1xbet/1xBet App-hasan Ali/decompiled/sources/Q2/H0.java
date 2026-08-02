package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.E5;

/* loaded from: classes.dex */
public final class H0 extends E5 implements InterfaceC0362h0 {

    /* renamed from: k, reason: collision with root package name */
    public final String f4923k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4924l;

    public H0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f4923k = str;
        this.f4924l = str2;
    }

    public static InterfaceC0362h0 u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC0362h0 ? (InterfaceC0362h0) queryLocalInterface : new C0360g0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 0);
    }

    @Override // Q2.InterfaceC0362h0
    public final String b() {
        return this.f4923k;
    }

    @Override // Q2.InterfaceC0362h0
    public final String c() {
        return this.f4924l;
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f4923k);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f4924l);
        return true;
    }
}
