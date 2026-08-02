package NZ;

import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f18881a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Integer, String> f18882b;

    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
            }
            return new h(readInt, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i11) {
            return new h[i11];
        }
    }

    public h(int i11, @NotNull Map<Integer, String> deeplinks) {
        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
        this.f18881a = i11;
        this.f18882b = deeplinks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h a(h hVar, int i11, LinkedHashMap linkedHashMap, int i12) {
        if ((i12 & 1) != 0) {
            i11 = hVar.f18881a;
        }
        Map deeplinks = linkedHashMap;
        if ((i12 & 2) != 0) {
            deeplinks = hVar.f18882b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(deeplinks, "deeplinks");
        return new h(i11, deeplinks);
    }

    @NotNull
    public final Map<Integer, String> b() {
        return this.f18882b;
    }

    public final int c() {
        return this.f18881a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Intrinsics.d(this.f18882b, ((h) obj).f18882b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18882b.hashCode();
    }

    @NotNull
    public final String toString() {
        return P.f(new StringBuilder("TabNavigatorConfig(deeplinks="), this.f18882b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f18881a);
        Map<Integer, String> map = this.f18882b;
        dest.writeInt(map.size());
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            dest.writeInt(entry.getKey().intValue());
            dest.writeString(entry.getValue());
        }
    }
}
