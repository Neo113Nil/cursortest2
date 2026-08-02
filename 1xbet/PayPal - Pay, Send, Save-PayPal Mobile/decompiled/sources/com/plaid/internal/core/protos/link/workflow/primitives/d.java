package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum d implements com.google.protobuf.Internal.EnumLite {
    VAULT_NONE(0),
    VAULT_VGS(1),
    UNRECOGNIZED(-1);

    public static final int VAULT_NONE_VALUE = 0;
    public static final int VAULT_VGS_VALUE = 1;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.d.a b = new com.plaid.internal.core.protos.link.workflow.primitives.d.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6359a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.d> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.d findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.d.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.d.b f6360a = new com.plaid.internal.core.protos.link.workflow.primitives.d.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.d.forNumber(i) != null;
        }
    }

    d(int i) {
        this.f6359a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.d forNumber(int i) {
        if (i == 0) {
            return VAULT_NONE;
        }
        if (i != 1) {
            return null;
        }
        return VAULT_VGS;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.d> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.d.b.f6360a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6359a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.d valueOf(int i) {
        return forNumber(i);
    }
}
