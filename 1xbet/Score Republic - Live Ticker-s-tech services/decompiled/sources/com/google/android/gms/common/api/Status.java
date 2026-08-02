package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p000.AbstractC0477mo;
import p000.AbstractC0823w0;
import p000.C0253gl;
import p000.C0561oy;
import p000.f50;
import p000.j11;
import p000.jm1;
import p000.t22;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC0823w0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new jm1(12);

    /* JADX INFO: renamed from: j */
    public final int f1341j;

    /* JADX INFO: renamed from: k */
    public final String f1342k;

    /* JADX INFO: renamed from: l */
    public final PendingIntent f1343l;

    /* JADX INFO: renamed from: m */
    public final C0253gl f1344m;

    public Status(int i, String str, PendingIntent pendingIntent, C0253gl c0253gl) {
        this.f1341j = i;
        this.f1342k = str;
        this.f1343l = pendingIntent;
        this.f1344m = c0253gl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1341j == status.f1341j && AbstractC0477mo.m3406e(this.f1342k, status.f1342k) && AbstractC0477mo.m3406e(this.f1343l, status.f1343l) && AbstractC0477mo.m3406e(this.f1344m, status.f1344m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1341j), this.f1342k, this.f1343l, this.f1344m});
    }

    public final String toString() {
        f50 f50Var = new f50(this);
        String strM2774i = this.f1342k;
        if (strM2774i == null) {
            int i = this.f1341j;
            switch (i) {
                case -1:
                    strM2774i = "SUCCESS_CACHE";
                    break;
                case 0:
                    strM2774i = "SUCCESS";
                    break;
                case 1:
                case 9:
                case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                default:
                    strM2774i = j11.m2774i(new StringBuilder(String.valueOf(i).length() + 21), "unknown status code: ", i);
                    break;
                case 2:
                    strM2774i = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strM2774i = "SERVICE_DISABLED";
                    break;
                case 4:
                    strM2774i = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strM2774i = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strM2774i = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strM2774i = "NETWORK_ERROR";
                    break;
                case 8:
                    strM2774i = "INTERNAL_ERROR";
                    break;
                case 10:
                    strM2774i = "DEVELOPER_ERROR";
                    break;
                case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                    strM2774i = "ERROR";
                    break;
                case 14:
                    strM2774i = "INTERRUPTED";
                    break;
                case 15:
                    strM2774i = "TIMEOUT";
                    break;
                case 16:
                    strM2774i = "CANCELED";
                    break;
                case 17:
                    strM2774i = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strM2774i = "DEAD_CLIENT";
                    break;
                case 19:
                    strM2774i = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strM2774i = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strM2774i = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strM2774i = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        f50Var.m1627j(strM2774i, "statusCode");
        f50Var.m1627j(this.f1343l, "resolution");
        return f50Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f1341j);
        t22.m4658l(parcel, 2, this.f1342k);
        t22.m4657k(parcel, 3, this.f1343l, i);
        t22.m4657k(parcel, 4, this.f1344m, i);
        t22.m4665s(parcel, iM4663q);
    }
}
