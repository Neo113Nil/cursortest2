package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nv1 extends cl1 {

    /* JADX INFO: renamed from: c */
    public AbstractC0575pb f5556c;

    /* JADX INFO: renamed from: d */
    public final int f5557d;

    public nv1(AbstractC0575pb abstractC0575pb, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f5556c = abstractC0575pb;
        this.f5557d = i;
    }

    @Override // p000.cl1
    /* JADX INFO: renamed from: F */
    public final boolean mo966F(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ru1.m4407a(parcel, Bundle.CREATOR);
            ru1.m4409c(parcel);
            p80.m3864i(this.f5556c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0575pb abstractC0575pb = this.f5556c;
            int i3 = this.f5557d;
            abstractC0575pb.getClass();
            nw1 nw1Var = new nw1(abstractC0575pb, i2, strongBinder, bundle);
            tt1 tt1Var = abstractC0575pb.f6051f;
            tt1Var.sendMessage(tt1Var.obtainMessage(1, i3, -1, nw1Var));
            this.f5556c = null;
        } else if (i == 2) {
            parcel.readInt();
            ru1.m4409c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            y02 y02Var = (y02) ru1.m4407a(parcel, y02.CREATOR);
            ru1.m4409c(parcel);
            AbstractC0575pb abstractC0575pb2 = this.f5556c;
            p80.m3864i(abstractC0575pb2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            p80.m3863h(y02Var);
            abstractC0575pb2.f6068w = y02Var;
            Bundle bundle2 = y02Var.f9124j;
            p80.m3864i(this.f5556c, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC0575pb abstractC0575pb3 = this.f5556c;
            int i5 = this.f5557d;
            abstractC0575pb3.getClass();
            nw1 nw1Var2 = new nw1(abstractC0575pb3, i4, strongBinder2, bundle2);
            tt1 tt1Var2 = abstractC0575pb3.f6051f;
            tt1Var2.sendMessage(tt1Var2.obtainMessage(1, i5, -1, nw1Var2));
            this.f5556c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
