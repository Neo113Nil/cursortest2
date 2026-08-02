package Gf;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f10112a = Pattern.compile("[\\\\&]");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f10113b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f10114c;

    /* renamed from: d, reason: collision with root package name */
    private static final C0207a f10115d;

    /* renamed from: Gf.a$a, reason: collision with other inner class name */
    static class C0207a {
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f10114c = Pattern.compile("[ \t\r\n]+");
        f10115d = new C0207a();
    }

    public static String a(String str) {
        return f10114c.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    public static String b(String str) {
        return a(str.substring(1, str.length() - 1));
    }

    public static String c(String str) {
        if (!f10112a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f10113b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, matcher.start());
            String group = matcher.group();
            f10115d.getClass();
            if (group.charAt(0) == '\\') {
                sb2.append((CharSequence) group, 1, group.length());
            } else {
                sb2.append(b.a(group));
            }
            i11 = matcher.end();
        } while (matcher.find());
        if (i11 != str.length()) {
            sb2.append((CharSequence) str, i11, str.length());
        }
        return sb2.toString();
    }
}
