package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1047a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8519a = 0;

    static {
        z0.AbstractC1047a.class.getClassLoader();
    }

    public static android.os.Parcelable a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new android.os.BadParcelableException(B1.a.f(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
