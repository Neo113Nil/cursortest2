package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum c implements com.google.protobuf.Internal.EnumLite {
    CARD_COLLECT_NO_ERROR(0),
    CARD_COLLECT_INTERNAL_SERVICE_ERROR(1),
    CARD_COLLECT_INVALID_CARD_DETAILS(2),
    UNRECOGNIZED(-1);

    public static final int CARD_COLLECT_INTERNAL_SERVICE_ERROR_VALUE = 1;
    public static final int CARD_COLLECT_INVALID_CARD_DETAILS_VALUE = 2;
    public static final int CARD_COLLECT_NO_ERROR_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.c.a b = new com.plaid.internal.core.protos.link.workflow.primitives.c.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6357a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.c> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.c findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.c.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.c.b f6358a = new com.plaid.internal.core.protos.link.workflow.primitives.c.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.c.forNumber(i) != null;
        }
    }

    c(int i) {
        this.f6357a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.c forNumber(int i) {
        if (i == 0) {
            return CARD_COLLECT_NO_ERROR;
        }
        if (i == 1) {
            return CARD_COLLECT_INTERNAL_SERVICE_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return CARD_COLLECT_INVALID_CARD_DETAILS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.c> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.c.b.f6358a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6357a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.c valueOf(int i) {
        return forNumber(i);
    }
}
