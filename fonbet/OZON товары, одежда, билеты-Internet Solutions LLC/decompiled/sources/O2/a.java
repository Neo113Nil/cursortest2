package O2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable f19868a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f19867b = new C0394a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: O2.a$a, reason: collision with other inner class name */
    final class C0394a extends a {
    }

    a() {
        this.f19868a = null;
    }

    public final Parcelable a() {
        return this.f19868a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f19868a, i11);
    }

    final class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f19867b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new a[i11];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f19867b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    protected a(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.f19868a = parcelable == f19867b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(@NonNull Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f19868a = readParcelable == null ? f19867b : readParcelable;
    }
}
