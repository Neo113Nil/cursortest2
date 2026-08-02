package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0852b extends com.google.android.gms.common.internal.safeparcel.a {
    public final int a;
    public final int b;

    @Nullable
    public final PendingIntent c;

    @Nullable
    public final String d;

    @NonNull
    public static final C0852b e = new C0852b(0);

    @NonNull
    public static final Parcelable.Creator<C0852b> CREATOR = new n();

    public C0852b(int i, @Nullable String str, @Nullable PendingIntent pendingIntent, int i2) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    @NonNull
    public static String o(int i) {
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
                        return androidx.compose.runtime.u.a(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0852b)) {
            return false;
        }
        C0852b c0852b = (C0852b) obj;
        return this.b == c0852b.b && C0874p.a(this.c, c0852b.c) && C0874p.a(this.d, c0852b.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    public final boolean l() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final boolean m() {
        return this.b == 0;
    }

    public final void n(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (l()) {
            PendingIntent pendingIntent = this.c;
            C0875q.g(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @NonNull
    public final String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(o(this.b), "statusCode");
        aVar.a(this.c, "resolution");
        aVar.a(this.d, Constants.MESSAGE);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public C0852b(int i) {
        this(1, null, null, i);
    }

    public C0852b(int i, @Nullable PendingIntent pendingIntent) {
        this(1, null, pendingIntent, i);
    }
}
