package U0;

import C6.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class g {
    public static String b(Object obj, String str) {
        t6.h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static j c(String str) {
        String group;
        if (str != null && !o.u0(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                        t6.h.d(group4, "description");
                        return new j(parseInt, parseInt2, group4, parseInt3);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, Function1 function1);
}
