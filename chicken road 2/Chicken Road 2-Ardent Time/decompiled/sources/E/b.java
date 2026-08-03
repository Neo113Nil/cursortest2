package E;

/* loaded from: classes.dex */
public final class b implements android.os.Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256a;

    public /* synthetic */ b(int i2) {
        this.f256a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        switch (this.f256a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return E.c.f257b;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case 1:
                return new P.D(parcel, classLoader);
            case 2:
                return new h.a0(parcel, classLoader);
            default:
                return new h.m0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i2) {
        switch (this.f256a) {
            case 0:
                return new E.c[i2];
            case 1:
                return new P.D[i2];
            case 2:
                return new h.a0[i2];
            default:
                return new h.m0[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f256a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return E.c.f257b;
                }
                throw new java.lang.IllegalStateException("superState must be null");
            case 1:
                return new P.D(parcel, null);
            case 2:
                return new h.a0(parcel, null);
            default:
                return new h.m0(parcel, null);
        }
    }
}
