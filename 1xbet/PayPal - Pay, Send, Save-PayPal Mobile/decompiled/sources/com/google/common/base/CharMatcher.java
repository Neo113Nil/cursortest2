package com.google.common.base;

/* loaded from: classes4.dex */
public abstract class CharMatcher implements com.google.common.base.Predicate<java.lang.Character> {
    private static final int DISTINCT_CHARS = 65536;

    private static boolean isSmall(int i, int i2) {
        return i <= 1023 && i2 > i * 64;
    }

    public abstract boolean matches(char c);

    public static com.google.common.base.CharMatcher any() {
        return com.google.common.base.CharMatcher.Any.INSTANCE;
    }

    public static com.google.common.base.CharMatcher none() {
        return com.google.common.base.CharMatcher.None.INSTANCE;
    }

    public static com.google.common.base.CharMatcher whitespace() {
        return com.google.common.base.CharMatcher.Whitespace.INSTANCE;
    }

    public static com.google.common.base.CharMatcher breakingWhitespace() {
        return com.google.common.base.CharMatcher.BreakingWhitespace.INSTANCE;
    }

    public static com.google.common.base.CharMatcher ascii() {
        return com.google.common.base.CharMatcher.Ascii.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher digit() {
        return com.google.common.base.CharMatcher.Digit.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaDigit() {
        return com.google.common.base.CharMatcher.JavaDigit.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLetter() {
        return com.google.common.base.CharMatcher.JavaLetter.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLetterOrDigit() {
        return com.google.common.base.CharMatcher.JavaLetterOrDigit.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaUpperCase() {
        return com.google.common.base.CharMatcher.JavaUpperCase.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher javaLowerCase() {
        return com.google.common.base.CharMatcher.JavaLowerCase.INSTANCE;
    }

    public static com.google.common.base.CharMatcher javaIsoControl() {
        return com.google.common.base.CharMatcher.JavaIsoControl.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher invisible() {
        return com.google.common.base.CharMatcher.Invisible.INSTANCE;
    }

    @java.lang.Deprecated
    public static com.google.common.base.CharMatcher singleWidth() {
        return com.google.common.base.CharMatcher.SingleWidth.INSTANCE;
    }

    public static com.google.common.base.CharMatcher is(char c) {
        return new com.google.common.base.CharMatcher.Is(c);
    }

    public static com.google.common.base.CharMatcher isNot(char c) {
        return new com.google.common.base.CharMatcher.IsNot(c);
    }

    public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length == 1) {
            return is(charSequence.charAt(0));
        }
        if (length == 2) {
            return isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return new com.google.common.base.CharMatcher.AnyOf(charSequence);
    }

    public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    public static com.google.common.base.CharMatcher inRange(char c, char c2) {
        return new com.google.common.base.CharMatcher.InRange(c, c2);
    }

    public static com.google.common.base.CharMatcher forPredicate(com.google.common.base.Predicate<? super java.lang.Character> predicate) {
        return predicate instanceof com.google.common.base.CharMatcher ? (com.google.common.base.CharMatcher) predicate : new com.google.common.base.CharMatcher.ForPredicate(predicate);
    }

    protected CharMatcher() {
    }

    public com.google.common.base.CharMatcher negate() {
        return new com.google.common.base.CharMatcher.Negated(this);
    }

    public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher charMatcher) {
        return new com.google.common.base.CharMatcher.And(this, charMatcher);
    }

    public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher charMatcher) {
        return new com.google.common.base.CharMatcher.Or(this, charMatcher);
    }

    public com.google.common.base.CharMatcher precomputed() {
        return com.google.common.base.Platform.precomputeCharMatcher(this);
    }

    com.google.common.base.CharMatcher precomputedInternal() {
        java.lang.String obj;
        java.util.BitSet bitSet = new java.util.BitSet();
        setBits(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return precomputedPositive(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        final java.lang.String obj2 = toString();
        if (obj2.endsWith(".negate()")) {
            obj = obj2.substring(0, obj2.length() - 9);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj2);
            sb.append(".negate()");
            obj = sb.toString();
        }
        return new com.google.common.base.CharMatcher.NegatedFastMatcher(this, precomputedPositive(65536 - cardinality, bitSet, obj)) { // from class: com.google.common.base.CharMatcher.1
            final /* synthetic */ com.google.common.base.CharMatcher this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
            public java.lang.String toString() {
                return obj2;
            }
        };
    }

    private static com.google.common.base.CharMatcher precomputedPositive(int i, java.util.BitSet bitSet, java.lang.String str) {
        if (i == 0) {
            return none();
        }
        if (i == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i == 2) {
            char nextSetBit = (char) bitSet.nextSetBit(0);
            return isEither(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
        }
        if (isSmall(i, bitSet.length())) {
            return com.google.common.base.SmallCharMatcher.from(bitSet, str);
        }
        return new com.google.common.base.CharMatcher.BitSetMatcher(bitSet, str);
    }

    void setBits(java.util.BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public boolean matchesAnyOf(java.lang.CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesAllOf(java.lang.CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesNoneOf(java.lang.CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public int indexIn(java.lang.CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        com.google.common.base.Preconditions.checkPositionIndex(i, length);
        while (i < length) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexIn(java.lang.CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public int countIn(java.lang.CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public java.lang.String removeFrom(java.lang.CharSequence charSequence) {
        java.lang.String obj = charSequence.toString();
        int indexIn = indexIn(obj);
        if (indexIn == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            if (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    i++;
                } else {
                    charArray[indexIn - i] = charArray[indexIn];
                }
            } else {
                return new java.lang.String(charArray, 0, indexIn - i);
            }
        }
    }

    public java.lang.String retainFrom(java.lang.CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
        java.lang.String obj = charSequence.toString();
        int indexIn = indexIn(obj);
        if (indexIn == -1) {
            return obj;
        }
        char[] charArray = obj.toCharArray();
        charArray[indexIn] = c;
        while (true) {
            indexIn++;
            if (indexIn < charArray.length) {
                if (matches(charArray[indexIn])) {
                    charArray[indexIn] = c;
                }
            } else {
                return new java.lang.String(charArray);
            }
        }
    }

    public java.lang.String replaceFrom(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        java.lang.String obj = charSequence.toString();
        int indexIn = indexIn(obj);
        if (indexIn == -1) {
            return obj;
        }
        int length2 = obj.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((java.lang.CharSequence) obj, i, indexIn);
            sb.append(charSequence2);
            i = indexIn + 1;
            indexIn = indexIn(obj, i);
        } while (indexIn != -1);
        sb.append((java.lang.CharSequence) obj, i, length2);
        return sb.toString();
    }

    public java.lang.String trimFrom(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        while (true) {
            int i2 = length - 1;
            if (i2 <= i || !matches(charSequence.charAt(i2))) {
                break;
            }
            length = i2;
        }
        return charSequence.subSequence(i, length).toString();
    }

    public java.lang.String trimLeadingFrom(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public java.lang.String trimTrailingFrom(java.lang.CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public java.lang.String collapseFrom(java.lang.CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (charAt != c || (i != length - 1 && matches(charSequence.charAt(i + 1)))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
                    sb.append(charSequence, 0, i);
                    sb.append(c);
                    return finishCollapseFrom(charSequence, i + 1, length, c, sb, true);
                }
                i++;
            }
            i++;
        }
        return charSequence.toString();
    }

    public java.lang.String trimAndCollapseFrom(java.lang.CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(charSequence, c);
        }
        int i4 = i3 + 1;
        return finishCollapseFrom(charSequence, i2, i4, c, new java.lang.StringBuilder(i4 - i2), false);
    }

    private java.lang.String finishCollapseFrom(java.lang.CharSequence charSequence, int i, int i2, char c, java.lang.StringBuilder sb, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (!matches(charAt)) {
                sb.append(charAt);
                z = false;
            } else if (!z) {
                sb.append(c);
                z = true;
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.google.common.base.Predicate
    @java.lang.Deprecated
    public boolean apply(java.lang.Character ch) {
        return matches(ch.charValue());
    }

    public java.lang.String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String showCharacter(char c) {
        char[] cArr = {'\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return java.lang.String.copyValueOf(cArr);
    }

    static abstract class FastMatcher extends com.google.common.base.CharMatcher {
        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher precomputed() {
            return this;
        }

        FastMatcher() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return new com.google.common.base.CharMatcher.NegatedFastMatcher(this);
        }
    }

    static abstract class NamedFastMatcher extends com.google.common.base.CharMatcher.FastMatcher {
        private final java.lang.String description;

        NamedFastMatcher(java.lang.String str) {
            this.description = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return this.description;
        }
    }

    /* loaded from: classes9.dex */
    static class NegatedFastMatcher extends com.google.common.base.CharMatcher.Negated {
        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher precomputed() {
            return this;
        }

        NegatedFastMatcher(com.google.common.base.CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    /* loaded from: classes9.dex */
    static final class BitSetMatcher extends com.google.common.base.CharMatcher.NamedFastMatcher {
        private final java.util.BitSet table;

        private BitSetMatcher(java.util.BitSet bitSet, java.lang.String str) {
            super(str);
            this.table = bitSet.length() + 64 < bitSet.size() ? (java.util.BitSet) bitSet.clone() : bitSet;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return this.table.get(c);
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            bitSet.or(this.table);
        }
    }

    /* loaded from: classes9.dex */
    static final class Any extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Any();

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return true;
        }

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public final int indexIn(java.lang.CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final int indexIn(java.lang.CharSequence charSequence, int i) {
            int length = charSequence.length();
            com.google.common.base.Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public final int lastIndexIn(java.lang.CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matchesAllOf(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matchesNoneOf(java.lang.CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String removeFrom(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            java.util.Arrays.fill(cArr, c);
            return new java.lang.String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String replaceFrom(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String collapseFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : java.lang.String.valueOf(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String trimFrom(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public final int countIn(java.lang.CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher charMatcher) {
            return (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher charMatcher) {
            com.google.common.base.Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher negate() {
            return none();
        }
    }

    static final class None extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.None();

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return false;
        }

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public final int indexIn(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final int indexIn(java.lang.CharSequence charSequence, int i) {
            com.google.common.base.Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final int lastIndexIn(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matchesAllOf(java.lang.CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matchesNoneOf(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String removeFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String replaceFrom(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
            com.google.common.base.Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String collapseFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String trimFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String trimLeadingFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String trimTrailingFrom(java.lang.CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public final int countIn(java.lang.CharSequence charSequence) {
            com.google.common.base.Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher charMatcher) {
            com.google.common.base.Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher charMatcher) {
            return (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher negate() {
            return any();
        }
    }

    static final class Whitespace extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final int MULTIPLIER = 1682554634;
        static final java.lang.String TABLE = "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000";
        static final int SHIFT = java.lang.Integer.numberOfLeadingZeros(31);
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Whitespace();

        Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return TABLE.charAt((MULTIPLIER * c) >>> SHIFT) == c;
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(TABLE.charAt(i));
            }
        }
    }

    /* loaded from: classes9.dex */
    static final class BreakingWhitespace extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.BreakingWhitespace();

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c >= 8192 && c <= 8202;
                    }
                }
            }
            return true;
        }

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* loaded from: classes9.dex */
    static final class Ascii extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Ascii();

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return c <= 127;
        }

        Ascii() {
            super("CharMatcher.ascii()");
        }
    }

    /* loaded from: classes9.dex */
    static class RangesMatcher extends com.google.common.base.CharMatcher {
        private final java.lang.String description;
        private final char[] rangeEnds;
        private final char[] rangeStarts;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        RangesMatcher(java.lang.String str, char[] cArr, char[] cArr2) {
            this.description = str;
            this.rangeStarts = cArr;
            this.rangeEnds = cArr2;
            com.google.common.base.Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                com.google.common.base.Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    com.google.common.base.Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            int binarySearch = java.util.Arrays.binarySearch(this.rangeStarts, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            return i >= 0 && c <= this.rangeEnds[i];
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            return this.description;
        }
    }

    /* loaded from: classes9.dex */
    static final class Digit extends com.google.common.base.CharMatcher.RangesMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Digit();
        private static final java.lang.String ZEROES = "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０";

        private static char[] zeroes() {
            return ZEROES.toCharArray();
        }

        private static char[] nines() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) (ZEROES.charAt(i) + '\t');
            }
            return cArr;
        }

        private Digit() {
            super("CharMatcher.digit()", zeroes(), nines());
        }
    }

    /* loaded from: classes9.dex */
    static final class JavaDigit extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaDigit();

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return java.lang.Character.isDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* loaded from: classes9.dex */
    static final class JavaLetter extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaLetter();

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return java.lang.Character.isLetter(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* loaded from: classes9.dex */
    static final class JavaLetterOrDigit extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaLetterOrDigit();

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return java.lang.Character.isLetterOrDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* loaded from: classes9.dex */
    static final class JavaUpperCase extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaUpperCase();

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return java.lang.Character.isUpperCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* loaded from: classes9.dex */
    static final class JavaLowerCase extends com.google.common.base.CharMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaLowerCase();

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return java.lang.Character.isLowerCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* loaded from: classes9.dex */
    static final class JavaIsoControl extends com.google.common.base.CharMatcher.NamedFastMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.JavaIsoControl();

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            if (c > 31) {
                return c >= 127 && c <= 159;
            }
            return true;
        }

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }
    }

    /* loaded from: classes9.dex */
    static final class Invisible extends com.google.common.base.CharMatcher.RangesMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.Invisible();
        private static final java.lang.String RANGE_ENDS = "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb";
        private static final java.lang.String RANGE_STARTS = "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9";

        private Invisible() {
            super("CharMatcher.invisible()", RANGE_STARTS.toCharArray(), RANGE_ENDS.toCharArray());
        }
    }

    /* loaded from: classes9.dex */
    static final class SingleWidth extends com.google.common.base.CharMatcher.RangesMatcher {
        static final com.google.common.base.CharMatcher INSTANCE = new com.google.common.base.CharMatcher.SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* loaded from: classes9.dex */
    static class Negated extends com.google.common.base.CharMatcher {
        final com.google.common.base.CharMatcher original;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        Negated(com.google.common.base.CharMatcher charMatcher) {
            this.original = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.original.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(java.lang.CharSequence charSequence) {
            return this.original.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(java.lang.CharSequence charSequence) {
            return this.original.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(java.lang.CharSequence charSequence) {
            return charSequence.length() - this.original.countIn(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        void setBits(java.util.BitSet bitSet) {
            java.util.BitSet bitSet2 = new java.util.BitSet();
            this.original.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public com.google.common.base.CharMatcher negate() {
            return this.original;
        }

        @Override // com.google.common.base.CharMatcher
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.original);
            sb.append(".negate()");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class And extends com.google.common.base.CharMatcher {
        final com.google.common.base.CharMatcher first;
        final com.google.common.base.CharMatcher second;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        And(com.google.common.base.CharMatcher charMatcher, com.google.common.base.CharMatcher charMatcher2) {
            this.first = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher);
            this.second = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return this.first.matches(c) && this.second.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            java.util.BitSet bitSet2 = new java.util.BitSet();
            this.first.setBits(bitSet2);
            java.util.BitSet bitSet3 = new java.util.BitSet();
            this.second.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.and(");
            sb.append(this.first);
            sb.append(", ");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class Or extends com.google.common.base.CharMatcher {
        final com.google.common.base.CharMatcher first;
        final com.google.common.base.CharMatcher second;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        Or(com.google.common.base.CharMatcher charMatcher, com.google.common.base.CharMatcher charMatcher2) {
            this.first = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher);
            this.second = (com.google.common.base.CharMatcher) com.google.common.base.Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            this.first.setBits(bitSet);
            this.second.setBits(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return this.first.matches(c) || this.second.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.or(");
            sb.append(this.first);
            sb.append(", ");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class Is extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match;

        Is(char c) {
            this.match = c;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return c == this.match;
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String replaceFrom(java.lang.CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.match, c);
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? this : none();
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher negate() {
            return isNot(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            bitSet.set(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.is('");
            sb.append(com.google.common.base.CharMatcher.showCharacter(this.match));
            sb.append("')");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class IsNot extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match;

        IsNot(char c) {
            this.match = c;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return c != this.match;
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher charMatcher) {
            return charMatcher.matches(this.match) ? any() : this;
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            bitSet.set(0, this.match);
            bitSet.set(this.match + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public final com.google.common.base.CharMatcher negate() {
            return is(this.match);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.isNot('");
            sb.append(com.google.common.base.CharMatcher.showCharacter(this.match));
            sb.append("')");
            return sb.toString();
        }
    }

    private static com.google.common.base.CharMatcher.IsEither isEither(char c, char c2) {
        return new com.google.common.base.CharMatcher.IsEither(c, c2);
    }

    /* loaded from: classes9.dex */
    static final class IsEither extends com.google.common.base.CharMatcher.FastMatcher {
        private final char match1;
        private final char match2;

        IsEither(char c, char c2) {
            this.match1 = c;
            this.match2 = c2;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return c == this.match1 || c == this.match2;
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            bitSet.set(this.match1);
            bitSet.set(this.match2);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
            sb.append(com.google.common.base.CharMatcher.showCharacter(this.match1));
            sb.append(com.google.common.base.CharMatcher.showCharacter(this.match2));
            sb.append("\")");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class AnyOf extends com.google.common.base.CharMatcher {
        private final char[] chars;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        AnyOf(java.lang.CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.chars = charArray;
            java.util.Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return java.util.Arrays.binarySearch(this.chars, c) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            for (char c : this.chars) {
                bitSet.set(c);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.chars) {
                sb.append(com.google.common.base.CharMatcher.showCharacter(c));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class InRange extends com.google.common.base.CharMatcher.FastMatcher {
        private final char endInclusive;
        private final char startInclusive;

        InRange(char c, char c2) {
            com.google.common.base.Preconditions.checkArgument(c2 >= c);
            this.startInclusive = c;
            this.endInclusive = c2;
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return this.startInclusive <= c && c <= this.endInclusive;
        }

        @Override // com.google.common.base.CharMatcher
        final void setBits(java.util.BitSet bitSet) {
            bitSet.set(this.startInclusive, this.endInclusive + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.inRange('");
            sb.append(com.google.common.base.CharMatcher.showCharacter(this.startInclusive));
            sb.append("', '");
            sb.append(com.google.common.base.CharMatcher.showCharacter(this.endInclusive));
            sb.append("')");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class ForPredicate extends com.google.common.base.CharMatcher {
        private final com.google.common.base.Predicate<? super java.lang.Character> predicate;

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @java.lang.Deprecated
        public final /* bridge */ /* synthetic */ boolean apply(java.lang.Character ch) {
            return super.apply(ch);
        }

        ForPredicate(com.google.common.base.Predicate<? super java.lang.Character> predicate) {
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public final boolean matches(char c) {
            return this.predicate.apply(java.lang.Character.valueOf(c));
        }

        @Override // com.google.common.base.CharMatcher
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.forPredicate(");
            sb.append(this.predicate);
            sb.append(")");
            return sb.toString();
        }
    }
}
