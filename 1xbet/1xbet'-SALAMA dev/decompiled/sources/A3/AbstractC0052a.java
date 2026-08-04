package A3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: A3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f633b;

    public AbstractC0052a(IBinder iBinder, String str) {
        this.f632a = iBinder;
        this.f633b = str;
    }

    public final void Z(int i7, Parcel parcel) {
        try {
            this.f632a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f632a;
    }
}
