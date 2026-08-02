package Hi;

import B0.C2454a;
import De.C2860c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final j f11020a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f11021b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11022c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11023d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Long> f11024e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11025f;

    /* renamed from: g, reason: collision with root package name */
    private final Hi.a f11026g;

    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            j jVar = (j) parcel.readParcelable(i.class.getClassLoader());
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i11 = 0; i11 != readInt3; i11++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new i(jVar, valueOf, readInt, readInt2, arrayList, parcel.readInt(), (Hi.a) parcel.readParcelable(i.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i11) {
            return new i[i11];
        }
    }

    public i() {
        this((j) null, (Long) null, 0, 0, (List) null, 0, 127);
    }

    public static i a(i iVar, Hi.a aVar) {
        j jVar = iVar.f11020a;
        Long l11 = iVar.f11021b;
        int i11 = iVar.f11022c;
        int i12 = iVar.f11023d;
        List<Long> selectedMediaIdsInOrder = iVar.f11024e;
        int i13 = iVar.f11025f;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(selectedMediaIdsInOrder, "selectedMediaIdsInOrder");
        return new i(jVar, l11, i11, i12, selectedMediaIdsInOrder, i13, aVar);
    }

    public final Long b() {
        return this.f11021b;
    }

    public final Hi.a c() {
        return this.f11026g;
    }

    public final j d() {
        return this.f11020a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f11022c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f11020a, iVar.f11020a) && Intrinsics.d(this.f11021b, iVar.f11021b) && this.f11022c == iVar.f11022c && this.f11023d == iVar.f11023d && Intrinsics.d(this.f11024e, iVar.f11024e) && this.f11025f == iVar.f11025f && Intrinsics.d(this.f11026g, iVar.f11026g);
    }

    public final int f() {
        return this.f11023d;
    }

    @NotNull
    public final List<Long> g() {
        return this.f11024e;
    }

    public final int h() {
        return this.f11025f;
    }

    public final int hashCode() {
        j jVar = this.f11020a;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        Long l11 = this.f11021b;
        int a11 = C2454a.a(this.f11025f, G.g.b(C2454a.a(this.f11023d, C2454a.a(this.f11022c, (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31), 31), 31, this.f11024e), 31);
        Hi.a aVar = this.f11026g;
        return a11 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "GalleryRestorableState(currentAlbum=" + this.f11020a + ", anchorMediaId=" + this.f11021b + ", firstVisibleItemIndex=" + this.f11022c + ", firstVisibleItemScrollOffset=" + this.f11023d + ", selectedMediaIdsInOrder=" + this.f11024e + ", spanCount=" + this.f11025f + ", cameraRestorableState=" + this.f11026g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f11020a, i11);
        Long l11 = this.f11021b;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            C2860c.e(dest, 1, l11);
        }
        dest.writeInt(this.f11022c);
        dest.writeInt(this.f11023d);
        Iterator c11 = Bi.a.c(this.f11024e, dest);
        while (c11.hasNext()) {
            dest.writeLong(((Number) c11.next()).longValue());
        }
        dest.writeInt(this.f11025f);
        dest.writeParcelable(this.f11026g, i11);
    }

    public i(j jVar, Long l11, int i11, int i12, @NotNull List<Long> selectedMediaIdsInOrder, int i13, Hi.a aVar) {
        Intrinsics.checkNotNullParameter(selectedMediaIdsInOrder, "selectedMediaIdsInOrder");
        this.f11020a = jVar;
        this.f11021b = l11;
        this.f11022c = i11;
        this.f11023d = i12;
        this.f11024e = selectedMediaIdsInOrder;
        this.f11025f = i13;
        this.f11026g = aVar;
    }

    public i(j jVar, Long l11, int i11, int i12, List list, int i13, int i14) {
        this((i14 & 1) != 0 ? null : jVar, (i14 & 2) != 0 ? null : l11, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (List<Long>) ((i14 & 16) != 0 ? K.f71697a : list), (i14 & 32) != 0 ? 1 : i13, (Hi.a) null);
    }
}
