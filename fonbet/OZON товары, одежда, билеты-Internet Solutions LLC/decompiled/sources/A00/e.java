package A00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import ed.InterfaceC6346b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e extends A00.a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f265a;

    /* renamed from: b, reason: collision with root package name */
    private final int f266b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f267c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f268d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f269e;

    /* renamed from: f, reason: collision with root package name */
    private final int f270f;

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            c cVar = (c) parcel.readParcelable(e.class.getClassLoader());
            int d11 = f.CREATOR.createFromParcel(parcel).d();
            boolean z13 = false;
            boolean z14 = true;
            if (parcel.readInt() != 0) {
                z11 = false;
                z13 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = true;
                z14 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            return new e(cVar, d11, z13, z14, z12, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i11) {
            return new e[i11];
        }
    }

    /* loaded from: classes3.dex */
    public interface c extends Parcelable {

        @InterfaceC6346b
        public static final class a implements c {

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0016a();

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final Function1<C7854a, Boolean> f277a;

            /* renamed from: A00.e$c$a$a, reason: collision with other inner class name */
            public static final class C0016a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Function1 predicate = (Function1) parcel.readSerializable();
                    Intrinsics.checkNotNullParameter(predicate, "predicate");
                    return a.a(predicate);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private /* synthetic */ a(Function1 function1) {
                this.f277a = function1;
            }

            public static final /* synthetic */ a a(Function1 function1) {
                return new a(function1);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    return Intrinsics.d(this.f277a, ((a) obj).f277a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f277a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Predicate";
            }

            @Override // A00.e.c
            public final <I extends C7854a> int u0(@NotNull List<? extends I> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(items, "items");
                Iterator<? extends I> it = items.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    if (this.f277a.invoke(it.next()).booleanValue()) {
                        return i11;
                    }
                    i11++;
                }
                return -1;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable((Serializable) this.f277a);
            }
        }

        @InterfaceC6346b
        public static final class b implements c {

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f278a;

            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return b.a(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final b[] newArray(int i11) {
                    return new b[i11];
                }
            }

            private /* synthetic */ b(int i11) {
                this.f278a = i11;
            }

            public static final /* synthetic */ b a(int i11) {
                return new b(i11);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof b) {
                    return this.f278a == ((b) obj).f278a;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f278a);
            }

            @NotNull
            public final String toString() {
                return K00.b.e(this.f278a, ")", new StringBuilder("Raw(value="));
            }

            @Override // A00.e.c
            public final <I extends C7854a> int u0(@NotNull List<? extends I> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(items, "items");
                int i11 = this.f278a;
                if (i11 < 0) {
                    return 0;
                }
                return i11 > items.size() ? items.size() : i11;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int i11) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f278a);
            }
        }

        <I extends C7854a> int u0(@NotNull List<? extends I> list);
    }

    public e(c cVar, int i11, boolean z11, boolean z12, boolean z13, int i12) {
        this.f265a = cVar;
        this.f266b = i11;
        this.f267c = z11;
        this.f268d = z12;
        this.f269e = z13;
        this.f270f = i12;
    }

    public final int d() {
        return this.f270f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f266b;
    }

    @NotNull
    public final c f() {
        return this.f265a;
    }

    public final boolean g() {
        return this.f267c;
    }

    public final boolean h() {
        return this.f269e;
    }

    public final boolean i() {
        return this.f268d;
    }

    public final boolean j() {
        return this.f265a instanceof c.b;
    }

    @NotNull
    public final String toString() {
        String c11 = f.c(this.f266b);
        StringBuilder sb2 = new StringBuilder("ScrollEvent(resolver=");
        sb2.append(this.f265a);
        sb2.append(", offset=");
        sb2.append(c11);
        sb2.append(", smooth=");
        sb2.append(this.f267c);
        sb2.append(", withToolbarHeight=");
        sb2.append(this.f268d);
        sb2.append(", maxSearchPages=");
        sb2.append(this.f270f);
        sb2.append(", withSnapshot=");
        return Pk0.a.a(")", sb2, this.f269e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f265a, i11);
        f.e(this.f266b, dest);
        dest.writeInt(this.f267c ? 1 : 0);
        dest.writeInt(this.f268d ? 1 : 0);
        dest.writeInt(this.f269e ? 1 : 0);
        dest.writeInt(this.f270f);
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private c f271a;

        /* renamed from: b, reason: collision with root package name */
        private int f272b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f273c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f274d;

        /* renamed from: e, reason: collision with root package name */
        private int f275e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f276f;

        public a() {
            this.f272b = LinearLayoutManager.INVALID_OFFSET;
            this.f275e = 4;
        }

        public static void f(a aVar, boolean z11) {
            aVar.f273c = z11;
            aVar.f274d = z11;
        }

        @NotNull
        public final void a(@NotNull Function1 predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            this.f271a = c.a.a(predicate);
        }

        @NotNull
        public final e b() {
            c cVar = this.f271a;
            if (cVar != null) {
                return new e(cVar, this.f272b, this.f273c, this.f274d, this.f276f, this.f275e);
            }
            throw new IllegalArgumentException("set position resolver");
        }

        @NotNull
        public final void c(int i11) {
            this.f275e = i11;
        }

        @NotNull
        public final void d(int i11) {
            this.f272b = i11;
        }

        @NotNull
        public final void e(boolean z11, boolean z12) {
            this.f273c = z11;
            this.f274d = z12;
        }

        @NotNull
        public final void g(int i11) {
            this.f271a = c.b.a(i11);
        }

        @NotNull
        public final void h() {
            this.f276f = true;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull e event) {
            this();
            Intrinsics.checkNotNullParameter(event, "event");
            this.f271a = event.f();
            int e11 = event.e();
            this.f272b = f.b(e11) ? e11 : 0;
            this.f273c = event.g();
            this.f274d = event.i();
            this.f275e = event.d();
            this.f276f = event.h();
        }
    }
}
