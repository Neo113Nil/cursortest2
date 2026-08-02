package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum N implements com.google.protobuf.Internal.EnumLite {
    SEARCH_BEHAVIOR_UNKNOWN(0),
    SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS(1),
    SEARCH_BEHAVIOR_PANE_SEARCH_API(2),
    SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT(3),
    UNRECOGNIZED(-1);

    public static final int SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS_VALUE = 1;
    public static final int SEARCH_BEHAVIOR_PANE_SEARCH_API_VALUE = 2;
    public static final int SEARCH_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final int SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT_VALUE = 3;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.N.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.N.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6216a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.N> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.N findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.N.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.N.b f6217a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.N.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.N.forNumber(i) != null;
        }
    }

    N(int i) {
        this.f6216a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.N forNumber(int i) {
        if (i == 0) {
            return SEARCH_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS;
        }
        if (i == 2) {
            return SEARCH_BEHAVIOR_PANE_SEARCH_API;
        }
        if (i != 3) {
            return null;
        }
        return SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.N> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.N.b.f6217a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6216a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.N valueOf(int i) {
        return forNumber(i);
    }
}
