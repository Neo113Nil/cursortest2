package org.modelmapper.internal.bytebuddy.utility.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

/* loaded from: classes4.dex */
public class StackAwareMethodVisitor extends MethodVisitor {
    private static final int[] SIZE_CHANGE = new int[202];
    private List<StackSize> current;
    private int freeIndex;
    private final Map<Label, List<StackSize>> sizes;

    static {
        int i = 0;
        while (true) {
            int[] iArr = SIZE_CHANGE;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEEEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
            i++;
        }
    }

    public StackAwareMethodVisitor(MethodVisitor methodVisitor, MethodDescription methodDescription) {
        super(OpenedClassReader.ASM_API, methodVisitor);
        this.current = new ArrayList();
        this.sizes = new HashMap();
        this.freeIndex = methodDescription.getStackSize();
    }

    private void adjustStack(int i) {
        adjustStack(i, 0);
    }

    private void adjustStack(int i, int i2) {
        if (i > 2) {
            throw new IllegalStateException("Cannot push multiple values onto the operand stack: " + i);
        }
        if (i > 0) {
            int size = this.current.size();
            while (i2 > 0 && size > 0) {
                size--;
                i2 -= this.current.get(size).getSize();
            }
            if (i2 < 0) {
                throw new IllegalStateException("Unexpected offset underflow: " + i2);
            }
            this.current.add(size, StackSize.of(i));
            return;
        }
        if (i2 != 0) {
            throw new IllegalStateException("Cannot specify non-zero offset " + i2 + " for non-incrementing value: " + i);
        }
        while (i < 0) {
            if (this.current.isEmpty()) {
                return;
            }
            List<StackSize> list = this.current;
            i += list.remove(list.size() - 1).getSize();
        }
        if (i == 1) {
            this.current.add(StackSize.SINGLE);
        } else if (i != 0) {
            throw new IllegalStateException("Unexpected remainder on the operand stack: " + i);
        }
    }

    public void drainStack() {
        doDrain(this.current);
    }

    public int drainStack(int i, int i2, StackSize stackSize) {
        List<StackSize> list = this.current;
        int size = list.get(list.size() - 1).getSize() - stackSize.getSize();
        if (this.current.size() == 1 && size == 0) {
            return 0;
        }
        super.visitVarInsn(i, this.freeIndex);
        if (size == 1) {
            super.visitInsn(87);
        } else if (size != 0) {
            throw new IllegalStateException("Unexpected remainder on the operand stack: " + size);
        }
        List<StackSize> list2 = this.current;
        doDrain(list2.subList(0, list2.size() - 1));
        super.visitVarInsn(i2, this.freeIndex);
        return this.freeIndex + stackSize.getSize();
    }

