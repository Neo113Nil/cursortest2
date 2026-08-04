package U0;

import C6.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static String b(Object obj, String str) {
        t6.h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static j c(String str) {
        String strGroup;
        if (str != null && !o.u0(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                int i7 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                if (strGroup2 != null) {
                    int i8 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    if (strGroup3 != null) {
                        int i9 = Integer.parseInt(strGroup3);
                        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                        t6.h.d(strGroup4, "description");
                        return new j(i7, i8, strGroup4, i9);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, Function1 function1);
}
