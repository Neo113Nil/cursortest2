package com.google.android.gms.common.api;

import B0.c;
import H.j;
import P0.b;
import S0.r;
import T0.a;
import a1.e;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import io.appmetrica.analytics.impl.C0644l9;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new j(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f2567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2568b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f2569c;

    /* renamed from: d, reason: collision with root package name */
    public final b f2570d;

    public Status(int i3, String str, PendingIntent pendingIntent, b bVar) {
        this.f2567a = i3;
        this.f2568b = str;
        this.f2569c = pendingIntent;
        this.f2570d = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2567a == status.f2567a && r.e(this.f2568b, status.f2568b) && r.e(this.f2569c, status.f2569c) && r.e(this.f2570d, status.f2570d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2567a), this.f2568b, this.f2569c, this.f2570d});
    }

    public final String toString() {
        e eVar = new e(this);
        String str = this.f2568b;
        if (str == null) {
            int i3 = this.f2567a;
            switch (i3) {
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
                    str = c.h(i3, "unknown status code: ");
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
                case C0644l9.f7759C /* 19 */:
                    str = "REMOTE_EXCEPTION";
                    break;
                case C0644l9.f7760D /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case C0644l9.f7761E /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        eVar.u(str, "statusCode");
        eVar.u(this.f2569c, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f2567a);
        F2.b.N(parcel, 2, this.f2568b);
        F2.b.M(parcel, 3, this.f2569c, i3);
        F2.b.M(parcel, 4, this.f2570d, i3);
        F2.b.R(parcel, Q2);
    }
}
