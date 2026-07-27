package l1;

import a.AbstractC0169a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import io.appmetrica.analytics.impl.C0793l9;
import java.util.Arrays;
import o1.u;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class b extends AbstractC1380a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11000b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f11001c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11002d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f10998e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new B1.c(18);

    public b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f10999a = i2;
        this.f11000b = i3;
        this.f11001c = pendingIntent;
        this.f11002d = str;
    }

    public static String c(int i2) {
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
                    case C0793l9.f8681C /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case C0793l9.f8682D /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case C0793l9.f8683E /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return B0.o.g(i2, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean a() {
        return (this.f11000b == 0 || this.f11001c == null) ? false : true;
    }

    public final boolean b() {
        return this.f11000b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11000b == bVar.f11000b && u.j(this.f11001c, bVar.f11001c) && u.j(this.f11002d, bVar.f11002d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11000b), this.f11001c, this.f11002d});
    }

    public final String toString() {
        B0.l lVar = new B0.l(this);
        lVar.c(c(this.f11000b), "statusCode");
        lVar.c(this.f11001c, "resolution");
        lVar.c(this.f11002d, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        return lVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f10999a);
        AbstractC0169a.T(parcel, 2, 4);
        parcel.writeInt(this.f11000b);
        AbstractC0169a.N(parcel, 3, this.f11001c, i2);
        AbstractC0169a.O(parcel, 4, this.f11002d);
        AbstractC0169a.S(parcel, R5);
    }

    public b(int i2) {
        this(1, i2, null, null);
    }

    public b(int i2, PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, null);
    }
}
