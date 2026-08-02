package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0494u implements com.google.protobuf.Internal.EnumLite {
    FLEX_DIRECTION_ROW(0),
    FLEX_DIRECTION_COLUMN(1),
    FLEX_DIRECTION_ROW_REVERSE(2),
    FLEX_DIRECTION_COLUMN_REVERSE(3),
    UNRECOGNIZED(-1);

    public static final int FLEX_DIRECTION_COLUMN_REVERSE_VALUE = 3;
    public static final int FLEX_DIRECTION_COLUMN_VALUE = 1;
    public static final int FLEX_DIRECTION_ROW_REVERSE_VALUE = 2;
    public static final int FLEX_DIRECTION_ROW_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6330a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.u$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.b f6331a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.forNumber(i) != null;
        }
    }

    EnumC0494u(int i) {
        this.f6330a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u forNumber(int i) {
        if (i == 0) {
            return FLEX_DIRECTION_ROW;
        }
        if (i == 1) {
            return FLEX_DIRECTION_COLUMN;
        }
        if (i == 2) {
            return FLEX_DIRECTION_ROW_REVERSE;
        }
        if (i != 3) {
            return null;
        }
        return FLEX_DIRECTION_COLUMN_REVERSE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u.b.f6331a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6330a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0494u valueOf(int i) {
        return forNumber(i);
    }
}
