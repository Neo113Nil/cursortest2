package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0490p implements com.google.protobuf.Internal.EnumLite {
    BUTTON_PLACEMENT_UNKNOWN(0),
    BUTTON_PLACEMENT_FOOTER(1),
    BUTTON_PLACEMENT_CONTENT_END(2),
    UNRECOGNIZED(-1);

    public static final int BUTTON_PLACEMENT_CONTENT_END_VALUE = 2;
    public static final int BUTTON_PLACEMENT_FOOTER_VALUE = 1;
    public static final int BUTTON_PLACEMENT_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6318a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.p$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.b f6319a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.forNumber(i) != null;
        }
    }

    EnumC0490p(int i) {
        this.f6318a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p forNumber(int i) {
        if (i == 0) {
            return BUTTON_PLACEMENT_UNKNOWN;
        }
        if (i == 1) {
            return BUTTON_PLACEMENT_FOOTER;
        }
        if (i != 2) {
            return null;
        }
        return BUTTON_PLACEMENT_CONTENT_END;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p.b.f6319a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6318a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0490p valueOf(int i) {
        return forNumber(i);
    }
}
