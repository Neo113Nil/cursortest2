package w3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2552a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20529a = 0;

    static {
        AbstractC2552a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
