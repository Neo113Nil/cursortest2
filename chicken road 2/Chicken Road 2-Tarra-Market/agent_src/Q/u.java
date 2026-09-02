package Q;

import a0.AbstractBinderC0010a;
import a0.AbstractC0011b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class u extends AbstractBinderC0010a {

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f474c;

    public u(com.google.android.gms.common.internal.a aVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f473b = aVar;
        this.f474c = i2;
    }

    @Override // a0.AbstractBinderC0010a
    public final boolean d(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC0011b.a(parcel, Bundle.CREATOR);
            AbstractC0011b.b(parcel);
            s.d(this.f473b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f473b;
            aVar.getClass();
            w wVar = new w(aVar, readInt, readStrongBinder, bundle);
            t tVar = aVar.f736e;
            tVar.sendMessage(tVar.obtainMessage(1, this.f474c, -1, wVar));
            this.f473b = null;
        } else if (i2 == 2) {
            parcel.readInt();
            AbstractC0011b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            y yVar = (y) AbstractC0011b.a(parcel, y.CREATOR);
            AbstractC0011b.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f473b;
            s.d(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            s.c(yVar);
            aVar2.f752u = yVar;
            if (aVar2 instanceof Y.b) {
                C0006d c0006d = yVar.f483d;
                h b2 = h.b();
                i iVar = c0006d == null ? null : c0006d.f406a;
                synchronized (b2) {
                    if (iVar == null) {
                        iVar = h.f438c;
                    } else {
                        i iVar2 = (i) b2.f439a;
                        if (iVar2 != null) {
                            if (iVar2.f440a < iVar.f440a) {
                            }
                        }
                    }
                    b2.f439a = iVar;
                }
            }
            Bundle bundle2 = yVar.f480a;
            s.d(this.f473b, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f473b;
            aVar3.getClass();
            w wVar2 = new w(aVar3, readInt2, readStrongBinder2, bundle2);
            t tVar2 = aVar3.f736e;
            tVar2.sendMessage(tVar2.obtainMessage(1, this.f474c, -1, wVar2));
            this.f473b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
