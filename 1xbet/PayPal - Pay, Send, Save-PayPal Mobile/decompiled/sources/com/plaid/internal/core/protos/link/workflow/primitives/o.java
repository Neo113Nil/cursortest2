package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum o implements com.google.protobuf.Internal.EnumLite {
    IOS_URL_OPEN_BEHAVIOR_UNKNOWN(0),
    IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_URL_OPEN_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.o.a b = new com.plaid.internal.core.protos.link.workflow.primitives.o.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6378a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.o> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.o findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.o.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.o.b f6379a = new com.plaid.internal.core.protos.link.workflow.primitives.o.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.o.forNumber(i) != null;
        }
    }

    o(int i) {
        this.f6378a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.o forNumber(int i) {
        if (i == 0) {
            return IOS_URL_OPEN_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return IOS_URL_OPEN_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return IOS_URL_OPEN_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.o> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.o.b.f6379a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6378a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.o valueOf(int i) {
        return forNumber(i);
    }
}
