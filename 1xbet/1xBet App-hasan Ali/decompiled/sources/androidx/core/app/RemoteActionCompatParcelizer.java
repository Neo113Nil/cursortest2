package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c2.AbstractC0536a;
import c2.C0537b;
import c2.InterfaceC0538c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0536a abstractC0536a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0538c interfaceC0538c = remoteActionCompat.f6952a;
        boolean z3 = true;
        if (abstractC0536a.e(1)) {
            interfaceC0538c = abstractC0536a.g();
        }
        remoteActionCompat.f6952a = (IconCompat) interfaceC0538c;
        CharSequence charSequence = remoteActionCompat.f6953b;
        if (abstractC0536a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0537b) abstractC0536a).f7401e);
        }
        remoteActionCompat.f6953b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6954c;
        if (abstractC0536a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0537b) abstractC0536a).f7401e);
        }
        remoteActionCompat.f6954c = charSequence2;
        remoteActionCompat.f6955d = (PendingIntent) abstractC0536a.f(remoteActionCompat.f6955d, 4);
        boolean z5 = remoteActionCompat.f6956e;
        if (abstractC0536a.e(5)) {
            z5 = ((C0537b) abstractC0536a).f7401e.readInt() != 0;
        }
        remoteActionCompat.f6956e = z5;
        boolean z6 = remoteActionCompat.f;
        if (!abstractC0536a.e(6)) {
            z3 = z6;
        } else if (((C0537b) abstractC0536a).f7401e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0536a abstractC0536a) {
        abstractC0536a.getClass();
        IconCompat iconCompat = remoteActionCompat.f6952a;
        abstractC0536a.h(1);
        abstractC0536a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6953b;
        abstractC0536a.h(2);
        Parcel parcel = ((C0537b) abstractC0536a).f7401e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6954c;
        abstractC0536a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6955d;
        abstractC0536a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f6956e;
        abstractC0536a.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z5 = remoteActionCompat.f;
        abstractC0536a.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
