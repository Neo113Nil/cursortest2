package P8;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f22007a = Logger.getLogger(a.class.getName());

    public final InputStream a(String str) {
        InputStream resourceAsStream = a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f22007a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
