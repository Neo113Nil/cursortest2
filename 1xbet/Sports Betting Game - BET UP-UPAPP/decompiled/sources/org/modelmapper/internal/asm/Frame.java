package org.modelmapper.internal.asm;

import com.ironsource.X3;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
class Frame {
    static final int APPEND_FRAME = 252;
    private static final int ARRAY_OF = 268435456;
    private static final int BOOLEAN = 16777225;
    private static final int BYTE = 16777226;
    private static final int CHAR = 16777227;
    static final int CHOP_FRAME = 248;
    private static final int CONSTANT_KIND = 16777216;
    private static final int DIM_MASK = -268435456;
    private static final int DIM_SHIFT = 28;
    private static final int DOUBLE = 16777219;
    private static final int ELEMENT_OF = -268435456;
    private static final int FLAGS_MASK = 15728640;
    private static final int FLOAT = 16777218;
    static final int FULL_FRAME = 255;
    private static final int INTEGER = 16777217;
    private static final int ITEM_ASM_BOOLEAN = 9;
    private static final int ITEM_ASM_BYTE = 10;
    private static final int ITEM_ASM_CHAR = 11;
    private static final int ITEM_ASM_SHORT = 12;
    static final int ITEM_DOUBLE = 3;
    static final int ITEM_FLOAT = 2;
    static final int ITEM_INTEGER = 1;
    static final int ITEM_LONG = 4;
    static final int ITEM_NULL = 5;
    static final int ITEM_OBJECT = 7;
    static final int ITEM_TOP = 0;
    static final int ITEM_UNINITIALIZED = 8;
    static final int ITEM_UNINITIALIZED_THIS = 6;
    private static final int KIND_MASK = 251658240;
    private static final int LOCAL_KIND = 67108864;
    private static final int LONG = 16777220;
    private static final int NULL = 16777221;
    private static final int REFERENCE_KIND = 33554432;
    static final int RESERVED = 128;
    static final int SAME_FRAME = 0;
    static final int SAME_FRAME_EXTENDED = 251;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
    static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
    private static final int SHORT = 16777228;
    private static final int STACK_KIND = 83886080;
    private static final int TOP = 16777216;
    private static final int TOP_IF_LONG_OR_DOUBLE_FLAG = 1048576;
    private static final int UNINITIALIZED_KIND = 50331648;
    private static final int UNINITIALIZED_THIS = 16777222;
    private static final int VALUE_MASK = 1048575;
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    Label owner;

