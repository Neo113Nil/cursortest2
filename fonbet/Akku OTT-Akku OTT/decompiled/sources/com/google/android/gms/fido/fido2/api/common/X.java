package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        C0920y c0920y = null;
        A a = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        C0904k c0904k = null;
        Integer num = null;
        E e = null;
        String str = null;
        C0890d c0890d = null;
        String str2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    c0920y = (C0920y) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0920y.CREATOR);
                    break;
                case 3:
                    a = (A) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, A.CREATOR);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                    break;
                case 5:
                    arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, C0918w.CREATOR);
                    break;
                case 6:
                    d = com.google.android.gms.common.internal.safeparcel.b.p(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, C0917v.CREATOR);
                    break;
                case '\b':
                    c0904k = (C0904k) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0904k.CREATOR);
                    break;
                case '\t':
                    num = com.google.android.gms.common.internal.safeparcel.b.u(parcel, readInt);
                    break;
                case '\n':
                    e = (E) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, E.CREATOR);
                    break;
                case 11:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\f':
                    c0890d = (C0890d) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0890d.CREATOR);
                    break;
                case '\r':
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, ResultReceiver.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0916u(c0920y, a, bArr, arrayList, d, arrayList2, c0904k, num, e, str, c0890d, str2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0916u[i];
    }
}
