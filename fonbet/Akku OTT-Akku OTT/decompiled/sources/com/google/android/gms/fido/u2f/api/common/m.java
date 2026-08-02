package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        Integer num = null;
        Double d = null;
        Uri uri = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        a aVar = null;
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    num = com.google.android.gms.common.internal.safeparcel.b.u(parcel, readInt);
                    break;
                case 3:
                    d = com.google.android.gms.common.internal.safeparcel.b.p(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, e.CREATOR);
                    break;
                case 7:
                    aVar = (a) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, a.CREATOR);
                    break;
                case '\b':
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new SignRequestParams(num, d, uri, bArr, arrayList, aVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }
}
