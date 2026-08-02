package com.google.android.gms.common;

import W5.AbstractC0486a1;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Arrays;
import w1.V0;

/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f11060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11061b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f11062c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11063d;

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionResult f11059e = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new E(4);

    public ConnectionResult(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f11060a = i7;
        this.f11061b = i8;
        this.f11062c = pendingIntent;
        this.f11063d = str;
    }

    public static String j(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case zzbbd.zzt.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return AbstractC0486a1.f(i7, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f11061b == connectionResult.f11061b && D.m(this.f11062c, connectionResult.f11062c) && D.m(this.f11063d, connectionResult.f11063d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11061b), this.f11062c, this.f11063d});
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(j(this.f11061b), "statusCode");
        v02.j(this.f11062c, "resolution");
        v02.j(this.f11063d, "message");
        return v02.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11060a);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11061b);
        Y4.D.r0(parcel, 3, this.f11062c, i7, false);
        Y4.D.s0(parcel, 4, this.f11063d, false);
        Y4.D.z0(x02, parcel);
    }

    public ConnectionResult(int i7) {
        this(1, i7, null, null);
    }

    public ConnectionResult(int i7, PendingIntent pendingIntent) {
        this(1, i7, pendingIntent, null);
    }
}
