package D00;

import C.o0;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5205a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f5206b;

    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(b.CREATOR, parcel, arrayList, i11, 1);
            }
            return new g(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i11) {
            return new g[i11];
        }
    }

    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f5207a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f5208b;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(@NotNull String widgetName, @NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(widgetName, "widgetName");
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.f5207a = widgetName;
            this.f5208b = errorMessage;
        }

        @NotNull
        public final String a() {
            return this.f5208b;
        }

        @NotNull
        public final String b() {
            return this.f5207a;
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
            return Intrinsics.d(this.f5207a, bVar.f5207a) && Intrinsics.d(this.f5208b, bVar.f5208b);
        }

        public final int hashCode() {
            return this.f5208b.hashCode() + (this.f5207a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MappedIncident(widgetName=");
            sb2.append(this.f5207a);
            sb2.append(", errorMessage=");
            return o0.c(sb2, this.f5208b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f5207a);
            dest.writeString(this.f5208b);
        }
    }

    public g(@NotNull String message, @NotNull ArrayList list) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f5205a = message;
        this.f5206b = list;
    }

    @NotNull
    public final List<b> a() {
        return this.f5206b;
    }

    @NotNull
    public final String b() {
        return this.f5205a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f5205a, gVar.f5205a) && this.f5206b.equals(gVar.f5206b);
    }

    public final int hashCode() {
        return this.f5206b.hashCode() + (this.f5205a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MappedIncidentList(message=");
        sb2.append(this.f5205a);
        sb2.append(", list=");
        return Om.a(")", sb2, this.f5206b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f5205a);
        ArrayList arrayList = this.f5206b;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).writeToParcel(dest, i11);
        }
    }
}
