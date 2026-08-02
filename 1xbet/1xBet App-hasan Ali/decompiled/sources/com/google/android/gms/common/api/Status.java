package com.google.android.gms.common.api;

import C2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.C1639u7;
import j3.b;
import java.util.Arrays;
import k4.AbstractC2036a;
import m3.v;
import n.AbstractC2107A;
import n3.AbstractC2187a;
import v3.g;

/* loaded from: classes.dex */
public final class Status extends AbstractC2187a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new a(20);

    /* renamed from: k, reason: collision with root package name */
    public final int f7483k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7484l;

    /* renamed from: m, reason: collision with root package name */
    public final PendingIntent f7485m;

    /* renamed from: n, reason: collision with root package name */
    public final b f7486n;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.f7483k = i;
        this.f7484l = str;
        this.f7485m = pendingIntent;
        this.f7486n = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7483k == status.f7483k && v.g(this.f7484l, status.f7484l) && v.g(this.f7485m, status.f7485m) && v.g(this.f7486n, status.f7486n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7483k), this.f7484l, this.f7485m, this.f7486n});
    }

    public final String toString() {
        g gVar = new g(this);
        String str = this.f7484l;
        if (str == null) {
            int i = this.f7483k;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = AbstractC2107A.q("unknown status code: ", i);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case C1639u7.zzm /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        gVar.s("statusCode", str);
        gVar.s("resolution", this.f7485m);
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f7483k);
        AbstractC2036a.f0(parcel, 2, this.f7484l);
        AbstractC2036a.e0(parcel, 3, this.f7485m, i);
        AbstractC2036a.e0(parcel, 4, this.f7486n, i);
        AbstractC2036a.m0(parcel, k02);
    }
}
