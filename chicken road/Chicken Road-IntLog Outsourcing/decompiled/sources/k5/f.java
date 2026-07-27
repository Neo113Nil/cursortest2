package k5;

import B4.k;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f10733a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? k.R(message, "getsockname failed", false) : false;
    }
}
