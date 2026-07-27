package P0;

import S0.r;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.C0644l9;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends T0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1121a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1122b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f1123c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1124d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1120e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new H.j(3);

    public b(int i3, int i4, PendingIntent pendingIntent, String str) {
        this.f1121a = i3;
        this.f1122b = i4;
        this.f1123c = pendingIntent;
        this.f1124d = str;
    }

    public static String a(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
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
                switch (i3) {
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
                    case C0644l9.f7759C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C0644l9.f7760D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case C0644l9.f7761E /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return B0.c.i(i3, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1122b == bVar.f1122b && r.e(this.f1123c, bVar.f1123c) && r.e(this.f1124d, bVar.f1124d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1122b), this.f1123c, this.f1124d});
    }

    public final String toString() {
        a1.e eVar = new a1.e(this);
        eVar.u(a(this.f1122b), "statusCode");
        eVar.u(this.f1123c, "resolution");
        eVar.u(this.f1124d, "message");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f1121a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f1122b);
        F2.b.M(parcel, 3, this.f1123c, i3);
        F2.b.N(parcel, 4, this.f1124d);
        F2.b.R(parcel, Q2);
    }

    public b(int i3) {
        this(1, i3, null, null);
    }

    public b(int i3, PendingIntent pendingIntent) {
        this(1, i3, pendingIntent, null);
    }
}
