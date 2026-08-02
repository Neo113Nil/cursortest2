package Di;

import Pk0.g;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: Di.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2872a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C2872a> CREATOR = new C0143a();

    /* renamed from: a, reason: collision with root package name */
    private final double f6727a;

    /* renamed from: b, reason: collision with root package name */
    private final double f6728b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6729c;

    /* renamed from: Di.a$a, reason: collision with other inner class name */
    public static final class C0143a implements Parcelable.Creator<C2872a> {
        @Override // android.os.Parcelable.Creator
        public final C2872a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C2872a(parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C2872a[] newArray(int i11) {
            return new C2872a[i11];
        }
    }

    static {
        new Regex("(?<dimension>[wWhH])?,?(?<width>\\d+):(?<height>\\d+)");
    }

    public /* synthetic */ C2872a(double d11) {
        this(1.0d, d11, 0);
    }

    public final double a(double d11) {
        int i11 = this.f6729c;
        double d12 = this.f6727a;
        double d13 = this.f6728b;
        Pair pair = i11 == 1 ? new Pair(Double.valueOf(d13), Double.valueOf(d12)) : new Pair(Double.valueOf(d12), Double.valueOf(d13));
        return (((Number) pair.b()).doubleValue() * d11) / ((Number) pair.a()).doubleValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2872a)) {
            return false;
        }
        C2872a c2872a = (C2872a) obj;
        return Double.compare(this.f6727a, c2872a.f6727a) == 0 && Double.compare(this.f6728b, c2872a.f6728b) == 0 && this.f6729c == c2872a.f6729c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6729c) + g.a(Double.hashCode(this.f6727a) * 31, 31, this.f6728b);
    }

    @NotNull
    public final String toString() {
        return (this.f6729c == 1 ? "W" : "H").concat(",") + this.f6727a + ProductContainerDTO.RATIO_DELIMITER + this.f6728b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f6727a);
        dest.writeDouble(this.f6728b);
        dest.writeInt(this.f6729c);
    }

    public C2872a(double d11, double d12, int i11) {
        this.f6727a = d11;
        this.f6728b = d12;
        this.f6729c = i11;
    }
}
