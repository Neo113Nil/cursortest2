package W;

/* loaded from: classes.dex */
public abstract class g {
    public static java.lang.String b(java.lang.Object value, java.lang.String str) {
        kotlin.jvm.internal.i.e(value, "value");
        return str + " value: " + value;
    }

    public static W.i c(java.lang.String str) {
        java.lang.String group;
        if (str != null && !y1.g.T(str)) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = java.lang.Integer.parseInt(group);
                java.lang.String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = java.lang.Integer.parseInt(group2);
                    java.lang.String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = java.lang.Integer.parseInt(group3);
                        java.lang.String description = matcher.group(4) != null ? matcher.group(4) : "";
                        kotlin.jvm.internal.i.d(description, "description");
                        return new W.i(parseInt, parseInt2, parseInt3, description);
                    }
                }
            }
        }
        return null;
    }

    public abstract java.lang.Object a();

    public abstract W.g d(java.lang.String str, s1.l lVar);
}
