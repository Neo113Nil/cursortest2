package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.session.MediaSessionService;
import kotlin.time.DurationKt;

/* loaded from: classes4.dex */
public final class z implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final LocationRequest createFromParcel(Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        int i = 102;
        long j = DurationKt.MILLIS_IN_HOUR;
        long j2 = MediaSessionService.DEFAULT_FOREGROUND_SERVICE_TIMEOUT_MS;
        boolean z2 = false;
        long j3 = 0;
        float f = 0.0f;
        int i2 = Integer.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        boolean z3 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            boolean z4 = z3;
            switch ((char) readInt) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 2:
                    j = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
                    break;
                case 3:
                    j2 = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
                    break;
                case 4:
                    z2 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    break;
                case 5:
                    j4 = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
                    break;
                case 6:
                    i2 = com.google.android.gms.common.internal.safeparcel.b.t(parcel, readInt);
                    break;
                case 7:
                    f = com.google.android.gms.common.internal.safeparcel.b.q(parcel, readInt);
                    break;
                case '\b':
                    j3 = com.google.android.gms.common.internal.safeparcel.b.v(parcel, readInt);
                    break;
                case '\t':
                    z3 = com.google.android.gms.common.internal.safeparcel.b.m(parcel, readInt);
                    continue;
                default:
                    com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
                    break;
            }
            z3 = z4;
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.a = i;
        locationRequest.b = j;
        locationRequest.c = j2;
        locationRequest.d = z2;
        locationRequest.e = j4;
        locationRequest.f = i2;
        locationRequest.i = f;
        locationRequest.j = j3;
        locationRequest.k = z3;
        return locationRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
