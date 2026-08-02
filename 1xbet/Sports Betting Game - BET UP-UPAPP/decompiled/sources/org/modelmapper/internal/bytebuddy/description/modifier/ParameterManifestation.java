package org.modelmapper.internal.bytebuddy.description.modifier;

import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;

/* loaded from: classes4.dex */
public enum ParameterManifestation implements ModifierContributor.ForParameter {
    PLAIN(0),
    FINAL(16);

    private final int mask;

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 16;
    }

    ParameterManifestation(int i) {
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

    public boolean isFinal() {
        return this == FINAL;
    }
}
