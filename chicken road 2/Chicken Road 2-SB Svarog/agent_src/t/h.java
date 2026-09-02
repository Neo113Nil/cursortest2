package t;

import f0.l;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class h {
    public static String b(Object obj, String str) {
        g0.h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static i c(String str) {
        String group;
        if (str == null) {
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (!matcher.matches() || (group = matcher.group(1)) == null) {
                    return null;
                }
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 == null) {
                    return null;
                }
                int parseInt2 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                if (group3 == null) {
                    return null;
                }
                int parseInt3 = Integer.parseInt(group3);
                String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                g0.h.d(group4, "description");
                return new i(parseInt, parseInt2, parseInt3, group4);
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract h d(String str, l lVar);
}
