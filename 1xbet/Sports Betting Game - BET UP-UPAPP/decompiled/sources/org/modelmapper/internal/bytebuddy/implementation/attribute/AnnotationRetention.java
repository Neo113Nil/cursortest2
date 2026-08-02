package org.modelmapper.internal.bytebuddy.implementation.attribute;

/* loaded from: classes4.dex */
public enum AnnotationRetention {
    ENABLED(true),
    DISABLED(false);

    private final boolean enabled;

    AnnotationRetention(boolean z) {
        this.enabled = z;
    }

    public static AnnotationRetention of(boolean z) {
        return z ? ENABLED : DISABLED;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
