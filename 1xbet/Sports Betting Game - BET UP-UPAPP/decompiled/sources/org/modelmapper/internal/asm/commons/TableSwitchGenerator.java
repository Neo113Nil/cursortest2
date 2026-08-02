package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.Label;

/* loaded from: classes4.dex */
public interface TableSwitchGenerator {
    void generateCase(int i, Label label);

    void generateDefault();
}
