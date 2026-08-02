package com.google.re2j;

/* loaded from: classes9.dex */
class RE2 {
    static final int ANCHOR_BOTH = 2;
    static final int ANCHOR_START = 1;
    static final int CLASS_NL = 4;
    static final int DOT_NL = 8;
    static final int FOLD_CASE = 1;
    static final int LITERAL = 2;
    static final int MATCH_NL = 12;
    static final int NON_GREEDY = 32;
    static final int ONE_LINE = 16;
    static final int PERL = 212;
    static final int PERL_X = 64;
    static final int POSIX = 0;
    static final int UNANCHORED = 0;
    static final int UNICODE_GROUPS = 128;
    static final int WAS_DOLLAR = 256;
    final int cond;
    final java.lang.String expr;
    boolean longest;
    public java.util.Map<java.lang.String, java.lang.Integer> namedGroups;
    final int numSubexp;
    private final java.util.concurrent.atomic.AtomicReference<com.google.re2j.Machine> pooled = new java.util.concurrent.atomic.AtomicReference<>();
    java.lang.String prefix;
    boolean prefixComplete;
    int prefixRune;
    byte[] prefixUTF8;
    final com.google.re2j.Prog prog;

    interface DeliverFunc {
        void deliver(int[] iArr);
    }

    interface ReplaceFunc {
        java.lang.String replace(java.lang.String str);
    }

    RE2(java.lang.String str) {
        com.google.re2j.RE2 compile = compile(str);
        this.expr = compile.expr;
        this.prog = compile.prog;
        this.cond = compile.cond;
        this.numSubexp = compile.numSubexp;
        this.longest = compile.longest;
        this.prefix = compile.prefix;
        this.prefixUTF8 = compile.prefixUTF8;
        this.prefixComplete = compile.prefixComplete;
        this.prefixRune = compile.prefixRune;
    }

    private RE2(java.lang.String str, com.google.re2j.Prog prog, int i, boolean z) {
        this.expr = str;
        this.prog = prog;
        this.numSubexp = i;
        this.cond = prog.startCond();
        this.longest = z;
    }

    static com.google.re2j.RE2 compile(java.lang.String str) throws com.google.re2j.PatternSyntaxException {
        return compileImpl(str, 212, false);
    }

    static com.google.re2j.RE2 compilePOSIX(java.lang.String str) throws com.google.re2j.PatternSyntaxException {
        return compileImpl(str, 0, true);
    }

    static com.google.re2j.RE2 compileImpl(java.lang.String str, int i, boolean z) throws com.google.re2j.PatternSyntaxException {
        com.google.re2j.Regexp parse = com.google.re2j.Parser.parse(str, i);
        int maxCap = parse.maxCap();
        com.google.re2j.Regexp simplify = com.google.re2j.Simplify.simplify(parse);
        com.google.re2j.Prog compileRegexp = com.google.re2j.Compiler.compileRegexp(simplify);
        com.google.re2j.RE2 re2 = new com.google.re2j.RE2(str, compileRegexp, maxCap, z);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        re2.prefixComplete = compileRegexp.prefix(sb);
        java.lang.String obj = sb.toString();
        re2.prefix = obj;
        try {
            re2.prefixUTF8 = obj.getBytes("UTF-8");
            if (!re2.prefix.isEmpty()) {
                re2.prefixRune = re2.prefix.codePointAt(0);
            }
            re2.namedGroups = simplify.namedGroups;
            return re2;
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.IllegalStateException("can't happen");
        }
    }

    int numberOfCapturingGroups() {
        return this.numSubexp;
    }

    com.google.re2j.Machine get() {
        com.google.re2j.Machine machine;
        do {
            machine = this.pooled.get();
            if (machine == null) {
                break;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.pooled, machine, machine.next));
        return machine;
    }

    void reset() {
        this.pooled.set(null);
    }

    void put(com.google.re2j.Machine machine, boolean z) {
        com.google.re2j.Machine machine2;
        do {
            machine2 = this.pooled.get();
            if (!z && machine2 != null) {
                z = true;
                machine = new com.google.re2j.Machine(machine);
            }
            if (machine.next != machine2) {
                machine.next = machine2;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.pooled, machine2, machine));
    }

    public java.lang.String toString() {
        return this.expr;
    }

    private int[] doExecute(com.google.re2j.MachineInput machineInput, int i, int i2, int i3) {
        com.google.re2j.Machine machine = get();
        boolean z = true;
        if (machine == null) {
            machine = new com.google.re2j.Machine(this);
        } else if (machine.next != null) {
            machine = new com.google.re2j.Machine(machine);
        } else {
            z = false;
        }
        machine.init(i3);
        int[] submatches = machine.match(machineInput, i, i2) ? machine.submatches() : null;
        put(machine, z);
        return submatches;
    }

