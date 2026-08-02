package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        int i = 1;
        zzba zzbaVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = b.t(parcel, readInt);
                    break;
                case 2:
                    zzbaVar = (zzba) b.f(parcel, readInt, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = b.s(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.f(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.s(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = b.s(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzbc(i, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i) {
        return new zzbc[i];
    }
}
