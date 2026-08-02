package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum f implements com.google.protobuf.Internal.EnumLite {
    ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN(0),
    ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER(2),
    UNRECOGNIZED(-1);

    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER_VALUE = 2;
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.f.a b = new com.plaid.internal.core.protos.link.workflow.primitives.f.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6362a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.f> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.f findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.f.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.f.b f6363a = new com.plaid.internal.core.protos.link.workflow.primitives.f.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.f.forNumber(i) != null;
        }
    }

    f(int i) {
        this.f6362a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.f forNumber(int i) {
        if (i == 0) {
            return ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN;
        }
        if (i != 2) {
            return null;
        }
        return ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.f> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.f.b.f6363a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6362a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.f valueOf(int i) {
        return forNumber(i);
    }
}
