package com.google.re2j;

/* loaded from: classes9.dex */
class Parser {
    private static final int[][] ANY_TABLE = {new int[]{0, 1114111, 1}};
    private static final java.lang.String ERR_DUPLICATE_NAMED_CAPTURE = "duplicate capture group name";
    private static final java.lang.String ERR_INTERNAL_ERROR = "regexp/syntax: internal error";
    private static final java.lang.String ERR_INVALID_CHAR_CLASS = "invalid character class";
    private static final java.lang.String ERR_INVALID_CHAR_RANGE = "invalid character class range";
    private static final java.lang.String ERR_INVALID_ESCAPE = "invalid escape sequence";
    private static final java.lang.String ERR_INVALID_NAMED_CAPTURE = "invalid named capture";
    private static final java.lang.String ERR_INVALID_PERL_OP = "invalid or unsupported Perl syntax";
    private static final java.lang.String ERR_INVALID_REPEAT_OP = "invalid nested repetition operator";
    private static final java.lang.String ERR_INVALID_REPEAT_SIZE = "invalid repeat count";
    private static final java.lang.String ERR_MISSING_BRACKET = "missing closing ]";
    private static final java.lang.String ERR_MISSING_PAREN = "missing closing )";
    private static final java.lang.String ERR_MISSING_REPEAT_ARGUMENT = "missing argument to repetition operator";
    private static final java.lang.String ERR_TRAILING_BACKSLASH = "trailing backslash at end of expression";
    private int flags;
    private com.google.re2j.Regexp free;
    private final java.lang.String wholeRegexp;
    private final com.google.re2j.Parser.Stack stack = new com.google.re2j.Parser.Stack(null);
    private int numCap = 0;
    private final java.util.Map<java.lang.String, java.lang.Integer> namedGroups = new java.util.HashMap();

    static class Stack extends java.util.ArrayList<com.google.re2j.Regexp> {
        private Stack() {
        }

        /* synthetic */ Stack(com.google.re2j.Parser.AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.util.ArrayList, java.util.AbstractList
        public void removeRange(int i, int i2) {
            super.removeRange(i, i2);
        }
    }

    Parser(java.lang.String str, int i) {
        this.wholeRegexp = str;
        this.flags = i;
    }

    private com.google.re2j.Regexp newRegexp(com.google.re2j.Regexp.Op op) {
        com.google.re2j.Regexp regexp = this.free;
        if (regexp != null && regexp.subs != null && regexp.subs.length > 0) {
            this.free = regexp.subs[0];
            regexp.reinit();
            regexp.op = op;
            return regexp;
        }
        return new com.google.re2j.Regexp(op);
    }

    private void reuse(com.google.re2j.Regexp regexp) {
        if (regexp.subs != null && regexp.subs.length > 0) {
            regexp.subs[0] = this.free;
        }
        this.free = regexp;
    }

    private com.google.re2j.Regexp pop() {
        return this.stack.remove(r0.size() - 1);
    }

    private com.google.re2j.Regexp[] popToPseudo() {
        int size = this.stack.size();
        int i = size;
        while (i > 0 && !this.stack.get(i - 1).op.isPseudo()) {
            i--;
        }
        com.google.re2j.Regexp[] regexpArr = (com.google.re2j.Regexp[]) this.stack.subList(i, size).toArray(new com.google.re2j.Regexp[size - i]);
        this.stack.removeRange(i, size);
        return regexpArr;
    }

    private com.google.re2j.Regexp push(com.google.re2j.Regexp regexp) {
        if (regexp.op == com.google.re2j.Regexp.Op.CHAR_CLASS && regexp.runes.length == 2 && regexp.runes[0] == regexp.runes[1]) {
            if (maybeConcat(regexp.runes[0], this.flags & (-2))) {
                return null;
            }
            regexp.op = com.google.re2j.Regexp.Op.LITERAL;
            regexp.runes = new int[]{regexp.runes[0]};
            regexp.flags = this.flags & (-2);
        } else if ((regexp.op == com.google.re2j.Regexp.Op.CHAR_CLASS && regexp.runes.length == 4 && regexp.runes[0] == regexp.runes[1] && regexp.runes[2] == regexp.runes[3] && com.google.re2j.Unicode.simpleFold(regexp.runes[0]) == regexp.runes[2] && com.google.re2j.Unicode.simpleFold(regexp.runes[2]) == regexp.runes[0]) || (regexp.op == com.google.re2j.Regexp.Op.CHAR_CLASS && regexp.runes.length == 2 && regexp.runes[0] + 1 == regexp.runes[1] && com.google.re2j.Unicode.simpleFold(regexp.runes[0]) == regexp.runes[1] && com.google.re2j.Unicode.simpleFold(regexp.runes[1]) == regexp.runes[0])) {
            if (maybeConcat(regexp.runes[0], this.flags | 1)) {
                return null;
            }
            regexp.op = com.google.re2j.Regexp.Op.LITERAL;
            regexp.runes = new int[]{regexp.runes[0]};
            regexp.flags = this.flags | 1;
        } else {
            maybeConcat(-1, 0);
        }
        this.stack.add(regexp);
        return regexp;
    }

    private boolean maybeConcat(int i, int i2) {
        int size = this.stack.size();
        if (size < 2) {
            return false;
        }
        com.google.re2j.Regexp regexp = this.stack.get(size - 1);
        com.google.re2j.Regexp regexp2 = this.stack.get(size - 2);
        if (regexp.op == com.google.re2j.Regexp.Op.LITERAL && regexp2.op == com.google.re2j.Regexp.Op.LITERAL && (regexp.flags & 1) == (regexp2.flags & 1)) {
            regexp2.runes = concatRunes(regexp2.runes, regexp.runes);
            if (i >= 0) {
                regexp.runes = new int[]{i};
                regexp.flags = i2;
                return true;
            }
            pop();
            reuse(regexp);
        }
        return false;
    }

