package com.google.re2j;

/* loaded from: classes9.dex */
class Machine {
    private int[] matchcap;
    private boolean matched;
    private int ncap;
    com.google.re2j.Machine next;
    private com.google.re2j.Machine.Thread[] pool;
    private int poolSize;
    private final com.google.re2j.Prog prog;
    private final com.google.re2j.Machine.Queue q0;
    private final com.google.re2j.Machine.Queue q1;
    private com.google.re2j.RE2 re2;

    static class Thread {
        int[] cap;
        com.google.re2j.Inst inst;

        Thread(int i) {
            this.cap = new int[i];
        }
    }

    static class Queue {
        final int[] densePcs;
        final com.google.re2j.Machine.Thread[] denseThreads;
        int size;
        final int[] sparse;

        Queue(int i) {
            this.sparse = new int[i];
            this.densePcs = new int[i];
            this.denseThreads = new com.google.re2j.Machine.Thread[i];
        }

        boolean contains(int i) {
            int i2 = this.sparse[i];
            return i2 < this.size && this.densePcs[i2] == i;
        }

        boolean isEmpty() {
            return this.size == 0;
        }

        int add(int i) {
            int i2 = this.size;
            this.size = i2 + 1;
            this.sparse[i] = i2;
            this.denseThreads[i2] = null;
            this.densePcs[i2] = i;
            return i2;
        }

