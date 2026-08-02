package androidx.core.app;

import Q0.b;
import Q0.c;
import Q0.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f9049a;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        remoteActionCompat.f9049a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f9050b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f5751e);
        }
        remoteActionCompat.f9050b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f9051c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f5751e);
        }
        remoteActionCompat.f9051c = charSequence2;
        remoteActionCompat.f9052d = (PendingIntent) bVar.g(remoteActionCompat.f9052d, 4);
        boolean z4 = remoteActionCompat.f9053e;
        if (bVar.e(5)) {
            z4 = ((c) bVar).f5751e.readInt() != 0;
        }
        remoteActionCompat.f9053e = z4;
        boolean z7 = remoteActionCompat.f9054f;
        if (bVar.e(6)) {
            z7 = ((c) bVar).f5751e.readInt() != 0;
        }
        remoteActionCompat.f9054f = z7;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f9049a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f9050b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f5751e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f9051c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f9052d, 4);
        boolean z4 = remoteActionCompat.f9053e;
        bVar.i(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z7 = remoteActionCompat.f9054f;
        bVar.i(6);
        parcel.writeInt(z7 ? 1 : 0);
    }
}
