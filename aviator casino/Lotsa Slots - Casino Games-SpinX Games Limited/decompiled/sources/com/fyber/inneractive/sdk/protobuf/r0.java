package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class r0 implements com.fyber.inneractive.sdk.protobuf.b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.protobuf.r0 f4214a = new com.fyber.inneractive.sdk.protobuf.r0();

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(java.lang.Class cls) {
        return com.fyber.inneractive.sdk.protobuf.z0.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final com.fyber.inneractive.sdk.protobuf.r2 b(java.lang.Class cls) {
        if (!com.fyber.inneractive.sdk.protobuf.z0.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (com.fyber.inneractive.sdk.protobuf.r2) com.fyber.inneractive.sdk.protobuf.z0.getDefaultInstance(cls.asSubclass(com.fyber.inneractive.sdk.protobuf.z0.class)).buildMessageInfo();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
