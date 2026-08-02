package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0495v implements com.google.protobuf.Internal.EnumLite {
    NONE(0),
    BUTTON_ONE_TAP(1),
    BUTTON_TWO_TAP(2),
    BUTTON_THREE_TAP(3),
    UNRECOGNIZED(-1);

    public static final int BUTTON_ONE_TAP_VALUE = 1;
    public static final int BUTTON_THREE_TAP_VALUE = 3;
    public static final int BUTTON_TWO_TAP_VALUE = 2;
    public static final int NONE_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6333a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.v$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.b f6334a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.forNumber(i) != null;
        }
    }

    EnumC0495v(int i) {
        this.f6333a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v forNumber(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return BUTTON_ONE_TAP;
        }
        if (i == 2) {
            return BUTTON_TWO_TAP;
        }
        if (i != 3) {
            return null;
        }
        return BUTTON_THREE_TAP;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v.b.f6334a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6333a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0495v valueOf(int i) {
        return forNumber(i);
    }
}
