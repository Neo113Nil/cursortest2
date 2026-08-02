package Xf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0623a();

    /* renamed from: a, reason: collision with root package name */
    private double f34455a;

    /* renamed from: b, reason: collision with root package name */
    private double f34456b;

    /* renamed from: Xf.a$a, reason: collision with other inner class name */
    public static final class C0623a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(Parcel parcel) {
        this.f34455a = parcel.readDouble();
        this.f34456b = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f34456b == aVar.f34456b && this.f34455a == aVar.f34455a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f34455a);
        int i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f34456b);
        return (i11 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.f34455a);
        out.writeDouble(this.f34456b);
    }

    public a(double d11, double d12) {
        this.f34455a = d11;
        this.f34456b = d12;
    }
}
