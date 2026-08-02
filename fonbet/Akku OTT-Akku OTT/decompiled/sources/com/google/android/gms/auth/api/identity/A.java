package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.C0810d;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        ArrayList arrayList2 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 4:
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    break;
                case 6:
                    arrayList = com.google.android.gms.common.internal.safeparcel.b.i(parcel, readInt);
                    break;
                case 7:
                    z4 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case '\b':
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, C0812f.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new C0810d.a(z2, str, str2, z3, str3, arrayList, z4, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0810d.a[i];
    }
}
