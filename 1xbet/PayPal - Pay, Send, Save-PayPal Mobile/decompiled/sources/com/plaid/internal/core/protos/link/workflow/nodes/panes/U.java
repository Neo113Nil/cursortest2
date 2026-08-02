package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum U implements com.google.protobuf.Internal.EnumLite {
    TEXT_ALIGNMENT_UNKNOWN(0),
    TEXT_ALIGNMENT_LEFT(1),
    TEXT_ALIGNMENT_CENTER(2),
    TEXT_ALIGNMENT_RIGHT(3),
    TEXT_ALIGNMENT_JUSTIFIED(4),
    UNRECOGNIZED(-1);

    public static final int TEXT_ALIGNMENT_CENTER_VALUE = 2;
    public static final int TEXT_ALIGNMENT_JUSTIFIED_VALUE = 4;
    public static final int TEXT_ALIGNMENT_LEFT_VALUE = 1;
    public static final int TEXT_ALIGNMENT_RIGHT_VALUE = 3;
    public static final int TEXT_ALIGNMENT_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.U.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.U.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6257a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.U> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.U findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.U.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.U.b f6258a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.U.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.U.forNumber(i) != null;
        }
    }

    U(int i) {
        this.f6257a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.U forNumber(int i) {
        if (i == 0) {
            return TEXT_ALIGNMENT_UNKNOWN;
        }
        if (i == 1) {
            return TEXT_ALIGNMENT_LEFT;
        }
        if (i == 2) {
            return TEXT_ALIGNMENT_CENTER;
        }
        if (i == 3) {
            return TEXT_ALIGNMENT_RIGHT;
        }
        if (i != 4) {
            return null;
        }
        return TEXT_ALIGNMENT_JUSTIFIED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.U> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.U.b.f6258a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6257a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.U valueOf(int i) {
        return forNumber(i);
    }
}
