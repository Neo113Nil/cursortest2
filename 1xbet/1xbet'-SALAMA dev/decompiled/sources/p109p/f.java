package p109p;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import androidx.activity.g;
import p017c.a;
import p080l1.b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Binder implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f15645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f15646b;

    public f(a aVar) {
        this.f15646b = aVar;
        attachInterface(this, a.f10156l);
        this.f15645a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = a.f10156l;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f15645a;
        a aVar = this.f15646b;
        switch (i7) {
            case 2:
                int i9 = parcel.readInt();
                Bundle bundle = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new g(this, i9, bundle, 5));
                }
                return true;
            case 3:
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string, bundle2, 0));
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string2 = parcel.readString();
                Bundle bundle4 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, string2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int i10 = parcel.readInt();
                Uri uri = (Uri) p003a.a.b(parcel, Uri.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, i10, uri, z4, bundle5));
                }
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = aVar == null ? null : aVar.extraCallbackWithResult(parcel.readString(), (Bundle) p003a.a.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (bundleExtraCallbackWithResult != null) {
                    parcel2.writeInt(1);
                    bundleExtraCallbackWithResult.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 8:
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                Bundle bundle6 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, i11, i12, bundle6));
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 2));
                }
                return true;
            case 10:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                int i17 = parcel.readInt();
                Bundle bundle8 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, i13, i14, i15, i16, i17, bundle8));
                }
                return true;
            case 11:
                Bundle bundle9 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle9, 3));
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) p003a.a.b(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
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
