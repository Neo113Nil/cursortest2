package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class Status extends q0.AbstractC0980a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new C.l(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f2594a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2595b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.PendingIntent f2596c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.b f2597d;

    public Status(int i2, java.lang.String str, android.app.PendingIntent pendingIntent, m0.b bVar) {
        this.f2594a = i2;
        this.f2595b = str;
        this.f2596c = pendingIntent;
        this.f2597d = bVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.f2594a == status.f2594a && p0.AbstractC0966r.e(this.f2595b, status.f2595b) && p0.AbstractC0966r.e(this.f2596c, status.f2596c) && p0.AbstractC0966r.e(this.f2597d, status.f2597d);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f2594a), this.f2595b, this.f2596c, this.f2597d});
    }

    public final java.lang.String toString() {
        o0.i iVar = new o0.i(this);
        java.lang.String str = this.f2595b;
        if (str == null) {
            int i2 = this.f2594a;
            switch (i2) {
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
                    str = B1.a.f(i2, "unknown status code: ");
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
                case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                    str = "REMOTE_EXCEPTION";
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        iVar.a(str, "statusCode");
        iVar.a(this.f2596c, "resolution");
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f2594a);
        a.AbstractC0059a.D(parcel, 2, this.f2595b);
        a.AbstractC0059a.C(parcel, 3, this.f2596c, i2);
        a.AbstractC0059a.C(parcel, 4, this.f2597d, i2);
        a.AbstractC0059a.H(parcel, G);
    }
}
