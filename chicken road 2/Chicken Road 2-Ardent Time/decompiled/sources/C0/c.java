package C0;

/* loaded from: classes.dex */
public abstract class c extends android.os.Binder implements android.os.IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105a = 0;

    public /* synthetic */ c() {
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        int i2 = this.f105a;
        return this;
    }

    public boolean d(int i2, android.os.Parcel parcel, android.os.Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, android.os.Parcel parcel, android.os.Parcel parcel2, int i3) {
        switch (this.f105a) {
            case 0:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                switch (i2) {
                    case 3:
                        y0.b.b(parcel);
                        break;
                    case 4:
                        y0.b.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        y0.b.b(parcel);
                        break;
                    case 7:
                        y0.b.b(parcel);
                        break;
                    case 8:
                        C0.f fVar = (C0.f) y0.b.a(parcel, C0.f.CREATOR);
                        y0.b.b(parcel);
                        o0.v vVar = (o0.v) this;
                        vVar.f8191c.post(new D0.f(7, vVar, fVar));
                        break;
                    case 9:
                        y0.b.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i3)) {
                    return true;
                }
                return d(i2, parcel, parcel2);
        }
    }

    public c(java.lang.String str) {
        attachInterface(this, str);
    }
}
