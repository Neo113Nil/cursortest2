package Ci;

import B0.C2454a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f5095a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5096b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5097c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5098d;

    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new h(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i11) {
            return new h[i11];
        }
    }

    public h(int i11, int i12, int i13, boolean z11) {
        this.f5095a = i11;
        this.f5096b = i12;
        this.f5097c = i13;
        this.f5098d = z11;
    }

    public final boolean a() {
        return this.f5098d;
    }

    public final int b() {
        return this.f5097c;
    }

    public final int c() {
        return this.f5095a;
    }

    public final int d() {
        return this.f5096b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5095a == hVar.f5095a && this.f5096b == hVar.f5096b && this.f5097c == hVar.f5097c && this.f5098d == hVar.f5098d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5098d) + C2454a.a(this.f5097c, C2454a.a(this.f5096b, Integer.hashCode(this.f5095a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryMediaListPaginationConfig(pageSize=");
        sb2.append(this.f5095a);
        sb2.append(", prefetchDistance=");
        sb2.append(this.f5096b);
        sb2.append(", initialLoadSize=");
        sb2.append(this.f5097c);
        sb2.append(", enablePlaceholders=");
        return Pk0.a.a(")", sb2, this.f5098d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f5095a);
        dest.writeInt(this.f5096b);
        dest.writeInt(this.f5097c);
        dest.writeInt(this.f5098d ? 1 : 0);
    }
}
