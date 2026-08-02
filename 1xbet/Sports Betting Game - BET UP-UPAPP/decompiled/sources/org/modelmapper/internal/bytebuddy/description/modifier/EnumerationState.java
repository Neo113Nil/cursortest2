package org.modelmapper.internal.bytebuddy.description.modifier;

import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;

/* loaded from: classes4.dex */
public enum EnumerationState implements ModifierContributor.ForType, ModifierContributor.ForField {
    PLAIN(0),
    ENUMERATION(16384);

    private final int mask;

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 16384;
    }

    EnumerationState(int i) {
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

    public boolean isEnumeration() {
        return this == ENUMERATION;
    }
}
