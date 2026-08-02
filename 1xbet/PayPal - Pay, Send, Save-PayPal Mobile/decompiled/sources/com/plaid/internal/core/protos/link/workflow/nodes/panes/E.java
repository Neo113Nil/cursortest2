package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum E implements com.google.protobuf.Internal.EnumLite {
    NOTE_TYPE_DEFAULT(0),
    NOTE_TYPE_INFO(1),
    NOTE_TYPE_WARNING(2),
    NOTE_TYPE_ERROR(3),
    NOTE_TYPE_SUCCESS(4),
    NOTE_TYPE_PROMINENT(5),
    UNRECOGNIZED(-1);

    public static final int NOTE_TYPE_DEFAULT_VALUE = 0;
    public static final int NOTE_TYPE_ERROR_VALUE = 3;
    public static final int NOTE_TYPE_INFO_VALUE = 1;
    public static final int NOTE_TYPE_PROMINENT_VALUE = 5;
    public static final int NOTE_TYPE_SUCCESS_VALUE = 4;
    public static final int NOTE_TYPE_WARNING_VALUE = 2;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.E.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.E.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6191a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.E> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.E findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.E.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.E.b f6192a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.E.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.E.forNumber(i) != null;
        }
    }

    E(int i) {
        this.f6191a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.E forNumber(int i) {
        if (i == 0) {
            return NOTE_TYPE_DEFAULT;
        }
        if (i == 1) {
            return NOTE_TYPE_INFO;
        }
        if (i == 2) {
            return NOTE_TYPE_WARNING;
        }
        if (i == 3) {
            return NOTE_TYPE_ERROR;
        }
        if (i == 4) {
            return NOTE_TYPE_SUCCESS;
        }
        if (i != 5) {
            return null;
        }
        return NOTE_TYPE_PROMINENT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.E> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.E.b.f6192a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6191a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.E valueOf(int i) {
        return forNumber(i);
    }
}
