package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.g(parcel, readInt);
                    break;
                case 2:
                    j = b.v(parcel, readInt);
                    break;
                case 3:
                    b.B(parcel, readInt, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = b.o(parcel, readInt);
                    break;
                case 5:
                    d2 = b.o(parcel, readInt);
                    break;
                case 6:
                    f = b.q(parcel, readInt);
                    break;
                case 7:
                    i = b.t(parcel, readInt);
                    break;
                case '\b':
                    i2 = b.t(parcel, readInt);
                    break;
                case '\t':
                    i3 = b.t(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzbe(str, i, s, d, d2, f, j, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i) {
        return new zzbe[i];
    }
}
