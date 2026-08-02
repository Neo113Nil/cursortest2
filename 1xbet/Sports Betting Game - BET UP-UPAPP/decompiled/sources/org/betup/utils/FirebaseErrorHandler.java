package org.betup.utils;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuthException;
import org.betup.R;

/* loaded from: classes4.dex */
public final class FirebaseErrorHandler {
    private static final String ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL = "ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL";
    public static final String ERROR_CREDENTIAL_ALREADY_IN_USE = "ERROR_CREDENTIAL_ALREADY_IN_USE";
    public static final String ERROR_CUSTOM_TOKEN_MISMATCH = "ERROR_CUSTOM_TOKEN_MISMATCH";
    private static final String ERROR_EMAIL_ALREADY_IN_USE = "ERROR_EMAIL_ALREADY_IN_USE";
    private static final String ERROR_INVALID_CREDENTIAL = "ERROR_INVALID_CREDENTIAL";
    public static final String ERROR_INVALID_CUSTOM_TOKEN = "ERROR_INVALID_CUSTOM_TOKEN";
    private static final String ERROR_INVALID_EMAIL = "ERROR_INVALID_EMAIL";
    public static final String ERROR_INVALID_USER_TOKEN = "ERROR_INVALID_USER_TOKEN";
    public static final String ERROR_OPERATION_NOT_ALLOWED = "ERROR_OPERATION_NOT_ALLOWED";
    private static final String ERROR_REQUIRES_RECENT_LOGIN = "ERROR_REQUIRES_RECENT_LOGIN";
    public static final String ERROR_USER_DISABLED = "ERROR_USER_DISABLED";
    public static final String ERROR_USER_MISMATCH = "ERROR_USER_MISMATCH";
    private static final String ERROR_USER_NOT_FOUND = "ERROR_USER_NOT_FOUND";
    private static final String ERROR_WEAK_PASSWORD = "ERROR_WEAK_PASSWORD";
    private static final String ERROR_WRONG_PASSWORD = "ERROR_WRONG_PASSWORD";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String getMessageForError(Context context, Task task) {
        String localizedMessage;
        char c;
        String localizedMessage2;
        int i = R.string.auth_failed;
        String string = context != null ? context.getString(R.string.auth_failed) : "Authentication failed";
        try {
            String errorCode = ((FirebaseAuthException) task.getException()).getErrorCode();
            switch (errorCode.hashCode()) {
                case -1952353404:
                    if (errorCode.equals(ERROR_INVALID_USER_TOKEN)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1192524938:
                    if (errorCode.equals(ERROR_INVALID_CREDENTIAL)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1090616679:
                    if (errorCode.equals(ERROR_USER_NOT_FOUND)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1039544851:
                    if (errorCode.equals(ERROR_OPERATION_NOT_ALLOWED)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1030803221:
                    if (errorCode.equals(ERROR_CUSTOM_TOKEN_MISMATCH)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -954285479:
                    if (errorCode.equals(ERROR_USER_DISABLED)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -431432636:
                    if (errorCode.equals(ERROR_WRONG_PASSWORD)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 42310207:
                    if (errorCode.equals(ERROR_REQUIRES_RECENT_LOGIN)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 635219534:
                    if (errorCode.equals(ERROR_EMAIL_ALREADY_IN_USE)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 794520829:
                    if (errorCode.equals(ERROR_INVALID_EMAIL)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 872913541:
                    if (errorCode.equals(ERROR_CREDENTIAL_ALREADY_IN_USE)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1857165739:
                    if (errorCode.equals(ERROR_USER_MISMATCH)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1866228075:
                    if (errorCode.equals(ERROR_WEAK_PASSWORD)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1963017308:
                    if (errorCode.equals(ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2019421930:
                    if (errorCode.equals(ERROR_INVALID_CUSTOM_TOKEN)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i = R.string.invalid_email;
                    break;
                case 1:
                    i = R.string.invalid_credential;
                    break;
                case 2:
                    i = R.string.wrong_password;
                    break;
                case 3:
                    i = R.string.account_exists;
                    break;
                case 4:
                    i = R.string.email_already_used;
                    break;
                case 5:
                    i = R.string.should_login_first;
                    break;
                case 6:
                    i = R.string.weak_password;
                    break;
                case 7:
                    i = R.string.another_account_already_connected;
                    break;
                case '\b':
                    i = R.string.auth_provider_disabled;
                    break;
                case '\t':
                    localizedMessage2 = task.getException() != null ? task.getException().getLocalizedMessage() : null;
                    if (localizedMessage2 != null && !localizedMessage2.trim().isEmpty()) {
                        return localizedMessage2;
                    }
                    break;
                default:
                    localizedMessage2 = task.getException() != null ? task.getException().getLocalizedMessage() : null;
                    if (localizedMessage2 != null && !localizedMessage2.trim().isEmpty()) {
                        return localizedMessage2;
                    }
                    break;
            }
            return context != null ? context.getString(i) : string;
        } catch (Exception unused) {
            return (task == null || task.getException() == null || (localizedMessage = task.getException().getLocalizedMessage()) == null || localizedMessage.trim().isEmpty()) ? string : localizedMessage;
        }
    }
}
