package Em0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class e implements Bm0.a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Bm0.a f8140a;

    static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public e(@NonNull Bm0.a aVar) {
        this.f8140a = aVar;
    }

    @Override // Bm0.a
    public final int W() {
        Bm0.a aVar = this.f8140a;
        if (aVar == null) {
            return -1;
        }
        return aVar.W();
    }

    @Override // Bm0.a
    public final int Z(int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // Bm0.a
    @NonNull
    public final String c1() {
        Bm0.a aVar = this.f8140a;
        return aVar == null ? "" : aVar.c1();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // Bm0.a
    public final int getSize() {
        Bm0.a aVar = this.f8140a;
        if (aVar == null) {
            return 0;
        }
        return aVar.getSize();
    }

    @Override // java.lang.Iterable
    public final Iterator<Dm0.b> iterator() {
        Bm0.a aVar = this.f8140a;
        if (aVar == null) {
            return null;
        }
        return aVar.iterator();
    }

    public final String toString() {
        Bm0.a aVar = this.f8140a;
        return aVar == null ? "" : aVar.toString();
    }

    @Override // Bm0.a
    public final int u1(int i11, CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override // Bm0.a
    public final int v1(int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f8140a, i11);
    }

    protected e(Parcel parcel) {
        this.f8140a = (Bm0.a) parcel.readParcelable(Bm0.a.class.getClassLoader());
    }
}
