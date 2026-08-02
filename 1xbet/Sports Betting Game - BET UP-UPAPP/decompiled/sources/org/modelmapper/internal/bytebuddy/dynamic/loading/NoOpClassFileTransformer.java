package org.modelmapper.internal.bytebuddy.dynamic.loading;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

/* loaded from: classes4.dex */
public enum NoOpClassFileTransformer implements ClassFileTransformer {
    INSTANCE;

    private static final byte[] NO_TRANSFORMATION = null;

    public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
        return NO_TRANSFORMATION;
    }
}
