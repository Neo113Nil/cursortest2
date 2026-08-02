package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum O implements com.google.protobuf.Internal.EnumLite {
    SELECTION_LIST_BEHAVIOR_UNKNOWN(0),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT(1),
    SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE(2),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT(3),
    SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED(4),
    SELECTION_LIST_BEHAVIOR_NO_SELECTION(5),
    UNRECOGNIZED(-1);

    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED_VALUE = 4;
    public static final int SELECTION_LIST_BEHAVIOR_MULTI_SELECT_VALUE = 3;
    public static final int SELECTION_LIST_BEHAVIOR_NO_SELECTION_VALUE = 5;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE_VALUE = 2;
    public static final int SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int SELECTION_LIST_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.O.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.O.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6218a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.O> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.O findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.O.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.O.b f6219a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.O.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.O.forNumber(i) != null;
        }
    }

    O(int i) {
        this.f6218a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.O forNumber(int i) {
        if (i == 0) {
            return SELECTION_LIST_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT;
        }
        if (i == 2) {
            return SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE;
        }
        if (i == 3) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT;
        }
        if (i == 4) {
            return SELECTION_LIST_BEHAVIOR_MULTI_SELECT_NO_RESPONSES_REQUIRED;
        }
        if (i != 5) {
            return null;
        }
        return SELECTION_LIST_BEHAVIOR_NO_SELECTION;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.O> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.O.b.f6219a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6218a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.O valueOf(int i) {
        return forNumber(i);
    }
}
