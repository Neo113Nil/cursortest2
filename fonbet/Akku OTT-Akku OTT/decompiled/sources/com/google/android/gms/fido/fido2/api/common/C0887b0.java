package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.fido.fido2.api.common.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0887b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        E e = null;
        String str2 = null;
        C0890d c0890d = null;
        Long l = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                    break;
                case 3:
                    d = com.google.android.gms.common.internal.safeparcel.b.p(parcel, readInt);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 5:
                    arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, C0917v.CREATOR);
                    break;
                case 6:
                    num = com.google.android.gms.common.internal.safeparcel.b.u(parcel, readInt);
                    break;
                case 7:
                    e = (E) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, E.CREATOR);
                    break;
                case '\b':
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\t':
                    c0890d = (C0890d) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0890d.CREATOR);
                    break;
                case '\n':
                    l = com.google.android.gms.common.internal.safeparcel.b.w(parcel, readInt);
                    break;
                case 11:
                    str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\f':
                    resultReceiver = (ResultReceiver) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, ResultReceiver.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0919x(bArr, d, str, arrayList, num, e, str2, c0890d, l, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0919x[i];
    }
}
