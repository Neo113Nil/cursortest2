package org.modelmapper.internal.asm.commons;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;

/* loaded from: classes4.dex */
public class GeneratorAdapter extends LocalVariablesSorter {
    public static final int ADD = 96;
    public static final int AND = 126;
    private static final String CLASS_DESCRIPTOR = "Ljava/lang/Class;";
    public static final int DIV = 108;
    public static final int EQ = 153;
    public static final int GE = 156;
    public static final int GT = 157;
    public static final int LE = 158;
    public static final int LT = 155;
    public static final int MUL = 104;
    public static final int NE = 154;
    public static final int NEG = 116;
    public static final int OR = 128;
    public static final int REM = 112;
    public static final int SHL = 120;
    public static final int SHR = 122;
    public static final int SUB = 100;
    public static final int USHR = 124;
    public static final int XOR = 130;
    private final int access;
    private final Type[] argumentTypes;
    private final List<Type> localTypes;
    private final String name;
    private final Type returnType;
    private static final Type BYTE_TYPE = Type.getObjectType("java/lang/Byte");
    private static final Type BOOLEAN_TYPE = Type.getObjectType("java/lang/Boolean");
    private static final Type SHORT_TYPE = Type.getObjectType("java/lang/Short");
    private static final Type CHARACTER_TYPE = Type.getObjectType("java/lang/Character");
    private static final Type INTEGER_TYPE = Type.getObjectType("java/lang/Integer");
    private static final Type FLOAT_TYPE = Type.getObjectType("java/lang/Float");
    private static final Type LONG_TYPE = Type.getObjectType("java/lang/Long");
    private static final Type DOUBLE_TYPE = Type.getObjectType("java/lang/Double");
    private static final Type NUMBER_TYPE = Type.getObjectType("java/lang/Number");
    private static final Type OBJECT_TYPE = Type.getObjectType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
    private static final Method BOOLEAN_VALUE = Method.getMethod("boolean booleanValue()");
    private static final Method CHAR_VALUE = Method.getMethod("char charValue()");
    private static final Method INT_VALUE = Method.getMethod("int intValue()");
    private static final Method FLOAT_VALUE = Method.getMethod("float floatValue()");
    private static final Method LONG_VALUE = Method.getMethod("long longValue()");
    private static final Method DOUBLE_VALUE = Method.getMethod("double doubleValue()");

    public GeneratorAdapter(MethodVisitor methodVisitor, int i, String str, String str2) {
        this(Opcodes.ASM6, methodVisitor, i, str, str2);
        if (getClass() != GeneratorAdapter.class) {
            throw new IllegalStateException();
        }
    }

