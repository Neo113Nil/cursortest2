package org.modelmapper.internal.asm.tree.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.asm.tree.AbstractInsnNode;
import org.modelmapper.internal.asm.tree.IincInsnNode;
import org.modelmapper.internal.asm.tree.InsnList;
import org.modelmapper.internal.asm.tree.JumpInsnNode;
import org.modelmapper.internal.asm.tree.LookupSwitchInsnNode;
import org.modelmapper.internal.asm.tree.MethodNode;
import org.modelmapper.internal.asm.tree.TableSwitchInsnNode;
import org.modelmapper.internal.asm.tree.TryCatchBlockNode;
import org.modelmapper.internal.asm.tree.VarInsnNode;
import org.modelmapper.internal.asm.tree.analysis.Value;

/* loaded from: classes4.dex */
public class Analyzer<V extends Value> implements Opcodes {
    private Frame<V>[] frames;
    private List<TryCatchBlockNode>[] handlers;
    private boolean[] inInstructionsToProcess;
    private InsnList insnList;
    private int insnListSize;
    private int[] instructionsToProcess;
    private final Interpreter<V> interpreter;
    private int numInstructionsToProcess;
    private Subroutine[] subroutines;

    protected void init(String str, MethodNode methodNode) throws AnalyzerException {
    }

    protected void newControlFlowEdge(int i, int i2) {
    }

    protected boolean newControlFlowExceptionEdge(int i, int i2) {
        return true;
    }

