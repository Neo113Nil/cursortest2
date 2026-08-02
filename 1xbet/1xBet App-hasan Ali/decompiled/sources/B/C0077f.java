package B;

import android.os.Parcel;
import android.os.Parcelable;
import n.AbstractC2107A;

/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077f implements Parcelable {
    public static final Parcelable.Creator<C0077f> CREATOR = new C0076e();

    /* renamed from: k, reason: collision with root package name */
    public final int f672k;

    public C0077f(int i) {
        this.f672k = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0077f) && this.f672k == ((C0077f) obj).f672k;
    }

    public final int hashCode() {
        return this.f672k;
    }

    public final String toString() {
        return AbstractC2107A.t(new StringBuilder("DefaultLazyKey(index="), this.f672k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f672k);
    }
}
