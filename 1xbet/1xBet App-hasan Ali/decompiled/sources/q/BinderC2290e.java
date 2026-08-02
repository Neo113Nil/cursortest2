package q;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0496a;
import n2.RunnableC2186b;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2290e extends Binder implements InterfaceC0496a {

    /* renamed from: k, reason: collision with root package name */
    public final Handler f18849k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2286a f18850l;

    public BinderC2290e(AbstractC2286a abstractC2286a) {
        this.f18850l = abstractC2286a;
        attachInterface(this, InterfaceC0496a.f7130b);
        this.f18849k = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        String str = InterfaceC0496a.f7130b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f18849k;
        AbstractC2286a abstractC2286a = this.f18850l;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new i2.g(this, readInt, bundle, 3));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2288c(this, readString, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new D3.h(24, this, bundle3));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2288c(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) N4.b.e(parcel, Uri.CREATOR);
                boolean z3 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2289d(this, readInt2, uri, z3, bundle5));
                    return true;
                }
                return true;
            case 7:
                Bundle b3 = abstractC2286a == null ? null : abstractC2286a.b(parcel.readString(), (Bundle) N4.b.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (b3 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                b3.writeToParcel(parcel2, 1);
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2186b(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2287b(this, bundle7, 1));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2287b(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2287b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) N4.b.e(parcel, Bundle.CREATOR);
                if (abstractC2286a != null) {
                    handler.post(new RunnableC2287b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i5);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
