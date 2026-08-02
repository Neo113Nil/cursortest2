package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yk1 implements IInterface {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9317b;

    /* JADX INFO: renamed from: c */
    public final IBinder f9318c;

    /* JADX INFO: renamed from: d */
    public final String f9319d;

    public /* synthetic */ yk1(IBinder iBinder, String str, int i) {
        this.f9317b = i;
        this.f9318c = iBinder;
        this.f9319d = str;
    }

    /* JADX INFO: renamed from: F */
    public void m5806F(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f9318c.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m5807G(Parcel parcel) {
        try {
            this.f9318c.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public Parcel m5808a(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f9318c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f9317b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f9318c;
    }

    /* JADX INFO: renamed from: c */
    public Parcel m5809c(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f9318c.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public Parcel m5810d() {
        int i = this.f9317b;
        String str = this.f9319d;
        switch (i) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
        }
    }
}
