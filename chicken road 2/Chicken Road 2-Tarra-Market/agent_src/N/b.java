package N;

import Q.s;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.C0370l9;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends R.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f231b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f232c;

    /* renamed from: d, reason: collision with root package name */
    public final String f233d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f229e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new K.c(2);

    public b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f230a = i2;
        this.f231b = i3;
        this.f232c = pendingIntent;
        this.f233d = str;
    }

    public static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
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
                switch (i2) {
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
                    case C0370l9.f4317C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C0370l9.f4318D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case C0370l9.f4319E /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i2 + ")";
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
        return this.f231b == bVar.f231b && s.e(this.f232c, bVar.f232c) && s.e(this.f233d, bVar.f233d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f231b), this.f232c, this.f233d});
    }

    public final String toString() {
        Y.e eVar = new Y.e(this);
        eVar.m(a(this.f231b), "statusCode");
        eVar.m(this.f232c, "resolution");
        eVar.m(this.f233d, "message");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f230a);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f231b);
        V.a.H(parcel, 3, this.f232c, i2);
        V.a.I(parcel, 4, this.f233d);
        V.a.M(parcel, L);
    }

    public b(int i2) {
        this(1, i2, null, null);
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, null);
    }
}
