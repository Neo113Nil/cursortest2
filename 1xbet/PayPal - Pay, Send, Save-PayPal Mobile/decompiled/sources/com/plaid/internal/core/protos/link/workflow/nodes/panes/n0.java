package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum n0 implements com.google.protobuf.Internal.EnumLite {
    BACK_STACK_BEHAVIOR_UNKNOWN(0),
    BACK_STACK_BEHAVIOR_PERSISTENT(1),
    BACK_STACK_BEHAVIOR_TRANSIENT(2),
    UNRECOGNIZED(-1);

    public static final int BACK_STACK_BEHAVIOR_PERSISTENT_VALUE = 1;
    public static final int BACK_STACK_BEHAVIOR_TRANSIENT_VALUE = 2;
    public static final int BACK_STACK_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6314a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.n0> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.b f6315a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.forNumber(i) != null;
        }
    }

    n0(int i) {
        this.f6314a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 forNumber(int i) {
        if (i == 0) {
            return BACK_STACK_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return BACK_STACK_BEHAVIOR_PERSISTENT;
        }
        if (i != 2) {
            return null;
        }
        return BACK_STACK_BEHAVIOR_TRANSIENT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.n0> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.n0.b.f6315a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6314a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.n0 valueOf(int i) {
        return forNumber(i);
    }
}
