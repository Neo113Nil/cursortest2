package Z;

import android.os.Parcel;
import android.os.Parcelable;
import n.A0;
import u1.AbstractC2482b;

/* loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6217a;

    public /* synthetic */ o(int i) {
        this.f6217a = i;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new p();
        }
        T.f g5 = T.i.f5597l.g();
        for (int i = 0; i < readInt; i++) {
            g5.add(parcel.readValue(classLoader));
        }
        return new p(g5.e());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6217a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new A0(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2482b.f19982l;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f6217a) {
            case 0:
                return new p[i];
            case 1:
                return new A0[i];
            default:
                return new AbstractC2482b[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f6217a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new A0(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2482b.f19982l;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
