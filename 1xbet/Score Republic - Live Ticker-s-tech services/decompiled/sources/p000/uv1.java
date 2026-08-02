package p000;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 implements Parcelable {
    public static final Parcelable.Creator<uv1> CREATOR = new jm1(5);

    /* JADX INFO: renamed from: j */
    public final Messenger f7914j;

    public uv1(IBinder iBinder) {
        this.f7914j = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.f7914j;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((uv1) obj).f7914j;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.f7914j;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f7914j;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
