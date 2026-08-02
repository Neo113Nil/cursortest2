package Xf;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;

/* loaded from: classes10.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f34457a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f34458b;

    /* renamed from: c, reason: collision with root package name */
    public final LatLng f34459c;

    /* renamed from: d, reason: collision with root package name */
    public final LatLng f34460d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final LatLngBounds f34461e;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(Parcel parcel) {
        Object readParcelable;
        Object readParcelable2;
        Object readParcelable3;
        Object readParcelable4;
        Object readParcelable5;
        if (Build.VERSION.SDK_INT <= 33) {
            this.f34457a = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.f34458b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.f34459c = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.f34460d = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            Parcelable readParcelable6 = parcel.readParcelable(LatLngBounds.class.getClassLoader());
            Intrinsics.f(readParcelable6);
            this.f34461e = (LatLngBounds) readParcelable6;
            return;
        }
        readParcelable = parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
        this.f34457a = (LatLng) readParcelable;
        readParcelable2 = parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
        this.f34458b = (LatLng) readParcelable2;
        readParcelable3 = parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
        this.f34459c = (LatLng) readParcelable3;
        readParcelable4 = parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
        this.f34460d = (LatLng) readParcelable4;
        readParcelable5 = parcel.readParcelable(LatLngBounds.class.getClassLoader(), LatLngBounds.class);
        Intrinsics.f(readParcelable5);
        this.f34461e = (LatLngBounds) readParcelable5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f34457a, bVar.f34457a) && Intrinsics.d(this.f34458b, bVar.f34458b) && Intrinsics.d(this.f34459c, bVar.f34459c) && Intrinsics.d(this.f34460d, bVar.f34460d) && Intrinsics.d(this.f34461e, bVar.f34461e);
    }

    public final int hashCode() {
        LatLng latLng = this.f34457a;
        int hashCode = (latLng != null ? latLng.hashCode() : 0) + 90;
        LatLng latLng2 = this.f34458b;
        int hashCode2 = (((latLng2 != null ? latLng2.hashCode() : 0) + 90) * 1000) + hashCode;
        LatLng latLng3 = this.f34459c;
        int hashCode3 = (((latLng3 != null ? latLng3.hashCode() : 0) + 180) * 1000000) + hashCode2;
        LatLng latLng4 = this.f34460d;
        return (((latLng4 != null ? latLng4.hashCode() : 0) + 180) * 1000000000) + hashCode3;
    }

    @NotNull
    public final String toString() {
        return "[farLeft [" + this.f34457a + "], farRight [" + this.f34458b + "], nearLeft [" + this.f34459c + "], nearRight [" + this.f34460d + "], latLngBounds [" + this.f34461e + "]]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f34457a, i11);
        out.writeParcelable(this.f34458b, i11);
        out.writeParcelable(this.f34459c, i11);
        out.writeParcelable(this.f34460d, i11);
        out.writeParcelable(this.f34461e, i11);
    }

    public b(@NotNull LatLng farLeft, @NotNull LatLng farRight, @NotNull LatLng nearLeft, @NotNull LatLng nearRight, @NotNull LatLngBounds latLngBounds) {
        Intrinsics.checkNotNullParameter(farLeft, "farLeft");
        Intrinsics.checkNotNullParameter(farRight, "farRight");
        Intrinsics.checkNotNullParameter(nearLeft, "nearLeft");
        Intrinsics.checkNotNullParameter(nearRight, "nearRight");
        Intrinsics.checkNotNullParameter(latLngBounds, "latLngBounds");
        this.f34457a = farLeft;
        this.f34458b = farRight;
        this.f34459c = nearLeft;
        this.f34460d = nearRight;
        this.f34461e = latLngBounds;
    }
}
