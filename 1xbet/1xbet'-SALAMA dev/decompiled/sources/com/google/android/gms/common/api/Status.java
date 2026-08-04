package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements s, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f11084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConnectionResult f11085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f11077e = new Status(0, null, null, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f11078f = new Status(14, null, null, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Status f11079x = new Status(8, null, null, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Status f11080y = new Status(15, null, null, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Status f11081z = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new Z2.a(24);

    public Status(int i7, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f11082a = i7;
        this.f11083b = str;
        this.f11084c = pendingIntent;
        this.f11085d = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11082a == status.f11082a && D.m(this.f11083b, status.f11083b) && D.m(this.f11084c, status.f11084c) && D.m(this.f11085d, status.f11085d);
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11082a), this.f11083b, this.f11084c, this.f11085d});
    }

    public final boolean j() {
        return this.f11082a <= 0;
    }

    public final String toString() {
        V0 v6 = new V0(this);
        String strC = this.f11083b;
        if (strC == null) {
            strC = Q0.a.C(this.f11082a);
        }
        v6.j(strC, "statusCode");
        v6.j(this.f11084c, "resolution");
        return v6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11082a);
        Y4.D.s0(parcel, 2, this.f11083b, false);
        Y4.D.r0(parcel, 3, this.f11084c, i7, false);
        Y4.D.r0(parcel, 4, this.f11085d, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
