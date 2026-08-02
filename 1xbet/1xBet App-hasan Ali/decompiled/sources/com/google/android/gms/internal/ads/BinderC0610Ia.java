package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.Ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0610Ia extends E5 implements InterfaceC0624Ka {
    public BinderC0610Ia() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC0624Ka u3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof InterfaceC0624Ka ? (InterfaceC0624Ka) queryLocalInterface : new C0617Ja(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final InterfaceC1427pb C(String str) {
        return new BinderC1606tb((RtbAdapter) Class.forName(str, false, AbstractC1561sb.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final InterfaceC0638Ma E(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC0610Ia.class.getClassLoader());
                if (W2.e.class.isAssignableFrom(cls)) {
                    return new BinderC0729Za((W2.e) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (W2.a.class.isAssignableFrom(cls)) {
                    return new BinderC0729Za((W2.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                U2.j.i("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                U2.j.j("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            U2.j.d("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new BinderC0729Za(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new BinderC0729Za(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final boolean H(String str) {
        try {
            return W2.a.class.isAssignableFrom(Class.forName(str, false, BinderC0610Ia.class.getClassLoader()));
        } catch (Throwable unused) {
            U2.j.i("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0624Ka
    public final boolean W(String str) {
        try {
            return X2.a.class.isAssignableFrom(Class.forName(str, false, BinderC0610Ia.class.getClassLoader()));
        } catch (Throwable unused) {
            U2.j.i("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            F5.b(parcel);
            InterfaceC0638Ma E5 = E(readString);
            parcel2.writeNoException();
            F5.e(parcel2, E5);
            return true;
        }
        if (i == 2) {
            String readString2 = parcel.readString();
            F5.b(parcel);
            boolean W4 = W(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(W4 ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String readString3 = parcel.readString();
            F5.b(parcel);
            InterfaceC1427pb C5 = C(readString3);
            parcel2.writeNoException();
            F5.e(parcel2, C5);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String readString4 = parcel.readString();
        F5.b(parcel);
        boolean H5 = H(readString4);
        parcel2.writeNoException();
        parcel2.writeInt(H5 ? 1 : 0);
        return true;
    }
}
