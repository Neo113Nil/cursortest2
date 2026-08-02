package C6;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1581a;

    static {
        Charset forName = Charset.forName("UTF-8");
        t6.h.d(forName, "forName(...)");
        f1581a = forName;
        t6.h.d(Charset.forName("UTF-16"), "forName(...)");
        t6.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        t6.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        t6.h.d(Charset.forName("US-ASCII"), "forName(...)");
        t6.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
