package Hi;

import B0.C2454a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface j extends Hi.c, Parcelable {

    public static final class a implements j {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0225a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f11027a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11028b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f11029c;

        /* renamed from: Hi.j$a$a, reason: collision with other inner class name */
        public static final class C0225a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new a((Uri) parcel.readParcelable(a.class.getClassLoader()), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(@NotNull Uri thumbnail, @NotNull String title, int i11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            this.f11027a = title;
            this.f11028b = i11;
            this.f11029c = thumbnail;
        }

        @Override // Hi.j
        @NotNull
        public final Uri F1() {
            return this.f11029c;
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
            return Intrinsics.d(this.f11027a, aVar.f11027a) && this.f11028b == aVar.f11028b && Intrinsics.d(this.f11029c, aVar.f11029c);
        }

        @Override // Hi.j
        public final int getCount() {
            return this.f11028b;
        }

        @Override // Hi.j
        @NotNull
        public final String getTitle() {
            return this.f11027a;
        }

        public final int hashCode() {
            return this.f11029c.hashCode() + C2454a.a(this.f11028b, this.f11027a.hashCode() * 31, 31);
        }

        @Override // Hi.c
        @NotNull
        public final String m() {
            return "media_type = 1 OR media_type = 3";
        }

        @Override // Hi.c
        public final String[] n() {
            return null;
        }

        @NotNull
        public final String toString() {
            return "AllFiles(title=" + this.f11027a + ", count=" + this.f11028b + ", thumbnail=" + this.f11029c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f11027a);
            dest.writeInt(this.f11028b);
            dest.writeParcelable(this.f11029c, i11);
        }
    }

    public static final class b implements j {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f11030a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11031b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f11032c;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b((Uri) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(@NotNull Uri thumbnail, @NotNull String title, int i11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            this.f11030a = title;
            this.f11031b = i11;
            this.f11032c = thumbnail;
        }

        @Override // Hi.j
        @NotNull
        public final Uri F1() {
            return this.f11032c;
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
            return Intrinsics.d(this.f11030a, bVar.f11030a) && this.f11031b == bVar.f11031b && Intrinsics.d(this.f11032c, bVar.f11032c);
        }

        @Override // Hi.j
        public final int getCount() {
            return this.f11031b;
        }

        @Override // Hi.j
        @NotNull
        public final String getTitle() {
            return this.f11030a;
        }

        public final int hashCode() {
            return this.f11032c.hashCode() + C2454a.a(this.f11031b, this.f11030a.hashCode() * 31, 31);
        }

        @Override // Hi.c
        @NotNull
        public final String m() {
            return "(media_type = 1 OR media_type = 3) AND is_favorite = 1";
        }

        @Override // Hi.c
        public final String[] n() {
            return null;
        }

        @NotNull
        public final String toString() {
            return "Favorites(title=" + this.f11030a + ", count=" + this.f11031b + ", thumbnail=" + this.f11032c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f11030a);
            dest.writeInt(this.f11031b);
            dest.writeParcelable(this.f11032c, i11);
        }
    }

    public static final class c implements j {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f11033a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11034b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f11035c;

        /* renamed from: d, reason: collision with root package name */
        private final long f11036d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final String[] f11037e;

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(parcel.readString(), parcel.readInt(), (Uri) parcel.readParcelable(c.class.getClassLoader()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c(@NotNull String title, int i11, @NotNull Uri thumbnail, long j11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            this.f11033a = title;
            this.f11034b = i11;
            this.f11035c = thumbnail;
            this.f11036d = j11;
            this.f11037e = new String[]{String.valueOf(j11)};
        }

        @Override // Hi.j
        @NotNull
        public final Uri F1() {
            return this.f11035c;
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
            return Intrinsics.d(this.f11033a, cVar.f11033a) && this.f11034b == cVar.f11034b && Intrinsics.d(this.f11035c, cVar.f11035c) && this.f11036d == cVar.f11036d;
        }

        @Override // Hi.j
        public final int getCount() {
            return this.f11034b;
        }

        public final long getId() {
            return this.f11036d;
        }

        @Override // Hi.j
        @NotNull
        public final String getTitle() {
            return this.f11033a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f11036d) + ((this.f11035c.hashCode() + C2454a.a(this.f11034b, this.f11033a.hashCode() * 31, 31)) * 31);
        }

        @Override // Hi.c
        @NotNull
        public final String m() {
            return "(media_type = 1 OR media_type = 3) AND bucket_id = ?";
        }

        @Override // Hi.c
        @NotNull
        public final String[] n() {
            return this.f11037e;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WithId(title=");
            sb2.append(this.f11033a);
            sb2.append(", count=");
            sb2.append(this.f11034b);
            sb2.append(", thumbnail=");
            sb2.append(this.f11035c);
            sb2.append(", id=");
            return P4.f.a(this.f11036d, ")", sb2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f11033a);
            dest.writeInt(this.f11034b);
            dest.writeParcelable(this.f11035c, i11);
            dest.writeLong(this.f11036d);
        }
    }

    public static final class d implements j {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f11038a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11039b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Uri f11040c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final b f11041d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final String[] f11042e;

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString(), parcel.readInt(), (Uri) parcel.readParcelable(d.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b IMAGE;
            public static final b VIDEO;

            @NotNull
            private final String type;

            static {
                b bVar = new b("IMAGE", 0, "image");
                IMAGE = bVar;
                b bVar2 = new b("VIDEO", 1, "video");
                VIDEO = bVar2;
                b[] bVarArr = {bVar, bVar2};
                $VALUES = bVarArr;
                $ENTRIES = Xc.b.a(bVarArr);
            }

            private b(String str, int i11, String str2) {
                this.type = str2;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }

            @NotNull
            public final String a() {
                return this.type;
            }
        }

        public d(@NotNull String title, int i11, @NotNull Uri thumbnail, @NotNull b mediaType) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f11038a = title;
            this.f11039b = i11;
            this.f11040c = thumbnail;
            this.f11041d = mediaType;
            this.f11042e = new String[]{mediaType.a()};
        }

        @Override // Hi.j
        @NotNull
        public final Uri F1() {
            return this.f11040c;
        }

        @NotNull
        public final b a() {
            return this.f11041d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.d(this.f11038a, dVar.f11038a) && this.f11039b == dVar.f11039b && Intrinsics.d(this.f11040c, dVar.f11040c) && this.f11041d == dVar.f11041d;
        }

        @Override // Hi.j
        public final int getCount() {
            return this.f11039b;
        }

        @Override // Hi.j
        @NotNull
        public final String getTitle() {
            return this.f11038a;
        }

        public final int hashCode() {
            return this.f11041d.hashCode() + ((this.f11040c.hashCode() + C2454a.a(this.f11039b, this.f11038a.hashCode() * 31, 31)) * 31);
        }

        @Override // Hi.c
        @NotNull
        public final String m() {
            return "(media_type = 1 OR media_type = 3) AND instr(mime_type, ?) > 0";
        }

        @Override // Hi.c
        @NotNull
        public final String[] n() {
            return this.f11042e;
        }

        @NotNull
        public final String toString() {
            return "WithMediaType(title=" + this.f11038a + ", count=" + this.f11039b + ", thumbnail=" + this.f11040c + ", mediaType=" + this.f11041d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f11038a);
            dest.writeInt(this.f11039b);
            dest.writeParcelable(this.f11040c, i11);
            dest.writeString(this.f11041d.name());
        }
    }

    @NotNull
    Uri F1();

    int getCount();

    @NotNull
    String getTitle();
}
