package com.google.re2j;

/* loaded from: classes9.dex */
class Regexp {
    static final com.google.re2j.Regexp[] EMPTY_SUBS = new com.google.re2j.Regexp[0];
    int cap;
    int flags;
    int max;
    int min;

    /* renamed from: name, reason: collision with root package name */
    java.lang.String f3919name;
    java.util.Map<java.lang.String, java.lang.Integer> namedGroups;
    com.google.re2j.Regexp.Op op;
    int[] runes;
    com.google.re2j.Regexp[] subs;

    enum Op {
        NO_MATCH,
        EMPTY_MATCH,
        LITERAL,
        CHAR_CLASS,
        ANY_CHAR_NOT_NL,
        ANY_CHAR,
        BEGIN_LINE,
        END_LINE,
        BEGIN_TEXT,
        END_TEXT,
        WORD_BOUNDARY,
        NO_WORD_BOUNDARY,
        CAPTURE,
        STAR,
        PLUS,
        QUEST,
        REPEAT,
        CONCAT,
        ALTERNATE,
        LEFT_PAREN,
        VERTICAL_BAR;

        final boolean isPseudo() {
            return ordinal() >= LEFT_PAREN.ordinal();
        }
    }

    Regexp(com.google.re2j.Regexp.Op op) {
        this.op = op;
    }

    Regexp(com.google.re2j.Regexp regexp) {
        this.op = regexp.op;
        this.flags = regexp.flags;
        this.subs = regexp.subs;
        this.runes = regexp.runes;
        this.min = regexp.min;
        this.max = regexp.max;
        this.cap = regexp.cap;
        this.f3919name = regexp.f3919name;
        this.namedGroups = regexp.namedGroups;
    }

    void reinit() {
        this.flags = 0;
        this.subs = EMPTY_SUBS;
        this.runes = null;
        this.max = 0;
        this.min = 0;
        this.cap = 0;
        this.f3919name = null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendTo(sb);
        return sb.toString();
    }

    private static void quoteIfHyphen(java.lang.StringBuilder sb, int i) {
        if (i == 45) {
            sb.append('\\');
        }
    }

