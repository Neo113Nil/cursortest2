package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum I implements com.google.protobuf.Internal.EnumLite {
    PANE_BRANDING_UNKNOWN(0),
    PANE_BRANDING_DEFAULT(1),
    PANE_BRANDING_PLAID_AS_FIRST_PARTY(2),
    UNRECOGNIZED(-1);

    public static final int PANE_BRANDING_DEFAULT_VALUE = 1;
    public static final int PANE_BRANDING_PLAID_AS_FIRST_PARTY_VALUE = 2;
    public static final int PANE_BRANDING_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.I.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.I.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6208a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.I> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.I findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.I.b f6209a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.I.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.I.forNumber(i) != null;
        }
    }

    I(int i) {
        this.f6208a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.I forNumber(int i) {
        if (i == 0) {
            return PANE_BRANDING_UNKNOWN;
        }
        if (i == 1) {
            return PANE_BRANDING_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return PANE_BRANDING_PLAID_AS_FIRST_PARTY;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.I> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.I.b.f6209a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6208a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.I valueOf(int i) {
        return forNumber(i);
    }
}
