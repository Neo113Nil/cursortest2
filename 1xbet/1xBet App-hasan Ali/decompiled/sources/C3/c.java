package C3;

import D3.h;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import l3.u;
import w3.AbstractC2552a;
import y3.AbstractC2665a;
import y3.BinderC2666b;

/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f842k;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f842k;
        return this;
    }

    public boolean d1(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i5) {
        switch (this.f842k) {
            case 0:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        f fVar = (f) AbstractC2552a.a(parcel, f.CREATOR);
                        u uVar = (u) this;
                        uVar.f17838m.post(new h(20, uVar, fVar));
                        break;
                    case 9:
                        break;
                }
                parcel2.writeNoException();
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i5)) {
                    return true;
                }
                return d1(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                BinderC2666b binderC2666b = (BinderC2666b) this;
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i6 = AbstractC2665a.f21220a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int dataAvail = parcel.dataAvail();
                if (dataAvail <= 0) {
                    binderC2666b.t1(bundle);
                    parcel2.writeNoException();
                    return true;
                }
                StringBuilder sb = new StringBuilder(56);
                sb.append("Parcel data not fully consumed, unread size: ");
                sb.append(dataAvail);
                throw new BadParcelableException(sb.toString());
        }
    }

    public c(String str) {
        this.f842k = 1;
        attachInterface(this, str);
    }
}
