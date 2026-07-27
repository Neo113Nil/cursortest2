package sg.bigo.ads.x0;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: sg.bigo.ads.x0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5506f {
    public static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f13383a;

    public C5506f(String str) {
        this.f13383a = str;
    }

    public static C5506f a(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        group.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = c.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group3;
            }
        }
        return new C5506f(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5506f) && ((C5506f) obj).f13383a.equals(this.f13383a);
    }

    public final int hashCode() {
        return this.f13383a.hashCode();
    }

    public final String toString() {
        return this.f13383a;
    }
}
