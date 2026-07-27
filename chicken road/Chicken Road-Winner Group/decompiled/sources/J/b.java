package J;

import U.C;
import android.os.Parcel;
import android.os.Parcelable;
import l.c0;
import l.o0;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f692a;

    public /* synthetic */ b(int i3) {
        this.f692a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f692a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f693b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C(parcel, classLoader);
            case 2:
                return new c0(parcel, classLoader);
            default:
                return new o0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f692a) {
            case 0:
                return new c[i3];
            case 1:
                return new C[i3];
            case 2:
                return new c0[i3];
            default:
                return new o0[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f692a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f693b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C(parcel, null);
            case 2:
                return new c0(parcel, null);
            default:
                return new o0(parcel, null);
        }
    }
}
