package bd0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* renamed from: bd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5654a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C5654a> CREATOR = new C0838a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final OzonSpannableString f55956a;

    /* renamed from: b, reason: collision with root package name */
    private final OzonSpannableString f55957b;

    /* renamed from: c, reason: collision with root package name */
    private final String f55958c;

    /* renamed from: d, reason: collision with root package name */
    private final EntryDTO.EntryButtonDTO f55959d;

    /* renamed from: bd0.a$a, reason: collision with other inner class name */
    public static final class C0838a implements Parcelable.Creator<C5654a> {
        @Override // android.os.Parcelable.Creator
        public final C5654a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Ac0.a aVar = Ac0.a.f750a;
            return new C5654a(aVar.a(parcel), aVar.a(parcel), parcel.readString(), parcel.readInt() == 0 ? null : EntryDTO.EntryButtonDTO.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final C5654a[] newArray(int i11) {
            return new C5654a[i11];
        }
    }

    public C5654a(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, String str, EntryDTO.EntryButtonDTO entryButtonDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55956a = title;
        this.f55957b = ozonSpannableString;
        this.f55958c = str;
        this.f55959d = entryButtonDTO;
    }

    public final String a() {
        return this.f55958c;
    }

    public final EntryDTO.EntryButtonDTO b() {
        return this.f55959d;
    }

    public final OzonSpannableString c() {
        return this.f55957b;
    }

    @NotNull
    public final OzonSpannableString d() {
        return this.f55956a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5654a)) {
            return false;
        }
        C5654a c5654a = (C5654a) obj;
        return Intrinsics.d(this.f55956a, c5654a.f55956a) && Intrinsics.d(this.f55957b, c5654a.f55957b) && Intrinsics.d(this.f55958c, c5654a.f55958c) && Intrinsics.d(this.f55959d, c5654a.f55959d);
    }

    public final int hashCode() {
        int hashCode = this.f55956a.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.f55957b;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str = this.f55958c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EntryDTO.EntryButtonDTO entryButtonDTO = this.f55959d;
        return hashCode3 + (entryButtonDTO != null ? entryButtonDTO.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PageNotificationVO(title=" + ((Object) this.f55956a) + ", subtitle=" + ((Object) this.f55957b) + ", logoUrl=" + this.f55958c + ", submitButtonDTO=" + this.f55959d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        OzonSpannableString ozonSpannableString = this.f55956a;
        if (ozonSpannableString == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        OzonSpannableString ozonSpannableString2 = this.f55957b;
        if (ozonSpannableString2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(Html.toHtml(ozonSpannableString2, 1));
        }
        parcel.writeString(this.f55958c);
        EntryDTO.EntryButtonDTO entryButtonDTO = this.f55959d;
        if (entryButtonDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryButtonDTO.writeToParcel(parcel, i11);
        }
    }
}
