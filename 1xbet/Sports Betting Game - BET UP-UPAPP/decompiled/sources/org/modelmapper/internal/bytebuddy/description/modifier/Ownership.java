package org.modelmapper.internal.bytebuddy.description.modifier;

import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;

/* loaded from: classes4.dex */
public enum Ownership implements ModifierContributor.ForField, ModifierContributor.ForMethod, ModifierContributor.ForType {
    MEMBER(0),
    STATIC(8);

    private final int mask;

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 8;
    }

    Ownership(int i) {
        this.mask = i;
    }

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
        return this.mask;
    }

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
        return this == MEMBER;
    }

    public boolean isStatic() {
        return this == STATIC;
    }
}
