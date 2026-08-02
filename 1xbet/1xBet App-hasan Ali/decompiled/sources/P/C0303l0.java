package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303l0 implements Parcelable.ClassLoaderCreator {
    public static C0305m0 a(Parcel parcel, ClassLoader classLoader) {
        Z z3;
        if (classLoader == null) {
            classLoader = C0303l0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            z3 = Z.f4431m;
        } else if (readInt == 1) {
            z3 = Z.f4434p;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(L1.a.l(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            z3 = Z.f4432n;
        }
        return new C0305m0(readValue, z3);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0305m0[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
