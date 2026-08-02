package Nf;

import Qf.j;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: Nf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3671a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f19502a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset forName = Charset.forName("UTF-8");
        f19502a = forName;
        forName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        j.s("meta[http-equiv=content-type], meta[charset]");
    }
}
