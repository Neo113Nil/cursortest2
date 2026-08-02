package u1;

import Z.o;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2482b implements Parcelable {

    /* renamed from: k, reason: collision with root package name */
    public final Parcelable f19983k;

    /* renamed from: l, reason: collision with root package name */
    public static final C2481a f19982l = new C2481a();
    public static final Parcelable.Creator<AbstractC2482b> CREATOR = new o(2);

    public AbstractC2482b() {
        this.f19983k = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f19983k, i);
    }

    public AbstractC2482b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f19983k = parcelable == f19982l ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2482b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f19983k = readParcelable == null ? f19982l : readParcelable;
    }
}