    private com.google.re2j.Regexp newLiteral(int i, int i2) {
        com.google.re2j.Regexp newRegexp = newRegexp(com.google.re2j.Regexp.Op.LITERAL);
        newRegexp.flags = i2;
        if ((i2 & 1) != 0) {
            i = minFoldRune(i);
        }
        newRegexp.runes = new int[]{i};
        return newRegexp;
    }

    private static int minFoldRune(int i) {
        if (i < 65 || i > 66639) {
            return i;
        }
        int i2 = i;
        for (int simpleFold = com.google.re2j.Unicode.simpleFold(i); simpleFold != i; simpleFold = com.google.re2j.Unicode.simpleFold(simpleFold)) {
            if (i2 > simpleFold) {
                i2 = simpleFold;
            }
        }
        return i2;
    }

    private void literal(int i) {
        push(newLiteral(i, this.flags));
    }

    private com.google.re2j.Regexp op(com.google.re2j.Regexp.Op op) {
        com.google.re2j.Regexp newRegexp = newRegexp(op);
        newRegexp.flags = this.flags;
        return push(newRegexp);
    }

    private void repeat(com.google.re2j.Regexp.Op op, int i, int i2, int i3, com.google.re2j.Parser.StringIterator stringIterator, int i4) throws com.google.re2j.PatternSyntaxException {
        int i5 = this.flags;
        if ((i5 & 64) != 0) {
            if (stringIterator.more() && stringIterator.lookingAt('?')) {
                stringIterator.skip(1);
                i5 ^= 32;
            }
            if (i4 != -1) {
                throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_REPEAT_OP, stringIterator.from(i4));
            }
        }
        int size = this.stack.size();
        if (size == 0) {
            throw new com.google.re2j.PatternSyntaxException(ERR_MISSING_REPEAT_ARGUMENT, stringIterator.from(i3));
        }
        int i6 = size - 1;
        com.google.re2j.Regexp regexp = this.stack.get(i6);
        if (regexp.op.isPseudo()) {
            throw new com.google.re2j.PatternSyntaxException(ERR_MISSING_REPEAT_ARGUMENT, stringIterator.from(i3));
        }
        com.google.re2j.Regexp newRegexp = newRegexp(op);
        newRegexp.min = i;
        newRegexp.max = i2;
        newRegexp.flags = i5;
        newRegexp.subs = new com.google.re2j.Regexp[]{regexp};
        this.stack.set(i6, newRegexp);
    }

    private com.google.re2j.Regexp concat() {
        maybeConcat(-1, 0);
        com.google.re2j.Regexp[] popToPseudo = popToPseudo();
        if (popToPseudo.length == 0) {
            return push(newRegexp(com.google.re2j.Regexp.Op.EMPTY_MATCH));
        }
        return push(collapse(popToPseudo, com.google.re2j.Regexp.Op.CONCAT));
    }

    private com.google.re2j.Regexp alternate() {
        com.google.re2j.Regexp[] popToPseudo = popToPseudo();
        if (popToPseudo.length > 0) {
            cleanAlt(popToPseudo[popToPseudo.length - 1]);
        }
        if (popToPseudo.length == 0) {
            return push(newRegexp(com.google.re2j.Regexp.Op.NO_MATCH));
        }
        return push(collapse(popToPseudo, com.google.re2j.Regexp.Op.ALTERNATE));
    }

    private void cleanAlt(com.google.re2j.Regexp regexp) {
        if (regexp.op == com.google.re2j.Regexp.Op.CHAR_CLASS) {
            regexp.runes = new com.google.re2j.CharClass(regexp.runes).cleanClass().toArray();
            if (regexp.runes.length == 2 && regexp.runes[0] == 0 && regexp.runes[1] == 1114111) {
                regexp.runes = null;
                regexp.op = com.google.re2j.Regexp.Op.ANY_CHAR;
            } else if (regexp.runes.length == 4 && regexp.runes[0] == 0 && regexp.runes[1] == 9 && regexp.runes[2] == 11 && regexp.runes[3] == 1114111) {
                regexp.runes = null;
                regexp.op = com.google.re2j.Regexp.Op.ANY_CHAR_NOT_NL;
            }
        }
    }

