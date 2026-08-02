package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0488n implements com.google.protobuf.Internal.EnumLite {
    BANNER_APPEARANCE_NEUTRAL(0),
    BANNER_APPEARANCE_ROUNDED(1),
    UNRECOGNIZED(-1);

    public static final int BANNER_APPEARANCE_NEUTRAL_VALUE = 0;
    public static final int BANNER_APPEARANCE_ROUNDED_VALUE = 1;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6312a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.n$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.b f6313a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.forNumber(i) != null;
        }
    }

    EnumC0488n(int i) {
        this.f6312a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n forNumber(int i) {
        if (i == 0) {
            return BANNER_APPEARANCE_NEUTRAL;
        }
        if (i != 1) {
            return null;
        }
        return BANNER_APPEARANCE_ROUNDED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n.b.f6313a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6312a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0488n valueOf(int i) {
        return forNumber(i);
    }
}
