package m0;

/* loaded from: classes.dex */
public final class b extends q0.AbstractC0980a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8043b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.PendingIntent f8044c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f8045d;

    /* renamed from: e, reason: collision with root package name */
    public static final m0.b f8041e = new m0.b(0);
    public static final android.os.Parcelable.Creator<m0.b> CREATOR = new C.l(10);

    public b(int i2, int i3, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this.f8042a = i2;
        this.f8043b = i3;
        this.f8044c = pendingIntent;
        this.f8045d = str;
    }

    public static java.lang.String a(int i2) {
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
                    case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return B1.a.g(i2, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0.b)) {
            return false;
        }
        m0.b bVar = (m0.b) obj;
        return this.f8043b == bVar.f8043b && p0.AbstractC0966r.e(this.f8044c, bVar.f8044c) && p0.AbstractC0966r.e(this.f8045d, bVar.f8045d);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f8043b), this.f8044c, this.f8045d});
    }

    public final java.lang.String toString() {
        o0.i iVar = new o0.i(this);
        iVar.a(a(this.f8043b), "statusCode");
        iVar.a(this.f8044c, "resolution");
        iVar.a(this.f8045d, "message");
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int G = a.AbstractC0059a.G(parcel, 20293);
        a.AbstractC0059a.I(parcel, 1, 4);
        parcel.writeInt(this.f8042a);
        a.AbstractC0059a.I(parcel, 2, 4);
        parcel.writeInt(this.f8043b);
        a.AbstractC0059a.C(parcel, 3, this.f8044c, i2);
        a.AbstractC0059a.D(parcel, 4, this.f8045d);
        a.AbstractC0059a.H(parcel, G);
    }

    public b(int i2) {
        this(1, i2, null, null);
    }

    public b(int i2, android.app.PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, null);
    }
}
