package x0;

/* loaded from: classes.dex */
public final class f extends android.os.Binder implements android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D0.d f8411a;

    public f(D0.d dVar) {
        this.f8411a = dVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, android.os.Parcel parcel, android.os.Parcel parcel2, int i3) {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        if (i2 != 1) {
            return false;
        }
        android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> creator = com.google.android.gms.common.api.Status.CREATOR;
        int i4 = x0.AbstractC1011a.f8403a;
        com.google.android.gms.common.api.Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        j0.b createFromParcel2 = parcel.readInt() == 0 ? null : j0.b.CREATOR.createFromParcel(parcel);
        j0.C0916a c0916a = createFromParcel2 != null ? new j0.C0916a(createFromParcel2.f7939a, createFromParcel2.f7940b) : null;
        int i5 = createFromParcel.f2594a;
        D0.m mVar = this.f8411a.f194a;
        if (i5 <= 0) {
            mVar.f(c0916a);
            return true;
        }
        mVar.e(createFromParcel.f2596c != null ? new n0.j(createFromParcel) : new n0.d(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
