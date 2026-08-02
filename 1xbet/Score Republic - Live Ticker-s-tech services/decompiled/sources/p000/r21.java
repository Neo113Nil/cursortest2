package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class r21 implements Parcelable {
    public static final Parcelable.Creator<r21> CREATOR = new C0936z2(19);

    /* JADX INFO: renamed from: j */
    public zb0 f6667j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f6667j == null) {
                    this.f6667j = new q21(this);
                }
                parcel.writeStrongBinder(this.f6667j.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo327a(int i, Bundle bundle) {
    }
}
