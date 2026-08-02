package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0487m implements com.google.protobuf.Internal.EnumLite {
    BACKGROUND_DISPLAY_MODE_UNKNOWN(0),
    BACKGROUND_DISPLAY_MODE_SHIMMER(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_DISPLAY_MODE_SHIMMER_VALUE = 1;
    public static final int BACKGROUND_DISPLAY_MODE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6309a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.m$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.b f6310a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.forNumber(i) != null;
        }
    }

    EnumC0487m(int i) {
        this.f6309a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m forNumber(int i) {
        if (i == 0) {
            return BACKGROUND_DISPLAY_MODE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BACKGROUND_DISPLAY_MODE_SHIMMER;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m.b.f6310a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6309a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0487m valueOf(int i) {
        return forNumber(i);
    }
}
