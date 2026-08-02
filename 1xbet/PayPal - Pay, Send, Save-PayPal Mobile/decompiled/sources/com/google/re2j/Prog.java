package com.google.re2j;

/* loaded from: classes9.dex */
final class Prog {
    com.google.re2j.Inst[] inst = new com.google.re2j.Inst[10];
    int instSize = 0;
    int numCap = 2;
    int start;

    Prog() {
    }

    final com.google.re2j.Inst getInst(int i) {
        return this.inst[i];
    }

    final int numInst() {
        return this.instSize;
    }

    final void addInst(int i) {
        int i2 = this.instSize;
        com.google.re2j.Inst[] instArr = this.inst;
        if (i2 >= instArr.length) {
            this.inst = (com.google.re2j.Inst[]) java.util.Arrays.copyOf(instArr, instArr.length * 2);
        }
        this.inst[this.instSize] = new com.google.re2j.Inst(i);
        this.instSize++;
    }

    final com.google.re2j.Inst skipNop(int i) {
        com.google.re2j.Inst inst = this.inst[i];
        while (true) {
            if (inst.op != 7 && inst.op != 3) {
                return inst;
            }
            inst = this.inst[i];
            i = inst.out;
        }
    }

    final boolean prefix(java.lang.StringBuilder sb) {
        com.google.re2j.Inst skipNop = skipNop(this.start);
        if (!com.google.re2j.Inst.isRuneOp(skipNop.op) || skipNop.runes.length != 1) {
            return skipNop.op == 6;
        }
        while (com.google.re2j.Inst.isRuneOp(skipNop.op) && skipNop.runes.length == 1 && (skipNop.arg & 1) == 0) {
            sb.appendCodePoint(skipNop.runes[0]);
            skipNop = skipNop(skipNop.out);
        }
        return skipNop.op == 6;
    }

    final int startCond() {
        int i = this.start;
        int i2 = 0;
        while (true) {
            com.google.re2j.Inst inst = this.inst[i];
            int i3 = inst.op;
            if (i3 != 3) {
                if (i3 == 4) {
                    i2 |= inst.arg;
                } else {
                    if (i3 == 5) {
                        return -1;
                    }
                    if (i3 != 7) {
                        return i2;
                    }
                }
            }
            i = inst.out;
        }
    }

    final int next(int i) {
        com.google.re2j.Inst inst = this.inst[i >> 1];
        if ((i & 1) == 0) {
            return inst.out;
        }
        return inst.arg;
    }

    final void patch(int i, int i2) {
        while (i != 0) {
            com.google.re2j.Inst inst = this.inst[i >> 1];
            if ((i & 1) == 0) {
                i = inst.out;
                inst.out = i2;
            } else {
                i = inst.arg;
                inst.arg = i2;
            }
        }
    }

    final int append(int i, int i2) {
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int i3 = i;
        while (true) {
            int next = next(i3);
            if (next == 0) {
                break;
            }
            i3 = next;
        }
        com.google.re2j.Inst inst = this.inst[i3 >> 1];
        if ((i3 & 1) == 0) {
            inst.out = i2;
            return i;
        }
        inst.arg = i2;
        return i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < this.instSize; i++) {
            int length = sb.length();
            sb.append(i);
            if (i == this.start) {
                sb.append('*');
            }
            sb.append("        ".substring(sb.length() - length));
            sb.append(this.inst[i]);
            sb.append('\n');
        }
        return sb.toString();
    }
}
