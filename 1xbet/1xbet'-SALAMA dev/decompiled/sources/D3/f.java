package D3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f1717a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f1718b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f1719c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f1720d;

    static {
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        f1720d = Charset.forName("UTF-16");
    }
}
