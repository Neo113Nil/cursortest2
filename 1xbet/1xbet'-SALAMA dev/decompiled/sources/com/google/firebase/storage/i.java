package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends Y3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        int i7;
        D.b(!status.j());
        if (status.f11082a == 16) {
            i7 = -13040;
        } else {
            i7 = status.equals(Status.f11080y) ? -13030 : -13000;
        }
        return new i(i7, null, 0);
    }

    public static i b(Throwable th, int i7) {
        int i8;
        if (th instanceof i) {
            return (i) th;
        }
        if ((i7 == 0 || (i7 >= 200 && i7 < 300)) && th == null) {
            return null;
        }
        if (th instanceof C0846a) {
            i8 = -13040;
        } else if (i7 == -2) {
            i8 = -13030;
        } else if (i7 == 401) {
            i8 = -13020;
        } else if (i7 == 409) {
            i8 = -13031;
        } else if (i7 != 403) {
            i8 = i7 != 404 ? -13000 : -13010;
        } else {
            i8 = -13021;
        }
        return new i(i8, th, i7);
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
