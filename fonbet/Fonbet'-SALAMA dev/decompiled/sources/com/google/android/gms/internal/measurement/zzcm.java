package com.google.android.gms.internal.measurement;

import Q0.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = a.a0(parcel);
        long j = 0;
        long j3 = 0;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = a.P(readInt, parcel);
                    break;
                case 2:
                    j3 = a.P(readInt, parcel);
                    break;
                case 3:
                    z4 = a.K(readInt, parcel);
                    break;
                case 4:
                    str = a.n(readInt, parcel);
                    break;
                case 5:
                    str2 = a.n(readInt, parcel);
                    break;
                case 6:
                    str3 = a.n(readInt, parcel);
                    break;
                case 7:
                    bundle = a.j(readInt, parcel);
                    break;
                case '\b':
                    str4 = a.n(readInt, parcel);
                    break;
                default:
                    a.X(readInt, parcel);
                    break;
            }
        }
        a.y(a02, parcel);
        return new zzcl(j, j3, z4, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzcl[i7];
    }
}
