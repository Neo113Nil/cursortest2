package com.google.re2j;

/* loaded from: classes9.dex */
class Compiler {
    private final com.google.re2j.Prog prog = new com.google.re2j.Prog();
    private static final int[] ANY_RUNE_NOT_NL = {0, 9, 11, 1114111};
    private static final int[] ANY_RUNE = {0, 1114111};

    static class Frag {
        final int i;
        boolean nullable;
        int out;

        Frag() {
            this(0, 0);
        }

        Frag(int i) {
            this(i, 0);
        }

        Frag(int i, int i2) {
            this(i, i2, false);
        }

        Frag(int i, int i2, boolean z) {
            this.i = i;
            this.out = i2;
            this.nullable = z;
        }
    }

    private Compiler() {
        newInst(5);
    }

    static com.google.re2j.Prog compileRegexp(com.google.re2j.Regexp regexp) {
        com.google.re2j.Compiler compiler = new com.google.re2j.Compiler();
        com.google.re2j.Compiler.Frag compile = compiler.compile(regexp);
        compiler.prog.patch(compile.out, compiler.newInst(6).i);
        compiler.prog.start = compile.i;
        return compiler.prog;
    }

    private com.google.re2j.Compiler.Frag newInst(int i) {
        this.prog.addInst(i);
        return new com.google.re2j.Compiler.Frag(this.prog.numInst() - 1, 0, true);
    }

    private com.google.re2j.Compiler.Frag nop() {
        com.google.re2j.Compiler.Frag newInst = newInst(7);
        newInst.out = newInst.i << 1;
        return newInst;
    }

    private com.google.re2j.Compiler.Frag fail() {
        return new com.google.re2j.Compiler.Frag();
    }

    private com.google.re2j.Compiler.Frag cap(int i) {
        com.google.re2j.Compiler.Frag newInst = newInst(3);
        newInst.out = newInst.i << 1;
        this.prog.getInst(newInst.i).arg = i;
        int i2 = i + 1;
        if (this.prog.numCap < i2) {
            this.prog.numCap = i2;
        }
        return newInst;
    }

    private com.google.re2j.Compiler.Frag cat(com.google.re2j.Compiler.Frag frag, com.google.re2j.Compiler.Frag frag2) {
        if (frag.i == 0 || frag2.i == 0) {
            return fail();
        }
        this.prog.patch(frag.out, frag2.i);
        return new com.google.re2j.Compiler.Frag(frag.i, frag2.out, frag.nullable && frag2.nullable);
    }

    private com.google.re2j.Compiler.Frag alt(com.google.re2j.Compiler.Frag frag, com.google.re2j.Compiler.Frag frag2) {
        if (frag.i == 0) {
            return frag2;
        }
        if (frag2.i == 0) {
            return frag;
        }
        boolean z = true;
        com.google.re2j.Compiler.Frag newInst = newInst(1);
        com.google.re2j.Inst inst = this.prog.getInst(newInst.i);
        inst.out = frag.i;
        inst.arg = frag2.i;
        newInst.out = this.prog.append(frag.out, frag2.out);
        if (!frag.nullable && !frag2.nullable) {
            z = false;
        }
        newInst.nullable = z;
        return newInst;
    }

    private com.google.re2j.Compiler.Frag loop(com.google.re2j.Compiler.Frag frag, boolean z) {
        com.google.re2j.Compiler.Frag newInst = newInst(1);
        com.google.re2j.Inst inst = this.prog.getInst(newInst.i);
        if (z) {
            inst.arg = frag.i;
            newInst.out = newInst.i << 1;
        } else {
            inst.out = frag.i;
            newInst.out = (newInst.i << 1) | 1;
        }
        this.prog.patch(frag.out, newInst.i);
        return newInst;
    }

    private com.google.re2j.Compiler.Frag quest(com.google.re2j.Compiler.Frag frag, boolean z) {
        com.google.re2j.Compiler.Frag newInst = newInst(1);
        com.google.re2j.Inst inst = this.prog.getInst(newInst.i);
        if (z) {
            inst.arg = frag.i;
            newInst.out = newInst.i << 1;
        } else {
            inst.out = frag.i;
            newInst.out = (newInst.i << 1) | 1;
        }
        newInst.out = this.prog.append(newInst.out, frag.out);
        return newInst;
    }

    private com.google.re2j.Compiler.Frag star(com.google.re2j.Compiler.Frag frag, boolean z) {
        if (frag.nullable) {
            return quest(plus(frag, z), z);
        }
        return loop(frag, z);
    }

    private com.google.re2j.Compiler.Frag plus(com.google.re2j.Compiler.Frag frag, boolean z) {
        return new com.google.re2j.Compiler.Frag(frag.i, loop(frag, z).out, frag.nullable);
    }

