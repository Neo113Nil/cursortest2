package l0;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f855a;

    static {
        Charset forName = Charset.forName("UTF-8");
        g0.h.d(forName, "forName(...)");
        f855a = forName;
        g0.h.d(Charset.forName("UTF-16"), "forName(...)");
        g0.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        g0.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        g0.h.d(Charset.forName("US-ASCII"), "forName(...)");
        g0.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