    boolean match(java.lang.CharSequence charSequence) {
        return doExecute(com.google.re2j.MachineInput.fromUTF16(charSequence), 0, 0, 0) != null;
    }

    boolean match(java.lang.CharSequence charSequence, int i, int i2, int i3, int[] iArr, int i4) {
        return match(com.google.re2j.MatcherInput.utf16(charSequence), i, i2, i3, iArr, i4);
    }

    boolean match(com.google.re2j.MatcherInput matcherInput, int i, int i2, int i3, int[] iArr, int i4) {
        com.google.re2j.MachineInput fromUTF8;
        if (i > i2) {
            return false;
        }
        if (matcherInput.getEncoding() == com.google.re2j.MatcherInput.Encoding.UTF_16) {
            fromUTF8 = com.google.re2j.MachineInput.fromUTF16(matcherInput.asCharSequence(), 0, i2);
        } else {
            fromUTF8 = com.google.re2j.MachineInput.fromUTF8(matcherInput.asBytes(), 0, i2);
        }
        int[] doExecute = doExecute(fromUTF8, i, i3, i4 * 2);
        if (doExecute == null) {
            return false;
        }
        if (iArr == null) {
            return true;
        }
        java.lang.System.arraycopy(doExecute, 0, iArr, 0, doExecute.length);
        return true;
    }

    boolean matchUTF8(byte[] bArr) {
        return doExecute(com.google.re2j.MachineInput.fromUTF8(bArr), 0, 0, 0) != null;
    }

    static boolean match(java.lang.String str, java.lang.CharSequence charSequence) throws com.google.re2j.PatternSyntaxException {
        return compile(str).match(charSequence);
    }

    java.lang.String replaceAll(java.lang.String str, final java.lang.String str2) {
        return replaceAllFunc(str, new com.google.re2j.RE2.ReplaceFunc() { // from class: com.google.re2j.RE2.1
            @Override // com.google.re2j.RE2.ReplaceFunc
            public java.lang.String replace(java.lang.String str3) {
                return str2;
            }
        }, (str.length() * 2) + 1);
    }

    java.lang.String replaceFirst(java.lang.String str, final java.lang.String str2) {
        return replaceAllFunc(str, new com.google.re2j.RE2.ReplaceFunc() { // from class: com.google.re2j.RE2.2
            @Override // com.google.re2j.RE2.ReplaceFunc
            public java.lang.String replace(java.lang.String str3) {
                return str2;
            }
        }, 1);
    }

