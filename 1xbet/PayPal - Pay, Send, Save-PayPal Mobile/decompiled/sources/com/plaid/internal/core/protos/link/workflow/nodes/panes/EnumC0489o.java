package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC0489o implements com.google.protobuf.Internal.EnumLite {
    BANNER_TYPE_DEFAULT(0),
    BANNER_TYPE_NEUTRAL(1),
    BANNER_TYPE_POSITIVE(2),
    BANNER_TYPE_WARNING(3),
    BANNER_TYPE_NEGATIVE(4),
    BANNER_TYPE_INFO(5),
    BANNER_TYPE_PROMINENT(6),
    UNRECOGNIZED(-1);

    public static final int BANNER_TYPE_DEFAULT_VALUE = 0;
    public static final int BANNER_TYPE_INFO_VALUE = 5;
    public static final int BANNER_TYPE_NEGATIVE_VALUE = 4;
    public static final int BANNER_TYPE_NEUTRAL_VALUE = 1;
    public static final int BANNER_TYPE_POSITIVE_VALUE = 2;
    public static final int BANNER_TYPE_PROMINENT_VALUE = 6;
    public static final int BANNER_TYPE_WARNING_VALUE = 3;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6316a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$a */
    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.o$b */
    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.b f6317a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.forNumber(i) != null;
        }
    }

    EnumC0489o(int i) {
        this.f6316a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o forNumber(int i) {
        switch (i) {
            case 0:
                return BANNER_TYPE_DEFAULT;
            case 1:
                return BANNER_TYPE_NEUTRAL;
            case 2:
                return BANNER_TYPE_POSITIVE;
            case 3:
                return BANNER_TYPE_WARNING;
            case 4:
                return BANNER_TYPE_NEGATIVE;
            case 5:
                return BANNER_TYPE_INFO;
            case 6:
                return BANNER_TYPE_PROMINENT;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o.b.f6317a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6316a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0489o valueOf(int i) {
        return forNumber(i);
    }
}
