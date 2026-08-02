package org.modelmapper.internal.bytebuddy.description.modifier;

import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;

/* loaded from: classes4.dex */
public enum MethodArguments implements ModifierContributor.ForMethod {
    PLAIN(0),
    VARARGS(128);

    private final int mask;

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 128;
    }

    MethodArguments(int i) {
        this.mask = i;
    }

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
        return this.mask;
    }

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
        return this == PLAIN;
    }

    public boolean isVarArgs() {
        return this == VARARGS;
    }
}
