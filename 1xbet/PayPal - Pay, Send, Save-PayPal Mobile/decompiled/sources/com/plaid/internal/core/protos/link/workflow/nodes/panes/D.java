package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum D implements com.google.protobuf.Internal.EnumLite {
    NOTE_SIZE_32(0),
    NOTE_SIZE_24(1),
    NOTE_SIZE_20(2),
    UNRECOGNIZED(-1);

    public static final int NOTE_SIZE_20_VALUE = 2;
    public static final int NOTE_SIZE_24_VALUE = 1;
    public static final int NOTE_SIZE_32_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.D.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.D.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6189a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.D> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.D findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.D.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.D.b f6190a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.D.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.D.forNumber(i) != null;
        }
    }

    D(int i) {
        this.f6189a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.D forNumber(int i) {
        if (i == 0) {
            return NOTE_SIZE_32;
        }
        if (i == 1) {
            return NOTE_SIZE_24;
        }
        if (i != 2) {
            return null;
        }
        return NOTE_SIZE_20;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.D> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.D.b.f6190a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6189a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.D valueOf(int i) {
        return forNumber(i);
    }
}
