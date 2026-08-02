package com.google.crypto.tink;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class KeyStatus {

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f3868name;
    public static final com.google.crypto.tink.KeyStatus ENABLED = new com.google.crypto.tink.KeyStatus("ENABLED");
    public static final com.google.crypto.tink.KeyStatus DISABLED = new com.google.crypto.tink.KeyStatus("DISABLED");
    public static final com.google.crypto.tink.KeyStatus DESTROYED = new com.google.crypto.tink.KeyStatus("DESTROYED");

    private KeyStatus(java.lang.String str) {
        this.f3868name = str;
    }

    public final java.lang.String toString() {
        return this.f3868name;
    }
}