    private void appendTo(java.lang.StringBuilder sb) {
        int i = 0;
        switch (com.google.re2j.Regexp.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[this.op.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                com.google.re2j.Regexp regexp = this.subs[0];
                if (regexp.op.ordinal() > com.google.re2j.Regexp.Op.CAPTURE.ordinal() || (regexp.op == com.google.re2j.Regexp.Op.LITERAL && regexp.runes.length > 1)) {
                    sb.append("(?:");
                    regexp.appendTo(sb);
                    sb.append(')');
                } else {
                    regexp.appendTo(sb);
                }
                int i2 = com.google.re2j.Regexp.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[this.op.ordinal()];
                if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('+');
                } else if (i2 == 3) {
                    sb.append('?');
                } else if (i2 == 4) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
                    sb.append(this.min);
                    if (this.min != this.max) {
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                        int i3 = this.max;
                        if (i3 >= 0) {
                            sb.append(i3);
                        }
                    }
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
                }
                if ((this.flags & 32) != 0) {
                    sb.append('?');
                    break;
                }
                break;
            case 5:
                sb.append("[^\\x00-\\x{10FFFF}]");
                break;
            case 6:
                sb.append("(?:)");
                break;
            case 7:
                com.google.re2j.Regexp[] regexpArr = this.subs;
                int length = regexpArr.length;
                while (i < length) {
                    com.google.re2j.Regexp regexp2 = regexpArr[i];
                    if (regexp2.op == com.google.re2j.Regexp.Op.ALTERNATE) {
                        sb.append("(?:");
                        regexp2.appendTo(sb);
                        sb.append(')');
                    } else {
                        regexp2.appendTo(sb);
                    }
                    i++;
                }
                break;
            case 8:
                com.google.re2j.Regexp[] regexpArr2 = this.subs;
                int length2 = regexpArr2.length;
                java.lang.String str = "";
                while (i < length2) {
                    com.google.re2j.Regexp regexp3 = regexpArr2[i];
                    sb.append(str);
                    regexp3.appendTo(sb);
                    i++;
                    str = com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER;
                }
                break;
            case 9:
                if ((this.flags & 1) != 0) {
                    sb.append("(?i:");
                }
                int[] iArr = this.runes;
                int length3 = iArr.length;
                while (i < length3) {
                    com.google.re2j.Utils.escapeRune(sb, iArr[i]);
                    i++;
                }
                if ((this.flags & 1) != 0) {
                    sb.append(')');
                    break;
                }
                break;
            case 10:
                sb.append("(?-s:.)");
                break;
            case 11:
                sb.append("(?s:.)");
                break;
            case 12:
                java.lang.String str2 = this.f3919name;
                if (str2 == null || str2.isEmpty()) {
                    sb.append('(');
                } else {
                    sb.append("(?P<");
                    sb.append(this.f3919name);
                    sb.append(">");
                }
                if (this.subs[0].op != com.google.re2j.Regexp.Op.EMPTY_MATCH) {
                    this.subs[0].appendTo(sb);
                }
                sb.append(')');
                break;
            case 13:
                sb.append("\\A");
                break;
            case 14:
                if ((this.flags & 256) != 0) {
                    sb.append("(?-m:$)");
                    break;
                } else {
                    sb.append("\\z");
                    break;
                }
            case 15:
                sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString);
                break;
            case 16:
                sb.append(kotlin.text.Typography.dollar);
                break;
            case 17:
                sb.append("\\b");
                break;
            case 18:
                sb.append("\\B");
                break;
            case 19:
                if (this.runes.length % 2 != 0) {
                    sb.append("[invalid char class]");
                    break;
                } else {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    int[] iArr2 = this.runes;
                    if (iArr2.length == 0) {
                        sb.append("^\\x00-\\x{10FFFF}");
                    } else if (iArr2[0] == 0 && iArr2[iArr2.length - 1] == 1114111) {
                        sb.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString);
                        int i4 = 1;
                        while (true) {
                            int[] iArr3 = this.runes;
                            if (i4 < iArr3.length - 1) {
                                int i5 = iArr3[i4] + 1;
                                int i6 = iArr3[i4 + 1] - 1;
                                quoteIfHyphen(sb, i5);
                                com.google.re2j.Utils.escapeRune(sb, i5);
                                if (i5 != i6) {
                                    sb.append('-');
                                    quoteIfHyphen(sb, i6);
                                    com.google.re2j.Utils.escapeRune(sb, i6);
                                }
                                i4 += 2;
                            }
                        }
                    } else {
                        while (true) {
                            int[] iArr4 = this.runes;
                            if (i < iArr4.length) {
                                int i7 = iArr4[i];
                                int i8 = iArr4[i + 1];
                                quoteIfHyphen(sb, i7);
                                com.google.re2j.Utils.escapeRune(sb, i7);
                                if (i7 != i8) {
                                    sb.append('-');
                                    quoteIfHyphen(sb, i8);
                                    com.google.re2j.Utils.escapeRune(sb, i8);
                                }
                                i += 2;
                            }
                        }
                    }
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                    break;
                }
            default:
                sb.append(this.op);
                break;
        }
    }

    /* renamed from: com.google.re2j.Regexp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$re2j$Regexp$Op;

        static {
            int[] iArr = new int[com.google.re2j.Regexp.Op.values().length];
            $SwitchMap$com$google$re2j$Regexp$Op = iArr;
            try {
                iArr[com.google.re2j.Regexp.Op.STAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.PLUS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.QUEST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.REPEAT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.NO_MATCH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.EMPTY_MATCH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CONCAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ALTERNATE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.LITERAL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ANY_CHAR_NOT_NL.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ANY_CHAR.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CAPTURE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.BEGIN_TEXT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.END_TEXT.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.BEGIN_LINE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.END_LINE.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.WORD_BOUNDARY.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.NO_WORD_BOUNDARY.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CHAR_CLASS.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
        }
    }

    int maxCap() {
        int i = this.op == com.google.re2j.Regexp.Op.CAPTURE ? this.cap : 0;
        com.google.re2j.Regexp[] regexpArr = this.subs;
        if (regexpArr != null) {
            for (com.google.re2j.Regexp regexp : regexpArr) {
                int maxCap = regexp.maxCap();
                if (i < maxCap) {
                    i = maxCap;
                }
            }
        }
        return i;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2;
        int deepHashCode;
        int hashCode2 = this.op.hashCode();
        int i3 = com.google.re2j.Regexp.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[this.op.ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i = (this.flags & 32) * 31;
            hashCode = this.subs[0].hashCode();
        } else {
            if (i3 != 4) {
                if (i3 != 7 && i3 != 8) {
                    if (i3 != 9) {
                        if (i3 == 12) {
                            int i4 = this.cap;
                            java.lang.String str = this.f3919name;
                            i = (i4 * 31) + ((str != null ? str.hashCode() : 0) * 31);
                            hashCode = this.subs[0].hashCode();
                        } else if (i3 == 14) {
                            deepHashCode = this.flags & 256;
                        } else if (i3 != 19) {
                            return hashCode2;
                        }
                    }
                    deepHashCode = java.util.Arrays.hashCode(this.runes);
                } else {
                    deepHashCode = java.util.Arrays.deepHashCode(this.subs);
                }
                i2 = deepHashCode * 31;
                return hashCode2 + i2;
            }
            i = (this.min * 31) + (this.max * 31);
            hashCode = this.subs[0].hashCode();
        }
        i2 = i + (hashCode * 31);
        return hashCode2 + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
    
        if (r0 != 19) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (!(obj instanceof com.google.re2j.Regexp)) {
            return false;
        }
        com.google.re2j.Regexp regexp = (com.google.re2j.Regexp) obj;
        if (this.op != regexp.op) {
            return false;
        }
        int i = com.google.re2j.Regexp.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[this.op.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if ((this.flags & 32) != (regexp.flags & 32) || !this.subs[0].equals(regexp.subs[0])) {
                return false;
            }
        } else if (i != 4) {
            if (i != 7 && i != 8) {
                if (i != 9) {
                    if (i != 12) {
                        if (i == 14) {
                            if ((this.flags & 256) != (regexp.flags & 256)) {
                                return false;
                            }
                        }
                    } else if (this.cap != regexp.cap || ((str = this.f3919name) != null ? !str.equals(regexp.f3919name) : regexp.f3919name != null) || !this.subs[0].equals(regexp.subs[0])) {
                        return false;
                    }
                }
                if (!java.util.Arrays.equals(this.runes, regexp.runes)) {
                    return false;
                }
            } else if (this.subs.length == regexp.subs.length) {
                int i2 = 0;
                while (true) {
                    com.google.re2j.Regexp[] regexpArr = this.subs;
                    if (i2 >= regexpArr.length) {
                        break;
                    }
                    if (!regexpArr[i2].equals(regexp.subs[i2])) {
                        return false;
                    }
                    i2++;
                }
            } else {
                return false;
            }
        } else if ((this.flags & 32) != (regexp.flags & 32) || this.min != regexp.min || this.max != regexp.max || !this.subs[0].equals(regexp.subs[0])) {
            return false;
        }
        return true;
    }
}
