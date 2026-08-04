package C6;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f1581a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        t6.h.d(charsetForName, "forName(...)");
        f1581a = charsetForName;
        t6.h.d(Charset.forName("UTF-16"), "forName(...)");
        t6.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        t6.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        t6.h.d(Charset.forName("US-ASCII"), "forName(...)");
        t6.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
