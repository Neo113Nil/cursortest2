package x;

import U0.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class g {
    public static String b(Object value, String str) {
        kotlin.jvm.internal.j.e(value, "value");
        return str + " value: " + value;
    }

    public static i c(String str) {
        String group;
        if (str != null && !a1.h.S(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        String description = matcher.group(4) != null ? matcher.group(4) : "";
                        kotlin.jvm.internal.j.d(description, "description");
                        return new i(parseInt, parseInt2, parseInt3, description);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, l lVar);
}
