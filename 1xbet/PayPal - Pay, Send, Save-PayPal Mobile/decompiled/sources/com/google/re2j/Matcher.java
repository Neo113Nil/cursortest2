package com.google.re2j;

/* loaded from: classes9.dex */
public final class Matcher {
    private int anchorFlag;
    private int appendPos;
    private final int groupCount;
    private final int[] groups;
    private boolean hasGroups;
    private boolean hasMatch;
    private int inputLength;
    private com.google.re2j.MatcherInput matcherInput;
    private final java.util.Map<java.lang.String, java.lang.Integer> namedGroups;
    private final com.google.re2j.Pattern pattern;

    private Matcher(com.google.re2j.Pattern pattern) {
        if (pattern == null) {
            throw new java.lang.NullPointerException("pattern is null");
        }
        this.pattern = pattern;
        com.google.re2j.RE2 re2 = pattern.re2();
        int numberOfCapturingGroups = re2.numberOfCapturingGroups();
        this.groupCount = numberOfCapturingGroups;
        this.groups = new int[(numberOfCapturingGroups * 2) + 2];
        this.namedGroups = re2.namedGroups;
    }

    Matcher(com.google.re2j.Pattern pattern, java.lang.CharSequence charSequence) {
        this(pattern);
        reset(charSequence);
    }

    Matcher(com.google.re2j.Pattern pattern, com.google.re2j.MatcherInput matcherInput) {
        this(pattern);
        reset(matcherInput);
    }

    public final com.google.re2j.Pattern pattern() {
        return this.pattern;
    }

    public final com.google.re2j.Matcher reset() {
        this.inputLength = this.matcherInput.length();
        this.appendPos = 0;
        this.hasMatch = false;
        this.hasGroups = false;
        return this;
    }

    public final com.google.re2j.Matcher reset(java.lang.CharSequence charSequence) {
        return reset(com.google.re2j.MatcherInput.utf16(charSequence));
    }

    public final com.google.re2j.Matcher reset(byte[] bArr) {
        return reset(com.google.re2j.MatcherInput.utf8(bArr));
    }

    private com.google.re2j.Matcher reset(com.google.re2j.MatcherInput matcherInput) {
        if (matcherInput == null) {
            throw new java.lang.NullPointerException("input is null");
        }
        this.matcherInput = matcherInput;
        reset();
        return this;
    }

    public final int start() {
        return start(0);
    }

    public final int end() {
        return end(0);
    }

    public final int start(int i) {
        loadGroup(i);
        return this.groups[i * 2];
    }

