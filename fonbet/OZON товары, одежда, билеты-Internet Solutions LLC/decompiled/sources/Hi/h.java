package Hi;

import Hi.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface h extends Parcelable {

    /* loaded from: classes10.dex */
    public static final class a implements h {

        @NotNull
        public static final Parcelable.Creator<a> CREATOR = new C0224a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<h> f11015a;

        /* renamed from: Hi.h$a$a, reason: collision with other inner class name */
        public static final class C0224a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Bi.b.a(a.class, parcel, arrayList, i11, 1);
                }
                return new a(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends h> filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f11015a = filters;
        }

        @NotNull
        public final List<h> a() {
            return this.f11015a;
        }

        @Override // Hi.h
        @NotNull
        public final String applyTo(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            Iterator<T> it = this.f11015a.iterator();
            while (it.hasNext()) {
                query = ((h) it.next()).applyTo(query);
            }
            return query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator c11 = Bi.a.c(this.f11015a, dest);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), i11);
            }
        }
    }

    /* loaded from: classes10.dex */
    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f11016a = new b();

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return b.f11016a;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        @Override // Hi.h
        @NotNull
        public final String applyTo(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            return query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* loaded from: classes10.dex */
    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f11017a = new c();

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return c.f11017a;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        @Override // Hi.h
        @NotNull
        public final String applyTo(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            return V.e.a("(", query, ") AND instr(mime_type,'", j.d.b.IMAGE.a(), "') == 0");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public static final class d implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f11018a = new d();

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return d.f11018a;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        @Override // Hi.h
        @NotNull
        public final String applyTo(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            return V.e.a("(", query, ") AND instr(mime_type,'", j.d.b.VIDEO.a(), "') == 0");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* loaded from: classes10.dex */
    public static final class e implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f11019a = new e();

        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new a();

        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return e.f11019a;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        @Override // Hi.h
        @NotNull
        public final String applyTo(@NotNull String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            return V.e.a("(", query, ") AND instr(mime_type,'", j.d.b.VIDEO.a(), "') > 0");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @NotNull
    String applyTo(@NotNull String str);
}