    private void doDrain(List<StackSize> list) {
        ListIterator<StackSize> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            StackSize previous = listIterator.previous();
            int i = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[previous.ordinal()];
            if (i == 1) {
                super.visitInsn(87);
            } else if (i == 2) {
                super.visitInsn(88);
            } else {
                throw new IllegalStateException("Unexpected stack size: " + previous);
            }
        }
    }

    /* renamed from: org.modelmapper.internal.bytebuddy.utility.visitor.StackAwareMethodVisitor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize;

        static {
            int[] iArr = new int[StackSize.values().length];
            $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize = iArr;
            try {
                iArr[StackSize.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bytecode$StackSize[StackSize.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void register(Label label, List<StackSize> list) {
        this.sizes.put(label, list);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitInsn(int i) {
        if (i != 47 && i != 49) {
            if (i != 133) {
                if (i != 144) {
                    if (i != 191) {
                        if (i != 90) {
                            if (i != 91) {
                                if (i != 93) {
                                    if (i != 94) {
                                        switch (i) {
                                            case 135:
                                                break;
                                            case 136:
                                            case Opcodes.L2F /* 137 */:
                                                break;
                                            default:
                                                switch (i) {
                                                    case Opcodes.F2L /* 140 */:
                                                    case 141:
                                                        break;
                                                    case Opcodes.D2I /* 142 */:
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 172:
                                                            case 173:
                                                            case Opcodes.FRETURN /* 174 */:
                                                            case Opcodes.DRETURN /* 175 */:
                                                            case Opcodes.ARETURN /* 176 */:
                                                            case Opcodes.RETURN /* 177 */:
                                                                break;
                                                            default:
                                                                adjustStack(SIZE_CHANGE[i]);
                                                                break;
                                                        }
                                                }
                                        }
                                    }
                                }
                            }
                            int i2 = SIZE_CHANGE[i];
                            adjustStack(i2, i2 + 2);
                        }
                        int i3 = SIZE_CHANGE[i];
                        adjustStack(i3, i3 + 1);
                    }
                    this.current.clear();
                }
                adjustStack(-2);
                adjustStack(1);
            }
            adjustStack(-1);
            adjustStack(2);
        } else {
            adjustStack(-2);
            adjustStack(2);
        }
        super.visitInsn(i);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        adjustStack(SIZE_CHANGE[i]);
        super.visitIntInsn(i, i2);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        if (i != 169) {
            switch (i) {
                case 54:
                case 56:
                case 58:
                    this.freeIndex = Math.max(this.freeIndex, i2 + 1);
                    break;
                case 55:
                case 57:
                    this.freeIndex = Math.max(this.freeIndex, i2 + 2);
                    break;
            }
        } else {
            this.current.clear();
        }
        adjustStack(SIZE_CHANGE[i]);
        super.visitVarInsn(i, i2);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        adjustStack(SIZE_CHANGE[i]);
        super.visitTypeInsn(i, str);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        int size = Type.getType(str3).getSize();
        switch (i) {
            case Opcodes.GETSTATIC /* 178 */:
                adjustStack(size);
                break;
            case Opcodes.PUTSTATIC /* 179 */:
                adjustStack(-size);
                break;
            case 180:
                adjustStack(-1);
                adjustStack(size);
                break;
            case Opcodes.PUTFIELD /* 181 */:
                adjustStack((-size) - 1);
                break;
            default:
                throw new IllegalStateException("Unexpected opcode: " + i);
        }
        super.visitFieldInsn(i, str, str2, str3);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str3);
        adjustStack((-(argumentsAndReturnSizes >> 2)) + (i == 184 ? 1 : 0));
        adjustStack(argumentsAndReturnSizes & 3);
        super.visitMethodInsn(i, str, str2, str3, z);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(str2);
        adjustStack((-(argumentsAndReturnSizes >> 2)) + 1);
        adjustStack(argumentsAndReturnSizes & 3);
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        adjustStack(((obj instanceof Long) || (obj instanceof Double)) ? 2 : 1);
        super.visitLdcInsn(obj);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        adjustStack(1 - i);
        super.visitMultiANewArrayInsn(str, i);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        adjustStack(SIZE_CHANGE[i]);
        this.sizes.put(label, new ArrayList(i == 168 ? CompoundList.of(this.current, StackSize.SINGLE) : this.current));
        if (i == 167) {
            this.current.clear();
        }
        super.visitJumpInsn(i, label);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLabel(Label label) {
        List<StackSize> list = this.sizes.get(label);
        if (list != null) {
            this.current = new ArrayList(list);
        }
        super.visitLabel(label);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        super.visitLineNumber(i, label);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        adjustStack(-1);
        ArrayList arrayList = new ArrayList(this.current);
        this.sizes.put(label, arrayList);
        for (Label label2 : labelArr) {
            this.sizes.put(label2, arrayList);
        }
        super.visitTableSwitchInsn(i, i2, label, labelArr);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        adjustStack(-1);
        ArrayList arrayList = new ArrayList(this.current);
        this.sizes.put(label, arrayList);
        for (Label label2 : labelArr) {
            this.sizes.put(label2, arrayList);
        }
        super.visitLookupSwitchInsn(label, iArr, labelArr);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.sizes.put(label3, Collections.singletonList(StackSize.SINGLE));
        super.visitTryCatchBlock(label, label2, label3, str);
    }
}
