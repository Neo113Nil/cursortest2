package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import h0.a;
import h0.b;
import h0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f4301a;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f4301a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f4302b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5764e);
        }
        remoteActionCompat.f4302b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4303c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5764e);
        }
        remoteActionCompat.f4303c = charSequence2;
        remoteActionCompat.f4304d = (PendingIntent) aVar.f(remoteActionCompat.f4304d, 4);
        boolean z = remoteActionCompat.f4305e;
        if (aVar.e(5)) {
            z = ((b) aVar).f5764e.readInt() != 0;
        }
        remoteActionCompat.f4305e = z;
        boolean z5 = remoteActionCompat.f4306f;
        if (aVar.e(6)) {
            z5 = ((b) aVar).f5764e.readInt() != 0;
        }
        remoteActionCompat.f4306f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4301a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4302b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f5764e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4303c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4304d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f4305e;
        aVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z5 = remoteActionCompat.f4306f;
        aVar.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
