package android.support.v4.os;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.E;
import d.BinderC0938c;
import d.InterfaceC0937b;

/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new E(6);

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0937b f8079a;

    public void a(int i7, Bundle bundle) {
    }

    public final void b(int i7, Bundle bundle) {
        InterfaceC0937b interfaceC0937b = this.f8079a;
        if (interfaceC0937b != null) {
            try {
                interfaceC0937b.r0(i7, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f8079a == null) {
                    this.f8079a = new BinderC0938c(this);
                }
                parcel.writeStrongBinder(this.f8079a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
