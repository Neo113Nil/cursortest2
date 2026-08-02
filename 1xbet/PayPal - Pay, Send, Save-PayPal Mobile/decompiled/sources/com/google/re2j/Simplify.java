package com.google.re2j;

/* loaded from: classes9.dex */
class Simplify {

    /* renamed from: com.google.re2j.Simplify$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$re2j$Regexp$Op;

        static {
            int[] iArr = new int[com.google.re2j.Regexp.Op.values().length];
            $SwitchMap$com$google$re2j$Regexp$Op = iArr;
            try {
                iArr[com.google.re2j.Regexp.Op.CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CONCAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ALTERNATE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.STAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.PLUS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.QUEST.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.REPEAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    static com.google.re2j.Regexp simplify(com.google.re2j.Regexp regexp) {
        java.util.ArrayList arrayList;
        if (regexp == null) {
            return null;
        }
        int i = 0;
        switch (com.google.re2j.Simplify.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[regexp.op.ordinal()]) {
            case 1:
            case 2:
            case 3:
                com.google.re2j.Regexp regexp2 = regexp;
                for (int i2 = 0; i2 < regexp.subs.length; i2++) {
                    com.google.re2j.Regexp regexp3 = regexp.subs[i2];
                    com.google.re2j.Regexp simplify = simplify(regexp3);
                    if (regexp2 == regexp && simplify != regexp3) {
                        regexp2 = new com.google.re2j.Regexp(regexp);
                        regexp2.runes = null;
                        regexp2.subs = com.google.re2j.Parser.subarray(regexp.subs, 0, regexp.subs.length);
                    }
                    if (regexp2 != regexp) {
                        regexp2.subs[i2] = simplify;
                    }
                }
                return regexp2;
            case 4:
            case 5:
            case 6:
                return simplify1(regexp.op, regexp.flags, simplify(regexp.subs[0]), regexp);
            case 7:
                if (regexp.min == 0 && regexp.max == 0) {
                    return new com.google.re2j.Regexp(com.google.re2j.Regexp.Op.EMPTY_MATCH);
                }
                com.google.re2j.Regexp simplify2 = simplify(regexp.subs[0]);
                if (regexp.max == -1) {
                    if (regexp.min == 0) {
                        return simplify1(com.google.re2j.Regexp.Op.STAR, regexp.flags, simplify2, null);
                    }
                    if (regexp.min == 1) {
                        return simplify1(com.google.re2j.Regexp.Op.PLUS, regexp.flags, simplify2, null);
                    }
                    com.google.re2j.Regexp regexp4 = new com.google.re2j.Regexp(com.google.re2j.Regexp.Op.CONCAT);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (i < regexp.min - 1) {
                        arrayList2.add(simplify2);
                        i++;
                    }
                    arrayList2.add(simplify1(com.google.re2j.Regexp.Op.PLUS, regexp.flags, simplify2, null));
                    regexp4.subs = (com.google.re2j.Regexp[]) arrayList2.toArray(new com.google.re2j.Regexp[arrayList2.size()]);
                    return regexp4;
                }
                if (regexp.min == 1 && regexp.max == 1) {
                    return simplify2;
                }
                if (regexp.min > 0) {
                    arrayList = new java.util.ArrayList();
                    while (i < regexp.min) {
                        arrayList.add(simplify2);
                        i++;
                    }
                } else {
                    arrayList = null;
                }
                if (regexp.max > regexp.min) {
                    com.google.re2j.Regexp simplify1 = simplify1(com.google.re2j.Regexp.Op.QUEST, regexp.flags, simplify2, null);
                    for (int i3 = regexp.min + 1; i3 < regexp.max; i3++) {
                        com.google.re2j.Regexp regexp5 = new com.google.re2j.Regexp(com.google.re2j.Regexp.Op.CONCAT);
                        regexp5.subs = new com.google.re2j.Regexp[]{simplify2, simplify1};
                        simplify1 = simplify1(com.google.re2j.Regexp.Op.QUEST, regexp.flags, regexp5, null);
                    }
                    if (arrayList == null) {
                        return simplify1;
                    }
                    arrayList.add(simplify1);
                }
                if (arrayList != null) {
                    com.google.re2j.Regexp regexp6 = new com.google.re2j.Regexp(com.google.re2j.Regexp.Op.CONCAT);
                    regexp6.subs = (com.google.re2j.Regexp[]) arrayList.toArray(new com.google.re2j.Regexp[arrayList.size()]);
                    return regexp6;
                }
                return new com.google.re2j.Regexp(com.google.re2j.Regexp.Op.NO_MATCH);
            default:
                return regexp;
        }
    }

    private static com.google.re2j.Regexp simplify1(com.google.re2j.Regexp.Op op, int i, com.google.re2j.Regexp regexp, com.google.re2j.Regexp regexp2) {
        if (regexp.op == com.google.re2j.Regexp.Op.EMPTY_MATCH || (op == regexp.op && (i & 32) == (regexp.flags & 32))) {
            return regexp;
        }
        if (regexp2 != null && regexp2.op == op && (regexp2.flags & 32) == (i & 32) && regexp == regexp2.subs[0]) {
            return regexp2;
        }
        com.google.re2j.Regexp regexp3 = new com.google.re2j.Regexp(op);
        regexp3.flags = i;
        regexp3.subs = new com.google.re2j.Regexp[]{regexp};
        return regexp3;
    }

    private Simplify() {
    }
}
