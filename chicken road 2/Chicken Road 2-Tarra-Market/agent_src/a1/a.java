package a1;

import java.nio.charset.Charset;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f549a;

    static {
        Charset forName = Charset.forName("UTF-8");
        j.d(forName, "forName(...)");
        f549a = forName;
        j.d(Charset.forName("UTF-16"), "forName(...)");
        j.d(Charset.forName("UTF-16BE"), "forName(...)");
        j.d(Charset.forName("UTF-16LE"), "forName(...)");
        j.d(Charset.forName("US-ASCII"), "forName(...)");
        j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
