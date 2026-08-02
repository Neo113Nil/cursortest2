package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public enum n implements com.google.protobuf.Internal.EnumLite {
    IOS_SDK_POPUP_BEHAVIOR_UNKNOWN(0),
    IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL(2),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT(3),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK(4),
    IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK(5),
    UNRECOGNIZED(-1);

    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK_VALUE = 4;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_VALUE = 2;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK_VALUE = 5;
    public static final int IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_VALUE = 3;
    public static final int IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
    public static final int IOS_SDK_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.primitives.n.a b = new com.plaid.internal.core.protos.link.workflow.primitives.n.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6376a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.n> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.primitives.n findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.n.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.primitives.n.b f6377a = new com.plaid.internal.core.protos.link.workflow.primitives.n.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.primitives.n.forNumber(i) != null;
        }
    }

    n(int i) {
        this.f6376a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.n forNumber(int i) {
        if (i == 0) {
            return IOS_SDK_POPUP_BEHAVIOR_UNKNOWN;
        }
        if (i == 1) {
            return IOS_SDK_POPUP_BEHAVIOR_DEFAULT_BROWSER;
        }
        if (i == 2) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL;
        }
        if (i == 3) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT;
        }
        if (i == 4) {
            return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_EPHEMERAL_NO_UNIVERSAL_LINK;
        }
        if (i != 5) {
            return null;
        }
        return IOS_SDK_POPUP_BEHAVIOR_AUTH_SESSION_WITH_PROMPT_NO_UNIVERSAL_LINK;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.primitives.n> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.primitives.n.b.f6377a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6376a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.primitives.n valueOf(int i) {
        return forNumber(i);
    }
}
