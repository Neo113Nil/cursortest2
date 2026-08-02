package org.modelmapper.internal.asm.tree.analysis;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.tree.AbstractInsnNode;
import org.modelmapper.internal.asm.tree.IincInsnNode;
import org.modelmapper.internal.asm.tree.InvokeDynamicInsnNode;
import org.modelmapper.internal.asm.tree.MethodInsnNode;
import org.modelmapper.internal.asm.tree.MultiANewArrayInsnNode;
import org.modelmapper.internal.asm.tree.VarInsnNode;
import org.modelmapper.internal.asm.tree.analysis.Value;

/* loaded from: classes4.dex */
public class Frame<V extends Value> {
    private int nLocals;
    private int nStack;
    private V returnValue;
    private V[] values;

    public Frame(int i, int i2) {
        this.values = (V[]) new Value[i2 + i];
        this.nLocals = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Frame(Frame<? extends V> frame) {
        this(r0, frame.values.length - r0);
        int i = frame.nLocals;
        init(frame);
    }

    public Frame<V> init(Frame<? extends V> frame) {
        this.returnValue = frame.returnValue;
        Object[] objArr = frame.values;
        V[] vArr = this.values;
        System.arraycopy(objArr, 0, vArr, 0, vArr.length);
        this.nStack = frame.nStack;
        return this;
    }

    public void setReturn(V v) {
        this.returnValue = v;
    }

    public int getLocals() {
        return this.nLocals;
    }

    public int getMaxStackSize() {
        return this.values.length - this.nLocals;
    }

    public V getLocal(int i) {
        if (i >= this.nLocals) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable");
        }
        return this.values[i];
    }

    public void setLocal(int i, V v) {
        if (i >= this.nLocals) {
            throw new IndexOutOfBoundsException("Trying to access an inexistant local variable " + i);
        }
        this.values[i] = v;
    }

    public int getStackSize() {
        return this.nStack;
    }

    public V getStack(int i) {
        return this.values[this.nLocals + i];
    }

    public void setStack(int i, V v) throws IndexOutOfBoundsException {
        this.values[this.nLocals + i] = v;
    }

    public void clearStack() {
        this.nStack = 0;
    }

    public V pop() {
        int i = this.nStack;
        if (i == 0) {
            throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack.");
        }
        V[] vArr = this.values;
        int i2 = this.nLocals;
        int i3 = i - 1;
        this.nStack = i3;
        return vArr[i2 + i3];
    }

    public void push(V v) {
        int i = this.nLocals;
        int i2 = this.nStack;
        int i3 = i + i2;
        V[] vArr = this.values;
        if (i3 >= vArr.length) {
            throw new IndexOutOfBoundsException("Insufficient maximum stack size.");
        }
        this.nStack = i2 + 1;
        vArr[i + i2] = v;
    }

