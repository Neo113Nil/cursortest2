package y3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2665a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21220a = 0;

    static {
        AbstractC2665a.class.getClassLoader();
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
