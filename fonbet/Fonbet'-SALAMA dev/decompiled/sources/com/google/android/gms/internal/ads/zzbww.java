package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbww implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z4 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 3:
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case 4:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 5:
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case 6:
                    arrayList = Q0.a.p(readInt, parcel);
                    break;
                case 7:
                    z8 = Q0.a.K(readInt, parcel);
                    break;
                case '\b':
                    z9 = Q0.a.K(readInt, parcel);
                    break;
                case '\t':
                    arrayList2 = Q0.a.p(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new zzbwv(str, str2, z4, z7, arrayList, z8, z9, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbwv[i7];
    }
}
