package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* loaded from: classes4.dex */
public class BasicVerifier extends BasicInterpreter {
    public BasicVerifier() {
        super(589824);
        if (getClass() != BasicVerifier.class) {
            throw new IllegalStateException();
        }
    }

    protected BasicVerifier(int i) {
        super(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        BasicValue basicValue2;
        int opcode = abstractInsnNode.getOpcode();
        switch (opcode) {
            case 21:
                basicValue2 = BasicValue.INT_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
                return basicValue;
            case 22:
                basicValue2 = BasicValue.LONG_VALUE;
                if (!basicValue2.equals(basicValue)) {
                }
                return basicValue;
            case 23:
                basicValue2 = BasicValue.FLOAT_VALUE;
                if (!basicValue2.equals(basicValue)) {
                }
                return basicValue;
            case 24:
                basicValue2 = BasicValue.DOUBLE_VALUE;
                if (!basicValue2.equals(basicValue)) {
                }
                return basicValue;
            case 25:
                if (!basicValue.isReference()) {
                    throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
                }
                return basicValue;
            default:
                switch (opcode) {
                    case 54:
                        break;
                    case 55:
                        break;
                    case 56:
                        break;
                    case 57:
                        break;
                    case 58:
                        if (!basicValue.isReference() && !BasicValue.RETURNADDRESS_VALUE.equals(basicValue)) {
                            throw new AnalyzerException(abstractInsnNode, null, "an object reference or a return address", basicValue);
                        }
                        break;
                    default:
                        return basicValue;
                }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[FALL_THROUGH] */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicValue unaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        BasicValue newValue;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 179) {
            newValue = newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
        } else if (opcode == 180) {
            newValue = newValue(Type.getObjectType(((FieldInsnNode) abstractInsnNode).owner));
        } else {
            if (opcode != 198 && opcode != 199) {
                switch (opcode) {
                    case 116:
                        newValue = BasicValue.INT_VALUE;
                        break;
                    case 117:
                        newValue = BasicValue.LONG_VALUE;
                        break;
                    case 118:
                        newValue = BasicValue.FLOAT_VALUE;
                        break;
                    case 119:
                        newValue = BasicValue.DOUBLE_VALUE;
                        break;
                    default:
                        switch (opcode) {
                            case Opcodes.IINC /* 132 */:
                            case Opcodes.I2L /* 133 */:
                            case Opcodes.I2F /* 134 */:
                            case Opcodes.I2D /* 135 */:
                            case Opcodes.I2B /* 145 */:
                            case Opcodes.I2C /* 146 */:
                            case Opcodes.I2S /* 147 */:
                                break;
                            case Opcodes.L2I /* 136 */:
                            case Opcodes.L2F /* 137 */:
                            case Opcodes.L2D /* 138 */:
                                break;
                            case Opcodes.F2I /* 139 */:
                            case Opcodes.F2L /* 140 */:
                            case Opcodes.F2D /* 141 */:
                                break;
                            case Opcodes.D2I /* 142 */:
                            case Opcodes.D2L /* 143 */:
                            case Opcodes.D2F /* 144 */:
                                break;
                            default:
                                switch (opcode) {
                                    default:
                                        switch (opcode) {
                                            case Opcodes.TABLESWITCH /* 170 */:
                                            case Opcodes.LOOKUPSWITCH /* 171 */:
                                            case Opcodes.IRETURN /* 172 */:
                                                break;
                                            case Opcodes.LRETURN /* 173 */:
                                                break;
                                            case Opcodes.FRETURN /* 174 */:
                                                break;
                                            case Opcodes.DRETURN /* 175 */:
                                                break;
                                            case Opcodes.ARETURN /* 176 */:
                                                break;
                                            default:
                                                switch (opcode) {
                                                    case Opcodes.NEWARRAY /* 188 */:
                                                    case Opcodes.ANEWARRAY /* 189 */:
                                                        break;
                                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                                        if (!isArrayValue(basicValue)) {
                                                            throw new AnalyzerException(abstractInsnNode, null, "an array reference", basicValue);
                                                        }
                                                        return super.unaryOperation(abstractInsnNode, basicValue);
                                                    case Opcodes.ATHROW /* 191 */:
                                                    case Opcodes.CHECKCAST /* 192 */:
                                                    case Opcodes.INSTANCEOF /* 193 */:
                                                    case Opcodes.MONITORENTER /* 194 */:
                                                    case Opcodes.MONITOREXIT /* 195 */:
                                                        break;
                                                    default:
                                                        throw new AssertionError();
                                                }
                                        }
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                        break;
                                }
                        }
                }
            }
            if (!basicValue.isReference()) {
                throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
            }
            return super.unaryOperation(abstractInsnNode, basicValue);
        }
        if (!isSubTypeOf(basicValue, newValue)) {
            throw new AnalyzerException(abstractInsnNode, null, newValue, basicValue);
        }
        return super.unaryOperation(abstractInsnNode, basicValue);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicValue binaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        BasicValue newValue;
        BasicValue basicValue3;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 181) {
            switch (opcode) {
                case 46:
                    basicValue3 = newValue(Type.getType("[I"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 47:
                    basicValue3 = newValue(Type.getType("[J"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 48:
                    basicValue3 = newValue(Type.getType("[F"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 49:
                    basicValue3 = newValue(Type.getType("[D"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 50:
                    basicValue3 = newValue(Type.getType("[Ljava/lang/Object;"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 51:
                    if (isSubTypeOf(basicValue, newValue(Type.getType(InstrSupport.DATAFIELD_DESC)))) {
                        basicValue3 = newValue(Type.getType(InstrSupport.DATAFIELD_DESC));
                    } else {
                        basicValue3 = newValue(Type.getType("[B"));
                    }
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 52:
                    basicValue3 = newValue(Type.getType("[C"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                case 53:
                    basicValue3 = newValue(Type.getType("[S"));
                    newValue = BasicValue.INT_VALUE;
                    break;
                default:
                    switch (opcode) {
                        case 96:
                        case 100:
                        case 104:
                        case 108:
                        case 112:
                            basicValue3 = BasicValue.INT_VALUE;
                            newValue = BasicValue.INT_VALUE;
                            break;
                        case 97:
                        case 101:
                        case 105:
                        case 109:
                        case 113:
                            basicValue3 = BasicValue.LONG_VALUE;
                            newValue = BasicValue.LONG_VALUE;
                            break;
                        case 98:
                        case 102:
                        case 106:
                        case 110:
                        case 114:
                            basicValue3 = BasicValue.FLOAT_VALUE;
                            newValue = BasicValue.FLOAT_VALUE;
                            break;
                        case 99:
                        case 103:
                        case 107:
                        case 111:
                        case 115:
                            basicValue3 = BasicValue.DOUBLE_VALUE;
                            newValue = BasicValue.DOUBLE_VALUE;
                            break;
                        default:
                            switch (opcode) {
                                case 120:
                                case 122:
                                case 124:
                                case 126:
                                case 128:
                                case 130:
                                    break;
                                case 121:
                                case 123:
                                case 125:
                                    basicValue3 = BasicValue.LONG_VALUE;
                                    newValue = BasicValue.INT_VALUE;
                                    break;
                                case 127:
                                case Opcodes.LOR /* 129 */:
                                case Opcodes.LXOR /* 131 */:
                                    break;
                                default:
                                    switch (opcode) {
                                        case Opcodes.LCMP /* 148 */:
                                            break;
                                        case Opcodes.FCMPL /* 149 */:
                                        case Opcodes.FCMPG /* 150 */:
                                            break;
                                        case Opcodes.DCMPL /* 151 */:
                                        case Opcodes.DCMPG /* 152 */:
                                            break;
                                        default:
                                            switch (opcode) {
                                                case Opcodes.IF_ICMPEQ /* 159 */:
                                                case Opcodes.IF_ICMPNE /* 160 */:
                                                case Opcodes.IF_ICMPLT /* 161 */:
                                                case Opcodes.IF_ICMPGE /* 162 */:
                                                case Opcodes.IF_ICMPGT /* 163 */:
                                                case Opcodes.IF_ICMPLE /* 164 */:
                                                    break;
                                                case Opcodes.IF_ACMPEQ /* 165 */:
                                                case Opcodes.IF_ACMPNE /* 166 */:
                                                    basicValue3 = BasicValue.REFERENCE_VALUE;
                                                    newValue = BasicValue.REFERENCE_VALUE;
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                    }
                            }
                    }
            }
        } else {
            FieldInsnNode fieldInsnNode = (FieldInsnNode) abstractInsnNode;
            BasicValue newValue2 = newValue(Type.getObjectType(fieldInsnNode.owner));
            newValue = newValue(Type.getType(fieldInsnNode.desc));
            basicValue3 = newValue2;
        }
        if (!isSubTypeOf(basicValue, basicValue3)) {
            throw new AnalyzerException(abstractInsnNode, "First argument", basicValue3, basicValue);
        }
        if (!isSubTypeOf(basicValue2, newValue)) {
            throw new AnalyzerException(abstractInsnNode, "Second argument", newValue, basicValue2);
        }
        if (abstractInsnNode.getOpcode() == 50) {
            return getElementValue(basicValue);
        }
        return super.binaryOperation(abstractInsnNode, basicValue, basicValue2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        BasicValue newValue;
        BasicValue basicValue4;
        switch (abstractInsnNode.getOpcode()) {
            case 79:
                newValue = newValue(Type.getType("[I"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 80:
                newValue = newValue(Type.getType("[J"));
                basicValue4 = BasicValue.LONG_VALUE;
                break;
            case 81:
                newValue = newValue(Type.getType("[F"));
                basicValue4 = BasicValue.FLOAT_VALUE;
                break;
            case 82:
                newValue = newValue(Type.getType("[D"));
                basicValue4 = BasicValue.DOUBLE_VALUE;
                break;
            case 83:
                basicValue4 = BasicValue.REFERENCE_VALUE;
                newValue = basicValue;
                break;
            case 84:
                if (isSubTypeOf(basicValue, newValue(Type.getType(InstrSupport.DATAFIELD_DESC)))) {
                    newValue = newValue(Type.getType(InstrSupport.DATAFIELD_DESC));
                } else {
                    newValue = newValue(Type.getType("[B"));
                }
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 85:
                newValue = newValue(Type.getType("[C"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 86:
                newValue = newValue(Type.getType("[S"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            default:
                throw new AssertionError();
        }
        if (!isSubTypeOf(basicValue, newValue)) {
            throw new AnalyzerException(abstractInsnNode, "First argument", "a " + newValue + " array reference", basicValue);
        }
        if (!BasicValue.INT_VALUE.equals(basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Second argument", BasicValue.INT_VALUE, basicValue2);
        }
        if (isSubTypeOf(basicValue3, basicValue4)) {
            return null;
        }
        throw new AnalyzerException(abstractInsnNode, "Third argument", basicValue4, basicValue3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int i;
        String str;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            for (BasicValue basicValue : list) {
                if (!BasicValue.INT_VALUE.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, BasicValue.INT_VALUE, basicValue);
                }
            }
        } else {
            int i2 = 0;
            if (opcode == 184 || opcode == 186) {
                i = 0;
            } else {
                Type objectType = Type.getObjectType(((MethodInsnNode) abstractInsnNode).owner);
                if (!isSubTypeOf(list.get(0), newValue(objectType))) {
                    throw new AnalyzerException(abstractInsnNode, "Method owner", newValue(objectType), list.get(0));
                }
                i = 1;
            }
            if (opcode == 186) {
                str = ((InvokeDynamicInsnNode) abstractInsnNode).desc;
            } else {
                str = ((MethodInsnNode) abstractInsnNode).desc;
            }
            Type[] argumentTypes = Type.getArgumentTypes(str);
            while (i < list.size()) {
                int i3 = i2 + 1;
                BasicValue newValue = newValue(argumentTypes[i2]);
                int i4 = i + 1;
                BasicValue basicValue2 = list.get(i);
                if (!isSubTypeOf(basicValue2, newValue)) {
                    throw new AnalyzerException(abstractInsnNode, "Argument " + i3, newValue, basicValue2);
                }
                i2 = i3;
                i = i4;
            }
        }
        return super.naryOperation(abstractInsnNode, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        if (!isSubTypeOf(basicValue, basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Incompatible return type", basicValue2, basicValue);
        }
    }

    protected boolean isArrayValue(BasicValue basicValue) {
        return basicValue.isReference();
    }

    protected BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        return BasicValue.REFERENCE_VALUE;
    }

    protected boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        return basicValue.equals(basicValue2);
    }
}
