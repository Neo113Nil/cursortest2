package YZ;

import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes7.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0643a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34879a;

    /* renamed from: YZ.a$a, reason: collision with other inner class name */
    public static final class C0643a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String type = parcel.readString();
            Intrinsics.checkNotNullParameter(type, "type");
            return a.a(type);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    private /* synthetic */ a(String str) {
        this.f34879a = str;
    }

    public static final /* synthetic */ a a(String str) {
        return new a(str);
    }

    public final /* synthetic */ String b() {
        return this.f34879a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.f34879a, ((a) obj).f34879a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34879a.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("PayloadType(type='"), this.f34879a, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f34879a);
    }
}
