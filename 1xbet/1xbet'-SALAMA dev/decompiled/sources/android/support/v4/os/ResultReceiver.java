package android.support.v4.os;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.E;
import p021d.b;
import p021d.c;

/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new E(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8079a;

    public void a(int i7, Bundle bundle) {
    }

    public final void b(int i7, Bundle bundle) {
        b bVar = this.f8079a;
        if (bVar != null) {
            try {
                bVar.r0(i7, bundle);
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
                    this.f8079a = new c(this);
                }
                parcel.writeStrongBinder(this.f8079a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
