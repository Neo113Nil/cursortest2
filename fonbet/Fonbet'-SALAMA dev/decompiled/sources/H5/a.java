package H5;

import B4.I;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f3349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3350b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a(I i7, Throwable th) {
        super(i7 != null ? i7.getMessage() : "", th);
        String str;
        String str2;
        char c3;
        String str3 = "Unrecoverable data loss or corruption.";
        String str4 = "data-loss";
        if (th != null && th.getMessage() != null && th.getMessage().contains(":")) {
            Matcher matcher = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(th.getMessage());
            if (matcher.find()) {
                String trim = matcher.group(1).trim();
                String trim2 = matcher.group(2).trim();
                trim.getClass();
                switch (trim.hashCode()) {
                    case -1842427240:
                        if (trim.equals("DATA_LOSS")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1711692763:
                        if (trim.equals("INVALID_ARGUMENT")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1416305653:
                        if (trim.equals("PERMISSION_DENIED")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1031784143:
                        if (trim.equals("CANCELLED")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1025686472:
                        if (trim.equals("RESOURCE_EXHAUSTED")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -849706474:
                        if (trim.equals("UNAUTHENTICATED")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -476794961:
                        if (trim.equals("ABORTED")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -376214182:
                        if (trim.equals("DEADLINE_EXCEEDED")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 433141802:
                        if (trim.equals("UNKNOWN")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 695165606:
                        if (trim.equals("OUT_OF_RANGE")) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 979228314:
                        if (trim.equals("FAILED_PRECONDITION")) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1023286998:
                        if (trim.equals("NOT_FOUND")) {
                            c3 = 11;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1353037501:
                        if (trim.equals("INTERNAL")) {
                            c3 = '\f';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1487498288:
                        if (trim.equals("UNAVAILABLE")) {
                            c3 = '\r';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1661336131:
                        if (trim.equals("ALREADY_EXISTS")) {
                            c3 = 14;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1854913705:
                        if (trim.equals("UNIMPLEMENTED")) {
                            c3 = 15;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        str2 = "Unrecoverable data loss or corruption.";
                        str = "data-loss";
                        break;
                    case 1:
                        str2 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                        str = "invalid-argument";
                        break;
                    case 2:
                        str2 = "The caller does not have permission to execute the specified operation.";
                        str = "permission-denied";
                        break;
                    case 3:
                        str2 = "The operation was cancelled (typically by the caller).";
                        str = "cancelled";
                        break;
                    case 4:
                        str2 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                        str = "resource-exhausted";
                        break;
                    case 5:
                        str2 = "The request does not have valid authentication credentials for the operation.";
                        str = "unauthenticated";
                        break;
                    case 6:
                        str2 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                        str = "aborted";
                        break;
                    case 7:
                        str2 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                        str = "deadline-exceeded";
                        break;
                    case '\b':
                        str = "unknown";
                        str2 = "Operation is not implemented or not supported/enabled.";
                        break;
                    case '\t':
                        str2 = "Operation was attempted past the valid range.";
                        str = "out-of-range";
                        break;
                    case '\n':
                        str2 = trim2.contains("index") ? trim2 : "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
                        str = "failed-precondition";
                        break;
                    case 11:
                        str2 = "Some requested document was not found.";
                        str = "not-found";
                        break;
                    case '\f':
                        str2 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                        str = "internal";
                        break;
                    case '\r':
                        str2 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                        str = "unavailable";
                        break;
                    case 14:
                        str2 = "Some document that we attempted to create already exists.";
                        str = "already-exists";
                        break;
                    case 15:
                        str = "unimplemented";
                        str2 = "Operation is not implemented or not supported/enabled.";
                        break;
                }
                if (str != null && i7 != null) {
                    switch (i7.f1098a.ordinal()) {
                        case 1:
                            str3 = "The operation was cancelled (typically by the caller).";
                            str4 = "cancelled";
                            break;
                        case 2:
                            str3 = "Unknown error or an error from a different error domain.";
                            str4 = "unknown";
                            break;
                        case 3:
                            str3 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                            str4 = "invalid-argument";
                            break;
                        case 4:
                            str3 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                            str4 = "deadline-exceeded";
                            break;
                        case 5:
                            str3 = "Some requested document was not found.";
                            str4 = "not-found";
                            break;
                        case 6:
                            str3 = "Some document that we attempted to create already exists.";
                            str4 = "already-exists";
                            break;
                        case 7:
                            str3 = "The caller does not have permission to execute the specified operation.";
                            str4 = "permission-denied";
                            break;
                        case 8:
                            str3 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                            str4 = "resource-exhausted";
                            break;
                        case 9:
                            str3 = ((i7.getMessage() == null || !i7.getMessage().contains("query requires an index")) && !i7.getMessage().contains("ensure it has been indexed")) ? "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console." : i7.getMessage();
                            str4 = "failed-precondition";
                            break;
                        case 10:
                            str3 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                            str4 = "aborted";
                            break;
                        case 11:
                            str3 = "Operation was attempted past the valid range.";
                            str4 = "out-of-range";
                            break;
                        case 12:
                            str4 = "unimplemented";
                            str3 = "Operation is not implemented or not supported/enabled.";
                            break;
                        case 13:
                            str3 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                            str4 = "internal";
                            break;
                        case 14:
                            str3 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                            str4 = "unavailable";
                            break;
                        case 15:
                            break;
                        case 16:
                            str3 = "The request does not have valid authentication credentials for the operation.";
                            str4 = "unauthenticated";
                            break;
                        default:
                            str3 = "An unknown error occurred";
                            str4 = "unknown";
                            break;
                    }
                } else {
                    str4 = str;
                    str3 = str2;
                }
                this.f3349a = str4;
                this.f3350b = str3;
            }
        }
        str = null;
        str2 = null;
        if (str != null) {
        }
        str4 = str;
        str3 = str2;
        this.f3349a = str4;
        this.f3350b = str3;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3350b;
    }
}
