package androidx.core.app;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(U.a aVar) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        U.c cVar = remoteActionCompat.f2167a;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f2167a = (androidx.core.graphics.drawable.IconCompat) cVar;
        java.lang.CharSequence charSequence = remoteActionCompat.f2168b;
        if (aVar.e(2)) {
            charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((U.b) aVar).f1721e);
        }
        remoteActionCompat.f2168b = charSequence;
        java.lang.CharSequence charSequence2 = remoteActionCompat.f2169c;
        if (aVar.e(3)) {
            charSequence2 = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((U.b) aVar).f1721e);
        }
        remoteActionCompat.f2169c = charSequence2;
        remoteActionCompat.f2170d = (android.app.PendingIntent) aVar.f(remoteActionCompat.f2170d, 4);
        boolean z2 = remoteActionCompat.f2171e;
        if (aVar.e(5)) {
            z2 = ((U.b) aVar).f1721e.readInt() != 0;
        }
        remoteActionCompat.f2171e = z2;
        boolean z3 = remoteActionCompat.f2172f;
        if (aVar.e(6)) {
            z3 = ((U.b) aVar).f1721e.readInt() != 0;
        }
        remoteActionCompat.f2172f = z3;
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, U.a aVar) {
        aVar.getClass();
        androidx.core.graphics.drawable.IconCompat iconCompat = remoteActionCompat.f2167a;
        aVar.h(1);
        aVar.i(iconCompat);
        java.lang.CharSequence charSequence = remoteActionCompat.f2168b;
        aVar.h(2);
        android.os.Parcel parcel = ((U.b) aVar).f1721e;
        android.text.TextUtils.writeToParcel(charSequence, parcel, 0);
        java.lang.CharSequence charSequence2 = remoteActionCompat.f2169c;
        aVar.h(3);
        android.text.TextUtils.writeToParcel(charSequence2, parcel, 0);
        android.app.PendingIntent pendingIntent = remoteActionCompat.f2170d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f2171e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f2172f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
