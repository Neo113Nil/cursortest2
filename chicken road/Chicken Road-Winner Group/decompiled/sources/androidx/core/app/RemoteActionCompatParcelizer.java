package androidx.core.app;

import Z.a;
import Z.b;
import Z.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f2103a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f2103a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f2104b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1764e);
        }
        remoteActionCompat.f2104b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2105c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1764e);
        }
        remoteActionCompat.f2105c = charSequence2;
        remoteActionCompat.f2106d = (PendingIntent) aVar.f(remoteActionCompat.f2106d, 4);
        boolean z4 = remoteActionCompat.f2107e;
        if (aVar.e(5)) {
            z4 = ((b) aVar).f1764e.readInt() != 0;
        }
        remoteActionCompat.f2107e = z4;
        boolean z5 = remoteActionCompat.f;
        if (!aVar.e(6)) {
            z3 = z5;
        } else if (((b) aVar).f1764e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2103a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2104b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f1764e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2105c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2106d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f2107e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f;
        aVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
