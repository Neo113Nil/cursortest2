package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.session.MediaSessionService;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import kotlin.time.DurationKt;

/* loaded from: classes4.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new z();
    public int a = 102;
    public long b = DurationKt.MILLIS_IN_HOUR;
    public long c = MediaSessionService.DEFAULT_FOREGROUND_SERVICE_TIMEOUT_MS;
    public boolean d = false;
    public long e = Long.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public float i = 0.0f;
    public long j = 0;
    public boolean k = false;

    @Deprecated
    public LocationRequest() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.a != locationRequest.a) {
            return false;
        }
        long j = this.b;
        long j2 = locationRequest.b;
        if (j != j2 || this.c != locationRequest.c || this.d != locationRequest.d || this.e != locationRequest.e || this.f != locationRequest.f || this.i != locationRequest.i) {
            return false;
        }
        long j3 = this.j;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = locationRequest.j;
        if (j4 >= j2) {
            j2 = j4;
        }
        return j == j2 && this.k == locationRequest.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.i), Long.valueOf(this.j)});
    }

    @NonNull
    public final String toString() {
        int i = this.f;
        float f = this.i;
        long j = this.j;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder("Request[");
        int i2 = this.a;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i2 != 105) {
            sb.append(" requested=");
            sb.append(j2);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (j > j2) {
            sb.append(" maxWait=");
            sb.append(j);
            sb.append("ms");
        }
        if (f > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f);
            sb.append(CmcdData.OBJECT_TYPE_MANIFEST);
        }
        long j3 = this.e;
        if (j3 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j3 - elapsedRealtime);
            sb.append("ms");
        }
        if (i != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        int i2 = this.a;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.b;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 8);
        parcel.writeLong(j2);
        boolean z = this.d;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        long j3 = this.e;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 8);
        parcel.writeLong(j3);
        int i3 = this.f;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 6, 4);
        parcel.writeInt(i3);
        float f = this.i;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 7, 4);
        parcel.writeFloat(f);
        long j4 = this.j;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 8, 8);
        parcel.writeLong(j4);
        boolean z2 = this.k;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
