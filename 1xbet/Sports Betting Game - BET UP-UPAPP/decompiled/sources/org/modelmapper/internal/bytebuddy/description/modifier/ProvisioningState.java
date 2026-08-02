package org.modelmapper.internal.bytebuddy.description.modifier;

import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;

/* loaded from: classes4.dex */
public enum ProvisioningState implements ModifierContributor.ForParameter {
    PLAIN(0),
    MANDATED(32768);

    private final int mask;

    @Override // org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
        return 32768;
    }

    ProvisioningState(int i) {
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

    public boolean isMandated() {
        return this == MANDATED;
    }
}
