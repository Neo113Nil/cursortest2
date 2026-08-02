package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum m implements com.google.protobuf.Internal.EnumLite {
    ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB(1),
    ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB(2),
    ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER(3),
    UNRECOGNIZED(-1);

    public static final int ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB_VALUE = 2;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER_VALUE = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB_VALUE = 1;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.m.a b = new com.plaid.internal.core.protos.link.workflow.primitives.m.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6374a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.m> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.m findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.m.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.m.b f6375a = new com.plaid.internal.core.protos.link.workflow.primitives.m.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.m.forNumber(i) != null;
        }
    }

    m(int i) {
        this.f6374a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.m forNumber(int i) {
        if (i == 0) {
            return ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB;
        }
        if (i == 2) {
            return ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB;
        }
        if (i != 3) {
            return null;
        }
        return ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.m> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.m.b.f6375a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6374a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.m valueOf(int i) {
        return forNumber(i);
    }
}