    private com.google.re2j.Compiler.Frag empty(int i) {
        com.google.re2j.Compiler.Frag newInst = newInst(4);
        this.prog.getInst(newInst.i).arg = i;
        newInst.out = newInst.i << 1;
        return newInst;
    }

    private com.google.re2j.Compiler.Frag rune(int i, int i2) {
        return rune(new int[]{i}, i2);
    }

    private com.google.re2j.Compiler.Frag rune(int[] iArr, int i) {
        com.google.re2j.Compiler.Frag newInst = newInst(8);
        newInst.nullable = false;
        com.google.re2j.Inst inst = this.prog.getInst(newInst.i);
        inst.runes = iArr;
        int i2 = i & 1;
        if (iArr.length != 1 || com.google.re2j.Unicode.simpleFold(iArr[0]) == iArr[0]) {
            i2 = 0;
        }
        inst.arg = i2;
        newInst.out = newInst.i << 1;
        if (((i2 & 1) == 0 && iArr.length == 1) || (iArr.length == 2 && iArr[0] == iArr[1])) {
            inst.op = 9;
            return newInst;
        }
        if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
            inst.op = 10;
            return newInst;
        }
        if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
            inst.op = 11;
        }
        return newInst;
    }

    /* renamed from: com.google.re2j.Compiler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$re2j$Regexp$Op;

        static {
            int[] iArr = new int[com.google.re2j.Regexp.Op.values().length];
            $SwitchMap$com$google$re2j$Regexp$Op = iArr;
            try {
                iArr[com.google.re2j.Regexp.Op.NO_MATCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.EMPTY_MATCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.LITERAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CHAR_CLASS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ANY_CHAR_NOT_NL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ANY_CHAR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.BEGIN_LINE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.END_LINE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.BEGIN_TEXT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.END_TEXT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.WORD_BOUNDARY.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.NO_WORD_BOUNDARY.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CAPTURE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.STAR.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.PLUS.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.QUEST.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.CONCAT.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$re2j$Regexp$Op[com.google.re2j.Regexp.Op.ALTERNATE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    private com.google.re2j.Compiler.Frag compile(com.google.re2j.Regexp regexp) {
        com.google.re2j.Compiler.Frag frag = null;
        int i = 0;
        switch (com.google.re2j.Compiler.AnonymousClass1.$SwitchMap$com$google$re2j$Regexp$Op[regexp.op.ordinal()]) {
            case 1:
                return fail();
            case 2:
                return nop();
            case 3:
                if (regexp.runes.length == 0) {
                    return nop();
                }
                int[] iArr = regexp.runes;
                int length = iArr.length;
                while (i < length) {
                    com.google.re2j.Compiler.Frag rune = rune(iArr[i], regexp.flags);
                    frag = frag == null ? rune : cat(frag, rune);
                    i++;
                }
                return frag;
            case 4:
                return rune(regexp.runes, regexp.flags);
            case 5:
                return rune(ANY_RUNE_NOT_NL, 0);
            case 6:
                return rune(ANY_RUNE, 0);
            case 7:
                return empty(1);
            case 8:
                return empty(2);
            case 9:
                return empty(4);
            case 10:
                return empty(8);
            case 11:
                return empty(16);
            case 12:
                return empty(32);
            case 13:
                return cat(cat(cap(regexp.cap << 1), compile(regexp.subs[0])), cap((regexp.cap << 1) | 1));
            case 14:
                return star(compile(regexp.subs[0]), (regexp.flags & 32) != 0);
            case 15:
                return plus(compile(regexp.subs[0]), (regexp.flags & 32) != 0);
            case 16:
                return quest(compile(regexp.subs[0]), (regexp.flags & 32) != 0);
            case 17:
                if (regexp.subs.length == 0) {
                    return nop();
                }
                com.google.re2j.Regexp[] regexpArr = regexp.subs;
                int length2 = regexpArr.length;
                while (i < length2) {
                    com.google.re2j.Compiler.Frag compile = compile(regexpArr[i]);
                    frag = frag == null ? compile : cat(frag, compile);
                    i++;
                }
                return frag;
            case 18:
                if (regexp.subs.length == 0) {
                    return nop();
                }
                com.google.re2j.Regexp[] regexpArr2 = regexp.subs;
                int length3 = regexpArr2.length;
                while (i < length3) {
                    com.google.re2j.Compiler.Frag compile2 = compile(regexpArr2[i]);
                    frag = frag == null ? compile2 : alt(frag, compile2);
                    i++;
                }
                return frag;
            default:
                throw new java.lang.IllegalStateException("regexp: unhandled case in compile");
        }
    }
}
