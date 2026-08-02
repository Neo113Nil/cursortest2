package org.modelmapper.internal.asm.tree.analysis;

import com.ironsource.X3;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.modelmapper.internal.asm.ConstantDynamic;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.tree.AbstractInsnNode;
import org.modelmapper.internal.asm.tree.FieldInsnNode;
import org.modelmapper.internal.asm.tree.IntInsnNode;
import org.modelmapper.internal.asm.tree.InvokeDynamicInsnNode;
import org.modelmapper.internal.asm.tree.LdcInsnNode;
import org.modelmapper.internal.asm.tree.MethodInsnNode;
import org.modelmapper.internal.asm.tree.MultiANewArrayInsnNode;
import org.modelmapper.internal.asm.tree.TypeInsnNode;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* loaded from: classes4.dex */
public class BasicInterpreter extends Interpreter<BasicValue> implements Opcodes {
    public static final Type NULL_TYPE = Type.getObjectType(AbstractJsonLexerKt.NULL);

    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        return basicValue;
    }

    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
    }

    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        return null;
    }

    public BasicInterpreter() {
        super(Opcodes.ASM6);
        if (getClass() != BasicInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    protected BasicInterpreter(int i) {
        super(i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue newValue(Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        switch (type.getSort()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return BasicValue.INT_VALUE;
            case 6:
                return BasicValue.FLOAT_VALUE;
            case 7:
                return BasicValue.LONG_VALUE;
            case 8:
                return BasicValue.DOUBLE_VALUE;
            case 9:
            case 10:
                return BasicValue.REFERENCE_VALUE;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 168) {
            return BasicValue.RETURNADDRESS_VALUE;
        }
        if (opcode == 178) {
            return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
        }
        if (opcode != 187) {
            switch (opcode) {
                case 1:
                    return newValue(NULL_TYPE);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return BasicValue.INT_VALUE;
                case 9:
                case 10:
                    return BasicValue.LONG_VALUE;
                case 11:
                case 12:
                case 13:
                    return BasicValue.FLOAT_VALUE;
                case 14:
                case 15:
                    return BasicValue.DOUBLE_VALUE;
                case 16:
                case 17:
                    return BasicValue.INT_VALUE;
                case 18:
                    Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                    if (obj instanceof Integer) {
                        return BasicValue.INT_VALUE;
                    }
                    if (obj instanceof Float) {
                        return BasicValue.FLOAT_VALUE;
                    }
                    if (obj instanceof Long) {
                        return BasicValue.LONG_VALUE;
                    }
                    if (obj instanceof Double) {
                        return BasicValue.DOUBLE_VALUE;
                    }
                    if (obj instanceof String) {
                        return newValue(Type.getObjectType("java/lang/String"));
                    }
                    if (obj instanceof Type) {
                        int sort = ((Type) obj).getSort();
                        if (sort == 10 || sort == 9) {
                            return newValue(Type.getObjectType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME));
                        }
                        if (sort == 11) {
                            return newValue(Type.getObjectType("java/lang/invoke/MethodType"));
                        }
                        throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                    }
                    if (obj instanceof Handle) {
                        return newValue(Type.getObjectType("java/lang/invoke/MethodHandle"));
                    }
                    if (obj instanceof ConstantDynamic) {
                        return newValue(Type.getType(((ConstantDynamic) obj).getDescriptor()));
                    }
                    throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                default:
                    throw new AssertionError();
            }
        }
        return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicValue unaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 179) {
            if (opcode == 180) {
                return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
            }
            if (opcode != 198 && opcode != 199) {
                switch (opcode) {
                    case 116:
                        return BasicValue.INT_VALUE;
                    case 117:
                        return BasicValue.LONG_VALUE;
                    case 118:
                        return BasicValue.FLOAT_VALUE;
                    case 119:
                        return BasicValue.DOUBLE_VALUE;
                    default:
                        switch (opcode) {
                            case 132:
                            case 136:
                            case 139:
                            case Opcodes.D2I /* 142 */:
                            case Opcodes.I2B /* 145 */:
                            case Opcodes.I2C /* 146 */:
                            case Opcodes.I2S /* 147 */:
                                break;
                            case Opcodes.I2L /* 133 */:
                            case Opcodes.F2L /* 140 */:
                            case Opcodes.D2L /* 143 */:
                                break;
                            case 134:
                            case Opcodes.L2F /* 137 */:
                            case Opcodes.D2F /* 144 */:
                                break;
                            case 135:
                            case 138:
                            case 141:
                                break;
                            default:
                                switch (opcode) {
                                    default:
                                        switch (opcode) {
                                            case Opcodes.TABLESWITCH /* 170 */:
                                            case Opcodes.LOOKUPSWITCH /* 171 */:
                                            case 172:
                                            case 173:
                                            case Opcodes.FRETURN /* 174 */:
                                            case Opcodes.DRETURN /* 175 */:
                                            case Opcodes.ARETURN /* 176 */:
                                                break;
                                            default:
                                                switch (opcode) {
                                                    case 188:
                                                        switch (((IntInsnNode) abstractInsnNode).operand) {
                                                            case 4:
                                                                return newValue(Type.getType("[Z"));
                                                            case 5:
                                                                return newValue(Type.getType("[C"));
                                                            case 6:
                                                                return newValue(Type.getType("[F"));
                                                            case 7:
                                                                return newValue(Type.getType("[D"));
                                                            case 8:
                                                                return newValue(Type.getType("[B"));
                                                            case 9:
                                                                return newValue(Type.getType("[S"));
                                                            case 10:
                                                                return newValue(Type.getType("[I"));
                                                            case 11:
                                                                return newValue(Type.getType("[J"));
                                                            default:
                                                                throw new AnalyzerException(abstractInsnNode, "Invalid array type");
                                                        }
                                                    case 189:
                                                        return newValue(Type.getType(X3.j.d + Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc)));
                                                    case 190:
                                                        return BasicValue.INT_VALUE;
                                                    case Opcodes.ATHROW /* 191 */:
                                                        return null;
                                                    case 192:
                                                        return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
                                                    case Opcodes.INSTANCEOF /* 193 */:
                                                        return BasicValue.INT_VALUE;
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
                                        return null;
                                }
                        }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BasicValue binaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 181) {
            return null;
        }
        switch (opcode) {
            case 46:
            case 51:
            case 52:
            case 53:
                return BasicValue.INT_VALUE;
            case 47:
                return BasicValue.LONG_VALUE;
            case 48:
                return BasicValue.FLOAT_VALUE;
            case 49:
                return BasicValue.DOUBLE_VALUE;
            case 50:
                return BasicValue.REFERENCE_VALUE;
            default:
                switch (opcode) {
                    case 96:
                    case 100:
                    case 104:
                    case 108:
                    case 112:
                        break;
                    case 97:
                    case 101:
                    case 105:
                    case 109:
                    case 113:
                        break;
                    case 98:
                    case 102:
                    case 106:
                    case 110:
                    case 114:
                        break;
                    case 99:
                    case 103:
                    case 107:
                    case 111:
                    case 115:
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
                            case 127:
                            case 129:
                            case 131:
                                break;
                            default:
                                switch (opcode) {
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case 150:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        return BasicValue.INT_VALUE;
                                    default:
                                        switch (opcode) {
                                            case Opcodes.IF_ICMPEQ /* 159 */:
                                            case 160:
                                            case Opcodes.IF_ICMPLT /* 161 */:
                                            case Opcodes.IF_ICMPGE /* 162 */:
                                            case Opcodes.IF_ICMPGT /* 163 */:
                                            case Opcodes.IF_ICMPLE /* 164 */:
                                            case Opcodes.IF_ACMPEQ /* 165 */:
                                            case Opcodes.IF_ACMPNE /* 166 */:
                                                return null;
                                            default:
                                                throw new AssertionError();
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            return newValue(Type.getType(((MultiANewArrayInsnNode) abstractInsnNode).desc));
        }
        if (opcode == 186) {
            return newValue(Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc));
        }
        return newValue(Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc));
    }

    @Override // org.modelmapper.internal.asm.tree.analysis.Interpreter
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        return !basicValue.equals(basicValue2) ? BasicValue.UNINITIALIZED_VALUE : basicValue;
    }
}
