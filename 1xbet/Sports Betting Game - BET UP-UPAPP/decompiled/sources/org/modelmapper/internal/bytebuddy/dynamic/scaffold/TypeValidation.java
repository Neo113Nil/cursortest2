package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

/* loaded from: classes4.dex */
public enum TypeValidation {
    ENABLED(true),
    DISABLED(false);

    private final boolean enabled;

    TypeValidation(boolean z) {
        this.enabled = z;
    }

    public static TypeValidation of(boolean z) {
        return z ? ENABLED : DISABLED;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