    java.lang.String replaceAllFunc(java.lang.String str, com.google.re2j.RE2.ReplaceFunc replaceFunc, int i) {
        int[] doExecute;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.re2j.MachineInput fromUTF16 = com.google.re2j.MachineInput.fromUTF16(str);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 <= str.length() && (doExecute = doExecute(fromUTF16, i3, 0, 2)) != null && doExecute.length != 0) {
            sb.append(str.substring(i2, doExecute[0]));
            int i5 = doExecute[1];
            if (i5 > i2 || doExecute[0] == 0) {
                sb.append(replaceFunc.replace(str.substring(doExecute[0], i5)));
                i4++;
            }
            i2 = doExecute[1];
            int step = (fromUTF16.step(i3) & 7) + i3;
            int i6 = doExecute[1];
            if (step > i6) {
                i3 = step;
            } else {
                i3++;
                if (i3 <= i6) {
                    i3 = i6;
                }
            }
            if (i4 >= i) {
                break;
            }
        }
        sb.append(str.substring(i2));
        return sb.toString();
    }

    static java.lang.String quoteMeta(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() * 2);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ("\\.+*?()|[]{}^$".indexOf(charAt) >= 0) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private int[] pad(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int i = (this.numSubexp + 1) * 2;
        if (iArr.length >= i) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        java.util.Arrays.fill(iArr2, iArr.length, i, -1);
        return iArr2;
    }

    private void allMatches(com.google.re2j.MachineInput machineInput, int i, com.google.re2j.RE2.DeliverFunc deliverFunc) {
        boolean z;
        int endPos = machineInput.endPos();
        if (i < 0) {
            i = endPos + 1;
        }
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i && i4 <= endPos) {
            int[] doExecute = doExecute(machineInput, i4, 0, this.prog.numCap);
            if (doExecute == null || doExecute.length == 0) {
                return;
            }
            int i5 = doExecute[1];
            if (i5 == i4) {
                z = doExecute[0] != i2;
                int step = machineInput.step(i4);
                i4 = step < 0 ? endPos + 1 : i4 + (step & 7);
            } else {
                z = true;
                i4 = i5;
            }
            int i6 = doExecute[1];
            if (z) {
                deliverFunc.deliver(pad(doExecute));
                i3++;
            }
            i2 = i6;
        }
    }

    byte[] findUTF8(byte[] bArr) {
        int[] doExecute = doExecute(com.google.re2j.MachineInput.fromUTF8(bArr), 0, 0, 2);
        if (doExecute == null) {
            return null;
        }
        return com.google.re2j.Utils.subarray(bArr, doExecute[0], doExecute[1]);
    }

    int[] findUTF8Index(byte[] bArr) {
        int[] doExecute = doExecute(com.google.re2j.MachineInput.fromUTF8(bArr), 0, 0, 2);
        if (doExecute == null) {
            return null;
        }
        return com.google.re2j.Utils.subarray(doExecute, 0, 2);
    }

    java.lang.String find(java.lang.String str) {
        int[] doExecute = doExecute(com.google.re2j.MachineInput.fromUTF16(str), 0, 0, 2);
        if (doExecute == null) {
            return "";
        }
        return str.substring(doExecute[0], doExecute[1]);
    }

    int[] findIndex(java.lang.String str) {
        return doExecute(com.google.re2j.MachineInput.fromUTF16(str), 0, 0, 2);
    }

    byte[][] findUTF8Submatch(byte[] bArr) {
        int i;
        int[] doExecute = doExecute(com.google.re2j.MachineInput.fromUTF8(bArr), 0, 0, this.prog.numCap);
        if (doExecute == null) {
            return null;
        }
        int i2 = this.numSubexp + 1;
        byte[][] bArr2 = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            if (i4 < doExecute.length && (i = doExecute[i4]) >= 0) {
                bArr2[i3] = com.google.re2j.Utils.subarray(bArr, i, doExecute[i4 + 1]);
            }
        }
        return bArr2;
    }

    int[] findUTF8SubmatchIndex(byte[] bArr) {
        return pad(doExecute(com.google.re2j.MachineInput.fromUTF8(bArr), 0, 0, this.prog.numCap));
    }

    java.lang.String[] findSubmatch(java.lang.String str) {
        int i;
        int[] doExecute = doExecute(com.google.re2j.MachineInput.fromUTF16(str), 0, 0, this.prog.numCap);
        if (doExecute == null) {
            return null;
        }
        int i2 = this.numSubexp + 1;
        java.lang.String[] strArr = new java.lang.String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            if (i4 < doExecute.length && (i = doExecute[i4]) >= 0) {
                strArr[i3] = str.substring(i, doExecute[i4 + 1]);
            }
        }
        return strArr;
    }

    int[] findSubmatchIndex(java.lang.String str) {
        return pad(doExecute(com.google.re2j.MachineInput.fromUTF16(str), 0, 0, this.prog.numCap));
    }

    java.util.List<byte[]> findAllUTF8(final byte[] bArr, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF8(bArr), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.3
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                arrayList.add(com.google.re2j.Utils.subarray(bArr, iArr[0], iArr[1]));
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<int[]> findAllUTF8Index(byte[] bArr, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF8(bArr), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.4
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                arrayList.add(com.google.re2j.Utils.subarray(iArr, 0, 2));
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<java.lang.String> findAll(final java.lang.String str, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF16(str), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.5
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                arrayList.add(str.substring(iArr[0], iArr[1]));
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<int[]> findAllIndex(java.lang.String str, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF16(str), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.6
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                arrayList.add(com.google.re2j.Utils.subarray(iArr, 0, 2));
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<byte[][]> findAllUTF8Submatch(final byte[] bArr, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF8(bArr), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.7
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                int length = iArr.length / 2;
                byte[][] bArr2 = new byte[length][];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    int i4 = iArr[i3];
                    if (i4 >= 0) {
                        bArr2[i2] = com.google.re2j.Utils.subarray(bArr, i4, iArr[i3 + 1]);
                    }
                }
                arrayList.add(bArr2);
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<int[]> findAllUTF8SubmatchIndex(byte[] bArr, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF8(bArr), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.8
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                arrayList.add(iArr);
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<java.lang.String[]> findAllSubmatch(final java.lang.String str, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF16(str), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.9
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                int length = iArr.length / 2;
                java.lang.String[] strArr = new java.lang.String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    int i4 = iArr[i3];
                    if (i4 >= 0) {
                        strArr[i2] = str.substring(i4, iArr[i3 + 1]);
                    }
                }
                arrayList.add(strArr);
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    java.util.List<int[]> findAllSubmatchIndex(java.lang.String str, int i) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        allMatches(com.google.re2j.MachineInput.fromUTF16(str), i, new com.google.re2j.RE2.DeliverFunc() { // from class: com.google.re2j.RE2.10
            @Override // com.google.re2j.RE2.DeliverFunc
            public void deliver(int[] iArr) {
                arrayList.add(iArr);
            }
        });
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
