package Hi;

import De.C2860c;
import Kk.C3532b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface k extends Parcelable {

    public static final class a implements k {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0226a();

        /* renamed from: a, reason: collision with root package name */
        private final long f11043a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f11044b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f11045c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f11046d;

        /* renamed from: e, reason: collision with root package name */
        private final String f11047e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f11048f;

        /* renamed from: g, reason: collision with root package name */
        private final int f11049g;

        /* renamed from: Hi.k$a$a, reason: collision with other inner class name */
        public static final class C0226a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a(parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(long j11, @NotNull String path, @NotNull Uri uri, Long l11, String str, boolean z11, int i11) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f11043a = j11;
            this.f11044b = path;
            this.f11045c = uri;
            this.f11046d = l11;
            this.f11047e = str;
            this.f11048f = z11;
            this.f11049g = i11;
        }

        public final int a() {
            return this.f11049g;
        }

        @Override // Hi.k
        public final String b0() {
            return this.f11047e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11043a == aVar.f11043a && Intrinsics.d(this.f11044b, aVar.f11044b) && Intrinsics.d(this.f11045c, aVar.f11045c) && Intrinsics.d(this.f11046d, aVar.f11046d) && Intrinsics.d(this.f11047e, aVar.f11047e) && this.f11048f == aVar.f11048f && this.f11049g == aVar.f11049g;
        }

        @Override // Hi.k
        public final long getId() {
            return this.f11043a;
        }

        @Override // Hi.k
        @NotNull
        public final String getPath() {
            return this.f11044b;
        }

        @Override // Hi.k
        @NotNull
        public final Uri getUri() {
            return this.f11045c;
        }

        public final int hashCode() {
            int hashCode = (this.f11045c.hashCode() + G.g.a(Long.hashCode(this.f11043a) * 31, 31, this.f11044b)) * 31;
            Long l11 = this.f11046d;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.f11047e;
            return Integer.hashCode(this.f11049g) + C3532b.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f11048f);
        }

        @Override // Hi.k
        public final Long l0() {
            return this.f11046d;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Image(id=");
            sb2.append(this.f11043a);
            sb2.append(", path=");
            sb2.append(this.f11044b);
            sb2.append(", uri=");
            sb2.append(this.f11045c);
            sb2.append(", albumId=");
            sb2.append(this.f11046d);
            sb2.append(", albumName=");
            sb2.append(this.f11047e);
            sb2.append(", isFavorite=");
            sb2.append(this.f11048f);
            sb2.append(", position=");
            return K00.b.e(this.f11049g, ")", sb2);
        }

        @Override // Hi.k
        public final boolean v() {
            return this.f11048f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f11043a);
            dest.writeString(this.f11044b);
            dest.writeParcelable(this.f11045c, i11);
            Long l11 = this.f11046d;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.f11047e);
            dest.writeInt(this.f11048f ? 1 : 0);
            dest.writeInt(this.f11049g);
        }
    }

    public static final class b implements k {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final long f11050a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f11051b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f11052c;

        /* renamed from: d, reason: collision with root package name */
        private final Long f11053d;

        /* renamed from: e, reason: collision with root package name */
        private final String f11054e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f11055f;

        /* renamed from: g, reason: collision with root package name */
        private final long f11056g;

        /* renamed from: h, reason: collision with root package name */
        private final int f11057h;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(long j11, @NotNull String path, @NotNull Uri uri, Long l11, String str, boolean z11, long j12, int i11) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f11050a = j11;
            this.f11051b = path;
            this.f11052c = uri;
            this.f11053d = l11;
            this.f11054e = str;
            this.f11055f = z11;
            this.f11056g = j12;
            this.f11057h = i11;
        }

        public final int a() {
            return this.f11057h;
        }

        @Override // Hi.k
        public final String b0() {
            return this.f11054e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11050a == bVar.f11050a && Intrinsics.d(this.f11051b, bVar.f11051b) && Intrinsics.d(this.f11052c, bVar.f11052c) && Intrinsics.d(this.f11053d, bVar.f11053d) && Intrinsics.d(this.f11054e, bVar.f11054e) && this.f11055f == bVar.f11055f && this.f11056g == bVar.f11056g && this.f11057h == bVar.f11057h;
        }

        public final long getDuration() {
            return this.f11056g;
        }

        @Override // Hi.k
        public final long getId() {
            return this.f11050a;
        }

        @Override // Hi.k
        @NotNull
        public final String getPath() {
            return this.f11051b;
        }

        @Override // Hi.k
        @NotNull
        public final Uri getUri() {
            return this.f11052c;
        }

        public final int hashCode() {
            int hashCode = (this.f11052c.hashCode() + G.g.a(Long.hashCode(this.f11050a) * 31, 31, this.f11051b)) * 31;
            Long l11 = this.f11053d;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.f11054e;
            return Integer.hashCode(this.f11057h) + Pk0.c.a(C3532b.a((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f11055f), 31, this.f11056g);
        }

        @Override // Hi.k
        public final Long l0() {
            return this.f11053d;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Video(id=");
            sb2.append(this.f11050a);
            sb2.append(", path=");
            sb2.append(this.f11051b);
            sb2.append(", uri=");
            sb2.append(this.f11052c);
            sb2.append(", albumId=");
            sb2.append(this.f11053d);
            sb2.append(", albumName=");
            sb2.append(this.f11054e);
            sb2.append(", isFavorite=");
            sb2.append(this.f11055f);
            sb2.append(", duration=");
            sb2.append(this.f11056g);
            sb2.append(", position=");
            return K00.b.e(this.f11057h, ")", sb2);
        }

        @Override // Hi.k
        public final boolean v() {
            return this.f11055f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f11050a);
            dest.writeString(this.f11051b);
            dest.writeParcelable(this.f11052c, i11);
            Long l11 = this.f11053d;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
            dest.writeString(this.f11054e);
            dest.writeInt(this.f11055f ? 1 : 0);
            dest.writeLong(this.f11056g);
            dest.writeInt(this.f11057h);
        }
    }

    String b0();

    long getId();

    @NotNull
    String getPath();

    @NotNull
    Uri getUri();

    Long l0();

    boolean v();
}
