package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 implements IInterface {

    /* JADX INFO: renamed from: b */
    public final IBinder f5790b;

    public om1(IBinder iBinder) {
        this.f5790b = iBinder;
    }

    /* JADX INFO: renamed from: a */
    public final void m3704a(nv1 nv1Var, z70 z70Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(nv1Var);
            parcelObtain.writeInt(1);
            jm1.m2935a(z70Var, parcelObtain, 0);
            this.f5790b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5790b;
    }
}