    public final int start(java.lang.String str) {
        java.lang.Integer num = this.namedGroups.get(str);
        if (num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("group '");
            sb.append(str);
            sb.append("' not found");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return start(num.intValue());
    }

    public final int end(int i) {
        loadGroup(i);
        return this.groups[(i * 2) + 1];
    }

    public final int end(java.lang.String str) {
        java.lang.Integer num = this.namedGroups.get(str);
        if (num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("group '");
            sb.append(str);
            sb.append("' not found");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return end(num.intValue());
    }

    public final java.lang.String group() {
        return group(0);
    }

    public final java.lang.String group(int i) {
        int start = start(i);
        int end = end(i);
        if (start >= 0 || end >= 0) {
            return substring(start, end);
        }
        return null;
    }

    public final java.lang.String group(java.lang.String str) {
        java.lang.Integer num = this.namedGroups.get(str);
        if (num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("group '");
            sb.append(str);
            sb.append("' not found");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return group(num.intValue());
    }

    public final int groupCount() {
        return this.groupCount;
    }

    private void loadGroup(int i) {
        if (i < 0 || i > this.groupCount) {
            throw new java.lang.IndexOutOfBoundsException("Group index out of bounds: ".concat(java.lang.String.valueOf(i)));
        }
        if (!this.hasMatch) {
            throw new java.lang.IllegalStateException("perhaps no match attempted");
        }
        if (i == 0 || this.hasGroups) {
            return;
        }
        int i2 = this.groups[1] + 1;
        int i3 = this.inputLength;
        int i4 = i2 > i3 ? i3 : i2;
        com.google.re2j.RE2 re2 = this.pattern.re2();
        com.google.re2j.MatcherInput matcherInput = this.matcherInput;
        int[] iArr = this.groups;
        if (!re2.match(matcherInput, iArr[0], i4, this.anchorFlag, iArr, this.groupCount + 1)) {
            throw new java.lang.IllegalStateException("inconsistency in matching group data");
        }
        this.hasGroups = true;
    }

    public final boolean matches() {
        return genMatch(0, 2);
    }

    public final boolean lookingAt() {
        return genMatch(0, 1);
    }

    public final boolean find() {
        int i;
        if (this.hasMatch) {
            int[] iArr = this.groups;
            i = iArr[1];
            if (iArr[0] == i) {
                i++;
            }
        } else {
            i = 0;
        }
        return genMatch(i, 0);
    }

    public final boolean find(int i) {
        if (i < 0 || i > this.inputLength) {
            throw new java.lang.IndexOutOfBoundsException("start index out of bounds: ".concat(java.lang.String.valueOf(i)));
        }
        reset();
        return genMatch(i, 0);
    }

    private boolean genMatch(int i, int i2) {
        if (!this.pattern.re2().match(this.matcherInput, i, this.inputLength, i2, this.groups, 1)) {
            return false;
        }
        this.hasMatch = true;
        this.hasGroups = false;
        this.anchorFlag = i2;
        return true;
    }

    final java.lang.String substring(int i, int i2) {
        if (this.matcherInput.getEncoding() == com.google.re2j.MatcherInput.Encoding.UTF_8) {
            return new java.lang.String(this.matcherInput.asBytes(), i, i2 - i);
        }
        return this.matcherInput.asCharSequence().subSequence(i, i2).toString();
    }

    final int inputLength() {
        return this.inputLength;
    }

    public static java.lang.String quoteReplacement(java.lang.String str) {
        if (str.indexOf(92) < 0 && str.indexOf(36) < 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\\' || charAt == '$') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public final com.google.re2j.Matcher appendReplacement(java.lang.StringBuffer stringBuffer, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendReplacement(sb, str);
        stringBuffer.append((java.lang.CharSequence) sb);
        return this;
    }

    public final com.google.re2j.Matcher appendReplacement(java.lang.StringBuilder sb, java.lang.String str) {
        int start = start();
        int end = end();
        int i = this.appendPos;
        if (i < start) {
            sb.append(substring(i, start));
        }
        this.appendPos = end;
        appendReplacementInternal(sb, str);
        return this;
    }

    private void appendReplacementInternal(java.lang.StringBuilder sb, java.lang.String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length - 1) {
            if (str.charAt(i2) == '\\') {
                if (i3 < i2) {
                    sb.append(str.substring(i3, i2));
                }
                i2++;
                i3 = i2;
            } else if (str.charAt(i2) != '$') {
                continue;
            } else {
                int i4 = i2 + 1;
                char charAt = str.charAt(i4);
                if ('0' <= charAt && charAt <= '9') {
                    int i5 = charAt - '0';
                    if (i3 < i2) {
                        sb.append(str.substring(i3, i2));
                    }
                    int i6 = i2 + 2;
                    while (i6 < length) {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 < '0' || charAt2 > '9' || ((i5 * 10) + charAt2) - 48 > this.groupCount) {
                            break;
                        }
                        i6++;
                        i5 = i;
                    }
                    if (i5 > this.groupCount) {
                        throw new java.lang.IndexOutOfBoundsException("n > number of groups: ".concat(java.lang.String.valueOf(i5)));
                    }
                    java.lang.String group = group(i5);
                    if (group != null) {
                        sb.append(group);
                    }
                    i3 = i6;
                    i2 = i6 - 1;
                } else if (charAt != '{') {
                    continue;
                } else {
                    if (i3 < i2) {
                        sb.append(str.substring(i3, i2));
                    }
                    int i7 = i2 + 2;
                    int i8 = i7;
                    while (i8 < str.length() && str.charAt(i8) != '}' && str.charAt(i8) != ' ') {
                        i8++;
                    }
                    if (i8 == str.length() || str.charAt(i8) != '}') {
                        throw new java.lang.IllegalArgumentException("named capture group is missing trailing '}'");
                    }
                    sb.append(group(str.substring(i7, i8)));
                    i3 = i8 + 1;
                    i2 = i4;
                }
            }
            i2++;
        }
        if (i3 < length) {
            sb.append((java.lang.CharSequence) str, i3, length);
        }
    }

    public final java.lang.StringBuffer appendTail(java.lang.StringBuffer stringBuffer) {
        stringBuffer.append(substring(this.appendPos, this.inputLength));
        return stringBuffer;
    }

    public final java.lang.StringBuilder appendTail(java.lang.StringBuilder sb) {
        sb.append(substring(this.appendPos, this.inputLength));
        return sb;
    }

    public final java.lang.String replaceAll(java.lang.String str) {
        return replace(str, true);
    }

    public final java.lang.String replaceFirst(java.lang.String str) {
        return replace(str, false);
    }

    private java.lang.String replace(java.lang.String str, boolean z) {
        reset();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (find()) {
            appendReplacement(stringBuffer, str);
            if (!z) {
                break;
            }
        }
        appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
