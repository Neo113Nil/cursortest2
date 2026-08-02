package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C0800ba;
import com.google.android.gms.internal.ads.C0835c9;
import com.google.android.gms.internal.ads.C0880d9;
import com.google.android.gms.internal.ads.E5;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.InterfaceC0746a9;
import com.google.android.gms.internal.ads.InterfaceC0924e9;
import com.google.android.gms.internal.ads.V8;
import com.google.android.gms.internal.ads.W8;
import com.google.android.gms.internal.ads.X8;
import com.google.android.gms.internal.ads.X9;
import com.google.android.gms.internal.ads.Y8;
import com.google.android.gms.internal.ads.Z8;

/* loaded from: classes.dex */
public abstract class F extends E5 implements G {
    public F() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0746a9 z8;
        InterfaceC0392x interfaceC0392x = null;
        C0800ba c0800ba = null;
        InterfaceC0924e9 interfaceC0924e9 = null;
        C0835c9 c0835c9 = null;
        U u5 = null;
        Y8 y8 = null;
        W8 w8 = null;
        V8 v8 = null;
        switch (i) {
            case 1:
                D b3 = b();
                parcel2.writeNoException();
                F5.e(parcel2, b3);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC0392x = queryLocalInterface instanceof InterfaceC0392x ? (InterfaceC0392x) queryLocalInterface : new C0388v(readStrongBinder);
                }
                F5.b(parcel);
                j2(interfaceC0392x);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    v8 = queryLocalInterface2 instanceof V8 ? (V8) queryLocalInterface2 : new V8(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 0);
                }
                F5.b(parcel);
                q2(v8);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    w8 = queryLocalInterface3 instanceof W8 ? (W8) queryLocalInterface3 : new W8(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 0);
                }
                F5.b(parcel);
                G2(w8);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    z8 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    z8 = queryLocalInterface4 instanceof InterfaceC0746a9 ? (InterfaceC0746a9) queryLocalInterface4 : new Z8(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 0);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    y8 = queryLocalInterface5 instanceof Y8 ? (Y8) queryLocalInterface5 : new X8(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 0);
                }
                F5.b(parcel);
                i3(readString, z8, y8);
                parcel2.writeNoException();
                return true;
            case 6:
                B8 b8 = (B8) F5.a(parcel, B8.CREATOR);
                F5.b(parcel);
                L1(b8);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    u5 = queryLocalInterface6 instanceof U ? (U) queryLocalInterface6 : new U(readStrongBinder6);
                }
                F5.b(parcel);
                T0(u5);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c0835c9 = queryLocalInterface7 instanceof C0835c9 ? (C0835c9) queryLocalInterface7 : new C0835c9(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 0);
                }
                a1 a1Var = (a1) F5.a(parcel, a1.CREATOR);
                F5.b(parcel);
                D0(c0835c9, a1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                M2.d dVar = (M2.d) F5.a(parcel, M2.d.CREATOR);
                F5.b(parcel);
                h2(dVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    interfaceC0924e9 = queryLocalInterface8 instanceof InterfaceC0924e9 ? (InterfaceC0924e9) queryLocalInterface8 : new C0880d9(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 0);
                }
                F5.b(parcel);
                Y2(interfaceC0924e9);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                X9 x9 = (X9) F5.a(parcel, X9.CREATOR);
                F5.b(parcel);
                s2(x9);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c0800ba = queryLocalInterface9 instanceof C0800ba ? (C0800ba) queryLocalInterface9 : new C0800ba(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 0);
                }
                F5.b(parcel);
                T2(c0800ba);
                parcel2.writeNoException();
                return true;
            case 15:
                M2.a aVar = (M2.a) F5.a(parcel, M2.a.CREATOR);
                F5.b(parcel);
                l3(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
