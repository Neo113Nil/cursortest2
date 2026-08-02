package org.modelmapper.internal.asm.tree.analysis;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.asm.tree.JumpInsnNode;
import org.modelmapper.internal.asm.tree.LabelNode;

/* loaded from: classes4.dex */
final class Subroutine {
    final List<JumpInsnNode> callers;
    final boolean[] localsUsed;
    final LabelNode start;

    Subroutine(LabelNode labelNode, int i, JumpInsnNode jumpInsnNode) {
        this.start = labelNode;
        this.localsUsed = new boolean[i];
        ArrayList arrayList = new ArrayList();
        this.callers = arrayList;
        arrayList.add(jumpInsnNode);
    }

    Subroutine(Subroutine subroutine) {
        this.start = subroutine.start;
        boolean[] zArr = new boolean[subroutine.localsUsed.length];
        this.localsUsed = zArr;
        this.callers = new ArrayList(subroutine.callers);
        boolean[] zArr2 = subroutine.localsUsed;
        System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
    }

    public boolean merge(Subroutine subroutine) {
        int i = 0;
        boolean z = false;
        while (true) {
            boolean[] zArr = this.localsUsed;
            if (i >= zArr.length) {
                break;
            }
            if (subroutine.localsUsed[i] && !zArr[i]) {
                zArr[i] = true;
                z = true;
            }
            i++;
        }
        if (subroutine.start == this.start) {
            for (int i2 = 0; i2 < subroutine.callers.size(); i2++) {
                JumpInsnNode jumpInsnNode = subroutine.callers.get(i2);
                if (!this.callers.contains(jumpInsnNode)) {
                    this.callers.add(jumpInsnNode);
                    z = true;
                }
            }
        }
        return z;
    }
}
