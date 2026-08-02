package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;

/* loaded from: classes2.dex */
public final class i extends Y3.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f12027a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f12028b;

    public i(int i7, Throwable th, int i8) {
        super(c(i7));
        this.f12028b = th;
        this.f12027a = i7;
        Log.e("StorageException", "StorageException has occurred.\n" + c(i7) + "\n Code: " + i7 + " HttpResult: " + i8);
        if (th != null) {
            Log.e("StorageException", th.getMessage(), th);
        }
    }

    public static i a(Status status) {
        D.b(!status.j());
        return new i(status.f11082a == 16 ? -13040 : status.equals(Status.f11080y) ? -13030 : -13000, null, 0);
    }

    public static i b(Throwable th, int i7) {
        if (th instanceof i) {
            return (i) th;
        }
        if ((i7 == 0 || (i7 >= 200 && i7 < 300)) && th == null) {
            return null;
        }
        return new i(th instanceof C0890a ? -13040 : i7 != -2 ? i7 != 401 ? i7 != 409 ? i7 != 403 ? i7 != 404 ? -13000 : -13010 : -13021 : -13031 : -13020 : -13030, th, i7);
    }

    public static String c(int i7) {
        if (i7 == -13040) {
            return "The operation was cancelled.";
        }
        if (i7 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i7 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i7 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i7 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i7) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        Throwable th = this.f12028b;
        if (th == this) {
            return null;
        }
        return th;
    }
}
