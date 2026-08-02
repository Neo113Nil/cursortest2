package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0938c extends Binder implements InterfaceC0937b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12324b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f12325a;

    public BinderC0938c(ResultReceiver resultReceiver) {
        this.f12325a = resultReceiver;
        attachInterface(this, InterfaceC0937b.f12323p);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        String str = InterfaceC0937b.f12323p;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i8);
        }
        r0(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // d.InterfaceC0937b
    public final void r0(int i7, Bundle bundle) {
        ResultReceiver resultReceiver = this.f12325a;
        resultReceiver.getClass();
        resultReceiver.a(i7, bundle);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