    static int getAbstractTypeFromApiFormat(SymbolTable symbolTable, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 16777216;
        }
        if (obj instanceof String) {
            return getAbstractTypeFromDescriptor(symbolTable, Type.getObjectType((String) obj).getDescriptor(), 0);
        }
        return symbolTable.addUninitializedType("", ((Label) obj).bytecodeOffset) | UNINITIALIZED_KIND;
    }

    static int getAbstractTypeFromInternalName(SymbolTable symbolTable, String str) {
        return symbolTable.addType(str) | REFERENCE_KIND;
    }

    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i) {
        char charAt = str.charAt(i);
        int i2 = FLOAT;
        if (charAt == 'F') {
            return FLOAT;
        }
        if (charAt == 'L') {
            return symbolTable.addType(str.substring(i + 1, str.length() - 1)) | REFERENCE_KIND;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'I') {
                if (charAt == 'J') {
                    return LONG;
                }
                if (charAt != 'Z') {
                    if (charAt == '[') {
                        int i3 = i + 1;
                        while (str.charAt(i3) == '[') {
                            i3++;
                        }
                        char charAt2 = str.charAt(i3);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'L') {
                                i2 = symbolTable.addType(str.substring(i3 + 1, str.length() - 1)) | REFERENCE_KIND;
                            } else if (charAt2 == 'S') {
                                i2 = SHORT;
                            } else if (charAt2 == 'Z') {
                                i2 = BOOLEAN;
                            } else if (charAt2 == 'I') {
                                i2 = INTEGER;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i2 = BYTE;
                                        break;
                                    case 'C':
                                        i2 = CHAR;
                                        break;
                                    case 'D':
                                        i2 = DOUBLE;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                i2 = LONG;
                            }
                        }
                        return ((i3 - i) << 28) | i2;
                    }
                    switch (charAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return DOUBLE;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return INTEGER;
    }

    Frame(Label label) {
        this.owner = label;
    }

    final void copyFrom(Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | REFERENCE_KIND;
            } else {
                iArr[0] = UNINITIALIZED_THIS;
            }
        } else {
            i3 = 0;
        }
        for (Type type : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i4 = i3 + 1;
            iArr2[i3] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                i3 += 2;
                iArr2[i4] = 16777216;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.inputLocals[i3] = 16777216;
            i3++;
        }
    }

    final void setInputFrameFromApiFormat(SymbolTable symbolTable, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.inputLocals[i3] = getAbstractTypeFromApiFormat(symbolTable, objArr[i4]);
            if (objArr[i4] == Opcodes.LONG || objArr[i4] == Opcodes.DOUBLE) {
                i3 += 2;
                this.inputLocals[i5] = 16777216;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 16777216;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            if (objArr2[i7] == Opcodes.LONG || objArr2[i7] == Opcodes.DOUBLE) {
                i6++;
            }
        }
        this.inputStack = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.inputStack[i8] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i9]);
            if (objArr2[i9] == Opcodes.LONG || objArr2[i9] == Opcodes.DOUBLE) {
                i8 += 2;
                this.inputStack[i10] = 16777216;
            } else {
                i8 = i10;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    final int getInputStackSize() {
        return this.inputStack.length;
    }

    private int getLocal(int i) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i >= iArr.length) {
            return i | 67108864;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = i | 67108864;
        iArr[i] = i3;
        return i3;
    }

    private void setLocal(int i, int i2) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i] = i2;
    }

    private void push(int i) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s = this.outputStackTop;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s2 = this.outputStackTop;
        short s3 = (short) (s2 + 1);
        this.outputStackTop = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.outputStackStart + s3);
        if (s4 > this.owner.outputStackMax) {
            this.owner.outputStackMax = s4;
        }
    }

    private void push(SymbolTable symbolTable, String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == LONG || abstractTypeFromDescriptor == DOUBLE) {
                push(16777216);
            }
        }
    }

    private int pop() {
        short s = this.outputStackTop;
        if (s > 0) {
            int[] iArr = this.outputStack;
            short s2 = (short) (s - 1);
            this.outputStackTop = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.outputStackStart - 1);
        this.outputStackStart = s3;
        return (-s3) | STACK_KIND;
    }

    private void pop(int i) {
        short s = this.outputStackTop;
        if (s >= i) {
            this.outputStackTop = (short) (s - i);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i - s));
            this.outputStackTop = (short) 0;
        }
    }

    private void pop(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (charAt == 'J' || charAt == 'D') {
            pop(2);
        } else {
            pop(1);
        }
    }

    private void addInitializedType(int i) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i2 = this.initializationCount;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i3 = this.initializationCount;
        this.initializationCount = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[LOOP:0: B:8:0x000d->B:15:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getInitializedType(SymbolTable symbolTable, int i) {
        int i2;
        int addType;
        if (i == UNINITIALIZED_THIS || ((-16777216) & i) == UNINITIALIZED_KIND) {
            for (int i3 = 0; i3 < this.initializationCount; i3++) {
                int i4 = this.initializations[i3];
                int i5 = (-268435456) & i4;
                int i6 = KIND_MASK & i4;
                int i7 = i4 & VALUE_MASK;
                if (i6 == 67108864) {
                    i2 = this.inputLocals[i7];
                } else {
                    if (i6 == STACK_KIND) {
                        int[] iArr = this.inputStack;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i != i4) {
                        if (i == UNINITIALIZED_THIS) {
                            addType = symbolTable.addType(symbolTable.getClassName());
                        } else {
                            addType = symbolTable.addType(symbolTable.getType(i & VALUE_MASK).value);
                        }
                        return addType | REFERENCE_KIND;
                    }
                }
                i4 = i2 + i5;
                if (i != i4) {
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        switch (i) {
            case 0:
                return;
            case 1:
                push(NULL);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(INTEGER);
                return;
            case 9:
            case 10:
                push(LONG);
                push(16777216);
                return;
            case 11:
            case 12:
            case 13:
                push(FLOAT);
                return;
            case 14:
            case 15:
                push(DOUBLE);
                push(16777216);
                return;
            case 18:
                int i3 = symbol.tag;
                switch (i3) {
                    case 3:
                        push(INTEGER);
                        return;
                    case 4:
                        push(FLOAT);
                        return;
                    case 5:
                        push(LONG);
                        push(16777216);
                        return;
                    case 6:
                        push(DOUBLE);
                        push(16777216);
                        return;
                    case 7:
                        push(symbolTable.addType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME) | REFERENCE_KIND);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | REFERENCE_KIND);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | REFERENCE_KIND);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | REFERENCE_KIND);
                                return;
                            case 17:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        push(getLocal(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(INTEGER);
                                return;
                            case 47:
                                pop(2);
                                push(LONG);
                                push(16777216);
                                return;
                            case 48:
                                pop(2);
                                push(FLOAT);
                                return;
                            case 49:
                                pop(2);
                                push(DOUBLE);
                                push(16777216);
                                return;
                            case 50:
                                pop(1);
                                int pop = pop();
                                if (pop != NULL) {
                                    pop -= 268435456;
                                }
                                push(pop);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                setLocal(i2, pop());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int local = getLocal(i4);
                                    if (local == LONG || local == DOUBLE) {
                                        setLocal(i4, 16777216);
                                        return;
                                    }
                                    int i5 = local & KIND_MASK;
                                    if (i5 == 67108864 || i5 == STACK_KIND) {
                                        setLocal(i4, local | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                pop(1);
                                setLocal(i2, pop());
                                setLocal(i2 + 1, 16777216);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int local2 = getLocal(i6);
                                    if (local2 == LONG || local2 == DOUBLE) {
                                        setLocal(i6, 16777216);
                                        return;
                                    }
                                    int i7 = local2 & KIND_MASK;
                                    if (i7 == 67108864 || i7 == STACK_KIND) {
                                        setLocal(i6, local2 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        return;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        return;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case Opcodes.TABLESWITCH /* 170 */:
                                    case Opcodes.LOOKUPSWITCH /* 171 */:
                                    case 172:
                                    case Opcodes.FRETURN /* 174 */:
                                    case Opcodes.ARETURN /* 176 */:
                                    case Opcodes.ATHROW /* 191 */:
                                    case Opcodes.MONITORENTER /* 194 */:
                                    case Opcodes.MONITOREXIT /* 195 */:
                                        break;
                                    case 88:
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case 160:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                    case 173:
                                    case Opcodes.DRETURN /* 175 */:
                                        pop(2);
                                        return;
                                    case 89:
                                        int pop2 = pop();
                                        push(pop2);
                                        push(pop2);
                                        return;
                                    case 90:
                                        int pop3 = pop();
                                        int pop4 = pop();
                                        push(pop3);
                                        push(pop4);
                                        push(pop3);
                                        return;
                                    case 91:
                                        int pop5 = pop();
                                        int pop6 = pop();
                                        int pop7 = pop();
                                        push(pop5);
                                        push(pop7);
                                        push(pop6);
                                        push(pop5);
                                        return;
                                    case 92:
                                        int pop8 = pop();
                                        int pop9 = pop();
                                        push(pop9);
                                        push(pop8);
                                        push(pop9);
                                        push(pop8);
                                        return;
                                    case 93:
                                        int pop10 = pop();
                                        int pop11 = pop();
                                        int pop12 = pop();
                                        push(pop11);
                                        push(pop10);
                                        push(pop12);
                                        push(pop11);
                                        push(pop10);
                                        return;
                                    case 94:
                                        int pop13 = pop();
                                        int pop14 = pop();
                                        int pop15 = pop();
                                        int pop16 = pop();
                                        push(pop14);
                                        push(pop13);
                                        push(pop16);
                                        push(pop15);
                                        push(pop14);
                                        push(pop13);
                                        return;
                                    case 95:
                                        int pop17 = pop();
                                        int pop18 = pop();
                                        push(pop17);
                                        push(pop18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case Opcodes.D2I /* 142 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case 150:
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        pop(4);
                                        push(LONG);
                                        push(16777216);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case Opcodes.L2F /* 137 */:
                                    case Opcodes.D2F /* 144 */:
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(DOUBLE);
                                        push(16777216);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case Opcodes.I2B /* 145 */:
                                    case Opcodes.I2C /* 146 */:
                                    case Opcodes.I2S /* 147 */:
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RETURN /* 177 */:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(LONG);
                                        push(16777216);
                                        return;
                                    case 132:
                                        setLocal(i2, INTEGER);
                                        return;
                                    case Opcodes.I2L /* 133 */:
                                    case Opcodes.F2L /* 140 */:
                                        pop(1);
                                        push(LONG);
                                        push(16777216);
                                        return;
                                    case 134:
                                        pop(1);
                                        push(FLOAT);
                                        return;
                                    case 135:
                                    case 141:
                                        pop(1);
                                        push(DOUBLE);
                                        push(16777216);
                                        return;
                                    case 138:
                                        break;
                                    case 139:
                                    case 190:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        pop(1);
                                        push(INTEGER);
                                        return;
                                    case Opcodes.D2L /* 143 */:
                                        break;
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        pop(4);
                                        push(INTEGER);
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                    case Opcodes.RET /* 169 */:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case Opcodes.GETSTATIC /* 178 */:
                                        push(symbolTable, symbol.value);
                                        return;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        pop(symbol.value);
                                        return;
                                    case 180:
                                        pop(1);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case Opcodes.PUTFIELD /* 181 */:
                                        pop(symbol.value);
                                        pop();
                                        return;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        pop(symbol.value);
                                        if (i != 184) {
                                            int pop19 = pop();
                                            if (i == 183 && symbol.name.charAt(0) == '<') {
                                                addInitializedType(pop19);
                                            }
                                        }
                                        push(symbolTable, symbol.value);
                                        return;
                                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                                        pop(symbol.value);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case Opcodes.NEW /* 187 */:
                                        push(symbolTable.addUninitializedType(symbol.value, i2) | UNINITIALIZED_KIND);
                                        return;
                                    case 188:
                                        pop();
                                        switch (i2) {
                                            case 4:
                                                push(285212681);
                                                return;
                                            case 5:
                                                push(285212683);
                                                return;
                                            case 6:
                                                push(285212674);
                                                return;
                                            case 7:
                                                push(285212675);
                                                return;
                                            case 8:
                                                push(285212682);
                                                return;
                                            case 9:
                                                push(285212684);
                                                return;
                                            case 10:
                                                push(285212673);
                                                return;
                                            case 11:
                                                push(285212676);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = symbol.value;
                                        pop();
                                        if (str.charAt(0) == '[') {
                                            push(symbolTable, X3.j.d + str);
                                            return;
                                        } else {
                                            push(symbolTable.addType(str) | 301989888);
                                            return;
                                        }
                                    case 192:
                                        String str2 = symbol.value;
                                        pop();
                                        if (str2.charAt(0) == '[') {
                                            push(symbolTable, str2);
                                            return;
                                        } else {
                                            push(symbolTable.addType(str2) | REFERENCE_KIND);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case Opcodes.MULTIANEWARRAY /* 197 */:
                                                pop(i2);
                                                push(symbolTable, symbol.value);
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                }
                                pop(1);
                                return;
                        }
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r8 == org.modelmapper.internal.asm.Frame.DOUBLE) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r8 == org.modelmapper.internal.asm.Frame.DOUBLE) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f6, code lost:
    
        if (r6 == org.modelmapper.internal.asm.Frame.DOUBLE) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010e, code lost:
    
        if (r6 == org.modelmapper.internal.asm.Frame.DOUBLE) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean merge(SymbolTable symbolTable, Frame frame, int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < length; i5++) {
            int[] iArr = this.outputLocals;
            if (iArr != null && i5 < iArr.length) {
                int i6 = iArr[i5];
                if (i6 == 0) {
                    i3 = this.inputLocals[i5];
                } else {
                    int i7 = i6 & (-268435456);
                    int i8 = KIND_MASK & i6;
                    if (i8 == 67108864) {
                        i4 = i7 + this.inputLocals[i6 & VALUE_MASK];
                        if ((i6 & 1048576) != 0) {
                            if (i4 != LONG) {
                            }
                            i3 = 16777216;
                        }
                        i3 = i4;
                    } else if (i8 == STACK_KIND) {
                        i4 = i7 + this.inputStack[length2 - (i6 & VALUE_MASK)];
                        if ((i6 & 1048576) != 0) {
                            if (i4 != LONG) {
                            }
                            i3 = 16777216;
                        }
                        i3 = i4;
                    } else {
                        i3 = i6;
                    }
                }
            } else {
                i3 = this.inputLocals[i5];
            }
            if (this.initializations != null) {
                i3 = getInitializedType(symbolTable, i3);
            }
            z |= merge(symbolTable, i3, frame.inputLocals, i5);
        }
        if (i > 0) {
            for (int i9 = 0; i9 < length; i9++) {
                z |= merge(symbolTable, this.inputLocals[i9], frame.inputLocals, i9);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
                z3 = true;
            } else {
                z3 = z;
            }
            return merge(symbolTable, i, frame.inputStack, 0) | z3;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
            z2 = true;
        } else {
            z2 = z;
        }
        for (int i10 = 0; i10 < length3; i10++) {
            int i11 = this.inputStack[i10];
            if (this.initializations != null) {
                i11 = getInitializedType(symbolTable, i11);
            }
            z2 |= merge(symbolTable, i11, frame.inputStack, i10);
        }
        for (int i12 = 0; i12 < this.outputStackTop; i12++) {
            int i13 = this.outputStack[i12];
            int i14 = i13 & (-268435456);
            int i15 = i13 & KIND_MASK;
            if (i15 == 67108864) {
                i2 = i14 + this.inputLocals[i13 & VALUE_MASK];
                if ((i13 & 1048576) != 0) {
                    if (i2 != LONG) {
                    }
                    i13 = 16777216;
                }
                i13 = i2;
            } else if (i15 == STACK_KIND) {
                i2 = i14 + this.inputStack[length2 - (i13 & VALUE_MASK)];
                if ((i13 & 1048576) != 0) {
                    if (i2 != LONG) {
                    }
                    i13 = 16777216;
                }
                i13 = i2;
            }
            if (this.initializations != null) {
                i13 = getInitializedType(symbolTable, i13);
            }
            z2 |= merge(symbolTable, i13, frame.inputStack, length3 + i12);
        }
        return z2;
    }

    private static boolean merge(SymbolTable symbolTable, int i, int[] iArr, int i2) {
        int min;
        int addType;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((268435455 & i) == NULL) {
            if (i3 == NULL) {
                return false;
            }
            i = NULL;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-268435456);
        int i5 = 16777216;
        if (i4 != 0 || (i3 & KIND_MASK) == REFERENCE_KIND) {
            if (i == NULL) {
                return false;
            }
            if ((i & (-16777216)) != ((-16777216) & i3)) {
                int i6 = i & (-268435456);
                if (i6 != 0 || (i & KIND_MASK) == REFERENCE_KIND) {
                    if (i6 != 0 && (i & KIND_MASK) != REFERENCE_KIND) {
                        i6 -= 268435456;
                    }
                    if (i4 != 0 && (i3 & KIND_MASK) != REFERENCE_KIND) {
                        i4 -= 268435456;
                    }
                    min = Math.min(i6, i4) | REFERENCE_KIND;
                    addType = symbolTable.addType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                    i5 = min | addType;
                }
            } else if ((i3 & KIND_MASK) == REFERENCE_KIND) {
                i5 = (i & (-268435456)) | REFERENCE_KIND | symbolTable.addMergedType(i & VALUE_MASK, VALUE_MASK & i3);
            } else {
                min = ((i & (-268435456)) - 268435456) | REFERENCE_KIND;
                addType = symbolTable.addType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                i5 = min | addType;
            }
        } else if (i3 == NULL) {
            if ((i & (-268435456)) == 0 && (i & KIND_MASK) != REFERENCE_KIND) {
                i = 16777216;
            }
            i5 = i;
        }
        if (i5 == i3) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }

    final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != LONG && i6 != DOUBLE) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 16777216) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == LONG || i9 == DOUBLE) ? 2 : 1;
            i8++;
        }
        int visitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i3, i8);
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i12 = iArr[i10];
            i10 += (i12 == LONG || i12 == DOUBLE) ? 2 : 1;
            methodWriter.visitAbstractType(visitFrameStart, i12);
            i3 = i11;
            visitFrameStart++;
        }
        while (true) {
            int i13 = i8 - 1;
            if (i8 > 0) {
                int i14 = iArr2[i];
                i += (i14 == LONG || i14 == DOUBLE) ? 2 : 1;
                methodWriter.visitAbstractType(visitFrameStart, i14);
                visitFrameStart++;
                i8 = i13;
            } else {
                methodWriter.visitFrameEnd();
                return;
            }
        }
    }

    static void putAbstractType(SymbolTable symbolTable, int i, ByteVector byteVector) {
        int i2 = ((-268435456) & i) >> 28;
        if (i2 == 0) {
            int i3 = i & VALUE_MASK;
            int i4 = i & KIND_MASK;
            if (i4 == 16777216) {
                byteVector.putByte(i3);
                return;
            } else if (i4 == REFERENCE_KIND) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i3).value).index);
                return;
            } else {
                if (i4 == UNINITIALIZED_KIND) {
                    byteVector.putByte(8).putShort((int) symbolTable.getType(i3).data);
                    return;
                }
                throw new AssertionError();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            sb.append('[');
            i2 = i5;
        }
        if ((i & KIND_MASK) == REFERENCE_KIND) {
            sb.append('L').append(symbolTable.getType(i & VALUE_MASK).value).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        } else {
            int i6 = i & VALUE_MASK;
            if (i6 == 1) {
                sb.append('I');
            } else if (i6 == 2) {
                sb.append('F');
            } else if (i6 == 3) {
                sb.append('D');
            } else if (i6 != 4) {
                switch (i6) {
                    case 9:
                        sb.append('Z');
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb.toString()).index);
    }
}
