package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum L implements com.google.protobuf.Internal.EnumLite {
    SDK_ENCRYPTION_SCHEME_UNKNOWN(0),
    SDK_ENCRYPTION_SCHEME_RSA_PKCS1(1),
    SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1(2),
    UNRECOGNIZED(-1);

    public static final int SDK_ENCRYPTION_SCHEME_RSA_PKCS1_VALUE = 1;
    public static final int SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1_VALUE = 2;
    public static final int SDK_ENCRYPTION_SCHEME_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.L.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.L.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6212a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.L> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.L findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.L.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.L.b f6213a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.L.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.L.forNumber(i) != null;
        }
    }

    L(int i) {
        this.f6212a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.L forNumber(int i) {
        if (i == 0) {
            return SDK_ENCRYPTION_SCHEME_UNKNOWN;
        }
        if (i == 1) {
            return SDK_ENCRYPTION_SCHEME_RSA_PKCS1;
        }
        if (i != 2) {
            return null;
        }
        return SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.L> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.L.b.f6213a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6212a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.L valueOf(int i) {
        return forNumber(i);
    }
}
