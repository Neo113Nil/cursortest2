package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum G implements com.google.protobuf.Internal.EnumLite {
    UI_EXPERIENCE_DEFAULT(0),
    UI_EXPERIENCE_SPINNER_ONLY(1),
    UNRECOGNIZED(-1);

    public static final int UI_EXPERIENCE_DEFAULT_VALUE = 0;
    public static final int UI_EXPERIENCE_SPINNER_ONLY_VALUE = 1;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.G.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.G.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6204a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.G> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.G findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.G.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.G.b f6205a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.G.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.G.forNumber(i) != null;
        }
    }

    G(int i) {
        this.f6204a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.G forNumber(int i) {
        if (i == 0) {
            return UI_EXPERIENCE_DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return UI_EXPERIENCE_SPINNER_ONLY;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.G> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.G.b.f6205a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6204a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.G valueOf(int i) {
        return forNumber(i);
    }
}
