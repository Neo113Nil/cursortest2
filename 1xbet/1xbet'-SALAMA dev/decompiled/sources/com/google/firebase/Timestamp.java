package com.google.firebase;

import Y3.b;
import Y3.n;
import Y3.o;
import Y3.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.protocol.Request;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import p044f6.d;
import p113p3.f;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11829b;

    public Timestamp(long j, int i7) {
        b.a(i7, j);
        this.f11828a = j;
        this.f11829b = i7;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Timestamp timestamp) {
        h.e(timestamp, Request.JsonKeys.OTHER);
        Function1[] function1Arr = {o.f7679y, p.f7680y};
        for (int i7 = 0; i7 < 2; i7++) {
            Function1 function1 = function1Arr[i7];
            int iT = f.t((Comparable) function1.invoke(this), (Comparable) function1.invoke(timestamp));
            if (iT != 0) {
                return iT;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0);
    }

    public final int hashCode() {
        long j = this.f11828a;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.f11829b;
    }

    public final String toString() {
        return "Timestamp(seconds=" + this.f11828a + ", nanoseconds=" + this.f11829b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        h.e(parcel, "dest");
        parcel.writeLong(this.f11828a);
        parcel.writeInt(this.f11829b);
    }

    public Timestamp(Date date) {
        d dVar;
        h.e(date, "date");
        long time = date.getTime();
        long j = zzbbd.zzq.zzf;
        long j3 = time / j;
        int time2 = (int) ((date.getTime() % j) * ((long) 1000000));
        if (time2 < 0) {
            dVar = new d(Long.valueOf(j3 - 1), Integer.valueOf(time2 + 1000000000));
        } else {
            dVar = new d(Long.valueOf(j3), Integer.valueOf(time2));
        }
        long jLongValue = ((Number) dVar.f13006a).longValue();
        int iIntValue = ((Number) dVar.f13007b).intValue();
        b.a(iIntValue, jLongValue);
        this.f11828a = jLongValue;
        this.f11829b = iIntValue;
    }
}
