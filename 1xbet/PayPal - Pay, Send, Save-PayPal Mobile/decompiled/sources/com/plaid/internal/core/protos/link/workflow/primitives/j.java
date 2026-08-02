package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum j implements com.google.protobuf.Internal.EnumLite {
    NULLABLE_BOOL_UNKNOWN(0),
    NULLABLE_BOOL_UNDEFINED(1),
    NULLABLE_BOOL_TRUE(2),
    NULLABLE_BOOL_FALSE(3),
    UNRECOGNIZED(-1);

    public static final int NULLABLE_BOOL_FALSE_VALUE = 3;
    public static final int NULLABLE_BOOL_TRUE_VALUE = 2;
    public static final int NULLABLE_BOOL_UNDEFINED_VALUE = 1;
    public static final int NULLABLE_BOOL_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.j.a b = new com.plaid.internal.core.protos.link.workflow.primitives.j.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6370a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.j> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.j findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.j.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.j.b f6371a = new com.plaid.internal.core.protos.link.workflow.primitives.j.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.j.forNumber(i) != null;
        }
    }

    j(int i) {
        this.f6370a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.j forNumber(int i) {
        if (i == 0) {
            return NULLABLE_BOOL_UNKNOWN;
        }
        if (i == 1) {
            return NULLABLE_BOOL_UNDEFINED;
        }
        if (i == 2) {
            return NULLABLE_BOOL_TRUE;
        }
        if (i != 3) {
            return null;
        }
        return NULLABLE_BOOL_FALSE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.j> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.j.b.f6371a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6370a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.j valueOf(int i) {
        return forNumber(i);
    }
}
