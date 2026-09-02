package a0;

import C0.g;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0011b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f548a = 0;

    static {
        AbstractC0011b.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(g.g(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
