package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.C0915t;

/* loaded from: classes4.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        C0915t c0915t = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 3:
                    str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 4:
                    str4 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\b':
                    str7 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case '\t':
                    c0915t = (C0915t) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, C0915t.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new o(str, str2, str3, str4, uri, str5, str6, str7, c0915t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new o[i];
    }
}
