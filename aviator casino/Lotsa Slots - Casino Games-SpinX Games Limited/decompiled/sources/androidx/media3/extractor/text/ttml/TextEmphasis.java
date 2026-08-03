package androidx.media3.extractor.text.ttml;

/* loaded from: classes2.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final java.util.regex.Pattern WHITESPACE_PATTERN = java.util.regex.Pattern.compile("\\s+");
    private static final com.google.common.collect.ImmutableSet<java.lang.String> SINGLE_STYLE_VALUES = com.google.common.collect.ImmutableSet.of("auto", "none");
    private static final com.google.common.collect.ImmutableSet<java.lang.String> MARK_SHAPE_VALUES = com.google.common.collect.ImmutableSet.of("dot", "sesame", "circle");
    private static final com.google.common.collect.ImmutableSet<java.lang.String> MARK_FILL_VALUES = com.google.common.collect.ImmutableSet.of("filled", "open");
    private static final com.google.common.collect.ImmutableSet<java.lang.String> POSITION_VALUES = com.google.common.collect.ImmutableSet.of("after", "before", "outside");

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public static androidx.media3.extractor.text.ttml.TextEmphasis parse(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(com.google.common.collect.ImmutableSet.copyOf(android.text.TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static androidx.media3.extractor.text.ttml.TextEmphasis parseWords(com.google.common.collect.ImmutableSet<java.lang.String> immutableSet) {
        char c;
        int i;
        int hashCode;
        java.lang.String str = (java.lang.String) com.google.common.collect.Iterables.getFirst(com.google.common.collect.Sets.intersection(POSITION_VALUES, immutableSet), "outside");
        int hashCode2 = str.hashCode();
        char c2 = 0;
        int i2 = -1;
        if (hashCode2 == -1392885889) {
            if (str.equals("before")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode2 != -1106037339) {
            if (hashCode2 == 92734940 && str.equals("after")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("outside")) {
                c = 1;
            }
            c = 65535;
        }
        int i3 = c != 0 ? c != 1 ? 1 : -2 : 2;
        com.google.common.collect.Sets.SetView intersection = com.google.common.collect.Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!intersection.isEmpty()) {
            java.lang.String str2 = (java.lang.String) intersection.iterator().next();
            int hashCode3 = str2.hashCode();
            if (hashCode3 == 3005871) {
                str2.equals("auto");
            } else if (hashCode3 == 3387192 && str2.equals("none")) {
                i2 = 0;
            }
            return new androidx.media3.extractor.text.ttml.TextEmphasis(i2, 0, i3);
        }
        com.google.common.collect.Sets.SetView intersection2 = com.google.common.collect.Sets.intersection(MARK_FILL_VALUES, immutableSet);
        com.google.common.collect.Sets.SetView intersection3 = com.google.common.collect.Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (intersection2.isEmpty() && intersection3.isEmpty()) {
            return new androidx.media3.extractor.text.ttml.TextEmphasis(-1, 0, i3);
        }
        java.lang.String str3 = (java.lang.String) com.google.common.collect.Iterables.getFirst(intersection2, "filled");
        int hashCode4 = str3.hashCode();
        if (hashCode4 == -1274499742) {
            str3.equals("filled");
        } else if (hashCode4 == 3417674 && str3.equals("open")) {
            i = 2;
            java.lang.String str4 = (java.lang.String) com.google.common.collect.Iterables.getFirst(intersection3, "circle");
            hashCode = str4.hashCode();
            if (hashCode != -1360216880) {
                if (str4.equals("circle")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else if (hashCode != -905816648) {
                if (hashCode == 99657) {
                }
                c2 = 65535;
            } else {
                if (str4.equals("sesame")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
            return new androidx.media3.extractor.text.ttml.TextEmphasis(c2 != 0 ? c2 != 1 ? 1 : 3 : 2, i, i3);
        }
        i = 1;
        java.lang.String str42 = (java.lang.String) com.google.common.collect.Iterables.getFirst(intersection3, "circle");
        hashCode = str42.hashCode();
        if (hashCode != -1360216880) {
        }
        return new androidx.media3.extractor.text.ttml.TextEmphasis(c2 != 0 ? c2 != 1 ? 1 : 3 : 2, i, i3);
    }
}
