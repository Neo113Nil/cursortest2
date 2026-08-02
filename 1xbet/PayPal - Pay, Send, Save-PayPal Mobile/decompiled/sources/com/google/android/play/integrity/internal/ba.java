package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class ba {
    public static void a(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
