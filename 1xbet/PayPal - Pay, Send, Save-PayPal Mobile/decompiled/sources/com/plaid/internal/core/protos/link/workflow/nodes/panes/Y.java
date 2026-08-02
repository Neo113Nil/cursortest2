package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public enum Y implements com.google.protobuf.Internal.EnumLite {
    USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN(0),
    USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS(1),
    USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST(2),
    UNRECOGNIZED(-1);

    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST_VALUE = 2;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS_VALUE = 1;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN_VALUE = 0;
    public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.a b = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.a();

    /* renamed from: a, reason: collision with root package name */
    public final int f6281a;

    public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Y> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Y findValueByNumber(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.forNumber(i);
        }
    }

    public static final class b implements com.google.protobuf.Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.b f6282a = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.forNumber(i) != null;
        }
    }

    Y(int i) {
        this.f6281a = i;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Y forNumber(int i) {
        if (i == 0) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN;
        }
        if (i == 1) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS;
        }
        if (i != 2) {
            return null;
        }
        return USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.workflow.nodes.panes.Y> internalGetValueMap() {
        return b;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Y.b.f6282a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f6281a;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Y valueOf(int i) {
        return forNumber(i);
    }
}
