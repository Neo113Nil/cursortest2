package G5;

import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import i4.C1266c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends Exception {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f3060d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3062b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3063c;

    public e(String str, String str2, Map map) {
        this.f3061a = str;
        this.f3062b = str2;
        if (map != null) {
            this.f3063c = map;
        } else {
            this.f3063c = new HashMap();
        }
        this.f3063c.put("code", str);
        this.f3063c.put("message", str2);
    }

    public static e a(C1266c c1266c) {
        String str;
        String str2;
        int i7 = c1266c.f13989a;
        if (i7 == -25) {
            str = "write-cancelled";
            str2 = "The write was canceled by the user.";
        } else if (i7 == -24) {
            str = "network-error";
            str2 = "The operation could not be performed due to a network error.";
        } else if (i7 == -4) {
            str = "disconnected";
            str2 = "The operation had to be aborted due to a network disconnect.";
        } else if (i7 == -3) {
            str = "permission-denied";
            str2 = "Client doesn't have permission to access the desired data.";
        } else if (i7 == -2) {
            str = "failure";
            str2 = "The server indicated that this operation failed.";
        } else if (i7 != -1) {
            switch (i7) {
                case IntegrityErrorCode.NONCE_TOO_SHORT /* -10 */:
                    str = "unavailable";
                    str2 = "The service is unavailable.";
                    break;
                case -9:
                    str = "overridden-by-set";
                    str2 = "The transaction was overridden by a subsequent set.";
                    break;
                case -8:
                    str = "max-retries";
                    str2 = "The transaction had too many retries.";
                    break;
                case -7:
                    str = "invalid-token";
                    str2 = "The supplied auth token was invalid.";
                    break;
                case -6:
                    str = "expired-token";
                    str2 = "The supplied auth token has expired.";
                    break;
                default:
                    str2 = "An unknown error occurred";
                    str = "unknown";
                    break;
            }
        } else {
            str = "data-stale";
            str2 = "The transaction needs to be run again with current data.";
        }
        if (str.equals("unknown")) {
            return b(c1266c.f13990b);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("details", c1266c.f13991c);
        return new e(str, str2, hashMap);
    }

    public static e b(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "An unknown error occurred";
        }
        if (str.contains("Index not defined, add \".indexOn\"")) {
            str = str.replaceFirst("java.lang.Exception: ", "");
            str2 = "index-not-defined";
        } else if (str.contains("Permission denied") || str.contains("Client doesn't have permission")) {
            str2 = "permission-denied";
            str = "Client doesn't have permission to access the desired data.";
        } else {
            str2 = "unknown";
        }
        return new e(str2, str, hashMap);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3062b;
    }
}
