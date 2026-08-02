package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        boolean z4 = false;
        int i7 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j = 0;
        long j3 = 0;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 3:
                    j = Q0.a.P(readInt, parcel);
                    break;
                case 4:
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case 5:
                    str3 = Q0.a.n(readInt, parcel);
                    break;
                case 6:
                    str4 = Q0.a.n(readInt, parcel);
                    break;
                case 7:
                    bundle = Q0.a.j(readInt, parcel);
                    break;
                case '\b':
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case '\t':
                    j3 = Q0.a.P(readInt, parcel);
                    break;
                case '\n':
                    str5 = Q0.a.n(readInt, parcel);
                    break;
                case 11:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbai(str, j, str2, str3, str4, bundle, z4, j3, str5, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbai[i7];
    }
}
