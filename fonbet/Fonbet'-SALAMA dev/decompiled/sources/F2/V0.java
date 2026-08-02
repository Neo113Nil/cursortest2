package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxo;

/* loaded from: classes.dex */
public final class V0 extends zzaxo implements InterfaceC0250q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2642a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2643b;

    public V0(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.f2642a = str;
        this.f2643b = str2;
    }

    public static InterfaceC0250q0 Z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof InterfaceC0250q0 ? (InterfaceC0250q0) queryLocalInterface : new C0248p0(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f2642a);
        } else {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.f2643b);
        }
        return true;
    }

    @Override // F2.InterfaceC0250q0
    public final String zze() {
        return this.f2642a;
    }

    @Override // F2.InterfaceC0250q0
    public final String zzf() {
        return this.f2643b;
    }
}
