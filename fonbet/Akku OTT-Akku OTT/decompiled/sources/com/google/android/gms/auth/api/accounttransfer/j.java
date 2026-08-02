package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.b.c(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    aVar = (a) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, a.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == z) {
            return new i(hashSet, i, str, i2, bArr, pendingIntent, aVar);
        }
        throw new b.a(android.support.v4.media.a.a(z, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}
