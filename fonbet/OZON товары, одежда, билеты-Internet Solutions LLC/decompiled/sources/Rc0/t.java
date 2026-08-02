package Rc0;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f25005a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f25006b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25007c;

    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new t(parcel.readInt() != 0, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i11) {
            return new t[i11];
        }
    }

    public t(boolean z11, Boolean bool, Boolean bool2) {
        this.f25005a = bool;
        this.f25006b = bool2;
        this.f25007c = z11;
    }

    public final Boolean a() {
        return this.f25006b;
    }

    public final boolean b() {
        return this.f25007c;
    }

    public final Boolean c() {
        return this.f25005a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f25005a, tVar.f25005a) && Intrinsics.d(this.f25006b, tVar.f25006b) && this.f25007c == tVar.f25007c;
    }

    public final int hashCode() {
        Boolean bool = this.f25005a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f25006b;
        return Boolean.hashCode(this.f25007c) + ((hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgreementsViewState(termsOfUseChecked=");
        sb2.append(this.f25005a);
        sb2.append(", adsChecked=");
        sb2.append(this.f25006b);
        sb2.append(", completeButtonEnabled=");
        return Pk0.a.a(")", sb2, this.f25007c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.f25005a;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool);
        }
        Boolean bool2 = this.f25006b;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            D40.c.c(dest, 1, bool2);
        }
        dest.writeInt(this.f25007c ? 1 : 0);
    }
}
