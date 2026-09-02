package i1;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f1384a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f1385b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static q a() {
        Matcher matcher = f1384a.matcher("application/x-protobuf");
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"application/x-protobuf\"");
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        group.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f1385b.matcher("application/x-protobuf");
        String str = null;
        for (int end = matcher.end(); end < 22; end = matcher2.end()) {
            matcher2.region(end, 22);
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + "application/x-protobuf".substring(end) + "\" for: \"application/x-protobuf\"");
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str != null && !group3.equalsIgnoreCase(str)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str + "\" and: \"" + group3 + "\" for: \"application/x-protobuf\"");
                }
                str = group3;
            }
        }
        return new q();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        ((q) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -1575588001;
    }

    public final String toString() {
        return "application/x-protobuf";
    }
}
