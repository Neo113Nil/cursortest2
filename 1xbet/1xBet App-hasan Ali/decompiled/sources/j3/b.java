package j3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.C1639u7;
import java.util.Arrays;
import k4.AbstractC2036a;
import m3.v;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class b extends AbstractC2187a {

    /* renamed from: k, reason: collision with root package name */
    public final int f17501k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17502l;

    /* renamed from: m, reason: collision with root package name */
    public final PendingIntent f17503m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17504n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f17500o = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new C2.a(17);

    public b(int i, int i5, PendingIntent pendingIntent, String str) {
        this.f17501k = i;
        this.f17502l = i5;
        this.f17503m = pendingIntent;
        this.f17504n = str;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
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
                switch (i) {
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
                    case C1639u7.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return L1.a.l(i, "UNKNOWN_ERROR_CODE(", ")");
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
        return this.f17502l == bVar.f17502l && v.g(this.f17503m, bVar.f17503m) && v.g(this.f17504n, bVar.f17504n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17502l), this.f17503m, this.f17504n});
    }

    public final String toString() {
        v3.g gVar = new v3.g(this);
        gVar.s("statusCode", a(this.f17502l));
        gVar.s("resolution", this.f17503m);
        gVar.s("message", this.f17504n);
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f17501k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f17502l);
        AbstractC2036a.e0(parcel, 3, this.f17503m, i);
        AbstractC2036a.f0(parcel, 4, this.f17504n);
        AbstractC2036a.m0(parcel, k02);
    }

    public b(int i) {
        this(1, i, null, null);
    }

    public b(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
