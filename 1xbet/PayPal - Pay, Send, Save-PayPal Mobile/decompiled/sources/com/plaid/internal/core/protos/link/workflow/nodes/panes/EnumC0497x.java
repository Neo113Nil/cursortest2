package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0497x implements com.google.protobuf.Internal.EnumLite {
    GRID_SELECTION_BEHAVIOR_UNKNOWN(0),
    GRID_SELECTION_BEHAVIOR_SINGLE_SELECT(1),
    UNRECOGNIZED(-1);

    public static final int GRID_SELECTION_BEHAVIOR_SINGLE_SELECT_VALUE = 1;
    public static final int GRID_SELECTION_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6337a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.x$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.b f6338a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.forNumber(i) != null;
        }
    }

    EnumC0497x(int i) {
        this.f6337a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x forNumber(int i) {
        if (i == 0) {
            return GRID_SELECTION_BEHAVIOR_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GRID_SELECTION_BEHAVIOR_SINGLE_SELECT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x.b.f6338a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6337a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0497x valueOf(int i) {
        return forNumber(i);
    }
}
