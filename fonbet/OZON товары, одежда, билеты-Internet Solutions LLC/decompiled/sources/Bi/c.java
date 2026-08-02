package Bi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Hi.k> f3806a;

    /* renamed from: b, reason: collision with root package name */
    private final Hi.a f3807b;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(c.class, parcel, arrayList, i11, 1);
            }
            return new c(arrayList, (Hi.a) parcel.readParcelable(c.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull List<? extends Hi.k> media, Hi.a aVar) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f3806a = media;
        this.f3807b = aVar;
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
        return Intrinsics.d(this.f3806a, cVar.f3806a) && Intrinsics.d(this.f3807b, cVar.f3807b);
    }

    public final int hashCode() {
        int hashCode = this.f3806a.hashCode() * 31;
        Hi.a aVar = this.f3807b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CameraLaunchResultInternal(media=" + this.f3806a + ", restorableState=" + this.f3807b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.f3806a, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), i11);
        }
        dest.writeParcelable(this.f3807b, i11);
    }

    public c() {
        this(K.f71697a, null);
    }
}
