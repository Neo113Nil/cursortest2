package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: gl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0253gl extends AbstractC0823w0 {

    /* JADX INFO: renamed from: j */
    public final int f2795j;

    /* JADX INFO: renamed from: k */
    public final int f2796k;

    /* JADX INFO: renamed from: l */
    public final PendingIntent f2797l;

    /* JADX INFO: renamed from: m */
    public final String f2798m;

    /* JADX INFO: renamed from: n */
    public final Integer f2799n;

    /* JADX INFO: renamed from: o */
    public static final C0253gl f2794o = new C0253gl(0, null, null);
    public static final Parcelable.Creator<C0253gl> CREATOR = new jm1(0);

    public C0253gl(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f2795j = i;
        this.f2796k = i2;
        this.f2797l = pendingIntent;
        this.f2798m = str;
        this.f2799n = num;
    }

    /* JADX INFO: renamed from: b */
    public static String m2120b(int i) {
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
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
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
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0253gl)) {
            return false;
        }
        C0253gl c0253gl = (C0253gl) obj;
        return this.f2796k == c0253gl.f2796k && AbstractC0477mo.m3406e(this.f2797l, c0253gl.f2797l) && AbstractC0477mo.m3406e(this.f2798m, c0253gl.f2798m) && AbstractC0477mo.m3406e(this.f2799n, c0253gl.f2799n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2796k), this.f2797l, this.f2798m, this.f2799n});
    }

    public final String toString() {
        f50 f50Var = new f50(this);
        f50Var.m1627j(m2120b(this.f2796k), "statusCode");
        f50Var.m1627j(this.f2797l, "resolution");
        f50Var.m1627j(this.f2798m, "message");
        f50Var.m1627j(this.f2799n, "clientMethodKey");
        return f50Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f2795j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f2796k);
        t22.m4657k(parcel, 3, this.f2797l, i);
        t22.m4658l(parcel, 4, this.f2798m);
        Integer num = this.f2799n;
        if (num != null) {
            t22.m4662p(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        t22.m4665s(parcel, iM4663q);
    }

    public C0253gl(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
