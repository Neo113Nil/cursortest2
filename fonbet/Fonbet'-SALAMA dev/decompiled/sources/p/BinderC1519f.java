package p;

import a.AbstractC0603a;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import c.InterfaceC0792a;
import l1.RunnableC1378b;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1519f extends Binder implements InterfaceC0792a {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1514a f15640b;

    public BinderC1519f(AbstractC1514a abstractC1514a) {
        this.f15640b = abstractC1514a;
        attachInterface(this, InterfaceC0792a.f10156l);
        this.f15639a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC0792a.f10156l;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f15639a;
        AbstractC1514a abstractC1514a = this.f15640b;
        switch (i7) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new androidx.activity.g(this, readInt, bundle, 5));
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1516c(this, readString, bundle2, 0));
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1515b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1516c(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) AbstractC0603a.b(parcel, Uri.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1517d(this, readInt2, uri, z4, bundle5));
                }
                return true;
            case 7:
                Bundle extraCallbackWithResult = abstractC1514a == null ? null : abstractC1514a.extraCallbackWithResult(parcel.readString(), (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (extraCallbackWithResult != null) {
                    parcel2.writeInt(1);
                    extraCallbackWithResult.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1378b(this, readInt3, readInt4, bundle6));
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1515b(this, bundle7, 2));
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1518e(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1515b(this, bundle9, 3));
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) AbstractC0603a.b(parcel, Bundle.CREATOR);
                if (abstractC1514a != null) {
                    handler.post(new RunnableC1515b(this, bundle10, 0));
                }
                return true;
            default:
                return super.onTransact(i7, parcel, parcel2, i8);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
