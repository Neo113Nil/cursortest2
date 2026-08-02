package W10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f33193d = new c(null, null, null);

    /* renamed from: a, reason: collision with root package name */
    private final String f33194a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33195b;

    /* renamed from: c, reason: collision with root package name */
    private final RZ.b f33196c;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), new RZ.b(parcel.readString(), parcel.readString(), parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c() {
        this(null, null, null);
    }

    public final RZ.b b() {
        return this.f33196c;
    }

    public final String c() {
        return this.f33194a;
    }

    public final String d() {
        return this.f33195b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f33194a, cVar.f33194a) && Intrinsics.d(this.f33195b, cVar.f33195b) && Intrinsics.d(this.f33196c, cVar.f33196c);
    }

    public final int hashCode() {
        String str = this.f33194a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f33195b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        RZ.b bVar = this.f33196c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TrackingData(widgetId=" + this.f33194a + ", widgetToken=" + this.f33195b + ", pageAnalyticsInfo=" + this.f33196c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(c());
        parcel.writeString(d());
        RZ.b b11 = b();
        parcel.writeString(b11 != null ? b11.b() : null);
        RZ.b b12 = b();
        parcel.writeString(b12 != null ? b12.d() : null);
        RZ.b b13 = b();
        parcel.writeLong(b13 != null ? b13.a() : 0L);
    }

    public c(String str, String str2, RZ.b bVar) {
        this.f33194a = str;
        this.f33195b = str2;
        this.f33196c = bVar;
    }
}