    protected GeneratorAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2) {
        super(i, i2, str2, methodVisitor);
        this.localTypes = new ArrayList();
        this.access = i2;
        this.name = str;
        this.returnType = Type.getReturnType(str2);
        this.argumentTypes = Type.getArgumentTypes(str2);
    }

    public GeneratorAdapter(int i, Method method, MethodVisitor methodVisitor) {
        this(methodVisitor, i, method.getName(), method.getDescriptor());
    }

    public GeneratorAdapter(int i, Method method, String str, Type[] typeArr, ClassVisitor classVisitor) {
        this(i, method, classVisitor.visitMethod(i, method.getName(), method.getDescriptor(), str, getInternalNames(typeArr)));
    }

    private static String[] getInternalNames(Type[] typeArr) {
        if (typeArr == null) {
            return null;
        }
        int length = typeArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeArr[i].getInternalName();
        }
        return strArr;
    }

    public int getAccess() {
        return this.access;
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public Type[] getArgumentTypes() {
        return (Type[]) this.argumentTypes.clone();
    }

    public void push(boolean z) {
        push(z ? 1 : 0);
    }

    public void push(int i) {
        if (i >= -1 && i <= 5) {
            this.mv.visitInsn(i + 3);
            return;
        }
        if (i >= -128 && i <= 127) {
            this.mv.visitIntInsn(16, i);
        } else if (i >= -32768 && i <= 32767) {
            this.mv.visitIntInsn(17, i);
        } else {
            this.mv.visitLdcInsn(Integer.valueOf(i));
        }
    }

    public void push(long j) {
        if (j == 0 || j == 1) {
            this.mv.visitInsn(((int) j) + 9);
        } else {
            this.mv.visitLdcInsn(Long.valueOf(j));
        }
    }

    public void push(float f) {
        int floatToIntBits = Float.floatToIntBits(f);
        if (floatToIntBits == 0 || floatToIntBits == 1065353216 || floatToIntBits == 1073741824) {
            this.mv.visitInsn(((int) f) + 11);
        } else {
            this.mv.visitLdcInsn(Float.valueOf(f));
        }
    }

    public void push(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (doubleToLongBits == 0 || doubleToLongBits == 4607182418800017408L) {
            this.mv.visitInsn(((int) d) + 14);
        } else {
            this.mv.visitLdcInsn(Double.valueOf(d));
        }
    }

    public void push(String str) {
        if (str == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(str);
        }
    }

    public void push(Type type) {
        if (type == null) {
            this.mv.visitInsn(1);
            return;
        }
        switch (type.getSort()) {
            case 1:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 2:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Character", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 3:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Byte", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 4:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Short", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 5:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Integer", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 6:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Float", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 7:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Long", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            case 8:
                this.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Double", CredentialProviderBaseController.TYPE_TAG, CLASS_DESCRIPTOR);
                break;
            default:
                this.mv.visitLdcInsn(type);
                break;
        }
    }

    public void push(Handle handle) {
        if (handle == null) {
            this.mv.visitInsn(1);
        } else {
            this.mv.visitLdcInsn(handle);
        }
    }

    private int getArgIndex(int i) {
        int i2 = (this.access & 8) == 0 ? 1 : 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.argumentTypes[i3].getSize();
        }
        return i2;
    }

    private void loadInsn(Type type, int i) {
        this.mv.visitVarInsn(type.getOpcode(21), i);
    }

    private void storeInsn(Type type, int i) {
        this.mv.visitVarInsn(type.getOpcode(54), i);
    }

    public void loadThis() {
        if ((this.access & 8) != 0) {
            throw new IllegalStateException("no 'this' pointer within static method");
        }
        this.mv.visitVarInsn(25, 0);
    }

    public void loadArg(int i) {
        loadInsn(this.argumentTypes[i], getArgIndex(i));
    }

    public void loadArgs(int i, int i2) {
        int argIndex = getArgIndex(i);
        for (int i3 = 0; i3 < i2; i3++) {
            Type type = this.argumentTypes[i + i3];
            loadInsn(type, argIndex);
            argIndex += type.getSize();
        }
    }

    public void loadArgs() {
        loadArgs(0, this.argumentTypes.length);
    }

    public void loadArgArray() {
        push(this.argumentTypes.length);
        newArray(OBJECT_TYPE);
        for (int i = 0; i < this.argumentTypes.length; i++) {
            dup();
            push(i);
            loadArg(i);
            box(this.argumentTypes[i]);
            arrayStore(OBJECT_TYPE);
        }
    }

    public void storeArg(int i) {
        storeInsn(this.argumentTypes[i], getArgIndex(i));
    }

    public Type getLocalType(int i) {
        return this.localTypes.get(i - this.firstLocal);
    }

    @Override // org.modelmapper.internal.asm.commons.LocalVariablesSorter
    protected void setLocalType(int i, Type type) {
        int i2 = i - this.firstLocal;
        while (this.localTypes.size() < i2 + 1) {
            this.localTypes.add(null);
        }
        this.localTypes.set(i2, type);
    }

    public void loadLocal(int i) {
        loadInsn(getLocalType(i), i);
    }

    public void loadLocal(int i, Type type) {
        setLocalType(i, type);
        loadInsn(type, i);
    }

    public void storeLocal(int i) {
        storeInsn(getLocalType(i), i);
    }

    public void storeLocal(int i, Type type) {
        setLocalType(i, type);
        storeInsn(type, i);
    }

    public void arrayLoad(Type type) {
        this.mv.visitInsn(type.getOpcode(46));
    }

    public void arrayStore(Type type) {
        this.mv.visitInsn(type.getOpcode(79));
    }

    public void pop() {
        this.mv.visitInsn(87);
    }

    public void pop2() {
        this.mv.visitInsn(88);
    }

    public void dup() {
        this.mv.visitInsn(89);
    }

    public void dup2() {
        this.mv.visitInsn(92);
    }

    public void dupX1() {
        this.mv.visitInsn(90);
    }

    public void dupX2() {
        this.mv.visitInsn(91);
    }

    public void dup2X1() {
        this.mv.visitInsn(93);
    }

    public void dup2X2() {
        this.mv.visitInsn(94);
    }

    public void swap() {
        this.mv.visitInsn(95);
    }

    public void swap(Type type, Type type2) {
        if (type2.getSize() == 1) {
            if (type.getSize() == 1) {
                swap();
                return;
            } else {
                dupX2();
                pop();
                return;
            }
        }
        if (type.getSize() == 1) {
            dup2X1();
            pop2();
        } else {
            dup2X2();
            pop2();
        }
    }

    public void math(int i, Type type) {
        this.mv.visitInsn(type.getOpcode(i));
    }

    public void not() {
        this.mv.visitInsn(4);
        this.mv.visitInsn(130);
    }

    public void iinc(int i, int i2) {
        this.mv.visitIincInsn(i, i2);
    }

    public void cast(Type type, Type type2) {
        if (type != type2) {
            if (type.getSort() < 1 || type.getSort() > 8 || type2.getSort() < 1 || type2.getSort() > 8) {
                throw new IllegalArgumentException("Cannot cast from " + type + " to " + type2);
            }
            if (type == Type.DOUBLE_TYPE) {
                if (type2 == Type.FLOAT_TYPE) {
                    this.mv.visitInsn(Opcodes.D2F);
                    return;
                } else if (type2 == Type.LONG_TYPE) {
                    this.mv.visitInsn(Opcodes.D2L);
                    return;
                } else {
                    this.mv.visitInsn(Opcodes.D2I);
                    cast(Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type == Type.FLOAT_TYPE) {
                if (type2 == Type.DOUBLE_TYPE) {
                    this.mv.visitInsn(141);
                    return;
                } else if (type2 == Type.LONG_TYPE) {
                    this.mv.visitInsn(Opcodes.F2L);
                    return;
                } else {
                    this.mv.visitInsn(139);
                    cast(Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type == Type.LONG_TYPE) {
                if (type2 == Type.DOUBLE_TYPE) {
                    this.mv.visitInsn(138);
                    return;
                } else if (type2 == Type.FLOAT_TYPE) {
                    this.mv.visitInsn(Opcodes.L2F);
                    return;
                } else {
                    this.mv.visitInsn(136);
                    cast(Type.INT_TYPE, type2);
                    return;
                }
            }
            if (type2 == Type.BYTE_TYPE) {
                this.mv.visitInsn(Opcodes.I2B);
                return;
            }
            if (type2 == Type.CHAR_TYPE) {
                this.mv.visitInsn(Opcodes.I2C);
                return;
            }
            if (type2 == Type.DOUBLE_TYPE) {
                this.mv.visitInsn(135);
                return;
            }
            if (type2 == Type.FLOAT_TYPE) {
                this.mv.visitInsn(134);
            } else if (type2 == Type.LONG_TYPE) {
                this.mv.visitInsn(Opcodes.I2L);
            } else if (type2 == Type.SHORT_TYPE) {
                this.mv.visitInsn(Opcodes.I2S);
            }
        }
    }

    private static Type getBoxedType(Type type) {
        switch (type.getSort()) {
            case 1:
                return BOOLEAN_TYPE;
            case 2:
                return CHARACTER_TYPE;
            case 3:
                return BYTE_TYPE;
            case 4:
                return SHORT_TYPE;
            case 5:
                return INTEGER_TYPE;
            case 6:
                return FLOAT_TYPE;
            case 7:
                return LONG_TYPE;
            case 8:
                return DOUBLE_TYPE;
            default:
                return type;
        }
    }

    public void box(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == Type.VOID_TYPE) {
            push((String) null);
            return;
        }
        Type boxedType = getBoxedType(type);
        newInstance(boxedType);
        if (type.getSize() == 2) {
            dupX2();
            dupX2();
            pop();
        } else {
            dupX1();
            swap();
        }
        invokeConstructor(boxedType, new Method(MethodDescription.CONSTRUCTOR_INTERNAL_NAME, Type.VOID_TYPE, new Type[]{type}));
    }

    public void valueOf(Type type) {
        if (type.getSort() == 10 || type.getSort() == 9) {
            return;
        }
        if (type == Type.VOID_TYPE) {
            push((String) null);
        } else {
            Type boxedType = getBoxedType(type);
            invokeStatic(boxedType, new Method("valueOf", boxedType, new Type[]{type}));
        }
    }

    public void unbox(Type type) {
        Method method;
        Type type2 = NUMBER_TYPE;
        switch (type.getSort()) {
            case 0:
                return;
            case 1:
                type2 = BOOLEAN_TYPE;
                method = BOOLEAN_VALUE;
                break;
            case 2:
                type2 = CHARACTER_TYPE;
                method = CHAR_VALUE;
                break;
            case 3:
            case 4:
            case 5:
                method = INT_VALUE;
                break;
            case 6:
                method = FLOAT_VALUE;
                break;
            case 7:
                method = LONG_VALUE;
                break;
            case 8:
                method = DOUBLE_VALUE;
                break;
            default:
                method = null;
                break;
        }
        if (method == null) {
            checkCast(type);
        } else {
            checkCast(type2);
            invokeVirtual(type2, method);
        }
    }

    public Label newLabel() {
        return new Label();
    }

    public void mark(Label label) {
        this.mv.visitLabel(label);
    }

    public Label mark() {
        Label label = new Label();
        this.mv.visitLabel(label);
        return label;
    }

    public void ifCmp(Type type, int i, Label label) {
        int i2;
        switch (type.getSort()) {
            case 6:
                this.mv.visitInsn((i == 156 || i == 157) ? Opcodes.FCMPL : 150);
                break;
            case 7:
                this.mv.visitInsn(Opcodes.LCMP);
                break;
            case 8:
                this.mv.visitInsn((i == 156 || i == 157) ? Opcodes.DCMPL : Opcodes.DCMPG);
                break;
            case 9:
            case 10:
                if (i == 153) {
                    this.mv.visitJumpInsn(Opcodes.IF_ACMPEQ, label);
                    return;
                } else {
                    if (i == 154) {
                        this.mv.visitJumpInsn(Opcodes.IF_ACMPNE, label);
                        return;
                    }
                    throw new IllegalArgumentException("Bad comparison for type " + type);
                }
            default:
                switch (i) {
                    case 153:
                        i2 = Opcodes.IF_ICMPEQ;
                        break;
                    case 154:
                        i2 = 160;
                        break;
                    case 155:
                        i2 = Opcodes.IF_ICMPLT;
                        break;
                    case 156:
                        i2 = Opcodes.IF_ICMPGE;
                        break;
                    case 157:
                        i2 = Opcodes.IF_ICMPGT;
                        break;
                    case 158:
                        i2 = Opcodes.IF_ICMPLE;
                        break;
                    default:
                        throw new IllegalArgumentException("Bad comparison mode " + i);
                }
                this.mv.visitJumpInsn(i2, label);
                return;
        }
        this.mv.visitJumpInsn(i, label);
    }

    public void ifICmp(int i, Label label) {
        ifCmp(Type.INT_TYPE, i, label);
    }

    public void ifZCmp(int i, Label label) {
        this.mv.visitJumpInsn(i, label);
    }

    public void ifNull(Label label) {
        this.mv.visitJumpInsn(Opcodes.IFNULL, label);
    }

    public void ifNonNull(Label label) {
        this.mv.visitJumpInsn(Opcodes.IFNONNULL, label);
    }

    public void goTo(Label label) {
        this.mv.visitJumpInsn(Opcodes.GOTO, label);
    }

    public void ret(int i) {
        this.mv.visitVarInsn(Opcodes.RET, i);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator) {
        tableSwitch(iArr, tableSwitchGenerator, (iArr.length == 0 ? 0.0f : ((float) iArr.length) / ((float) ((iArr[iArr.length - 1] - iArr[0]) + 1))) >= 0.5f);
    }

    public void tableSwitch(int[] iArr, TableSwitchGenerator tableSwitchGenerator, boolean z) {
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] < iArr[i - 1]) {
                throw new IllegalArgumentException("keys must be sorted in ascending order");
            }
        }
        Label newLabel = newLabel();
        Label newLabel2 = newLabel();
        if (iArr.length > 0) {
            int length = iArr.length;
            int i2 = 0;
            if (z) {
                int i3 = iArr[0];
                int i4 = iArr[length - 1];
                int i5 = (i4 - i3) + 1;
                Label[] labelArr = new Label[i5];
                Arrays.fill(labelArr, newLabel);
                for (int i6 : iArr) {
                    labelArr[i6 - i3] = newLabel();
                }
                this.mv.visitTableSwitchInsn(i3, i4, newLabel, labelArr);
                while (i2 < i5) {
                    Label label = labelArr[i2];
                    if (label != newLabel) {
                        mark(label);
                        tableSwitchGenerator.generateCase(i2 + i3, newLabel2);
                    }
                    i2++;
                }
            } else {
                Label[] labelArr2 = new Label[length];
                for (int i7 = 0; i7 < length; i7++) {
                    labelArr2[i7] = newLabel();
                }
                this.mv.visitLookupSwitchInsn(newLabel, iArr, labelArr2);
                while (i2 < length) {
                    mark(labelArr2[i2]);
                    tableSwitchGenerator.generateCase(iArr[i2], newLabel2);
                    i2++;
                }
            }
        }
        mark(newLabel);
        tableSwitchGenerator.generateDefault();
        mark(newLabel2);
    }

    public void returnValue() {
        this.mv.visitInsn(this.returnType.getOpcode(172));
    }

    private void fieldInsn(int i, Type type, String str, Type type2) {
        this.mv.visitFieldInsn(i, type.getInternalName(), str, type2.getDescriptor());
    }

    public void getStatic(Type type, String str, Type type2) {
        fieldInsn(Opcodes.GETSTATIC, type, str, type2);
    }

    public void putStatic(Type type, String str, Type type2) {
        fieldInsn(Opcodes.PUTSTATIC, type, str, type2);
    }

    public void getField(Type type, String str, Type type2) {
        fieldInsn(180, type, str, type2);
    }

    public void putField(Type type, String str, Type type2) {
        fieldInsn(Opcodes.PUTFIELD, type, str, type2);
    }

    private void invokeInsn(int i, Type type, Method method, boolean z) {
        this.mv.visitMethodInsn(i, type.getSort() == 9 ? type.getDescriptor() : type.getInternalName(), method.getName(), method.getDescriptor(), z);
    }

    public void invokeVirtual(Type type, Method method) {
        invokeInsn(Opcodes.INVOKEVIRTUAL, type, method, false);
    }

    public void invokeConstructor(Type type, Method method) {
        invokeInsn(Opcodes.INVOKESPECIAL, type, method, false);
    }

    public void invokeStatic(Type type, Method method) {
        invokeInsn(Opcodes.INVOKESTATIC, type, method, false);
    }

    public void invokeInterface(Type type, Method method) {
        invokeInsn(Opcodes.INVOKEINTERFACE, type, method, true);
    }

    public void invokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        this.mv.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    private void typeInsn(int i, Type type) {
        this.mv.visitTypeInsn(i, type.getInternalName());
    }

    public void newInstance(Type type) {
        typeInsn(Opcodes.NEW, type);
    }

    public void newArray(Type type) {
        int i;
        switch (type.getSort()) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 5;
                break;
            case 3:
                i = 8;
                break;
            case 4:
                i = 9;
                break;
            case 5:
                i = 10;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 11;
                break;
            case 8:
                i = 7;
                break;
            default:
                typeInsn(189, type);
                return;
        }
        this.mv.visitIntInsn(188, i);
    }

    public void arrayLength() {
        this.mv.visitInsn(190);
    }

    public void throwException() {
        this.mv.visitInsn(Opcodes.ATHROW);
    }

    public void throwException(Type type, String str) {
        newInstance(type);
        dup();
        push(str);
        invokeConstructor(type, Method.getMethod("void <init> (String)"));
        throwException();
    }

    public void checkCast(Type type) {
        if (type.equals(OBJECT_TYPE)) {
            return;
        }
        typeInsn(192, type);
    }

    public void instanceOf(Type type) {
        typeInsn(Opcodes.INSTANCEOF, type);
    }

    public void monitorEnter() {
        this.mv.visitInsn(Opcodes.MONITORENTER);
    }

    public void monitorExit() {
        this.mv.visitInsn(Opcodes.MONITOREXIT);
    }

    public void endMethod() {
        if ((this.access & 1024) == 0) {
            this.mv.visitMaxs(0, 0);
        }
        this.mv.visitEnd();
    }

    public void catchException(Label label, Label label2, Type type) {
        Label label3 = new Label();
        if (type == null) {
            this.mv.visitTryCatchBlock(label, label2, label3, null);
        } else {
            this.mv.visitTryCatchBlock(label, label2, label3, type.getInternalName());
        }
        mark(label3);
    }
}
