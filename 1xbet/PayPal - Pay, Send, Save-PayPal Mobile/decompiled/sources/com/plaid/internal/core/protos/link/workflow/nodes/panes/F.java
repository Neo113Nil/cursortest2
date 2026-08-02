package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum F implements com.google.protobuf.Internal.EnumLite {
    OAUTH_SUBMISSION_METHOD_UNKNOWN(0),
    OAUTH_SUBMISSION_METHOD_POLLING(1),
    OAUTH_SUBMISSION_METHOD_REDIRECT(2),
    UNRECOGNIZED(-1);

    public static final int OAUTH_SUBMISSION_METHOD_POLLING_VALUE = 1;
    public static final int OAUTH_SUBMISSION_METHOD_REDIRECT_VALUE = 2;
    public static final int OAUTH_SUBMISSION_METHOD_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.F.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.F.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6194a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.F> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.F findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.F.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.F.b f6195a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.F.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.F.forNumber(i) != null;
        }
    }

    F(int i) {
        this.f6194a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.F forNumber(int i) {
        if (i == 0) {
            return OAUTH_SUBMISSION_METHOD_UNKNOWN;
        }
        if (i == 1) {
            return OAUTH_SUBMISSION_METHOD_POLLING;
        }
        if (i != 2) {
            return null;
        }
        return OAUTH_SUBMISSION_METHOD_REDIRECT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.F> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.F.b.f6195a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6194a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.F valueOf(int i) {
        return forNumber(i);
    }
}
