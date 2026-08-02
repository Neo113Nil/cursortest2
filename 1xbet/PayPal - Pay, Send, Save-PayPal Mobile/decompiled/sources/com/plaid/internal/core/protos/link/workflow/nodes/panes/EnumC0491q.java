package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0491q implements com.google.protobuf.Internal.EnumLite {
    BUTTON_WEIGHT_UNKNOWN(0),
    BUTTON_WEIGHT_PRIMARY(1),
    BUTTON_WEIGHT_SECONDARY(2),
    BUTTON_WEIGHT_TERTIARY(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_WEIGHT_PRIMARY_VALUE = 1;
    public static final int BUTTON_WEIGHT_SECONDARY_VALUE = 2;
    public static final int BUTTON_WEIGHT_TERTIARY_VALUE = 3;
    public static final int BUTTON_WEIGHT_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6320a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.q$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.b f6321a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.forNumber(i) != null;
        }
    }

    EnumC0491q(int i) {
        this.f6320a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q forNumber(int i) {
        if (i == 0) {
            return BUTTON_WEIGHT_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_WEIGHT_PRIMARY;
        }
        if (i == 2) {
            return BUTTON_WEIGHT_SECONDARY;
        }
        if (i != 3) {
            return null;
        }
        return BUTTON_WEIGHT_TERTIARY;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q.b.f6321a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6320a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0491q valueOf(int i) {
        return forNumber(i);
    }
}
