package F2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import com.google.android.gms.internal.ads.zzboo;

/* renamed from: F2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0230g0 extends zzaxo implements InterfaceC0232h0 {
    public static InterfaceC0232h0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof InterfaceC0232h0 ? (InterfaceC0232h0) queryLocalInterface : new C0228f0(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzey liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaxp.zze(parcel2, liteSdkVersion);
        } else {
            if (i7 != 2) {
                return false;
            }
            zzboo adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaxp.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
