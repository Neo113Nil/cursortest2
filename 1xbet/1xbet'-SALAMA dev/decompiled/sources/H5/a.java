package H5;

import B4.I;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3350b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:104:0x01b4  */
    public a(I i7, Throwable th) {
        String str;
        String str2;
        super(i7 != null ? i7.getMessage() : "", th);
        String message = "Unrecoverable data loss or corruption.";
        String str3 = "data-loss";
        if (th == null || th.getMessage() == null || !th.getMessage().contains(":")) {
            str = null;
            str2 = null;
        } else {
            Matcher matcher = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(th.getMessage());
            if (matcher.find()) {
                String strTrim = matcher.group(1).trim();
                String strTrim2 = matcher.group(2).trim();
                strTrim.getClass();
                switch (strTrim) {
                    case "DATA_LOSS":
                        str2 = "Unrecoverable data loss or corruption.";
                        str = "data-loss";
                        break;
                    case "INVALID_ARGUMENT":
                        str2 = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                        str = "invalid-argument";
                        break;
                    case "PERMISSION_DENIED":
                        str2 = "The caller does not have permission to execute the specified operation.";
                        str = "permission-denied";
                        break;
                    case "CANCELLED":
                        str2 = "The operation was cancelled (typically by the caller).";
                        str = "cancelled";
                        break;
                    case "RESOURCE_EXHAUSTED":
                        str2 = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                        str = "resource-exhausted";
                        break;
                    case "UNAUTHENTICATED":
                        str2 = "The request does not have valid authentication credentials for the operation.";
                        str = "unauthenticated";
                        break;
                    case "ABORTED":
                        str2 = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                        str = "aborted";
                        break;
                    case "DEADLINE_EXCEEDED":
                        str2 = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                        str = "deadline-exceeded";
                        break;
                    case "UNKNOWN":
                        str = "unknown";
                        str2 = "Operation is not implemented or not supported/enabled.";
                        break;
                    case "OUT_OF_RANGE":
                        str2 = "Operation was attempted past the valid range.";
                        str = "out-of-range";
                        break;
                    case "FAILED_PRECONDITION":
                        str2 = strTrim2.contains("index") ? strTrim2 : "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
                        str = "failed-precondition";
                        break;
                    case "NOT_FOUND":
                        str2 = "Some requested document was not found.";
                        str = "not-found";
                        break;
                    case "INTERNAL":
                        str2 = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                        str = "internal";
                        break;
                    case "UNAVAILABLE":
                        str2 = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                        str = "unavailable";
                        break;
                    case "ALREADY_EXISTS":
                        str2 = "Some document that we attempted to create already exists.";
                        str = "already-exists";
                        break;
                    case "UNIMPLEMENTED":
                        str = "unimplemented";
                        str2 = "Operation is not implemented or not supported/enabled.";
                        break;
                    default:
                        str = null;
                        str2 = null;
                        break;
                }
            } else {
                str = null;
                str2 = null;
            }
        }
        if (str == null && i7 != null) {
            switch (i7.f1098a.ordinal()) {
                case 1:
                    message = "The operation was cancelled (typically by the caller).";
                    str3 = "cancelled";
                    break;
                case 2:
                    message = "Unknown error or an error from a different error domain.";
                    str3 = "unknown";
                    break;
                case 3:
                    message = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
                    str3 = "invalid-argument";
                    break;
                case 4:
                    message = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
                    str3 = "deadline-exceeded";
                    break;
                case 5:
                    message = "Some requested document was not found.";
                    str3 = "not-found";
                    break;
                case 6:
                    message = "Some document that we attempted to create already exists.";
                    str3 = "already-exists";
                    break;
                case 7:
                    message = "The caller does not have permission to execute the specified operation.";
                    str3 = "permission-denied";
                    break;
                case 8:
                    message = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
                    str3 = "resource-exhausted";
                    break;
                case 9:
                    message = ((i7.getMessage() == null || !i7.getMessage().contains("query requires an index")) && !i7.getMessage().contains("ensure it has been indexed")) ? "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console." : i7.getMessage();
                    str3 = "failed-precondition";
                    break;
                case 10:
                    message = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
                    str3 = "aborted";
                    break;
                case 11:
                    message = "Operation was attempted past the valid range.";
                    str3 = "out-of-range";
                    break;
                case 12:
                    str3 = "unimplemented";
                    message = "Operation is not implemented or not supported/enabled.";
                    break;
                case 13:
                    message = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
                    str3 = "internal";
                    break;
                case 14:
                    message = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
                    str3 = "unavailable";
                    break;
                case 15:
                    break;
                case 16:
                    message = "The request does not have valid authentication credentials for the operation.";
                    str3 = "unauthenticated";
                    break;
                default:
                    message = "An unknown error occurred";
                    str3 = "unknown";
                    break;
            }
        } else {
            str3 = str;
            message = str2;
        }
        this.f3349a = str3;
        this.f3350b = message;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f3350b;
    }
}
