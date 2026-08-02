package com.nimbusds.jose.shaded.gson.internal;

/* renamed from: com.nimbusds.jose.shaded.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$Gson$Preconditions {
    @java.lang.Deprecated
    public static <T> T checkNotNull(T t) {
        return t;
    }

    private C$Gson$Preconditions() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }
}
