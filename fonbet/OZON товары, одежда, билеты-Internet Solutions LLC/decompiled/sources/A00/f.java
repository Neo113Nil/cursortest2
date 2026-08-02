package A00;

import android.os.Parcel;
import android.os.Parcelable;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes3.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f279a;

    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return f.a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i11) {
            return new f[i11];
        }
    }

    private /* synthetic */ f(int i11) {
        this.f279a = i11;
    }

    public static final /* synthetic */ f a(int i11) {
        return new f(i11);
    }

    public static final boolean b(int i11) {
        return i11 != Integer.MIN_VALUE;
    }

    @NotNull
    public static String c(int i11) {
        return "ScrollOffset(offset=" + (!b(i11) ? 0 : i11) + ", isValid=" + b(i11) + ")";
    }

    public static final void e(int i11, @NotNull Parcel dest) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(i11);
    }

    public final /* synthetic */ int d() {
        return this.f279a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f279a == ((f) obj).f279a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f279a);
    }

    @NotNull
    public final String toString() {
        return c(this.f279a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e(this.f279a, dest);
    }
}