    public Analyzer(Interpreter<V> interpreter) {
        this.interpreter = interpreter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.modelmapper.internal.asm.tree.analysis.Analyzer, org.modelmapper.internal.asm.tree.analysis.Analyzer<V extends org.modelmapper.internal.asm.tree.analysis.Value>] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Frame<V>[] analyze(String str, MethodNode methodNode) throws AnalyzerException {
        AbstractInsnNode abstractInsnNode;
        AbstractInsnNode abstractInsnNode2;
        List<TryCatchBlockNode> list;
        Type objectType;
        Subroutine subroutine;
        int i;
        Subroutine subroutine2;
        boolean z = false;
        if ((methodNode.access & 1280) != 0) {
            Frame<V>[] frameArr = new Frame[0];
            this.frames = frameArr;
            return frameArr;
        }
        InsnList insnList = methodNode.instructions;
        this.insnList = insnList;
        int size = insnList.size();
        this.insnListSize = size;
        this.handlers = new List[size];
        this.frames = new Frame[size];
        this.subroutines = new Subroutine[size];
        this.inInstructionsToProcess = new boolean[size];
        this.instructionsToProcess = new int[size];
        this.numInstructionsToProcess = 0;
        for (int i2 = 0; i2 < methodNode.tryCatchBlocks.size(); i2++) {
            TryCatchBlockNode tryCatchBlockNode = methodNode.tryCatchBlocks.get(i2);
            int indexOf = this.insnList.indexOf(tryCatchBlockNode.end);
            for (int indexOf2 = this.insnList.indexOf(tryCatchBlockNode.start); indexOf2 < indexOf; indexOf2++) {
                List<TryCatchBlockNode> list2 = this.handlers[indexOf2];
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.handlers[indexOf2] = list2;
                }
                list2.add(tryCatchBlockNode);
            }
        }
        Subroutine subroutine3 = null;
        Subroutine subroutine4 = new Subroutine(null, methodNode.maxLocals, null);
        ArrayList arrayList = new ArrayList();
        findSubroutine(0, subroutine4, arrayList);
        HashMap hashMap = new HashMap();
        while (!arrayList.isEmpty()) {
            JumpInsnNode jumpInsnNode = (JumpInsnNode) arrayList.remove(0);
            Subroutine subroutine5 = (Subroutine) hashMap.get(jumpInsnNode.label);
            if (subroutine5 == null) {
                Subroutine subroutine6 = new Subroutine(jumpInsnNode.label, methodNode.maxLocals, jumpInsnNode);
                hashMap.put(jumpInsnNode.label, subroutine6);
                findSubroutine(this.insnList.indexOf(jumpInsnNode.label), subroutine6, arrayList);
            } else {
                subroutine5.callers.add(jumpInsnNode);
            }
        }
        for (int i3 = 0; i3 < this.insnListSize; i3++) {
            Subroutine subroutine7 = this.subroutines[i3];
            if (subroutine7 != null && subroutine7.start == null) {
                this.subroutines[i3] = null;
            }
        }
        Frame computeInitialFrame = computeInitialFrame(str, methodNode);
        merge(0, computeInitialFrame, null);
        init(str, methodNode);
        while (true) {
            int i4 = this.numInstructionsToProcess;
            if (i4 > 0) {
                int[] iArr = this.instructionsToProcess;
                int i5 = i4 - 1;
                this.numInstructionsToProcess = i5;
                int i6 = iArr[i5];
                Frame<V> frame = this.frames[i6];
                Subroutine subroutine8 = this.subroutines[i6];
                this.inInstructionsToProcess[i6] = z;
                try {
                    try {
                        abstractInsnNode2 = methodNode.instructions.get(i6);
                    } catch (Exception e) {
                        e = e;
                        abstractInsnNode = null;
                    }
                    try {
                        int opcode = abstractInsnNode2.getOpcode();
                        int type = abstractInsnNode2.getType();
                        if (type != 8 && type != 15 && type != 14) {
                            computeInitialFrame.init(frame).execute(abstractInsnNode2, this.interpreter);
                            Subroutine subroutine9 = subroutine8 == null ? subroutine3 : new Subroutine(subroutine8);
                            if (abstractInsnNode2 instanceof JumpInsnNode) {
                                JumpInsnNode jumpInsnNode2 = (JumpInsnNode) abstractInsnNode2;
                                if (opcode != 167 && opcode != 168) {
                                    int i7 = i6 + 1;
                                    merge(i7, computeInitialFrame, subroutine9);
                                    newControlFlowEdge(i6, i7);
                                }
                                int indexOf3 = this.insnList.indexOf(jumpInsnNode2.label);
                                if (opcode == 168) {
                                    merge(indexOf3, computeInitialFrame, new Subroutine(jumpInsnNode2.label, methodNode.maxLocals, jumpInsnNode2));
                                } else {
                                    merge(indexOf3, computeInitialFrame, subroutine9);
                                }
                                newControlFlowEdge(i6, indexOf3);
                            } else if (abstractInsnNode2 instanceof LookupSwitchInsnNode) {
                                LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode2;
                                int indexOf4 = this.insnList.indexOf(lookupSwitchInsnNode.dflt);
                                merge(indexOf4, computeInitialFrame, subroutine9);
                                newControlFlowEdge(i6, indexOf4);
                                for (?? r2 = z; r2 < lookupSwitchInsnNode.labels.size(); r2++) {
                                    int indexOf5 = this.insnList.indexOf(lookupSwitchInsnNode.labels.get(r2));
                                    merge(indexOf5, computeInitialFrame, subroutine9);
                                    newControlFlowEdge(i6, indexOf5);
                                }
                            } else if (abstractInsnNode2 instanceof TableSwitchInsnNode) {
                                TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode2;
                                int indexOf6 = this.insnList.indexOf(tableSwitchInsnNode.dflt);
                                merge(indexOf6, computeInitialFrame, subroutine9);
                                newControlFlowEdge(i6, indexOf6);
                                for (?? r22 = z; r22 < tableSwitchInsnNode.labels.size(); r22++) {
                                    int indexOf7 = this.insnList.indexOf(tableSwitchInsnNode.labels.get(r22));
                                    merge(indexOf7, computeInitialFrame, subroutine9);
                                    newControlFlowEdge(i6, indexOf7);
                                }
                            } else if (opcode == 169) {
                                if (subroutine9 == null) {
                                    throw new AnalyzerException(abstractInsnNode2, "RET instruction outside of a sub routine");
                                }
                                ?? r5 = z;
                                while (r5 < subroutine9.callers.size()) {
                                    int indexOf8 = this.insnList.indexOf(subroutine9.callers.get(r5));
                                    Frame<V> frame2 = this.frames[indexOf8];
                                    if (frame2 != null) {
                                        int i8 = indexOf8 + 1;
                                        i = r5;
                                        subroutine2 = subroutine9;
                                        merge(i8, frame2, computeInitialFrame, this.subroutines[indexOf8], subroutine9.localsUsed);
                                        newControlFlowEdge(i6, i8);
                                    } else {
                                        i = r5;
                                        subroutine2 = subroutine9;
                                    }
                                    subroutine9 = subroutine2;
                                    r5 = i + 1;
                                }
                            } else {
                                subroutine = subroutine9;
                                if (opcode != 191 && (opcode < 172 || opcode > 177)) {
                                    if (subroutine != null) {
                                        if (abstractInsnNode2 instanceof VarInsnNode) {
                                            int i9 = ((VarInsnNode) abstractInsnNode2).var;
                                            subroutine.localsUsed[i9] = true;
                                            if (opcode == 22 || opcode == 24 || opcode == 55 || opcode == 57) {
                                                subroutine.localsUsed[i9 + 1] = true;
                                            }
                                        } else if (abstractInsnNode2 instanceof IincInsnNode) {
                                            subroutine.localsUsed[((IincInsnNode) abstractInsnNode2).var] = true;
                                        }
                                    }
                                    int i10 = i6 + 1;
                                    merge(i10, computeInitialFrame, subroutine);
                                    newControlFlowEdge(i6, i10);
                                }
                                subroutine8 = subroutine;
                                list = this.handlers[i6];
                                if (list != null) {
                                    for (int i11 = 0; i11 < list.size(); i11++) {
                                        TryCatchBlockNode tryCatchBlockNode2 = list.get(i11);
                                        if (tryCatchBlockNode2.type == null) {
                                            objectType = Type.getObjectType("java/lang/Throwable");
                                        } else {
                                            objectType = Type.getObjectType(tryCatchBlockNode2.type);
                                        }
                                        if (newControlFlowExceptionEdge(i6, tryCatchBlockNode2)) {
                                            Frame<V> newFrame = newFrame(frame);
                                            newFrame.clearStack();
                                            newFrame.push(this.interpreter.newExceptionValue(tryCatchBlockNode2, newFrame, objectType));
                                            merge(this.insnList.indexOf(tryCatchBlockNode2.handler), newFrame, subroutine8);
                                        }
                                    }
                                }
                                z = false;
                                subroutine3 = null;
                            }
                            subroutine = subroutine9;
                            subroutine8 = subroutine;
                            list = this.handlers[i6];
                            if (list != null) {
                            }
                            z = false;
                            subroutine3 = null;
                        }
                        int i12 = i6 + 1;
                        merge(i12, frame, subroutine8);
                        newControlFlowEdge(i6, i12);
                        list = this.handlers[i6];
                        if (list != null) {
                        }
                        z = false;
                        subroutine3 = null;
                    } catch (Exception e2) {
                        e = e2;
                        abstractInsnNode = abstractInsnNode2;
                        throw new AnalyzerException(abstractInsnNode, "Error at instruction " + i6 + ": " + e.getMessage(), e);
                    }
                } catch (AnalyzerException e3) {
                    throw new AnalyzerException(e3.node, "Error at instruction " + i6 + ": " + e3.getMessage(), e3);
                }
            } else {
                return this.frames;
            }
        }
    }

    private void findSubroutine(int i, Subroutine subroutine, List<AbstractInsnNode> list) throws AnalyzerException {
        while (i >= 0 && i < this.insnListSize) {
            Subroutine[] subroutineArr = this.subroutines;
            if (subroutineArr[i] != null) {
                return;
            }
            subroutineArr[i] = new Subroutine(subroutine);
            AbstractInsnNode abstractInsnNode = this.insnList.get(i);
            if (abstractInsnNode instanceof JumpInsnNode) {
                if (abstractInsnNode.getOpcode() == 168) {
                    list.add(abstractInsnNode);
                } else {
                    findSubroutine(this.insnList.indexOf(((JumpInsnNode) abstractInsnNode).label), subroutine, list);
                }
            } else if (abstractInsnNode instanceof TableSwitchInsnNode) {
                TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode;
                findSubroutine(this.insnList.indexOf(tableSwitchInsnNode.dflt), subroutine, list);
                for (int size = tableSwitchInsnNode.labels.size() - 1; size >= 0; size--) {
                    findSubroutine(this.insnList.indexOf(tableSwitchInsnNode.labels.get(size)), subroutine, list);
                }
            } else if (abstractInsnNode instanceof LookupSwitchInsnNode) {
                LookupSwitchInsnNode lookupSwitchInsnNode = (LookupSwitchInsnNode) abstractInsnNode;
                findSubroutine(this.insnList.indexOf(lookupSwitchInsnNode.dflt), subroutine, list);
                for (int size2 = lookupSwitchInsnNode.labels.size() - 1; size2 >= 0; size2--) {
                    findSubroutine(this.insnList.indexOf(lookupSwitchInsnNode.labels.get(size2)), subroutine, list);
                }
            }
            List<TryCatchBlockNode> list2 = this.handlers[i];
            if (list2 != null) {
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    findSubroutine(this.insnList.indexOf(list2.get(i2).handler), subroutine, list);
                }
            }
            int opcode = abstractInsnNode.getOpcode();
            if (opcode == 167 || opcode == 191) {
                return;
            }
            switch (opcode) {
                case Opcodes.RET /* 169 */:
                case Opcodes.TABLESWITCH /* 170 */:
                case Opcodes.LOOKUPSWITCH /* 171 */:
                case 172:
                case 173:
                case Opcodes.FRETURN /* 174 */:
                case Opcodes.DRETURN /* 175 */:
                case Opcodes.ARETURN /* 176 */:
                case Opcodes.RETURN /* 177 */:
                    return;
                default:
                    i++;
            }
        }
        throw new AnalyzerException(null, "Execution can fall off the end of the code");
    }

    private Frame<V> computeInitialFrame(String str, MethodNode methodNode) {
        Frame<V> newFrame = newFrame(methodNode.maxLocals, methodNode.maxStack);
        int i = 1;
        boolean z = (methodNode.access & 8) == 0;
        if (z) {
            newFrame.setLocal(0, this.interpreter.newParameterValue(z, 0, Type.getObjectType(str)));
        } else {
            i = 0;
        }
        Type[] argumentTypes = Type.getArgumentTypes(methodNode.desc);
        for (int i2 = 0; i2 < argumentTypes.length; i2++) {
            newFrame.setLocal(i, this.interpreter.newParameterValue(z, i, argumentTypes[i2]));
            int i3 = i + 1;
            if (argumentTypes[i2].getSize() == 2) {
                newFrame.setLocal(i3, this.interpreter.newEmptyValue(i3));
                i += 2;
            } else {
                i = i3;
            }
        }
        while (i < methodNode.maxLocals) {
            newFrame.setLocal(i, this.interpreter.newEmptyValue(i));
            i++;
        }
        newFrame.setReturn(this.interpreter.newReturnTypeValue(Type.getReturnType(methodNode.desc)));
        return newFrame;
    }

    public Frame<V>[] getFrames() {
        return this.frames;
    }

    public List<TryCatchBlockNode> getHandlers(int i) {
        return this.handlers[i];
    }

    protected Frame<V> newFrame(int i, int i2) {
        return new Frame<>(i, i2);
    }

    protected Frame<V> newFrame(Frame<? extends V> frame) {
        return new Frame<>(frame);
    }

    protected boolean newControlFlowExceptionEdge(int i, TryCatchBlockNode tryCatchBlockNode) {
        return newControlFlowExceptionEdge(i, this.insnList.indexOf(tryCatchBlockNode.handler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, Frame<V> frame, Subroutine subroutine) throws AnalyzerException {
        boolean merge;
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame2 = frameArr[i];
        if (frame2 == null) {
            frameArr[i] = newFrame(frame);
            merge = true;
        } else {
            merge = frame2.merge(frame, this.interpreter);
        }
        Subroutine[] subroutineArr = this.subroutines;
        Subroutine subroutine2 = subroutineArr[i];
        if (subroutine2 == null) {
            if (subroutine != null) {
                subroutineArr[i] = new Subroutine(subroutine);
                merge = true;
            }
        } else if (subroutine != null) {
            merge |= subroutine2.merge(subroutine);
        }
        if (merge) {
            boolean[] zArr = this.inInstructionsToProcess;
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void merge(int i, Frame<V> frame, Frame<V> frame2, Subroutine subroutine, boolean[] zArr) throws AnalyzerException {
        boolean merge;
        frame2.merge(frame, zArr);
        Frame<V>[] frameArr = this.frames;
        Frame<V> frame3 = frameArr[i];
        if (frame3 == null) {
            frameArr[i] = newFrame(frame2);
            merge = true;
        } else {
            merge = frame3.merge(frame2, this.interpreter);
        }
        Subroutine subroutine2 = this.subroutines[i];
        if (subroutine2 != null && subroutine != null) {
            merge |= subroutine2.merge(subroutine);
        }
        if (merge) {
            boolean[] zArr2 = this.inInstructionsToProcess;
            if (zArr2[i]) {
                return;
            }
            zArr2[i] = true;
            int[] iArr = this.instructionsToProcess;
            int i2 = this.numInstructionsToProcess;
            this.numInstructionsToProcess = i2 + 1;
            iArr[i2] = i;
        }
    }
}