        void clear() {
            this.size = 0;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
            for (int i = 0; i < this.size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(this.densePcs[i]);
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    Machine(com.google.re2j.RE2 re2) {
        this.pool = new com.google.re2j.Machine.Thread[10];
        com.google.re2j.Prog prog = re2.prog;
        this.prog = prog;
        this.re2 = re2;
        this.q0 = new com.google.re2j.Machine.Queue(prog.numInst());
        this.q1 = new com.google.re2j.Machine.Queue(prog.numInst());
        this.matchcap = new int[prog.numCap >= 2 ? prog.numCap : 2];
    }

    Machine(com.google.re2j.Machine machine) {
        this.pool = new com.google.re2j.Machine.Thread[10];
        this.re2 = machine.re2;
        this.prog = machine.prog;
        this.q0 = machine.q0;
        this.q1 = machine.q1;
        this.pool = machine.pool;
        this.poolSize = machine.poolSize;
        this.matched = machine.matched;
        this.matchcap = machine.matchcap;
        this.ncap = machine.ncap;
    }

    void init(int i) {
        this.ncap = i;
        if (i > this.matchcap.length) {
            initNewCap(i);
        } else {
            resetCap(i);
        }
    }

    private void resetCap(int i) {
        for (int i2 = 0; i2 < this.poolSize; i2++) {
            java.util.Arrays.fill(this.pool[i2].cap, 0, i, 0);
        }
    }

    private void initNewCap(int i) {
        for (int i2 = 0; i2 < this.poolSize; i2++) {
            this.pool[i2].cap = new int[i];
        }
        this.matchcap = new int[i];
    }

    int[] submatches() {
        int i = this.ncap;
        if (i == 0) {
            return com.google.re2j.Utils.EMPTY_INTS;
        }
        return java.util.Arrays.copyOf(this.matchcap, i);
    }

    private com.google.re2j.Machine.Thread alloc(com.google.re2j.Inst inst) {
        com.google.re2j.Machine.Thread thread;
        int i = this.poolSize;
        if (i > 0) {
            int i2 = i - 1;
            this.poolSize = i2;
            thread = this.pool[i2];
        } else {
            thread = new com.google.re2j.Machine.Thread(this.matchcap.length);
        }
        thread.inst = inst;
        return thread;
    }

    private void free(com.google.re2j.Machine.Queue queue) {
        free(queue, 0);
    }

    private void free(com.google.re2j.Machine.Queue queue, int i) {
        int i2 = this.poolSize + (queue.size - i);
        com.google.re2j.Machine.Thread[] threadArr = this.pool;
        if (threadArr.length < i2) {
            this.pool = (com.google.re2j.Machine.Thread[]) java.util.Arrays.copyOf(threadArr, java.lang.Math.max(threadArr.length * 2, i2));
        }
        while (i < queue.size) {
            com.google.re2j.Machine.Thread thread = queue.denseThreads[i];
            if (thread != null) {
                com.google.re2j.Machine.Thread[] threadArr2 = this.pool;
                int i3 = this.poolSize;
                threadArr2[i3] = thread;
                this.poolSize = i3 + 1;
            }
            i++;
        }
        queue.clear();
    }

    private void free(com.google.re2j.Machine.Thread thread) {
        com.google.re2j.Machine.Thread[] threadArr = this.pool;
        if (threadArr.length <= this.poolSize) {
            this.pool = (com.google.re2j.Machine.Thread[]) java.util.Arrays.copyOf(threadArr, threadArr.length * 2);
        }
        com.google.re2j.Machine.Thread[] threadArr2 = this.pool;
        int i = this.poolSize;
        threadArr2[i] = thread;
        this.poolSize = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean match(com.google.re2j.MachineInput machineInput, int i, int i2) {
        int i3;
        int i4;
        int context;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int context2;
        com.google.re2j.Machine.Queue queue;
        int i11 = this.re2.cond;
        char c = 0;
        if (i11 == -1) {
            return false;
        }
        boolean z = true;
        if ((i2 == 1 || i2 == 2) && i != 0) {
            return false;
        }
        this.matched = false;
        java.util.Arrays.fill(this.matchcap, 0, this.prog.numCap, -1);
        com.google.re2j.Machine.Queue queue2 = this.q0;
        com.google.re2j.Machine.Queue queue3 = this.q1;
        int step = machineInput.step(i);
        int i12 = step >> 3;
        int i13 = step & 7;
        if (step != -8) {
            int step2 = machineInput.step(i + i13);
            i4 = step2 >> 3;
            i3 = step2 & 7;
        } else {
            i3 = 0;
            i4 = -1;
        }
        if (i == 0) {
            context = com.google.re2j.Utils.emptyOpContext(-1, i12);
        } else {
            context = machineInput.context(i);
        }
        com.google.re2j.Machine.Queue queue4 = queue2;
        com.google.re2j.Machine.Queue queue5 = queue3;
        int i14 = i;
        while (true) {
            if (queue4.isEmpty()) {
                if (((i11 & 4) != 0 && i14 != 0) || this.matched) {
                    break;
                }
                if (!this.re2.prefix.isEmpty() && i4 != this.re2.prefixRune && machineInput.canCheckPrefix()) {
                    int index = machineInput.index(this.re2, i14);
                    if (index < 0) {
                        break;
                    }
                    int i15 = i14 + index;
                    int step3 = machineInput.step(i15);
                    int i16 = step3 >> 3;
                    i13 = step3 & 7;
                    int step4 = machineInput.step(i15 + i13);
                    i5 = i15;
                    i6 = step4 & 7;
                    i7 = i16;
                    i4 = step4 >> 3;
                    i8 = i13;
                    if (this.matched && (i5 == 0 || i2 == 0)) {
                        if (this.ncap > 0) {
                            this.matchcap[c] = i5;
                        }
                        i9 = i4;
                        add(queue4, this.prog.start, i5, this.matchcap, context, null);
                    } else {
                        i9 = i4;
                    }
                    i10 = i5 + i8;
                    context2 = machineInput.context(i10);
                    boolean z2 = i5 != machineInput.endPos() ? z : false;
                    queue = queue5;
                    step(queue4, queue5, i5, i10, i7, context2, i2, z2);
                    if (i8 != 0 || (this.ncap == 0 && this.matched)) {
                        break;
                        break;
                    }
                    if (i9 == -1) {
                        int step5 = machineInput.step(i10 + i6);
                        i3 = step5 & 7;
                        i4 = step5 >> 3;
                    } else {
                        i4 = i9;
                        i3 = i6;
                    }
                    i12 = i9;
                    queue5 = queue4;
                    i13 = i6;
                    i14 = i10;
                    context = context2;
                    c = 0;
                    queue4 = queue;
                    z = true;
                }
            }
            i5 = i14;
            i6 = i3;
            i7 = i12;
            i8 = i13;
            if (this.matched) {
            }
            i9 = i4;
            i10 = i5 + i8;
            context2 = machineInput.context(i10);
            if (i5 != machineInput.endPos()) {
            }
            queue = queue5;
            step(queue4, queue5, i5, i10, i7, context2, i2, z2);
            if (i8 != 0) {
                break;
            }
            if (i9 == -1) {
            }
            i12 = i9;
            queue5 = queue4;
            i13 = i6;
            i14 = i10;
            context = context2;
            c = 0;
            queue4 = queue;
            z = true;
        }
        queue = queue5;
        free(queue);
        return this.matched;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r19 != 10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r19 == r0.runes[0]) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r0.matchRune(r19) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void step(com.google.re2j.Machine.Queue queue, com.google.re2j.Machine.Queue queue2, int i, int i2, int i3, int i4, int i5, boolean z) {
        boolean z2 = this.re2.longest;
        for (int i6 = 0; i6 < queue.size; i6++) {
            com.google.re2j.Machine.Thread thread = queue.denseThreads[i6];
            if (thread != null) {
                if (z2 && this.matched && this.ncap > 0 && this.matchcap[0] < thread.cap[0]) {
                    free(thread);
                } else {
                    com.google.re2j.Inst inst = thread.inst;
                    switch (inst.op) {
                        case 6:
                            if (i5 != 2 || z) {
                                if (this.ncap > 0 && (!z2 || !this.matched || this.matchcap[1] < i)) {
                                    thread.cap[1] = i;
                                    java.lang.System.arraycopy(thread.cap, 0, this.matchcap, 0, this.ncap);
                                }
                                if (!z2) {
                                    free(queue, i6 + 1);
                                }
                                this.matched = true;
                            }
                            if (thread == null) {
                                free(thread);
                                queue.denseThreads[i6] = null;
                            }
                        case 7:
                        default:
                            throw new java.lang.IllegalStateException("bad inst");
                        case 8:
                            break;
                        case 9:
                            break;
                        case 10:
                            thread = add(queue2, inst.out, i2, thread.cap, i4, thread);
                            if (thread == null) {
                            }
                            break;
                        case 11:
                            break;
                    }
                }
            }
        }
        queue.clear();
    }

    private com.google.re2j.Machine.Thread add(com.google.re2j.Machine.Queue queue, int i, int i2, int[] iArr, int i3, com.google.re2j.Machine.Thread thread) {
        int i4 = i;
        com.google.re2j.Machine.Thread thread2 = thread;
        while (i4 != 0 && !queue.contains(i4)) {
            int add = queue.add(i4);
            com.google.re2j.Inst inst = this.prog.inst[i4];
            switch (inst.op) {
                case 1:
                case 2:
                    thread2 = add(queue, inst.out, i2, iArr, i3, thread2);
                    i4 = inst.arg;
                    continue;
                case 3:
                    if (inst.arg < this.ncap) {
                        int i5 = iArr[inst.arg];
                        iArr[inst.arg] = i2;
                        add(queue, inst.out, i2, iArr, i3, null);
                        iArr[inst.arg] = i5;
                        return thread2;
                    }
                    i4 = inst.out;
                    continue;
                case 4:
                    if ((inst.arg & (~i3)) != 0) {
                        break;
                    } else {
                        i4 = inst.out;
                    }
                case 5:
                    break;
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    if (thread2 == null) {
                        thread2 = alloc(inst);
                    } else {
                        thread2.inst = inst;
                    }
                    if (this.ncap > 0 && thread2.cap != iArr) {
                        java.lang.System.arraycopy(iArr, 0, thread2.cap, 0, this.ncap);
                    }
                    queue.denseThreads[add] = thread2;
                    return null;
                case 7:
                    i4 = inst.out;
                    continue;
                default:
                    throw new java.lang.IllegalStateException("unhandled");
            }
        }
        return thread2;
    }
}
