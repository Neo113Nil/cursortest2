package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mr {
    private final java.lang.String b;
    private final java.lang.String c;
    public final java.lang.String e;

    @javax.annotation.Nullable
    private final java.lang.String g;
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.regex.Pattern f3656a = java.util.regex.Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    private mr(java.lang.String str, java.lang.String str2, java.lang.String str3, @javax.annotation.Nullable java.lang.String str4) {
        this.c = str;
        this.e = str2;
        this.b = str3;
        this.g = str4;
    }

    public static com.facetec.sdk.mr e(java.lang.String str) {
        java.util.regex.Matcher matcher = d.matcher(str);
        if (!matcher.lookingAt()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No subtype found for: \"");
            sb.append(str);
            sb.append('\"');
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.String lowerCase = matcher.group(1).toLowerCase(java.util.Locale.US);
        java.lang.String lowerCase2 = matcher.group(2).toLowerCase(java.util.Locale.US);
        java.util.regex.Matcher matcher2 = f3656a.matcher(str);
        java.lang.String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Parameter is not formatted correctly: \"");
                sb2.append(str.substring(end));
                sb2.append("\" for: \"");
                sb2.append(str);
                sb2.append('\"');
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            java.lang.String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase(io.ktor.http.auth.HttpAuthHeader.Parameters.Charset)) {
                java.lang.String group2 = matcher2.group(2);
                if (group2 != null) {
                    if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                        group2 = group2.substring(1, group2.length() - 1);
                    }
                } else {
                    group2 = matcher2.group(3);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Multiple charsets defined: \"");
                    sb3.append(str2);
                    sb3.append("\" and: \"");
                    sb3.append(group2);
                    sb3.append("\" for: \"");
                    sb3.append(str);
                    sb3.append('\"');
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                str2 = group2;
            }
        }
        return new com.facetec.sdk.mr(str, lowerCase, lowerCase2, str2);
    }

    @javax.annotation.Nullable
    public static com.facetec.sdk.mr d(java.lang.String str) {
        try {
            return e(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @javax.annotation.Nullable
    public final java.nio.charset.Charset d() {
        return b(null);
    }

    @javax.annotation.Nullable
    public final java.nio.charset.Charset b(@javax.annotation.Nullable java.nio.charset.Charset charset) {
        try {
            java.lang.String str = this.g;
            return str != null ? java.nio.charset.Charset.forName(str) : charset;
        } catch (java.lang.IllegalArgumentException unused) {
            return charset;
        }
    }

    public final java.lang.String toString() {
        return this.c;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        return (obj instanceof com.facetec.sdk.mr) && ((com.facetec.sdk.mr) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