    private com.google.re2j.Regexp collapse(com.google.re2j.Regexp[] regexpArr, com.google.re2j.Regexp.Op op) {
        if (regexpArr.length == 1) {
            return regexpArr[0];
        }
        int i = 0;
        for (com.google.re2j.Regexp regexp : regexpArr) {
            i += regexp.op == op ? regexp.subs.length : 1;
        }
        com.google.re2j.Regexp[] regexpArr2 = new com.google.re2j.Regexp[i];
        int i2 = 0;
        for (com.google.re2j.Regexp regexp2 : regexpArr) {
            if (regexp2.op == op) {
                java.lang.System.arraycopy(regexp2.subs, 0, regexpArr2, i2, regexp2.subs.length);
                i2 += regexp2.subs.length;
                reuse(regexp2);
            } else {
                regexpArr2[i2] = regexp2;
                i2++;
            }
        }
        com.google.re2j.Regexp newRegexp = newRegexp(op);
        newRegexp.subs = regexpArr2;
        if (op == com.google.re2j.Regexp.Op.ALTERNATE) {
            newRegexp.subs = factor(newRegexp.subs, newRegexp.flags);
            if (newRegexp.subs.length == 1) {
                com.google.re2j.Regexp regexp3 = newRegexp.subs[0];
                reuse(newRegexp);
                return regexp3;
            }
        }
        return newRegexp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        r9 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.google.re2j.Regexp[] factor(com.google.re2j.Regexp[] regexpArr, int i) {
        int i2;
        com.google.re2j.Regexp regexp;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        if (regexpArr.length < 2) {
            return regexpArr;
        }
        int length = regexpArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int[] iArr2 = null;
        for (int i10 = 0; i10 <= length; i10++) {
            if (i10 < length) {
                com.google.re2j.Regexp regexp2 = regexpArr[i10];
                if (regexp2.op == com.google.re2j.Regexp.Op.CONCAT && regexp2.subs.length > 0) {
                    regexp2 = regexp2.subs[0];
                }
                if (regexp2.op == com.google.re2j.Regexp.Op.LITERAL) {
                    iArr = regexp2.runes;
                    i4 = regexp2.runes.length;
                    i3 = 1 & regexp2.flags;
                } else {
                    i3 = 0;
                    i4 = 0;
                    iArr = null;
                }
                if (i3 == i6) {
                    int i11 = 0;
                    while (i11 < i9 && i11 < i4 && iArr2[i11] == iArr[i11]) {
                        i11++;
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
                iArr = null;
            }
            if (i10 != i8) {
                if (i10 == i8 + 1) {
                    i5 = i7 + 1;
                    regexpArr[i7] = regexpArr[i8];
                } else {
                    com.google.re2j.Regexp newRegexp = newRegexp(com.google.re2j.Regexp.Op.LITERAL);
                    newRegexp.flags = i6;
                    newRegexp.runes = com.google.re2j.Utils.subarray(iArr2, 0, i9);
                    for (int i12 = i8; i12 < i10; i12++) {
                        regexpArr[i12] = removeLeadingString(regexpArr[i12], i9);
                    }
                    com.google.re2j.Regexp collapse = collapse(subarray(regexpArr, i8, i10), com.google.re2j.Regexp.Op.ALTERNATE);
                    com.google.re2j.Regexp newRegexp2 = newRegexp(com.google.re2j.Regexp.Op.CONCAT);
                    newRegexp2.subs = new com.google.re2j.Regexp[]{newRegexp, collapse};
                    i5 = i7 + 1;
                    regexpArr[i7] = newRegexp2;
                }
                i7 = i5;
            }
            i8 = i10;
            i6 = i3;
            iArr2 = iArr;
            i9 = i4;
        }
        int i13 = 0;
        int i14 = 0;
        com.google.re2j.Regexp regexp3 = null;
        for (int i15 = 0; i15 <= i7; i15++) {
            if (i15 < i7) {
                regexp = leadingRegexp(regexpArr[i15]);
                if (regexp3 != null) {
                    if (regexp3.equals(regexp)) {
                        if (!isCharClass(regexp3)) {
                            if (regexp3.op == com.google.re2j.Regexp.Op.REPEAT && regexp3.min == regexp3.max && isCharClass(regexp3.subs[0])) {
                            }
                        }
                    }
                }
            } else {
                regexp = null;
            }
            if (i15 != i14) {
                if (i15 == i14 + 1) {
                    regexpArr[i13] = regexpArr[i14];
                } else {
                    int i16 = i14;
                    while (i16 < i15) {
                        regexpArr[i16] = removeLeadingRegexp(regexpArr[i16], i16 != i14);
                        i16++;
                    }
                    com.google.re2j.Regexp collapse2 = collapse(subarray(regexpArr, i14, i15), com.google.re2j.Regexp.Op.ALTERNATE);
                    com.google.re2j.Regexp newRegexp3 = newRegexp(com.google.re2j.Regexp.Op.CONCAT);
                    newRegexp3.subs = new com.google.re2j.Regexp[]{regexp3, collapse2};
                    regexpArr[i13] = newRegexp3;
                }
                i13++;
            }
            i14 = i15;
            regexp3 = regexp;
        }
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 <= i13; i19++) {
            if (i19 >= i13 || !isCharClass(regexpArr[i19])) {
                if (i19 != i18) {
                    int i20 = i18 + 1;
                    if (i19 == i20) {
                        i2 = i17 + 1;
                        regexpArr[i17] = regexpArr[i18];
                    } else {
                        int i21 = i18;
                        for (int i22 = i20; i22 < i19; i22++) {
                            com.google.re2j.Regexp regexp4 = regexpArr[i21];
                            com.google.re2j.Regexp regexp5 = regexpArr[i22];
                            if (regexp4.op.ordinal() >= regexp5.op.ordinal()) {
                                if (regexp4.op == regexp5.op) {
                                    if ((regexp4.runes != null ? regexp4.runes.length : 0) >= (regexp5.runes != null ? regexp5.runes.length : 0)) {
                                    }
                                }
                            }
                            i21 = i22;
                        }
                        com.google.re2j.Regexp regexp6 = regexpArr[i18];
                        regexpArr[i18] = regexpArr[i21];
                        regexpArr[i21] = regexp6;
                        while (i20 < i19) {
                            mergeCharClass(regexpArr[i18], regexpArr[i20]);
                            reuse(regexpArr[i20]);
                            i20++;
                        }
                        cleanAlt(regexpArr[i18]);
                        i2 = i17 + 1;
                        regexpArr[i17] = regexpArr[i18];
                    }
                    i17 = i2;
                }
                if (i19 < i13) {
                    regexpArr[i17] = regexpArr[i19];
                    i17++;
                }
                i18 = i19 + 1;
            }
        }
        int i23 = 0;
        int i24 = 0;
        while (i23 < i17) {
            int i25 = i23 + 1;
            if (i25 >= i17 || regexpArr[i23].op != com.google.re2j.Regexp.Op.EMPTY_MATCH || regexpArr[i25].op != com.google.re2j.Regexp.Op.EMPTY_MATCH) {
                regexpArr[i24] = regexpArr[i23];
                i24++;
            }
            i23 = i25;
        }
        return subarray(regexpArr, 0, i24);
    }

    private com.google.re2j.Regexp removeLeadingString(com.google.re2j.Regexp regexp, int i) {
        if (regexp.op == com.google.re2j.Regexp.Op.CONCAT && regexp.subs.length > 0) {
            com.google.re2j.Regexp removeLeadingString = removeLeadingString(regexp.subs[0], i);
            regexp.subs[0] = removeLeadingString;
            if (removeLeadingString.op == com.google.re2j.Regexp.Op.EMPTY_MATCH) {
                reuse(removeLeadingString);
                int length = regexp.subs.length;
                if (length == 0 || length == 1) {
                    regexp.op = com.google.re2j.Regexp.Op.EMPTY_MATCH;
                    regexp.subs = null;
                    return regexp;
                }
                if (length == 2) {
                    com.google.re2j.Regexp regexp2 = regexp.subs[1];
                    reuse(regexp);
                    return regexp2;
                }
                regexp.subs = subarray(regexp.subs, 1, regexp.subs.length);
                return regexp;
            }
        } else if (regexp.op == com.google.re2j.Regexp.Op.LITERAL) {
            regexp.runes = com.google.re2j.Utils.subarray(regexp.runes, i, regexp.runes.length);
            if (regexp.runes.length == 0) {
                regexp.op = com.google.re2j.Regexp.Op.EMPTY_MATCH;
            }
        }
        return regexp;
    }

    private static com.google.re2j.Regexp leadingRegexp(com.google.re2j.Regexp regexp) {
        if (regexp.op == com.google.re2j.Regexp.Op.EMPTY_MATCH) {
            return null;
        }
        if (regexp.op == com.google.re2j.Regexp.Op.CONCAT && regexp.subs.length > 0) {
            regexp = regexp.subs[0];
            if (regexp.op == com.google.re2j.Regexp.Op.EMPTY_MATCH) {
                return null;
            }
        }
        return regexp;
    }

    private com.google.re2j.Regexp removeLeadingRegexp(com.google.re2j.Regexp regexp, boolean z) {
        if (regexp.op == com.google.re2j.Regexp.Op.CONCAT && regexp.subs.length > 0) {
            if (z) {
                reuse(regexp.subs[0]);
            }
            regexp.subs = subarray(regexp.subs, 1, regexp.subs.length);
            int length = regexp.subs.length;
            if (length == 0) {
                regexp.op = com.google.re2j.Regexp.Op.EMPTY_MATCH;
                regexp.subs = com.google.re2j.Regexp.EMPTY_SUBS;
                return regexp;
            }
            if (length != 1) {
                return regexp;
            }
            com.google.re2j.Regexp regexp2 = regexp.subs[0];
            reuse(regexp);
            return regexp2;
        }
        if (z) {
            reuse(regexp);
        }
        return newRegexp(com.google.re2j.Regexp.Op.EMPTY_MATCH);
    }

    private static com.google.re2j.Regexp literalRegexp(java.lang.String str, int i) {
        com.google.re2j.Regexp regexp = new com.google.re2j.Regexp(com.google.re2j.Regexp.Op.LITERAL);
        regexp.flags = i;
        regexp.runes = com.google.re2j.Utils.stringToRunes(str);
        return regexp;
    }

    static class StringIterator {
        private int pos = 0;
        private final java.lang.String str;

        StringIterator(java.lang.String str) {
            this.str = str;
        }

        int pos() {
            return this.pos;
        }

        void rewindTo(int i) {
            this.pos = i;
        }

        boolean more() {
            return this.pos < this.str.length();
        }

        int peek() {
            return this.str.codePointAt(this.pos);
        }

        void skip(int i) {
            this.pos += i;
        }

        void skipString(java.lang.String str) {
            this.pos += str.length();
        }

        int pop() {
            int codePointAt = this.str.codePointAt(this.pos);
            this.pos += java.lang.Character.charCount(codePointAt);
            return codePointAt;
        }

        boolean lookingAt(char c) {
            return this.str.charAt(this.pos) == c;
        }

        boolean lookingAt(java.lang.String str) {
            return rest().startsWith(str);
        }

        java.lang.String rest() {
            return this.str.substring(this.pos);
        }

        java.lang.String from(int i) {
            return this.str.substring(i, this.pos);
        }

        public java.lang.String toString() {
            return rest();
        }
    }

    static com.google.re2j.Regexp parse(java.lang.String str, int i) throws com.google.re2j.PatternSyntaxException {
        return new com.google.re2j.Parser(str, i).parseInternal();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0044. Please report as an issue. */
    private com.google.re2j.Regexp parseInternal() throws com.google.re2j.PatternSyntaxException {
        int i;
        com.google.re2j.Regexp.Op op;
        int i2 = this.flags;
        if ((i2 & 2) != 0) {
            return literalRegexp(this.wholeRegexp, i2);
        }
        com.google.re2j.Parser.StringIterator stringIterator = new com.google.re2j.Parser.StringIterator(this.wholeRegexp);
        int i3 = -1;
        short s = -1;
        int i4 = -1;
        while (true) {
            int i5 = 0;
            if (stringIterator.more()) {
                int peek = stringIterator.peek();
                if (peek != 36) {
                    if (peek == 46) {
                        if ((this.flags & 8) != 0) {
                            op(com.google.re2j.Regexp.Op.ANY_CHAR);
                        } else {
                            op(com.google.re2j.Regexp.Op.ANY_CHAR_NOT_NL);
                        }
                        stringIterator.skip(1);
                    } else {
                        if (peek != 63) {
                            if (peek == 94) {
                                if ((this.flags & 16) != 0) {
                                    op(com.google.re2j.Regexp.Op.BEGIN_TEXT);
                                } else {
                                    op(com.google.re2j.Regexp.Op.BEGIN_LINE);
                                }
                                stringIterator.skip(1);
                            } else if (peek == 91) {
                                parseClass(stringIterator);
                            } else if (peek == 92) {
                                int pos = stringIterator.pos();
                                stringIterator.skip(1);
                                if ((this.flags & 64) != 0 && stringIterator.more()) {
                                    int pop = stringIterator.pop();
                                    if (pop == 81) {
                                        java.lang.String rest = stringIterator.rest();
                                        int indexOf = rest.indexOf("\\E");
                                        if (indexOf >= 0) {
                                            rest = rest.substring(0, indexOf);
                                        }
                                        stringIterator.skipString(rest);
                                        stringIterator.skipString("\\E");
                                        while (i5 < rest.length()) {
                                            int codePointAt = rest.codePointAt(i5);
                                            literal(codePointAt);
                                            i5 += java.lang.Character.charCount(codePointAt);
                                        }
                                    } else if (pop == 98) {
                                        op(com.google.re2j.Regexp.Op.WORD_BOUNDARY);
                                    } else if (pop != 122) {
                                        switch (pop) {
                                            case 65:
                                                op(com.google.re2j.Regexp.Op.BEGIN_TEXT);
                                                break;
                                            case 66:
                                                op(com.google.re2j.Regexp.Op.NO_WORD_BOUNDARY);
                                                break;
                                            case 67:
                                                throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_ESCAPE, "\\C");
                                            default:
                                                stringIterator.rewindTo(pos);
                                                break;
                                        }
                                    } else {
                                        op(com.google.re2j.Regexp.Op.END_TEXT);
                                    }
                                }
                                com.google.re2j.Regexp newRegexp = newRegexp(com.google.re2j.Regexp.Op.CHAR_CLASS);
                                newRegexp.flags = this.flags;
                                if (stringIterator.lookingAt("\\p") || stringIterator.lookingAt("\\P")) {
                                    com.google.re2j.CharClass charClass = new com.google.re2j.CharClass();
                                    if (parseUnicodeClass(stringIterator, charClass)) {
                                        newRegexp.runes = charClass.toArray();
                                        push(newRegexp);
                                    }
                                }
                                com.google.re2j.CharClass charClass2 = new com.google.re2j.CharClass();
                                if (parsePerlClassEscape(stringIterator, charClass2)) {
                                    newRegexp.runes = charClass2.toArray();
                                    push(newRegexp);
                                } else {
                                    stringIterator.rewindTo(pos);
                                    reuse(newRegexp);
                                    literal(parseEscape(stringIterator));
                                }
                            } else if (peek == 123) {
                                i = stringIterator.pos();
                                int parseRepeat = parseRepeat(stringIterator);
                                if (parseRepeat < 0) {
                                    stringIterator.rewindTo(i);
                                    literal(stringIterator.pop());
                                } else {
                                    i4 = parseRepeat >> 16;
                                    s = (short) (parseRepeat & 65535);
                                    repeat(com.google.re2j.Regexp.Op.REPEAT, i4, s, i, stringIterator, i3);
                                }
                                i3 = i;
                            } else if (peek != 124) {
                                switch (peek) {
                                    case 40:
                                        if ((this.flags & 64) != 0 && stringIterator.lookingAt("(?")) {
                                            parsePerlFlags(stringIterator);
                                            break;
                                        } else {
                                            com.google.re2j.Regexp op2 = op(com.google.re2j.Regexp.Op.LEFT_PAREN);
                                            int i6 = this.numCap + 1;
                                            this.numCap = i6;
                                            op2.cap = i6;
                                            break;
                                        }
                                    case 41:
                                        parseRightParen();
                                        break;
                                    case 42:
                                    case 43:
                                        break;
                                    default:
                                        literal(stringIterator.pop());
                                        break;
                                }
                            } else {
                                parseVerticalBar();
                            }
                        }
                        i = stringIterator.pos();
                        int pop2 = stringIterator.pop();
                        if (pop2 == 42) {
                            op = com.google.re2j.Regexp.Op.STAR;
                        } else if (pop2 == 43) {
                            op = com.google.re2j.Regexp.Op.PLUS;
                        } else {
                            op = pop2 != 63 ? null : com.google.re2j.Regexp.Op.QUEST;
                        }
                        repeat(op, i4, s, i, stringIterator, i3);
                        i3 = i;
                    }
                    i3 = -1;
                } else if ((this.flags & 16) != 0) {
                    op(com.google.re2j.Regexp.Op.END_TEXT).flags |= 256;
                } else {
                    op(com.google.re2j.Regexp.Op.END_LINE);
                }
                stringIterator.skip(1);
                i3 = -1;
            } else {
                concat();
                if (swapVerticalBar()) {
                    pop();
                }
                alternate();
                if (this.stack.size() != 1) {
                    throw new com.google.re2j.PatternSyntaxException(ERR_MISSING_PAREN, this.wholeRegexp);
                }
                this.stack.get(0).namedGroups = this.namedGroups;
                return this.stack.get(0);
            }
        }
    }

    private static int parseRepeat(com.google.re2j.Parser.StringIterator stringIterator) throws com.google.re2j.PatternSyntaxException {
        int parseInt;
        int pos = stringIterator.pos();
        if (stringIterator.more() && stringIterator.lookingAt(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ)) {
            stringIterator.skip(1);
            int parseInt2 = parseInt(stringIterator);
            if (parseInt2 == -1 || !stringIterator.more()) {
                return -1;
            }
            if (stringIterator.lookingAt(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)) {
                stringIterator.skip(1);
                if (!stringIterator.more()) {
                    return -1;
                }
                if (stringIterator.lookingAt(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ)) {
                    parseInt = -1;
                } else {
                    parseInt = parseInt(stringIterator);
                    if (parseInt == -1) {
                        return -1;
                    }
                }
            } else {
                parseInt = parseInt2;
            }
            if (stringIterator.more() && stringIterator.lookingAt(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ)) {
                stringIterator.skip(1);
                if (parseInt2 < 0 || parseInt2 > 1000 || parseInt == -2 || parseInt > 1000 || (parseInt >= 0 && parseInt2 > parseInt)) {
                    throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_REPEAT_SIZE, stringIterator.from(pos));
                }
                return (parseInt2 << 16) | (65535 & parseInt);
            }
        }
        return -1;
    }

    private void parsePerlFlags(com.google.re2j.Parser.StringIterator stringIterator) throws com.google.re2j.PatternSyntaxException {
        int pos = stringIterator.pos();
        java.lang.String rest = stringIterator.rest();
        if (rest.startsWith("(?P<")) {
            int indexOf = rest.indexOf(62);
            if (indexOf < 0) {
                throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_NAMED_CAPTURE, rest);
            }
            java.lang.String substring = rest.substring(4, indexOf);
            stringIterator.skipString(substring);
            stringIterator.skip(5);
            if (!isValidCaptureName(substring)) {
                throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_NAMED_CAPTURE, rest.substring(0, indexOf));
            }
            com.google.re2j.Regexp op = op(com.google.re2j.Regexp.Op.LEFT_PAREN);
            int i = this.numCap + 1;
            this.numCap = i;
            op.cap = i;
            if (this.namedGroups.put(substring, java.lang.Integer.valueOf(this.numCap)) != null) {
                throw new com.google.re2j.PatternSyntaxException(ERR_DUPLICATE_NAMED_CAPTURE, substring);
            }
            op.f3919name = substring;
            return;
        }
        stringIterator.skip(2);
        int i2 = this.flags;
        boolean z = false;
        char c = 1;
        while (stringIterator.more()) {
            int pop = stringIterator.pop();
            if (pop != 41) {
                if (pop == 45) {
                    if (c < 0) {
                        break;
                    }
                    i2 = ~i2;
                    c = 65535;
                    z = false;
                } else if (pop != 58) {
                    if (pop == 85) {
                        i2 |= 32;
                    } else if (pop == 105) {
                        i2 |= 1;
                    } else if (pop == 109) {
                        i2 &= -17;
                    } else if (pop != 115) {
                        break;
                    } else {
                        i2 |= 8;
                    }
                    z = true;
                }
            }
            if (c < 0) {
                if (z) {
                    i2 = ~i2;
                }
            }
            if (pop == 58) {
                op(com.google.re2j.Regexp.Op.LEFT_PAREN);
            }
            this.flags = i2;
            return;
        }
        throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_PERL_OP, stringIterator.from(pos));
    }

    private static boolean isValidCaptureName(java.lang.String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '_' && !com.google.re2j.Utils.isalnum(charAt)) {
                return false;
            }
        }
        return true;
    }

    private static int parseInt(com.google.re2j.Parser.StringIterator stringIterator) {
        int peek;
        int pos = stringIterator.pos();
        while (stringIterator.more() && (peek = stringIterator.peek()) >= 48 && peek <= 57) {
            stringIterator.skip(1);
        }
        java.lang.String from = stringIterator.from(pos);
        if (from.isEmpty()) {
            return -1;
        }
        if (from.length() > 1 && from.charAt(0) == '0') {
            return -1;
        }
        if (from.length() > 8) {
            return -2;
        }
        return java.lang.Integer.valueOf(from, 10).intValue();
    }

    private static boolean isCharClass(com.google.re2j.Regexp regexp) {
        return (regexp.op == com.google.re2j.Regexp.Op.LITERAL && regexp.runes.length == 1) || regexp.op == com.google.re2j.Regexp.Op.CHAR_CLASS || regexp.op == com.google.re2j.Regexp.Op.ANY_CHAR_NOT_NL || regexp.op == com.google.re2j.Regexp.Op.ANY_CHAR;
    }

    /* renamed from: com.google.re2j.Parser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$re2j$Regexp$Op;

        static {
            int[] iArr = new int[com.google.re2j.Regexp.Op.values().length];
            $SwitchMap$com$google$re2j$Regexp$Op = iArr;
            try {
                iArr[com.google.re2j.Regexp.Op.LITERAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CHAR_CLASS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ANY_CHAR_NOT_NL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ANY_CHAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private static boolean matchRune(com.google.re2j.Regexp regexp, int i) {
        int i2 = com.google.re2j.Parser.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[regexp.op.ordinal()];
        if (i2 == 1) {
            return regexp.runes.length == 1 && regexp.runes[0] == i;
        }
        if (i2 != 2) {
            return i2 != 3 ? i2 == 4 : i != 10;
        }
        for (int i3 = 0; i3 < regexp.runes.length; i3 += 2) {
            if (regexp.runes[i3] <= i && i <= regexp.runes[i3 + 1]) {
                return true;
            }
        }
        return false;
    }

    private void parseVerticalBar() {
        concat();
        if (swapVerticalBar()) {
            return;
        }
        op(com.google.re2j.Regexp.Op.VERTICAL_BAR);
    }

    private static void mergeCharClass(com.google.re2j.Regexp regexp, com.google.re2j.Regexp regexp2) {
        int i = com.google.re2j.Parser.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[regexp.op.ordinal()];
        if (i == 1) {
            if (regexp2.runes[0] == regexp.runes[0] && regexp2.flags == regexp.flags) {
                return;
            }
            regexp.op = com.google.re2j.Regexp.Op.CHAR_CLASS;
            regexp.runes = new com.google.re2j.CharClass().appendLiteral(regexp.runes[0], regexp.flags).appendLiteral(regexp2.runes[0], regexp2.flags).toArray();
            return;
        }
        if (i != 2) {
            if (i == 3 && matchRune(regexp2, 10)) {
                regexp.op = com.google.re2j.Regexp.Op.ANY_CHAR;
                return;
            }
            return;
        }
        if (regexp2.op == com.google.re2j.Regexp.Op.LITERAL) {
            regexp.runes = new com.google.re2j.CharClass(regexp.runes).appendLiteral(regexp2.runes[0], regexp2.flags).toArray();
        } else {
            regexp.runes = new com.google.re2j.CharClass(regexp.runes).appendClass(regexp2.runes).toArray();
        }
    }

    private boolean swapVerticalBar() {
        int size = this.stack.size();
        if (size >= 3 && this.stack.get(size - 2).op == com.google.re2j.Regexp.Op.VERTICAL_BAR) {
            int i = size - 1;
            if (isCharClass(this.stack.get(i))) {
                int i2 = size - 3;
                if (isCharClass(this.stack.get(i2))) {
                    com.google.re2j.Regexp regexp = this.stack.get(i);
                    com.google.re2j.Regexp regexp2 = this.stack.get(i2);
                    if (regexp.op.ordinal() > regexp2.op.ordinal()) {
                        this.stack.set(i2, regexp);
                    } else {
                        regexp2 = regexp;
                        regexp = regexp2;
                    }
                    mergeCharClass(regexp, regexp2);
                    reuse(regexp2);
                    pop();
                    return true;
                }
            }
        }
        if (size < 2) {
            return false;
        }
        int i3 = size - 1;
        com.google.re2j.Regexp regexp3 = this.stack.get(i3);
        int i4 = size - 2;
        com.google.re2j.Regexp regexp4 = this.stack.get(i4);
        if (regexp4.op != com.google.re2j.Regexp.Op.VERTICAL_BAR) {
            return false;
        }
        if (size >= 3) {
            cleanAlt(this.stack.get(size - 3));
        }
        this.stack.set(i4, regexp3);
        this.stack.set(i3, regexp4);
        return true;
    }

    private void parseRightParen() throws com.google.re2j.PatternSyntaxException {
        concat();
        if (swapVerticalBar()) {
            pop();
        }
        alternate();
        if (this.stack.size() < 2) {
            throw new com.google.re2j.PatternSyntaxException(ERR_INTERNAL_ERROR, "stack underflow");
        }
        com.google.re2j.Regexp pop = pop();
        com.google.re2j.Regexp pop2 = pop();
        if (pop2.op != com.google.re2j.Regexp.Op.LEFT_PAREN) {
            throw new com.google.re2j.PatternSyntaxException(ERR_MISSING_PAREN, this.wholeRegexp);
        }
        this.flags = pop2.flags;
        if (pop2.cap == 0) {
            push(pop);
            return;
        }
        pop2.op = com.google.re2j.Regexp.Op.CAPTURE;
        pop2.subs = new com.google.re2j.Regexp[]{pop};
        push(pop2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r6.peek() <= 55) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int parseEscape(com.google.re2j.Parser.StringIterator stringIterator) throws com.google.re2j.PatternSyntaxException {
        int pos = stringIterator.pos();
        stringIterator.skip(1);
        if (!stringIterator.more()) {
            throw new com.google.re2j.PatternSyntaxException(ERR_TRAILING_BACKSLASH);
        }
        int pop = stringIterator.pop();
        if (pop == 97) {
            return 7;
        }
        if (pop == 102) {
            return 12;
        }
        if (pop == 110) {
            return 10;
        }
        if (pop == 114) {
            return 13;
        }
        if (pop == 116) {
            return 9;
        }
        if (pop == 118) {
            return 11;
        }
        if (pop != 120) {
            switch (pop) {
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                    if (stringIterator.more()) {
                        if (stringIterator.peek() >= 48) {
                            break;
                        }
                    }
                    break;
                case 48:
                    int i = pop - 48;
                    for (int i2 = 1; i2 < 3 && stringIterator.more() && stringIterator.peek() >= 48 && stringIterator.peek() <= 55; i2++) {
                        i = ((i * 8) + stringIterator.peek()) - 48;
                        stringIterator.skip(1);
                    }
                    return i;
                default:
                    if (!com.google.re2j.Utils.isalnum(pop)) {
                        return pop;
                    }
                    break;
            }
        } else if (stringIterator.more()) {
            int pop2 = stringIterator.pop();
            if (pop2 == 123) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (!stringIterator.more()) {
                        break;
                    }
                    int pop3 = stringIterator.pop();
                    if (pop3 != 125) {
                        int unhex = com.google.re2j.Utils.unhex(pop3);
                        if (unhex < 0 || (i4 = (i4 * 16) + unhex) > 1114111) {
                            break;
                        }
                        i3++;
                    } else if (i3 != 0) {
                        return i4;
                    }
                }
            } else {
                int unhex2 = com.google.re2j.Utils.unhex(pop2);
                if (stringIterator.more()) {
                    int unhex3 = com.google.re2j.Utils.unhex(stringIterator.pop());
                    if (unhex2 >= 0 && unhex3 >= 0) {
                        return (unhex2 * 16) + unhex3;
                    }
                }
            }
        }
        throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_ESCAPE, stringIterator.from(pos));
    }

    private static int parseClassChar(com.google.re2j.Parser.StringIterator stringIterator, int i) throws com.google.re2j.PatternSyntaxException {
        if (!stringIterator.more()) {
            throw new com.google.re2j.PatternSyntaxException(ERR_MISSING_BRACKET, stringIterator.from(i));
        }
        if (stringIterator.lookingAt('\\')) {
            return parseEscape(stringIterator);
        }
        return stringIterator.pop();
    }

    private boolean parsePerlClassEscape(com.google.re2j.Parser.StringIterator stringIterator, com.google.re2j.CharClass charClass) {
        int pos = stringIterator.pos();
        if ((this.flags & 64) == 0 || !stringIterator.more() || stringIterator.pop() != 92 || !stringIterator.more()) {
            return false;
        }
        stringIterator.pop();
        com.google.re2j.CharGroup charGroup = com.google.re2j.CharGroup.PERL_GROUPS.get(stringIterator.from(pos));
        if (charGroup == null) {
            return false;
        }
        charClass.appendGroup(charGroup, (this.flags & 1) != 0);
        return true;
    }

    private boolean parseNamedClass(com.google.re2j.Parser.StringIterator stringIterator, com.google.re2j.CharClass charClass) throws com.google.re2j.PatternSyntaxException {
        java.lang.String rest = stringIterator.rest();
        int indexOf = rest.indexOf(":]");
        if (indexOf < 0) {
            return false;
        }
        java.lang.String substring = rest.substring(0, indexOf + 2);
        stringIterator.skipString(substring);
        com.google.re2j.CharGroup charGroup = com.google.re2j.CharGroup.POSIX_GROUPS.get(substring);
        if (charGroup == null) {
            throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_CHAR_RANGE, substring);
        }
        charClass.appendGroup(charGroup, (this.flags & 1) != 0);
        return true;
    }

    private static com.google.re2j.Parser.Pair<int[][], int[][]> unicodeTable(java.lang.String str) {
        if (str.equals("Any")) {
            int[][] iArr = ANY_TABLE;
            return com.google.re2j.Parser.Pair.of(iArr, iArr);
        }
        int[][] iArr2 = com.google.re2j.UnicodeTables.CATEGORIES.get(str);
        if (iArr2 != null) {
            return com.google.re2j.Parser.Pair.of(iArr2, com.google.re2j.UnicodeTables.FOLD_CATEGORIES.get(str));
        }
        int[][] iArr3 = com.google.re2j.UnicodeTables.SCRIPTS.get(str);
        if (iArr3 != null) {
            return com.google.re2j.Parser.Pair.of(iArr3, com.google.re2j.UnicodeTables.FOLD_SCRIPT.get(str));
        }
        return null;
    }

    private boolean parseUnicodeClass(com.google.re2j.Parser.StringIterator stringIterator, com.google.re2j.CharClass charClass) throws com.google.re2j.PatternSyntaxException {
        java.lang.String substring;
        int pos = stringIterator.pos();
        if ((this.flags & 128) == 0 || !(stringIterator.lookingAt("\\p") || stringIterator.lookingAt("\\P"))) {
            return false;
        }
        stringIterator.skip(1);
        int i = stringIterator.pop() == 80 ? -1 : 1;
        if (!stringIterator.more()) {
            stringIterator.rewindTo(pos);
            throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_CHAR_RANGE, stringIterator.rest());
        }
        int pop = stringIterator.pop();
        if (pop != 123) {
            substring = com.google.re2j.Utils.runeToString(pop);
        } else {
            java.lang.String rest = stringIterator.rest();
            int indexOf = rest.indexOf(125);
            if (indexOf < 0) {
                stringIterator.rewindTo(pos);
                throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_CHAR_RANGE, stringIterator.rest());
            }
            substring = rest.substring(0, indexOf);
            stringIterator.skipString(substring);
            stringIterator.skip(1);
        }
        if (!substring.isEmpty() && substring.charAt(0) == '^') {
            i = -i;
            substring = substring.substring(1);
        }
        com.google.re2j.Parser.Pair<int[][], int[][]> unicodeTable = unicodeTable(substring);
        if (unicodeTable == null) {
            throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_CHAR_RANGE, stringIterator.from(pos));
        }
        int[][] iArr = unicodeTable.first;
        int[][] iArr2 = unicodeTable.second;
        if ((this.flags & 1) == 0 || iArr2 == null) {
            charClass.appendTableWithSign(iArr, i);
        } else {
            charClass.appendClassWithSign(new com.google.re2j.CharClass().appendTable(iArr).appendTable(iArr2).cleanClass().toArray(), i);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseClass(com.google.re2j.Parser.StringIterator stringIterator) throws com.google.re2j.PatternSyntaxException {
        char c;
        int i;
        int pos = stringIterator.pos();
        stringIterator.skip(1);
        com.google.re2j.Regexp newRegexp = newRegexp(com.google.re2j.Regexp.Op.CHAR_CLASS);
        newRegexp.flags = this.flags;
        com.google.re2j.CharClass charClass = new com.google.re2j.CharClass();
        if (stringIterator.more() && stringIterator.lookingAt(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString)) {
            stringIterator.skip(1);
            if ((this.flags & 4) == 0) {
                charClass.appendRange(10, 10);
            }
            c = 65535;
        } else {
            c = 1;
        }
        boolean z = true;
        while (true) {
            if (!stringIterator.more() || stringIterator.peek() != 93 || z) {
                if (stringIterator.more() && stringIterator.lookingAt('-') && (this.flags & 64) == 0 && !z) {
                    java.lang.String rest = stringIterator.rest();
                    if (rest.equals("-") || !rest.startsWith("-]")) {
                        break;
                    }
                }
                int pos2 = stringIterator.pos();
                if (stringIterator.lookingAt("[:")) {
                    if (parseNamedClass(stringIterator, charClass)) {
                        continue;
                        z = false;
                    } else {
                        stringIterator.rewindTo(pos2);
                    }
                }
                if (!parseUnicodeClass(stringIterator, charClass) && !parsePerlClassEscape(stringIterator, charClass)) {
                    stringIterator.rewindTo(pos2);
                    int parseClassChar = parseClassChar(stringIterator, pos);
                    if (stringIterator.more() && stringIterator.lookingAt('-')) {
                        stringIterator.skip(1);
                        if (stringIterator.more() && stringIterator.lookingAt(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST)) {
                            stringIterator.skip(-1);
                        } else {
                            i = parseClassChar(stringIterator, pos);
                            if (i < parseClassChar) {
                                throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_CHAR_RANGE, stringIterator.from(pos2));
                            }
                            if ((this.flags & 1) != 0) {
                                charClass.appendRange(parseClassChar, i);
                            } else {
                                charClass.appendFoldedRange(parseClassChar, i);
                            }
                        }
                    }
                    i = parseClassChar;
                    if ((this.flags & 1) != 0) {
                    }
                }
                z = false;
            } else {
                stringIterator.skip(1);
                charClass.cleanClass();
                if (c < 0) {
                    charClass.negateClass();
                }
                newRegexp.runes = charClass.toArray();
                push(newRegexp);
                return;
            }
        }
        stringIterator.rewindTo(pos);
        throw new com.google.re2j.PatternSyntaxException(ERR_INVALID_CHAR_RANGE, stringIterator.rest());
    }

    static com.google.re2j.Regexp[] subarray(com.google.re2j.Regexp[] regexpArr, int i, int i2) {
        com.google.re2j.Regexp[] regexpArr2 = new com.google.re2j.Regexp[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            regexpArr2[i3 - i] = regexpArr[i3];
        }
        return regexpArr2;
    }

    static class Pair<F, S> {
        final F first;
        final S second;

        Pair(F f, S s) {
            this.first = f;
            this.second = s;
        }

        static <F, S> com.google.re2j.Parser.Pair<F, S> of(F f, S s) {
            return new com.google.re2j.Parser.Pair<>(f, s);
        }
    }

    private static int[] concatRunes(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr.length + iArr2.length];
        java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        java.lang.System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }
}
