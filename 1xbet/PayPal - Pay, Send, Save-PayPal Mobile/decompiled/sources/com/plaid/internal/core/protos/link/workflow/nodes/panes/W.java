package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum W implements com.google.protobuf.Internal.EnumLite {
    URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION(0),
    URL_BEHAVIOR_PREFER_UNIVERSAL_LINK(1),
    UNRECOGNIZED(-1);

    public static final int URL_BEHAVIOR_PREFER_UNIVERSAL_LINK_VALUE = 1;
    public static final int URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.W.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.W.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6279a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.W> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.W findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.W.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.W.b f6280a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.W.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.W.forNumber(i) != null;
        }
    }

    W(int i) {
        this.f6279a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.W forNumber(int i) {
        if (i == 0) {
            return URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION;
        }
        if (i != 1) {
            return null;
        }
        return URL_BEHAVIOR_PREFER_UNIVERSAL_LINK;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.W> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.W.b.f6280a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6279a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.W valueOf(int i) {
        return forNumber(i);
    }
}
