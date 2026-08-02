package WZ;

import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class t implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final t f33400b = new t(U.c());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<YZ.a, List<s>> f33401a;

    public static final class a {
        @NotNull
        public static t a(@NotNull String type, @NotNull s event) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(type, "type");
            return new t(U.i(new Pair(YZ.a.a(type), C7714v.a0(event))));
        }
    }

    public static final class b implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                YZ.a createFromParcel = YZ.a.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = Ak.b.b(s.CREATOR, parcel, arrayList, i12, 1);
                }
                linkedHashMap.put(createFromParcel, arrayList);
            }
            return new t(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i11) {
            return new t[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@NotNull Map<YZ.a, ? extends List<s>> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f33401a = events;
    }

    @NotNull
    public final Map<YZ.a, List<s>> b() {
        return this.f33401a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return Intrinsics.d(this.f33401a, ((t) obj).f33401a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33401a.hashCode();
    }

    @NotNull
    public final String toString() {
        return P.f(new StringBuilder("TokenizedEvent(events="), this.f33401a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<YZ.a, List<s>> map = this.f33401a;
        dest.writeInt(map.size());
        for (Map.Entry<YZ.a, List<s>> entry : map.entrySet()) {
            String b11 = entry.getKey().b();
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(b11);
            Iterator c11 = Bi.a.c(entry.getValue(), dest);
            while (c11.hasNext()) {
                ((s) c11.next()).writeToParcel(dest, i11);
            }
        }
    }
}
