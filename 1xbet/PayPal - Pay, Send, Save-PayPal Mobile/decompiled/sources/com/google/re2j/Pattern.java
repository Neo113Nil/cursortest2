package com.google.re2j;

/* loaded from: classes9.dex */
public final class Pattern implements java.io.Serializable {
    public static final int CASE_INSENSITIVE = 1;
    public static final int DISABLE_UNICODE_GROUPS = 8;
    public static final int DOTALL = 2;
    public static final int LONGEST_MATCH = 16;
    public static final int MULTILINE = 4;
    private static final long serialVersionUID = 0;
    private final int flags;
    private final java.lang.String pattern;
    private final transient com.google.re2j.RE2 re2;

    Pattern(java.lang.String str, int i, com.google.re2j.RE2 re2) {
        if (str == null) {
            throw new java.lang.NullPointerException("pattern is null");
        }
        if (re2 == null) {
            throw new java.lang.NullPointerException("re2 is null");
        }
        this.pattern = str;
        this.flags = i;
        this.re2 = re2;
    }

    public final void reset() {
        this.re2.reset();
    }

    public final int flags() {
        return this.flags;
    }

    public final java.lang.String pattern() {
        return this.pattern;
    }

    final com.google.re2j.RE2 re2() {
        return this.re2;
    }

    public static com.google.re2j.Pattern compile(java.lang.String str) {
        return compile(str, str, 0);
    }

    public static com.google.re2j.Pattern compile(java.lang.String str, int i) {
        java.lang.String concat = (i & 1) != 0 ? "(?i)".concat(java.lang.String.valueOf(str)) : str;
        if ((i & 2) != 0) {
            concat = "(?s)".concat(java.lang.String.valueOf(concat));
        }
        if ((i & 4) != 0) {
            concat = "(?m)".concat(java.lang.String.valueOf(concat));
        }
        if ((i & (-32)) != 0) {
            throw new java.lang.IllegalArgumentException("Flags should only be a combination of MULTILINE, DOTALL, CASE_INSENSITIVE, DISABLE_UNICODE_GROUPS, LONGEST_MATCH");
        }
        return compile(concat, str, i);
    }

    private static com.google.re2j.Pattern compile(java.lang.String str, java.lang.String str2, int i) {
        return new com.google.re2j.Pattern(str2, i, com.google.re2j.RE2.compileImpl(str, (i & 8) != 0 ? 84 : com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (i & 16) != 0));
    }

    public static boolean matches(java.lang.String str, java.lang.CharSequence charSequence) {
        return compile(str).matcher(charSequence).matches();
    }

    public static boolean matches(java.lang.String str, byte[] bArr) {
        return compile(str).matcher(bArr).matches();
    }

    public final boolean matches(java.lang.String str) {
        return matcher(str).matches();
    }

    public final boolean matches(byte[] bArr) {
        return matcher(bArr).matches();
    }

    public final com.google.re2j.Matcher matcher(java.lang.CharSequence charSequence) {
        return new com.google.re2j.Matcher(this, charSequence);
    }

    public final com.google.re2j.Matcher matcher(byte[] bArr) {
        return new com.google.re2j.Matcher(this, com.google.re2j.MatcherInput.utf8(bArr));
    }

    final com.google.re2j.Matcher matcher(com.google.re2j.MatcherInput matcherInput) {
        return new com.google.re2j.Matcher(this, matcherInput);
    }

    public final java.lang.String[] split(java.lang.String str) {
        return split(str, 0);
    }

    public final java.lang.String[] split(java.lang.String str, int i) {
        return split(new com.google.re2j.Matcher(this, str), i);
    }

    private java.lang.String[] split(com.google.re2j.Matcher matcher, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (matcher.find()) {
            if (i2 == 0 && matcher.end() == 0) {
                i2 = matcher.end();
            } else {
                if (i > 0 && arrayList.size() == i - 1) {
                    break;
                }
                if (i2 != matcher.start()) {
                    while (i3 > 0) {
                        arrayList.add("");
                        i3--;
                    }
                } else if (i == 0) {
                    i3++;
                    i2 = matcher.end();
                }
                arrayList.add(matcher.substring(i2, matcher.start()));
                i2 = matcher.end();
            }
        }
        if (i == 0 && i2 != matcher.inputLength()) {
            while (i3 > 0) {
                arrayList.add("");
                i3--;
            }
            arrayList.add(matcher.substring(i2, matcher.inputLength()));
        }
        if (i != 0 || arrayList.isEmpty()) {
            arrayList.add(matcher.substring(i2, matcher.inputLength()));
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static java.lang.String quote(java.lang.String str) {
        return com.google.re2j.RE2.quoteMeta(str);
    }

    public final java.lang.String toString() {
        return this.pattern;
    }

    public final int groupCount() {
        return this.re2.numberOfCapturingGroups();
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> namedGroups() {
        return java.util.Collections.unmodifiableMap(this.re2.namedGroups);
    }

    final java.lang.Object readResolve() {
        return compile(this.pattern, this.flags);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.re2j.Pattern pattern = (com.google.re2j.Pattern) obj;
        return this.flags == pattern.flags && this.pattern.equals(pattern.pattern);
    }

    public final int hashCode() {
        return (this.pattern.hashCode() * 31) + this.flags;
    }
}
