package Hi;

import B0.C2454a;
import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yi.q;

/* loaded from: classes10.dex */
public final class b implements Hi.a {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f11005a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11006b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11007c;

    /* renamed from: d, reason: collision with root package name */
    private final float f11008d;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new b(q.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(@NotNull q mode, boolean z11, int i11, float f7) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f11005a = mode;
        this.f11006b = z11;
        this.f11007c = i11;
        this.f11008d = f7;
    }

    public final int a() {
        return this.f11007c;
    }

    @NotNull
    public final q b() {
        return this.f11005a;
    }

    public final float c() {
        return this.f11008d;
    }

    public final boolean d() {
        return this.f11006b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11005a == bVar.f11005a && this.f11006b == bVar.f11006b && this.f11007c == bVar.f11007c && Float.compare(this.f11008d, bVar.f11008d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11008d) + C2454a.a(this.f11007c, C3532b.a(this.f11005a.hashCode() * 31, 31, this.f11006b), 31);
    }

    @NotNull
    public final String toString() {
        return "CameraRestorableStateInternal(mode=" + this.f11005a + ", isFlashOn=" + this.f11006b + ", lensFacing=" + this.f11007c + ", zoomLevel=" + this.f11008d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f11005a.name());
        dest.writeInt(this.f11006b ? 1 : 0);
        dest.writeInt(this.f11007c);
        dest.writeFloat(this.f11008d);
    }
}
