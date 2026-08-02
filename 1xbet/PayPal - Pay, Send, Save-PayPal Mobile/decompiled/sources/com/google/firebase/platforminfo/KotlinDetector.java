package com.google.firebase.platforminfo;

/* loaded from: classes9.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    public static java.lang.String detectVersion() {
        try {
            return kotlin.KotlinVersion.CURRENT.toString();
        } catch (java.lang.NoClassDefFoundError unused) {
            return null;
        }
    }
}
