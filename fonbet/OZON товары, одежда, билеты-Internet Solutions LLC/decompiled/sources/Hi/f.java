package Hi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<k> f11011a;

    /* renamed from: b, reason: collision with root package name */
    private final i f11012b;

    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Bi.b.a(f.class, parcel, arrayList, i11, 1);
            }
            return new f(arrayList, parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i11) {
            return new f[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull List<? extends k> media, i iVar) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f11011a = media;
        this.f11012b = iVar;
    }

    @NotNull
    public final List<k> a() {
        return this.f11011a;
    }

    public final i b() {
        return this.f11012b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f11011a, fVar.f11011a) && Intrinsics.d(this.f11012b, fVar.f11012b);
    }

    public final int hashCode() {
        int hashCode = this.f11011a.hashCode() * 31;
        i iVar = this.f11012b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "GalleryActivityResult(media=" + this.f11011a + ", restorableState=" + this.f11012b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.f11011a, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), i11);
        }
        i iVar = this.f11012b;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            iVar.writeToParcel(dest, i11);
        }
    }

    public f() {
        this(K.f71697a, null);
    }
}
