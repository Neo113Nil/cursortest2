package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.jh1;
import p000.kh1;
import p000.lh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jh1 jh1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        lh1 lh1VarM2866h = remoteActionCompat.f481a;
        boolean z = true;
        if (jh1Var.mo2863e(1)) {
            lh1VarM2866h = jh1Var.m2866h();
        }
        remoteActionCompat.f481a = (IconCompat) lh1VarM2866h;
        CharSequence charSequence = remoteActionCompat.f482b;
        if (jh1Var.mo2863e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kh1) jh1Var).f4376e);
        }
        remoteActionCompat.f482b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f483c;
        if (jh1Var.mo2863e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kh1) jh1Var).f4376e);
        }
        remoteActionCompat.f483c = charSequence2;
        remoteActionCompat.f484d = (PendingIntent) jh1Var.m2865g(remoteActionCompat.f484d, 4);
        boolean z2 = remoteActionCompat.f485e;
        if (jh1Var.mo2863e(5)) {
            z2 = ((kh1) jh1Var).f4376e.readInt() != 0;
        }
        remoteActionCompat.f485e = z2;
        boolean z3 = remoteActionCompat.f486f;
        if (!jh1Var.mo2863e(6)) {
            z = z3;
        } else if (((kh1) jh1Var).f4376e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f486f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, jh1 jh1Var) {
        jh1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f481a;
        jh1Var.mo2867i(1);
        jh1Var.m2869k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f482b;
        jh1Var.mo2867i(2);
        Parcel parcel = ((kh1) jh1Var).f4376e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f483c;
        jh1Var.mo2867i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f484d;
        jh1Var.mo2867i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f485e;
        jh1Var.mo2867i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f486f;
        jh1Var.mo2867i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