    public void execute(AbstractInsnNode abstractInsnNode, Interpreter<V> interpreter) throws AnalyzerException {
        int i;
        V local;
        int opcode = abstractInsnNode.getOpcode();
        switch (opcode) {
            case 0:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                push(interpreter.newOperation(abstractInsnNode));
                return;
            default:
                switch (opcode) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        push(interpreter.copyOperation(abstractInsnNode, getLocal(((VarInsnNode) abstractInsnNode).var)));
                        return;
                    default:
                        switch (opcode) {
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                                break;
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                                V copyOperation = interpreter.copyOperation(abstractInsnNode, pop());
                                int i2 = ((VarInsnNode) abstractInsnNode).var;
                                setLocal(i2, copyOperation);
                                if (copyOperation.getSize() == 2) {
                                    int i3 = i2 + 1;
                                    setLocal(i3, interpreter.newEmptyValue(i3));
                                }
                                if (i2 <= 0 || (local = getLocal((i = i2 - 1))) == null || local.getSize() != 2) {
                                    return;
                                }
                                setLocal(i, interpreter.newEmptyValue(i));
                                return;
                            default:
                                switch (opcode) {
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        interpreter.ternaryOperation(abstractInsnNode, pop(), pop(), pop());
                                        return;
                                    case 87:
                                        if (pop().getSize() == 2) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of POP");
                                        }
                                        return;
                                    case 88:
                                        if (pop().getSize() == 1 && pop().getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of POP2");
                                        }
                                        return;
                                    case 89:
                                        V pop = pop();
                                        if (pop.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP");
                                        }
                                        push(pop);
                                        push(interpreter.copyOperation(abstractInsnNode, pop));
                                        return;
                                    case 90:
                                        V pop2 = pop();
                                        V pop3 = pop();
                                        if (pop2.getSize() != 1 || pop3.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP_X1");
                                        }
                                        push(interpreter.copyOperation(abstractInsnNode, pop2));
                                        push(pop3);
                                        push(pop2);
                                        return;
                                    case 91:
                                        V pop4 = pop();
                                        if (pop4.getSize() == 1) {
                                            V pop5 = pop();
                                            if (pop5.getSize() == 1) {
                                                V pop6 = pop();
                                                if (pop6.getSize() == 1) {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop4));
                                                    push(pop6);
                                                    push(pop5);
                                                    push(pop4);
                                                    return;
                                                }
                                            } else {
                                                push(interpreter.copyOperation(abstractInsnNode, pop4));
                                                push(pop5);
                                                push(pop4);
                                                return;
                                            }
                                        }
                                        throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP_X2");
                                    case 92:
                                        V pop7 = pop();
                                        if (pop7.getSize() == 1) {
                                            V pop8 = pop();
                                            if (pop8.getSize() == 1) {
                                                push(pop8);
                                                push(pop7);
                                                push(interpreter.copyOperation(abstractInsnNode, pop8));
                                                push(interpreter.copyOperation(abstractInsnNode, pop7));
                                                return;
                                            }
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2");
                                        }
                                        push(pop7);
                                        push(interpreter.copyOperation(abstractInsnNode, pop7));
                                        return;
                                    case 93:
                                        V pop9 = pop();
                                        if (pop9.getSize() == 1) {
                                            V pop10 = pop();
                                            if (pop10.getSize() == 1) {
                                                V pop11 = pop();
                                                if (pop11.getSize() == 1) {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop10));
                                                    push(interpreter.copyOperation(abstractInsnNode, pop9));
                                                    push(pop11);
                                                    push(pop10);
                                                    push(pop9);
                                                    return;
                                                }
                                            }
                                        } else {
                                            V pop12 = pop();
                                            if (pop12.getSize() == 1) {
                                                push(interpreter.copyOperation(abstractInsnNode, pop9));
                                                push(pop12);
                                                push(pop9);
                                                return;
                                            }
                                        }
                                        throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2_X1");
                                    case 94:
                                        V pop13 = pop();
                                        if (pop13.getSize() == 1) {
                                            V pop14 = pop();
                                            if (pop14.getSize() == 1) {
                                                V pop15 = pop();
                                                if (pop15.getSize() == 1) {
                                                    V pop16 = pop();
                                                    if (pop16.getSize() == 1) {
                                                        push(interpreter.copyOperation(abstractInsnNode, pop14));
                                                        push(interpreter.copyOperation(abstractInsnNode, pop13));
                                                        push(pop16);
                                                        push(pop15);
                                                        push(pop14);
                                                        push(pop13);
                                                        return;
                                                    }
                                                } else {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop14));
                                                    push(interpreter.copyOperation(abstractInsnNode, pop13));
                                                    push(pop15);
                                                    push(pop14);
                                                    push(pop13);
                                                    return;
                                                }
                                            }
                                        } else {
                                            V pop17 = pop();
                                            if (pop17.getSize() == 1) {
                                                V pop18 = pop();
                                                if (pop18.getSize() == 1) {
                                                    push(interpreter.copyOperation(abstractInsnNode, pop13));
                                                    push(pop18);
                                                    push(pop17);
                                                    push(pop13);
                                                    return;
                                                }
                                            } else {
                                                push(interpreter.copyOperation(abstractInsnNode, pop13));
                                                push(pop17);
                                                push(pop13);
                                                return;
                                            }
                                        }
                                        throw new AnalyzerException(abstractInsnNode, "Illegal use of DUP2_X2");
                                    case 95:
                                        V pop19 = pop();
                                        V pop20 = pop();
                                        if (pop20.getSize() != 1 || pop19.getSize() != 1) {
                                            throw new AnalyzerException(abstractInsnNode, "Illegal use of SWAP");
                                        }
                                        push(interpreter.copyOperation(abstractInsnNode, pop19));
                                        push(interpreter.copyOperation(abstractInsnNode, pop20));
                                        return;
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case 150:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        break;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case 132:
                                        int i4 = ((IincInsnNode) abstractInsnNode).var;
                                        setLocal(i4, interpreter.unaryOperation(abstractInsnNode, getLocal(i4)));
                                        return;
                                    case Opcodes.I2L /* 133 */:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case Opcodes.L2F /* 137 */:
                                    case 138:
                                    case 139:
                                    case Opcodes.F2L /* 140 */:
                                    case 141:
                                    case Opcodes.D2I /* 142 */:
                                    case Opcodes.D2L /* 143 */:
                                    case Opcodes.D2F /* 144 */:
                                    case Opcodes.I2B /* 145 */:
                                    case Opcodes.I2C /* 146 */:
                                    case Opcodes.I2S /* 147 */:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case 160:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                    case Opcodes.PUTFIELD /* 181 */:
                                        interpreter.binaryOperation(abstractInsnNode, pop(), pop());
                                        return;
                                    case Opcodes.GOTO /* 167 */:
                                    case Opcodes.RET /* 169 */:
                                        return;
                                    case Opcodes.JSR /* 168 */:
                                        push(interpreter.newOperation(abstractInsnNode));
                                        return;
                                    case Opcodes.TABLESWITCH /* 170 */:
                                    case Opcodes.LOOKUPSWITCH /* 171 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case 172:
                                    case 173:
                                    case Opcodes.FRETURN /* 174 */:
                                    case Opcodes.DRETURN /* 175 */:
                                    case Opcodes.ARETURN /* 176 */:
                                        V pop21 = pop();
                                        interpreter.unaryOperation(abstractInsnNode, pop21);
                                        interpreter.returnOperation(abstractInsnNode, pop21, this.returnValue);
                                        return;
                                    case Opcodes.RETURN /* 177 */:
                                        if (this.returnValue != null) {
                                            throw new AnalyzerException(abstractInsnNode, "Incompatible return type");
                                        }
                                        return;
                                    case Opcodes.GETSTATIC /* 178 */:
                                        push(interpreter.newOperation(abstractInsnNode));
                                        return;
                                    case Opcodes.PUTSTATIC /* 179 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case 180:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.INVOKEVIRTUAL /* 182 */:
                                    case Opcodes.INVOKESPECIAL /* 183 */:
                                    case Opcodes.INVOKESTATIC /* 184 */:
                                    case Opcodes.INVOKEINTERFACE /* 185 */:
                                        List<? extends V> arrayList = new ArrayList<>();
                                        String str = ((MethodInsnNode) abstractInsnNode).desc;
                                        for (int length = Type.getArgumentTypes(str).length; length > 0; length--) {
                                            arrayList.add(0, pop());
                                        }
                                        if (abstractInsnNode.getOpcode() != 184) {
                                            arrayList.add(0, pop());
                                        }
                                        if (Type.getReturnType(str) == Type.VOID_TYPE) {
                                            interpreter.naryOperation(abstractInsnNode, arrayList);
                                            return;
                                        } else {
                                            push(interpreter.naryOperation(abstractInsnNode, arrayList));
                                            return;
                                        }
                                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                                        List<? extends V> arrayList2 = new ArrayList<>();
                                        String str2 = ((InvokeDynamicInsnNode) abstractInsnNode).desc;
                                        for (int length2 = Type.getArgumentTypes(str2).length; length2 > 0; length2--) {
                                            arrayList2.add(0, pop());
                                        }
                                        if (Type.getReturnType(str2) == Type.VOID_TYPE) {
                                            interpreter.naryOperation(abstractInsnNode, arrayList2);
                                            return;
                                        } else {
                                            push(interpreter.naryOperation(abstractInsnNode, arrayList2));
                                            return;
                                        }
                                    case Opcodes.NEW /* 187 */:
                                        push(interpreter.newOperation(abstractInsnNode));
                                        return;
                                    case 188:
                                    case 189:
                                    case 190:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.ATHROW /* 191 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    case 192:
                                    case Opcodes.INSTANCEOF /* 193 */:
                                        push(interpreter.unaryOperation(abstractInsnNode, pop()));
                                        return;
                                    case Opcodes.MONITORENTER /* 194 */:
                                    case Opcodes.MONITOREXIT /* 195 */:
                                        interpreter.unaryOperation(abstractInsnNode, pop());
                                        return;
                                    default:
                                        switch (opcode) {
                                            case Opcodes.MULTIANEWARRAY /* 197 */:
                                                List<? extends V> arrayList3 = new ArrayList<>();
                                                for (int i5 = ((MultiANewArrayInsnNode) abstractInsnNode).dims; i5 > 0; i5--) {
                                                    arrayList3.add(0, pop());
                                                }
                                                push(interpreter.naryOperation(abstractInsnNode, arrayList3));
                                                return;
                                            case Opcodes.IFNULL /* 198 */:
                                            case Opcodes.IFNONNULL /* 199 */:
                                                interpreter.unaryOperation(abstractInsnNode, pop());
                                                return;
                                            default:
                                                throw new AnalyzerException(abstractInsnNode, "Illegal opcode " + abstractInsnNode.getOpcode());
                                        }
                                }
                        }
                        push(interpreter.binaryOperation(abstractInsnNode, pop(), pop()));
                        return;
                }
        }
    }

    public boolean merge(Frame<? extends V> frame, Interpreter<V> interpreter) throws AnalyzerException {
        if (this.nStack != frame.nStack) {
            throw new AnalyzerException(null, "Incompatible stack heights");
        }
        boolean z = false;
        for (int i = 0; i < this.nLocals + this.nStack; i++) {
            V merge = interpreter.merge(this.values[i], frame.values[i]);
            if (!merge.equals(this.values[i])) {
                this.values[i] = merge;
                z = true;
            }
        }
        return z;
    }

    public boolean merge(Frame<? extends V> frame, boolean[] zArr) {
        boolean z = false;
        for (int i = 0; i < this.nLocals; i++) {
            if (!zArr[i] && !this.values[i].equals(frame.values[i])) {
                ((V[]) this.values)[i] = ((Object[]) frame.values)[i];
                z = true;
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getLocals(); i++) {
            sb.append(getLocal(i));
        }
        sb.append(' ');
        for (int i2 = 0; i2 < getStackSize(); i2++) {
            sb.append(getStack(i2).toString());
        }
        return sb.toString();
    }
}
