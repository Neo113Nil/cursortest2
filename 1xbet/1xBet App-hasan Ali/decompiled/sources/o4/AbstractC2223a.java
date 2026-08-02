package o4;

import java.nio.charset.Charset;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2223a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f18653a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f18654b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f18655c;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l.e("forName(...)", forName);
        f18653a = forName;
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16BE"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16LE"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("US-ASCII"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("ISO-8859-1"));
    }
}
