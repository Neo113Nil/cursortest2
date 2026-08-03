package com.adjust.sdk;

/* loaded from: classes2.dex */
public class ObjectInputFilterStream extends java.io.ObjectInputStream {
    static final java.util.Set<java.lang.String> ALLOWED_CLASSES = new java.util.HashSet(java.util.Arrays.asList("java.lang.Boolean", "java.lang.Double", "java.lang.Enum", "java.lang.Float", "java.lang.Integer", "java.lang.Long", "java.lang.Number", "java.lang.String", "java.util.ArrayList", "java.util.HashMap", "java.util.LinkedHashMap", "java.util.LinkedList", "com.adjust.sdk.ActivityKind", "com.adjust.sdk.ActivityPackage", "com.adjust.sdk.ActivityState", "com.adjust.sdk.AdjustAttribution", "com.adjust.sdk.EventMetadata"));

    public ObjectInputFilterStream(java.io.InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    public java.lang.Class<?> resolveClass(java.io.ObjectStreamClass objectStreamClass) {
        if (ALLOWED_CLASSES.contains(objectStreamClass.getName())) {
            return super.resolveClass(objectStreamClass);
        }
        throw new java.io.InvalidClassException("Blocked deserialization", objectStreamClass.getName());
    }
}
