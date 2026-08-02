package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0493t implements com.google.protobuf.Internal.EnumLite {
    DISCLAIMER_TEXT_PLACEMENT_UNKNOWN(0),
    DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS(1),
    DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS(2),
    UNRECOGNIZED(-1);

    public static final int DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS_VALUE = 1;
    public static final int DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS_VALUE = 2;
    public static final int DISCLAIMER_TEXT_PLACEMENT_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6327a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.t$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.b f6328a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.forNumber(i) != null;
        }
    }

    EnumC0493t(int i) {
        this.f6327a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t forNumber(int i) {
        if (i == 0) {
            return DISCLAIMER_TEXT_PLACEMENT_UNKNOWN;
        }
        if (i == 1) {
            return DISCLAIMER_TEXT_PLACEMENT_ABOVE_ACTION_BUTTONS;
        }
        if (i != 2) {
            return null;
        }
        return DISCLAIMER_TEXT_PLACEMENT_BELOW_ACTION_BUTTONS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t.b.f6328a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6327a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0493t valueOf(int i) {
        return forNumber(i);
    }
}
