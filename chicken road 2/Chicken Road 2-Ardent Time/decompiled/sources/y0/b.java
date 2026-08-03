package y0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8482a = 0;

    static {
        y0.b.class.getClassLoader();
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
