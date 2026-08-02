package S0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: S0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3989v0 extends j1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C3989v0> CREATOR = new a();

    /* renamed from: S0.v0$a */
    public static final class a implements Parcelable.Creator<C3989v0> {
        @Override // android.os.Parcelable.Creator
        public final C3989v0 createFromParcel(Parcel parcel) {
            return new C3989v0(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final C3989v0[] newArray(int i11) {
            return new C3989v0[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        parcel.writeLong(n());
    }
}
