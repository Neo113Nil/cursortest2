package t3;

import android.os.Parcel;
import com.google.android.gms.internal.ads.D5;
import s3.BinderC2361b;
import s3.InterfaceC2360a;
import x3.AbstractC2644a;

/* renamed from: t3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2429h extends D5 {
    public final InterfaceC2360a Q1(BinderC2361b binderC2361b, String str, int i, BinderC2361b binderC2361b2) {
        Parcel N5 = N();
        AbstractC2644a.c(N5, binderC2361b);
        N5.writeString(str);
        N5.writeInt(i);
        AbstractC2644a.c(N5, binderC2361b2);
        return L1.a.q(L(N5, 3));
    }

    public final InterfaceC2360a t1(BinderC2361b binderC2361b, String str, int i, BinderC2361b binderC2361b2) {
        Parcel N5 = N();
        AbstractC2644a.c(N5, binderC2361b);
        N5.writeString(str);
        N5.writeInt(i);
        AbstractC2644a.c(N5, binderC2361b2);
        return L1.a.q(L(N5, 2));
    }
}
