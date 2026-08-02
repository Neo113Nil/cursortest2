package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum V implements com.google.protobuf.Internal.EnumLite {
    TEXT_INPUT_TYPE_UNKNOWN(0),
    TEXT_INPUT_TYPE_TEXT(1),
    TEXT_INPUT_TYPE_NUMERIC(2),
    TEXT_INPUT_TYPE_CURRENCY(3),
    TEXT_INPUT_TYPE_MICRODEPOSIT(4),
    TEXT_INPUT_TYPE_EMAIL(5),
    TEXT_INPUT_TYPE_DATE(6),
    TEXT_INPUT_TYPE_TELEPHONE(7),
    UNRECOGNIZED(-1);

    public static final int TEXT_INPUT_TYPE_CURRENCY_VALUE = 3;
    public static final int TEXT_INPUT_TYPE_DATE_VALUE = 6;
    public static final int TEXT_INPUT_TYPE_EMAIL_VALUE = 5;
    public static final int TEXT_INPUT_TYPE_MICRODEPOSIT_VALUE = 4;
    public static final int TEXT_INPUT_TYPE_NUMERIC_VALUE = 2;
    public static final int TEXT_INPUT_TYPE_TELEPHONE_VALUE = 7;
    public static final int TEXT_INPUT_TYPE_TEXT_VALUE = 1;
    public static final int TEXT_INPUT_TYPE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.V.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.V.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6268a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.V> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.V findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.V.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.V.b f6269a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.V.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.V.forNumber(i) != null;
        }
    }

    V(int i) {
        this.f6268a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.V forNumber(int i) {
        switch (i) {
            case 0:
                return TEXT_INPUT_TYPE_UNKNOWN;
            case 1:
                return TEXT_INPUT_TYPE_TEXT;
            case 2:
                return TEXT_INPUT_TYPE_NUMERIC;
            case 3:
                return TEXT_INPUT_TYPE_CURRENCY;
            case 4:
                return TEXT_INPUT_TYPE_MICRODEPOSIT;
            case 5:
                return TEXT_INPUT_TYPE_EMAIL;
            case 6:
                return TEXT_INPUT_TYPE_DATE;
            case 7:
                return TEXT_INPUT_TYPE_TELEPHONE;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.V> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.V.b.f6269a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6268a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.V valueOf(int i) {
        return forNumber(i);
    }
}
