package a1;

import Q0.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i1.C0335e;
import i1.C0341k;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0335e f1790a;

    public f(C0335e c0335e) {
        this.f1790a = c0335e;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i4)) {
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i5 = AbstractC0089a.f1783a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        M0.b createFromParcel2 = parcel.readInt() == 0 ? null : M0.b.CREATOR.createFromParcel(parcel);
        M0.a aVar = createFromParcel2 != null ? new M0.a(createFromParcel2.f965a, createFromParcel2.f966b) : null;
        int i6 = createFromParcel.f2567a;
        C0341k c0341k = this.f1790a.f5011a;
        if (i6 <= 0) {
            c0341k.e(aVar);
            return true;
        }
        c0341k.d(createFromParcel.f2569c != null ? new j(createFromParcel) : new Q0.d(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
