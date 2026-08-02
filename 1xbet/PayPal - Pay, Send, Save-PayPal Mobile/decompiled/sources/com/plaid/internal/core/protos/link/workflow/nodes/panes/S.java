package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum S implements com.google.protobuf.Internal.EnumLite {
    TABLE_ROW_STYLE_UNKNOWN(0),
    TABLE_ROW_STYLE_LEADING_LABEL(1),
    TABLE_ROW_STYLE_TRAILING_LABEL(2),
    UNRECOGNIZED(-1);

    public static final int TABLE_ROW_STYLE_LEADING_LABEL_VALUE = 1;
    public static final int TABLE_ROW_STYLE_TRAILING_LABEL_VALUE = 2;
    public static final int TABLE_ROW_STYLE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.S.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.S.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6246a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.S> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.S findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.S.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.S.b f6247a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.S.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.S.forNumber(i) != null;
        }
    }

    S(int i) {
        this.f6246a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.S forNumber(int i) {
        if (i == 0) {
            return TABLE_ROW_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return TABLE_ROW_STYLE_LEADING_LABEL;
        }
        if (i != 2) {
            return null;
        }
        return TABLE_ROW_STYLE_TRAILING_LABEL;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.S> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.S.b.f6247a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6246a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.S valueOf(int i) {
        return forNumber(i);
    }
}
