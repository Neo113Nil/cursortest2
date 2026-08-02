package m3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import v3.C2536b;
import x3.AbstractC2644a;

/* loaded from: classes.dex */
public final class x extends C3.c {

    /* renamed from: l, reason: collision with root package name */
    public AbstractC2095e f18111l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18112m;

    public x(AbstractC2095e abstractC2095e, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f18111l = abstractC2095e;
        this.f18112m = i;
    }

    @Override // C3.c
    public final boolean d1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC2644a.a(parcel, Bundle.CREATOR);
            AbstractC2644a.b(parcel);
            v.f("onPostInitComplete can be called only once per call to getRemoteService", this.f18111l);
            AbstractC2095e abstractC2095e = this.f18111l;
            abstractC2095e.getClass();
            z zVar = new z(abstractC2095e, readInt, readStrongBinder, bundle);
            w wVar = abstractC2095e.f;
            wVar.sendMessage(wVar.obtainMessage(1, this.f18112m, -1, zVar));
            this.f18111l = null;
        } else if (i == 2) {
            parcel.readInt();
            AbstractC2644a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            B b3 = (B) AbstractC2644a.a(parcel, B.CREATOR);
            AbstractC2644a.b(parcel);
            AbstractC2095e abstractC2095e2 = this.f18111l;
            v.f("onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService", abstractC2095e2);
            v.e(b3);
            abstractC2095e2.f18042v = b3;
            if (abstractC2095e2 instanceof C2536b) {
                C2096f c2096f = b3.f18002n;
                k b5 = k.b();
                l lVar = c2096f == null ? null : c2096f.f18044k;
                synchronized (b5) {
                    if (lVar == null) {
                        lVar = k.f18077m;
                    } else {
                        l lVar2 = (l) b5.f18078k;
                        if (lVar2 != null) {
                            if (lVar2.f18079k < lVar.f18079k) {
                            }
                        }
                    }
                    b5.f18078k = lVar;
                }
            }
            Bundle bundle2 = b3.f17999k;
            v.f("onPostInitComplete can be called only once per call to getRemoteService", this.f18111l);
            AbstractC2095e abstractC2095e3 = this.f18111l;
            abstractC2095e3.getClass();
            z zVar2 = new z(abstractC2095e3, readInt2, readStrongBinder2, bundle2);
            w wVar2 = abstractC2095e3.f;
            wVar2.sendMessage(wVar2.obtainMessage(1, this.f18112m, -1, zVar2));
            this.f18111l = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
