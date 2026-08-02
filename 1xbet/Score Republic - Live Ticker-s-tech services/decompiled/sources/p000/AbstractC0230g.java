package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230g implements Parcelable {

    /* JADX INFO: renamed from: j */
    public final Parcelable f2565j;

    /* JADX INFO: renamed from: k */
    public static final C0156e f2564k = new C0156e();
    public static final Parcelable.Creator<AbstractC0230g> CREATOR = new C0193f(0);

    public AbstractC0230g(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2565j = parcelable == f2564k ? null : parcelable;
        } else {
            C0270h1.m2190f("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2565j, i);
    }

    public AbstractC0230g() {
        this.f2565j = null;
    }

    public AbstractC0230g(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2565j = parcelable == null ? f2564k : parcelable;
    }
}
