package S0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import c1.AbstractBinderC0169a;

/* loaded from: classes.dex */
public final class t extends AbstractBinderC0169a {

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f1362d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1363e;

    public t(com.google.android.gms.common.internal.a aVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 0);
        this.f1362d = aVar;
        this.f1363e = i3;
    }

    @Override // c1.AbstractBinderC0169a
    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) c1.b.a(parcel, Bundle.CREATOR);
            c1.b.b(parcel);
            r.d(this.f1362d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f1362d;
            aVar.getClass();
            v vVar = new v(aVar, readInt, readStrongBinder, bundle);
            s sVar = aVar.f2576e;
            sVar.sendMessage(sVar.obtainMessage(1, this.f1363e, -1, vVar));
            this.f1362d = null;
        } else if (i3 == 2) {
            parcel.readInt();
            c1.b.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            x xVar = (x) c1.b.a(parcel, x.CREATOR);
            c1.b.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f1362d;
            r.d(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.c(xVar);
            aVar2.f2591u = xVar;
            if (aVar2.u()) {
                C0060c c0060c = xVar.f1372d;
                g b3 = g.b();
                h hVar = c0060c == null ? null : c0060c.f1299a;
                synchronized (b3) {
                    if (hVar == null) {
                        hVar = g.f1328c;
                    } else {
                        h hVar2 = (h) b3.f1329a;
                        if (hVar2 != null) {
                            if (hVar2.f1330a < hVar.f1330a) {
                            }
                        }
                    }
                    b3.f1329a = hVar;
                }
            }
            Bundle bundle2 = xVar.f1369a;
            r.d(this.f1362d, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f1362d;
            aVar3.getClass();
            v vVar2 = new v(aVar3, readInt2, readStrongBinder2, bundle2);
            s sVar2 = aVar3.f2576e;
            sVar2.sendMessage(sVar2.obtainMessage(1, this.f1363e, -1, vVar2));
            this.f1362d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
