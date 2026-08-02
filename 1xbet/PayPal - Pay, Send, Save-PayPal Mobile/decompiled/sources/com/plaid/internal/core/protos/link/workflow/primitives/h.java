package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum h implements com.google.protobuf.Internal.EnumLite {
    INCREMENTAL_CALLBACK_SUPPORT_NONE(0),
    INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT(1),
    UNRECOGNIZED(-1);

    public static final int INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT_VALUE = 1;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_NONE_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.h.a b = new com.plaid.internal.core.protos.link.workflow.primitives.h.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6366a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.h> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.h findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.h.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.h.b f6367a = new com.plaid.internal.core.protos.link.workflow.primitives.h.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.h.forNumber(i) != null;
        }
    }

    h(int i) {
        this.f6366a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.h forNumber(int i) {
        if (i == 0) {
            return INCREMENTAL_CALLBACK_SUPPORT_NONE;
        }
        if (i != 1) {
            return null;
        }
        return INCREMENTAL_CALLBACK_SUPPORT_ADDITIVE_ON_RESULT;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.h> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.h.b.f6367a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6366a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.h valueOf(int i) {
        return forNumber(i);
    }
}
